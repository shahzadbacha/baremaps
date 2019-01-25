package io.gazetteer.osm.postgis;

import io.gazetteer.osm.IntegrationTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.sql.*;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

@Category(IntegrationTest.class)
public class DatabaseUtilTest {

  public static final String url = "jdbc:postgresql://localhost:5432/osm?user=osm&password=osm";

  @Test
  public void resetDatabase() throws SQLException {
    try (Connection connection = DriverManager.getConnection(url)) {
      DatabaseUtil.dropTables(connection);
      assertFalse(tableExists("osm_info"));
      assertFalse(tableExists("osm_users"));
      assertFalse(tableExists("osm_nodes"));
      assertFalse(tableExists("osm_ways"));
      assertFalse(tableExists("osm_way_nodes"));
      assertFalse(tableExists("osm_relations"));
      assertFalse(tableExists("osm_relation_members"));
      DatabaseUtil.createTables(connection);
      assertTrue(tableExists("osm_info"));
      assertTrue(tableExists("osm_users"));
      assertTrue(tableExists("osm_nodes"));
      assertTrue(tableExists("osm_ways"));
      assertTrue(tableExists("osm_way_nodes"));
      assertTrue(tableExists("osm_relations"));
      assertTrue(tableExists("osm_relation_members"));
    }
  }

  public boolean tableExists(String table) throws SQLException {
    try (Connection connection = DriverManager.getConnection(url)) {
      DatabaseMetaData metadata = connection.getMetaData();
      ResultSet tables = metadata.getTables(null, null, table, null);
      return tables.next();
    }
  }
}

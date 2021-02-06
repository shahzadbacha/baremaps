/*
 * Copyright (C) 2020 The Baremaps Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baremaps.testing;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class TestFiles {

  public static final URL DATA_OSC_XML =
      TestFiles.class.getClassLoader().getResource("data.osc.xml");

  public static final URL DATA_OSM_PBF =
      TestFiles.class.getClassLoader().getResource("data.osm.pbf");

  public static final URL DATA_OSM_XML =
      TestFiles.class.getClassLoader().getResource("data.osm.xml");

  public static final URL DENSE_NODES_OSM_PBF =
      TestFiles.class.getClassLoader().getResource("dense-nodes.osm.pbf");

  public static final URL WAYS_OSM_PBF =
      TestFiles.class.getClassLoader().getResource("ways.osm.pbf");

  public static final URL RELATIONS_OSM_PBF =
      TestFiles.class.getClassLoader().getResource("relations.osm.pbf");

  public static final URL MONACO_OSC_GZ =
      TestFiles.class.getClassLoader().getResource("monaco.osc.gz");

  public static final URL MONACO_OSM_BZ2 =
      TestFiles.class.getClassLoader().getResource("monaco.osm.bz2");

  public static final URL MONACO_OSM_PBF =
      TestFiles.class.getClassLoader().getResource("monaco.osm.pbf");

  public static final URL MONACO_STATE_TXT =
      TestFiles.class.getClassLoader().getResource("monaco-state.txt");

}

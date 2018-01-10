package com.highsoft.highcharts.Core;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  Options to prepare before inserting to html/js variables.
 */
class HIGDependency {

    /**
     *  Prepares options object and adds required params.
     *
     *  @param options object to prepare.
     *  @return prepared options object.
     */
    static Map addOptions(Map<String, Map> options) {
        if (options == null) {
            return null;
        }
        if (!options.containsKey("chart")) {
            Map<String, String> tmp = new HashMap<>();
            tmp.put("renderTo", "container");
            options.put("chart", tmp);
        }

        if(options.containsKey("chart")) {
            Map<String, String> chart = new HashMap(options.get("chart"));
            chart.put("renderTo", "container");
            options.put("chart", chart);
        }

        return new HashMap<>(options);
    }

    /**
     *  Return plugins required to chart render.
     *  @param options object for searching.
     *  @return return plugin name to load.
     */
    static List pluginsForOptions(Map options) {
        if(options.get("chart") == null)
            return Collections.emptyList();
        else{
            String chart = (String)((Map)options.get("chart")).get("type");
            return Collections.singletonList(Charts.charts.get(chart));
        }
    }

}

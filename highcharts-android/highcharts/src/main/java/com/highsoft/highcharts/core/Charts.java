package com.highsoft.highcharts.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Charts {
    public static final Map<String, String> charts;
    static {
        Map<String, String> map = new HashMap<>();
        map.put("drilldown", "drilldown");
        map.put("solidgauge", "solid-gauge");
        map.put("heatmap", "heatmap");
        map.put("treemap", "treemap");
        map.put("funnel", "funnel");
        map.put("pyramid", "funnel");
        charts = Collections.unmodifiableMap(map);
    }
}

package com.highsoft.highcharts.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HINativeController {

    static String getMethodString(HashMap<String, Object> map) {

        String[] args = new String[] {null, null, null, null, null};
        List<Object> params;
        HISerializer serializer = new HISerializer();

        if(map.get("params") != null && map.get("params") instanceof List) {
            params = new ArrayList<>((Collection<?>) map.get("params"));
            for(int i = 0; i<params.size(); i++){
                if(params.get(i) instanceof Map || params.get(i) instanceof List){
                    args[i] = serializer.JSObject(params.get(i));
                } else args[i] = params.get(i).toString();
            }
        }


        HashMap<String, HashMap<String, String>> functions = new HashMap<String, HashMap<String, String>>(){{
           put("Series", new HashMap<String, String>(){{put("hide", String.format("(function hide(wrapperID) { chart.series.forEach(function(serie) { if (serie.options._wrapperID === wrapperID) { serie.hide(); return; } }); })(\"%s\");", map.get("id")));}});
        }};

        return (functions.get(map.get("class"))).get(map.get("method"));
    }

}

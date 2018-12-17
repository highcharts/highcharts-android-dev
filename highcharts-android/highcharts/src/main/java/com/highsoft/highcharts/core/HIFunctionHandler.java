package com.highsoft.highcharts.core;

import android.webkit.JavascriptInterface;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartosz on 09.03.18.
 */

final class HIFunctionHandler {

    private HashMap<String, Runnable> runnablesMap;
    private HashMap<String, HIConsumer<HIChartContext>> hiConsumersMap;
    private HashMap<String, HIFunctionInterface<HIChartContext, String>> hiFunctionInterfacesMap;

    HIFunctionHandler() {
        runnablesMap = new HashMap<>();
        hiConsumersMap = new HashMap<>();
        hiFunctionInterfacesMap = new HashMap<>();
    }

    @JavascriptInterface
    public String androidReturnHandler(String id, String properties){
        Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> map = new Gson().fromJson(properties, mapType);
        HIFunctionInterface<HIChartContext, String> hifi = hiFunctionInterfacesMap.get(id);
        return hifi.apply(new HIChartContext(map));
    }

    @JavascriptInterface
    public void androidHandler(int type, String id, String properties){
        switch (type) {
            case 0:
                Runnable runnable = runnablesMap.get(id);
                runnable.run();
                break;
            case 1:
                HIConsumer<HIChartContext> hiConsumer = hiConsumersMap.get(id);
                Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
                Map<String, Object> map = new Gson().fromJson(properties, mapType);
                hiConsumer.accept(new HIChartContext(map));
                break;
            default:
                break;
        }
    }

    void addRunnable(String id, Runnable r){
        runnablesMap.put(id, r);
    }

    void addHIConsumer(String id, HIConsumer<HIChartContext> hic){
        hiConsumersMap.put(id, hic);
    }

    void addHIFunctionInterface(String id, HIFunctionInterface<HIChartContext, String> hifi){
        hiFunctionInterfacesMap.put(id, hifi);
    }

}

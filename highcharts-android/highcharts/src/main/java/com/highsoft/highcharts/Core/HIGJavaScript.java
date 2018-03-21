package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 *  This class is needed to JSON operations.
 */
final class HIGJavaScript{

    private WebView webView;
    private static int counter = 1;

    HIGJavaScript(WebView webView) {
        this.webView = webView;
    }

    /**
     *  Prepares object and returns as JSON representation.
     *
     *  @param object List or Map object to return.
     *
     *  @return String JSON representaion.
     */

    String JSObject(Object object) {
        final Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .disableHtmlEscaping()
                .registerTypeAdapter(HIFunction.class, new FunctionStringSerializer())
                .create();

        String gsonFormatted = gson.toJson(object);

        //String formart to enable Javascript functions injection
        gsonFormatted = gsonFormatted
                .replace("\"__xx__", "")
                .replace("__xx__\"", "");
        return gsonFormatted;
    }

    /**
     * Custom serializer which let Gson serialize HIFunction class properly
     */
    private class FunctionStringSerializer implements JsonSerializer<HIFunction> {
        @Override
        public JsonElement serialize(HIFunction src, Type typeOfSrc, JsonSerializationContext context) {
            setJSInterface(src);
            return new JsonPrimitive(src.getFunction());
        }

        @SuppressLint("AddJavascriptInterface")
        void setJSInterface(HIFunction function){
            HIConsumer<HIChartContext> hiC = function.getHiConsumer();
            String[] properties = function.getProperties();
            Runnable runnable = function.getRfunction();
            String id = "Android" + counter++;
            HIFunctionHandler hiFunctionHandler;
            if(hiC != null) hiFunctionHandler = new HIFunctionHandler(hiC, webView, id, properties);
            else hiFunctionHandler = new HIFunctionHandler(runnable);
            webView.addJavascriptInterface(hiFunctionHandler, id);
        }
    }
}

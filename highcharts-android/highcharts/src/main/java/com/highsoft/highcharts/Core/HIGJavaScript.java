package com.highsoft.highcharts.Core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.webkit.WebView;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 *  This class is needed to JSON operations.
 */
final class HIGJavaScript{

    private WebView webView;
    private Activity activity;
    private static int counter = 1;

    HIGJavaScript(){}

    HIGJavaScript(WebView webView, Activity activity) {
        this.webView = webView;
        this.activity = activity;
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
            HIConsumer<HIContext> hiC = function.getHiConsumer();
            String id = "Android" + counter++;
            HIFunctionHandler hiFunctionHandler = new HIFunctionHandler(hiC, webView, activity, id);
            webView.addJavascriptInterface(hiFunctionHandler, id);
//
//            HIFunctionInterface<HIContext, String> hiFi = function.getHiFunctionInterface();
//            HIConsumer<HIContext> hiC = function.getHiConsumer();
//            HIFunctionHandler hiFunctionHandler;
//            if(hiFi != null) {
//                System.out.println("HIFunctionalInterface not null");
//                hiFunctionHandler = new HIFunctionHandler(hiFi, webView, activity);
//                webView.addJavascriptInterface(hiFunctionHandler, String.format("Android%s", String.valueOf(counter++)));
//            }
//            else {
//                System.out.println("HIConsumer not null");
//                hiFunctionHandler = new HIFunctionHandler(hiC, webView, activity);
//                webView.addJavascriptInterface(hiFunctionHandler, String.format("Android%s", String.valueOf(counter++)));
//            }
        }
    }
}

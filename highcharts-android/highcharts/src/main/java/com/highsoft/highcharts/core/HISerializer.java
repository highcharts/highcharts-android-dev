package com.highsoft.highcharts.core;

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
final class HISerializer {

    private HIFunctionHandler handler;

    HISerializer(HIFunctionHandler functionHandler) {
        this.handler = functionHandler;
    }

    HISerializer() {}

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
            if(!src.isSimple()) setJSInterface(src);
            return new JsonPrimitive(src.getFunction());
        }

        void setJSInterface(HIFunction function){
            HIConsumer<HIChartContext> hiC = function.getHiConsumer();
            HIFunctionInterface<HIChartContext, String> hifi = function.getHiFunctionInterface();
            Runnable runnable = function.getRunnable();
            String id = function.getId();
            if(hiC != null){
               handler.addHIConsumer(id, hiC);
            } else if (hifi != null){
                handler.addHIFunctionInterface(id, hifi);
            }
            else if(runnable != null){
                handler.addRunnable(id, runnable);
            }
        }
    }
}

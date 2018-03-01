package com.highsoft.highcharts.Core;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 *  This class is needed to JSON operations.
 */
final class HIGJavaScript{


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
            return new JsonPrimitive(src.getFunction());
        }
    }
}

package com.highsoft.highcharts.Core;

/**
 * Created by Bartosz on 13.09.2017.
 */

/**This class represents special type for Javascript functions in Highcharts Android Wrapper*/

final public class HIFunction {

    private Runnable rfunction;
    private HIConsumer<HIContext> hiConsumer;
    private HIFunctionInterface<HIContext, String> hiFunctionInterface;
    private String strFunction = "";
    private static int counter = 1;

    /**
     * Use this constructor if you want to put pure Javascript code as a String
     *
     * @param functionInString example: function() { return "String representation"; }
     * @param useNow           use this flag to enable injection to Javascript
     */
    public HIFunction(String functionInString, Boolean useNow) {
        if (useNow) {
            String template = "%s%s%s";
            String prefixnsuffix = "__xx__";
            this.strFunction = String.format(template, prefixnsuffix, functionInString, prefixnsuffix);
        }
    }

    public HIFunction(Runnable rfunction){
        this.rfunction = rfunction;
        String id = String.format("Android%s", counter++);
        String template = "%sfunction(){ " +
                "%s.androidHandler(); }%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, id, prefixnsuffix);
        counter++;
    }

    /**
     * Simple constructor to use when creating an event
     *
     * @param function a callback to be invoked when an attached option is clicked
     */
    public HIFunction(HIConsumer<HIContext> function){
        this.hiConsumer = function;
        String id = String.format("Android%s", counter++);
        String template = "%sfunction(){ eventContexts['%s'] = this; " +
                "%s.androidHandler(); }%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, id, id, prefixnsuffix);
        counter++;
    }

//    public HIFunction(HIFunctionInterface<HIContext, String> function){
//        this.hiFunctionInterface = function;
//        String template = "%sfunction(){" +
//                "Android%s.androidHandler();}%s";
//        String prefixnsuffix = "__xx__";
//        this.strFunction = String.format(template, prefixnsuffix, counter++, prefixnsuffix);
//    }

    HIConsumer<HIContext> getHiConsumer() {
        return hiConsumer;
    }

    Runnable getRfunction(){
        return rfunction;
    }

    HIFunctionInterface<HIContext, String> getHiFunctionInterface() {
        return hiFunctionInterface;
    }

    String getFunction() {
        return strFunction;
    }
}
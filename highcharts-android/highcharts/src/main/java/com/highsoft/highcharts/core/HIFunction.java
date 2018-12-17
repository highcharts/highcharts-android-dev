package com.highsoft.highcharts.core;

/**
 * Created by Bartosz on 13.09.2017.
 */

import java.util.UUID;

/**
 * This class represents the type for Javascript functions and Android callbacks in Highcharts Android Wrapper
 **/
final public class HIFunction {

    private boolean isSimple = false;
    private String[] properties;
    private Runnable runnable;
    private HIConsumer<HIChartContext> hiConsumer;
    private HIFunctionInterface<HIChartContext, String> hiFunctionInterface;
    private String strFunction;
    private String id;

    /**
     * Use this constructor if you want to put pure Javascript code as a String.
     *
     * @param jsFunction example: function() { return "String representation"; }
     */
    public HIFunction(String jsFunction) {
        String template = "%s%s%s";
        String prefixnsuffix = "__xx__";
        this.isSimple = true;
        this.strFunction = String.format(template, prefixnsuffix, jsFunction, prefixnsuffix);
    }

    /**
     * Simple constructor to use when creating an event
     *
     * @param runnable a callback to be invoked when an attached option is clicked
     */
    public HIFunction(Runnable runnable){
        this.runnable = runnable;
        String prefixnsuffix = "__xx__";
        id = UUID.randomUUID().toString();
        String template = "%sfunction(){ Native.androidHandler(0, '%s', null); }%s";
        this.strFunction = String.format(template, prefixnsuffix, id, prefixnsuffix);
    }

    /**
     * Constructor to use when creating an event with chart properties
     *
     * @param hiConsumer a callback to be invoked when an attached option is clicked
     * @param properties properties to pull from the chart context
     */
    public HIFunction(HIConsumer<HIChartContext> hiConsumer, String[] properties){
        this.hiConsumer = hiConsumer;
        this.properties = properties;
        String prefixnsuffix = "__xx__";
        id = UUID.randomUUID().toString();
        String template = "%sfunction() { eventContexts['%s'] = this; return Native.androidHandler(1, '%s', %s ); }%s";
        String script = "getPropertiesDictionary('%s', %s, true)";
        String argsStr = "[";
        for (String arg : properties) {
            argsStr = argsStr.concat("'" + arg + "',");
        }
        argsStr = argsStr.substring(0, argsStr.length() - 1).concat("]");
        script = String.format(script, id, argsStr);
        this.strFunction = String.format(template, prefixnsuffix, id, id, script, prefixnsuffix);
    }

    /**
     * Constructor to use when returning a String with chart properties
     *
     * @param function a callback to be invoked when an attached option is clicked
     * @param properties properties to pull from the chart context
     */
    public HIFunction(HIFunctionInterface<HIChartContext, String> function, String[] properties){
        this.hiFunctionInterface = function;
        this.properties = properties;
        String prefixnsuffix = "__xx__";
        id = UUID.randomUUID().toString();
        String template = "%sfunction() { eventContexts['%s'] = this; return Native.androidReturnHandler( '%s', %s ); }%s";

        String script = "getPropertiesDictionary('%s', %s, true)";
        String argsStr = "[";
        for (String arg : properties) {
            argsStr = argsStr.concat("'" + arg + "',");
        }
        argsStr = argsStr.substring(0, argsStr.length() - 1).concat("]");
        script = String.format(script, id, argsStr);

        this.strFunction = String.format(template, prefixnsuffix, id, id, script, prefixnsuffix);
    }

    HIConsumer<HIChartContext> getHiConsumer() {
        return hiConsumer;
    }

    Runnable getRunnable(){
        return runnable;
    }

    HIFunctionInterface<HIChartContext, String> getHiFunctionInterface() {
        return hiFunctionInterface;
    }

    String getFunction() {
        return strFunction;
    }

    String[] getProperties() {
        return properties;
    }

    String getId() {
        return id;
    }

    boolean isSimple() {
        return isSimple;
    }
}
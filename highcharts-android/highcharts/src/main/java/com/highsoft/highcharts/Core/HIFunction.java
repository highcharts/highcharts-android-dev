package com.highsoft.highcharts.Core;

/**
 * Created by Bartosz on 13.09.2017.
 */

/**
 * This class represents the type for Javascript functions and Android callbacks in Highcharts Android Wrapper
 **/
final public class HIFunction {

    private boolean isSimple = false;
    private String[] properties;
    private Runnable rfunction;
    private HIConsumer<HIChartContext> hiConsumer;
    private HIFunctionInterface<HIChartContext, String> hiFunctionInterface;
    private String strFunction = "";
    private static int counter = 1;

    /**
     * Use this constructor if you want to put pure Javascript code as a String
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
        this.rfunction = runnable;
        String id = String.format("Android%s", counter++);
        String template = "%sfunction(){ %s.androidHandler(); }%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, id, prefixnsuffix);
        counter++;
    }

    /**
     * Simple constructor to use when creating an event with chart properties
     *
     * @param hiConsumer a callback to be invoked when an attached option is clicked
     */
    public HIFunction(HIConsumer<HIChartContext> hiConsumer, String[] properties){
        this.hiConsumer = hiConsumer;
        this.properties = properties;
        String id = String.format("Android%s", counter++);
        String template = "%sfunction(){ eventContexts['%s'] = this; %s.androidHandler(); }%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, id, id, prefixnsuffix);
    }

    public HIFunction(HIFunctionInterface<HIChartContext, String> function, String[] properties){
        this.hiFunctionInterface = function;
        this.properties = properties;
        String id = String.format("Android%s", counter++);

        String script = "getPropertiesDictionary('%s', %s, true)";
        String argsStr = "[";
        for (String arg : properties) {
            argsStr = argsStr.concat("'" + arg + "',");
        }
        argsStr = argsStr.substring(0, argsStr.length() - 1).concat("]");
        script = String.format(script, id, argsStr);

        String template = "%sfunction() { eventContexts['%s'] = this; return %s.androidReturnHandler( %s ); }%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, id, id, script, prefixnsuffix);
    }

    HIConsumer<HIChartContext> getHiConsumer() {
        return hiConsumer;
    }

    Runnable getRfunction(){
        return rfunction;
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

    boolean isSimple() {
        return isSimple;
    }
}
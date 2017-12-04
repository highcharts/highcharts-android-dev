package com.highsoft.highcharts.Core;

/**
 * Created by Bartosz on 13.09.2017.
 */

/**This class represents special type for Javascript functions in Highcharts Android Wrapper*/

final public class HIGFunction {

    private String function = "";

    /**
     * Use this constructor if you want to put pure Javascript code as a String
     *
     * @param functionInString example: function() { return "String representation"; }
     * @param useNow           use this flag to enable injection to Javascript
     */
    public HIGFunction(String functionInString, Boolean useNow) {
        if (useNow) {
            String template = "%s%s%s";
            String prefixnsuffix = "__xx__";
            this.function = String.format(template, prefixnsuffix, functionInString, prefixnsuffix);
        }
    }


    //These methods are currently in development (for more Android-friendly usage)

   /* /**
     * Use this constructor to return the exact retutning statement for Javascript function
     * @param toReturn the exact String to return in the Javascript function
     */
   /* public HIGFunction(String toReturn) {
        String template = "%sfunction() { return '%s' ; } %s";
        this.function = String.format(template, prefix, toReturn, suffix);
    }*/


    /*public HIGFunction(HIGFunctionalInterface function, String... arguments) {
        String template = "%sfunction() { return '%s' ; } %s";
        this.function = String.format(template, prefix, function.getString(), suffix);
        System.out.println(this.function);
    }*/

    String getFunction() {
        return function;
    }

}
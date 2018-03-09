package com.highsoft.highcharts.Core;

/**
 * Created by Bartosz on 13.09.2017.
 */

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.webkit.JavascriptInterface;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import java.util.function.Function;

/**This class represents special type for Javascript functions in Highcharts Android Wrapper*/

final public class HIFunction {

    private Runnable rfunction;
    private String strFunction = "";
//    private Function<String, Integer> function;
    private Consumer<Integer> function;
    private Object[] vars;
    private Integer val;
    private HIChartView chartView;

    HIFunction(){

    }

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

//    public HIFunction(Consumer<Integer> function, Integer val){
//        this.function = function;
////        this.vars = variables;
//        this.val = val;
//        System.out.println("Val in constructor: " + this.val);
//        String template = "%sfunction(){Android.androidHandler();}%s";
//        String prefixnsuffix = "__xx__";
//        this.strFunction = String.format(template, prefixnsuffix, prefixnsuffix);
//
//    }

    public HIFunction(Runnable function, HIChartView v)  {
        this.rfunction = function;
        this.chartView = v;
        try {
            v.setJavascriptHandler(HIFunctionalInterface.class.getName(), function);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println("Val in constructor: " + this.val);
        String template = "%sfunction(){" +
                "Android.androidHandler();}%s";
        String prefixnsuffix = "__xx__";
        this.strFunction = String.format(template, prefixnsuffix, prefixnsuffix);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @JavascriptInterface
    public void androidHandler(){
//        System.out.println("Value: " + this.val);
//        function.accept(this.val);
        rfunction.run();
    }

    String getFunction() {
        return strFunction;
    }
}
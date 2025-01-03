package com.highsoft.highcharts.core;

/**
 * Created by bartosz on 14.03.18.
 */

/**
 * Represents a function that accepts Highcharts value and produces a String result.
 *
 */
@FunctionalInterface
public interface HIFunctionInterface<HIChartContext, String> {
    String apply(HIChartContext hiContext);
}
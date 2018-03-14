package com.highsoft.highcharts.Core;

/**
 * Created by bartosz on 12.03.18.
 */

/**
 * Represents an operation that accepts Highcharts context and returns no result
 */
@FunctionalInterface
public interface HIConsumer<HIContext> {
    void accept(HIContext hiContext);
}

package com.highsoft.highcharts.core;

import java.util.Map;

/**
 * Created by bartosz on 12.03.18.
 */

/**
 *  Chart's context class.
 *  The class contains the current chart context that can be used in lambdas.
 */
public final class HIChartContext {

    private Map<String, Object> map;

    HIChartContext(Map<String, Object> map) {
        this.map = map;
    }

    /**
     *  A method for getting chart's data depending on the actual context.
     *
     *  @param param is an specified parameter from the actual chart context
     *  @return Object from the actual chart context
     */
    public Object getProperty(String param){
        Object value = map.get(param);
        if(value != null)
            return value;
        else return null;
    }
}

package com.highsoft.highcharts.Common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HIStops {

    private List<Object[]> stopsList = new LinkedList<>();

    public HIStops(Object[]... stops){
        for (Object[] stop : stops) {
            if (stop.length != 2)
                throw new IllegalArgumentException("Stop arrays length should be 2");
        }
        this.stopsList = Arrays.asList(stops);
    }

    public List getStops(){
        return stopsList;
    }
}

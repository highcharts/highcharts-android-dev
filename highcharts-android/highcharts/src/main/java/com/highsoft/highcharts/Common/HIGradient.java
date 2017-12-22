package com.highsoft.highcharts.Common;

import java.util.HashMap;
import java.util.Map;

public class HIGradient {

    public String type;
//    public int x;
//    public int y;
//    public int z;
    private Number x1;
    private Number x2;
    private Number y1;
    private Number y2;

    public HIGradient(Number x1, Number y1, Number x2, Number y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private Map<String, Number> gradient = new HashMap<>();

    public Map getGradient(){

        gradient.put("x1", x1);
        gradient.put("y1", y1);
        gradient.put("x2", x2);
        gradient.put("y2", y2);

        return gradient;
    }


}

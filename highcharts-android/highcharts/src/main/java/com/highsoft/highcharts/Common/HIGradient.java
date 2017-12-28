package com.highsoft.highcharts.Common;

import java.util.HashMap;
import java.util.Map;

/**Definition of the gradient, similar to SVG: object literal holds start position (x1, y1) and the end position (x2, y2) relative to the shape, where 0 means top/left and 1 is bottom/right. All positions are floats between 0 and 1.**/
public class HIGradient {

    /** Defaults to 0. **/
    private float x1;
    /** Defaults to 0. **/
    private float x2;
    /** Defaults to 0. **/
    private float y1;
    /** Defaults to 1. **/
    private float y2;

    /** Default constructor. Sets positions values to default ones. **/
    public HIGradient(){
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 1;
    }

    /** Sets positions to the desired values. Values must be in 0 - 1 range. **/
    public HIGradient(float x1, float y1, float x2, float y2){
        if(x1 < 0.0 || x1 > 1.0 || x2 < 0.0 || x2 > 1.0 || y1 < 0.0 || y1 > 1.0 || y2 < 0.0 || y2 > 1.0)
            throw new IllegalArgumentException("Position of the gradient must be in 0 - 1 range");
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private Map<String, Number> gradient = new HashMap<>();

    /** Returns map representation of the gradient **/
    public Map getGradient(){

        gradient.put("x1", x1);
        gradient.put("y1", y1);
        gradient.put("x2", x2);
        gradient.put("y2", y2);

        return gradient;
    }


}

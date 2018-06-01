package com.highsoft.highcharts.Common;

import java.util.HashMap;
import java.util.Map;

/**Definition of the gradient, similar to SVG: object literal holds start position (x1, y1) and the end position (x2, y2) relative to the shape, where 0 means top/left and 1 is bottom/right. All positions are floats between 0 and 1.**/
public class HIGradient {

    private float x1 = -1f;
    private float x2;
    private float y1;
    private float y2;

    private float cx;
    private float cy;
    private float r;

    /** Default constructor. Sets positions values to default ones: x1 = 0, x2 = 0, y1 = 0, y2 = 1 **/
    public HIGradient(){
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 1;
    }

    /** Sets positions to the desired values.
     * @param x1 must be in [0..1] range
     * @param x2 must be in [0..1] range
     * @param y1 must be in [0..1] range
     * @param y2 must be in [0..1] range
     * @exception IllegalArgumentException if a param does not comply **/
    public HIGradient(float x1, float y1, float x2, float y2){
        checkForRange(x1, 0F, 1f);
        checkForRange(x2, 0f, 1f);
        checkForRange(y1, 0f, 1f);
        checkForRange(y2, 0f, 1f);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /** Sets positions to the desired values.
     * @param cx must be in [0..1] range
     * @param cy must be in [0..1] range
     * @param r must be in [0..1] range
     * @exception IllegalArgumentException if a param does not comply **/
    public HIGradient(float cx, float cy, float r){
        checkForRange(cx, 0F, 1f);
        checkForRange(cy, 0f, 1f);
        checkForRange(r, 0f, 1f);
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    private Map<String, Number> gradient = new HashMap<>();

    /** @return  map representation of the gradient **/
    public Map getGradient(){

        if(this.x1 == -1.f)
            fillRadialGradient();
        else fillGradient();

        return gradient;
    }

    private void fillGradient(){
        gradient.put("x1", x1);
        gradient.put("y1", y1);
        gradient.put("x2", x2);
        gradient.put("y2", y2);
    }

    private void fillRadialGradient(){
        gradient.put("cx", cx);
        gradient.put("cy", cy);
        gradient.put("r", r);
    }

    private static void checkForRange(float pos, float lowR, float uppR){
        if(pos < lowR || pos > uppR)
            throw new IllegalArgumentException(pos + "must be in [" + lowR + ".." + uppR + "] range");
    }

}

package com.highsoft.highcharts.Common;

import java.util.*;

/**
 * (c) 2009-2017 Highsoft AS
 *
 * License: www.highcharts.com/license
 * For commercial usage, a valid license is required. To purchase a license for Highcharts iOS, please see our website: https://shop.highsoft.com/
 * In case of questions, please contact sales@highsoft.com
 */

/**
 * This class provides color management in chart. Initiate colors by its static methods.
 */
public class HIColor {

    private String string;
    private Map<String, Object> map;

    private HIColor(String string){
        this.string = string;
        this.map = null;
    }

    private HIColor(Map<String, Object> map){
        this.string = null;
        this.map = map;
    }

    public HIColor(){

    }

    /**
     * Standard hex color value, for example FFFFFF for black and 000000 for white
     */
    public static HIColor initWithHexValue(String hex){
        return new HIColor("#" + hex);
    }
    /**
     * Values of red, green and blue color in RGB standard: values 0-255
     */
    public static HIColor initWithRGB(int red, int green, int blue){
        return new HIColor("rgb("+ red + ", " + green + ", " + blue + ")");
    }
    /**
     * Values of red, green and blue color in RGBa standard. Values for colors: 0-255, alpha: 0-1
     */
    public static HIColor initWithRGBA(int red, int green, int blue, double alpha){
        return new HIColor("rgba("+ red + ", " + green + ", " + blue + ", " + alpha + ")");
    }
    /**
     * Standard color names: red, green, black etc.
     */
    public static HIColor initWithName(String name){
        return new HIColor(name);
    }
    /**
     * CSS-style linear gradient
     */
    public static HIColor initWithLinearGradient(Map gradient, List<List> stops){
        Map<String, Object> linearGradientMap = new HashMap<>();
        linearGradientMap.put("linearGradient", gradient);
        linearGradientMap.put("stops", stops);
        return new HIColor(new HashMap<>(linearGradientMap));
    }
    /**
     * CSS-style radial gradient
     */
    public static HIColor initWithRadialGradient(Map gradient, List<List> stops){
        Map<String, Object> radialGradientMap = new HashMap<>();
        radialGradientMap.put("radialGradient", gradient);
        radialGradientMap.put("stops", stops);
        return new HIColor(new HashMap<>(radialGradientMap));
    }

    public static HIColor initWithLinearGradientTest(HIGradient gradient, HIStops stops){
        Map<String, Object> linearGradientMap = new HashMap<>();
        linearGradientMap.put("linearGradient", gradient.getGradient());
        linearGradientMap.put("stops", stops.getStops());
        return new HIColor(new HashMap<>(linearGradientMap));
    }

    public static HIColor initWithLinearGradientTest2(HIGradient gradient, LinkedList<HIStop> stops){
        Map<String, Object> linearGradientMap = new HashMap<>();
        linearGradientMap.put("linearGradient", gradient.getGradient());
        linearGradientMap.put("stops", stops);
        return new HIColor(new HashMap<>(linearGradientMap));
    }

    public static HIColor initWithRadoalGradientTest2(HIGradient gradient, LinkedList<HIStop> stops){
        Map<String, Object> linearGradientMap = new HashMap<>();
        linearGradientMap.put("radialGradient", gradient.getGradient());
        linearGradientMap.put("stops", stops);
        return new HIColor(new HashMap<>(linearGradientMap));
    }


    /**
     * Method used in the HIGChartsClasses to get the gradient color
     * @return gradient
     */
    public Object getData(){
        if(this.map != null){
            return this.map;
        } else if(this.string != null){
            return this.string;
        } else return null;
    }
}

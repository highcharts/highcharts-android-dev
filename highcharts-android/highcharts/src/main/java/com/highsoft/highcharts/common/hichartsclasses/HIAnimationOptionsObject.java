/**
 * (c) 2009-2018 Highsoft AS
 *
 * License: www.highcharts.com/license
 * For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
 * In case of questions, please contact sales@highsoft.com
 */

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



public class HIAnimationOptionsObject extends HIFoundation {

    private HIFunction complete;
    /**
     A callback function to exectute when the animation finishes.
     */
    public void setComplete(HIFunction complete) {
        this.complete = complete;
        this.setChanged();
        this.notifyObservers();
    }

    public HIFunction getComplete(){ return complete; }

    private Number duration;
    /**
     The animation duration in milliseconds.
     */
    public void setDuration(Number duration) {
        this.duration = duration;
        this.setChanged();
        this.notifyObservers();
    }

    public Number getDuration(){ return duration; }

    private String easing;
    /**
     The name of an easing function as defined on the `Math` object.
     */
    public void setEasing(String easing) {
        this.easing = easing;
        this.setChanged();
        this.notifyObservers();
    }

    public String getEasing(){ return easing; }

    private HIFunction step;
    /**
     A callback function to execute on each step of each attribute or CSS property that's being animated. The first argument contains information about the animation and progress.
     */
    public void setStep(HIFunction step) {
        this.step = step;
        this.setChanged();
        this.notifyObservers();
    }

    public HIFunction getStep(){ return step; }



    public HIAnimationOptionsObject() {

    }

    @Override
    public HashMap<String, Object> getParams() {

        HashMap<String, Object> params = new HashMap<>();
        params.put("_wrapperID", this.uuid);
        if (this.complete != null) {
            params.put("complete", this.complete);
        }
        if (this.duration != null) {
            params.put("duration", this.duration);
        }
        if (this.easing != null) {
            params.put("easing", this.easing);
        }
        if (this.step != null) {
            params.put("step", this.step);
        }
        return params;
    }

}
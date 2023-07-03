/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIDrilldown extends HIFoundation { 

	private HICSSObject activeDataLabelStyle;
	/**
 Additional styles to apply to the data label of a point that has drilldown data. By defaults it is underlined and blue to invite to interaction. In styled mode, active data label styles can be applied with the .highcharts-drilldown-data-label class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
 <br><br><b>defaults:</b><br><br>&ensp;{ "cursor": "pointer", "color": "#003399", "fontWeight": "bold", "textDecoration": "underline" }	*/
	public void setActiveDataLabelStyle(HICSSObject activeDataLabelStyle) {
		this.activeDataLabelStyle = activeDataLabelStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getActiveDataLabelStyle(){ return activeDataLabelStyle; }

	private HIBreadcrumbs breadcrumbs;
	/**
 Options for the breadcrumbs, the navigation at the top leading the way up through the drilldown levels. 
	*/
	public void setBreadcrumbs(HIBreadcrumbs breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
		this.breadcrumbs.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBreadcrumbs getBreadcrumbs(){ return breadcrumbs; }

	private Boolean allowPointDrilldown;
	/**
 When this option is false, clicking a single point will drill down all points in the same category, equivalent to clicking the X axis label. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/allowpointdrilldown-false/">Don't allow point drilldown</a>
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setAllowPointDrilldown(Boolean allowPointDrilldown) {
		this.allowPointDrilldown = allowPointDrilldown;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowPointDrilldown(){ return allowPointDrilldown; }

	private HIAnimationOptionsObject animation;
	/**
 Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and points of different types, but animation will not occur. The animation can either be set as a boolean or a configuration object. If true, it will use the 'swing' jQuery easing and a duration of 500 ms. If used as a configuration object, the following properties are supported: - duration: The duration of the animation in milliseconds. - easing: A string reference to an easing function set on the Math  object. See  [the easing demo](https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/). 
	*/
	public void setAnimation(HIAnimationOptionsObject animation) {
		this.animation = animation;
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnimationOptionsObject getAnimation(){ return animation; }

	private ArrayList series;
	/**
 An array of series configurations for the drill down. Each series configuration uses the same syntax as the series option set. These drilldown series are hidden by defaults. The drilldown series is linked to the parent series' point by its id. 
	*/
	public void setSeries(ArrayList series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getSeries(){ return series; }

	private HICSSObject activeAxisLabelStyle;
	/**
 Additional styles to apply to the X axis label for a point that has drilldown data. By defaults it is underlined and blue to invite to interaction. In styled mode, active label styles can be set with the .highcharts-drilldown-axis-label class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/">Label styles</a>
 <br><br><b>defaults:</b><br><br>&ensp;{ "cursor": "pointer", "color": "#003399", "fontWeight": "bold", "textDecoration": "underline" }	*/
	public void setActiveAxisLabelStyle(HICSSObject activeAxisLabelStyle) {
		this.activeAxisLabelStyle = activeAxisLabelStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getActiveAxisLabelStyle(){ return activeAxisLabelStyle; }



	public HIDrilldown() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.activeDataLabelStyle != null) {
			params.put("activeDataLabelStyle", this.activeDataLabelStyle.getParams());
		}
		if (this.breadcrumbs != null) {
			params.put("breadcrumbs", this.breadcrumbs.getParams());
		}
		if (this.allowPointDrilldown != null) {
			params.put("allowPointDrilldown", this.allowPointDrilldown);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.series != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.series) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("series", array);
		}
		if (this.activeAxisLabelStyle != null) {
			params.put("activeAxisLabelStyle", this.activeAxisLabelStyle.getParams());
		}
		return params;
	}

}
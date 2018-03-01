/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.Common.HIChartsClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HIDrilldown implements HIChartsJSONSerializable { 


/**
Additional styles to apply to the data label of a point that has
drilldown data. By default it is underlined and blue to invite to
interaction.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/ : Label styles
* default: { "cursor": "pointer", "color": "#003399", "fontWeight": "bold", "textDecoration": "underline" }
*/
	public HIActiveDataLabelStyle activeDataLabelStyle;

/**
An array of series configurations for the drill down. Each series
configuration uses the same syntax as the series option
set. These drilldown series are hidden by default. The drilldown
series is linked to the parent series' point by its id.
*/
	public ArrayList series;

/**
When this option is false, clicking a single point will drill down
all points in the same category, equivalent to clicking the X axis
label.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/allowpointdrilldown-false/ : Don't allow point drilldown
* default: true
*/
	public Boolean allowPointDrilldown;

/**
Set the animation for all drilldown animations. Animation of a drilldown
occurs when drilling between a column point and a column series,
or a pie slice and a full pie series. Drilldown can still be used
between series and points of different types, but animation will
not occur.

The animation can either be set as a boolean or a configuration
object. If true, it will use the 'swing' jQuery easing and a duration
of 500 ms. If used as a configuration object, the following properties
are supported:


duration
The duration of the animation in milliseconds.
easing
A string reference to an easing function set on the Math object.
See [the easing demo](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-
animation-easing/).

*/
	public HIAnimation animation;

/**
Options for the drill up button that appears when drilling down
on a series. The text for the button is defined in
lang.drillUpText.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/drillupbutton/ : Drill up button
*/
	public HIDrillUpButton drillUpButton;

/**
Additional styles to apply to the X axis label for a point that
has drilldown data. By default it is underlined and blue to invite
to interaction.
* demo: https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/labels/ : Label styles
* default: { "cursor": "pointer", "color": "#003399", "fontWeight": "bold", "textDecoration": "underline" }
*/
	public HIActiveAxisLabelStyle activeAxisLabelStyle;


	public HIDrilldown() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.activeDataLabelStyle != null) {
			params.put("activeDataLabelStyle", this.activeDataLabelStyle.getParams());
		}
		if (this.series != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.series) {
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("series", array);
		}
		if (this.allowPointDrilldown != null) {
			params.put("allowPointDrilldown", this.allowPointDrilldown);
		}
		if (this.animation != null) {
			params.put("animation", this.animation.getParams());
		}
		if (this.drillUpButton != null) {
			params.put("drillUpButton", this.drillUpButton.getParams());
		}
		if (this.activeAxisLabelStyle != null) {
			params.put("activeAxisLabelStyle", this.activeAxisLabelStyle.getParams());
		}
		return params;
	}

}
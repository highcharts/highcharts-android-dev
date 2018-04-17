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
import com.highsoft.highcharts.Common.HIColor;



/**
A streamgraph series. If the type option is not
specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all streamgraph series are defined in [plotOptions.streamgraph](plotOptions.streamgraph).
3. Options for one single series are given in
[the series instance array](series.streamgraph).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        streamgraph: {
            // shared options for all streamgraph series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'streamgraph'
    }]
});

*/

public class HIStreamgraph extends HISeries {

/**
* description: Fill opacity for the area. When you set an explicit fillColor,
the fillOpacity is not applied. Instead, you should define the
opacity in the fillColor with an rgba color definition. The
fillOpacity setting, also the default setting, overrides the alpha
component of the color setting.

In styled mode, the fill opacity can be set with the .highcharts-area
class name.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillopacity/ : Automatic fill color and fill opacity of 0.1* default: 0.75
*/
	public Number fillOpacity;

/**
A separate color for the negative part of the area.

In styled mode, a negative color is set with the .highcharts-negative
class name.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-negative-color/">Negative color in styled mode</a>*/
	public HIColor negativeFillColor;

/**
Whether the whole area or just the line should respond to mouseover
tooltips and other mouse or touch events.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-trackbyarea/">Display the tooltip when the area is hovered</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean trackByArea;

/**
Fill color or gradient for the area. When null, the series' color
is used with the series' fillOpacity.

In styled mode, the fill color can be set with the .highcharts-area
class name.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-default/">Null by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-fillcolor-gradient/">Gradient</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor fillColor;

/**
A separate color for the graph line. By default the line takes the
color of the series, but the lineColor setting allows setting a
separate color for the line without altering the fillColor.

In styled mode, the line stroke can be set with the .highcharts-graph
class name.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/area-linecolor/">Dark gray line</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public HIColor lineColor;


	public HIStreamgraph() {
		super(); 
		this.type = "streamgraph";
	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.fillOpacity != null) {
			params.put("fillOpacity", this.fillOpacity);
		}
		if (this.negativeFillColor != null) {
			params.put("negativeFillColor", this.negativeFillColor.getData());
		}
		if (this.trackByArea != null) {
			params.put("trackByArea", this.trackByArea);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		return params;
	}

}
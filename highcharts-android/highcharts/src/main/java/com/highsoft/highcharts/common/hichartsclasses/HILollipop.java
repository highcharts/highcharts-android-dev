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
import com.highsoft.highcharts.common.HIColor;



	/**
 The `lollipop` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `lollipop` series are defined in  `plotOptions.lollipop`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     lollipop: {       // shared options for all lollipop series     }   },   series: [{     // specific options for this series instance     type: 'lollipop'   }] }); ```       
	*/

public class HILollipop extends HISeries {
	private Boolean grouping;
	/**
 Whether to group non-stacked lollipop points or to let them render independent of each other. Non-grouped lollipop points will be laid out individually and overlap each other. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGrouping(){ return grouping; }

	private Number pointRange;
	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointRange(){ return pointRange; }

	private String connectorColor;
	/**
 Color of the line that connects the dumbbell point's values. By defaults it is the series' color. 
	*/
	public void setConnectorColor(String connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorColor(){ return connectorColor; }

	private Number connectorWidth;
	/**
 Pixel width of the line that connects the dumbbell point's values. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Number pointPadding;
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private HILowMarker lowMarker;
	/**
/** * description: Options for the lower markers of the dumbbell-like series. When `lowMarker` is not defined, options inherit form the marker. 
* defaults: undefined
*/
	public void setLowMarker(HILowMarker lowMarker) {
		this.lowMarker = lowMarker;
		this.lowMarker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILowMarker getLowMarker(){ return lowMarker; }

	private Number groupPadding;
	public void setGroupPadding(Number groupPadding) {
		this.groupPadding = groupPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getGroupPadding(){ return groupPadding; }

	private HIColor negativeFillColor;
	/**
 A separate color for the negative part of the area. Note that `zones` takes precedence over the negative fill color. In styled mode, a negative color is set with the `.highcharts-negative` class name. 
	*/
	public void setNegativeFillColor(HIColor negativeFillColor) {
		this.negativeFillColor = negativeFillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getNegativeFillColor(){ return negativeFillColor; }

	private HIColor lineColor;
	/**
 A separate color for the graph line. By defaults the line takes the `color` of the series, but the lineColor setting allows setting a separate color for the line without altering the `fillColor`. In styled mode, the line stroke can be set with the `.highcharts-graph` class name. 
	*/
	public void setLineColor(HIColor lineColor) {
		this.lineColor = lineColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLineColor(){ return lineColor; }



	public HILollipop() {
		super(); 
		this.setType("lollipop");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.grouping != null) {
			params.put("grouping", this.grouping);
		}
		if (this.pointRange != null) {
			params.put("pointRange", this.pointRange);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.lowMarker != null) {
			params.put("lowMarker", this.lowMarker.getParams());
		}
		if (this.groupPadding != null) {
			params.put("groupPadding", this.groupPadding);
		}
		if (this.negativeFillColor != null) {
			params.put("negativeFillColor", this.negativeFillColor.getData());
		}
		if (this.lineColor != null) {
			params.put("lineColor", this.lineColor.getData());
		}
		return params;
	}

}
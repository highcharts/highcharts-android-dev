/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;

import java.util.HashMap;



public class HIOptions3d extends HIFoundation { 

	private Number viewDistance;
	/**
 Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts. It is not used for 3D pie charts. 
 <br><br><b>defaults:</b><br><br>&ensp;25	*/
	public void setViewDistance(Number viewDistance) {
		this.viewDistance = viewDistance;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getViewDistance(){ return viewDistance; }

	private HIFrame frame;
	/**
 Provides the option to draw a frame around the charts by defining a bottom, front and back panel. 
	*/
	public void setFrame(HIFrame frame) {
		this.frame = frame;
		this.frame.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFrame getFrame(){ return frame; }

	private String axisLabelPosition;
	/**
 Set it to `"auto"` to automatically move the labels to the best edge. 
	*/
	public void setAxisLabelPosition(String axisLabelPosition) {
		this.axisLabelPosition = axisLabelPosition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAxisLabelPosition(){ return axisLabelPosition; }

	private Boolean enabled;
	/**
 Whether to render the chart using the 3D functionality. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Number depth;
	/**
 The total depth of the chart. 
 <br><br><b>defaults:</b><br><br>&ensp;100	*/
	public void setDepth(Number depth) {
		this.depth = depth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDepth(){ return depth; }

	private Number beta;
	/**
 One of the two rotation angles for the chart. 
	*/
	public void setBeta(Number beta) {
		this.beta = beta;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBeta(){ return beta; }

	private Boolean fitToPlot;
	/**
 Whether the 3d box should automatically adjust to the chart plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setFitToPlot(Boolean fitToPlot) {
		this.fitToPlot = fitToPlot;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFitToPlot(){ return fitToPlot; }

	private Number alpha;
	/**
 One of the two rotation angles for the chart. 
	*/
	public void setAlpha(Number alpha) {
		this.alpha = alpha;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAlpha(){ return alpha; }



	public HIOptions3d() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.viewDistance != null) {
			params.put("viewDistance", this.viewDistance);
		}
		if (this.frame != null) {
			params.put("frame", this.frame.getParams());
		}
		if (this.axisLabelPosition != null) {
			params.put("axisLabelPosition", this.axisLabelPosition);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.beta != null) {
			params.put("beta", this.beta);
		}
		if (this.fitToPlot != null) {
			params.put("fitToPlot", this.fitToPlot);
		}
		if (this.alpha != null) {
			params.put("alpha", this.alpha);
		}
		return params;
	}

}
/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;



public class HIPane extends HIFoundation { 

	private Number endAngle;
	/**
 The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to startAngle + 360. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
	*/
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndAngle(){ return endAngle; }

	private Number startAngle;
	/**
 The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
	*/
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartAngle(){ return startAngle; }

	private List /* <String, Number> */ center;
	/**
 The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Two gauges with different center</a>
 <br><br><b>defaults:</b><br><br>&ensp;["50%", "50%"]	*/
	public void setCenter(List /* <String, Number> */ center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public List /* <String, Number> */ getCenter(){ return center; }

	private List <HIBackground> background;
	/**
 An array of background items for the pane. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Speedometer gauge with multiple backgrounds</a>
	*/
	public void setBackground(List background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public List getBackground(){ return background; }

	private Object /* Number, String */ size;
	/**
 The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Smaller size</a>
	*/
	public void setSize(Object /* Number, String */ size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getSize(){ return size; }



	public HIPane() {

	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = params.put("_wrapperID", this.uuid);
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.center != null) {
			List<Object> array = new List<>();
			for (Object obj : this.center) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("center", array);
		}
		if (this.background != null) {
			List<Object> array = new List<>();
			for (Object obj : this.background) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("background", array);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}
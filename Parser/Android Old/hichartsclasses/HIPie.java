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
 A `pie` series. If the `type` option is not specified, it is inherited from `chart.type`. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all `pie` series are defined in  `plotOptions.pie`. 3. Options for one single series are given in  `the series instance array`. ``` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pie: {       // shared options for all pie series     }   },   series: [{     // specific options for this series instance     type: 'pie'   }] }); ```       
	*/

public class HIPie extends HISeries {
	private Boolean ignoreHiddenPoint;
	/**
 Equivalent to `chart.ignoreHiddenSeries`, this option tells whether the series shall be redrawn as if the hidden point were `null`. The defaults value changed from `false` to `true` with Highcharts 3.0. 
 <br><br><b>defaults:</b><br><br>&ensp;True	*/
	public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenPoint(){ return ignoreHiddenPoint; }

	private HIBorderRadiusOptionsObject borderRadius;
	/**
 The corner radius of the border surrounding each slice. A number signifies pixels. A percentage string, like for example `50%`, signifies a size relative to the radius and the inner radius. 
 <br><br><b>defaults:</b><br><br>&ensp;3	*/
	public void setBorderRadius(HIBorderRadiusOptionsObject borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public HIBorderRadiusOptionsObject getBorderRadius(){ return borderRadius; }

	private ArrayList<String> colors;
	/**
 A series specific or series type specific color set to use instead of the global `colors`. 
	*/
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getColors(){ return colors; }

	private Object /* Number, String */ size;
	/**
 The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The defaults behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. `slicedOffset` is also included in the defaults size calculation. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example `"75%"`. 
	*/
	public void setSize(Object /* Number, String */ size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getSize(){ return size; }

	private HIColor borderColor;
	/**
 The color of the border surrounding each slice. When `null`, the border takes the same color as the slice fill. This can be used together with a `borderWidth` to fill drawing gaps created by antialiazing artefacts in borderless pies. In styled mode, the border stroke is given in the `.highcharts-point` class. 
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Number thickness;
	/**
 Thickness describing the ring size for a donut type chart, overriding `innerSize`. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setThickness(Number thickness) {
		this.thickness = thickness;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getThickness(){ return thickness; }

	private Object /* Number, String */ minSize;
	/**
 The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels in side the plot area, but only to this size. 
 <br><br><b>defaults:</b><br><br>&ensp;80	*/
	public void setMinSize(Object /* Number, String */ minSize) {
		this.minSize = minSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getMinSize(){ return minSize; }

	private HIColor fillColor;
	/**
 If the total sum of the pie's values is 0, the series is represented as an empty circle . The `fillColor` option defines the color of that circle. Use `pie.borderWidth` to set the border thickness. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number startAngle;
	/**
 The start angle of the pie slices in degrees where 0 is top and 90 right. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartAngle(){ return startAngle; }

	private Number endAngle;
	/**
 The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to `startAngle` plus 360. 
	*/
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndAngle(){ return endAngle; }

	private Object /* Number, String */ innerSize;
	/**
 The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or pixel value. Percentages are relative to the pie size. Pixel values are given as integers. Setting overridden by thickness. Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setInnerSize(Object /* Number, String */ innerSize) {
		this.innerSize = innerSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getInnerSize(){ return innerSize; }

	private ArrayList /* <Number, String> */ center;
	/**
 The center of the pie chart relative to the plot area. Can be percentages or pixel values. The defaults behaviour (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence, the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the center should be explicitly set, for example to `["50%", "50%"]`. 
 <br><br><b>defaults:</b><br><br>&ensp;[null, null]	*/
	public void setCenter(ArrayList /* <Number, String> */ center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Number, String> */ getCenter(){ return center; }

	private Number slicedOffset;
	/**
 If a point is sliced, moved out from the center, how many pixels should it be moved?. 
 <br><br><b>defaults:</b><br><br>&ensp;10	*/
	public void setSlicedOffset(Number slicedOffset) {
		this.slicedOffset = slicedOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSlicedOffset(){ return slicedOffset; }

	private Number depth;
	/**
 The thickness of a 3D pie. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setDepth(Number depth) {
		this.depth = depth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDepth(){ return depth; }

	private Number borderWidth;
	/**
 The width of the border surrounding each slice. When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the `borderColor` to `null` instead. In styled mode, the border stroke width is given in the `.highcharts-point` class. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }



	public HIPie() {
		super(); 
		this.setType("pie");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius.getParams());
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.colors) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("colors", array);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.thickness != null) {
			params.put("thickness", this.thickness);
		}
		if (this.minSize != null) {
			params.put("minSize", this.minSize);
		}
		if (this.fillColor != null) {
			params.put("fillColor", this.fillColor.getData());
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.endAngle != null) {
			params.put("endAngle", this.endAngle);
		}
		if (this.innerSize != null) {
			params.put("innerSize", this.innerSize);
		}
		if (this.center != null) {
			ArrayList<Object> array = new ArrayList<>();
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
		if (this.slicedOffset != null) {
			params.put("slicedOffset", this.slicedOffset);
		}
		if (this.depth != null) {
			params.put("depth", this.depth);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		return params;
	}

}
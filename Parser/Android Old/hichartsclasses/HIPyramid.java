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

import com.highsoft.highcharts.common.HIColor;


	/**
 A pyramid series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all pyramid series are defined in  `plotOptions.pyramid`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pyramid: {       // shared options for all pyramid series     }   },   series: [{     // specific options for this series instance     type: 'pyramid'   }] }); `       
	*/

public class HIPyramid extends HISeries {
	private Boolean reversed;
	/**
/** * description: The pyramid is reversed by defaults, as opposed to the funnel, which shares the layout engine, and is not reversed. 
*/
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReversed(){ return reversed; }

	private String neckWidth;
	/**
/** * description: The pyramid neck width is zero by defaults, as opposed to the funnel, which shares the same layout logic. * demo:  •  Funnel demo
*/
	public void setNeckWidth(String neckWidth) {
		this.neckWidth = neckWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNeckWidth(){ return neckWidth; }

	private String neckHeight;
	/**
/** * description: The pyramid neck width is zero by defaults, as opposed to the funnel, which shares the same layout logic. 
*/
	public void setNeckHeight(String neckHeight) {
		this.neckHeight = neckHeight;
		this.setChanged();
		this.notifyObservers();
	}

	public String getNeckHeight(){ return neckHeight; }

	private ArrayList /* <Number, String> */ center;
	/**
/** * description: The center of the series. By defaults, it is centered in the middle of the plot area, so it fills the plot area height. * demo:  •  Centered at 100, 100
* defaults: ["50%", "50%"]
*/
	public void setCenter(ArrayList /* <Number, String> */ center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList /* <Number, String> */ getCenter(){ return center; }

	private Object /* Number, String */ height;
	/**
 The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string it is the percentage of the plot area height. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>
	*/
	public void setHeight(Object /* Number, String */ height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getHeight(){ return height; }

	private Object /* Number, String */ width;
	/**
 The width of the funnel compared to the width of the plot area, or the pixel width if it is a number. 
	*/
	public void setWidth(Object /* Number, String */ width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getWidth(){ return width; }

	private Boolean ignoreHiddenPoint;
	/**
 Equivalent to chart.ignoreHiddenSeries, this option tells whether the series shall be redrawn as if the hidden point were null. The defaults value changed from false to true with Highcharts 3.0. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-ignorehiddenpoint/">True, the hiddden point is ignored</a>
	*/
	public void setIgnoreHiddenPoint(Boolean ignoreHiddenPoint) {
		this.ignoreHiddenPoint = ignoreHiddenPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIgnoreHiddenPoint(){ return ignoreHiddenPoint; }

	private ArrayList<HIColor> colors;
	/**
 A series specific or series type specific color set to use instead of the global colors. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/">Set defaults colors for all pies</a>
	*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private HIColor borderColor;
	/**
 The color of the border surrounding each slice. When null, the border takes the same color as the slice fill. This can be used together with a borderWidth to fill drawing gaps created by antialiazing artefacts in borderless pies. In styled mode, the border stroke is given in the .highcharts-point class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/">Black border</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Number thickness;
	/**
 Thickness describing the ring size for a donut type chart, overriding innerSize. 
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
 If the total sum of the pie's values is 0, the series is represented as an empty circle . The fillColor option defines the color of that circle. Use pie.borderWidth to set the border thickness. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-emptyseries/">Empty pie series</a>
	*/
	public void setFillColor(HIColor fillColor) {
		this.fillColor = fillColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getFillColor(){ return fillColor; }

	private Number startAngle;
	/**
 The start angle of the pie slices in degrees where 0 is top and 90 right. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/">Start from right</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartAngle(){ return startAngle; }

	private Number endAngle;
	/**
 The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to startAngle plus 360. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-semi-circle/">Semi-circle donut</a>
	*/
	public void setEndAngle(Number endAngle) {
		this.endAngle = endAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndAngle(){ return endAngle; }

	private Number slicedOffset;
	/**
 If a point is sliced, moved out from the center, how many pixels should it be moved?. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-slicedoffset-20/">20px offset</a>
	*/
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
 The width of the border surrounding each slice. When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the borderColor to null instead. In styled mode, the border stroke width is given in the .highcharts-point class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-borderwidth/">3px border</a>
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }



	public HIPyramid() {
		super(); 
		this.setType("pyramid");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.reversed != null) {
			params.put("reversed", this.reversed);
		}
		if (this.neckWidth != null) {
			params.put("neckWidth", this.neckWidth);
		}
		if (this.neckHeight != null) {
			params.put("neckHeight", this.neckHeight);
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
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.ignoreHiddenPoint != null) {
			params.put("ignoreHiddenPoint", this.ignoreHiddenPoint);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add(hiColor.getData());
			}
			params.put("colors", array);
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
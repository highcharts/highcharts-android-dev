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



public class HIStackLabels extends HIFoundation { 

	private Boolean allowOverlap;
	/**
 Allow the stack labels to overlap. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-allowoverlap-false/">Default false</a>
	*/
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowOverlap(){ return allowOverlap; }

	private HICSSObject style;
	/**
 CSS styles for the label. In styled mode, the styles are set in the .highcharts-stack-label class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-style/">Red stack total labels</a>
	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String verticalAlign;
	/**
 Defines the vertical alignment of the stack total label. Can be one of "top", "middle" or "bottom". The defaults value is calculated at runtime and depends on orientation and whether the stack is positive or negative. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-top/">Vertically aligned top</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-middle/">Vertically aligned middle</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-verticalalign-bottom/">Vertically aligned bottom</a>
	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String format;
	/**
 A format string for the data label. Available variables are the same as for formatter. 
 <br><br><b>defaults:</b><br><br>&ensp;{total}	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private String align;
	/**
 Defines the horizontal alignment of the stack total label. Can be one of "left", "center" or "right". The defaults value is calculated at runtime and depends on orientation and whether the stack is positive or negative. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-left/">Aligned to the left</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-center/">Aligned in center</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-align-right/">Aligned to the right</a>
	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean enabled;
	/**
 Enable or disable the stack total labels. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled/">Enabled stack total labels</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-enabled-waterfall/">Enabled stack labels in waterfall chart</a>
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private Boolean crop;
	/**
 Whether to hide stack labels that are outside the plot area. By defaults, the stack label is moved inside the plot area according to the `overflow` option. 
	*/
	public void setCrop(Boolean crop) {
		this.crop = crop;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCrop(){ return crop; }

	private String textAlign;
	/**
 The text alignment for the label. While align determines where the texts anchor point is placed with regards to the stack, textAlign determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". The defaults value is calculated at runtime and depends on orientation and whether the stack is positive or negative. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-textalign-left/">Label in center position but text-aligned left</a>
	*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }

	private Number y;
	/**
 The y position offset of the label relative to the tick position on the axis. The defaults value is calculated at runtime and depends on orientation and whether the stack is positive or negative. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-y/">Stack total labels with y offset</a>
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 The x position offset of the label relative to the left of the stacked bar. The defaults value is calculated at runtime and depends on orientation and whether the stack is positive or negative. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-x/">Stack total labels with x offset</a>
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private String overflow;
	/**
 How to handle stack total labels that flow outside the plot area. The defaults is set to "justify", which aligns them inside the plot area. For columns and bars, this means it will be moved inside the bar. To display stack labels outside the plot area, set crop to false and overflow to "allow". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-overflow/">Stack labels flows outside the plot area.</a>
	*/
	public void setOverflow(String overflow) {
		this.overflow = overflow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOverflow(){ return overflow; }

	private HIFunction formatter;
	/**
 Callback JavaScript function to format the label. The value is given by this.total. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-formatter/">Added units to stack total value</a>
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private Number rotation;
	/**
 Rotation of the labels in degrees. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/stacklabels-rotation/">Labels rotated 45Â°</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the labels. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }



	public HIStackLabels() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.allowOverlap != null) {
			params.put("allowOverlap", this.allowOverlap);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.crop != null) {
			params.put("crop", this.crop);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.overflow != null) {
			params.put("overflow", this.overflow);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		return params;
	}

}
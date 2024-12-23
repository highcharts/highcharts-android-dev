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



public class HITitle extends HIFoundation { 

	private HICSSObject style;
	/**
 CSS styles for the title. Use this for font styling, but use `align`, `x` and `y` for text alignment. Note that the defaults `title.minScale` option also affects the rendered font size. In order to keep the font size fixed regardless of title length, set `minScale` to 1. In styled mode, the title style is given in the `.highcharts-title` class. 
 <br><br><b>defaults:</b><br><br>&ensp;{ "color": "#333333", "fontSize": "18px" }	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private String verticalAlign;
	/**
 The vertical alignment of the title. Can be one of `"top"`, `"middle"` and `"bottom"`. When a value is given, the title behaves as if `floating` were `true`. 
	*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
	/**
 The title of the chart. To disable the title, set the `text` to `undefined`. 
 <br><br><b>defaults:</b><br><br>&ensp;Chart title	*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
	/**
 The horizontal alignment of the title. Can be one of "left", "center" and "right". Since v12 it defaultss to `undefined`, meaning the alignment is computed for best fit. If the text fits in one line, it aligned to the center, but if it is wrapped into multiple lines, it is aligned to the left. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Boolean useHTML;
	/**
 Whether to [use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html) to render the text. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private Number y;
	/**
 The y position of the title relative to the alignment within `chart.spacingTop` and `chart.spacingBottom`. By defaults it depends on the font size. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
	/**
 The x position of the title relative to the alignment within `chart.spacingLeft` and `chart.spacingRight`. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number minScale;
	/**
 When the title is too wide to fit in the chart, the defaults behavior is to scale it down to fit, or apply word wrap if it is scaled down to `minScale` and still doesn't fit. The defaults value reflects the scale, when using defaults font sizes, when the title font size matches that of the subtitle. The title still stands out as it is bold by defaults. Set `minScale` to 1 to avoid downscaling. 
 <br><br><b>defaults:</b><br><br>&ensp;0.67	*/
	public void setMinScale(Number minScale) {
		this.minScale = minScale;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinScale(){ return minScale; }

	private Number margin;
	/**
 The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area. 
 <br><br><b>defaults:</b><br><br>&ensp;15	*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private Boolean floating;
	/**
 When the title is floating, the plot area will not move to make space for it. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Boolean reserveSpace;
	/**
 Whether to reserve space for the title when laying out the axis. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReserveSpace(){ return reserveSpace; }

	private Boolean skew3d;
	/**
 If enabled, the axis title will skewed to follow the perspective. This will fix overlapping labels and titles, but texts become less legible due to the distortion. The final appearance depends heavily on `title.position3d`. A `null` value will use the config from `labels.skew3d`. 
	*/
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkew3d(){ return skew3d; }

	private String position3d;
	/**
 Defines how the title is repositioned according to the 3D chart orientation. - `'offset'`: Maintain a fixed horizontal/vertical distance from  the tick marks, despite the chart orientation. This is the  backwards compatible behavior, and causes skewing of X and Z  axes. - `'chart'`: Preserve 3D position relative to the chart. This  looks nice, but hard to read if the text isn't forward-facing. - `'flap'`: Rotated text along the axis to compensate for the  chart orientation. This tries to maintain text as legible as  possible on all orientations. - `'ortho'`: Rotated text along the axis direction so that the  labels are orthogonal to the axis. This is very similar to  `'flap'`, but prevents skewing the labels (X and Y scaling are  still present). - `undefined`: Will use the config from `labels.position3d` 
	*/
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition3d(){ return position3d; }

	private Number offset;
	/**
 The distance of the axis title from the axis line. By defaults, this distance is computed from the offset width of the labels, the labels' distance from the axis and the title's margin. However when the offset option is set, it overrides all this. 
	*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private Number rotation;
	/**
 The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top. Defaults to 0 for horizontal axes, 270 for left-side axes and 90 for right-side axes. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private String textAlign;
	/**
 Alignment of the text, can be `"left"`, `"right"` or `"center"`. Default alignment depends on the `title.align`: Horizontal axes: - for `align` = `"low"`, `textAlign` is set to `left` - for `align` = `"middle"`, `textAlign` is set to `center` - for `align` = `"high"`, `textAlign` is set to `right` Vertical axes: - for `align` = `"low"` and `opposite` = `true`, `textAlign` is  set to `right` - for `align` = `"low"` and `opposite` = `false`, `textAlign` is  set to `left` - for `align` = `"middle"`, `textAlign` is set to `center` - for `align` = `"high"` and `opposite` = `true` `textAlign` is  set to `left` - for `align` = `"high"` and `opposite` = `false` `textAlign` is  set to `right` 
	*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }



	public HITitle() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.verticalAlign != null) {
			params.put("verticalAlign", this.verticalAlign);
		}
		if (this.text != null) {
			params.put("text", this.text);
		}
		if (this.align != null) {
			params.put("align", this.align);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.minScale != null) {
			params.put("minScale", this.minScale);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.reserveSpace != null) {
			params.put("reserveSpace", this.reserveSpace);
		}
		if (this.skew3d != null) {
			params.put("skew3d", this.skew3d);
		}
		if (this.position3d != null) {
			params.put("position3d", this.position3d);
		}
		if (this.offset != null) {
			params.put("offset", this.offset);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
		}
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		return params;
	}

}
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
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;



public class HITitle extends Observable implements HIChartsJSONSerializable { 

	private Number widthAdjust;
	public void setWidthAdjust(Number widthAdjust) {
		this.widthAdjust = widthAdjust;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidthAdjust(){ return widthAdjust; }

	private HIStyle style;
/**
CSS styles for the title. Use this for font styling, but use align,
x and y for text alignment.

In styled mode, the title style is given in the .highcharts-title
class.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/style/">Custom color and weight</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a> <br><br><b>default:</b><br><br>&ensp;{ "color": "#333333", "fontSize": "18px" }*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private String verticalAlign;
/**
The vertical alignment of the title. Can be one of "top",
"middle" and "bottom". When a value is given, the title behaves
as if floating were true.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/verticalalign/">Chart title in bottom right corner</a> <br><br><b>accepted values:</b><br><br>&ensp;["top", "middle", "bottom"]*/
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalAlign(){ return verticalAlign; }

	private String text;
/**
The title of the chart. To disable the title, set the text to
undefined.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/text/">Custom title</a> <br><br><b>default:</b><br><br>&ensp;Chart title*/
	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText(){ return text; }

	private String align;
/**
The horizontal alignment of the title. Can be one of "left", "center"
and "right".
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a> <br><br><b>accepted values:</b><br><br>&ensp;["left", "center", "right"] <br><br><b>default:</b><br><br>&ensp;center*/
	public void setAlign(String align) {
		this.align = align;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlign(){ return align; }

	private Number y;
/**
The y position of the title relative to the alignment within
chart.spacingTop and [chart.spacingBottom](
#chart.spacingBottom). By default it depends on the font size.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/y/">Title inside the plot area</a>*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number x;
/**
The x position of the title relative to the alignment within
chart.spacingLeft and chart.spacingRight.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Boolean floating;
/**
When the title is floating, the plot area will not move to make space
for it.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">False by default</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/floating/">True - title on top of the plot area</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public void setFloating(Boolean floating) {
		this.floating = floating;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFloating(){ return floating; }

	private Number margin;
/**
Adjustment made to the title width, normally to reserve space for
the exporting burger menu.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a> <br><br><b>default:</b><br><br>&ensp;-44*/
	public void setMargin(Number margin) {
		this.margin = margin;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMargin(){ return margin; }

	private Boolean useHTML;
/**
Whether to
[use HTML](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html)
to render the text.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getUseHTML(){ return useHTML; }

	private Number rotation;
/**
* description: The rotation of the text in degrees. 0 is horizontal, 270 is
vertical reading from bottom to top.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/ : Horizontal* default: 270
*/
	public void setRotation(Number rotation) {
		this.rotation = rotation;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getRotation(){ return rotation; }

	private Boolean reserveSpace;
/**
Whether to reserve space for the title when laying out the axis.
 <br><br><b>default:</b><br><br>&ensp;true*/
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getReserveSpace(){ return reserveSpace; }

	private Boolean skew3d;
/**
If enabled, the axis title will skewed to follow the perspective.

This will fix overlapping labels and titles, but texts become less
legible due to the distortion.

The final appearance depends heavily on title.position3d.

A null value will use the config from labels.skew3d.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a> <br><br><b>accepted values:</b><br><br>&ensp;[false, true, null]*/
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSkew3d(){ return skew3d; }

	private String position3d;
/**
Defines how the title is repositioned according to the 3D chart
orientation.
- 'offset': Maintain a fixed horizontal/vertical distance from the
  tick marks, despite the chart orientation. This is the backwards
  compatible behavior, and causes skewing of X and Z axes.
- 'chart': Preserve 3D position relative to the chart.
  This looks nice, but hard to read if the text isn't
  forward-facing.
- 'flap': Rotated text along the axis to compensate for the chart
  orientation. This tries to maintain text as legible as possible on
  all orientations.
- 'ortho': Rotated text along the axis direction so that the labels
  are orthogonal to the axis. This is very similar to 'flap', but
  prevents skewing the labels (X and Y scaling are still present).
- null: Will use the config from labels.position3d
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/skewed-labels/">Skewed labels</a> <br><br><b>accepted values:</b><br><br>&ensp;['offset', 'chart', 'flap', 'ortho', null]*/
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPosition3d(){ return position3d; }

	private Number offset;
/**
The distance of the axis title from the axis line. By default,
this distance is computed from the offset width of the labels,
the labels' distance from the axis and the title's margin.
However when the offset option is set, it overrides all this.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/">Place the axis title on top of the axis</a>*/
	public void setOffset(Number offset) {
		this.offset = offset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOffset(){ return offset; }

	private String textAlign;
/**
Alignment of the text, can be "left", "right" or "center".
Default alignment depends on the
[title.align](xAxis.title.align):

Horizontal axes:
- for align = "low", textAlign is set to left
- for align = "middle", textAlign is set to center
- for align = "high", textAlign is set to right

Vertical axes:
- for align = "low" and opposite = true, textAlign is
  set to right
- for align = "low" and opposite = false, textAlign is
  set to left
- for align = "middle", textAlign is set to center
- for align = "high" and opposite = true textAlign is
  set to left
- for align = "high" and opposite = false textAlign is
  set to right
*/
	public void setTextAlign(String textAlign) {
		this.textAlign = textAlign;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTextAlign(){ return textAlign; }



	public HITitle() {

	}


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.widthAdjust != null) {
			params.put("widthAdjust", this.widthAdjust);
		}
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
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.floating != null) {
			params.put("floating", this.floating);
		}
		if (this.margin != null) {
			params.put("margin", this.margin);
		}
		if (this.useHTML != null) {
			params.put("useHTML", this.useHTML);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation);
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
		if (this.textAlign != null) {
			params.put("textAlign", this.textAlign);
		}
		return params;
	}

}
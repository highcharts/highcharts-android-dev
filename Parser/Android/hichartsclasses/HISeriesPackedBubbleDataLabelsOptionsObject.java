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



public class HISeriesPackedBubbleDataLabelsOptionsObject extends HIFoundation { 

	private String format;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _node_ in the networkgraph. In v7.0 defaultss to `{key}`, since v7.1 defaultss to `undefined` and `formatter` is used instead. 
	*/
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private HIFunction formatter;
	/**
 Callback JavaScript function to format the data label for a node. Note that if a `format` is defined, the format takes precedence and the formatter is ignored. 
	*/
	public void setFormatter(HIFunction formatter) {
		this.formatter = formatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getFormatter(){ return formatter; }

	private HISeriesPackedBubbleDataLabelsTextPath textPath;
	/**
 Options for a _node_ label text which should follow marker's shape. **Note:** Only SVG-based renderer supports this option. 
	*/
	public void setTextPath(HISeriesPackedBubbleDataLabelsTextPath textPath) {
		this.textPath = textPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesPackedBubbleDataLabelsTextPath getTextPath(){ return textPath; }



	public HISeriesPackedBubbleDataLabelsOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.formatter != null) {
			params.put("formatter", this.formatter);
		}
		if (this.textPath != null) {
			params.put("textPath", this.textPath.getParams());
		}
		return params;
	}

}
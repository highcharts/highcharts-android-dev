/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.HashMap;



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

	private String parentNodeFormat;
	public void setParentNodeFormat(String parentNodeFormat) {
		this.parentNodeFormat = parentNodeFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getParentNodeFormat(){ return parentNodeFormat; }

	private Object parentNodeFormatter;
	/**
 Callback to format data labels for _parentNodes_. The `parentNodeFormat` option takes precedence over the `parentNodeFormatter`. 
	*/
	public void setParentNodeFormatter(Object parentNodeFormatter) {
		this.parentNodeFormatter = parentNodeFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getParentNodeFormatter(){ return parentNodeFormatter; }

	private HISeriesPackedBubbleDataLabelsTextPathOptionsObject parentNodeTextPath;
	/**
 Options for a _parentNode_ label text. 
	*/
	public void setParentNodeTextPath(HISeriesPackedBubbleDataLabelsTextPathOptionsObject parentNodeTextPath) {
		this.parentNodeTextPath = parentNodeTextPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesPackedBubbleDataLabelsTextPathOptionsObject getParentNodeTextPath(){ return parentNodeTextPath; }

	private HISeriesPackedBubbleDataLabelsTextPathOptionsObject textPath;
	/**
 Options for a _node_ label text which should follow marker's shape. **Note:** Only SVG-based renderer supports this option. 
	*/
	public void setTextPath(HISeriesPackedBubbleDataLabelsTextPathOptionsObject textPath) {
		this.textPath = textPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HISeriesPackedBubbleDataLabelsTextPathOptionsObject getTextPath(){ return textPath; }



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
		if (this.parentNodeFormat != null) {
			params.put("parentNodeFormat", this.parentNodeFormat);
		}
		if (this.parentNodeFormatter != null) {
			params.put("parentNodeFormatter", this.parentNodeFormatter);
		}
		if (this.parentNodeTextPath != null) {
			params.put("parentNodeTextPath", this.parentNodeTextPath.getParams());
		}
		if (this.textPath != null) {
			params.put("textPath", this.textPath.getParams());
		}
		return params;
	}

}
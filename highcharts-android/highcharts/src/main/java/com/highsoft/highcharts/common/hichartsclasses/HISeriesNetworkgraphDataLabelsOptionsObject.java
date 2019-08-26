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



public class HISeriesNetworkgraphDataLabelsOptionsObject extends HIFoundation { 

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

	private String linkFormat;
	/**
 The [format string](https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting) specifying what to show for _links_ in the networkgraph. (Default: `undefined`) 
	*/
	public void setLinkFormat(String linkFormat) {
		this.linkFormat = linkFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkFormat(){ return linkFormat; }

	private HIFunction linkFormatter;
	/**
 Callback to format data labels for _links_ in the sankey diagram. The `linkFormat` option takes precedence over the `linkFormatter`. 
	*/
	public void setLinkFormatter(HIFunction linkFormatter) {
		this.linkFormatter = linkFormatter;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getLinkFormatter(){ return linkFormatter; }

	private HIDataLabelsTextPathOptionsObject linkTextPath;
	/**
 Options for a _link_ label text which should follow link connection. Border and background are disabled for a label that follows a path. **Note:** Only SVG-based renderer supports this option. Setting `useHTML` to true will disable this option. 
	*/
	public void setLinkTextPath(HIDataLabelsTextPathOptionsObject linkTextPath) {
		this.linkTextPath = linkTextPath;
		this.setChanged();
		this.notifyObservers();
	}

	public HIDataLabelsTextPathOptionsObject getLinkTextPath(){ return linkTextPath; }



	public HISeriesNetworkgraphDataLabelsOptionsObject() {

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
		if (this.linkFormat != null) {
			params.put("linkFormat", this.linkFormat);
		}
		if (this.linkFormatter != null) {
			params.put("linkFormatter", this.linkFormatter);
		}
		if (this.linkTextPath != null) {
			params.put("linkTextPath", this.linkTextPath.getParams());
		}
		return params;
	}

}
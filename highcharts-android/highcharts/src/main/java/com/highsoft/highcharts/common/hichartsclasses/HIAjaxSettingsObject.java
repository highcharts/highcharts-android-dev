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



public class HIAjaxSettingsObject extends HIFoundation { 

	private String data;
	/**
 The payload to send. 
	*/
	public void setData(String data) {
		this.data = data;
		this.setChanged();
		this.notifyObservers();
	}

	public String getData(){ return data; }

	private String dataType;
	/**
 The data type expected. 
	*/
	public void setDataType(String dataType) {
		this.dataType = dataType;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDataType(){ return dataType; }

	private HIFunction error;
	/**
 Function to call on error. 
	*/
	public void setError(HIFunction error) {
		this.error = error;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getError(){ return error; }

	private HashMap /* <String, String> */ headers;
	/**
 The headers; keyed on header name. 
	*/
	public void setHeaders(HashMap /* <String, String> */ headers) {
		this.headers = headers;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap /* <String, String> */ getHeaders(){ return headers; }

	private HIFunction success;
	/**
 Function to call on success. 
	*/
	public void setSuccess(HIFunction success) {
		this.success = success;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getSuccess(){ return success; }

	private String type;
	/**
 The HTTP method to use. For example GET or POST. 
	*/
	public void setType(String type) {
		this.type = type;
		this.setChanged();
		this.notifyObservers();
	}

	public String getType(){ return type; }

	private String url;
	/**
 The URL to call. 
	*/
	public void setUrl(String url) {
		this.url = url;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUrl(){ return url; }



	public HIAjaxSettingsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.data != null) {
			params.put("data", this.data);
		}
		if (this.dataType != null) {
			params.put("dataType", this.dataType);
		}
		if (this.error != null) {
			params.put("error", this.error);
		}
		if (this.headers != null) {
			params.put("headers", this.headers);
		}
		if (this.success != null) {
			params.put("success", this.success);
		}
		if (this.type != null) {
			params.put("type", this.type);
		}
		if (this.url != null) {
			params.put("url", this.url);
		}
		return params;
	}

}
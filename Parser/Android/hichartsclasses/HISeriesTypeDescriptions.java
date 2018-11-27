/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.common.HIChartsJSONSerializable;





public class HISeriesTypeDescriptions extends Observable implements HIChartsJSONSerializable { 

	private String funnel;
	public void setFunnel(String funnel) {
		this.funnel = funnel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFunnel(){ return funnel; }

	private String pyramid;
	public void setPyramid(String pyramid) {
		this.pyramid = pyramid;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPyramid(){ return pyramid; }

	private String columnrange;
	public void setColumnrange(String columnrange) {
		this.columnrange = columnrange;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumnrange(){ return columnrange; }

	private String errorbar;
	public void setErrorbar(String errorbar) {
		this.errorbar = errorbar;
		this.setChanged();
		this.notifyObservers();
	}

	public String getErrorbar(){ return errorbar; }

	private String areasplinerange;
	public void setAreasplinerange(String areasplinerange) {
		this.areasplinerange = areasplinerange;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAreasplinerange(){ return areasplinerange; }

	private String waterfall;
	public void setWaterfall(String waterfall) {
		this.waterfall = waterfall;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWaterfall(){ return waterfall; }

	private String arearange;
	public void setArearange(String arearange) {
		this.arearange = arearange;
		this.setChanged();
		this.notifyObservers();
	}

	public String getArearange(){ return arearange; }

	private String bubble;
	public void setBubble(String bubble) {
		this.bubble = bubble;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBubble(){ return bubble; }

	private String boxplot;
	public void setBoxplot(String boxplot) {
		this.boxplot = boxplot;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxplot(){ return boxplot; }



	public HISeriesTypeDescriptions() {

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
		if (this.funnel != null) {
			params.put("funnel", this.funnel);
		}
		if (this.pyramid != null) {
			params.put("pyramid", this.pyramid);
		}
		if (this.columnrange != null) {
			params.put("columnrange", this.columnrange);
		}
		if (this.errorbar != null) {
			params.put("errorbar", this.errorbar);
		}
		if (this.areasplinerange != null) {
			params.put("areasplinerange", this.areasplinerange);
		}
		if (this.waterfall != null) {
			params.put("waterfall", this.waterfall);
		}
		if (this.arearange != null) {
			params.put("arearange", this.arearange);
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble);
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot);
		}
		return params;
	}

}
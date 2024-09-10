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



public class HIChartTypes extends HIFoundation { 

	private String scatterMultiple;
	public void setScatterMultiple(String scatterMultiple) {
		this.scatterMultiple = scatterMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScatterMultiple(){ return scatterMultiple; }

	private String boxplotSingle;
	public void setBoxplotSingle(String boxplotSingle) {
		this.boxplotSingle = boxplotSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxplotSingle(){ return boxplotSingle; }

	private String defaultsMultiple;
	public void setDefaultMultiple(String defaultsMultiple) {
		this.defaultsMultiple = defaultsMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefaultMultiple(){ return defaultsMultiple; }

	private String mapTypeDescription;
	public void setMapTypeDescription(String mapTypeDescription) {
		this.mapTypeDescription = mapTypeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapTypeDescription(){ return mapTypeDescription; }

	private String lineMultiple;
	public void setLineMultiple(String lineMultiple) {
		this.lineMultiple = lineMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineMultiple(){ return lineMultiple; }

	private String defaultsSingle;
	public void setDefaultSingle(String defaultsSingle) {
		this.defaultsSingle = defaultsSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefaultSingle(){ return defaultsSingle; }

	private String emptyChart;
	public void setEmptyChart(String emptyChart) {
		this.emptyChart = emptyChart;
		this.setChanged();
		this.notifyObservers();
	}

	public String getEmptyChart(){ return emptyChart; }

	private String pieMultiple;
	public void setPieMultiple(String pieMultiple) {
		this.pieMultiple = pieMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPieMultiple(){ return pieMultiple; }

	private String columnSingle;
	public void setColumnSingle(String columnSingle) {
		this.columnSingle = columnSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumnSingle(){ return columnSingle; }

	private String splineMultiple;
	public void setSplineMultiple(String splineMultiple) {
		this.splineMultiple = splineMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSplineMultiple(){ return splineMultiple; }

	private String unknownMap;
	public void setUnknownMap(String unknownMap) {
		this.unknownMap = unknownMap;
		this.setChanged();
		this.notifyObservers();
	}

	public String getUnknownMap(){ return unknownMap; }

	private String combinationChart;
	public void setCombinationChart(String combinationChart) {
		this.combinationChart = combinationChart;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCombinationChart(){ return combinationChart; }

	private String columnMultiple;
	public void setColumnMultiple(String columnMultiple) {
		this.columnMultiple = columnMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumnMultiple(){ return columnMultiple; }

	private String scatterSingle;
	public void setScatterSingle(String scatterSingle) {
		this.scatterSingle = scatterSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScatterSingle(){ return scatterSingle; }

	private String bubbleMultiple;
	public void setBubbleMultiple(String bubbleMultiple) {
		this.bubbleMultiple = bubbleMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBubbleMultiple(){ return bubbleMultiple; }

	private String boxplotMultiple;
	public void setBoxplotMultiple(String boxplotMultiple) {
		this.boxplotMultiple = boxplotMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxplotMultiple(){ return boxplotMultiple; }

	private String barSingle;
	public void setBarSingle(String barSingle) {
		this.barSingle = barSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBarSingle(){ return barSingle; }

	private String barMultiple;
	public void setBarMultiple(String barMultiple) {
		this.barMultiple = barMultiple;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBarMultiple(){ return barMultiple; }

	private String lineSingle;
	public void setLineSingle(String lineSingle) {
		this.lineSingle = lineSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineSingle(){ return lineSingle; }

	private String splineSingle;
	public void setSplineSingle(String splineSingle) {
		this.splineSingle = splineSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSplineSingle(){ return splineSingle; }

	private String bubbleSingle;
	public void setBubbleSingle(String bubbleSingle) {
		this.bubbleSingle = bubbleSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBubbleSingle(){ return bubbleSingle; }

	private String pieSingle;
	public void setPieSingle(String pieSingle) {
		this.pieSingle = pieSingle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPieSingle(){ return pieSingle; }



	public HIChartTypes() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.scatterMultiple != null) {
			params.put("scatterMultiple", this.scatterMultiple);
		}
		if (this.boxplotSingle != null) {
			params.put("boxplotSingle", this.boxplotSingle);
		}
		if (this.defaultsMultiple != null) {
			params.put("defaultsMultiple", this.defaultsMultiple);
		}
		if (this.mapTypeDescription != null) {
			params.put("mapTypeDescription", this.mapTypeDescription);
		}
		if (this.lineMultiple != null) {
			params.put("lineMultiple", this.lineMultiple);
		}
		if (this.defaultsSingle != null) {
			params.put("defaultsSingle", this.defaultsSingle);
		}
		if (this.emptyChart != null) {
			params.put("emptyChart", this.emptyChart);
		}
		if (this.pieMultiple != null) {
			params.put("pieMultiple", this.pieMultiple);
		}
		if (this.columnSingle != null) {
			params.put("columnSingle", this.columnSingle);
		}
		if (this.splineMultiple != null) {
			params.put("splineMultiple", this.splineMultiple);
		}
		if (this.unknownMap != null) {
			params.put("unknownMap", this.unknownMap);
		}
		if (this.combinationChart != null) {
			params.put("combinationChart", this.combinationChart);
		}
		if (this.columnMultiple != null) {
			params.put("columnMultiple", this.columnMultiple);
		}
		if (this.scatterSingle != null) {
			params.put("scatterSingle", this.scatterSingle);
		}
		if (this.bubbleMultiple != null) {
			params.put("bubbleMultiple", this.bubbleMultiple);
		}
		if (this.boxplotMultiple != null) {
			params.put("boxplotMultiple", this.boxplotMultiple);
		}
		if (this.barSingle != null) {
			params.put("barSingle", this.barSingle);
		}
		if (this.barMultiple != null) {
			params.put("barMultiple", this.barMultiple);
		}
		if (this.lineSingle != null) {
			params.put("lineSingle", this.lineSingle);
		}
		if (this.splineSingle != null) {
			params.put("splineSingle", this.splineSingle);
		}
		if (this.bubbleSingle != null) {
			params.put("bubbleSingle", this.bubbleSingle);
		}
		if (this.pieSingle != null) {
			params.put("pieSingle", this.pieSingle);
		}
		return params;
	}

}
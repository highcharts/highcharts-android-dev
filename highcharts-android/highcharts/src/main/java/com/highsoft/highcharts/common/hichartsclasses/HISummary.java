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



public class HISummary extends HIFoundation { 

	private String pieCombination;
	public void setPieCombination(String pieCombination) {
		this.pieCombination = pieCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPieCombination(){ return pieCombination; }

	private String pie;
	public void setPie(String pie) {
		this.pie = pie;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPie(){ return pie; }

	private String lineCombination;
	public void setLineCombination(String lineCombination) {
		this.lineCombination = lineCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineCombination(){ return lineCombination; }

	private String mapbubble;
	public void setMapbubble(String mapbubble) {
		this.mapbubble = mapbubble;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapbubble(){ return mapbubble; }

	private String spline;
	public void setSpline(String spline) {
		this.spline = spline;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSpline(){ return spline; }

	private String barCombination;
	public void setBarCombination(String barCombination) {
		this.barCombination = barCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBarCombination(){ return barCombination; }

	private String boxplotCombination;
	public void setBoxplotCombination(String boxplotCombination) {
		this.boxplotCombination = boxplotCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxplotCombination(){ return boxplotCombination; }

	private String splineCombination;
	public void setSplineCombination(String splineCombination) {
		this.splineCombination = splineCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSplineCombination(){ return splineCombination; }

	private String scatterCombination;
	public void setScatterCombination(String scatterCombination) {
		this.scatterCombination = scatterCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScatterCombination(){ return scatterCombination; }

	private String maplineCombination;
	public void setMaplineCombination(String maplineCombination) {
		this.maplineCombination = maplineCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMaplineCombination(){ return maplineCombination; }

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

	private String columnCombination;
	public void setColumnCombination(String columnCombination) {
		this.columnCombination = columnCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumnCombination(){ return columnCombination; }

	private String map;
	public void setMap(String map) {
		this.map = map;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMap(){ return map; }

	private String line;
	public void setLine(String line) {
		this.line = line;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLine(){ return line; }

	private String mapline;
	public void setMapline(String mapline) {
		this.mapline = mapline;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapline(){ return mapline; }

	private String bar;
	public void setBar(String bar) {
		this.bar = bar;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBar(){ return bar; }

	private String mapCombination;
	public void setMapCombination(String mapCombination) {
		this.mapCombination = mapCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapCombination(){ return mapCombination; }

	private String defaults;
	public void setDefault(String defaults) {
		this.defaults = defaults;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefault(){ return defaults; }

	private String mapbubbleCombination;
	public void setMapbubbleCombination(String mapbubbleCombination) {
		this.mapbubbleCombination = mapbubbleCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMapbubbleCombination(){ return mapbubbleCombination; }

	private String defaultsCombination;
	public void setDefaultCombination(String defaultsCombination) {
		this.defaultsCombination = defaultsCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefaultCombination(){ return defaultsCombination; }

	private String column;
	public void setColumn(String column) {
		this.column = column;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumn(){ return column; }

	private String bubbleCombination;
	public void setBubbleCombination(String bubbleCombination) {
		this.bubbleCombination = bubbleCombination;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBubbleCombination(){ return bubbleCombination; }

	private String scatter;
	public void setScatter(String scatter) {
		this.scatter = scatter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getScatter(){ return scatter; }



	public HISummary() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.pieCombination != null) {
			params.put("pieCombination", this.pieCombination);
		}
		if (this.pie != null) {
			params.put("pie", this.pie);
		}
		if (this.lineCombination != null) {
			params.put("lineCombination", this.lineCombination);
		}
		if (this.mapbubble != null) {
			params.put("mapbubble", this.mapbubble);
		}
		if (this.spline != null) {
			params.put("spline", this.spline);
		}
		if (this.barCombination != null) {
			params.put("barCombination", this.barCombination);
		}
		if (this.boxplotCombination != null) {
			params.put("boxplotCombination", this.boxplotCombination);
		}
		if (this.splineCombination != null) {
			params.put("splineCombination", this.splineCombination);
		}
		if (this.scatterCombination != null) {
			params.put("scatterCombination", this.scatterCombination);
		}
		if (this.maplineCombination != null) {
			params.put("maplineCombination", this.maplineCombination);
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble);
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot);
		}
		if (this.columnCombination != null) {
			params.put("columnCombination", this.columnCombination);
		}
		if (this.map != null) {
			params.put("map", this.map);
		}
		if (this.line != null) {
			params.put("line", this.line);
		}
		if (this.mapline != null) {
			params.put("mapline", this.mapline);
		}
		if (this.bar != null) {
			params.put("bar", this.bar);
		}
		if (this.mapCombination != null) {
			params.put("mapCombination", this.mapCombination);
		}
		if (this.defaults != null) {
			params.put("default", this.defaults);
		}
		if (this.mapbubbleCombination != null) {
			params.put("mapbubbleCombination", this.mapbubbleCombination);
		}
		if (this.defaultsCombination != null) {
			params.put("defaultsCombination", this.defaultsCombination);
		}
		if (this.column != null) {
			params.put("column", this.column);
		}
		if (this.bubbleCombination != null) {
			params.put("bubbleCombination", this.bubbleCombination);
		}
		if (this.scatter != null) {
			params.put("scatter", this.scatter);
		}
		return params;
	}

}
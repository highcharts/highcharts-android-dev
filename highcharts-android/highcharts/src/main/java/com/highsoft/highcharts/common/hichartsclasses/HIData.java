/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class HIData extends HIFoundation { 

	private Boolean enablePolling;
	/**
 Enables automatic refetching of remote datasets every _n_ seconds (defined by setting `data.dataRefreshRate`). Only works when either `data.csvURL`, `data.rowsURL`, `data.columnsURL`, or `data.googleSpreadsheetKey`. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setEnablePolling(Boolean enablePolling) {
		this.enablePolling = enablePolling;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnablePolling(){ return enablePolling; }

	private String googleSpreadsheetRange;
	/**
 The Google Spreadsheet `range` to use in combination with `googleSpreadsheetKey`. See [developers.google.com](https://developers.google.com/sheets/api/reference/rest/v4/spreadsheets.values/get) for details. If given, it takes precedence over `startColumn`, `endColumn`, `startRow` and `endRow`. 
	*/
	public void setGoogleSpreadsheetRange(String googleSpreadsheetRange) {
		this.googleSpreadsheetRange = googleSpreadsheetRange;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGoogleSpreadsheetRange(){ return googleSpreadsheetRange; }

	private Number startColumn;
	/**
 In tabular input data, the first column (indexed by 0) to use. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setStartColumn(Number startColumn) {
		this.startColumn = startColumn;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartColumn(){ return startColumn; }

	private String lineDelimiter;
	/**
 Line delimiter for parsing CSV. 
 <br><br><b>defaults:</b><br><br>&ensp;\n	*/
	public void setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLineDelimiter(){ return lineDelimiter; }

	private String table;
	/**
 An HTML table or the id of such to be parsed as input data. Related options are `startRow`, `endRow`, `startColumn` and `endColumn` to delimit what part of the table is used. 
	*/
	public void setTable(String table) {
		this.table = table;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTable(){ return table; }

	private HIFunction parsed;
	/**
 A callback function to access the parsed columns, the two-dimensional input data array directly, before they are interpreted into series data and categories. Return `false` to stop completion, or call `this.complete()` to continue async. 
	*/
	public void setParsed(HIFunction parsed) {
		this.parsed = parsed;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getParsed(){ return parsed; }

	private HIFunction parseDate;
	/**
 A callback function to parse string representations of dates into JavaScript timestamps. Should return an integer timestamp on success. 
	*/
	public void setParseDate(HIFunction parseDate) {
		this.parseDate = parseDate;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getParseDate(){ return parseDate; }

	private ArrayList seriesMapping;
	/**
 An array containing dictionaries for each series. A dictionary exists of Point property names as the key and the CSV column index as the value. 
	*/
	public void setSeriesMapping(ArrayList seriesMapping) {
		this.seriesMapping = seriesMapping;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getSeriesMapping(){ return seriesMapping; }

	private ArrayList<ArrayList> rows;
	/**
 The same as the columns input option, but defining rows instead of columns. 
	*/
	public void setRows(ArrayList<ArrayList> rows) {
		this.rows = rows;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList> getRows(){ return rows; }

	private String csvURL;
	/**
 An URL to a remote CSV dataset. Will be fetched when the chart is created using Ajax. 
	*/
	public void setCsvURL(String csvURL) {
		this.csvURL = csvURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCsvURL(){ return csvURL; }

	private String dateFormat;
	/**
 Which of the predefined date formats in Date.prototype.dateFormats to use to parse date values. Defaults to a best guess based on what format gives valid and ordered dates. Valid options include: `YYYY/mm/dd`, `dd/mm/YYYY`, `mm/dd/YYYY`, `dd/mm/YY`, `mm/dd/YY`. 
	*/
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDateFormat(){ return dateFormat; }

	private Number dataRefreshRate;
	/**
 Sets the refresh rate for data polling when importing remote dataset by setting `data.csvURL`, `data.rowsURL`, `data.columnsURL`, or `data.googleSpreadsheetKey`. Note that polling must be enabled by setting `data.enablePolling` to true. The value is the number of seconds between pollings. It cannot be set to less than 1 second. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setDataRefreshRate(Number dataRefreshRate) {
		this.dataRefreshRate = dataRefreshRate;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDataRefreshRate(){ return dataRefreshRate; }

	private String rowsURL;
	/**
 A URL to a remote JSON dataset, structured as a row array. Will be fetched when the chart is created using Ajax. 
	*/
	public void setRowsURL(String rowsURL) {
		this.rowsURL = rowsURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRowsURL(){ return rowsURL; }

	private Number startRow;
	/**
 In tabular input data, the first row (indexed by 0) to use. 
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setStartRow(Number startRow) {
		this.startRow = startRow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartRow(){ return startRow; }

	private String csv;
	/**
 A comma delimited string to be parsed. Related options are `startRow`, `endRow`, `startColumn` and `endColumn` to delimit what part of the table is used. The `lineDelimiter` and `itemDelimiter` options define the CSV delimiter formats. The built-in CSV parser doesn't support all flavours of CSV, so in some cases it may be necessary to use an external CSV parser. See [this example](https://jsfiddle.net/highcharts/u59176h4/) of parsing CSV through the MIT licensed [Papa Parse](http://papaparse.com/) library. 
	*/
	public void setCsv(String csv) {
		this.csv = csv;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCsv(){ return csv; }

	private ArrayList<ArrayList> columns;
	/**
 A two-dimensional array representing the input data on tabular form. This input can be used when the data is already parsed, for example from a grid view component. Each cell can be a string or number. If not switchRowsAndColumns is set, the columns are interpreted as series. 
	*/
	public void setColumns(ArrayList<ArrayList> columns) {
		this.columns = columns;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<ArrayList> getColumns(){ return columns; }

	private Number endRow;
	/**
 In tabular input data, the last row (indexed by 0) to use. Defaults to the last row containing data. 
	*/
	public void setEndRow(Number endRow) {
		this.endRow = endRow;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndRow(){ return endRow; }

	private String itemDelimiter;
	/**
 Item or cell delimiter for parsing CSV. Defaults to the tab character `\t` if a tab character is found in the CSV string, if not it defaultss to `,`. If this is set to false or undefined, the parser will attempt to deduce the delimiter automatically. 
	*/
	public void setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getItemDelimiter(){ return itemDelimiter; }

	private HIFunction complete;
	/**
 The callback that is evaluated when the data is finished loading, optionally from an external source, and parsed. The first argument passed is a finished chart options object, containing the series. These options can be extended with additional options and passed directly to the chart constructor. 
	*/
	public void setComplete(HIFunction complete) {
		this.complete = complete;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getComplete(){ return complete; }

	private HIFunction beforeParse;
	/**
 A callback function to modify the CSV before parsing it. Return the modified string. 
	*/
	public void setBeforeParse(HIFunction beforeParse) {
		this.beforeParse = beforeParse;
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunction getBeforeParse(){ return beforeParse; }

	private Number endColumn;
	/**
 In tabular input data, the last column (indexed by 0) to use. Defaults to the last column containing data. 
	*/
	public void setEndColumn(Number endColumn) {
		this.endColumn = endColumn;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEndColumn(){ return endColumn; }

	private Boolean firstRowAsNames;
	/**
 Whether to use the first row in the data set as series names. 
 <br><br><b>defaults:</b><br><br>&ensp;true	*/
	public void setFirstRowAsNames(Boolean firstRowAsNames) {
		this.firstRowAsNames = firstRowAsNames;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getFirstRowAsNames(){ return firstRowAsNames; }

	private String googleAPIKey;
	/**
 The Google Spreadsheet API key required for access generated at [APIServices/Credentials](https://console.cloud.google.com/apis/credentials). See a comprehensive tutorial for setting up the key at the [Hands-On Data Visualization](https://handsondataviz.org/google-sheets-api-key.html) book website. 
	*/
	public void setGoogleAPIKey(String googleAPIKey) {
		this.googleAPIKey = googleAPIKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGoogleAPIKey(){ return googleAPIKey; }

	private String googleSpreadsheetKey;
	/**
 The key or `spreadsheetId` value for a Google Spreadsheet to load. See [developers.google.com](https://developers.google.com/sheets/api/guides/concepts) for how to find the `spreadsheetId`. In order for Google Sheets to load, a valid `googleAPIKey` must also be given. 
	*/
	public void setGoogleSpreadsheetKey(String googleSpreadsheetKey) {
		this.googleSpreadsheetKey = googleSpreadsheetKey;
		this.setChanged();
		this.notifyObservers();
	}

	public String getGoogleSpreadsheetKey(){ return googleSpreadsheetKey; }

	private Boolean switchRowsAndColumns;
	/**
 Switch rows and columns of the input data, so that `this.columns` effectively becomes the rows of the data set, and the rows are interpreted as series. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSwitchRowsAndColumns(Boolean switchRowsAndColumns) {
		this.switchRowsAndColumns = switchRowsAndColumns;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSwitchRowsAndColumns(){ return switchRowsAndColumns; }

	private ArrayList columnTypes;
	/**
 An array option that specifies the data type for each column in the series loaded within the data module. Possible values: `"string"`, `"number"`, `"float"`, `"date"`. 
	*/
	public void setColumnTypes(ArrayList columnTypes) {
		this.columnTypes = columnTypes;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getColumnTypes(){ return columnTypes; }

	private String decimalPoint;
	/**
 The decimal point used for parsing numbers in the CSV. If both this and data.delimiter is set to `undefined`, the parser will attempt to deduce the decimal point automatically. 
 <br><br><b>defaults:</b><br><br>&ensp;.	*/
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimalPoint(){ return decimalPoint; }

	private String columnsURL;
	/**
 A URL to a remote JSON dataset, structured as a column array. Will be fetched when the chart is created using Ajax. 
	*/
	public void setColumnsURL(String columnsURL) {
		this.columnsURL = columnsURL;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColumnsURL(){ return columnsURL; }

	private Number q1;
	/**
 The lower quartile for each data point. This is the bottom of the box. 
	*/
	public void setQ1(Number q1) {
		this.q1 = q1;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getQ1(){ return q1; }

	private Number q3;
	/**
 The higher quartile for each data point. This is the top of the box. 
	*/
	public void setQ3(Number q3) {
		this.q3 = q3;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getQ3(){ return q3; }

	private Number median;
	/**
 The median for each data point. This is drawn as a line through the middle area of the box. 
	*/
	public void setMedian(Number median) {
		this.median = median;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMedian(){ return median; }

	private Number high;
	/**
 The `high` value for each data point, signifying the highest value in the sample set. The top whisker is drawn here. 
	*/
	public void setHigh(Number high) {
		this.high = high;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHigh(){ return high; }

	private String stemDashStyle;
	/**
 The dash style of the stem. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setStemDashStyle(String stemDashStyle) {
		this.stemDashStyle = stemDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStemDashStyle(){ return stemDashStyle; }

	private String whiskerDashStyle;
	/**
 The dash style of the whiskers. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setWhiskerDashStyle(String whiskerDashStyle) {
		this.whiskerDashStyle = whiskerDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getWhiskerDashStyle(){ return whiskerDashStyle; }

	private Number low;
	/**
 The `low` value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here. 
	*/
	public void setLow(Number low) {
		this.low = low;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLow(){ return low; }

	private String medianDashStyle;
	/**
 The dash style of the median. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setMedianDashStyle(String medianDashStyle) {
		this.medianDashStyle = medianDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMedianDashStyle(){ return medianDashStyle; }

	private String boxDashStyle;
	/**
 The dash style of the box. 
 <br><br><b>defaults:</b><br><br>&ensp;Solid	*/
	public void setBoxDashStyle(String boxDashStyle) {
		this.boxDashStyle = boxDashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBoxDashStyle(){ return boxDashStyle; }

	private Number labelrank;
	/**
 The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest `labelrank` will be drawn. 
	*/
	public void setLabelrank(Number labelrank) {
		this.labelrank = labelrank;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLabelrank(){ return labelrank; }

	private Number y;
	/**
 The y value of the point. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }

	private Number colorIndex;
	/**
 A specific color index to use for the point, so its graphic representations are given the class name `highcharts-color-{n}`. In styled mode this will change the color of the graphic. In non-styled mode, the color is set by the `fill` attribute, so the change in class name won't have a visual effect by defaults. Since v11, CSS variables on the form `--highcharts-color-{n}` make changing the color scheme very convenient. 
	*/
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorIndex(){ return colorIndex; }

	private String name;
	/**
 The name of the point as shown in the legend, tooltip, dataLabels, etc. 
	*/
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private HIColor color;
	/**
 Individual color for the point. By defaults the color is pulled from the global `colors` array. In styled mode, the `color` option doesn't take effect. Instead, use `colorIndex`. 
	*/
	public void setColor(HIColor color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getColor(){ return color; }

	private Boolean selected;
	/**
 Whether the data point is selected initially. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setSelected(Boolean selected) {
		this.selected = selected;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSelected(){ return selected; }

	private HIAccessibility accessibility;
	/**
 Accessibility options for a data point. 
	*/
	public void setAccessibility(HIAccessibility accessibility) {
		this.accessibility = accessibility;
		this.accessibility.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAccessibility getAccessibility(){ return accessibility; }

	private HashMap custom;
	/**
 A reserved subspace to store options and values for customized functionality. Here you can add additional data for your own event callbacks and formatter callbacks. 
	*/
	public void setCustom(HashMap custom) {
		this.custom = custom;
		this.setChanged();
		this.notifyObservers();
	}

	public HashMap getCustom(){ return custom; }

	private String className;
	/**
 An additional, individual class name for the data point's graphic representation. Changes to a point's color will also be reflected in a chart's legend and tooltip. 
	*/
	public void setClassName(String className) {
		this.className = className;
		this.setChanged();
		this.notifyObservers();
	}

	public String getClassName(){ return className; }

	private HIDragDrop dragDrop;
	/**
 Point specific options for the draggable-points module. Overrides options on `series.dragDrop`. 
	*/
	public void setDragDrop(HIDragDrop dragDrop) {
		this.dragDrop = dragDrop;
		this.dragDrop.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIDragDrop getDragDrop(){ return dragDrop; }

	private String id;
	/**
 An id for the point. This can be used after render time to get a pointer to the point object through `chart.get()`. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private Number x;
	/**
 The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private String drilldown;
	/**
 The `id` of a series in the `drilldown.series` array to use for a drilldown for this point. 
	*/
	public void setDrilldown(String drilldown) {
		this.drilldown = drilldown;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDrilldown(){ return drilldown; }

	private ArrayList <HIDataLabels> dataLabels;
	/**
 Individual data label for each point. The options are the same as the ones for `plotOptions.series.dataLabels`. 
	*/
	public void setDataLabels(ArrayList dataLabels) {
		this.dataLabels = dataLabels;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList getDataLabels(){ return dataLabels; }

	private HIEvents events;
	/**
 The individual point events. 
	*/
	public void setEvents(HIEvents events) {
		this.events = events;
		this.events.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIEvents getEvents(){ return events; }

	private String definition;
	/**
 A description of the point to add to the screen reader information about the point. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private Number legendIndex;
	/**
 The sequential index of the data point in the legend. 
	*/
	public void setLegendIndex(Number legendIndex) {
		this.legendIndex = legendIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLegendIndex(){ return legendIndex; }

	private HIMarker marker;
	/**
 Options for the point markers of line-like series. 
	*/
	public void setMarker(HIMarker marker) {
		this.marker = marker;
		this.marker.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIMarker getMarker(){ return marker; }

	private String label;
	/**
 The label of event. 
	*/
	public void setLabel(String label) {
		this.label = label;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabel(){ return label; }

	private String from;
	/**
 The node that the link runs from. 
	*/
	public void setFrom(String from) {
		this.from = from;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFrom(){ return from; }

	private Number weight;
	/**
 The weight of the link. 
	*/
	public void setWeight(Number weight) {
		this.weight = weight;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWeight(){ return weight; }

	private String to;
	/**
 The node that the link runs to. 
	*/
	public void setTo(String to) {
		this.to = to;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTo(){ return to; }

	private Number target;
	/**
 The target value of a point. 
	*/
	public void setTarget(Number target) {
		this.target = target;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getTarget(){ return target; }

	private HITargetOptions targetOptions;
	/**
 Individual target options for each point. 
	*/
	public void setTargetOptions(HITargetOptions targetOptions) {
		this.targetOptions = targetOptions;
		this.targetOptions.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITargetOptions getTargetOptions(){ return targetOptions; }

	private HIColor borderColor;
	/**
 The color of the border surrounding the column or bar. In styled mode, the border stroke can be set with the `.highcharts-point` rule. 
	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private String dashStyle;
	/**
 A name for the dash style to use for the column or bar. Overrides dashStyle on the series. In styled mode, the stroke dash-array can be set with the same classes as listed under `data.color`. 
	*/
	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDashStyle(){ return dashStyle; }

	private Number pointWidth;
	/**
 A pixel value specifying a fixed width for the column or bar. Overrides pointWidth on the series. The width effects the dimension that is not based on the point value. 
 <br><br><b>defaults:</b><br><br>&ensp;undefined	*/
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointWidth(){ return pointWidth; }

	private Number borderWidth;
	/**
 The width of the border surrounding the column or bar. In styled mode, the stroke width can be set with the `.highcharts-point` rule. 
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private String connectorColor;
	/**
 Color of the line that connects the dumbbell point's values. By defaults it is the series' color. 
	*/
	public void setConnectorColor(String connectorColor) {
		this.connectorColor = connectorColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnectorColor(){ return connectorColor; }

	private Number connectorWidth;
	/**
 Pixel width of the line that connects the dumbbell point's values. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setConnectorWidth(Number connectorWidth) {
		this.connectorWidth = connectorWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getConnectorWidth(){ return connectorWidth; }

	private Number pointPadding;
	/**
 Point padding for a single point. 
	*/
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getPointPadding(){ return pointPadding; }

	private Number value;
	/**
 The value of the point, resulting in a color controlled by options as set in the `colorAxis` configuration. 
	*/
	public void setValue(Number value) {
		this.value = value;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getValue(){ return value; }

	private Boolean isIntermediateSum;
	/**
 When this property is true, the points acts as a summary column for the values added or subtracted since the last intermediate sum, or since the start of the series. The `y` value is ignored. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setIsIntermediateSum(Boolean isIntermediateSum) {
		this.isIntermediateSum = isIntermediateSum;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsIntermediateSum(){ return isIntermediateSum; }

	private Boolean isSum;
	/**
 When this property is true, the point display the total sum across the entire series. The `y` value is ignored. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setIsSum(Boolean isSum) {
		this.isSum = isSum;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getIsSum(){ return isSum; }

	private Boolean sliced;
	/**
 Whether to display a slice offset from the center. 
	*/
	public void setSliced(Boolean sliced) {
		this.sliced = sliced;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getSliced(){ return sliced; }

	private Boolean gradientForSides;
	/**
 By defaults sides fill is set to a gradient through this option being set to `true`. Set to `false` to get solid color for the sides. 
	*/
	public void setGradientForSides(Boolean gradientForSides) {
		this.gradientForSides = gradientForSides;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getGradientForSides(){ return gradientForSides; }

	private Number direction;
	/**
 The vector direction in degrees, where 0 is north (pointing towards south). 
	*/
	public void setDirection(Number direction) {
		this.direction = direction;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getDirection(){ return direction; }

	private Number length;
	/**
 The length of the vector. The rendered length will relate to the `vectorLength` setting. 
	*/
	public void setLength(Number length) {
		this.length = length;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getLength(){ return length; }

	private String innerRadius;
	/**
 The inner radius of an individual point in a solid gauge. Can be given only in percentage, either as a number or a string like `"50%"`. 
	*/
	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInnerRadius(){ return innerRadius; }

	private String radius;
	/**
 The outer radius of an individual point in a solid gauge. Can be given only in percentage, either as a number or a string like `"100%"`. 
	*/
	public void setRadius(String radius) {
		this.radius = radius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRadius(){ return radius; }

	private Boolean outgoing;
	/**
 Whether the link goes out of the system. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setOutgoing(Boolean outgoing) {
		this.outgoing = outgoing;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getOutgoing(){ return outgoing; }

	private Number z;
	/**
 The size value for each bubble. The bubbles' diameters are computed based on the `z`, and controlled by series options like `minSize`, `maxSize`, `sizeBy`, `zMin` and `zMax`. 
	*/
	public void setZ(Number z) {
		this.z = z;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getZ(){ return z; }

	private HIColor lowColor;
	/**
 Color of the start markers in a dumbbell graph. This option takes priority over the series color. To avoid this, set `lowColor` to `undefined`. 
 <br><br><b>defaults:</b><br><br>&ensp;#333333	*/
	public void setLowColor(HIColor lowColor) {
		this.lowColor = lowColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getLowColor(){ return lowColor; }

	private Number x2;
	/**
 The ending X value of the range point. 
	*/
	public void setX2(Number x2) {
		this.x2 = x2;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX2(){ return x2; }

	private HIPartialFill partialFill;
	/**
 A partial fill for each point, typically used to visualize how much of a task is performed. The partial fill object can be set either on series or point level. 
	*/
	public void setPartialFill(HIPartialFill partialFill) {
		this.partialFill = partialFill;
		this.partialFill.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPartialFill getPartialFill(){ return partialFill; }

	private String parent;
	/**
 Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root. 
	*/
	public void setParent(String parent) {
		this.parent = parent;
		this.setChanged();
		this.notifyObservers();
	}

	public String getParent(){ return parent; }

	private Number colorValue;
	/**
 Serves a purpose only if a `colorAxis` object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis. 
	*/
	public void setColorValue(Number colorValue) {
		this.colorValue = colorValue;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getColorValue(){ return colorValue; }

	private ArrayList<String> sets;
	/**
 The set or sets the options will be applied to. If a single entry is defined, then it will create a new set. If more than one entry is defined, then it will define the overlap between the sets in the array. 
	*/
	public void setSets(ArrayList<String> sets) {
		this.sets = sets;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<String> getSets(){ return sets; }

	private Boolean collapsed;
	/**
 If point's children should be initially hidden 
	*/
	public void setCollapsed(Boolean collapsed) {
		this.collapsed = collapsed;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCollapsed(){ return collapsed; }

	private Object collapseButton;
	/**
 Options used for button, which toggles the collapse status of the node. 
	*/
	public void setCollapseButton(Object collapseButton) {
		this.collapseButton = collapseButton;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCollapseButton(){ return collapseButton; }



	public HIData() {

	}

	private HashMap<String, Object> jsProperties;
	/**
	 * Add a custom property to your chart. Those can be accessible later by HIFunction callbacks.
	 * @param name the name by which you can access property
	 * @param value the actual value which can be accessed
	 */
	public void setProperty(String name, Object value) {
		if(jsProperties == null) jsProperties = new HashMap<>();
		jsProperties.put(name, value);
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.enablePolling != null) {
			params.put("enablePolling", this.enablePolling);
		}
		if(this.jsProperties != null){
			for (Map.Entry<String, Object> entry : jsProperties.entrySet()) {
				params.put(entry.getKey(), entry.getValue());
			}
		}
		if (this.googleSpreadsheetRange != null) {
			params.put("googleSpreadsheetRange", this.googleSpreadsheetRange);
		}
		if (this.startColumn != null) {
			params.put("startColumn", this.startColumn);
		}
		if (this.lineDelimiter != null) {
			params.put("lineDelimiter", this.lineDelimiter);
		}
		if (this.table != null) {
			params.put("table", this.table);
		}
		if (this.parsed != null) {
			params.put("parsed", this.parsed);
		}
		if (this.parseDate != null) {
			params.put("parseDate", this.parseDate);
		}
		if (this.seriesMapping != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.seriesMapping) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("seriesMapping", array);
		}
		if (this.rows != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.rows) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("rows", array);
		}
		if (this.csvURL != null) {
			params.put("csvURL", this.csvURL);
		}
		if (this.dateFormat != null) {
			params.put("dateFormat", this.dateFormat);
		}
		if (this.dataRefreshRate != null) {
			params.put("dataRefreshRate", this.dataRefreshRate);
		}
		if (this.rowsURL != null) {
			params.put("rowsURL", this.rowsURL);
		}
		if (this.startRow != null) {
			params.put("startRow", this.startRow);
		}
		if (this.csv != null) {
			params.put("csv", this.csv);
		}
		if (this.columns != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.columns) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("columns", array);
		}
		if (this.endRow != null) {
			params.put("endRow", this.endRow);
		}
		if (this.itemDelimiter != null) {
			params.put("itemDelimiter", this.itemDelimiter);
		}
		if (this.complete != null) {
			params.put("complete", this.complete);
		}
		if (this.beforeParse != null) {
			params.put("beforeParse", this.beforeParse);
		}
		if (this.endColumn != null) {
			params.put("endColumn", this.endColumn);
		}
		if (this.firstRowAsNames != null) {
			params.put("firstRowAsNames", this.firstRowAsNames);
		}
		if (this.googleAPIKey != null) {
			params.put("googleAPIKey", this.googleAPIKey);
		}
		if (this.googleSpreadsheetKey != null) {
			params.put("googleSpreadsheetKey", this.googleSpreadsheetKey);
		}
		if (this.switchRowsAndColumns != null) {
			params.put("switchRowsAndColumns", this.switchRowsAndColumns);
		}
		if (this.columnTypes != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.columnTypes) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("columnTypes", array);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.columnsURL != null) {
			params.put("columnsURL", this.columnsURL);
		}
		if (this.q1 != null) {
			params.put("q1", this.q1);
		}
		if (this.q3 != null) {
			params.put("q3", this.q3);
		}
		if (this.median != null) {
			params.put("median", this.median);
		}
		if (this.high != null) {
			params.put("high", this.high);
		}
		if (this.stemDashStyle != null) {
			params.put("stemDashStyle", this.stemDashStyle);
		}
		if (this.whiskerDashStyle != null) {
			params.put("whiskerDashStyle", this.whiskerDashStyle);
		}
		if (this.low != null) {
			params.put("low", this.low);
		}
		if (this.medianDashStyle != null) {
			params.put("medianDashStyle", this.medianDashStyle);
		}
		if (this.boxDashStyle != null) {
			params.put("boxDashStyle", this.boxDashStyle);
		}
		if (this.labelrank != null) {
			params.put("labelrank", this.labelrank);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.color != null) {
			params.put("color", this.color.getData());
		}
		if (this.selected != null) {
			params.put("selected", this.selected);
		}
		if (this.accessibility != null) {
			params.put("accessibility", this.accessibility.getParams());
		}
		if (this.custom != null) {
			params.put("custom", this.custom);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.dragDrop != null) {
			params.put("dragDrop", this.dragDrop.getParams());
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown);
		}
		if (this.dataLabels != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.dataLabels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("dataLabels", array);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.legendIndex != null) {
			params.put("legendIndex", this.legendIndex);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.label != null) {
			params.put("label", this.label);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.weight != null) {
			params.put("weight", this.weight);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.target != null) {
			params.put("target", this.target);
		}
		if (this.targetOptions != null) {
			params.put("targetOptions", this.targetOptions.getParams());
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.dashStyle != null) {
			params.put("dashStyle", this.dashStyle);
		}
		if (this.pointWidth != null) {
			params.put("pointWidth", this.pointWidth);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.connectorColor != null) {
			params.put("connectorColor", this.connectorColor);
		}
		if (this.connectorWidth != null) {
			params.put("connectorWidth", this.connectorWidth);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.isIntermediateSum != null) {
			params.put("isIntermediateSum", this.isIntermediateSum);
		}
		if (this.isSum != null) {
			params.put("isSum", this.isSum);
		}
		if (this.sliced != null) {
			params.put("sliced", this.sliced);
		}
		if (this.gradientForSides != null) {
			params.put("gradientForSides", this.gradientForSides);
		}
		if (this.direction != null) {
			params.put("direction", this.direction);
		}
		if (this.length != null) {
			params.put("length", this.length);
		}
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.outgoing != null) {
			params.put("outgoing", this.outgoing);
		}
		if (this.z != null) {
			params.put("z", this.z);
		}
		if (this.lowColor != null) {
			params.put("lowColor", this.lowColor.getData());
		}
		if (this.x2 != null) {
			params.put("x2", this.x2);
		}
		if (this.partialFill != null) {
			params.put("partialFill", this.partialFill.getParams());
		}
		if (this.parent != null) {
			params.put("parent", this.parent);
		}
		if (this.colorValue != null) {
			params.put("colorValue", this.colorValue);
		}
		if (this.sets != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (Object obj : this.sets) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("sets", array);
		}
		if (this.collapsed != null) {
			params.put("collapsed", this.collapsed);
		}
		if (this.collapseButton != null) {
		}
		return params;
	}

}
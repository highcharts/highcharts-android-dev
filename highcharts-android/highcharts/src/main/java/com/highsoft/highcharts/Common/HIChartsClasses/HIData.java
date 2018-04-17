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
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;
import com.highsoft.highcharts.Common.HIColor;



public class HIData implements HIChartsJSONSerializable { 


/**
Enables automatic refetching of remote datasets every _n_ seconds (defined by
setting [data.dataRefreshRate](data.dataRefreshRate)).

Only works when either [data.csvURL](data.csvURL),
[data.rowsURL](data.rowsURL), [data.columnsURL](data.columnsURL), or
[data.googleSpreadsheetKey](data.googleSpreadsheetKey).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/live-data">Live data</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean enablePolling;

/**
In tabular input data, the first column (indexed by 0) to use.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number startColumn;

/**
Line delimiter for parsing CSV.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a> <br><br><b>default:</b><br><br>&ensp;\n*/
	public String lineDelimiter;

/**
A HTML table or the id of such to be parsed as input data. Related
options are startRow, endRow, startColumn and endColumn to
delimit what part of the table is used.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-parsed/">Parsed table</a>*/
	public Object table;

/**
A callback function to access the parsed columns, the two-dimentional
input data array directly, before they are interpreted into series
data and categories. Return false to stop completion, or call
this.complete() to continue async.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/parsed/">Modify data after parse</a>*/
	public HIFunction parsed;

/**
A callback function to parse string representations of dates into
JavaScript timestamps. Should return an integer timestamp on success.
*/
	public HIFunction parseDate;

/**
An array containing object with Point property names along with what
column id the property should be taken from.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/seriesmapping-label/">Label from data set</a>*/
	public ArrayList seriesMapping;

/**
The same as the columns input option, but defining rows intead of
columns.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/rows/">Data in rows</a>*/
	public ArrayList<ArrayList> rows;

/**
A URL to a remote CSV dataset.
Will be fetched when the chart is created using Ajax.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Categorized bar chart with CSV and live polling</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-csv">Time based line chart with CSV and live polling</a>*/
	public String csvURL;

/**
Which of the predefined date formats in Date.prototype.dateFormats
to use to parse date values. Defaults to a best guess based on what
format gives valid and ordered dates.

Valid options include:

*   YYYY/mm/dd
*   dd/mm/YYYY
*   mm/dd/YYYY
*   dd/mm/YY
*   mm/dd/YY
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/dateformat-auto/">Best guess date format</a> <br><br><b>accepted values:</b><br><br>&ensp;[undefined, "YYYY/mm/dd", "dd/mm/YYYY", "mm/dd/YYYY",
            "dd/mm/YYYY", "dd/mm/YY", "mm/dd/YY"]*/
	public String dateFormat;

/**
The Google Spreadsheet worksheet to use in combination with
googleSpreadsheetKey. The available id's from
your sheet can be read from https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>*/
	public String googleSpreadsheetWorksheet;

/**
Sets the refresh rate for data polling when importing remote dataset by
setting [data.csvURL](data.csvURL), [data.rowsURL](data.rowsURL),
[data.columnsURL](data.columnsURL), or
[data.googleSpreadsheetKey](data.googleSpreadsheetKey).

Note that polling must be enabled by setting
[data.enablePolling](data.enablePolling) to true.

The value is the number of seconds between pollings.
It cannot be set to less than 1 second.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/live-data">Live data with user set refresh rate</a> <br><br><b>default:</b><br><br>&ensp;1*/
	public Number dataRefreshRate;

/**
A URL to a remote JSON dataset, structured as a row array.
Will be fetched when the chart is created using Ajax.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-rows">Rows with live polling</a>*/
	public String rowsURL;

/**
In tabular input data, the first row (indexed by 0) to use.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public Number startRow;

/**
A comma delimited string to be parsed. Related options are [startRow](
#data.startRow), endRow, startColumn
and endColumn to delimit what part of the table
is used. The lineDelimiter and [itemDelimiter](
#data.itemDelimiter) options define the CSV delimiter formats.

The built-in CSV parser doesn't support all flavours of CSV, so in
some cases it may be necessary to use an external CSV parser. See
[this example](http://jsfiddle.net/highcharts/u59176h4/) of parsing
CSV through the MIT licensed [Papa Parse](http://papaparse.com/)
library.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/csv/">Data from CSV</a>*/
	public String csv;

/**
A two-dimensional array representing the input data on tabular form.
This input can be used when the data is already parsed, for example
from a grid view component. Each cell can be a string or number.
If not switchRowsAndColumns is set, the columns are interpreted as
series.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/columns/">Columns</a>*/
	public ArrayList<ArrayList> columns;

/**
In tabular input data, the last row (indexed by 0) to use. Defaults
to the last row containing data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>*/
	public Number endRow;

/**
Item or cell delimiter for parsing CSV. Defaults to the tab character
\t if a tab character is found in the CSV string, if not it defaults
to ,.

If this is set to false or undefined, the parser will attempt to deduce
the delimiter automatically.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Delimiters</a>*/
	public String itemDelimiter;

/**
The callback that is evaluated when the data is finished loading,
optionally from an external source, and parsed. The first argument
passed is a finished chart options object, containing the series.
These options can be extended with additional options and passed
directly to the chart constructor.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/complete/">Modify data on complete</a>*/
	public HIFunction complete;

/**
A callback function to modify the CSV before parsing it. Return the modified
string.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-ajax/">Modify CSV before parse</a>*/
	public HIFunction beforeParse;

/**
In tabular input data, the last column (indexed by 0) to use. Defaults
to the last column containing data.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Limited data</a>*/
	public Number endColumn;

/**
Whether to use the first row in the data set as series names.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/start-end/">Don't get series names from the CSV</a> <br><br><b>default:</b><br><br>&ensp;true*/
	public Boolean firstRowAsNames;

/**
The key for a Google Spreadsheet to load. See [general information
on GS](https://developers.google.com/gdata/samples/spreadsheet_sample).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/google-spreadsheet/">Load a Google Spreadsheet</a>*/
	public String googleSpreadsheetKey;

/**
Switch rows and columns of the input data, so that this.columns
effectively becomes the rows of the data set, and the rows are interpreted
as series.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/switchrowsandcolumns/">Switch rows and columns</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean switchRowsAndColumns;

/**
The decimal point used for parsing numbers in the CSV.

If both this and data.delimiter is set to false, the parser will
attempt to deduce the decimal point automatically.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/delimiters/">Comma as decimal point</a> <br><br><b>default:</b><br><br>&ensp;.*/
	public String decimalPoint;

/**
A URL to a remote JSON dataset, structured as a column array.
Will be fetched when the chart is created using Ajax.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/data/livedata-columns">Columns with live polling</a>*/
	public String columnsURL;

/**
The high value for each data point, signifying the highest value
in the sample set. The top whisker is drawn here.
*/
	public Number high;

/**
The lower quartile for each data point. This is the bottom of the
box.
*/
	public Number q1;

/**
The higher quartile for each data point. This is the top of the box.
*/
	public Number q3;

/**
The median for each data point. This is drawn as a line through the
middle area of the box.
*/
	public Number median;

/**
The low value for each data point, signifying the lowest value
in the sample set. The bottom whisker is drawn here.
*/
	public Number low;

/**
The rank for this point's data label in case of collision. If two
data labels are about to overlap, only the one with the highest labelrank
will be drawn.
*/
	public Number labelrank;

/**
A description of the point to add to the screen reader information
about the point. Requires the Accessibility module.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String definition;

/**
The name of the point as shown in the legend, tooltip, dataLabel
etc.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series/data-array-of-objects/">Point names</a>*/
	public String name;

/**
Individual color for the point. By default the color is pulled from
the global colors array.

In styled mode, the color option doesn't take effect. Instead, use
colorIndex.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/color/">Mark the highest point</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIColor color;

/**
Whether the data point is selected initially.
 <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean selected;

/**
Individual data label for each point. The options are the same as
the ones for [plotOptions.series.dataLabels](
#plotOptions.series.dataLabels).
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/">Show a label for the last value</a>*/
	public Object dataLabels;

/**
An additional, individual class name for the data point's graphic
representation.
*/
	public String className;

/**
Individual point events
*/
	public HIEvents events;

/**
The y value of the point.
 <br><br><b>default:</b><br><br>&ensp;null*/
	public Number y;

/**
The x value of the point. For datetime axes, the X value is the timestamp
in milliseconds since 1970.
*/
	public Number x;

/**
The id of a series in the drilldown.series
array to use for a drilldown for this point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/drilldown/basic/">Basic drilldown</a>*/
	public String drilldown;

/**
An id for the point. This can be used after render time to get a
pointer to the point object through chart.get().
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/id/">Remove an id'd point</a> <br><br><b>default:</b><br><br>&ensp;null*/
	public String id;

/**
A specific color index to use for the point, so its graphic representations
are given the class name highcharts-color-{n}. In styled mode this will
change the color of the graphic. In non-styled mode, the color by is set by
the fill attribute, so the change in class name won't have a visual effect
by default.
*/
	public Number colorIndex;

/**
The sequential index of the data point in the legend.
*/
	public Number legendIndex;
	public HIMarker marker;

/**
The length of the vector. The rendered length will relate to the
vectorLength setting.
*/
	public Number length;

/**
The vector direction in degrees, where 0 is north (pointing towards south).
*/
	public Number direction;

/**
The target value of a point.
*/
	public Number target;

/**
Individual target options for each point.
*/
	public HITargetOptions targetOptions;

/**
The color of the border surrounding the column or bar.

In styled mode, the border stroke can be set with the .highcharts-point
rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public HIColor borderColor;

/**
The width of the border surrounding the column or bar.

In styled mode, the stroke width can be set with the .highcharts-point
rule.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderwidth/">2px black border</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number borderWidth;

/**
The value of the point, resulting in a color controled by options
as set in the colorAxis configuration.
*/
	public Number value;

/**
Point padding for a single point.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/tilemap-pointpadding">Point padding on tiles</a>*/
	public Number pointPadding;

/**
When this property is true, the points acts as a summary column for
the values added or substracted since the last intermediate sum,
or since the start of the series. The y value is ignored.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean isIntermediateSum;

/**
When this property is true, the point display the total sum across
the entire series. The y value is ignored.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean isSum;

/**
Whether to display a slice offset from the center.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/sliced/">One sliced point</a>*/
	public Boolean sliced;

/**
The inner radius of an individual point in a solid gauge. Can be
given as a number (pixels) or percentage string.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/">Individual radius and innerRadius</a>*/
	public Object /* Number|String */ innerRadius;

/**
The outer radius of an individual point in a solid gauge. Can be
given as a number (pixels) or percentage string.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/solidgauge-radius/">Individual radius and innerRadius</a>*/
	public Object /* Number|String */ radius;

/**
The node that the link runs to.
*/
	public String to;

/**
Whether the link goes out of the system.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey chart with outgoing links</a> <br><br><b>default:</b><br><br>&ensp;false*/
	public Boolean outgoing;

/**
The node that the link runs from.
*/
	public String from;

/**
The weight of the link.
*/
	public Number weight;

/**
The size value for each bubble. The bubbles' diameters are computed
based on the z, and controlled by series options like minSize,
maxSize, sizeBy, zMin and zMax.
*/
	public Number z;

/**
Serves a purpose only if a colorAxis object is defined in the chart
options. This value will decide which color the point gets from the
scale of the colorAxis.
 <br><br><b>default:</b><br><br>&ensp;undefined*/
	public Number colorValue;

/**
Only for treemap. Use this option to build a tree structure. The
value should be the id of the point which is the parent. If no points
has a matching id, or this option is undefined, then the parent will
be set to the root.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/point/parent/">Point parent</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-with-levels/">Example where parent id is not matching</a> <br><br><b>default:</b><br><br>&ensp;undefined*/
	public String parent;


	public HIData() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.enablePolling != null) {
			params.put("enablePolling", this.enablePolling);
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
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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
		if (this.googleSpreadsheetWorksheet != null) {
			params.put("googleSpreadsheetWorksheet", this.googleSpreadsheetWorksheet);
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
				if (obj instanceof HIChartsJSONSerializable) {
					array.add(((HIChartsJSONSerializable) obj).getParams());
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
		if (this.googleSpreadsheetKey != null) {
			params.put("googleSpreadsheetKey", this.googleSpreadsheetKey);
		}
		if (this.switchRowsAndColumns != null) {
			params.put("switchRowsAndColumns", this.switchRowsAndColumns);
		}
		if (this.decimalPoint != null) {
			params.put("decimalPoint", this.decimalPoint);
		}
		if (this.columnsURL != null) {
			params.put("columnsURL", this.columnsURL);
		}
		if (this.high != null) {
			params.put("high", this.high);
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
		if (this.low != null) {
			params.put("low", this.low);
		}
		if (this.labelrank != null) {
			params.put("labelrank", this.labelrank);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
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
		if (this.dataLabels != null) {
			params.put("dataLabels", this.dataLabels);
		}
		if (this.className != null) {
			params.put("className", this.className);
		}
		if (this.events != null) {
			params.put("events", this.events.getParams());
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.drilldown != null) {
			params.put("drilldown", this.drilldown);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.colorIndex != null) {
			params.put("colorIndex", this.colorIndex);
		}
		if (this.legendIndex != null) {
			params.put("legendIndex", this.legendIndex);
		}
		if (this.marker != null) {
			params.put("marker", this.marker.getParams());
		}
		if (this.length != null) {
			params.put("length", this.length);
		}
		if (this.direction != null) {
			params.put("direction", this.direction);
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
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.value != null) {
			params.put("value", this.value);
		}
		if (this.pointPadding != null) {
			params.put("pointPadding", this.pointPadding);
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
		if (this.innerRadius != null) {
			params.put("innerRadius", this.innerRadius);
		}
		if (this.radius != null) {
			params.put("radius", this.radius);
		}
		if (this.to != null) {
			params.put("to", this.to);
		}
		if (this.outgoing != null) {
			params.put("outgoing", this.outgoing);
		}
		if (this.from != null) {
			params.put("from", this.from);
		}
		if (this.weight != null) {
			params.put("weight", this.weight);
		}
		if (this.z != null) {
			params.put("z", this.z);
		}
		if (this.colorValue != null) {
			params.put("colorValue", this.colorValue);
		}
		if (this.parent != null) {
			params.put("parent", this.parent);
		}
		return params;
	}

}
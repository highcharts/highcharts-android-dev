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



public class HIPlotOptions implements HIChartsJSONSerializable { 


/**
A tilemap series is a type of heatmap where the tile shapes are configurable.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all tilemap series are defined in [plotOptions.tilemap](plotOptions.tilemap).
3. Options for one single series are given in
[the series instance array](series.tilemap).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        tilemap: {
            // shared options for all tilemap series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'tilemap'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/honeycomb-usa/">Honeycomb tilemap, USA</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-brazil/">Honeycomb tilemap, Brazil</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-china/">Honeycomb tilemap, China</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-europe/">Honeycomb tilemap, Europe</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa/">Circlemap tilemap, Africa</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamondmap tilemap</a>*/
	public HITilemap tilemap;

/**
A bell curve is an areaspline series which represents the probability density
function of the normal distribution. It calculates mean and standard
deviation of the base series data and plots the curve according to the
calculated parameters.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all bellcurve series are defined in [plotOptions.bellcurve](plotOptions.bellcurve).
3. Options for one single series are given in
[the series instance array](series.bellcurve).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        bellcurve: {
            // shared options for all bellcurve series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'bellcurve'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bellcurve/">Bell curve</a>*/
	public HIBellcurve bellcurve;

/**
A pyramid series is a special type of funnel, without neck and reversed by
default.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all pyramid series are defined in [plotOptions.pyramid](plotOptions.pyramid).
3. Options for one single series are given in
[the series instance array](series.pyramid).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        pyramid: {
            // shared options for all pyramid series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'pyramid'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/">Pyramid chart</a>*/
	public HIPyramid pyramid;

/**
The column range is a cartesian series type with higher and lower
Y values along an X axis. Requires highcharts-more.js. To display
horizontal bars, set chart.inverted to true.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all columnrange series are defined in [plotOptions.columnrange](plotOptions.columnrange).
3. Options for one single series are given in
[the series instance array](series.columnrange).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        columnrange: {
            // shared options for all columnrange series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'columnrange'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/">Inverted column range</a>*/
	public HIColumnrange columnrange;

/**
A bubble series is a three dimensional series type where each point renders
an X, Y and Z value. Each points is drawn as a bubble where the position
along the X and Y axes mark the X and Y values, and the size of the bubble
relates to the Z value. Requires highcharts-more.js.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all bubble series are defined in [plotOptions.bubble](plotOptions.bubble).
3. Options for one single series are given in
[the series instance array](series.bubble).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        bubble: {
            // shared options for all bubble series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'bubble'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bubble/">Bubble chart</a>*/
	public HIBubble bubble;

/**
Error bars are a graphical representation of the variability of data and are
used on graphs to indicate the error, or uncertainty in a reported
measurement.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all errorbar series are defined in [plotOptions.errorbar](plotOptions.errorbar).
3. Options for one single series are given in
[the series instance array](series.errorbar).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        errorbar: {
            // shared options for all errorbar series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'errorbar'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/error-bar/">Error bars</a>*/
	public HIErrorbar errorbar;

/**
A pie chart is a circular graphic which is divided into slices to illustrate
numerical proportion.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all pie series are defined in [plotOptions.pie](plotOptions.pie).
3. Options for one single series are given in
[the series instance array](series.pie).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        pie: {
            // shared options for all pie series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'pie'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/">Pie chart</a>*/
	public HIPie pie;

/**
Gauges are circular plots displaying one or more values with a dial pointing
to values along the perimeter.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all gauge series are defined in [plotOptions.gauge](plotOptions.gauge).
3. Options for one single series are given in
[the series instance array](series.gauge).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        gauge: {
            // shared options for all gauge series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'gauge'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Gauge chart</a>*/
	public HIGauge gauge;

/**
A pareto diagram is a type of chart that contains both bars and a line graph,
where individual values are represented in descending order by bars,
and the cumulative total is represented by the line.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all pareto series are defined in [plotOptions.pareto](plotOptions.pareto).
3. Options for one single series are given in
[the series instance array](series.pareto).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        pareto: {
            // shared options for all pareto series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'pareto'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pareto/">Pareto diagram</a>*/
	public HIPareto pareto;

/**
A spline series is a special type of line series, where the segments between
the data points are smoothed.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all spline series are defined in [plotOptions.spline](plotOptions.spline).
3. Options for one single series are given in
[the series instance array](series.spline).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        spline: {
            // shared options for all spline series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'spline'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/spline-irregular-time/">Spline chart</a>*/
	public HISpline spline;

/**
The area spline series is an area series where the graph between the points
is smoothed into a spline.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all areaspline series are defined in [plotOptions.areaspline](plotOptions.areaspline).
3. Options for one single series are given in
[the series instance array](series.areaspline).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        areaspline: {
            // shared options for all areaspline series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'areaspline'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/areaspline/">Area spline chart</a>*/
	public HIAreaspline areaspline;

/**
A polygon series can be used to draw any freeform shape in the cartesian
coordinate system. A fill is applied with the color option, and
stroke is applied through lineWidth and lineColor options. Requires
the highcharts-more.js file.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all polygon series are defined in [plotOptions.polygon](plotOptions.polygon).
3. Options for one single series are given in
[the series instance array](series.polygon).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        polygon: {
            // shared options for all polygon series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'polygon'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>*/
	public HIPolygon polygon;

/**
A streamgraph is a type of stacked area graph which is displaced around a
central axis, resulting in a flowing, organic shape.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all streamgraph series are defined in [plotOptions.streamgraph](plotOptions.streamgraph).
3. Options for one single series are given in
[the series instance array](series.streamgraph).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        streamgraph: {
            // shared options for all streamgraph series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'streamgraph'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph/">Streamgraph</a>*/
	public HIStreamgraph streamgraph;

/**
The X-range series displays ranges on the X axis, typically time intervals
with a start and end date.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all xrange series are defined in [plotOptions.xrange](plotOptions.xrange).
3. Options for one single series are given in
[the series instance array](series.xrange).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        xrange: {
            // shared options for all xrange series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'xrange'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range/">X-range</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/x-range/">Styled mode X-range</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted-xrange/">Inverted X-range</a>*/
	public HIXrange xrange;

/**
A vector plot is a type of cartesian chart where each point has an X and Y
position, a length and a direction. Vectors are drawn as arrows.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all vector series are defined in [plotOptions.vector](plotOptions.vector).
3. Options for one single series are given in
[the series instance array](series.vector).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        vector: {
            // shared options for all vector series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'vector'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/vector-plot/">Vector pot</a>*/
	public HIVector vector;

/**
General options for all series types.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all line series are defined in [plotOptions.line](plotOptions.line).
3. Options for one single series are given in
[the series instance array](series.line).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        line: {
            // shared options for all line series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'line'
    }]
});

*/
	public HISeries series;

/**
A Sunburst displays hierarchical data, where a level in the hierarchy is
represented by a circle. The center represents the root node of the tree.
The visualization bears a resemblance to both treemap and pie charts.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all sunburst series are defined in [plotOptions.sunburst](plotOptions.sunburst).
3. Options for one single series are given in
[the series instance array](series.sunburst).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        sunburst: {
            // shared options for all sunburst series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'sunburst'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>*/
	public HISunburst sunburst;

/**
A box plot is a convenient way of depicting groups of data through their
five-number summaries: the smallest observation (sample minimum), lower
quartile (Q1), median (Q2), upper quartile (Q3), and largest observation
(sample maximum).

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all boxplot series are defined in [plotOptions.boxplot](plotOptions.boxplot).
3. Options for one single series are given in
[the series instance array](series.boxplot).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        boxplot: {
            // shared options for all boxplot series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'boxplot'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/box-plot/">Box plot</a>*/
	public HIBoxplot boxplot;

/**
A 3D scatter plot uses x, y and z coordinates to display values for three
variables for a set of data.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all scatter3d series are defined in [plotOptions.scatter3d](plotOptions.scatter3d).
3. Options for one single series are given in
[the series instance array](series.scatter3d).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        scatter3d: {
            // shared options for all scatter3d series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'scatter3d'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter/">Simple 3D scatter</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-scatter-draggable">Draggable 3d scatter</a>*/
	public HIScatter3d scatter3d;

/**
A heatmap is a graphical representation of data where the individual values
contained in a matrix are represented as colors.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all heatmap series are defined in [plotOptions.heatmap](plotOptions.heatmap).
3. Options for one single series are given in
[the series instance array](series.heatmap).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        heatmap: {
            // shared options for all heatmap series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'heatmap'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/">Simple heatmap</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/">Heavy heatmap</a>*/
	public HIHeatmap heatmap;

/**
A solid gauge is a circular gauge where the value is indicated by a filled
arc, and the color of the arc may variate with the value.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all solidgauge series are defined in [plotOptions.solidgauge](plotOptions.solidgauge).
3. Options for one single series are given in
[the series instance array](series.solidgauge).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        solidgauge: {
            // shared options for all solidgauge series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'solidgauge'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">Solid gauges</a>*/
	public HISolidgauge solidgauge;

/**
Funnel charts are a type of chart often used to visualize stages in a sales
project, where the top are the initial stages with the most clients.
It requires that the modules/funnel.js file is loaded.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all funnel series are defined in [plotOptions.funnel](plotOptions.funnel).
3. Options for one single series are given in
[the series instance array](series.funnel).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        funnel: {
            // shared options for all funnel series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'funnel'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>*/
	public HIFunnel funnel;

/**
A histogram is a column series which represents the distribution of the data
set in the base series. Histogram splits data into bins and shows their
frequencies.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all histogram series are defined in [plotOptions.histogram](plotOptions.histogram).
3. Options for one single series are given in
[the series instance array](series.histogram).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        histogram: {
            // shared options for all histogram series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'histogram'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/histogram/">Histogram</a>*/
	public HIHistogram histogram;

/**
A waterfall chart displays sequentially introduced positive or negative
values in cumulative columns.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all waterfall series are defined in [plotOptions.waterfall](plotOptions.waterfall).
3. Options for one single series are given in
[the series instance array](series.waterfall).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        waterfall: {
            // shared options for all waterfall series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'waterfall'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-stacked/">Stacked waterfall chart</a>*/
	public HIWaterfall waterfall;

/**
A bar series is a special type of column series where the columns are
horizontal.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all bar series are defined in [plotOptions.bar](plotOptions.bar).
3. Options for one single series are given in
[the series instance array](series.bar).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        bar: {
            // shared options for all bar series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'bar'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bar-basic/">Bar chart</a>*/
	public HIBar bar;

/**
A line series displays information as a series of data points connected by
straight line segments.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all line series are defined in [plotOptions.line](plotOptions.line).
3. Options for one single series are given in
[the series instance array](series.line).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        line: {
            // shared options for all line series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'line'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-basic/">Line chart</a>*/
	public HILine line;

/**
Wind barbs are a convenient way to represent wind speed and direction in one
graphical form. Wind direction is given by the stem direction, and wind speed
by the number and shape of barbs.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all windbarb series are defined in [plotOptions.windbarb](plotOptions.windbarb).
3. Options for one single series are given in
[the series instance array](series.windbarb).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        windbarb: {
            // shared options for all windbarb series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'windbarb'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/windbarb-series/">Wind barb series</a>*/
	public HIWindbarb windbarb;

/**
A variwide chart (related to marimekko chart) is a column chart with a
variable width expressing a third dimension.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all variwide series are defined in [plotOptions.variwide](plotOptions.variwide).
3. Options for one single series are given in
[the series instance array](series.variwide).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        variwide: {
            // shared options for all variwide series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'variwide'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variwide/">Variwide chart</a>*/
	public HIVariwide variwide;

/**
A bullet graph is a variation of a bar graph. The bullet graph features
a single measure, compares it to a target, and displays it in the context
of qualitative ranges of performance that could be set using
plotBands on yAxis.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all bullet series are defined in [plotOptions.bullet](plotOptions.bullet).
3. Options for one single series are given in
[the series instance array](series.bullet).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        bullet: {
            // shared options for all bullet series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'bullet'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bullet-graph/">Bullet graph</a>*/
	public HIBullet bullet;

/**
Column series display one column per value along an X axis.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all column series are defined in [plotOptions.column](plotOptions.column).
3. Options for one single series are given in
[the series instance array](series.column).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        column: {
            // shared options for all column series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'column'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-basic/">Column chart</a>*/
	public HIColumn column;

/**
The area series type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all area series are defined in [plotOptions.area](plotOptions.area).
3. Options for one single series are given in
[the series instance array](series.area).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        area: {
            // shared options for all area series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'area'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/area-basic/">Area chart</a>*/
	public HIArea area;

/**
A treemap displays hierarchical data using nested rectangles. The data can be
laid out in varying ways depending on options.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all treemap series are defined in [plotOptions.treemap](plotOptions.treemap).
3. Options for one single series are given in
[the series instance array](series.treemap).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        treemap: {
            // shared options for all treemap series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'treemap'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-large-dataset/">Treemap</a>*/
	public HITreemap treemap;

/**
The area spline range is a cartesian series type with higher and
lower Y values along an X axis. The area inside the range is colored, and
the graph outlining the area is a smoothed spline. Requires
highcharts-more.js.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all areasplinerange series are defined in [plotOptions.areasplinerange](plotOptions.areasplinerange).
3. Options for one single series are given in
[the series instance array](series.areasplinerange).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        areasplinerange: {
            // shared options for all areasplinerange series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'areasplinerange'
    }]
});

*/
	public HIAreasplinerange areasplinerange;

/**
A word cloud is a visualization of a set of words, where the size and
placement of a word is determined by how it is weighted.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all wordcloud series are defined in [plotOptions.wordcloud](plotOptions.wordcloud).
3. Options for one single series are given in
[the series instance array](series.wordcloud).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        wordcloud: {
            // shared options for all wordcloud series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'wordcloud'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud">Word Cloud chart</a>*/
	public HIWordcloud wordcloud;

/**
The area range series is a carteseian series with higher and lower values
for each point along an X axis, where the area between the values is shaded.
Requires highcharts-more.js.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all arearange series are defined in [plotOptions.arearange](plotOptions.arearange).
3. Options for one single series are given in
[the series instance array](series.arearange).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        arearange: {
            // shared options for all arearange series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'arearange'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/">Area range chart</a>*/
	public HIArearange arearange;

/**
A variable pie series is a two dimensional series type, where each point
renders an Y and Z value.  Each point is drawn as a pie slice where the
size (arc) of the slice relates to the Y value and the radius of pie
slice relates to the Z value. Requires highcharts-more.js.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all variablepie series are defined in [plotOptions.variablepie](plotOptions.variablepie).
3. Options for one single series are given in
[the series instance array](series.variablepie).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        variablepie: {
            // shared options for all variablepie series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'variablepie'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variable-radius-pie/">Variable-radius pie chart</a>*/
	public HIVariablepie variablepie;

/**
A scatter plot uses cartesian coordinates to display values for two variables
for a set of data.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all scatter series are defined in [plotOptions.scatter](plotOptions.scatter).
3. Options for one single series are given in
[the series instance array](series.scatter).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        scatter: {
            // shared options for all scatter series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'scatter'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/scatter/">Scatter plot</a>*/
	public HIScatter scatter;

/**
A sankey diagram is a type of flow diagram, in which the width of the
link between two nodes is shown proportionally to the flow quantity.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the [plotOptions.series](plotOptions.series)
object. 
2. Options for all sankey series are defined in [plotOptions.sankey](plotOptions.sankey).
3. Options for one single series are given in
[the series instance array](series.sankey).


Highcharts.chart('container', {
    plotOptions: {
        series: {
            // general options for all series
        },
        sankey: {
            // shared options for all sankey series
        }
    },
    series: [{
        // specific options for this series instance
        type: 'sankey'
    }]
});

            
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sankey-diagram/">Sankey diagram</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-inverted/">Inverted sankey diagram</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey diagram with outgoing links</a>*/
	public HISankey sankey;


	public HIPlotOptions() {

	}

	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
		if (this.tilemap != null) {
			params.put("tilemap", this.tilemap.getParams());
		}
		if (this.bellcurve != null) {
			params.put("bellcurve", this.bellcurve.getParams());
		}
		if (this.pyramid != null) {
			params.put("pyramid", this.pyramid.getParams());
		}
		if (this.columnrange != null) {
			params.put("columnrange", this.columnrange.getParams());
		}
		if (this.bubble != null) {
			params.put("bubble", this.bubble.getParams());
		}
		if (this.errorbar != null) {
			params.put("errorbar", this.errorbar.getParams());
		}
		if (this.pie != null) {
			params.put("pie", this.pie.getParams());
		}
		if (this.gauge != null) {
			params.put("gauge", this.gauge.getParams());
		}
		if (this.pareto != null) {
			params.put("pareto", this.pareto.getParams());
		}
		if (this.spline != null) {
			params.put("spline", this.spline.getParams());
		}
		if (this.areaspline != null) {
			params.put("areaspline", this.areaspline.getParams());
		}
		if (this.polygon != null) {
			params.put("polygon", this.polygon.getParams());
		}
		if (this.streamgraph != null) {
			params.put("streamgraph", this.streamgraph.getParams());
		}
		if (this.xrange != null) {
			params.put("xrange", this.xrange.getParams());
		}
		if (this.vector != null) {
			params.put("vector", this.vector.getParams());
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.sunburst != null) {
			params.put("sunburst", this.sunburst.getParams());
		}
		if (this.boxplot != null) {
			params.put("boxplot", this.boxplot.getParams());
		}
		if (this.scatter3d != null) {
			params.put("scatter3d", this.scatter3d.getParams());
		}
		if (this.heatmap != null) {
			params.put("heatmap", this.heatmap.getParams());
		}
		if (this.solidgauge != null) {
			params.put("solidgauge", this.solidgauge.getParams());
		}
		if (this.funnel != null) {
			params.put("funnel", this.funnel.getParams());
		}
		if (this.histogram != null) {
			params.put("histogram", this.histogram.getParams());
		}
		if (this.waterfall != null) {
			params.put("waterfall", this.waterfall.getParams());
		}
		if (this.bar != null) {
			params.put("bar", this.bar.getParams());
		}
		if (this.line != null) {
			params.put("line", this.line.getParams());
		}
		if (this.windbarb != null) {
			params.put("windbarb", this.windbarb.getParams());
		}
		if (this.variwide != null) {
			params.put("variwide", this.variwide.getParams());
		}
		if (this.bullet != null) {
			params.put("bullet", this.bullet.getParams());
		}
		if (this.column != null) {
			params.put("column", this.column.getParams());
		}
		if (this.area != null) {
			params.put("area", this.area.getParams());
		}
		if (this.treemap != null) {
			params.put("treemap", this.treemap.getParams());
		}
		if (this.areasplinerange != null) {
			params.put("areasplinerange", this.areasplinerange.getParams());
		}
		if (this.wordcloud != null) {
			params.put("wordcloud", this.wordcloud.getParams());
		}
		if (this.arearange != null) {
			params.put("arearange", this.arearange.getParams());
		}
		if (this.variablepie != null) {
			params.put("variablepie", this.variablepie.getParams());
		}
		if (this.scatter != null) {
			params.put("scatter", this.scatter.getParams());
		}
		if (this.sankey != null) {
			params.put("sankey", this.sankey.getParams());
		}
		return params;
	}

}
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
import java.util.Observable;
import java.util.Observer;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIChartsJSONSerializable;





public class HIPlotOptions extends Observable implements HIChartsJSONSerializable { 

	private HIXrange xrange;
/**
/** The X-range series displays ranges on the X axis, typically time intervals with a start and end date. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all xrange series are defined in  `plotOptions.xrange`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     xrange: {       // shared options for all xrange series     }   },   series: [{     // specific options for this series instance     type: 'xrange'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/x-range/">X-range</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/x-range/">Styled mode X-range</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/inverted-xrange/">Inverted X-range</a>
*/
	public void setXrange(HIXrange xrange) {
		this.xrange = xrange;
		this.xrange.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIXrange getXrange(){ return xrange; }

	private HIBellcurve bellcurve;
/**
/** A bell curve is an areaspline series which represents the probability density function of the normal distribution. It calculates mean and standard deviation of the base series data and plots the curve according to the calculated parameters. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bellcurve series are defined in  `plotOptions.bellcurve`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bellcurve: {       // shared options for all bellcurve series     }   },   series: [{     // specific options for this series instance     type: 'bellcurve'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bellcurve/">Bell curve</a>
*/
	public void setBellcurve(HIBellcurve bellcurve) {
		this.bellcurve = bellcurve;
		this.bellcurve.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBellcurve getBellcurve(){ return bellcurve; }

	private HIPyramid pyramid;
/**
/** A pyramid series is a special type of funnel, without neck and reversed by defaults. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all pyramid series are defined in  `plotOptions.pyramid`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pyramid: {       // shared options for all pyramid series     }   },   series: [{     // specific options for this series instance     type: 'pyramid'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pyramid/">Pyramid chart</a>
*/
	public void setPyramid(HIPyramid pyramid) {
		this.pyramid = pyramid;
		this.pyramid.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPyramid getPyramid(){ return pyramid; }

	private HIColumnrange columnrange;
/**
/** The column range is a cartesian series type with higher and lower Y values along an X axis. Requires highcharts-more.js. To display horizontal bars, set chart.inverted to true. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all columnrange series are defined in  `plotOptions.columnrange`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     columnrange: {       // shared options for all columnrange series     }   },   series: [{     // specific options for this series instance     type: 'columnrange'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/columnrange/">Inverted column range</a>
*/
	public void setColumnrange(HIColumnrange columnrange) {
		this.columnrange = columnrange;
		this.columnrange.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIColumnrange getColumnrange(){ return columnrange; }

	private HIBubble bubble;
/**
/** A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value. Requires highcharts-more.js. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bubble series are defined in  `plotOptions.bubble`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bubble: {       // shared options for all bubble series     }   },   series: [{     // specific options for this series instance     type: 'bubble'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bubble/">Bubble chart</a>
*/
	public void setBubble(HIBubble bubble) {
		this.bubble = bubble;
		this.bubble.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBubble getBubble(){ return bubble; }

	private HIErrorbar errorbar;
/**
/** Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or uncertainty in a reported measurement. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all errorbar series are defined in  `plotOptions.errorbar`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     errorbar: {       // shared options for all errorbar series     }   },   series: [{     // specific options for this series instance     type: 'errorbar'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/error-bar/">Error bars on a column series</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-errorbar/on-scatter/">Error bars on a scatter series</a>
*/
	public void setErrorbar(HIErrorbar errorbar) {
		this.errorbar = errorbar;
		this.errorbar.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIErrorbar getErrorbar(){ return errorbar; }

	private HIPie pie;
/**
/** A pie chart is a circular graphic which is divided into slices to illustrate numerical proportion. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all pie series are defined in  `plotOptions.pie`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pie: {       // shared options for all pie series     }   },   series: [{     // specific options for this series instance     type: 'pie'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-basic/">Pie chart</a>
*/
	public void setPie(HIPie pie) {
		this.pie = pie;
		this.pie.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPie getPie(){ return pie; }

	private HIGauge gauge;
/**
/** Gauges are circular plots displaying one or more values with a dial pointing to values along the perimeter. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all gauge series are defined in  `plotOptions.gauge`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     gauge: {       // shared options for all gauge series     }   },   series: [{     // specific options for this series instance     type: 'gauge'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Gauge chart</a>
*/
	public void setGauge(HIGauge gauge) {
		this.gauge = gauge;
		this.gauge.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIGauge getGauge(){ return gauge; }

	private HIPareto pareto;
/**
/** A pareto diagram is a type of chart that contains both bars and a line graph, where individual values are represented in descending order by bars, and the cumulative total is represented by the line. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all pareto series are defined in  `plotOptions.pareto`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     pareto: {       // shared options for all pareto series     }   },   series: [{     // specific options for this series instance     type: 'pareto'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pareto/">Pareto diagram</a>
*/
	public void setPareto(HIPareto pareto) {
		this.pareto = pareto;
		this.pareto.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPareto getPareto(){ return pareto; }

	private HISpline spline;
/**
/** A spline series is a special type of line series, where the segments between the data points are smoothed. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all spline series are defined in  `plotOptions.spline`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     spline: {       // shared options for all spline series     }   },   series: [{     // specific options for this series instance     type: 'spline'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/spline-irregular-time/">Spline chart</a>
*/
	public void setSpline(HISpline spline) {
		this.spline = spline;
		this.spline.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISpline getSpline(){ return spline; }

	private HIAreaspline areaspline;
/**
/** The area spline series is an area series where the graph between the points is smoothed into a spline. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all areaspline series are defined in  `plotOptions.areaspline`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     areaspline: {       // shared options for all areaspline series     }   },   series: [{     // specific options for this series instance     type: 'areaspline'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/areaspline/">Area spline chart</a>
*/
	public void setAreaspline(HIAreaspline areaspline) {
		this.areaspline = areaspline;
		this.areaspline.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAreaspline getAreaspline(){ return areaspline; }

	private HIPolygon polygon;
/**
/** A polygon series can be used to draw any freeform shape in the cartesian coordinate system. A fill is applied with the color option, and stroke is applied through lineWidth and lineColor options. Requires the highcharts-more.js file. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all polygon series are defined in  `plotOptions.polygon`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     polygon: {       // shared options for all polygon series     }   },   series: [{     // specific options for this series instance     type: 'polygon'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/polygon/">Polygon</a>
*/
	public void setPolygon(HIPolygon polygon) {
		this.polygon = polygon;
		this.polygon.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPolygon getPolygon(){ return polygon; }

	private HIStreamgraph streamgraph;
/**
/** A streamgraph is a type of stacked area graph which is displaced around a central axis, resulting in a flowing, organic shape. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all streamgraph series are defined in  `plotOptions.streamgraph`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     streamgraph: {       // shared options for all streamgraph series     }   },   series: [{     // specific options for this series instance     type: 'streamgraph'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/streamgraph/">Streamgraph</a>
*/
	public void setStreamgraph(HIStreamgraph streamgraph) {
		this.streamgraph = streamgraph;
		this.streamgraph.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStreamgraph getStreamgraph(){ return streamgraph; }

	private HITilemap tilemap;
/**
/** A tilemap series is a type of heatmap where the tile shapes are configurable. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all tilemap series are defined in  `plotOptions.tilemap`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     tilemap: {       // shared options for all tilemap series     }   },   series: [{     // specific options for this series instance     type: 'tilemap'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/honeycomb-usa/">Honeycomb tilemap, USA</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-brazil/">Honeycomb tilemap, Brazil</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-china/">Honeycomb tilemap, China</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/honeycomb-europe/">Honeycomb tilemap, Europe</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/circlemap-africa/">Circlemap tilemap, Africa</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/diamondmap">Diamondmap tilemap</a>
*/
	public void setTilemap(HITilemap tilemap) {
		this.tilemap = tilemap;
		this.tilemap.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITilemap getTilemap(){ return tilemap; }

	private HIVector vector;
/**
/** A vector plot is a type of cartesian chart where each point has an X and Y position, a length and a direction. Vectors are drawn as arrows. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all vector series are defined in  `plotOptions.vector`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     vector: {       // shared options for all vector series     }   },   series: [{     // specific options for this series instance     type: 'vector'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/vector-plot/">Vector pot</a>
*/
	public void setVector(HIVector vector) {
		this.vector = vector;
		this.vector.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIVector getVector(){ return vector; }

	private HISeries series;
/**
/** General options for all series types. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all line series are defined in  `plotOptions.line`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     line: {       // shared options for all line series     }   },   series: [{     // specific options for this series instance     type: 'line'   }] });  
*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.series.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private HISunburst sunburst;
/**
/** A Sunburst displays hierarchical data, where a level in the hierarchy is represented by a circle. The center represents the root node of the tree. The visualization bears a resemblance to both treemap and pie charts. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all sunburst series are defined in  `plotOptions.sunburst`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     sunburst: {       // shared options for all sunburst series     }   },   series: [{     // specific options for this series instance     type: 'sunburst'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
*/
	public void setSunburst(HISunburst sunburst) {
		this.sunburst = sunburst;
		this.sunburst.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISunburst getSunburst(){ return sunburst; }

	private HIBoxplot boxplot;
/**
/** A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample maximum). Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all boxplot series are defined in  `plotOptions.boxplot`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     boxplot: {       // shared options for all boxplot series     }   },   series: [{     // specific options for this series instance     type: 'boxplot'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/box-plot/">Box plot</a>
*/
	public void setBoxplot(HIBoxplot boxplot) {
		this.boxplot = boxplot;
		this.boxplot.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBoxplot getBoxplot(){ return boxplot; }

	private HIScatter3d scatter3d;
/**
/** A 3D scatter plot uses x, y and z coordinates to display values for three variables for a set of data. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all scatter3d series are defined in  `plotOptions.scatter3d`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     scatter3d: {       // shared options for all scatter3d series     }   },   series: [{     // specific options for this series instance     type: 'scatter3d'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/3d/scatter/">Simple 3D scatter</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/3d-scatter-draggable">Draggable 3d scatter</a>
*/
	public void setScatter3d(HIScatter3d scatter3d) {
		this.scatter3d = scatter3d;
		this.scatter3d.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIScatter3d getScatter3d(){ return scatter3d; }

	private HIHeatmap heatmap;
/**
/** A heatmap is a graphical representation of data where the individual values contained in a matrix are represented as colors. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all heatmap series are defined in  `plotOptions.heatmap`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     heatmap: {       // shared options for all heatmap series     }   },   series: [{     // specific options for this series instance     type: 'heatmap'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/">Simple heatmap</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/">Heavy heatmap</a>
*/
	public void setHeatmap(HIHeatmap heatmap) {
		this.heatmap = heatmap;
		this.heatmap.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHeatmap getHeatmap(){ return heatmap; }

	private HISolidgauge solidgauge;
/**
/** A solid gauge is a circular gauge where the value is indicated by a filled arc, and the color of the arc may variate with the value. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all solidgauge series are defined in  `plotOptions.solidgauge`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     solidgauge: {       // shared options for all solidgauge series     }   },   series: [{     // specific options for this series instance     type: 'solidgauge'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-solid/">Solid gauges</a>
*/
	public void setSolidgauge(HISolidgauge solidgauge) {
		this.solidgauge = solidgauge;
		this.solidgauge.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISolidgauge getSolidgauge(){ return solidgauge; }

	private HIFunnel funnel;
/**
/** Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial stages with the most clients. It requires that the modules/funnel.js file is loaded. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all funnel series are defined in  `plotOptions.funnel`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     funnel: {       // shared options for all funnel series     }   },   series: [{     // specific options for this series instance     type: 'funnel'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/funnel/">Funnel demo</a>
*/
	public void setFunnel(HIFunnel funnel) {
		this.funnel = funnel;
		this.funnel.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIFunnel getFunnel(){ return funnel; }

	private HIHistogram histogram;
/**
/** A histogram is a column series which represents the distribution of the data set in the base series. Histogram splits data into bins and shows their frequencies. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all histogram series are defined in  `plotOptions.histogram`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     histogram: {       // shared options for all histogram series     }   },   series: [{     // specific options for this series instance     type: 'histogram'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/histogram/">Histogram</a>
*/
	public void setHistogram(HIHistogram histogram) {
		this.histogram = histogram;
		this.histogram.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIHistogram getHistogram(){ return histogram; }

	private HIWaterfall waterfall;
/**
/** A waterfall chart displays sequentially introduced positive or negative values in cumulative columns. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all waterfall series are defined in  `plotOptions.waterfall`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     waterfall: {       // shared options for all waterfall series     }   },   series: [{     // specific options for this series instance     type: 'waterfall'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/waterfall/">Waterfall chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-inverted/">Horizontal (inverted) waterfall</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/waterfall-stacked/">Stacked waterfall chart</a>
*/
	public void setWaterfall(HIWaterfall waterfall) {
		this.waterfall = waterfall;
		this.waterfall.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIWaterfall getWaterfall(){ return waterfall; }

	private HIBar bar;
/**
/** A bar series is a special type of column series where the columns are horizontal. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bar series are defined in  `plotOptions.bar`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bar: {       // shared options for all bar series     }   },   series: [{     // specific options for this series instance     type: 'bar'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bar-basic/">Bar chart</a>
*/
	public void setBar(HIBar bar) {
		this.bar = bar;
		this.bar.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBar getBar(){ return bar; }

	private HILine line;
/**
/** A line series displays information as a series of data points connected by straight line segments. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all line series are defined in  `plotOptions.line`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     line: {       // shared options for all line series     }   },   series: [{     // specific options for this series instance     type: 'line'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/line-basic/">Line chart</a>
*/
	public void setLine(HILine line) {
		this.line = line;
		this.line.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILine getLine(){ return line; }

	private HIWindbarb windbarb;
/**
/** Wind barbs are a convenient way to represent wind speed and direction in one graphical form. Wind direction is given by the stem direction, and wind speed by the number and shape of barbs. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all windbarb series are defined in  `plotOptions.windbarb`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     windbarb: {       // shared options for all windbarb series     }   },   series: [{     // specific options for this series instance     type: 'windbarb'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/windbarb-series/">Wind barb series</a>
*/
	public void setWindbarb(HIWindbarb windbarb) {
		this.windbarb = windbarb;
		this.windbarb.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIWindbarb getWindbarb(){ return windbarb; }

	private HIVariwide variwide;
/**
/** A variwide chart (related to marimekko chart) is a column chart with a variable width expressing a third dimension. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all variwide series are defined in  `plotOptions.variwide`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     variwide: {       // shared options for all variwide series     }   },   series: [{     // specific options for this series instance     type: 'variwide'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variwide/">Variwide chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/inverted/">Inverted variwide chart</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-variwide/datetime/">Variwide columns on a datetime axis</a>
*/
	public void setVariwide(HIVariwide variwide) {
		this.variwide = variwide;
		this.variwide.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIVariwide getVariwide(){ return variwide; }

	private HIBullet bullet;
/**
/** A bullet graph is a variation of a bar graph. The bullet graph features a single measure, compares it to a target, and displays it in the context of qualitative ranges of performance that could be set using plotBands on yAxis. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all bullet series are defined in  `plotOptions.bullet`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     bullet: {       // shared options for all bullet series     }   },   series: [{     // specific options for this series instance     type: 'bullet'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/bullet-graph/">Bullet graph</a>
*/
	public void setBullet(HIBullet bullet) {
		this.bullet = bullet;
		this.bullet.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIBullet getBullet(){ return bullet; }

	private HIColumn column;
/**
/** Column series display one column per value along an X axis. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all column series are defined in  `plotOptions.column`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     column: {       // shared options for all column series     }   },   series: [{     // specific options for this series instance     type: 'column'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/column-basic/">Column chart</a>
*/
	public void setColumn(HIColumn column) {
		this.column = column;
		this.column.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIColumn getColumn(){ return column; }

	private HIArea area;
/**
/** The area series type. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all area series are defined in  `plotOptions.area`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     area: {       // shared options for all area series     }   },   series: [{     // specific options for this series instance     type: 'area'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/area-basic/">Area chart</a>
*/
	public void setArea(HIArea area) {
		this.area = area;
		this.area.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIArea getArea(){ return area; }

	private HITreemap treemap;
/**
/** A treemap displays hierarchical data using nested rectangles. The data can be laid out in varying ways depending on options. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all treemap series are defined in  `plotOptions.treemap`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     treemap: {       // shared options for all treemap series     }   },   series: [{     // specific options for this series instance     type: 'treemap'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/treemap-large-dataset/">Treemap</a>
*/
	public void setTreemap(HITreemap treemap) {
		this.treemap = treemap;
		this.treemap.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITreemap getTreemap(){ return treemap; }

	private HIAreasplinerange areasplinerange;
/**
/** The area spline range is a cartesian series type with higher and lower Y values along an X axis. The area inside the range is colored, and the graph outlining the area is a smoothed spline. Requires highcharts-more.js. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all areasplinerange series are defined in  `plotOptions.areasplinerange`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     areasplinerange: {       // shared options for all areasplinerange series     }   },   series: [{     // specific options for this series instance     type: 'areasplinerange'   }] });  
*/
	public void setAreasplinerange(HIAreasplinerange areasplinerange) {
		this.areasplinerange = areasplinerange;
		this.areasplinerange.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAreasplinerange getAreasplinerange(){ return areasplinerange; }

	private HIWordcloud wordcloud;
/**
/** A word cloud is a visualization of a set of words, where the size and placement of a word is determined by how it is weighted. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all wordcloud series are defined in  `plotOptions.wordcloud`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     wordcloud: {       // shared options for all wordcloud series     }   },   series: [{     // specific options for this series instance     type: 'wordcloud'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud">Word Cloud chart</a>
*/
	public void setWordcloud(HIWordcloud wordcloud) {
		this.wordcloud = wordcloud;
		this.wordcloud.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIWordcloud getWordcloud(){ return wordcloud; }

	private HIArearange arearange;
/**
/** The area range series is a carteseian series with higher and lower values for each point along an X axis, where the area between the values is shaded. Requires highcharts-more.js. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all arearange series are defined in  `plotOptions.arearange`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     arearange: {       // shared options for all arearange series     }   },   series: [{     // specific options for this series instance     type: 'arearange'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/arearange/">Area range chart</a>
*/
	public void setArearange(HIArearange arearange) {
		this.arearange = arearange;
		this.arearange.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIArearange getArearange(){ return arearange; }

	private HIVariablepie variablepie;
/**
/** A variable pie series is a two dimensional series type, where each point renders an Y and Z value. Each point is drawn as a pie slice where the size (arc) of the slice relates to the Y value and the radius of pie slice relates to the Z value. Requires highcharts-more.js. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all variablepie series are defined in  `plotOptions.variablepie`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     variablepie: {       // shared options for all variablepie series     }   },   series: [{     // specific options for this series instance     type: 'variablepie'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/variable-radius-pie/">Variable-radius pie chart</a>
*/
	public void setVariablepie(HIVariablepie variablepie) {
		this.variablepie = variablepie;
		this.variablepie.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIVariablepie getVariablepie(){ return variablepie; }

	private HIScatter scatter;
/**
/** A scatter plot uses cartesian coordinates to display values for two variables for a set of data. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all scatter series are defined in  `plotOptions.scatter`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     scatter: {       // shared options for all scatter series     }   },   series: [{     // specific options for this series instance     type: 'scatter'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/scatter/">Scatter plot</a>
*/
	public void setScatter(HIScatter scatter) {
		this.scatter = scatter;
		this.scatter.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIScatter getScatter(){ return scatter; }

	private HISankey sankey;
/**
/** A sankey diagram is a type of flow diagram, in which the width of the link between two nodes is shown proportionally to the flow quantity. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all sankey series are defined in  `plotOptions.sankey`. 3. Options for one single series are given in  `the series instance array`.  Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     sankey: {       // shared options for all sankey series     }   },   series: [{     // specific options for this series instance     type: 'sankey'   }] });         <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sankey-diagram/">Sankey diagram</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-inverted/">Inverted sankey diagram</a><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sankey-outgoing">Sankey diagram with outgoing links</a>
*/
	public void setSankey(HISankey sankey) {
		this.sankey = sankey;
		this.sankey.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISankey getSankey(){ return sankey; }



	public HIPlotOptions() {

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
		if (this.xrange != null) {
			params.put("xrange", this.xrange.getParams());
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
		if (this.tilemap != null) {
			params.put("tilemap", this.tilemap.getParams());
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
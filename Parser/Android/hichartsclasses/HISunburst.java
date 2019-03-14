/**
* (c) 2009-2018 Highsoft AS
*
* License: www.highcharts.com/license
* For commercial usage, a valid license is required. To purchase a license for Highcharts Android, please see our website: https://shop.highsoft.com/
* In case of questions, please contact sales@highsoft.com
*/

package com.highsoft.highcharts.common.hichartsclasses;

import java.util.Map;
import java.util.Map;
import java.util.List;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFoundation;
import com.highsoft.highcharts.common.HIColor;



	/**
 A sunburst series. If the type option is not specified, it is inherited from chart.type. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all sunburst series are defined in  `plotOptions.sunburst`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     sunburst: {       // shared options for all sunburst series     }   },   series: [{     // specific options for this series instance     type: 'sunburst'   }] }); `       
	*/

public class HISunburst extends HISeries {
	private Boolean colorByPoint;
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private String rootId;
	/**
 Which point to use as a root in the visualization. 
	*/
	public void setRootId(String rootId) {
		this.rootId = rootId;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRootId(){ return rootId; }

	private HILevelSize levelSize;
	/**
 Determines the width of the ring per level. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/sunburst-levelsize/">Sunburst with various sizes per level</a>
	*/
	public void setLevelSize(HILevelSize levelSize) {
		this.levelSize = levelSize;
		this.levelSize.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HILevelSize getLevelSize(){ return levelSize; }

	private List /* <Number, String> */ center;
	/**
/** * description: The center of the sunburst chart relative to the plot area. Can be percentages or pixel values. * demo:  •  Centered at 100, 100
* defaults: ["50%", "50%"]
*/
	public void setCenter(List /* <Number, String> */ center) {
		this.center = center;
		this.setChanged();
		this.notifyObservers();
	}

	public List /* <Number, String> */ getCenter(){ return center; }

	private HITraverseUpButton traverseUpButton;
	/**
 Options for the button appearing when traversing down in a treemap. 
	*/
	public void setTraverseUpButton(HITraverseUpButton traverseUpButton) {
		this.traverseUpButton = traverseUpButton;
		this.traverseUpButton.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HITraverseUpButton getTraverseUpButton(){ return traverseUpButton; }

	private Number slicedOffset;
	/**
/** * description: If a point is sliced, moved out from the center, how many pixels should it be moved?. * demo:  •  Sliced sunburst
*/
	public void setSlicedOffset(Number slicedOffset) {
		this.slicedOffset = slicedOffset;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getSlicedOffset(){ return slicedOffset; }

	private List <HILevels> levels;
	/**
 Set options on specific levels. Takes precedence over series options, but not point options. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/sunburst">Sunburst chart</a>
	*/
	public void setLevels(List levels) {
		this.levels = levels;
		this.setChanged();
		this.notifyObservers();
	}

	public List getLevels(){ return levels; }

	private Boolean levelIsConstant;
	/**
 Used together with the levels and allowDrillToNode options. When set to false the first level visible when drilling is considered to be level one. Otherwise the level will be the same as the tree structure. 
	*/
	public void setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getLevelIsConstant(){ return levelIsConstant; }

	private Boolean allowTraversingTree;
	/**
 When enabled the user can click on a point which is a parent and zoom in on its children. 
 <br><br><b>defaults:</b><br><br>&ensp;false	*/
	public void setAllowTraversingTree(Boolean allowTraversingTree) {
		this.allowTraversingTree = allowTraversingTree;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowTraversingTree(){ return allowTraversingTree; }

	private HIColor borderColor;
	/**
 The color of the border surrounding each slice. When null, the border takes the same color as the slice fill. This can be used together with a borderWidth to fill drawing gaps created by antialiazing artefacts in borderless pies. In styled mode, the border stroke is given in the .highcharts-point class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-bordercolor-black/">Black border</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private List<String> colors;
	/**
 A series specific or series type specific color set to use instead of the global colors. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/pie-monochrome/">Set defaults colors for all pies</a>
	*/
	public void setColors(List<String> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public List<String> getColors(){ return colors; }

	private Number borderWidth;
	/**
 The width of the border surrounding each slice. When setting the border width to 0, there may be small gaps between the slices due to SVG antialiasing artefacts. To work around this, keep the border width at 0.5 or 1, but set the borderColor to null instead. In styled mode, the border stroke width is given in the .highcharts-point class. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-borderwidth/">3px border</a>
	*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private Number startAngle;
	/**
 The start angle of the pie slices in degrees where 0 is top and 90 right. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-startangle-90/">Start from right</a>
 <br><br><b>defaults:</b><br><br>&ensp;0	*/
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getStartAngle(){ return startAngle; }

	private Object /* Number, String */ size;
	/**
 The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as integers. The defaults behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the plot area. slicedOffset is also included in the defaults size calculation. As a consequence, the size of the pie may vary when points are updated and data labels more around. In that case it is best to set a fixed value, for example "75%". <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/pie-size/">Smaller pie</a>
	*/
	public void setSize(Object /* Number, String */ size) {
		this.size = size;
		this.setChanged();
		this.notifyObservers();
	}

	public Object /* Number, String */ getSize(){ return size; }



	public HISunburst() {
		super(); 
		this.setType("sunburst");
	}

	@Override
public Map<String, Object> getParams() {

		Map<String, Object> params = new Map<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.rootId != null) {
			params.put("rootId", this.rootId);
		}
		if (this.levelSize != null) {
			params.put("levelSize", this.levelSize.getParams());
		}
		if (this.center != null) {
			List<Object> array = new List<>();
			for (Object obj : this.center) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("center", array);
		}
		if (this.traverseUpButton != null) {
			params.put("traverseUpButton", this.traverseUpButton.getParams());
		}
		if (this.slicedOffset != null) {
			params.put("slicedOffset", this.slicedOffset);
		}
		if (this.levels != null) {
			List<Object> array = new List<>();
			for (Object obj : this.levels) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("levels", array);
		}
		if (this.levelIsConstant != null) {
			params.put("levelIsConstant", this.levelIsConstant);
		}
		if (this.allowTraversingTree != null) {
			params.put("allowTraversingTree", this.allowTraversingTree);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.colors != null) {
			List<Object> array = new List<>();
			for (Object obj : this.colors) {
				if (obj instanceof HIFoundation) {
					array.add(((HIFoundation) obj).getParams());
				}
				else {
					array.add(obj);
				}
			}
			params.put("colors", array);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.startAngle != null) {
			params.put("startAngle", this.startAngle);
		}
		if (this.size != null) {
			params.put("size", this.size);
		}
		return params;
	}

}
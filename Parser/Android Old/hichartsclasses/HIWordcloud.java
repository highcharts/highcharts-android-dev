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
import com.highsoft.highcharts.common.HIColor;

import com.highsoft.highcharts.common.HIColor;


	/**
 A word cloud is a visualization of a set of words, where the size and placement of a word is determined by how it is weighted. In TypeScript the `type` option must always be set. Configuration options for the series are given in three levels: 1. Options for all series in a chart are defined in the  `plotOptions.series` object. 2. Options for all wordcloud series are defined in  `plotOptions.wordcloud`. 3. Options for one single series are given in  `the series instance array`. ` Highcharts.chart('container', {   plotOptions: {     series: {       // general options for all series     },     wordcloud: {       // shared options for all wordcloud series     }   },   series: [{     // specific options for this series instance     type: 'wordcloud'   }] }); `        <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/wordcloud">Word Cloud chart</a>
	*/

public class HIWordcloud extends HISeries {
	private Boolean colorByPoint;
	/**
/** * description: When using automatic point colors pulled from the global `colors` or series-specific `plotOptions.column.colors` collections, this option determines whether the chart should receive one color per series or one color per point. In styled mode, the colors or series.colors arrays are not supported, and instead this option gives the points individual color class names on the form highcharts-color-{n}. * demo:  •  False by defaults •  True
* defaults: false
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private HICSSObject style;
	/**
 CSS styles for the words. 
 <br><br><b>defaults:</b><br><br>&ensp;{"fontFamily":"sans-serif", "fontWeight": "900"}	*/
	public void setStyle(HICSSObject style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public HICSSObject getStyle(){ return style; }

	private Number minFontSize;
	/**
 A threshold determining the minimum font size that can be applied to a word. 
	*/
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFontSize(){ return minFontSize; }

	private Number maxFontSize;
	/**
 The word with the largest weight will have a font size equal to this value. The font size of a word is the ratio between its weight and the largest occuring weight, multiplied with the value of maxFontSize. 
	*/
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFontSize(){ return maxFontSize; }

	private Boolean allowExtendPlayingField;
	/**
 If there is no space for a word on the playing field, then this option will allow the playing field to be extended to fit the word. If false then the word will be dropped from the visualization. NB! This option is currently not decided to be published in the API, and is therefore marked as private. 
	*/
	public void setAllowExtendPlayingField(Boolean allowExtendPlayingField) {
		this.allowExtendPlayingField = allowExtendPlayingField;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowExtendPlayingField(){ return allowExtendPlayingField; }

	private String spiral;
	/**
 Spiral used for placing a word after the initial position experienced a collision with either another word or the borders. It is possible for users to add their own custom spiralling algorithms for use in word cloud. Read more about it in our [documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-spiralling-algorithm) <br><br><b>accepted values:</b><br><br>&ensp;["archimedean", "rectangular", "square"]
	*/
	public void setSpiral(String spiral) {
		this.spiral = spiral;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSpiral(){ return spiral; }

	private Number borderWidth;
	/**
/** * description: The width of the border surrounding each column or bar. Defaults to 1 when there is room for a border, but to 0 when the columns are so dense that a border would cover the next column. In styled mode, the stroke width can be set with the .highcharts-point rule. * demo:  •  2px black border
* defaults: undefined
*/
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderWidth(){ return borderWidth; }

	private HIRotation rotation;
	/**
 Rotation options for the words in the wordcloud. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/wordcloud-rotation">Word cloud with rotation</a>
	*/
	public void setRotation(HIRotation rotation) {
		this.rotation = rotation;
		this.rotation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIRotation getRotation(){ return rotation; }

	private String placementStrategy;
	/**
 This option decides which algorithm is used for placement, and rotation of a word. The choice of algorith is therefore a crucial part of the resulting layout of the wordcloud. It is possible for users to add their own custom placement strategies for use in word cloud. Read more about it in our [documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-placement-strategies) <br><br><b>accepted values:</b><br><br>&ensp;["center", "random"]
	*/
	public void setPlacementStrategy(String placementStrategy) {
		this.placementStrategy = placementStrategy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlacementStrategy(){ return placementStrategy; }

	private Number borderRadius;
	/**
 The corner radius of the border surrounding each column or bar. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/">Rounded columns</a>
	*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private ArrayList<HIColor> colors;
	/**
 A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true. 
	*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private HIColor borderColor;
	/**
 The color of the border surrounding each column or bar. In styled mode, the border stroke can be set with the .highcharts-point rule. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-bordercolor/">Dark gray border</a>
 <br><br><b>defaults:</b><br><br>&ensp;#ffffff	*/
	public void setBorderColor(HIColor borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public HIColor getBorderColor(){ return borderColor; }

	private Boolean centerInCategory;
	/**
 When true, the columns will center in the category, ignoring null or missing points. When false, space will be reserved for null or missing points. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-column/centerincategory/">Center in category</a>
	*/
	public void setCenterInCategory(Boolean centerInCategory) {
		this.centerInCategory = centerInCategory;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getCenterInCategory(){ return centerInCategory; }

	private Number edgeWidth;
	/**
 3D columns only. The width of the colored edges. 
 <br><br><b>defaults:</b><br><br>&ensp;1	*/
	public void setEdgeWidth(Number edgeWidth) {
		this.edgeWidth = edgeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getEdgeWidth(){ return edgeWidth; }



	public HIWordcloud() {
		super(); 
		this.setType("wordcloud");
	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params = super.getParams();
		if (this.colorByPoint != null) {
			params.put("colorByPoint", this.colorByPoint);
		}
		if (this.style != null) {
			params.put("style", this.style.getParams());
		}
		if (this.minFontSize != null) {
			params.put("minFontSize", this.minFontSize);
		}
		if (this.maxFontSize != null) {
			params.put("maxFontSize", this.maxFontSize);
		}
		if (this.allowExtendPlayingField != null) {
			params.put("allowExtendPlayingField", this.allowExtendPlayingField);
		}
		if (this.spiral != null) {
			params.put("spiral", this.spiral);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.rotation != null) {
			params.put("rotation", this.rotation.getParams());
		}
		if (this.placementStrategy != null) {
			params.put("placementStrategy", this.placementStrategy);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.colors != null) {
			ArrayList<Object> array = new ArrayList<>();
			for (HIColor hiColor : this.colors) {
				array.add(hiColor.getData());
			}
			params.put("colors", array);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor.getData());
		}
		if (this.centerInCategory != null) {
			params.put("centerInCategory", this.centerInCategory);
		}
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		return params;
	}

}
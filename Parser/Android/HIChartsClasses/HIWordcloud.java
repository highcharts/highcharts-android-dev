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

import com.highsoft.highcharts.Common.HIColor;


/**
A wordcloud series. If the type option is
not specified, it is inherited from chart.type.

Configuration options for the series are given in three levels:
1. Options for all series in a chart are defined in the
   [plotOptions.series](plotOptions.series) object.
2. Options for all wordcloud series are defined in
   [plotOptions.wordcloud](plotOptions.wordcloud).
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

*/

public class HIWordcloud extends HISeries {
	private Boolean colorByPoint;
/**
* description: When using automatic point colors pulled from the options.colors
collection, this option determines whether the chart should receive
one color per series or one color per point.
* demo:  •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-false/ : False by default •  https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-colorbypoint-true/ : True* default: false
*/
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getColorByPoint(){ return colorByPoint; }

	private HIStyle style;
/**
CSS styles for the words.
 <br><br><b>default:</b><br><br>&ensp;{"fontFamily":"sans-serif", "fontWeight": "900"}*/
	public void setStyle(HIStyle style) {
		this.style = style;
		this.style.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIStyle getStyle(){ return style; }

	private Number minFontSize;
/**
A threshold determining the minimum font size that can be applied to a
word.
*/
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMinFontSize(){ return minFontSize; }

	private Number maxFontSize;
/**
The word with the largest weight will have a font size equal to this
value. The font size of a word is the ratio between its weight and the
largest occuring weight, multiplied with the value of maxFontSize.
*/
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getMaxFontSize(){ return maxFontSize; }

	private Boolean allowExtendPlayingField;
/**
If there is no space for a word on the playing field, then this option
will allow the playing field to be extended to fit the word.
If false then the word will be dropped from the visualization.
NB! This option is currently not decided to be published in the API, and
is therefore marked as private.
*/
	public void setAllowExtendPlayingField(Boolean allowExtendPlayingField) {
		this.allowExtendPlayingField = allowExtendPlayingField;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getAllowExtendPlayingField(){ return allowExtendPlayingField; }

	private String spiral;
/**
Spiral used for placing a word after the initial position experienced a
collision with either another word or the borders.
It is possible for users to add their own custom spiralling algorithms
for use in word cloud. Read more about it in our
[documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-spiralling-algorithm)
*/
	public void setSpiral(String spiral) {
		this.spiral = spiral;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSpiral(){ return spiral; }

	private HIRotation rotation;
/**
Rotation options for the words in the wordcloud.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/wordcloud-rotation">Word cloud with rotation</a>*/
	public void setRotation(HIRotation rotation) {
		this.rotation = rotation;
		this.rotation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIRotation getRotation(){ return rotation; }

	private String placementStrategy;
/**
This option decides which algorithm is used for placement, and rotation
of a word. The choice of algorith is therefore a crucial part of the
resulting layout of the wordcloud.
It is possible for users to add their own custom placement strategies
for use in word cloud. Read more about it in our
[documentation](https://www.highcharts.com/docs/chart-and-series-types/word-cloud-series#custom-placement-strategies)
*/
	public void setPlacementStrategy(String placementStrategy) {
		this.placementStrategy = placementStrategy;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPlacementStrategy(){ return placementStrategy; }

	private Number borderRadius;
/**
The corner radius of the border surrounding each column or bar.
 <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/column-borderradius/">Rounded columns</a> <br><br><b>default:</b><br><br>&ensp;0*/
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getBorderRadius(){ return borderRadius; }

	private ArrayList<HIColor> colors;
/**
A series specific or series type specific color set to apply instead
of the global colors when [colorByPoint](
#plotOptions.column.colorByPoint) is true.
*/
	public void setColors(ArrayList<HIColor> colors) {
		this.colors = colors;
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<HIColor> getColors(){ return colors; }

	private Number edgeWidth;
/**
3D columns only. The width of the colored edges.
 <br><br><b>default:</b><br><br>&ensp;1*/
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


	 private Observer updateObserver = new Observer() {
		@Override
		public void update(Observable observable, Object o) {
			setChanged();
			notifyObservers();
		}
	};


	public Map<String, Object> getParams() {

		Map<String, Object> params = new HashMap<>();
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
		if (this.edgeWidth != null) {
			params.put("edgeWidth", this.edgeWidth);
		}
		return params;
	}

}
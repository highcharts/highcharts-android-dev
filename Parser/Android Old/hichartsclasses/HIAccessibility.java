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



public class HIAccessibility extends HIFoundation { 

	private String landmarkVerbosity;
	/**
 Amount of landmarks/regions to create for screen reader users. More landmarks can make navigation with screen readers easier, but can be distracting if there are lots of charts on the page. Three modes are available: - all: Adds regions for all series, legend, information   region. - one: Adds a single landmark per chart. - disabled: No landmarks are added. <br><br><b>accepted values:</b><br><br>&ensp;["all", "one", "disabled"]
	*/
	public void setLandmarkVerbosity(String landmarkVerbosity) {
		this.landmarkVerbosity = landmarkVerbosity;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLandmarkVerbosity(){ return landmarkVerbosity; }

	private Object customComponents;
	/**
 A hook for adding custom components to the accessibility module. Should be an object mapping component names to instances of classes inheriting from the Highcharts.AccessibilityComponent base class. Remember to add the component to the keyboardNavigation.order for the keyboard navigation to be usable. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-component">Custom accessibility component</a>
	*/
	public void setCustomComponents(Object customComponents) {
		this.customComponents = customComponents;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getCustomComponents(){ return customComponents; }

	private String linkedDescription;
	/**
 Link the chart to an HTML element describing the contents of the chart. It is always recommended to describe charts using visible text, to improve SEO as well as accessibility for users with disabilities. This option lets an HTML element with a description be linked to the chart, so that screen reader users can connect the two. By setting this option to a string, Highcharts runs the string as an HTML selector query on the entire document. If there is only a single match, this element is linked to the chart. The content of the linked element will be included in the chart description for screen reader users. By defaults, the chart looks for an adjacent sibling element with the highcharts-description class. The feature can be disabled by setting the option to an empty string, or overridden by providing the accessibility.description option. Alternatively, the HTML element to link can be passed in directly as an HTML node. If you need the description to be part of the exported image, consider using the caption feature. If you need the description to be hidden visually, use the accessibility.description option. <br><br><b><i>Try it:</b></i><br><br>&ensp;&bull;&ensp; <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/accessible-line">Accessible line chart</a>
	*/
	public void setLinkedDescription(String linkedDescription) {
		this.linkedDescription = linkedDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLinkedDescription(){ return linkedDescription; }

	private HIPoint point;
	/**
 Options for descriptions of individual data points. 
	*/
	public void setPoint(HIPoint point) {
		this.point = point;
		this.point.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIPoint getPoint(){ return point; }

	private HISeries series;
	/**
 Accessibility options global to all data series. Individual series can also have specific accessibility options set. 
	*/
	public void setSeries(HISeries series) {
		this.series = series;
		this.series.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HISeries getSeries(){ return series; }

	private HIKeyboardNavigation keyboardNavigation;
	/**
 Options for keyboard navigation. 
	*/
	public void setKeyboardNavigation(HIKeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
		this.keyboardNavigation.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIKeyboardNavigation getKeyboardNavigation(){ return keyboardNavigation; }

	private Boolean enabled;
	/**
 Enable accessibility functionality for the chart. For more information on how to include these features, and why this is recommended, see [Highcharts Accessibility](https://www.highcharts.com/docs/accessibility/accessibility-module). Highcharts will by defaults emit a warning to the console if the [accessibility module](https://code.highcharts.com/modules/accessibility.js) is not loaded. Setting this option to false will override and silence the warning. Once the module is loaded, setting this option to false will disable the module for this chart. 
	*/
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getEnabled(){ return enabled; }

	private HIScreenReaderSection screenReaderSection;
	/**
 Accessibility options for the screen reader information sections added before and after the chart. 
	*/
	public void setScreenReaderSection(HIScreenReaderSection screenReaderSection) {
		this.screenReaderSection = screenReaderSection;
		this.screenReaderSection.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIScreenReaderSection getScreenReaderSection(){ return screenReaderSection; }

	private HIAnnounceNewData announceNewData;
	/**
 Options for announcing new data to screen reader users. Useful for dynamic data applications and drilldown. Keep in mind that frequent announcements will not be useful to users, as they won't have time to explore the new data. For these applications, consider making snapshots of the data accessible, and do the announcements in batches. 
	*/
	public void setAnnounceNewData(HIAnnounceNewData announceNewData) {
		this.announceNewData = announceNewData;
		this.announceNewData.addObserver(updateObserver);
		this.setChanged();
		this.notifyObservers();
	}

	public HIAnnounceNewData getAnnounceNewData(){ return announceNewData; }

	private String typeDescription;
	/**
 A text description of the chart type. If the Accessibility module is loaded, this will be included in the description of the chart in the screen reader information region. Highcharts will by defaults attempt to guess the chart type, but for more complex charts it is recommended to specify this property for clarity. 
	*/
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTypeDescription(){ return typeDescription; }

	private Object highContrastTheme;
	/**
 Theme to apply to the chart when Windows High Contrast Mode is detected. By defaults, a high contrast theme matching the high contrast system system colors is used. 
	*/
	public void setHighContrastTheme(Object highContrastTheme) {
		this.highContrastTheme = highContrastTheme;
		this.setChanged();
		this.notifyObservers();
	}

	public Object getHighContrastTheme(){ return highContrastTheme; }

	private String definition;
	/**
 A text description of the chart. **Note: Prefer using linkedDescription or caption instead.** If the Accessibility module is loaded, this option is included by defaults as a long description of the chart in the hidden screen reader information region. Note: Since Highcharts now supports captions and linked descriptions, it is preferred to define the description using those methods, as a visible caption/description benefits all users. If the accessibility.description option is defined, the linked description is ignored, and the caption is hidden from screen reader users. 
	*/
	public void setDefinition(String definition) {
		this.definition = definition;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDefinition(){ return definition; }

	private Boolean exposeAsGroupOnly;
	/**
 Expose only the series element to screen readers, not its points. 
	*/
	public void setExposeAsGroupOnly(Boolean exposeAsGroupOnly) {
		this.exposeAsGroupOnly = exposeAsGroupOnly;
		this.setChanged();
		this.notifyObservers();
	}

	public Boolean getExposeAsGroupOnly(){ return exposeAsGroupOnly; }

	private String rangeDescription;
	/**
 Range description for an axis. Overrides the defaults range description. Set to empty to disable range description for this axis. 
	*/
	public void setRangeDescription(String rangeDescription) {
		this.rangeDescription = rangeDescription;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRangeDescription(){ return rangeDescription; }



	public HIAccessibility() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.landmarkVerbosity != null) {
			params.put("landmarkVerbosity", this.landmarkVerbosity);
		}
		if (this.customComponents != null) {
			params.put("customComponents", this.customComponents);
		}
		if (this.linkedDescription != null) {
			params.put("linkedDescription", this.linkedDescription);
		}
		if (this.point != null) {
			params.put("point", this.point.getParams());
		}
		if (this.series != null) {
			params.put("series", this.series.getParams());
		}
		if (this.keyboardNavigation != null) {
			params.put("keyboardNavigation", this.keyboardNavigation.getParams());
		}
		if (this.enabled != null) {
			params.put("enabled", this.enabled);
		}
		if (this.screenReaderSection != null) {
			params.put("screenReaderSection", this.screenReaderSection.getParams());
		}
		if (this.announceNewData != null) {
			params.put("announceNewData", this.announceNewData.getParams());
		}
		if (this.typeDescription != null) {
			params.put("typeDescription", this.typeDescription);
		}
		if (this.highContrastTheme != null) {
			params.put("highContrastTheme", this.highContrastTheme);
		}
		if (this.definition != null) {
			params.put("definition", this.definition);
		}
		if (this.exposeAsGroupOnly != null) {
			params.put("exposeAsGroupOnly", this.exposeAsGroupOnly);
		}
		if (this.rangeDescription != null) {
			params.put("rangeDescription", this.rangeDescription);
		}
		return params;
	}

}
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



public class HIPatternOptionsObject extends HIFoundation { 

	private Number aspectRatio;
	/**
 For automatically calculated width and height on images, it is possible to set an aspect ratio. The image will be zoomed to fill the bounding box, maintaining the aspect ratio defined. 
	*/
	public void setAspectRatio(Number aspectRatio) {
		this.aspectRatio = aspectRatio;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getAspectRatio(){ return aspectRatio; }

	private String backgroundColor;
	/**
 Background color for the pattern if a `path` is set (not images). 
	*/
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColor(){ return backgroundColor; }

	private String color;
	/**
 Pattern color, used as defaults path stroke. 
	*/
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private Number height;
	/**
 Analogous to pattern.width. 
	*/
	public void setHeight(Number height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getHeight(){ return height; }

	private String id;
	/**
 ID to assign to the pattern. This is automatically computed if not added, and identical patterns are reused. To refer to an existing pattern for a Highcharts color, use `color: "url(#pattern-id)"`. 
	*/
	public void setId(String id) {
		this.id = id;
		this.setChanged();
		this.notifyObservers();
	}

	public String getId(){ return id; }

	private String image;
	/**
 URL to an image to use as the pattern. 
	*/
	public void setImage(String image) {
		this.image = image;
		this.setChanged();
		this.notifyObservers();
	}

	public String getImage(){ return image; }

	private Number opacity;
	/**
 Opacity of the pattern as a float value from 0 to 1. 
	*/
	public void setOpacity(Number opacity) {
		this.opacity = opacity;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getOpacity(){ return opacity; }

	private HISVGAttributes path;
	/**
 Either an SVG path as string, or an object. As an object, supply the path string in the `path.d` property. Other supported properties are standard SVG attributes like `path.stroke` and `path.fill`. If a path is supplied for the pattern, the `image` property is ignored. 
	*/
	public void setPath(HISVGAttributes path) {
		this.path = path;
		this.setChanged();
		this.notifyObservers();
	}

	public HISVGAttributes getPath(){ return path; }

	private String patternTransform;
	/**
 SVG `patternTransform` to apply to the entire pattern. 
	*/
	public void setPatternTransform(String patternTransform) {
		this.patternTransform = patternTransform;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPatternTransform(){ return patternTransform; }

	private Number width;
	/**
 Width of the pattern. For images this is automatically set to the width of the element bounding box if not supplied. For non-image patterns the defaults is 32px. Note that automatic resizing of image patterns to fill a bounding box dynamically is only supported for patterns with an automatically calculated ID. 
	*/
	public void setWidth(Number width) {
		this.width = width;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getWidth(){ return width; }

	private Number x;
	/**
 Horizontal offset of the pattern. Defaults to 0. 
	*/
	public void setX(Number x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getX(){ return x; }

	private Number y;
	/**
 Vertical offset of the pattern. Defaults to 0. 
	*/
	public void setY(Number y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public Number getY(){ return y; }



	public HIPatternOptionsObject() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.aspectRatio != null) {
			params.put("aspectRatio", this.aspectRatio);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.id != null) {
			params.put("id", this.id);
		}
		if (this.image != null) {
			params.put("image", this.image);
		}
		if (this.opacity != null) {
			params.put("opacity", this.opacity);
		}
		if (this.path != null) {
			params.put("path", this.path.getParams());
		}
		if (this.patternTransform != null) {
			params.put("patternTransform", this.patternTransform);
		}
		if (this.width != null) {
			params.put("width", this.width);
		}
		if (this.x != null) {
			params.put("x", this.x);
		}
		if (this.y != null) {
			params.put("y", this.y);
		}
		return params;
	}

}
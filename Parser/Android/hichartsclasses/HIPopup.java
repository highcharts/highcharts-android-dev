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



public class HIPopup extends HIFoundation { 

	private String backgroundColors;
	public void setBackgroundColors(String backgroundColors) {
		this.backgroundColors = backgroundColors;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColors(){ return backgroundColors; }

	private String labels;
	public void setLabels(String labels) {
		this.labels = labels;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabels(){ return labels; }

	private String standardDeviation;
	public void setStandardDeviation(String standardDeviation) {
		this.standardDeviation = standardDeviation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStandardDeviation(){ return standardDeviation; }

	private String addButton;
	public void setAddButton(String addButton) {
		this.addButton = addButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAddButton(){ return addButton; }

	private String verticalCounter;
	public void setVerticalCounter(String verticalCounter) {
		this.verticalCounter = verticalCounter;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalCounter(){ return verticalCounter; }

	private String style;
	public void setStyle(String style) {
		this.style = style;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStyle(){ return style; }

	private String crosshairX;
	public void setCrosshairX(String crosshairX) {
		this.crosshairX = crosshairX;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrosshairX(){ return crosshairX; }

	private String crosshairY;
	public void setCrosshairY(String crosshairY) {
		this.crosshairY = crosshairY;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrosshairY(){ return crosshairY; }

	private String highIndex;
	public void setHighIndex(String highIndex) {
		this.highIndex = highIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHighIndex(){ return highIndex; }

	private String factor;
	public void setFactor(String factor) {
		this.factor = factor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFactor(){ return factor; }

	private String arrowSegment;
	public void setArrowSegment(String arrowSegment) {
		this.arrowSegment = arrowSegment;
		this.setChanged();
		this.notifyObservers();
	}

	public String getArrowSegment(){ return arrowSegment; }

	private String rectangle;
	public void setRectangle(String rectangle) {
		this.rectangle = rectangle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRectangle(){ return rectangle; }

	private String format;
	public void setFormat(String format) {
		this.format = format;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFormat(){ return format; }

	private String elliott5;
	public void setElliott5(String elliott5) {
		this.elliott5 = elliott5;
		this.setChanged();
		this.notifyObservers();
	}

	public String getElliott5(){ return elliott5; }

	private String elliott3;
	public void setElliott3(String elliott3) {
		this.elliott3 = elliott3;
		this.setChanged();
		this.notifyObservers();
	}

	public String getElliott3(){ return elliott3; }

	private String verticalLine;
	public void setVerticalLine(String verticalLine) {
		this.verticalLine = verticalLine;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalLine(){ return verticalLine; }

	private String background;
	public void setBackground(String background) {
		this.background = background;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackground(){ return background; }

	private String slowAvgPeriod;
	public void setSlowAvgPeriod(String slowAvgPeriod) {
		this.slowAvgPeriod = slowAvgPeriod;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSlowAvgPeriod(){ return slowAvgPeriod; }

	private String name;
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}

	public String getName(){ return name; }

	private String shapes;
	public void setShapes(String shapes) {
		this.shapes = shapes;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShapes(){ return shapes; }

	private String borderWidth;
	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderWidth(){ return borderWidth; }

	private String fastAvgPeriod;
	public void setFastAvgPeriod(String fastAvgPeriod) {
		this.fastAvgPeriod = fastAvgPeriod;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFastAvgPeriod(){ return fastAvgPeriod; }

	private String deviation;
	public void setDeviation(String deviation) {
		this.deviation = deviation;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDeviation(){ return deviation; }

	private String periodTenkan;
	public void setPeriodTenkan(String periodTenkan) {
		this.periodTenkan = periodTenkan;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPeriodTenkan(){ return periodTenkan; }

	private String series;
	public void setSeries(String series) {
		this.series = series;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSeries(){ return series; }

	private String maxAccelerationFactor;
	public void setMaxAccelerationFactor(String maxAccelerationFactor) {
		this.maxAccelerationFactor = maxAccelerationFactor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMaxAccelerationFactor(){ return maxAccelerationFactor; }

	private String measure;
	public void setMeasure(String measure) {
		this.measure = measure;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMeasure(){ return measure; }

	private String shortPeriod;
	public void setShortPeriod(String shortPeriod) {
		this.shortPeriod = shortPeriod;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShortPeriod(){ return shortPeriod; }

	private String index;
	public void setIndex(String index) {
		this.index = index;
		this.setChanged();
		this.notifyObservers();
	}

	public String getIndex(){ return index; }

	private String typeOptions;
	public void setTypeOptions(String typeOptions) {
		this.typeOptions = typeOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTypeOptions(){ return typeOptions; }

	private String lowIndex;
	public void setLowIndex(String lowIndex) {
		this.lowIndex = lowIndex;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLowIndex(){ return lowIndex; }

	private String label;
	public void setLabel(String label) {
		this.label = label;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabel(){ return label; }

	private String fontSize;
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFontSize(){ return fontSize; }

	private String backgroundColor;
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBackgroundColor(){ return backgroundColor; }

	private String periodSenkouSpanB;
	public void setPeriodSenkouSpanB(String periodSenkouSpanB) {
		this.periodSenkouSpanB = periodSenkouSpanB;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPeriodSenkouSpanB(){ return periodSenkouSpanB; }

	private String ranges;
	public void setRanges(String ranges) {
		this.ranges = ranges;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRanges(){ return ranges; }

	private String multiplier;
	public void setMultiplier(String multiplier) {
		this.multiplier = multiplier;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMultiplier(){ return multiplier; }

	private String saveButton;
	public void setSaveButton(String saveButton) {
		this.saveButton = saveButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSaveButton(){ return saveButton; }

	private String title;
	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTitle(){ return title; }

	private String verticalArrow;
	public void setVerticalArrow(String verticalArrow) {
		this.verticalArrow = verticalArrow;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalArrow(){ return verticalArrow; }

	private String decimals;
	public void setDecimals(String decimals) {
		this.decimals = decimals;
		this.setChanged();
		this.notifyObservers();
	}

	public String getDecimals(){ return decimals; }

	private String horizontalLine;
	public void setHorizontalLine(String horizontalLine) {
		this.horizontalLine = horizontalLine;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHorizontalLine(){ return horizontalLine; }

	private String color;
	public void setColor(String color) {
		this.color = color;
		this.setChanged();
		this.notifyObservers();
	}

	public String getColor(){ return color; }

	private String period;
	public void setPeriod(String period) {
		this.period = period;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPeriod(){ return period; }

	private String height;
	public void setHeight(String height) {
		this.height = height;
		this.setChanged();
		this.notifyObservers();
	}

	public String getHeight(){ return height; }

	private String signalPeriod;
	public void setSignalPeriod(String signalPeriod) {
		this.signalPeriod = signalPeriod;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSignalPeriod(){ return signalPeriod; }

	private String removeButton;
	public void setRemoveButton(String removeButton) {
		this.removeButton = removeButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRemoveButton(){ return removeButton; }

	private String borderColor;
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderColor(){ return borderColor; }

	private String connector;
	public void setConnector(String connector) {
		this.connector = connector;
		this.setChanged();
		this.notifyObservers();
	}

	public String getConnector(){ return connector; }

	private String arrowRay;
	public void setArrowRay(String arrowRay) {
		this.arrowRay = arrowRay;
		this.setChanged();
		this.notifyObservers();
	}

	public String getArrowRay(){ return arrowRay; }

	private String periodATR;
	public void setPeriodATR(String periodATR) {
		this.periodATR = periodATR;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPeriodATR(){ return periodATR; }

	private String padding;
	public void setPadding(String padding) {
		this.padding = padding;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPadding(){ return padding; }

	private String line;
	public void setLine(String line) {
		this.line = line;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLine(){ return line; }

	private String circle;
	public void setCircle(String circle) {
		this.circle = circle;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCircle(){ return circle; }

	private String volume;
	public void setVolume(String volume) {
		this.volume = volume;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVolume(){ return volume; }

	private String tunnel;
	public void setTunnel(String tunnel) {
		this.tunnel = tunnel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTunnel(){ return tunnel; }

	private String pitchfork;
	public void setPitchfork(String pitchfork) {
		this.pitchfork = pitchfork;
		this.setChanged();
		this.notifyObservers();
	}

	public String getPitchfork(){ return pitchfork; }

	private String xAxisUnit;
	public void setXAxisUnit(String xAxisUnit) {
		this.xAxisUnit = xAxisUnit;
		this.setChanged();
		this.notifyObservers();
	}

	public String getXAxisUnit(){ return xAxisUnit; }

	private String shapeOptions;
	public void setShapeOptions(String shapeOptions) {
		this.shapeOptions = shapeOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getShapeOptions(){ return shapeOptions; }

	private String outerBackground;
	public void setOuterBackground(String outerBackground) {
		this.outerBackground = outerBackground;
		this.setChanged();
		this.notifyObservers();
	}

	public String getOuterBackground(){ return outerBackground; }

	private String simpleShapes;
	public void setSimpleShapes(String simpleShapes) {
		this.simpleShapes = simpleShapes;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSimpleShapes(){ return simpleShapes; }

	private String stroke;
	public void setStroke(String stroke) {
		this.stroke = stroke;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStroke(){ return stroke; }

	private String fibonacci;
	public void setFibonacci(String fibonacci) {
		this.fibonacci = fibonacci;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFibonacci(){ return fibonacci; }

	private String increment;
	public void setIncrement(String increment) {
		this.increment = increment;
		this.setChanged();
		this.notifyObservers();
	}

	public String getIncrement(){ return increment; }

	private String longPeriod;
	public void setLongPeriod(String longPeriod) {
		this.longPeriod = longPeriod;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLongPeriod(){ return longPeriod; }

	private String multiplierATR;
	public void setMultiplierATR(String multiplierATR) {
		this.multiplierATR = multiplierATR;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMultiplierATR(){ return multiplierATR; }

	private String fill;
	public void setFill(String fill) {
		this.fill = fill;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFill(){ return fill; }

	private String arrowLine;
	public void setArrowLine(String arrowLine) {
		this.arrowLine = arrowLine;
		this.setChanged();
		this.notifyObservers();
	}

	public String getArrowLine(){ return arrowLine; }

	private String ray;
	public void setRay(String ray) {
		this.ray = ray;
		this.setChanged();
		this.notifyObservers();
	}

	public String getRay(){ return ray; }

	private String verticalLabel;
	public void setVerticalLabel(String verticalLabel) {
		this.verticalLabel = verticalLabel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getVerticalLabel(){ return verticalLabel; }

	private String borderRadius;
	public void setBorderRadius(String borderRadius) {
		this.borderRadius = borderRadius;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBorderRadius(){ return borderRadius; }

	private String initialAccelerationFactor;
	public void setInitialAccelerationFactor(String initialAccelerationFactor) {
		this.initialAccelerationFactor = initialAccelerationFactor;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInitialAccelerationFactor(){ return initialAccelerationFactor; }

	private String strokeWidth;
	public void setStrokeWidth(String strokeWidth) {
		this.strokeWidth = strokeWidth;
		this.setChanged();
		this.notifyObservers();
	}

	public String getStrokeWidth(){ return strokeWidth; }

	private String labelOptions;
	public void setLabelOptions(String labelOptions) {
		this.labelOptions = labelOptions;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLabelOptions(){ return labelOptions; }

	private String parallelChannel;
	public void setParallelChannel(String parallelChannel) {
		this.parallelChannel = parallelChannel;
		this.setChanged();
		this.notifyObservers();
	}

	public String getParallelChannel(){ return parallelChannel; }

	private String bottomBand;
	public void setBottomBand(String bottomBand) {
		this.bottomBand = bottomBand;
		this.setChanged();
		this.notifyObservers();
	}

	public String getBottomBand(){ return bottomBand; }

	private String segment;
	public void setSegment(String segment) {
		this.segment = segment;
		this.setChanged();
		this.notifyObservers();
	}

	public String getSegment(){ return segment; }

	private String measureX;
	public void setMeasureX(String measureX) {
		this.measureX = measureX;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMeasureX(){ return measureX; }

	private String measureY;
	public void setMeasureY(String measureY) {
		this.measureY = measureY;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMeasureY(){ return measureY; }

	private String innerBackground;
	public void setInnerBackground(String innerBackground) {
		this.innerBackground = innerBackground;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInnerBackground(){ return innerBackground; }

	private String algorithm;
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAlgorithm(){ return algorithm; }

	private String measureXY;
	public void setMeasureXY(String measureXY) {
		this.measureXY = measureXY;
		this.setChanged();
		this.notifyObservers();
	}

	public String getMeasureXY(){ return measureXY; }

	private String average;
	public void setAverage(String average) {
		this.average = average;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAverage(){ return average; }

	private String lines;
	public void setLines(String lines) {
		this.lines = lines;
		this.setChanged();
		this.notifyObservers();
	}

	public String getLines(){ return lines; }

	private String crooked5;
	public void setCrooked5(String crooked5) {
		this.crooked5 = crooked5;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrooked5(){ return crooked5; }

	private String topBand;
	public void setTopBand(String topBand) {
		this.topBand = topBand;
		this.setChanged();
		this.notifyObservers();
	}

	public String getTopBand(){ return topBand; }

	private String flags;
	public void setFlags(String flags) {
		this.flags = flags;
		this.setChanged();
		this.notifyObservers();
	}

	public String getFlags(){ return flags; }

	private String crooked3;
	public void setCrooked3(String crooked3) {
		this.crooked3 = crooked3;
		this.setChanged();
		this.notifyObservers();
	}

	public String getCrooked3(){ return crooked3; }

	private String editButton;
	public void setEditButton(String editButton) {
		this.editButton = editButton;
		this.setChanged();
		this.notifyObservers();
	}

	public String getEditButton(){ return editButton; }

	private String infinityLine;
	public void setInfinityLine(String infinityLine) {
		this.infinityLine = infinityLine;
		this.setChanged();
		this.notifyObservers();
	}

	public String getInfinityLine(){ return infinityLine; }



	public HIPopup() {

	}

	@Override
public HashMap<String, Object> getParams() {

		HashMap<String, Object> params = new HashMap<>();
		params.put("_wrapperID", this.uuid);
		if (this.backgroundColors != null) {
			params.put("backgroundColors", this.backgroundColors);
		}
		if (this.labels != null) {
			params.put("labels", this.labels);
		}
		if (this.standardDeviation != null) {
			params.put("standardDeviation", this.standardDeviation);
		}
		if (this.addButton != null) {
			params.put("addButton", this.addButton);
		}
		if (this.verticalCounter != null) {
			params.put("verticalCounter", this.verticalCounter);
		}
		if (this.style != null) {
			params.put("style", this.style);
		}
		if (this.crosshairX != null) {
			params.put("crosshairX", this.crosshairX);
		}
		if (this.crosshairY != null) {
			params.put("crosshairY", this.crosshairY);
		}
		if (this.highIndex != null) {
			params.put("highIndex", this.highIndex);
		}
		if (this.factor != null) {
			params.put("factor", this.factor);
		}
		if (this.arrowSegment != null) {
			params.put("arrowSegment", this.arrowSegment);
		}
		if (this.rectangle != null) {
			params.put("rectangle", this.rectangle);
		}
		if (this.format != null) {
			params.put("format", this.format);
		}
		if (this.elliott5 != null) {
			params.put("elliott5", this.elliott5);
		}
		if (this.elliott3 != null) {
			params.put("elliott3", this.elliott3);
		}
		if (this.verticalLine != null) {
			params.put("verticalLine", this.verticalLine);
		}
		if (this.background != null) {
			params.put("background", this.background);
		}
		if (this.slowAvgPeriod != null) {
			params.put("slowAvgPeriod", this.slowAvgPeriod);
		}
		if (this.name != null) {
			params.put("name", this.name);
		}
		if (this.shapes != null) {
			params.put("shapes", this.shapes);
		}
		if (this.borderWidth != null) {
			params.put("borderWidth", this.borderWidth);
		}
		if (this.fastAvgPeriod != null) {
			params.put("fastAvgPeriod", this.fastAvgPeriod);
		}
		if (this.deviation != null) {
			params.put("deviation", this.deviation);
		}
		if (this.periodTenkan != null) {
			params.put("periodTenkan", this.periodTenkan);
		}
		if (this.series != null) {
			params.put("series", this.series);
		}
		if (this.maxAccelerationFactor != null) {
			params.put("maxAccelerationFactor", this.maxAccelerationFactor);
		}
		if (this.measure != null) {
			params.put("measure", this.measure);
		}
		if (this.shortPeriod != null) {
			params.put("shortPeriod", this.shortPeriod);
		}
		if (this.index != null) {
			params.put("index", this.index);
		}
		if (this.typeOptions != null) {
			params.put("typeOptions", this.typeOptions);
		}
		if (this.lowIndex != null) {
			params.put("lowIndex", this.lowIndex);
		}
		if (this.label != null) {
			params.put("label", this.label);
		}
		if (this.fontSize != null) {
			params.put("fontSize", this.fontSize);
		}
		if (this.backgroundColor != null) {
			params.put("backgroundColor", this.backgroundColor);
		}
		if (this.periodSenkouSpanB != null) {
			params.put("periodSenkouSpanB", this.periodSenkouSpanB);
		}
		if (this.ranges != null) {
			params.put("ranges", this.ranges);
		}
		if (this.multiplier != null) {
			params.put("multiplier", this.multiplier);
		}
		if (this.saveButton != null) {
			params.put("saveButton", this.saveButton);
		}
		if (this.title != null) {
			params.put("title", this.title);
		}
		if (this.verticalArrow != null) {
			params.put("verticalArrow", this.verticalArrow);
		}
		if (this.decimals != null) {
			params.put("decimals", this.decimals);
		}
		if (this.horizontalLine != null) {
			params.put("horizontalLine", this.horizontalLine);
		}
		if (this.color != null) {
			params.put("color", this.color);
		}
		if (this.period != null) {
			params.put("period", this.period);
		}
		if (this.height != null) {
			params.put("height", this.height);
		}
		if (this.signalPeriod != null) {
			params.put("signalPeriod", this.signalPeriod);
		}
		if (this.removeButton != null) {
			params.put("removeButton", this.removeButton);
		}
		if (this.borderColor != null) {
			params.put("borderColor", this.borderColor);
		}
		if (this.connector != null) {
			params.put("connector", this.connector);
		}
		if (this.arrowRay != null) {
			params.put("arrowRay", this.arrowRay);
		}
		if (this.periodATR != null) {
			params.put("periodATR", this.periodATR);
		}
		if (this.padding != null) {
			params.put("padding", this.padding);
		}
		if (this.line != null) {
			params.put("line", this.line);
		}
		if (this.circle != null) {
			params.put("circle", this.circle);
		}
		if (this.volume != null) {
			params.put("volume", this.volume);
		}
		if (this.tunnel != null) {
			params.put("tunnel", this.tunnel);
		}
		if (this.pitchfork != null) {
			params.put("pitchfork", this.pitchfork);
		}
		if (this.xAxisUnit != null) {
			params.put("xAxisUnit", this.xAxisUnit);
		}
		if (this.shapeOptions != null) {
			params.put("shapeOptions", this.shapeOptions);
		}
		if (this.outerBackground != null) {
			params.put("outerBackground", this.outerBackground);
		}
		if (this.simpleShapes != null) {
			params.put("simpleShapes", this.simpleShapes);
		}
		if (this.stroke != null) {
			params.put("stroke", this.stroke);
		}
		if (this.fibonacci != null) {
			params.put("fibonacci", this.fibonacci);
		}
		if (this.increment != null) {
			params.put("increment", this.increment);
		}
		if (this.longPeriod != null) {
			params.put("longPeriod", this.longPeriod);
		}
		if (this.multiplierATR != null) {
			params.put("multiplierATR", this.multiplierATR);
		}
		if (this.fill != null) {
			params.put("fill", this.fill);
		}
		if (this.arrowLine != null) {
			params.put("arrowLine", this.arrowLine);
		}
		if (this.ray != null) {
			params.put("ray", this.ray);
		}
		if (this.verticalLabel != null) {
			params.put("verticalLabel", this.verticalLabel);
		}
		if (this.borderRadius != null) {
			params.put("borderRadius", this.borderRadius);
		}
		if (this.initialAccelerationFactor != null) {
			params.put("initialAccelerationFactor", this.initialAccelerationFactor);
		}
		if (this.strokeWidth != null) {
			params.put("strokeWidth", this.strokeWidth);
		}
		if (this.labelOptions != null) {
			params.put("labelOptions", this.labelOptions);
		}
		if (this.parallelChannel != null) {
			params.put("parallelChannel", this.parallelChannel);
		}
		if (this.bottomBand != null) {
			params.put("bottomBand", this.bottomBand);
		}
		if (this.segment != null) {
			params.put("segment", this.segment);
		}
		if (this.measureX != null) {
			params.put("measureX", this.measureX);
		}
		if (this.measureY != null) {
			params.put("measureY", this.measureY);
		}
		if (this.innerBackground != null) {
			params.put("innerBackground", this.innerBackground);
		}
		if (this.algorithm != null) {
			params.put("algorithm", this.algorithm);
		}
		if (this.measureXY != null) {
			params.put("measureXY", this.measureXY);
		}
		if (this.average != null) {
			params.put("average", this.average);
		}
		if (this.lines != null) {
			params.put("lines", this.lines);
		}
		if (this.crooked5 != null) {
			params.put("crooked5", this.crooked5);
		}
		if (this.topBand != null) {
			params.put("topBand", this.topBand);
		}
		if (this.flags != null) {
			params.put("flags", this.flags);
		}
		if (this.crooked3 != null) {
			params.put("crooked3", this.crooked3);
		}
		if (this.editButton != null) {
			params.put("editButton", this.editButton);
		}
		if (this.infinityLine != null) {
			params.put("infinityLine", this.infinityLine);
		}
		return params;
	}

}
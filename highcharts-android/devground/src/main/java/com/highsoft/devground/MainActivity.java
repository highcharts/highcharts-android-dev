package com.highsoft.devground;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIHover;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotLines;
import com.highsoft.highcharts.common.hichartsclasses.HIPosition;
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStates;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIWindbarb;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private HIOptions getChartOptions() {

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setMarginBottom(70);
        chart.setMarginRight(40);
        chart.setMarginTop(50);
        chart.setPlotBorderWidth(1);
        chart.setHeight(310);
        chart.setAlignTicks(false);
        HIScrollablePlotArea scrollablePlotArea = new HIScrollablePlotArea();
        scrollablePlotArea.setMinWidth(720);
        chart.setScrollablePlotArea(scrollablePlotArea);


        options.setChart(chart);

        //defs

        HITitle title = new HITitle();
        title.setAlign("left");
//        HIStyle titleStyle = new HIStyle();
//        titleStyle.setWhiteSpace("nowrap");
//        titleStyle.setTextOverflow("ellipsis");
//        title.setStyle(titleStyle);

        options.setTitle(title);

        HICredits credits = new HICredits();
        credits.setText("Forecast from <a href=\"http://yr.no\">yr.no</a>");
        HIPosition creditsPosition = new HIPosition();
        creditsPosition.setX(-40);
//        credits.setPosition(creditsPosition);

        options.setCredits(credits);

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        tooltip.setUseHTML(true);
        tooltip.setHeaderFormat("<small>{point.x:%A, %b %e, %H:%M} - {point.point.to:%H:%M}</small><br> <b>{point.point.symbolName}</b><br>");

        options.setTooltip(tooltip);

        HIXAxis bottomXAxis = new HIXAxis();
        bottomXAxis.setType("datetime");
        bottomXAxis.setTickInterval(2*36e5); // two hours
        bottomXAxis.setMinTickInterval(36e5); // one hour
        bottomXAxis.setTickLength(0);
        bottomXAxis.setGridLineWidth(1);
        bottomXAxis.setGridLineColor(HIColor.initWithHexValue("F0F0F0"));
        bottomXAxis.setStartOnTick(true);
        bottomXAxis.setEndOnTick(true);
        bottomXAxis.setMinPadding(0);
        bottomXAxis.setMaxPadding(0);
        bottomXAxis.setOffset(30);
        bottomXAxis.setShowLastLabel(true);
        HILabels bottomXAxisLables = new HILabels();
        bottomXAxisLables.setFormat("{value:%H}");
        bottomXAxis.setLabels(bottomXAxisLables);

        HIXAxis topXAxis = new HIXAxis();
        topXAxis.setLinkedTo(0);
        topXAxis.setType("datetime");
        topXAxis.setTickInterval(24*3600*1000);
        HILabels topXAxisLabels = new HILabels();
        topXAxisLabels.setFormat("{value:<span style=\"font-size: 12px; font-weight: bold\">%a</span> %b %e}");
        topXAxisLabels.setAlign("left");
        topXAxisLabels.setX(3);
        topXAxisLabels.setY(-5);
        topXAxis.setLabels(topXAxisLabels);
        topXAxis.setOpposite(true);
        topXAxis.setTickLength(20);
        topXAxis.setGridLineWidth(1);

        options.setXAxis(new ArrayList<>(Arrays.asList(bottomXAxis, topXAxis)));


        HIYAxis temperatureAxis = new HIYAxis();
        temperatureAxis.setTitle(new HITitle());
        temperatureAxis.getTitle().setText("");
        HILabels temperatureAxisLabels = new HILabels();
        temperatureAxisLabels.setFormat("{value}°");
        temperatureAxisLabels.setX(-3);
        temperatureAxis.setLabels(temperatureAxisLabels);
        HIPlotLines temperatureAxisPlotLines = new HIPlotLines(); // zero plane
        temperatureAxisPlotLines.setValue(0);
        temperatureAxisPlotLines.setColor(HIColor.initWithHexValue("BBBBBB"));
        temperatureAxisPlotLines.setWidth(1);
        temperatureAxisPlotLines.setZIndex(2);
        temperatureAxis.setPlotLines(new ArrayList<>(Collections.singletonList(temperatureAxisPlotLines)));
        temperatureAxis.setMaxPadding(0.3);
        temperatureAxis.setMinRange(8);
        temperatureAxis.setTickInterval(1);
        temperatureAxis.setGridLineColor(HIColor.initWithHexValue("F0F0F0"));

        ArrayList<HIPlotLines> xAxisPlotLines = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            HIPlotLines plotLine = new HIPlotLines();
            plotLine.setColor(HIColor.initWithRGBA(0, 0, 0, 0.5));
            plotLine.setWidth(2);
            long timeInMillis = i;
            Number plotLineValue = timeInMillis;
            plotLine.setValue(plotLineValue);
            plotLine.setDashStyle("ShortDash");
            plotLine.setZIndex(3);
            xAxisPlotLines.add(plotLine);
        }
        HIYAxis hiyAxis = new HIYAxis();
        hiyAxis.setPlotLines(xAxisPlotLines);
        options.setYAxis(new ArrayList<>(Arrays.asList(hiyAxis)));


        ;


//        options.setPlotOptions(new HIPlotOptions());
//        options.getPlotOptions().setSeries(new HISeries());
//        options.getPlotOptions().getSeries().setPointPlacement("between");
//        options.getPlotOptions().getSeries().setAnimation(new HIAnimationOptionsObject());
//        options.getPlotOptions().getSeries().getAnimation().setDuration(0);

        options.setSeries(new ArrayList<>());

        HISpline temperatureSeries = new HISpline();
        temperatureSeries.setName("Temperature");
        HIMarker temperatureMarker = new HIMarker();
        temperatureMarker.setEnabled(false);
        temperatureMarker.setStates(new HIStates());
        temperatureMarker.getStates().setHover(new HIHover());
        temperatureMarker.getStates().getHover().setEnabled(true);
        temperatureSeries.setTooltip(new HITooltip());
        temperatureSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.y}°C</b><br/>");
        temperatureSeries.setZIndex(1);
        temperatureSeries.setNegativeColor(HIColor.initWithHexValue("48AFE8"));
        options.getSeries().add(temperatureSeries);

        HIColumn precipErrSeries = new HIColumn();
        precipErrSeries.setName("Precipitation");
        precipErrSeries.setYAxis(1);
        precipErrSeries.setGroupPadding(0);
        precipErrSeries.setPointPadding(0);
        precipErrSeries.setTooltip(new HITooltip());
        precipErrSeries.getTooltip().setValueSuffix(" mm");
        precipErrSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\\u25CF</span> {series.name}: <b>{point.minvalue} mm - {point.maxvalue} mm</b><br/>");
        precipErrSeries.setGrouping(false);
        HIDataLabels precipErrDataLabels = new HIDataLabels();
        precipErrDataLabels.setFormatter(new HIFunction("function() { if (this.point.maxvalue > 0) { return this.point.maxvalue; }"));
        precipErrDataLabels.setStyle(new HIStyle());
        precipErrDataLabels.getStyle().setFontSize(8);
        options.getSeries().add(precipErrSeries);


        HIColumn precipSeries = new HIColumn();
        precipSeries.setName("Precipitation");
        precipSeries.setColor(HIColor.initWithHexValue("68CFE8"));
        precipSeries.setYAxis(1);
        precipSeries.setGroupPadding(0);
        precipSeries.setPointPadding(0);
        precipSeries.setGrouping(false);
        HIDataLabels precipDataLabels = new HIDataLabels();
        precipDataLabels.setFormatter(new HIFunction("function () { if (this.y > 0) { return this.y; }"));
        precipSeries.setTooltip(new HITooltip());
        precipSeries.getTooltip().setValueSuffix(" mm");
        options.getSeries().add(precipSeries);

        HISeries airPressureSeries = new HISeries();
        airPressureSeries.setName("Air pressure");
        airPressureSeries.setColor(HIColor.initWithHexValue("21bc5f"));
        airPressureSeries.setMarker(new HIMarker());
        airPressureSeries.getMarker().setEnabled(false);
        airPressureSeries.setTooltip(new HITooltip());
        airPressureSeries.getTooltip().setValueSuffix(" hPa");
        airPressureSeries.setDashStyle("shortdot");
        airPressureSeries.setYAxis(2);
        options.getSeries().add(airPressureSeries);

        HIWindbarb windSeries = new HIWindbarb();
        windSeries.setName("Wind");
        windSeries.setId("windbarbs");
        windSeries.setColor(HIColor.initWithHexValue("0d233a"));
        windSeries.setLineWidth(1.5);
        windSeries.setVectorLength(18);
        windSeries.setYOffset(-15);
        windSeries.setTooltip(new HITooltip());
        windSeries.getTooltip().setValueSuffix(" m/s");
        options.getSeries().add(windSeries);

        return options;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        HIChartView chartView = findViewById(R.id.chartview1);
        HIOptions options = new HIOptions();
        options.setSeries(new ArrayList<>());

        List<Double> dataList = Arrays.asList(29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4);

        HISeries tempSeries = new HISeries();
        tempSeries.setData(new ArrayList<>(dataList));
        options.getSeries().add(tempSeries);

        ArrayList<HIPlotLines> xAxisPlotLines = new ArrayList<>();

        HIPlotLines plotLine = new HIPlotLines();
        plotLine.setColor(HIColor.initWithRGBA(0,0,0,0.5));
        plotLine.setWidth(2);
        plotLine.setValue(4);
        plotLine.setZIndex(10);
        xAxisPlotLines.add(plotLine);

        HIXAxis hixAxis = new HIXAxis();
        hixAxis.setMin(0);
        hixAxis.setMax(15);

        hixAxis.setPlotLines(xAxisPlotLines);
        options.setXAxis(new ArrayList<>(Arrays.asList(hixAxis)));

        chartView.setOptions(options);

//        HIYAxis temperatureAxis = new HIYAxis();
//        temperatureAxis.setTitle(new HITitle());
//        temperatureAxis.getTitle().setText("");
//        HILabels temperatureAxisLabels = new HILabels();
//        temperatureAxisLabels.setFormat("{value}°");
//        temperatureAxisLabels.setX(-3);
//        temperatureAxis.setLabels(temperatureAxisLabels);
//        HIPlotLines temperatureAxisPlotLines = new HIPlotLines(); // zero plane
//        temperatureAxisPlotLines.setValue(0);
//        temperatureAxisPlotLines.setColor(HIColor.initWithHexValue("BBBBBB"));
//        temperatureAxisPlotLines.setWidth(1);
//        temperatureAxisPlotLines.setZIndex(2);
//        temperatureAxis.setPlotLines(new ArrayList<>(Collections.singletonList(temperatureAxisPlotLines)));
//        temperatureAxis.setMaxPadding(0.3);
//        temperatureAxis.setMinRange(8);
//        temperatureAxis.setTickInterval(1);
//        temperatureAxis.setGridLineColor(HIColor.initWithHexValue("F0F0F0"));



//        options.setYAxis(new ArrayList<>(Arrays.asList(temperatureAxis)));


    }
}
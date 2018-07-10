package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HICredits;
import com.highsoft.highcharts.Common.HIChartsClasses.HICrosshair;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIHover;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabel;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotLines;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPosition;
import com.highsoft.highcharts.Common.HIChartsClasses.HIScrollablePlotArea;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStates;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIWindbarb;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView = findViewById(R.id.hc);

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
        title.setText(this.getChartTitle());
        title.setAlign("left");
        HIStyle titleStyle = new HIStyle();
        titleStyle.setWhiteSpace("nowrap");
        titleStyle.setTextOverflow("ellipsis");
        title.setStyle(titleStyle);

        options.setTitle(title);

        HICredits credits = new HICredits();
        credits.setText("Forecast from <a href=\"http://yr.no\">yr.no</a>");
        credits.setHref(this.xml.querySelector("credit link").getAttribute("url"));
        HIPosition creditsPosition = new HIPosition();
        creditsPosition.setX(-40);
        credits.setPosition(creditsPosition);

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
        bottomXAxis.setStartOnTick(false);
        bottomXAxis.setEndOnTick(false);
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
        temperatureAxis.getTitle().setText(null);
        HILabels temperatureAxisLabels = new HILabels();
        temperatureAxisLabels.setFormat("{value}°");
        temperatureAxisLabels.setStyle(new HIStyle());
        temperatureAxisLabels.getStyle().setFontSize("10px");
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

        HIYAxis precipitationAxis = new HIYAxis();
        precipitationAxis.setTitle(new HITitle());
        precipitationAxis.getTitle().setText(null);
        precipitationAxis.setLabels(new HILabels());
        precipitationAxis.getLabels().setEnabled(false);
        precipitationAxis.setGridLineWidth(0);
        precipitationAxis.setTickLength(0);
        precipitationAxis.setMinRange(10);
        precipitationAxis.setMin(0);

        HIYAxis airPressure = new HIYAxis();
        airPressure.setAllowDecimals(false);
        HITitle airPressureTitle = new HITitle();
        airPressureTitle.setText("hPa");
        airPressureTitle.setOffset(0);
        airPressureTitle.setAlign("high");
        airPressureTitle.setRotation(0);
        airPressureTitle.setStyle(new HIStyle());
        airPressureTitle.getStyle().setFontSize("10px");
        airPressureTitle.getStyle().setColor("#bbc21");
        airPressureTitle.setAlign("left");
        airPressureTitle.setX(3);
        HILabels airPressureLabels = new HILabels();
        airPressureLabels.setStyle(new HIStyle());
        airPressureLabels.getStyle().setFontSize("8px");
        airPressureLabels.getStyle().setColor("bbc21");
        airPressureLabels.setY(2);
        airPressureLabels.setX(3);
        airPressure.setLabels(airPressureLabels);
        airPressure.setGridLineWidth(0);
        airPressure.setOpposite(true);
        airPressure.setShowLastLabel(false);

        options.setYAxis(new ArrayList<>(Arrays.asList(temperatureAxis, precipitationAxis, airPressure)));

        options.setLegend(new HILegend());
        options.getLegend().setEnabled(false);

        options.setPlotOptions(new HIPlotOptions());
        options.getPlotOptions().setSeries(new HISeries());
        options.getPlotOptions().getSeries().setPointPlacement("between");

        options.setSeries(new ArrayList<>());

        HISpline temperatureSeries = new HISpline();
        temperatureSeries.setName("Temperature");
        temperatureSeries.setData(this.temperatures);
        HIMarker temperatureMarker = new HIMarker();
        temperatureMarker.setEnabled(false);
        temperatureMarker.setStates(new HIStates());
        temperatureMarker.getStates().setHover(new HIHover());
        temperatureMarker.getStates().getHover().setEnabled(true);
        temperatureSeries.setMarker(temperatureMarker);
        temperatureSeries.setTooltip(new HITooltip());
        temperatureSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.value}°C</b><br/>");
        temperatureSeries.setZIndex(1);
        temperatureSeries.setColor(HIColor.initWithHexValue("FF3333"));
        temperatureSeries.setNegativeColor(HIColor.initWithHexValue("48AFE8"));
        options.getSeries().add(temperatureSeries);

        HIColumn precipErrSeries = new HIColumn();
        precipErrSeries.setName("Precipitation");
        precipErrSeries.setData(this.precipitationsError);
//        precipErrSeries.setColor(); // 'url(#precipitation-error)' ??!!
        precipErrSeries.setYAxis(1);
        precipErrSeries.setGroupPadding(0);
        precipErrSeries.setPointPadding(0);
        precipErrSeries.setTooltip(new HITooltip());
        precipErrSeries.getTooltip().setValueSuffix(" mm");
        precipErrSeries.getTooltip().setPointFormat("<span style=\"color:{point.color}\">\\u25CF</span> {series.name}: <b>{point.minvalue} mm - {point.maxvalue} mm</b><br/>");
        precipErrSeries.setGrouping(false);
        HIDataLabels precipErrDataLabels = new HIDataLabels();
        precipErrDataLabels.setEnabled(meteogram.hasPrecipitationError);
        precipErrDataLabels.setFormatter(new HIFunction("function() { if (this.point.maxvalue > 0) { return this.point.maxvalue; }"));
        precipErrDataLabels.setStyle(new HIStyle());
        precipErrDataLabels.getStyle().setFontSize("8px");
        precipErrDataLabels.getStyle().setColor("gray");
        options.getSeries().add(precipErrSeries);

        HIColumn precipSeries = new HIColumn();
        precipSeries.setName("Precipitation");
        precipSeries.setData(this.precipitations);
        precipSeries.setColor(HIColor.initWithHexValue("68CFE8"));
        precipSeries.setYAxis(1);
        precipSeries.setGroupPadding(0);
        precipSeries.setPointPadding(0);
        precipSeries.setGrouping(false);
        HIDataLabels precipDataLabels = new HIDataLabels();
        precipDataLabels.setEnabled(!meteogram.hasPrecipitationError);
        precipDataLabels.setFormatter(new HIFunction("function () { if (this.y > 0) { return this.y; }"));
        precipDataLabels.setStyle(new HIStyle());
        precipDataLabels.getStyle().setFontSize("8px");
        precipDataLabels.getStyle().setColor("gray");
        precipSeries.setTooltip(new HITooltip());
        precipSeries.getTooltip().setValueSuffix(" mm");
        options.getSeries().add(precipSeries);

        HISeries airPressureSeries = new HISeries();
        airPressureSeries.setName("Air pressure");
        airPressureSeries.setColor(HIColor.initWithHexValue("bbc21"));
        airPressureSeries.setData(this.pressures);
        airPressureSeries.setMarker(new HIMarker());
        airPressureSeries.getMarker().setEnabled(false);
        airPressureSeries.setShadow(false);
        airPressureSeries.setTooltip(new HITooltip());
        airPressureSeries.getTooltip().setValueSuffix(" hPa");
        airPressureSeries.setDashStyle("shortdot");
        airPressureSeries.setYAxis(2);
        options.getSeries().add(airPressureSeries);

        HIWindbarb windSeries = new HIWindbarb();
        windSeries.setId("windbarbs");
        windSeries.setColor(HIColor.initWithHexValue("0d233a"));
        windSeries.setLineWidth(1.5);
        windSeries.setData(this.winds);
        windSeries.setVectorLength(18);
        windSeries.setYOffset(-15);
        windSeries.setTooltip(new HITooltip());
        windSeries.getTooltip().setValueSuffix(" m/s");
        options.getSeries().add(windSeries);

        chartView.setOptions(options);
    }

    private String getChartTitle(){
       return "Meteogram for " + this.xml.querySelector("location name").textContent
               + ", " + this.xml.querySelector("location country").textContent;
    }
    /**
     * This method is just for demo purposes.
     * You can pass as an argument your data (e.g. from file)
     * create indexes dynamically by iterating over data.
     *
     * Values put under the "y" key are the relative performance in percents,
     * actual value is not used to create the chart but it is seen in the tooltip
     *
     * @return generated random data with relative performance
     */
    ArrayList<HashMap<String, Object>> generateRandomData(){
        ArrayList<HashMap<String, Object>> data = new ArrayList<>();
        HashMap<String, Object> firstPoint = new HashMap<>();
        Random r = new Random();
        int firstValue = (r.nextInt((20000 - 10000) + 1 ) + 10000);
        firstPoint.put("y", 0.0);
        firstPoint.put("actualValue", firstValue);
        data.add(firstPoint);
        for(int i = 0 ; i<30; i++){
            HashMap<String, Object> singlePoint = new HashMap<>();
            int actualValue = (r.nextInt((20000 - 10000) + 1 ) + 10000);
            double indexedValue = (double)actualValue/(double)firstValue;
            singlePoint.put("y", indexedValue);
            singlePoint.put("actualValue", actualValue);
            data.add(singlePoint);
        }
        return data;
    }
}
package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
        
        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.zoomType = "xy";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Average Monthly Weather Data for Tokyo";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: WorldClimate.com";
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        xaxis.crosshair = new HICrosshair();
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.labels = new HILabels();
        yaxis1.labels.format = "{value}°C";
        yaxis1.labels.style = new HIStyle();
        yaxis1.labels.style.color = "#90ed7d";
        yaxis1.title = new HITitle();
        yaxis1.title.text = "Temperature";
        yaxis1.title.style = new HIStyle();
        yaxis1.title.style.color = "#90ed7d";
        yaxis1.opposite = true;

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.gridLineWidth = 0;
        yaxis2.labels = new HILabels();
        yaxis2.labels.format = "{value} mm";
        yaxis2.labels.style = new HIStyle();
        yaxis2.labels.style.color = "#7cb5ec";
        yaxis2.title = new HITitle();
        yaxis2.title.text = "Rainfall";
        yaxis2.title.style = new HIStyle();
        yaxis2.title.style.color = "#7cb5ec";

        HIYAxis yaxis3 = new HIYAxis();
        yaxis3.gridLineWidth = 0;
        yaxis3.labels = new HILabels();
        yaxis3.labels.format = "{value} mb";
        yaxis3.labels.style = new HIStyle();
        yaxis3.labels.style.color = "#434348";
        yaxis3.title = new HITitle();
        yaxis3.title.text = "Sea-Level Pressure";
        yaxis3.title.style = new HIStyle();
        yaxis3.title.style.color = "#434348";
        yaxis3.opposite = true;
        options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2, yaxis3));

        HITooltip tooltip = new HITooltip();
        tooltip.shared = true;
        options.tooltip = tooltip;

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "left";
        legend.x = 80;
        legend.verticalAlign = "top";
        legend.y = 60;
        legend.floating = true;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        options.legend = legend;

        HIColumn column = new HIColumn();
        column.type = "column";
        column.name = "Rainfall";
        column.yAxis = 1;
        Number[] columnData = new Number[] { 49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.data = new ArrayList<>(Arrays.asList(columnData));
        column.tooltip = new HITooltip();
        column.tooltip.valueSuffix = " mm";

        HISpline spline1 = new HISpline();
        spline1.type = "spline";
        spline1.name = "Sea-level Pressure";
        spline1.yAxis = 2;
        Number[] spline1Data = new Number[] { 1016, 1016, 1015.9, 1015.5, 1012.3, 1009.5, 1009.6, 1010.2, 1013.1, 1016.9, 1018.2, 1016.7 };
        spline1.data = new ArrayList<>(Arrays.asList(spline1Data));
        spline1.marker = new HIMarker();
        spline1.marker.enabled = false;
        spline1.dashStyle = "shortdot";
        spline1.tooltip = new HITooltip();
        spline1.tooltip.valueSuffix = " mb";

        HISpline spline2 = new HISpline();
        spline2.type = "spline";
        spline2.name = "Temperature";
        Number[] spline2Data = new Number[] { 7, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
        spline2.data = new ArrayList<>(Arrays.asList(spline2Data));
        spline2.tooltip = new HITooltip();
        spline2.tooltip.valueSuffix = "°C";

        options.series = new ArrayList<>(Arrays.asList(column, spline1, spline2));

        chartView.options = options;
    }
}
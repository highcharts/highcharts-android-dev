package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
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
        title.text = "Temperature vs Rainfall";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.labels = new HILabels();
        yaxis1.labels.format = "{value} °C";
        yaxis1.labels.style = new HIStyle();
        yaxis1.labels.style.color = "#434348";
        yaxis1.title = new HITitle();
        yaxis1.title.text = "Temperature";
        yaxis1.title.style = new HIStyle();
        yaxis1.title.style.color = "#434348";

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.labels = new HILabels();
        yaxis2.labels.format = "{value} mm";
        yaxis2.labels.style = new HIStyle();
        yaxis2.labels.style.color = "#7cb5ec";
        yaxis2.title = new HITitle();
        yaxis2.title.text = "Rainfall";
        yaxis2.title.style = new HIStyle();
        yaxis2.title.style.color = "#7cb5ec";
        yaxis2.opposite = true;

        options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

        HITooltip tooltip = new HITooltip();
        tooltip.shared = true;
        options.tooltip = tooltip;

        HIColumn column = new HIColumn();
        column.type = "column";
        column.name = "Rainfall";
        column.yAxis = 1;
        Number[] columnData = new Number[] {49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.data = new ArrayList<>(Arrays.asList(columnData));
        column.tooltip = new HITooltip();
        column.tooltip.pointFormat = "<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f} mm</b> ";

        HIErrorbar errorbar1 = new HIErrorbar();
        errorbar1.type = "errorbar";
        errorbar1.name = "Rainfall error";
        errorbar1.yAxis = 1;
        Number[][] errorbar1Data = new Number[][]{
                {48, 51},
                {68, 73},
                {92, 110},
                {128, 136},
                {140, 150},
                {171, 179},
                {135, 143},
                {142, 149},
                {204, 220},
                {189, 199},
                {95, 110},
                {52, 56}
        };
        errorbar1.data = new ArrayList<>(Arrays.asList(errorbar1Data));
        errorbar1.showInLegend = false;
        errorbar1.tooltip = new HITooltip();
        errorbar1.tooltip.pointFormat = "(error range: {point.low}-{point.high} mm)<br/>";

        HISpline spline = new HISpline();
        spline.type = "spline";
        spline.name = "Temperature";
        Number[] splineData = new Number[] { 7, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
        spline.data = new ArrayList<>(Arrays.asList(splineData));
        spline.tooltip = new HITooltip();
        spline.tooltip.pointFormat = "<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f}°C</b> ";

        HIErrorbar errorbar2 = new HIErrorbar();
        errorbar2.type = "errorbar";
        errorbar2.name = "Temperature error";
        Number[][] errorbar2Data = new Number[][]{
                {6, 8},
                {5.9, 7.6},
                {9.4, 10.4},
                {14.1, 15.9},
                {18, 20.1},
                {21, 24},
                {23.2, 25.3},
                {26.1, 27.8},
                {23.2, 23.9},
                {18, 21.1},
                {12.9, 14},
                {7.6, 10}
        };
        errorbar2.showInLegend = false;
        errorbar2.data = new ArrayList<>(Arrays.asList(errorbar2Data));
        errorbar2.tooltip = new HITooltip();
        errorbar2.tooltip.pointFormat = "(error range: {point.low}-{point.high}°C)<br/>";

        options.series = new ArrayList<>(Arrays.asList(column, errorbar1, spline, errorbar2));

        chartView.options = options;
    }
}

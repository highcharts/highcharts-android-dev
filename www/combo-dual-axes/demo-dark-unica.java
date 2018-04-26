package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
        
        chartView.theme = "dark-unica";
        
        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.zoomType = "xy";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Average Monthly Temperature and Rainfall in Tokyo";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: WorldClimate.com";

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        xaxis.crosshair = new HICrosshair();
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.labels = new HILabels();
        yaxis1.labels.format = "{value}°C";
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

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "left";
        legend.x = 120;
        legend.verticalAlign = "top";
        legend.y = 100;
        legend.floating = true;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        options.legend = legend;

        HIColumn column = new HIColumn();
        column.type = "column";
        column.name = "Rainfall";
        column.yAxis = 1;
        Number[] columnData = new Number[] {49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.data = new ArrayList<>(Arrays.asList(columnData));
        column.tooltip = new HITooltip();
        column.tooltip.valueSuffix = " mm";

        HISpline spline = new HISpline();
        spline.type = "spline";
        spline.name = "Temperature";
        Number[] splineData = new Number[] { 7, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
        spline.data = new ArrayList<>(Arrays.asList(splineData));
        spline.tooltip = new HITooltip();
        spline.tooltip.valueSuffix = "°C";

        options.series = new ArrayList<>(Arrays.asList(column, spline));

        chartView.options = options;
    }
}
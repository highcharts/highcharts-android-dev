package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "solidgauge";
        chart.marginTop = 50;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Activity";
        title.style = new HIStyle();
        title.style.fontSize = "24px";
        options.title = title;

        HITooltip tooltip = new HITooltip();
        tooltip.borderWidth = 0;
        tooltip.backgroundColor = HIColor.initWithName("none");
        tooltip.shadow = false;
        tooltip.style = new HIStyle();
        tooltip.style.fontSize = "16px";
        tooltip.pointFormat = "'{series.name}<br><span style=\"font-size:2em; color: {point.color}; font-weight: bold\">{point.y}%</span>'";
        tooltip.positioner = new HIGFunction("function (labelWidth) { return { x: 200 - labelWidth / 2, y: 180 }; }", true);
        options.tooltip = tooltip;

        HIPane pane = new HIPane();
        pane.startAngle = 0;
        pane.endAngle = 360;

        HIBackground paneBackground1 = new HIBackground();
        paneBackground1.outerRadius = "112%";
        paneBackground1.innerRadius = "88%";
        paneBackground1.backgroundColor = HIColor.initWithRGBA(106, 165, 231, 0.35);
        paneBackground1.borderWidth = 0;

        HIBackground paneBackground2 = new HIBackground();
        paneBackground2.outerRadius = "87%";
        paneBackground2.innerRadius = "63%";
        paneBackground2.backgroundColor = HIColor.initWithRGBA(51, 52, 56, 0.35);
        paneBackground2.borderWidth = 0;

        HIBackground paneBackground3 = new HIBackground();
        paneBackground3.outerRadius = "62%";
        paneBackground3.innerRadius = "38%";
        paneBackground3.backgroundColor = HIColor.initWithRGBA(130, 238, 106, 0.35);
        paneBackground3.borderWidth = 0;

        pane.background = new ArrayList<>(Arrays.asList(paneBackground1, paneBackground2, paneBackground3));
        options.pane = pane;

        HIYAxis yaxis = new HIYAxis();
        yaxis.min = 0;
        yaxis.max = 100;
        yaxis.lineWidth = 0;
        yaxis.tickPosition = "[]";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.solidgauge = new HISolidgauge();
        plotOptions.solidgauge.dataLabels = new HIDataLabels();
        plotOptions.solidgauge.dataLabels.enabled = false;
        plotOptions.solidgauge.linecap = "round";
        plotOptions.solidgauge.stickyTracking = false;
        plotOptions.solidgauge.rounded = true;
        options.plotOptions = plotOptions;

        HISolidgauge solidgauge1 = new HISolidgauge();
        solidgauge1.name = "Move";
        HIData data1 = new HIData();
        data1.color = HIColor.initWithRGB(106, 165, 231);
        data1.radius = "112%";
        data1.innerRadius = "88%";
        data1.y = 80;
        solidgauge1.data = new ArrayList<>(Collections.singletonList(data1));

        HISolidgauge solidgauge2 = new HISolidgauge();
        solidgauge2.name = "Exercise";
        HIData data2 = new HIData();
        data2.color = HIColor.initWithRGB(51, 52, 56);
        data2.radius = "87%";
        data2.innerRadius = "63%";
        data2.y = 65;
        solidgauge2.data = new ArrayList<>(Collections.singletonList(data2));

        HISolidgauge solidgauge3 = new HISolidgauge();
        solidgauge3.name = "Stand";
        HIData data3 = new HIData();
        data3.color = HIColor.initWithRGB(130, 238, 106);
        data3.radius = "62%";
        data3.innerRadius = "38%";
        data3.y = 50;
        solidgauge3.data = new ArrayList<>(Collections.singletonList(data3));
        
        options.series = new ArrayList<>(Arrays.asList(solidgauge1, solidgauge2, solidgauge3));

        chartView.options = options;
    }
}

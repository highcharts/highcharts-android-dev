package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("bubble");
        chart.setPlotBorderWidth(1);
        chart.setZoomType("xy");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Highcharts bubbles with radial gradient fill");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setGridLineWidth(1);
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setStartOnTick(false);
        yaxis.setEndOnTick(false);
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HIBubble bubble1 = new HIBubble();
        Number[][] series1Data = new Number[][] {
                {9, 81, 63},
                {98, 5, 89},
                {51, 50, 73},
                {41, 22, 14},
                {58, 24, 20},
                {78, 37, 34},
                {55, 56, 53},
                {18, 45, 70},
                {42, 44, 28},
                {3, 52, 59},
                {31, 18, 97},
                {79, 91, 63},
                {93, 23, 23},
                {44, 83, 22}
        };
        bubble1.setData(new ArrayList<>(Arrays.asList(series1Data)));
        bubble1.setMarker(new HIMarker());

        HIGradient gradient = new HIGradient(0.4f, 0.3f, 0.7f);

        LinkedList<HIStop> stops = new LinkedList<>();
        stops.add(new HIStop(0, HIColor.initWithRGBA(255, 255, 255, 0.5)));
        stops.add(new HIStop(1, HIColor.initWithRGBA(124, 181, 236, 0.5)));

        bubble1.getMarker().setFillColor(HIColor.initWithRadialGradient(gradient, stops));

        HIBubble bubble2 = new HIBubble();
        Number[][] series2Data = new Number[][] {
                {42, 38, 20},
                {6, 18, 1},
                {1, 93, 55},
                {57, 2, 90},
                {80, 76, 22},
                {11, 74, 96},
                {88, 56, 10},
                {30, 47, 49},
                {57, 62, 98},
                {4, 16, 16},
                {46, 10, 11},
                {22, 87, 89},
                {57, 91, 82},
                {45, 15, 98}
        };
        bubble2.setData(new ArrayList<>(Arrays.asList(series2Data)));
        bubble2.setMarker(new HIMarker());

        LinkedList<HIStop> stops2 = new LinkedList<>();
        stops2.add(new HIStop(0, HIColor.initWithRGBA(255, 255, 255, 0.5)));
        stops2.add(new HIStop(1, HIColor.initWithRGBA(67, 67, 72, 0.5)));

        bubble2.getMarker().setFillColor(HIColor.initWithRadialGradient(gradient, stops2));

        options.setSeries(new ArrayList<>(Arrays.asList(bubble1, bubble2)));

        chartView.setOptions(options);
    }
}

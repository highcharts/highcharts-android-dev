package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

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

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "bubble";
        chart.plotBorderWidth = 1;
        chart.zoomType = "xy";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Highcharts bubbles with radial gradient fill";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.gridLineWidth = 1;
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.startOnTick = false;
        yaxis.endOnTick = false;
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

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
        bubble1.data = new ArrayList<>(Arrays.asList(series1Data));
        bubble1.marker = new HIMarker();
        HashMap<String, Number> gradientPoints = new HashMap<>();
        gradientPoints.put("cx", 0.4);
        gradientPoints.put("cy", 0.3);
        gradientPoints.put("r", 0.7);
        List<List> gradientColors = new LinkedList<>();
        List<Object> l1 = new LinkedList<>();
        l1.add(0);
        l1.add("rgba(255,255,255,0.5)");
        List<Object> l2 = new LinkedList<>();
        l2.add(1);
        l2.add("rgba(124,181,236,0.5)");
        gradientColors.add(l1);
        gradientColors.add(l2);
        bubble1.marker.fillColor = HIColor.initWithRadialGradient(gradientPoints, gradientColors);

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
        bubble2.data = new ArrayList<>(Arrays.asList(series2Data));
        bubble2.marker = new HIMarker();
        HashMap<String, Number> gradientPoints2 = new HashMap<>();
        gradientPoints2.put("cx", 0.4);
        gradientPoints2.put("cy", 0.3);
        gradientPoints2.put("r", 0.7);
        List<List> gradientColors2 = new LinkedList<>();
        List<Object> l11 = new LinkedList<>();
        l11.add(0);
        l11.add("rgba(255,255,255,0.5)");
        List<Object> l22 = new LinkedList<>();
        l22.add(1);
        l22.add("rgba(67,67,72,0.5)");
        gradientColors2.add(l11);
        gradientColors2.add(l22);
        bubble2.marker.fillColor = HIColor.initWithRadialGradient(gradientPoints2, gradientColors2);


        options.series = new ArrayList<>(Arrays.asList(bubble1, bubble2));

        chartView.options = options;
    }
}

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
        
        chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        options.chart = new HIChart();

        HITitle title = new HITitle();
        title.text = "Scatter plot with regression line";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.min = -0.5;
        xaxis.max = 5.5;
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.min = 0;
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HILine line = new HILine();
        line.name = "Regression Line";
        Number[][] lineData = new Number[][] { {0, 1.11}, {5, 4.51} };
        line.data = new ArrayList<>(Arrays.asList(lineData));
        line.marker = new HIMarker();
        line.marker.enabled = false;
        HIStates state = new HIStates();
        state.hover = new HIHover();
        state.hover.lineWidth = 0;
        line.states = state;
        line.enableMouseTracking = false;

        HIScatter scatter = new HIScatter();
        scatter.type = "scatter";
        scatter.name = "Observations";
        Number[] scatterData = new Number[] { 1, 1.5, 2.8, 3.5, 3.9, 4.2 };
        scatter.data = new ArrayList<>(Arrays.asList(scatterData));
        scatter.marker = new HIMarker();
        scatter.marker.radius = 4;

        options.series = new ArrayList<>(Arrays.asList(line, scatter));

        chartView.options = options;
    }
}
package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private Number[] data = new Number[] {
            3.5, 3, 3.2, 3.1, 3.6, 3.9, 3.4, 3.4, 2.9, 3.1, 3.7, 3.4, 3, 3, 4,
            4.4, 3.9, 3.5, 3.8, 3.8, 3.4, 3.7, 3.6, 3.3, 3.4, 3, 3.4, 3.5, 3.4, 3.2,
            3.1, 3.4, 4.1, 4.2, 3.1, 3.2, 3.5, 3.6, 3, 3.4, 3.5, 2.3, 3.2, 3.5, 3.8, 3,
            3.8, 3.2, 3.7, 3.3, 3.2, 3.2, 3.1, 2.3, 2.8, 2.8, 3.3, 2.4, 2.9, 2.7, 2, 3,
            2.2, 2.9, 2.9, 3.1, 3, 2.7, 2.2, 2.5, 3.2, 2.8, 2.5, 2.8, 2.9, 3, 2.8, 3,
            2.9, 2.6, 2.4, 2.4, 2.7, 2.7, 3, 3.4, 3.1, 2.3, 3, 2.5, 2.6, 3, 2.6, 2.3,
            2.7, 3, 2.9, 2.9, 2.5, 2.8, 3.3, 2.7, 3, 2.9, 3, 3, 2.5, 2.9, 2.5, 3.6,
            3.2, 2.7, 3, 2.5, 2.8, 3.2, 3, 3.8, 2.6, 2.2, 3.2, 2.8, 2.8, 2.7, 3.3, 3.2,
            2.8, 3, 2.8, 3, 2.8, 3.8, 2.8, 2.8, 2.6, 3, 3.4, 3.1, 3, 3.1, 3.1, 3.1, 2.7,
            3.2, 3.3, 3, 2.5, 3, 3.4, 3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";        
	chartView.plugins = new ArrayList<String>(){{add("histogram-bellcurve");}};
	
        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "bellcurve";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Bell curve";
        options.title = title;

        HIXAxis xaxis1 = new HIXAxis();
        xaxis1.title = new HITitle();
        xaxis1.title.text = "Data";

        HIXAxis xaxis2 = new HIXAxis();
        xaxis2.title = new HITitle();
        xaxis2.title.text = "Bell curve";
        xaxis2.opposite = true;

        options.xAxis = new ArrayList<>(Arrays.asList(xaxis1, xaxis2));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.title = new HITitle();
        yaxis1.title.text = "Data";

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.title = new HITitle();
        yaxis2.title.text = "Bell curve";
        yaxis2.opposite = true;

        options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

        HIBellcurve bellcurve = new HIBellcurve();
        bellcurve.name = "Bell curve";
        bellcurve.xAxis = 1;
        bellcurve.yAxis = 1;
        bellcurve.baseSeries = 1;
        bellcurve.zIndex = -1;

        HIScatter scatter = new HIScatter();
        scatter.name = "Data";
        scatter.type = "scatter";
        scatter.data = new ArrayList<>(Arrays.asList(this.data));
        scatter.marker = new HIMarker();
        scatter.marker.radius = 1.5;

        options.series = new ArrayList<>(Arrays.asList(bellcurve, scatter));

        chartView.options = options;
    }
}

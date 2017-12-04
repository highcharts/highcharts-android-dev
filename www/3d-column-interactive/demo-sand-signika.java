package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

        chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.renderTo = "container";
        chart.type = "column";
        chart.options3d = new HIOptions3d();
        chart.options3d.enabled = true;
        chart.options3d.alpha = 15;
        chart.options3d.beta = 15;
        chart.options3d.depth = 50;
        chart.options3d.viewDistance = 25;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Chart rotation demo";
        options.title = title;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.column = new HIColumn();
        plotOptions.column.depth = 25;
        options.plotOptions = plotOptions;

        HIColumn series1 = new HIColumn();
        Number[] series1_data = new Number[] { 29.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<>(Arrays.asList(series1));

        chartView.options = options;
    }
}


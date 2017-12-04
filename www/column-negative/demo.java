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

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Column chart with negative values";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HICredits credits = new HICredits();
        credits.enabled = false;
        options.credits = credits;

        HIColumn series1 = new HIColumn();
        series1.name = "John";
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HIColumn series2 = new HIColumn();
        series2.name = "Jane";
        Number[] series2_data = new Number[] {2, -2, -3, 2, 1};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        HIColumn series3 = new HIColumn();
        series3.name = "Joe";
        Number[] series3_data = new Number[] {3, 4, 4, -2, 5};
        series3.data = new ArrayList<>(Arrays.asList(series3_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2, series3));


        chartView.options = options;
    }
}


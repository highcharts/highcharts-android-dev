package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("area");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Area chart with negative values");
        options.setTitle(title);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HIArea series1 = new HIArea();
        series1.setName("John");
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        HIArea series2 = new HIArea();
        series2.setName("Jane");
        Number[] series2_data = new Number[] {2, -2, -3, 2, 1};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        HIArea series3 = new HIArea();
        series3.setName("Joe");
        Number[] series3_data = new Number[] {3, 4, 4, -2, 5};
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));

        chartView.setOptions(options);
    }
}


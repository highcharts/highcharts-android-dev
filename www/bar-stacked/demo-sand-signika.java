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

        chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "bar";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Stacked bar chart";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.min = 0;
        yAxis.title = new HITitle();
        yAxis.title.text = "Total fruit consumption";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HILegend legend = new HILegend();
        legend.reversed = true;
        options.legend = legend;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.series = new HISeries();
        plotOptions.series.stacking = "normal";
        options.plotOptions = plotOptions;

        HIBar series1 = new HIBar();
        series1.name = "John";
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HIBar series2 = new HIBar();
        series2.name = "Jane";
        Number[] series2_data = new Number[] {2, 2, 3, 2, 1};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        HIBar series3 = new HIBar();
        series3.name = "Joe";
        Number[] series3_data = new Number[] {3, 4, 4, 2, 5};
        series3.data = new ArrayList<>(Arrays.asList(series3_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2, series3));


        chartView.options = options;
    }
}


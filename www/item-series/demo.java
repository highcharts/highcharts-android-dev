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
	chartView.plugins = new ArrayList<>(Arrays.asList("item-series"));

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "item";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Highcharts item chart";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.gridLineWidth = 0;
        yAxis.labels = new HILabels();
        yAxis.labels.enabled = false;
        yAxis.title = new HITitle();
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.series = new HISeries();
        plotOptions.series.stacking = "normal";
        options.plotOptions = plotOptions;

        HIItem series1 = new HIItem();
        series1.name = "Items bought";
        Number[] series1_data = new Number[] {5, 3, 4};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        series1.color = HIColor.initWithName("green");
        HIItem series2 = new HIItem();
        series2.name = "Items sold";
        Number[] series2_data = new Number[] {0, 2, 1};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        series2.color = HIColor.initWithName("red");
        options.series = new ArrayList<>(Arrays.asList(series1, series2));


        chartView.options = options;
    }
}


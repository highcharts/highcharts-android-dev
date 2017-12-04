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
        chart.type = "line";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Monthly Average Temperature";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: WorldClimate.com";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Temperature (°C)";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.line = new HILine();
        plotOptions.line.dataLabels = new HIDataLabels();
        plotOptions.line.dataLabels.enabled = true;
        plotOptions.line.enableMouseTracking = false;
        options.plotOptions = plotOptions;

        HILine series1 = new HILine();
        series1.name = "Tokyo";
        Number[] series1_data = new Number[] {7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HILine series2 = new HILine();
        series2.name = "London";
        Number[] series2_data = new Number[] {3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2));


        chartView.options = options;
    }
}


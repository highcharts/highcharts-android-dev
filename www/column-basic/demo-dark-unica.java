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

        chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Monthly Average Rainfall";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: WorldClimate.com";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        xAxis.crosshair = new HICrosshair();
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.min = 0;
        yAxis.title = new HITitle();
        yAxis.title.text = "Rainfall (mm)";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.headerFormat = "<span style=\"font-size:10px\">{point.key}</span><table>";
        tooltip.pointFormat = "<tr><td style=\"color:{series.color};padding:0\">{series.name}: </td><td style=\"padding:0\"><b>{point.y:.1f} mm</b></td></tr>";
        tooltip.footerFormat = "</table>";
        tooltip.shared = true;
        tooltip.useHTML = true;
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.column = new HIColumn();
        plotOptions.column.pointPadding = 0.2;
        plotOptions.column.borderWidth = 0;
        options.plotOptions = plotOptions;

        HIColumn series1 = new HIColumn();
        series1.name = "Tokyo";
        Number[] series1_data = new Number[] {49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HIColumn series2 = new HIColumn();
        series2.name = "New York";
        Number[] series2_data = new Number[] {83.6, 78.8, 98.5, 93.4, 106.0, 84.5, 105.0, 104.3, 91.2, 83.5, 106.6, 92.3};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        HIColumn series3 = new HIColumn();
        series3.name = "London";
        Number[] series3_data = new Number[] {48.9, 38.8, 39.3, 41.4, 47.0, 48.3, 59.0, 59.6, 52.4, 65.2, 59.3, 51.2};
        series3.data = new ArrayList<>(Arrays.asList(series3_data));
        HIColumn series4 = new HIColumn();
        series4.name = "Berlin";
        Number[] series4_data = new Number[] {42.4, 33.2, 34.5, 39.7, 52.6, 75.5, 57.4, 60.4, 47.6, 39.1, 46.8, 51.1};
        series4.data = new ArrayList<>(Arrays.asList(series4_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2, series3, series4));


        chartView.options = options;
    }
}


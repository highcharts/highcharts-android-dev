package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;
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
        chart.type = "spline";
        chart.inverted = true;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Atmosphere Temperature by Altitude";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "According to the Standard Atmosphere Model";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        xAxis.reversed = false;
        xAxis.title = new HITitle();
        xAxis.title.text = "Altitude";
        xAxis.labels = new HILabels();
        xAxis.labels.formatter = new HIGFunction("function () { return this.value + 'km'; }", true);
        xAxis.maxPadding = 0.05;
        xAxis.showLastLabel = true;
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Temperature";
        yAxis.labels = new HILabels();
        yAxis.labels.formatter = new HIGFunction("function () { return this.value + ''; }", true);
        yAxis.lineWidth = 2;
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.headerFormat = "<b>{series.name}</b><br/>";
        tooltip.pointFormat = "{point.x}'km': {point.y}C";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.spline = new HISpline();
        plotOptions.spline.marker = new HIMarker();
        plotOptions.spline.marker.enabled = false;
        options.plotOptions = plotOptions;

        HISpline series1 = new HISpline();
        series1.name = "Temperature";
        Number[][] series1_data = new Number[][] {{0, 15}, {10, -50}, {20, -56.5}, {30, -46.5}, {40, -22.1}, {50, -2.5}, {60, -27.7}, {70, -55.7}, {80, -76.5}};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}


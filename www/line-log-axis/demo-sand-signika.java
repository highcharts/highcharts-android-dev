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

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Logarithmic axis demo";
        options.title = title;


        HIXAxis xaxis = new HIXAxis();
        xaxis.tickInterval = 1;
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.type = "logarithmic";
        yaxis.minorTickInterval = 0.1;
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HITooltip tooltip = new HITooltip();
        tooltip.headerFormat = "<b>{series.name}</b><br />";
        tooltip.pointFormat = "x = {point.x}, y = {point.y}";
        options.tooltip = tooltip;

        HILine line1 = new HILine();
        line1.pointStart = 1;
        line1.data = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512));
        options.series = new ArrayList<>(Collections.singletonList(line1));

        chartView.options = options;
    }
}

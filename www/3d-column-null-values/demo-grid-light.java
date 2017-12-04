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

        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "column";
        chart.options3d = new HIOptions3d();
        chart.options3d.enabled = true;
        chart.options3d.alpha = 10;
        chart.options3d.beta = 25;
        chart.options3d.depth = 70;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "3D chart with null values";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Notice the difference between a 0 value and a null point";
        options.subtitle = subtitle;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.column = new HIColumn();
        plotOptions.column.depth = 25;
        options.plotOptions = plotOptions;

        HIXAxis xAxis = new HIXAxis();
        String[] shortMonths = new String[] { "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
        xAxis.categories = new ArrayList<>(Arrays.asList(shortMonths));
        xAxis.labels = new HILabels();
        xAxis.labels.skew3d = true;
        xAxis.labels.style = new HIStyle();
        xAxis.labels.style.fontSize = "16px";
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HIColumn series1 = new HIColumn();
        series1.name = "Sales";
        series1.data = new ArrayList<>(Arrays.asList(2, 3, null, 4, 0, 5, 1, 4, 6, 3));
        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}

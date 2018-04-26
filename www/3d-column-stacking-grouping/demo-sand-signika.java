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
        chart.type = "column";
        chart.options3d = new HIOptions3d();
        chart.options3d.enabled = true;
        chart.options3d.alpha = 15;
        chart.options3d.beta = 15;
        chart.options3d.viewDistance = 25;
        chart.options3d.depth = 40;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Total fruit consumption, grouped by gender";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        xAxis.labels = new HILabels();
        xAxis.labels.skew3d = true;
        xAxis.labels.style = new HIStyle();
        xAxis.labels.style.fontSize = "16px";
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.allowDecimals = false;
        yAxis.min = 0;
        yAxis.title = new HITitle();
        yAxis.title.text = "Number of fruits";
        yAxis.title.skew3d = true;
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.headerFormat = "<b>{point.key}</b><br>";
        tooltip.pointFormat = "<span style=\"color:{series.color}\"></span> {series.name}: {point.y} / {point.stackTotal}";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.column = new HIColumn();
        plotOptions.column.stacking = "normal";
        plotOptions.column.depth = 40;
        options.plotOptions = plotOptions;

        HIColumn series1 = new HIColumn();
        series1.name = "John";
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        series1.stack = "male";
        HIColumn series2 = new HIColumn();
        series2.name = "Joe";
        Number[] series2_data = new Number[] {3, 4, 4, 2, 5};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        series2.stack = "male";
        HIColumn series3 = new HIColumn();
        series3.name = "Jane";
        Number[] series3_data = new Number[] {2, 5, 6, 2, 1};
        series3.data = new ArrayList<>(Arrays.asList(series3_data));
        series3.stack = "female";
        HIColumn series4 = new HIColumn();
        series4.name = "Janet";
        Number[] series4_data = new Number[] {3, 0, 4, 4, 3};
        series4.data = new ArrayList<>(Arrays.asList(series4_data));
        series4.stack = "female";
        options.series = new ArrayList<>(Arrays.asList(series1, series2, series3, series4));


        chartView.options = options;
    }
}


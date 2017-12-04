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

        chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Styling axes and columns";
        options.title = title;

        HIYAxis yAxis1 = new HIYAxis();
        yAxis1.className = "highcharts-color-0";
        yAxis1.title = new HITitle();
        yAxis1.title.text = "Primary axis";
        
        HIYAxis yAxis2 = new HIYAxis();
        yAxis2.className = "highcharts-color-1";
        yAxis2.opposite = true;
        yAxis2.title = new HITitle();
        yAxis2.title.text = "Secondary axis";

        options.yAxis = new ArrayList<HIYAxis>(Arrays.asList(yAxis1, yAxis2));

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.column = new HIColumn();
        plotOptions.column.borderRadius = 5;
        options.plotOptions = plotOptions;

        HIColumn series1 = new HIColumn();
        Number[] series1_data = new Number[] {1, 3, 2, 4};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        
        HIColumn series2 = new HIColumn();
        Number[] series2_data = new Number[] {324, 124, 547, 221};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        series2.yAxis = 1;
        
        options.series = new ArrayList<>(Arrays.asList(series1, series2));


        chartView.options = options;
    }
}


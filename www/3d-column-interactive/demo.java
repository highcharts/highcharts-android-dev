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
        chart.setRenderTo("container");
        chart.setType("column");
        chart.setOptions3d(new HIOptions3d());
        chart.getOptions3d().setEnabled(true);
        chart.getOptions3d().setAlpha(15);
        chart.getOptions3d().setBeta(15);
        chart.getOptions3d().setDepth(50);
        chart.getOptions3d().setViewDistance(25);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Chart rotation demo");
        options.setTitle(title);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setDepth(25);
        options.setPlotOptions(plotOptions);

        HIColumn series1 = new HIColumn();
        Number[] series1_data = new Number[] { 29.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.setOptions(options);
    }
}


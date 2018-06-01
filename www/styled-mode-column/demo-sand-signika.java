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
        
        HITitle title = new HITitle();
        title.setText("Styling axes and columns");
        options.setTitle(title);

        HIYAxis yAxis1 = new HIYAxis();
        yAxis1.setClassName("highcharts-color-0");
        yAxis1.setTitle(new HITitle());
        yAxis1.getTitle().setText("Primary axis");

        HIYAxis yAxis2 = new HIYAxis();
        yAxis2.setClassName("highcharts-color-1");
        yAxis2.setOpposite(true);
        yAxis2.setTitle(new HITitle());
        yAxis2.getTitle().setText("Secondary axis");

        options.setYAxis(new ArrayList<HIYAxis>(Arrays.asList(yAxis1, yAxis2)));

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setBorderRadius(5);
        options.setPlotOptions(plotOptions);

        HIColumn series1 = new HIColumn();
        Number[] series1_data = new Number[] {1, 3, 2, 4};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

        HIColumn series2 = new HIColumn();
        Number[] series2_data = new Number[] {324, 124, 547, 221};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        series2.setYAxis(1);

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));
        
        chartView.setOptions(options);
    }
}


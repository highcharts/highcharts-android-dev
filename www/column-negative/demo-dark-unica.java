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

        chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
        
        HITitle title = new HITitle();
        title.setText("Column chart with negative values");
        options.setTitle(title);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HIColumn series1 = new HIColumn();
        series1.setName("John");
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        HIColumn series2 = new HIColumn();
        series2.setName("Jane");
        Number[] series2_data = new Number[] {2, -2, -3, 2, 1};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        HIColumn series3 = new HIColumn();
        series3.setName("Joe");
        Number[] series3_data = new Number[] {3, 4, 4, -2, 5};
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));

        chartView.options = options;
    }
}

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
        title.setText("Monthly Average Temperature");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: WorldClimate.com");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Temperature (°C)");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setLine(new HILine());
        plotOptions.getLine().setDataLabels(new HIDataLabels());
        plotOptions.getLine().getDataLabels().setEnabled(true);
        plotOptions.getLine().setEnableMouseTracking(false);
        options.setPlotOptions(plotOptions);

        HILine series1 = new HILine();
        series1.setName("Tokyo");
        Number[] series1_data = new Number[] {7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        HILine series2 = new HILine();
        series2.setName("London");
        Number[] series2_data = new Number[] {3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);
    }
}


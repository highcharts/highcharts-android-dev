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

        chartView.theme = "dark-unica";

        HIChart chart = new HIChart();
        chart.setRenderTo("container");
        chart.setType("column");
        chart.setOptions3d(new HIOptions3d());
        chart.getOptions3d().setEnabled(true);
        chart.getOptions3d().setAlpha(10);
        chart.getOptions3d().setBeta(25);
        chart.getOptions3d().setDepth(70);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("3D chart with null values");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Notice the difference between a 0 value and a null point");
        options.setSubtitle(subtitle);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setDepth(25);
        options.setPlotOptions(plotOptions);

        HIXAxis xAxis = new HIXAxis();
        String[] shortMonths = new String[] { "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"};
        xAxis.setCategories(new ArrayList<>(Arrays.asList(shortMonths)));
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setSkew3d(true);
        xAxis.getLabels().setStyle(new HIStyle());
        xAxis.getLabels().getStyle().setFontSize("16px");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HIColumn series1 = new HIColumn();
        series1.setName("Sales");
        series1.setData(new ArrayList<>(Arrays.asList(2, 3, null, 4, 0, 5, 1, 4, 6, 3)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.setOptions(options);
    }
}


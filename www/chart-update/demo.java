package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private HIChartView chartView;
    private String currentButtonClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Chart.update";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Plain";
        currentButtonClicked = "Plain";
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ));
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIColumn column = new HIColumn();
        column.colorByPoint = true;
        Number[] columnData = new Number[] { 29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.data = new ArrayList<>(Arrays.asList(columnData));
        column.showInLegend = false;
        options.series = new ArrayList<>(Collections.singletonList(column));

        chartView.options = options;

        Button plainButton = (Button) findViewById(R.id.plain);
        plainButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) plainButton.getText()));
        Button invertedButton = (Button) findViewById(R.id.invert);
        invertedButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) invertedButton.getText()));
        Button polarButton = (Button) findViewById(R.id.polar);
        polarButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) polarButton.getText()));
    }

    private void changeChartAppearance(String current, String buttonText){

        if(buttonText.equals(current)) return;

        HIOptions newOptions = new HIOptions();
        HIChart newChart = new HIChart();
        newChart.type = "column";
        HISubtitle newSubtitle = new HISubtitle();

        switch (buttonText) {
            case "Plain":
                newChart.inverted = false;
                newChart.polar = false;
                newSubtitle.text = buttonText;
                currentButtonClicked = buttonText;
                break;
            case "Inverted":
                newChart.inverted = true;
                newChart.polar = false;
                newSubtitle.text = buttonText;
                currentButtonClicked = buttonText;
                break;
            case "Polar":
                newChart.inverted = false;
                newChart.polar = true;
                newSubtitle.text = buttonText;
                currentButtonClicked = buttonText;
                break;
        }

        newOptions.subtitle = newSubtitle;
        newOptions.chart = newChart;

        HITitle title = new HITitle();
        title.text = "Chart.update";
        newOptions.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ));
        newOptions.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIColumn column = new HIColumn();
        column.colorByPoint = true;
        Number[] columnData = new Number[] { 29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.data = new ArrayList<>(Arrays.asList(columnData));
        column.showInLegend = false;
        newOptions.series = new ArrayList<>(Collections.singletonList(column));

        this.chartView.options = newOptions;
        this.chartView.reload();
    }
}
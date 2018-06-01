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

        chartView.theme = "dark-unica";
        
        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("column");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Chart.update");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Plain");
        currentButtonClicked = "Plain";
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" )));
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIColumn column = new HIColumn();
        column.setColorByPoint(true);
        Number[] columnData = new Number[] { 29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.setData(new ArrayList<>(Arrays.asList(columnData)));
        column.setShowInLegend(false);
        options.setSeries(new ArrayList<>(Collections.singletonList(column)));

        chartView.setOptions(options);

        Button plainButton = (Button) findViewById(R.id.plain);
        plainButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) plainButton.getText()));
        Button invertedButton = (Button) findViewById(R.id.invert);
        invertedButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) invertedButton.getText()));
        Button polarButton = (Button) findViewById(R.id.polar);
        polarButton.setOnClickListener(v -> changeChartAppearance(currentButtonClicked, (String) polarButton.getText()));
    }

    private void changeChartAppearance(String current, String buttonText){

        if(buttonText.equals(current)) return;

        switch (buttonText) {
            case "Plain":
                chartView.getOptions().getChart().setInverted(false);
                chartView.getOptions().getChart().setPolar(false);
                chartView.getOptions().getSubtitle().setText(buttonText);
                currentButtonClicked = buttonText;
                break;
            case "Invert":
                chartView.getOptions().getChart().setInverted(true);
                chartView.getOptions().getChart().setPolar(false);
                chartView.getOptions().getSubtitle().setText(buttonText);
                currentButtonClicked = buttonText;
                break;
            case "Polar":
                chartView.getOptions().getChart().setInverted(false);
                chartView.getOptions().getChart().setPolar(true);
                chartView.getOptions().getSubtitle().setText(buttonText);
                currentButtonClicked = buttonText;
                break;
        }
    }
}

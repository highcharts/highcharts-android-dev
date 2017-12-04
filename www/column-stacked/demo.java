package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Stacked column chart";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Plain";
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Appled", "Oranges", "Pears", "Grapes", "Bananas"));
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));;

        HIYAxis yaxis = new HIYAxis();
        yaxis.min = 0;
        yaxis.title = new HITitle();
        yaxis.title.text = "Total fruit consumption";
        yaxis.stackLabels = new HIStackLabels();
        yaxis.stackLabels.enabled = true;
        yaxis.stackLabels.style = new HIStyle();
        yaxis.stackLabels.style.fontWeight = "bold";
        yaxis.stackLabels.style.color = "gray";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HILegend legend = new HILegend();
        legend.align = "right";
        legend.x = -30;
        legend.verticalAlign = "top";
        legend.y = 25;
        legend.floating = true;
        legend.backgroundColor = HIColor.initWithName("white");
        legend.borderColor = HIColor.initWithHexValue("ccc");
        legend.borderWidth = 1;
        legend.shadow = false;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "{series.name}: {point.y}<br/>Total: {point.stackTotal}";
        tooltip.headerFormat = "<b>{point.x}</b><br/>";
        options.tooltip = tooltip;

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.column = new HIColumn();
        plotoptions.column.stacking = "normal";
        plotoptions.column.dataLabels = new HIDataLabels();
        plotoptions.column.dataLabels.enabled = true;
        plotoptions.column.dataLabels.color = HIColor.initWithName("white");
        plotoptions.column.dataLabels.style = new HIStyle();
        plotoptions.column.dataLabels.style.textOutline = "0 0 3px black";
        options.plotOptions = plotoptions;

        HIColumn column1 = new HIColumn();
        column1.name = "John";
        Number[] column1Data = new Number[] { 5, 3, 4, 7, 2 };
        column1.data = new ArrayList<>(Arrays.asList(column1Data));

        HIColumn column2 = new HIColumn();
        column2.name = "Jane";
        Number[] column2Data = new Number[] { 2, 2, 3, 2, 1 };
        column2.data = new ArrayList<>(Arrays.asList(column2Data));

        HIColumn column3 = new HIColumn();
        column3.name = "Joe";
        Number[] column3Data = new Number[] { 3, 4, 4, 2, 5 };
        column3.data = new ArrayList<>(Arrays.asList(column3Data));
        
        options.series = new ArrayList<>(Arrays.asList(column1, column2, column3));

        chartView.options = options;
    }
}
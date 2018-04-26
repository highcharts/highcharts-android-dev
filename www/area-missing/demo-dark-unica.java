package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

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

        HIChart chart = new HIChart();
        chart.type = "area";
        chart.spacingBottom = 30.0;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Fruit consumption *";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "* Jane's banana consumption is unknown";
        subtitle.floating = true;
        subtitle.align = "right";
        subtitle.verticalAlign = "bottom";
        subtitle.y = 15.0;
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        String[] fruits = new String[] { "Apples", "Pears", "Oranges", "Bananas", "Grapes", "Plums", "Strawberries", "Raspberries" };
        xaxis.categories = new ArrayList<>(Arrays.asList(fruits));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xaxis);}};

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Y-Axis";
        yaxis.labels = new HILabels();
        yaxis.labels.formatter = new HIFunction(
                f -> { return String.valueOf(f.getProperty("value")); },
                new String[] {"value"}
        );
        options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.formatter = new HIFunction(
                f -> "<b>" + f.getProperty("series.name") + "</b><br>" + f.getProperty("x") + ": " + f.getProperty("y"),
                new String[] {"series.name", "x", "y"}
        );
        options.tooltip = tooltip;

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "left";
        legend.verticalAlign = "top";
        legend.x = 150.0;
        legend.y = 100.0;
        legend.floating = true;
        legend.borderWidth = 1.0;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        options.legend = legend;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.area = new HIArea();
        plotOptions.area.fillOpacity = 0.5;
        options.plotOptions = plotOptions;

        HICredits credits = new HICredits();
        credits.enabled = false;

        HIArea area1 = new HIArea();
        area1.name = "John";
        Number[] area1Data = new Number[] { 0, 1, 4, 4, 5, 2, 3, 7 };
        area1.data = new ArrayList<>(Arrays.asList(area1Data));
        HIArea area2 = new HIArea();
        area2.name = "Jane";
        Number[] area2Data = new Number[] { 1, 0, 3, null, 3, 1, 2, 1 };
        area2.data = new ArrayList<>(Arrays.asList(area2Data));
        options.series = new ArrayList<>(Arrays.asList(area1, area2));

        chartView.options = options;
    }
}

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
        chart.setType("area");
        chart.setSpacingBottom(30);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Fruit consumption *");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("* Jane's banana consumption is unknown");
        subtitle.setFloating(true);
        subtitle.setAlign("right");
        subtitle.setVerticalAlign("bottom");
        subtitle.setY(15);
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        String[] fruits = new String[] { "Apples", "Pears", "Oranges", "Bananas", "Grapes", "Plums", "Strawberries", "Raspberries" };
        xaxis.setCategories(new ArrayList<>(Arrays.asList(fruits)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Y-Axis");
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setFormatter(new HIFunction(
                f -> { return String.valueOf(f.getProperty("value")); },
                new String[] {"value"}
        ));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setFormatter(new HIFunction(
                f -> "<b>" + f.getProperty("series.name") + "</b><br>" + f.getProperty("x") + ": " + f.getProperty("y"),
                new String[] {"series.name", "x", "y"}
        ));
        options.setTooltip(tooltip);

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setX(150);
        legend.setY(100);
        legend.setFloating(true);
        legend.setBorderWidth(1);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        options.setLegend(legend);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setArea(new HIArea());
        plotOptions.getArea().setFillOpacity(0.5);
        options.setPlotOptions(plotOptions);

        HICredits credits = new HICredits();
        credits.setEnabled(false);

        HIArea area1 = new HIArea();
        area1.setName("John");
        Number[] area1Data = new Number[] { 0, 1, 4, 4, 5, 2, 3, 7 };
        area1.setData(new ArrayList<>(Arrays.asList(area1Data)));
        HIArea area2 = new HIArea();
        area2.setName("Jane");
        Number[] area2Data = new Number[] { 1, 0, 3, null, 3, 1, 2, 1 };
        area2.setData(new ArrayList<>(Arrays.asList(area2Data)));
        options.setSeries(new ArrayList<>(Arrays.asList(area1, area2)));

        chartView.setOptions(options);
    }
}


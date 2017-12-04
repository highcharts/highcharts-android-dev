package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "bar";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Historic World Population by Region";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: <a href=\\\"https://en.wikipedia.org/wiki/World_population\\\">Wikipedia.org</a>Source: <a href=\\\"https://en.wikipedia.org/wiki/World_population\\\">Wikipedia.org</a>";
        options.subtitle = subtitle;


        HIXAxis xaxis = new HIXAxis();
        String[] categories = new String[] { "Africa", "America", "Asia", "Europe", "Oceania"};
        xaxis.categories = new ArrayList<>(Arrays.asList(categories));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xaxis);}};

        HIYAxis yaxis = new HIYAxis();
        yaxis.min = 0;
        yaxis.title = new HITitle();
        yaxis.title.text = "Population (millions)";
        yaxis.title.align = "high";
        yaxis.labels = new HILabels();
        yaxis.labels.overflow = "justify";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.valueSuffix = " millions";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.bar = new HIBar();
        plotOptions.bar.dataLabels = new HIDataLabels();
        plotOptions.bar.dataLabels.enabled = true;
        options.plotOptions = plotOptions;

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "right";
        legend.verticalAlign = "top";
        legend.x = -40;
        legend.y = 80;
        legend.floating = true;
        legend.borderWidth = 1;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        legend.shadow = true;
        options.legend = legend;

        HICredits credits = new HICredits();
        credits.enabled = false;
        options.credits = credits;


        HIBar bar1 = new HIBar();
        bar1.name = "Year 1800";
        Number[] bar1Data = new Number[] {107, 31, 635, 203, 2 };
        bar1.data = new ArrayList<>(Arrays.asList(bar1Data));

        HIBar bar2 = new HIBar();
        bar2.name = "Year 1900";
        Number[] bar2Data = new Number[] { 133, 156, 947, 408, 6 };
        bar2.data = new ArrayList<>(Arrays.asList(bar2Data));

        HIBar bar3 = new HIBar();
        bar3.name = "Year 2012";
        Number[] bar3Data = new Number[] { 1052, 954, 4250, 740, 38 };
        bar3.data = new ArrayList<>(Arrays.asList(bar3Data));

        options.series = new ArrayList<>(Arrays.asList(bar1, bar2,bar3));

        chartView.options = options;
    }
}






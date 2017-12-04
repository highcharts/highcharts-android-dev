package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "dark-unica";	

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "bar";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Population pyramid for Germany, 2015";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "SSource: <a href=\"http://populationpyramid.net/germany/2015/\">Population Pyramids of the World from 1950 to 2100</a>";
        options.subtitle = subtitle;

        String[] categories = new String[] { "0-4", "5-9", "10-14", "15-19",
        "20-24", "25-29", "30-34", "35-39", "40-44",
        "45-49", "50-54", "55-59", "60-64", "65-69",
        "70-74", "75-79", "80-84", "85-89", "90-94",
        "95-99", "100 + " };

        HIXAxis xaxisLeft = new HIXAxis();
        xaxisLeft.categories = new ArrayList<>(Arrays.asList(categories));
        xaxisLeft.labels = new HILabels();
        xaxisLeft.labels.step = 1;

        HIXAxis xaxisRight = new HIXAxis();
        xaxisRight.opposite = true;
        xaxisRight.reversed = false;
        xaxisRight.categories = new ArrayList<>(Arrays.asList(categories));
        xaxisRight.linkedTo = 0;
        xaxisRight.labels = new HILabels();
        xaxisRight.labels.step = 1;

        options.xAxis = new ArrayList<>(Arrays.asList(xaxisLeft, xaxisRight));

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "";
        yaxis.labels = new HILabels();
        yaxis.labels.formatter = new HIGFunction("function () { return Math.abs(this.value) + '%'; }", true);
        options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.formatter = new HIGFunction("function () { return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' + 'Population: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0); }", true);
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.bar = new HIBar();
        plotOptions.bar.stacking = "normal";
        options.plotOptions = plotOptions;

        HIBar barMale = new HIBar();
        barMale.name = "Year 1800";
        Number[] barMaleData = new Number[] {-2.2, -2.2, -2.3, -2.5, -2.7, -3.1, -3.2,
                -3.0, -3.2, -4.3, -4.4, -3.6, -3.1, -2.4,
                -2.5, -2.3, -1.2, -0.6, -0.2, -0.0, -0.0 };
        barMale.data = new ArrayList<>(Arrays.asList(barMaleData));

        HIBar barFemale = new HIBar();
        barFemale.name = "Year 1900";
        Number[] barFemaleData = new Number[] { 2.1, 2.0, 2.2, 2.4, 2.6, 3.0, 3.1, 2.9,
                3.1, 4.1, 4.3, 3.6, 3.4, 2.6, 2.9, 2.9,
                1.8, 1.2, 0.6, 0.1, 0.0 };
        barFemale.data = new ArrayList<>(Arrays.asList(barFemaleData));

        options.series = new ArrayList<>(Arrays.asList(barMale, barFemale));

        chartView.options = options;
    }
}

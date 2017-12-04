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

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "areaspline";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Average fruit consumption during one week";
        options.title = title;

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "left";
        legend.verticalAlign = "top";
        legend.x = 150;
        legend.y = 100;
        legend.floating = true;
        legend.borderWidth = 1;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        options.legend = legend;

        HIXAxis xaxis = new HIXAxis();
        String[] categories = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        xaxis.categories = new ArrayList<>(Arrays.asList(categories));
        HIPlotBands plotband = new HIPlotBands();
        plotband.from = 4.5;
        plotband.to = 6.5;
        plotband.color = HIColor.initWithRGBA(68, 170, 213, 2);
        xaxis.plotBands = new ArrayList<>(Arrays.asList(plotband));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xaxis);}};

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Fruit unit";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.shared = true;
        tooltip.valueSuffix = " units";
        options.tooltip = tooltip;

        HICredits credits = new HICredits();
        credits.enabled = true;
        options.credits = credits;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.areaspline = new HIAreaspline();
        plotOptions.areaspline.fillOpacity = 0.5;
        options.plotOptions = plotOptions;

        HIAreaspline areaspline1 = new HIAreaspline();
        areaspline1.name = "John";
        Number[] areaspline1Data = new Number[] {3, 4, 3, 5, 4, 10, 12 };
        areaspline1.data = new ArrayList<>(Arrays.asList(areaspline1Data));

        HIAreaspline areaspline2 = new HIAreaspline();
        areaspline2.name = "Jane";
        Number[] areaspline2Data = new Number[] { 1, 3, 4, 3, 3, 5, 4 };
        areaspline2.data = new ArrayList<>(Arrays.asList(areaspline2Data));
        options.series = new ArrayList<>(Arrays.asList(areaspline1, areaspline2));

        chartView.options = options;
    }
}






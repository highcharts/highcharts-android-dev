package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        Date now = new Date();

        HIChart chart = new HIChart();
        chart.type = "gauge";
        chart.plotBackgroundColor = new HIColor();
        chart.plotBackgroundImage = "";
        chart.plotBorderWidth = 0;
        chart.plotShadow = false;
        chart.height = 200;
        options.chart = chart;

        HICredits credits = new HICredits();
        credits.enabled = false;
        options.credits = credits;

        HITitle title = new HITitle();
        title.text = "The Highcharts clock";
        options.title = title;

        HIPane pane = new HIPane();

        HIBackground paneBackground = new HIBackground();
        paneBackground.backgroundColor = new HIColor();

        pane.background = new ArrayList<>(Collections.singletonList(paneBackground));

        options.pane = pane;

        HIYAxis yaxis = new HIYAxis();
        yaxis.labels = new HILabels();
        yaxis.labels.distance = -20;
        yaxis.min = 0;
        yaxis.max = 12;
        yaxis.lineWidth = 0;
        yaxis.showFirstLabel = false;
        yaxis.minorTickWidth = 1;
        yaxis.minorTickLength = 5;
        yaxis.minorTickPosition = "inside";
        yaxis.minorGridLineWidth = 0;
        yaxis.minorTickColor = HIColor.initWithHexValue("666");

        yaxis.tickInterval = 1;
        yaxis.tickWidth = 2;
        yaxis.tickPosition = "inside";
        yaxis.tickLength = 10;
        yaxis.tickColor = HIColor.initWithHexValue("666");
        yaxis.title = new HITitle();
        yaxis.title.text = "Powered by<br/>Highcharts";
        yaxis.title.style = new HIStyle();
        yaxis.title.style.color = "#BBB";
        yaxis.title.style.fontWeight = "normal";
        yaxis.title.style.fontSize = "8px";
        yaxis.title.y = 10;

        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HITooltip tooltip = new HITooltip();
        tooltip.formatter = new HIGFunction("function () { return this.series.chart.tooltipText; }", true);
        options.tooltip = tooltip;

        HIGauge gauge = new HIGauge();

        HIData data1 = new HIData();
        data1.id = "hour";
        data1.y = now.getHours();

        HIDial dial1 = new HIDial();
        dial1.radius = "60%";
        dial1.baseWidth = 4;
        dial1.baseLength = "95%";
        dial1.rearLength = "0";

        HIData data2 = new HIData();
        data2.id = "minute";
        data2.y = now.getMinutes();

        HIDial dial2 = new HIDial();
        dial2.baseLength = "95%";
        dial2.rearLength = "0";

        HIData data3 = new HIData();
        data3.id = "second";
        data3.y = now.getSeconds();

        HIDial dial3 = new HIDial();
        dial3.radius = "100%";
        dial3.baseWidth = 1;
        dial3.rearLength = "20%";

        gauge.dial = dial1;
        gauge.data = new ArrayList<>(Arrays.asList(data1, data2));
        gauge.animation = new HIAnimation();
        gauge.animation.duration = 0;
        gauge.dataLabels = new HIDataLabels();
        gauge.dataLabels.enabled = false;

        options.series = new ArrayList<>(Collections.singletonList(gauge));

        chartView.options = options;
    }

}

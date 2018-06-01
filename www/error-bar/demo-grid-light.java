package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setZoomType("xy");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Temperature vs Rainfall");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")));
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.setLabels(new HILabels());
        yaxis1.getLabels().setFormat("{value} °C");
        yaxis1.getLabels().setStyle(new HIStyle());
        yaxis1.getLabels().getStyle().setColor("#434348");
        yaxis1.setTitle(new HITitle());
        yaxis1.getTitle().setText("Temperature");
        yaxis1.getTitle().setStyle(new HIStyle());
        yaxis1.getTitle().getStyle().setColor("#434348");

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.setLabels(new HILabels());
        yaxis2.getLabels().setFormat("{value} mm");
        yaxis2.getLabels().setStyle(new HIStyle());
        yaxis2.getLabels().getStyle().setColor("#7cb5ec");
        yaxis2.setTitle(new HITitle());
        yaxis2.getTitle().setText("Rainfall");
        yaxis2.getTitle().setStyle(new HIStyle());
        yaxis2.getTitle().getStyle().setColor("#7cb5ec");
        yaxis2.setOpposite(true);

        options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        options.setTooltip(tooltip);

        HIColumn column = new HIColumn();
        column.setType("column");
        column.setName("Rainfall");
        column.setYAxis(1);
        Number[] columnData = new Number[] {49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.setData(new ArrayList<>(Arrays.asList(columnData)));
        column.setTooltip(new HITooltip());
        column.getTooltip().setPointFormat("<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f} mm</b> ");

        HIErrorbar errorbar1 = new HIErrorbar();
        errorbar1.setName("Rainfall error");
        errorbar1.setYAxis(1);
        Number[][] errorbar1Data = new Number[][]{
                {48, 51},
                {68, 73},
                {92, 110},
                {128, 136},
                {140, 150},
                {171, 179},
                {135, 143},
                {142, 149},
                {204, 220},
                {189, 199},
                {95, 110},
                {52, 56}
        };
        errorbar1.setData(new ArrayList<>(Arrays.asList(errorbar1Data)));
        errorbar1.setShowInLegend(false);
        errorbar1.setTooltip(new HITooltip());
        errorbar1.getTooltip().setPointFormat("(error range: {point.low}-{point.high} mm)<br/>");

        HISpline spline = new HISpline();
        spline.setName("Temperature");
        Number[] splineData = new Number[] { 7, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
        spline.setData(new ArrayList<>(Arrays.asList(splineData)));
        spline.setTooltip(new HITooltip());
        spline.getTooltip().setPointFormat("<span style=\"font-weight: bold; color: {series.color}\">{series.name}</span>: <b>{point.y:.1f}°C</b> ");

        HIErrorbar errorbar2 = new HIErrorbar();
        errorbar2.setName("Temperature error");
        Number[][] errorbar2Data = new Number[][]{
                {6, 8},
                {5.9, 7.6},
                {9.4, 10.4},
                {14.1, 15.9},
                {18, 20.1},
                {21, 24},
                {23.2, 25.3},
                {26.1, 27.8},
                {23.2, 23.9},
                {18, 21.1},
                {12.9, 14},
                {7.6, 10}
        };
        errorbar2.setShowInLegend(false);
        errorbar2.setData(new ArrayList<>(Arrays.asList(errorbar2Data)));
        errorbar2.setTooltip(new HITooltip());
        errorbar2.getTooltip().setPointFormat("(error range: {point.low}-{point.high}°C)<br/>");

        options.setSeries(new ArrayList<>(Arrays.asList(column, errorbar1, spline, errorbar2)));

        chartView.setOptions(options);

        chartView.options = options;
    }
}

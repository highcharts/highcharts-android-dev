package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
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

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setZoomType("xy");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Average Monthly Temperature and Rainfall in Tokyo");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: WorldClimate.com");

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")));
        xaxis.setCrosshair(new HICrosshair());
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.setLabels(new HILabels());
        yaxis1.getLabels().setFormat("{value}°C");
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

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setX(120);
        legend.setVerticalAlign("top");
        legend.setY(100);
        legend.setFloating(true);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        options.setLegend(legend);

        HIColumn column = new HIColumn();
        column.setName("Rainfall");
        column.setYAxis(1);
        Number[] columnData = new Number[] {49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4 };
        column.setData(new ArrayList<>(Arrays.asList(columnData)));
        column.setTooltip(new HITooltip());
        column.getTooltip().setValueSuffix(" mm");

        HISpline spline = new HISpline();
        spline.setName("Temperature");
        Number[] splineData = new Number[] { 7, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 };
        spline.setData(new ArrayList<>(Arrays.asList(splineData)));
        spline.setTooltip(new HITooltip());
        spline.getTooltip().setValueSuffix("°C");

        options.setSeries(new ArrayList<>(Arrays.asList(column, spline)));

        chartView.setOptions(options);
    }
}

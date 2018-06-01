package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
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

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("area");
        chart.setInverted(true);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Average fruit consumption during one week");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setStyle(new HashMap<>());
        subtitle.getStyle().put("position", "absolute");
        subtitle.getStyle().put("right", "0px");
        subtitle.getStyle().put("bottom", "10px");
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        xaxis.setCategories(new ArrayList<>(Arrays.asList(days)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Number of units");
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setFormatter(new HIFunction(
                f -> { return String.valueOf(f.getProperty("value")); },
                new String[] {"value"} ));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("right");
        legend.setVerticalAlign("top");
        legend.setX(-100);
        legend.setY(100);
        legend.setFloating(true);
        legend.setBorderWidth(1);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        options.setLegend(legend);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setArea(new HIArea());
        plotOptions.getArea().setFillOpacity(0.5);

        HIArea area1 = new HIArea();
        area1.setName("John");
        Number[] data1 = new Number[] { 4, 3, 5, 4, 10, 12 };
        area1.setData(new ArrayList<>(Arrays.asList(data1)));
        HIArea area2 = new HIArea();
        area2.setName("Jane");
        Number[] data2 = new Number[] { 3, 4, 3, 3, 5, 4 };
        area2.setData(new ArrayList<>(Arrays.asList(data2)));
        options.setSeries(new ArrayList<>(Arrays.asList(area1, area2)));

        chartView.setOptions(options);
    }
}


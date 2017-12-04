package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
        
        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        options.chart = new HIChart();

        HITitle title = new HITitle();
        title.text = "Combination chart";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Apples", "Oranges", "Pears", "Bananas", "Plums"));
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIItems item = new HIItems();
        item.html = "Total fruit consumption";
        item.style = new HashMap<>();
        item.style.put("left", "50px");
        item.style.put("top", "18px");
        item.style.put("colort", "black");

        HILabels labels = new HILabels();
        labels.items = new ArrayList<>(Collections.singletonList(item));
        options.labels = labels;

        HIColumn column1 = new HIColumn();
        column1.type = "column";
        column1.name = "Jane";
        Number[] column1Data = new Number[] { 3, 2, 1, 3, 4 };
        column1.data = new ArrayList<>(Arrays.asList(column1Data));

        HIColumn column2 = new HIColumn();
        column2.type = "column";
        column2.name = "John";
        Number[] column2Data = new Number[] { 2, 3, 5, 7, 6 };
        column2.data = new ArrayList<>(Arrays.asList(column2Data));

        HIColumn column3 = new HIColumn();
        column3.type = "column";
        column3.name = "Joe";
        Number[] column3Data = new Number[] { 4, 3, 3, 9, 0 };
        column3.data = new ArrayList<>(Arrays.asList(column3Data));

        HISpline spline = new HISpline();
        spline.type = "spline";
        spline.name = "Average";
        Number[] splineData = new Number[] { 2.67, 3, 6.33, 3.33 };
        spline.data = new ArrayList<>(Arrays.asList(splineData));
        spline.marker = new HIMarker();
        spline.marker.lineWidth = 2;
        spline.marker.fillColor = HIColor.initWithName("white");
        spline.marker.lineColor = HIColor.initWithHexValue("f7a35c");

        HIPie pie = new HIPie();
        pie.type = "pie";
        pie.name = "Total consumption";
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "Jane");
        map1.put("y", 13);
        map1.put("color", "#7cb5ec");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "John");
        map2.put("y", 23);
        map2.put("color", "#434348");
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("name", "Joe");
        map3.put("y", 19);
        map3.put("color", "#90ed7d");
        pie.data = new ArrayList<>(Arrays.asList(map1, map2, map3));
        pie.center = new ArrayList<>(Arrays.asList(100, 80));
        pie.size = "100";
        pie.showInLegend = false;
        pie.dataLabels = new HIDataLabels();
        pie.dataLabels.enabled = true;

        options.series = new ArrayList<>(Arrays.asList(column1, column2, column3, spline, pie));

        chartView.options = options;
    }
}
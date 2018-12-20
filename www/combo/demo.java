package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Combination chart");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("Apples", "Oranges", "Pears", "Bananas", "Plums")));
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIItems item = new HIItems();
        item.setHtml("Total fruit consumption");
        item.setStyle(new HICSSObject());
        item.getStyle().setTop("18px");
        item.getStyle().setColor("black");

        HILabels labels = new HILabels();
        labels.setItems(new ArrayList<>(Collections.singletonList(item)));
        options.setLabels(labels);

        HIColumn column1 = new HIColumn();
        column1.setName("Jane");
        Number[] column1Data = new Number[] { 3, 2, 1, 3, 4 };
        column1.setData(new ArrayList<>(Arrays.asList(column1Data)));

        HIColumn column2 = new HIColumn();
        column2.setName("John");
        Number[] column2Data = new Number[] { 2, 3, 5, 7, 6 };
        column2.setData(new ArrayList<>(Arrays.asList(column2Data)));

        HIColumn column3 = new HIColumn();
        column3.setName("Joe");
        Number[] column3Data = new Number[] { 4, 3, 3, 9, 0 };
        column3.setData(new ArrayList<>(Arrays.asList(column3Data)));

        HISpline spline = new HISpline();
        spline.setName("Average");
        Number[] splineData = new Number[] { 2.67, 3, 6.33, 3.33 };
        spline.setData(new ArrayList<>(Arrays.asList(splineData)));
        spline.setMarker(new HIMarker());
        spline.getMarker().setLineWidth(2);
        spline.getMarker().setFillColor(HIColor.initWithName("white"));
        spline.getMarker().setLineColor(HIColor.initWithHexValue("f7a35c"));

        HIPie pie = new HIPie();
        pie.setName("Total consumption");
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
        pie.setData(new ArrayList<>(Arrays.asList(map1, map2, map3)));
        pie.setCenter(new ArrayList<>(Arrays.asList(100, 80)));
        pie.setSize("100");
        pie.setShowInLegend(false);
        pie.setDataLabels(new HIDataLabels());
        pie.getDataLabels().setEnabled(true);

        options.setSeries(new ArrayList<>(Arrays.asList(column1, column2, column3, spline, pie)));

        chartView.setOptions(options);
    }
}

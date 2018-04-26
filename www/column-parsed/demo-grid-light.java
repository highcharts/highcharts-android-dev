package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
		
 	HIData data = new HIData();
        data.table = "<table id=\"datatable\"> <thead> <tr> <th></th> <th>Jane</th> <th>John</th> </tr> </thead> <tbody> <tr> <th>Apples</th> <td>3</td> <td>4</td> </tr> <tr> <th>Pears</th> <td>2</td> <td>0</td> </tr> <tr> <th>Plums</th> <td>5</td> <td>11</td> </tr> <tr> <th>Bananas</th> <td>1</td> <td>1</td> </tr> <tr> <th>Oranges</th> <td>2</td> <td>4</td> </tr> </tbody> </table>";
        //options.data = data;

        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Data extracted from a HTML table in the page";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categories = new String[] { "Apples", "Pears", "Plums", "Bananas", "Oranges" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categories));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.allowDecimals = false;
        yAxis.title = new HITitle();
        yAxis.title.text = "Units";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.formatter = new HIFunction(
                f -> {
                    DecimalFormat decimalFormat = new DecimalFormat("0.#");
                    String result = decimalFormat.format(f.getProperty("y"));
                    return "<b>" + f.getProperty("series.name") + "</b><br>" + result + " " + f.getProperty("point.name").toString().toLowerCase();
                } ,
                new String[] {"series.name", "y", "point.name"}
        );
        options.tooltip = tooltip;

        HIColumn series1 = new HIColumn();
        series1.name = "Jane";
        Object[] object1 = new Object[] { "Apples",  3 };
        Object[] object2 = new Object[] { "Pears",  2 };
        Object[] object3 = new Object[] { "Plums",  5 };
        Object[] object4 = new Object[] { "Bananas",  1 };
        Object[] object5 = new Object[] { "Oranges",  2 };
        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5));

        HIColumn series2 = new HIColumn();
        series2.name = "Jane";
        Object[] object6 = new Object[] { "Apples",  4 };
        Object[] object7 = new Object[] { "Pears",  0 };
        Object[] object8 = new Object[] { "Plums",  11 };
        Object[] object9 = new Object[] { "Bananas",  1 };
        Object[] object10 = new Object[] { "Oranges",  4 };
        series2.data = new ArrayList<>(Arrays.asList(object6, object7, object8, object9, object10));

        options.series = new ArrayList<>(Arrays.asList(series1, series2));

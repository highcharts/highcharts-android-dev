package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
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
        chart.type = "area";
        chart.inverted = true;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Average fruit consumption during one week";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.style = new HashMap<>();
        subtitle.style.put("position", "absolute");
        subtitle.style.put("right", "0px");
        subtitle.style.put("bottom", "10px");
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        String[] days = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        xaxis.categories = new ArrayList<>(Arrays.asList(days));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xaxis);}};

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Number of units";
        yaxis.labels = new HILabels();
        yaxis.labels.formatter = new HIGFunction("function () { return this.value; }", true);
        options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "right";
        legend.verticalAlign = "top";
        legend.x = -100;
        legend.y = 100;
        legend.floating = true;
        legend.borderWidth = 1;
        legend.backgroundColor = HIColor.initWithHexValue("FFFFFF");
        options.legend = legend;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.area = new HIArea();
        plotOptions.area.fillOpacity = 0.5;

        HIArea area1 = new HIArea();
        area1.name = "John";
        Number[] data1 = new Number[] { 4, 3, 5, 4, 10, 12 };
        area1.data = new ArrayList<>(Arrays.asList(data1));
        HIArea area2 = new HIArea();
        area2.name = "Jane";
        Number[] data2 = new Number[] { 3, 4, 3, 3, 5, 4 };
        area2.data = new ArrayList<>(Arrays.asList(data2));
        options.series = new ArrayList<>(Arrays.asList(area1, area2));

        chartView.options = options;
    }
}


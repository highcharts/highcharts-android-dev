package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.setType("column");
        chart.setOptions3d(new HIOptions3d());
        chart.getOptions3d().setEnabled(true);
        chart.getOptions3d().setAlpha(15);
        chart.getOptions3d().setBeta(15);
        chart.getOptions3d().setViewDistance(25);
        chart.getOptions3d().setDepth(40);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Total fruit consumption, grouped by gender");
        options.setTitle(title);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setSkew3d(true);
        xAxis.getLabels().setStyle(new HIStyle());
        xAxis.getLabels().getStyle().setFontSize("16px");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setAllowDecimals(false);
        yAxis.setMin(0);
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Number of fruits");
        yAxis.getTitle().setSkew3d(true);
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setHeaderFormat("<b>{point.key}</b><br>");
        tooltip.setPointFormat("<span style=\"color:{series.color}\"></span> {series.name}: {point.y} / {point.stackTotal}");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setStacking("normal");
        plotOptions.getColumn().setDepth(40);
        options.setPlotOptions(plotOptions);

        HIColumn series1 = new HIColumn();
        series1.setName("John");
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        series1.setStacking("male");
        HIColumn series2 = new HIColumn();
        series2.setName("Joe");
        Number[] series2_data = new Number[] {3, 4, 4, 2, 5};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        series2.setStack("male");
        HIColumn series3 = new HIColumn();
        series3.setName("Jane");
        Number[] series3_data = new Number[] {2, 5, 6, 2, 1};
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));
        series3.setStack("female");
        HIColumn series4 = new HIColumn();
        series4.setName("Janet");
        Number[] series4_data = new Number[] {3, 0, 4, 4, 3};
        series4.setData(new ArrayList<>(Arrays.asList(series4_data)));
        series4.setStack("female");
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3, series4)));

        chartView.setOptions(options);
    }
}

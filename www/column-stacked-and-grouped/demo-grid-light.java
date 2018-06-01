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
		
        HIChart chart = new HIChart();
        chart.setType("column");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Total fruit consumtion, grouped by gender");
        options.setTitle(title);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setAllowDecimals(false);
        yAxis.setMin(0);
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Number of fruits");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setFormatter(new HIFunction(
                f -> {
                    DecimalFormat decimalFormat = new DecimalFormat("0.#");
                    String result1 = decimalFormat.format(f.getProperty("y"));
                    String result2 = decimalFormat.format(f.getProperty("point.stackTotal"));
                    return "<b>" + f.getProperty("x") + "</b><br/>" + f.getProperty("series.name") + ": " + result1 + "<br/>Total: " + result2;
                },
                new String[] {"x", "y", "series.name", "point.stackTotal"}
        ));
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setStacking("normal");
        options.setPlotOptions(plotOptions);

        HIColumn series1 = new HIColumn();
        series1.setName("John");
        Number[] series1_data = new Number[] {5, 3, 4, 7, 2};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        series1.setStack("male");
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

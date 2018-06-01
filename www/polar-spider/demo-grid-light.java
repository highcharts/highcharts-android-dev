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

        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.setPolar(true);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Budget vs spending");
        title.setX(-80);
        options.setTitle(title);

        HIPane pane = new HIPane();
        pane.setSize("80%");
        options.setPane(pane);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Sales", "Marketing", "Development", "Customer Support", "Information Technology", "Administration" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        xAxis.setTickmarkPlacement("on");
        xAxis.setLineWidth(0);
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setGridLineInterpolation("polygon");
        yAxis.setLineWidth(0);
        yAxis.setMin(0);
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        tooltip.setPointFormat("<span style=\"color:{series.color}\">{series.name}: <b>${point.y:,.0f}</b><br/>");
        options.setTooltip(tooltip);

        HILegend legend = new HILegend();
        legend.setAlign("right");
        legend.setVerticalAlign("top");
        legend.setY(70);
        legend.setLayout("vertical");
        options.setLegend(legend);

        HILine series1 = new HILine();
        series1.setName("Allocated Budget");
        Number[] series1_data = new Number[] {43000, 19000, 60000, 35000, 17000, 10000};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        series1.setPointPlacement("on");

        HILine series2 = new HILine();
        series2.setName("Actual Spending");
        Number[] series2_data = new Number[] {50000, 39000, 42000, 31000, 26000, 14000};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        series2.setPointPlacement("on");

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);
    }
}


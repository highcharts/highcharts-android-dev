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
        chart.polar = true;
        chart.type = "line";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Budget vs spending";
        title.x = -80;
        options.title = title;

        HIPane pane = new HIPane();
        pane.size = "80%";
        options.pane = pane;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Sales", "Marketing", "Development", "Customer Support", "Information Technology", "Administration" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        xAxis.tickmarkPlacement = "on";
        xAxis.lineWidth = 0;
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.gridLineInterpolation = "polygon";
        yAxis.lineWidth = 0;
        yAxis.min = 0;
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.shared = true;
        tooltip.pointFormat = "<span style=\"color:{series.color}\">{series.name}: <b>${point.y:,.0f}</b><br/>";
        options.tooltip = tooltip;

        HILegend legend = new HILegend();
        legend.align = "right";
        legend.verticalAlign = "top";
        legend.y = 70;
        legend.layout = "vertical";
        options.legend = legend;

        HILine series1 = new HILine();
        series1.name = "Allocated Budget";
        Number[] series1_data = new Number[] {43000, 19000, 60000, 35000, 17000, 10000};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        series1.pointPlacement = "on";

        HILine series2 = new HILine();
        series2.name = "Actual Spending";
        Number[] series2_data = new Number[] {50000, 39000, 42000, 31000, 26000, 14000};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        series2.pointPlacement = "on";
        
        options.series = new ArrayList<>(Arrays.asList(series1, series2));


        chartView.options = options;
    }
}


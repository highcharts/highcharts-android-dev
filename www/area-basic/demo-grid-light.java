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

	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("area");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("US and USSR nuclear stockpiles");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: <a href=\"http://thebulletin.metapress.com/content/c4120650912x74k7/fulltext.pdf\">thebulletin.metapress.com</a>");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setAllowDecimals(false);
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setFormatter(new HIFunction(
                f -> { return String.valueOf(f.getProperty("value")); },
                new String[] {"value"} )); /*clean, unformatted number for year*/
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Nuclear weapon states");
        yAxis.setLabels(new HILabels());
        yAxis.getLabels().setFormatter(new HIFunction(
                f -> { return String.valueOf((Double) f.getProperty("value") /1000);}, new String[] {"value"} ));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name} produced <b>{point.y:,.0f}</b><br/>warheads in {point.x}");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setArea(new HIArea());
        plotOptions.getArea().setPointStart(1940);
        plotOptions.getArea().setMarker(new HIMarker());
        plotOptions.getArea().getMarker().setEnabled(false);
        plotOptions.getArea().getMarker().setSymbol("circle");
        plotOptions.getArea().getMarker().setRadius(2);
        plotOptions.getArea().getMarker().setStates(new HIStates());
        plotOptions.getArea().getMarker().getStates().setHover(new HIHover());
        plotOptions.getArea().getMarker().getStates().getHover().setEnabled(true);
        options.setPlotOptions(plotOptions);

        HIArea series1 = new HIArea();
        series1.setName("USA");
        Number[] series1_data = new Number[] {null, null, null, null, null, 6, 11, 32, 110, 235, 369, 640, 1005, 1436, 2063, 3057, 4618, 6444, 9822, 15468, 20434, 24126, 27387, 29459, 31056, 31982, 32040, 31233, 29224, 27342, 26662, 26956, 27912, 28999, 28965, 27826, 25579, 25722, 24826, 24605, 24304, 23464, 23708, 24099, 24357, 24237, 24401, 24344, 23586, 22380, 21004, 17287, 14747, 13076, 12555, 12144, 11009, 10950, 10871, 10824, 10577, 10527, 10475, 10421, 10358, 10295, 10104};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        HIArea series2 = new HIArea();
        series2.setName("USSR/Russia");
        Number[] series2_data = new Number[] {null, null, null, null, null, null, null, null, null, null, 5, 25, 50, 120, 150, 200, 426, 660, 869, 1060, 1605, 2471, 3322, 4238, 5221, 6129, 7089, 8339, 9399, 10538, 11643, 13092, 14478, 15915, 17385, 19055, 21205, 23044, 25393, 27935, 30062, 32049, 33952, 35804, 37431, 39197, 45000, 43000, 41000, 39000, 37000, 35000, 33000, 31000, 29000, 27000, 25000, 24000, 23000, 22000, 21000, 20000, 19000, 18000, 18000, 17000, 16000};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);
    }
}


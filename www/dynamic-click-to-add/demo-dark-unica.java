package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIColor;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "scatter";
        Number[] marginList = new Number[] {70, 50, 60, 80 };
        chart.margin = new ArrayList<>(Arrays.asList(marginList));
        chart.events = new HIEvents();
        chart.events.click = new HIFunction(
                "function (e) {" +
                        " /*find the clicked values and the series*/ " +
                        "var x = Math.round(e.xAxis[0].value), " +
                        "y = Math.round(e.yAxis[0].value), " +
                        "series = this.series[0]; " +
                        "/*Add it*/ " +
                        "series.addPoint([x, y]); }");
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "User supplied data";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Click the plot area to add a point. Click a point to remove it.";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        xAxis.gridLineWidth = 1;
        xAxis.minPadding = 0.2;
        xAxis.maxPadding = 0.2;
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Value";
        yAxis.minPadding = 0.2;
        yAxis.maxPadding = 0.2;

        HIPlotLines plotLines1 = new HIPlotLines();
        plotLines1.value = 0;
        plotLines1.width = 1;
        plotLines1.color = HIColor.initWithHexValue("808080");

        HIPlotLines[] plotLinesList = new HIPlotLines[] {plotLines1 };
        yAxis.plotLines = new ArrayList<>(Arrays.asList(plotLinesList));
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HIExporting exporting = new HIExporting();
        exporting.enabled = false;
        options.exporting = exporting;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.series = new HISeries();
        plotOptions.series.lineWidth = 1;
        plotOptions.series.point = new HIPoint();
        plotOptions.series.point.events = new HIEvents();
        plotOptions.series.point.events.click = new HIFunction(
                "function () { " +
                        "if (this.series.data.length > 1) { " +
                        "this.remove(); " +
                        "}}");
        options.plotOptions = plotOptions;

        HIScatter series1 = new HIScatter();
        Number[][] series1_data = new Number[][] {{20, 20}, {80, 80}};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<>(Collections.singletonList(series1));



        chartView.options = options;
    }
}


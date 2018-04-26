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
	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "columnrange";
        chart.inverted = true;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Temperature variation by month";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Observed in Vik i Sogn, Norway";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Temperature ( °C )";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.valueSuffix = "°C";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.columnrange = new HIColumnrange();
        plotOptions.columnrange.dataLabels = new HIDataLabels();
        plotOptions.columnrange.dataLabels.enabled = true;
        plotOptions.columnrange.dataLabels.formatter = new HIFunction(
		f -> return f.getProperty("y") + "°C",
		new String[] {"y"}
	);
        options.plotOptions = plotOptions;

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HIColumnrange series1 = new HIColumnrange();
        series1.name = "Temperatures";
        Number[][] series1_data = new Number[][] {{-9.7, 9.4}, {-8.7, 6.5}, {-3.5, 9.4}, {-1.4, 19.9}, {0.0, 22.6}, {2.9, 29.5}, {9.2, 30.7}, {7.3, 26.5}, {4.4, 18.0}, {-3.1, 11.4}, {-5.2, 10.4}, {-13.5, 9.8}};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<>(Arrays.asList(series1));

        chartView.options = options;
    }
}


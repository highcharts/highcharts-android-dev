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

		chartView.plugins = new ArrayList<>(Arrays.asList("histogram-bellcurve"));

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "variwide";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts Histogram";
		options.title = title;

		HIXAxis xaxis1 = new HIXAxis();
		xaxis1.title = new HITitle();
		xaxis1.title.text = "Data";

		HIXAxis xaxis2 = new HIXAxis();
		xaxis2.title = new HITitle();
		xaxis2.title.text = "Histogram";
		xaxis2.opposite = true;

		options.xAxis = new ArrayList<>(Arrays.asList(xaxis1, xaxis2));

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.title = new HITitle();
		yaxis1.title.text = "Data";

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.title = new HITitle();
		yaxis2.title.text = "Histogram";
		yaxis2.opposite = true;

		options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HIHistogram series1 = new HIHistogram();
		series1.type = "histogram";
		series1.name = "Histogram";
		series1.xAxis = 1;
		series1.yAxis = 1;
		series1.baseSeries = "s1";
		series1.zIndex = -1;

		HIScatter series2 = new HIScatter();
		series2.type = "scatter";
		series2.name = "Data";
		Number[] series2_data = new Number[] { 3.5, 3, 3.2, 3.1, 3.6, 3.9, 3.4, 3.4, 2.9, 3.1, 3.7, 3.4, 3, 3, 4, 4.4, 3.9, 3.5, 3.8, 3.8, 3.4, 3.7, 3.6, 3.3, 3.4, 3, 3.4, 3.5, 3.4, 3.2, 3.1, 3.4, 4.1, 4.2, 3.1, 3.2, 3.5, 3.6, 3, 3.4, 3.5, 2.3, 3.2, 3.5, 3.8, 3, 3.8, 3.2, 3.7, 3.3, 3.2, 3.2, 3.1, 2.3, 2.8, 2.8, 3.3, 2.4, 2.9, 2.7, 2, 3, 2.2, 2.9, 2.9, 3.1, 3, 2.7, 2.2, 2.5, 3.2, 2.8, 2.5, 2.8, 2.9, 3, 2.8, 3, 2.9, 2.6, 2.4, 2.4, 2.7, 2.7, 3, 3.4, 3.1, 2.3, 3, 2.5, 2.6, 3, 2.6, 2.3, 2.7, 3, 2.9, 2.9, 2.5, 2.8, 3.3, 2.7, 3, 2.9, 3, 3, 2.5, 2.9, 2.5, 3.6, 3.2, 2.7, 3, 2.5, 2.8, 3.2, 3, 3.8, 2.6, 2.2, 3.2, 2.8, 2.8, 2.7, 3.3, 3.2, 2.8, 3, 2.8, 3, 2.8, 3.8, 2.8, 2.8, 2.6, 3, 3.4, 3.1, 3, 3.1, 3.1, 3.1, 2.7, 3.2, 3.3, 3, 2.5, 3, 3.4, 3 };
		series2.id = "s1";
		series2.data = new ArrayList<>(Arrays.asList(series2_data));
		series2.marker = new HIMarker();
		series2.marker.radius = 1.5;

		options.series = new ArrayList<>(Arrays.asList(series1, series2));

		chartView.options = options;
	}
}

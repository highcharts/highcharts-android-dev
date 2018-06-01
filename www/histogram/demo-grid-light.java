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

		chartView.plugins = new ArrayList<>(Arrays.asList("histogram-bellcurve"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

HIChart chart = new HIChart();
		chart.setType("variwide");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Highcharts Histogram");
		options.setTitle(title);

		HIXAxis xaxis1 = new HIXAxis();
		xaxis1.setTitle(new HITitle());
		xaxis1.getTitle().setText("Data");

		HIXAxis xaxis2 = new HIXAxis();
		xaxis2.setTitle(new HITitle());
		xaxis2.getTitle().setText("Histogram");
		xaxis2.setOpposite(true);

		options.setXAxis(new ArrayList<>(Arrays.asList(xaxis1, xaxis2)));

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.setTitle(new HITitle());
		yaxis1.getTitle().setText("Data");

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.setTitle(new HITitle());
		yaxis2.getTitle().setText("Histogram");
		yaxis2.setOpposite(true);
		options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIHistogram series1 = new HIHistogram();
		series1.setName("Histogram");
		series1.setXAxis(1);
		series1.setYAxis(1);
		series1.setBaseSeries("s1");
		series1.setZIndex(-1);

		HIScatter series2 = new HIScatter();
		series2.setName("Data");
		Number[] series2_data = new Number[] { 3.5, 3, 3.2, 3.1, 3.6, 3.9, 3.4, 3.4, 2.9, 3.1, 3.7, 3.4, 3, 3, 4, 4.4, 3.9, 3.5, 3.8, 3.8, 3.4, 3.7, 3.6, 3.3, 3.4, 3, 3.4, 3.5, 3.4, 3.2, 3.1, 3.4, 4.1, 4.2, 3.1, 3.2, 3.5, 3.6, 3, 3.4, 3.5, 2.3, 3.2, 3.5, 3.8, 3, 3.8, 3.2, 3.7, 3.3, 3.2, 3.2, 3.1, 2.3, 2.8, 2.8, 3.3, 2.4, 2.9, 2.7, 2, 3, 2.2, 2.9, 2.9, 3.1, 3, 2.7, 2.2, 2.5, 3.2, 2.8, 2.5, 2.8, 2.9, 3, 2.8, 3, 2.9, 2.6, 2.4, 2.4, 2.7, 2.7, 3, 3.4, 3.1, 2.3, 3, 2.5, 2.6, 3, 2.6, 2.3, 2.7, 3, 2.9, 2.9, 2.5, 2.8, 3.3, 2.7, 3, 2.9, 3, 3, 2.5, 2.9, 2.5, 3.6, 3.2, 2.7, 3, 2.5, 2.8, 3.2, 3, 3.8, 2.6, 2.2, 3.2, 2.8, 2.8, 2.7, 3.3, 3.2, 2.8, 3, 2.8, 3, 2.8, 3.8, 2.8, 2.8, 2.6, 3, 3.4, 3.1, 3, 3.1, 3.1, 3.1, 2.7, 3.2, 3.3, 3, 2.5, 3, 3.4, 3 };
		series2.setId("s1");
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
		series2.setMarker(new HIMarker());
		series2.getMarker().setRadius(1.5);

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

		chartView.setOptions(options);
	}
}


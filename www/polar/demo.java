package com.highcharts.DevGround.example;

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

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.polar = true;
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts Polar Chart";
		options.title = title;

		HIPane pane = new HIPane();
		pane.startAngle = 0;
		pane.endAngle = 360;
		options.pane = pane;

		HIXAxis xAxis = new HIXAxis();
		xAxis.tickInterval = 45;
		xAxis.min = 0;
		xAxis.max = 360;
		xAxis.labels = new HILabels();
		xAxis.labels.formatter = new HIFunction(
			f -> f.getProperty("value") + "",
			new String[] {"value"}
		);
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.min = 0;
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.series = new HISeries();
		plotOptions.series.pointStart = 0;
		plotOptions.series.pointInterval = 45;
		plotOptions.column = new HIColumn();
		plotOptions.column.pointPadding = 0;
		plotOptions.column.groupPadding = 0;
		options.plotOptions = plotOptions;

		HIColumn series1 = new HIColumn();
		series1.type = "column";
		series1.name = "Column";
		Number[] series1_data = new Number[] {8, 7, 6, 5, 4, 3, 2, 1};
		series1.data = new ArrayList<>(Arrays.asList(series1_data));
		series1.pointPlacement = "between";

		HILine series2 = new HILine();
		series2.type = "line";
		series2.name = "Line";
		Number[] series2_data = new Number[] {1, 2, 3, 4, 5, 6, 7, 8};
		series2.data = new ArrayList<>(Arrays.asList(series2_data));

		HIArea series3 = new HIArea();
		series3.type = "area";
		series3.name = "Area";
		Number[] series3_data = new Number[] {1, 8, 2, 7, 3, 6, 4, 5};
		series3.data = new ArrayList<>(Arrays.asList(series3_data));

		options.series = new ArrayList<>(Arrays.asList(series1, series2, series3));


		chartView.options = options;
	}
}


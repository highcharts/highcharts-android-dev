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
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

HIChart chart = new HIChart();
		chart.setPolar(true);
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Highcharts Polar Chart");
		options.setTitle(title);

		HIPane pane = new HIPane();
		pane.setStartAngle(0);
		pane.setEndAngle(360);
		options.setPane(pane);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setTickInterval(45);
		xAxis.setMin(0);
		xAxis.setMax(360);
		xAxis.setLabels(new HILabels());
		xAxis.getLabels().setFormatter(new HIFunction(
		        f -> f.getProperty("value") + "",
		        new String[] {"value"}
		));
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setMin(0);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSeries(new HISeries());
		plotOptions.getSeries().setPointStart(0);
		plotOptions.getSeries().setPointInterval(45);
		plotOptions.setColumn(new HIColumn());
		plotOptions.getColumn().setPointPadding(0);
		plotOptions.getColumn().setGroupPadding(0);
		options.setPlotOptions(plotOptions);

		HIColumn series1 = new HIColumn();
		series1.setName("Column");
		Number[] series1_data = new Number[] {8, 7, 6, 5, 4, 3, 2, 1};
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
		series1.setPointPlacement("between");

		HILine series2 = new HILine();
		Number[] series2_data = new Number[] {1, 2, 3, 4, 5, 6, 7, 8};
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

		HIArea series3 = new HIArea();
		series3.setName("Area");
		Number[] series3_data = new Number[] {1, 8, 2, 7, 3, 6, 4, 5};
		series3.setData(new ArrayList<>(Arrays.asList(series3_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));

		chartView.setOptions(options);
	}
}


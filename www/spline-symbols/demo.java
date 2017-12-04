package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
		chartView.plugins = new ArrayList<>(Arrays.asList("series-label"));

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "spline";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Monthly Average Temperature";
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "Source: WorldClimate.com";
		options.subtitle = subtitle;

		HIXAxis xAxis = new HIXAxis();
		String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.title = new HITitle();
		yAxis.title.text = "Temperature";
		yAxis.labels = new HILabels();
		yAxis.labels.formatter = new HIGFunction("function () { return this.value + ''; }", true);
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HITooltip tooltip = new HITooltip();
		tooltip.crosshairs = true;
		tooltip.shared = true;
		options.tooltip = tooltip;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.spline = new HISpline();
		plotOptions.spline.marker = new HIMarker();
		plotOptions.spline.marker.radius = 4;
		plotOptions.spline.marker.lineColor = HIColor.initWithHexValue("666666");
		plotOptions.spline.marker.lineWidth = 1;
		options.plotOptions = plotOptions;

		HISpline series1 = new HISpline();
		series1.name = "Tokyo";
		series1.marker = new HIMarker();
		series1.marker.symbol = "square";
		HIData data1 = new HIData();
		data1.y = 26.5;
		data1.marker = new HIMarker();
		data1.marker.symbol = "url(https://www.highcharts.com/samples/graphics/sun.png)";

		Object[] series1_data = new Object[] { 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, data1, 23.3, 18.3, 13.9, 9.6 };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		HISpline series2 = new HISpline();
		series2.name = "London";
		series2.marker = new HIMarker();
		series2.marker.symbol = "diamond";
		HIData data2 = new HIData();
		data2.y = 3.9;
		data2.marker = new HIMarker();
		data2.marker.symbol = "url(https://www.highcharts.com/samples/graphics/snow.png)";

		Object[] series2_data = new Object[] { data2, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8 };
		series2.data = new ArrayList<>(Arrays.asList(series2_data));

		options.series = new ArrayList<>(Arrays.asList(series1, series2));


		chartView.options = options;
	}
}


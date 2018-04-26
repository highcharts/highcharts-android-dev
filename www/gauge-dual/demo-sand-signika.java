package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
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
		chart.type = "gauge";
		chart.alignTicks = false;
		chart.plotBorderWidth = 0;
		chart.plotShadow = false;
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Speedometer with dual axes";
		options.title = title;

		HIPane pane = new HIPane();
		pane.startAngle = -150;
		pane.endAngle = 150;
		options.pane = pane;

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.min = 0;
		yaxis1.max = 200;
		yaxis1.lineColor = HIColor.initWithHexValue("339");
		yaxis1.tickColor = HIColor.initWithHexValue("339");
		yaxis1.minorTickColor = HIColor.initWithHexValue("339");
		yaxis1.offset = -25;
		yaxis1.lineWidth = 2;
		yaxis1.labels = new HILabels();
		yaxis1.labels.distance = -20;
		yaxis1.tickLength = 5;
		yaxis1.minorTickLength = 5;
		yaxis1.endOnTick = false;

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.min = 0;
		yaxis2.max = 124;
		yaxis2.tickPosition = "outside";
		yaxis2.lineColor = HIColor.initWithHexValue("933");
		yaxis2.lineWidth = 2;
		yaxis2.minorTickPosition = "outside";
		yaxis2.tickColor = HIColor.initWithHexValue("933");
		yaxis2.minorTickColor = HIColor.initWithHexValue("933");
		yaxis2.offset = -20;
		yaxis2.labels = new HILabels();
		yaxis2.labels.distance = 12;
		yaxis2.tickLength = 5;
		yaxis2.minorTickLength = 5;
		yaxis2.endOnTick = false;

		options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

		HIGauge series = new HIGauge();
		series.name = "Speed";
		series.tooltip = new HITooltip();
		series.tooltip.valueSuffix = " km/h";
		series.dataLabels = new HIDataLabels();
		series.dataLabels.formatter = new HIFunction(
		        f -> {
		            Double kmh = (double) f.getProperty("y");
		            Double mph = (double) Math.round(kmh * 0.621);
		            return "<span style=\"color:#339\">" + kmh + " km/h</span><br/>" + "<span style=\"color:#933\">" + mph + " mph</span>";
		        },
		        new String[] {"y"}
		);
		Number[] series1_data = new Number[] { 80 };
		series.data = new ArrayList<>(Arrays.asList(series1_data));

		options.series = new ArrayList<>(Collections.singletonList(series));

		chartView.options = options;
	}
}


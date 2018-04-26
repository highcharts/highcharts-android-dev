package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "waterfall";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts Waterfall";
		options.title = title;

		HIXAxis xAxis = new HIXAxis();
		xAxis.type = "category";
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.title = new HITitle();
		yAxis.title.text = "USD";
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HITooltip tooltip = new HITooltip();
		tooltip.pointFormat = "<b>${point.y:,.2f}</b> USD";
		options.tooltip = tooltip;

		HIWaterfall series1 = new HIWaterfall();
		series1.upColor = HIColor.initWithHexValue("90ed7d");
		series1.color = HIColor.initWithHexValue("f7a35c");

		//You can add objects by hand or creating data objects - one presented below:

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "Start");
		map1.put("y", 120000);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "Product Revenue");
		map2.put("y", 569000);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name", "Service Revenue");
		map3.put("y", 231000);

		HIData data = new HIData();
		data.name = "Positive Balance";
		data.isIntermediateSum = true;
		data.color = HIColor.initWithHexValue("434348");

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Fixed Costs");
		map4.put("y", -342000);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Variable Costs");
		map5.put("y", -233000);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Balance");
		map6.put("isSum", true);
		map6.put("color", "#434348");

		series1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, data, map4, map5, map6));

		series1.dataLabels = new HIDataLabels();
		series1.dataLabels.enabled = true;
		series1.dataLabels.formatter = new HIFunction( "function () { return Highcharts.numberFormat(this.y / 1000, 0, ',') + 'k'; }");
		series1.dataLabels.style = new HIStyle();
		series1.dataLabels.style.fontWeight = "bold";
		series1.pointPadding = 0;

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}


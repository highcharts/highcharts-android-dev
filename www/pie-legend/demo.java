package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
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
		chart.type = "pie";
		chart.plotBackgroundColor = null;
		chart.plotBorderWidth = null;
		chart.plotShadow = false;
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Browser market shares January, 2015 to May, 2015";
		options.title = title;

		HITooltip tooltip = new HITooltip();
		tooltip.pointFormat = "{series.name}: <b>{point.percentage:.1f}%</b>";
		options.tooltip = tooltip;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.pie = new HIPie();
		plotOptions.pie.allowPointSelect = true;
		plotOptions.pie.cursor = "pointer";
		plotOptions.pie.dataLabels = new HIDataLabels();
		plotOptions.pie.dataLabels.enabled = false;
		plotOptions.pie.showInLegend = true;
		options.plotOptions = plotOptions;

		HIPie series1 = new HIPie();
		series1.name = "Brands";

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "Microsoft Internet Explorer");
		map1.put("y", 56.33);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "Chrome");
		map2.put("y", 24.03);
		map2.put("sliced", true);
		map2.put("selected", true);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name", "Firefox");
		map3.put("y", 10.38);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Safari");
		map4.put("y", 4.77);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Opera");
		map5.put("y", 0.91);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Proprietary or Undetectable");
		map6.put("y", 0.2);

		series1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6));

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}


package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
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

		chartView.plugins = new ArrayList<>(Arrays.asList("xrange"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "xrange";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts X-range";
		options.title = title;

		HIXAxis xAxis = new HIXAxis();
		xAxis.type = "datetime";
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		String[] categoriesList = new String[] {"Prototyping", "Development", "Testing" };
		yAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
		yAxis.title = new HITitle();
		yAxis.title.text = "";
		yAxis.reversed = true;
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HIXrange series1 = new HIXrange();
		series1.name = "Project 1";
		//series1.pointPadding = 0;
		//series1.groupZPadding = 0;
		series1.borderColor = HIColor.initWithName("gray");
		series1.pointWidth = 20;

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("x", 1416528000000L);
		map1.put("x2", 1417478400000L);
		map1.put("y" , 0);
		map1.put("partialFill" , 0.25);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("x" , 1417478400000L);
		map2.put("x2" , 1417478400000L);
		map2.put("y" , 1);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("x" , 1417996800000L);
		map3.put("x2" , 1418083200000L);
		map3.put("y" , 2);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("x" , 1418083200000L);
		map4.put("x2" , 1418947200000L);
		map4.put("y" , 1);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("x" , 1418169600000L);
		map5.put("x2" , 1419292800000L);
		map5.put("y" , 2);

		series1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5));

		series1.dataLabels = new HIDataLabels();
		series1.dataLabels.enabled = true;

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}


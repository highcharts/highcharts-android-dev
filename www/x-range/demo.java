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

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Highcharts X-range");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("datetime");
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		String[] categoriesList = new String[] {"Prototyping", "Development", "Testing" };
		yAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
		yAxis.setTitle(new HITitle());
		yAxis.getTitle().setText("");
		yAxis.setReversed(true);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HIXrange series1 = new HIXrange();
		series1.setName("Project 1");
		series1.setPointPadding(0);
		series1.setGroupZPadding(0);
		series1.setBorderColor(HIColor.initWithName("gray"));
		series1.setPointWidth(20);

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

		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5)));

		series1.setDataLabels(new HIDataLabels());
		series1.getDataLabels().setEnabled(true);

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


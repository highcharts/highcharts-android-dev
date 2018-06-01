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

		chartView.plugins = new ArrayList<>(Arrays.asList("treemap"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Fruit consumption");
		options.setTitle(title);

		HITreemap series1 = new HITreemap();
		series1.setLayoutAlgorithm("stripes");
		series1.setAlternateStartingDirection(true);

		HILevels level = new HILevels();
		level.setLevel(1);
		level.setLayoutAlgorithm("sliceAndDice");
		HashMap<String, Object> dataLabels = new HashMap<>();
		dataLabels.put("enabled", true);
		dataLabels.put("align", "left");
		dataLabels.put("verticalAlign", "top");
		HashMap<String, Object> style = new HashMap<>();
		style.put("fontSize", "15px");
		style.put("fontWeight", "bold");
		dataLabels.put("style", style);
		level.setDataLabels(dataLabels);

		series1.setLevels(new ArrayList<>(Arrays.asList(level)));

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("id", "A");
		map1.put("name", "Apples");
		map1.put("color", "#EC2500");

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("id", "B");
		map2.put("name", "Bananas");
		map2.put("color", "#ECE100");

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("id", "O");
		map3.put("name", "Oranges");
		map3.put("color", "#EC9800");

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Anne");
		map4.put("parent", "A");
		map4.put("value", 5);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Rick");
		map5.put("parent", "A");
		map5.put("value", 3);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Peter");
		map6.put("parent", "A");
		map6.put("value", 4);

		HashMap<String, Object> map7 = new HashMap<>();
		map7.put("name", "Anne");
		map7.put("parent", "B");
		map7.put("value", 4);

		HashMap<String, Object> map8 = new HashMap<>();
		map8.put("name", "Rick");
		map8.put("parent", "B");
		map8.put("value", 10);

		HashMap<String, Object> map9 = new HashMap<>();
		map9.put("name", "Peter");
		map9.put("parent", "B");
		map9.put("value", 1);

		HashMap<String, Object> map10 = new HashMap<>();
		map10.put("name", "Anne");
		map10.put("parent", "O");
		map10.put("value", 1);

		HashMap<String, Object> map11 = new HashMap<>();
		map11.put("name", "Rick");
		map11.put("parent", "O");
		map11.put("value", 3);

		HashMap<String, Object> map12 = new HashMap<>();
		map12.put("name", "Peter");
		map12.put("parent", "O");
		map12.put("value", 3);

		HashMap<String, Object> map13 = new HashMap<>();
		map13.put("name", "Susanne");
		map13.put("parent", "Kiwi");
		map13.put("value", 2);
		map13.put("color", "#9EDE00");

		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


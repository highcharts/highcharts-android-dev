package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("heatmap", "treemap"));
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "treemap";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts Treemap";
		options.title = title;

		HITreemap series1 = new HITreemap();
		series1.layoutAlgorithm = "squarified";
		HIData data1 = new HIData();
		data1.name = "A";
		data1.value = 6;
		data1.colorValue = 1;
		HIData data2 = new HIData();
		data2.name = "B";
		data2.value = 6;
		data2.colorValue = 2;
		HIData data3 = new HIData();
		data3.name = "C";
		data3.value = 4;
		data3.colorValue = 3;
		HIData data4 = new HIData();
		data4.name = "D";
		data4.value = 3;
		data4.colorValue = 4;
		HIData data5 = new HIData();
		data5.name = "E";
		data5.value = 2;
		data5.colorValue = 5;
		HIData data6 = new HIData();
		data6.name = "F";
		data6.value = 2;
		data6.colorValue = 6;
		HIData data7 = new HIData();
		data7.name = "G";
		data7.value = 1;
		data7.colorValue = 7;

		series1.data = new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6, data7));

		options.series = new ArrayList<>(Arrays.asList(series1));

		HashMap<String, Object> additionalOptions = new HashMap<>();
		HashMap<String, Object> colorAxis = new HashMap<>();
		colorAxis.put("minColor", "#FFFFFF");
		colorAxis.put("maxColor", "#7cb5ec");
		additionalOptions.put("colorAxis", colorAxis);

		options.additionalOptions = additionalOptions;


		chartView.options = options;
	}
}


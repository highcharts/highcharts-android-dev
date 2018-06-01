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

		chartView.plugins = new ArrayList<>(Arrays.asList("heatmap", "treemap"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Highcharts Treemap");
		options.setTitle(title);

		HITreemap series1 = new HITreemap();
		series1.setLayoutAlgorithm("squarified");
		HIData data1 = new HIData();
		data1.setName("A");
		data1.setValue(6);
		data1.setColorValue(1);
		HIData data2 = new HIData();
		data2.setName("B");
		data2.setValue(6);
		data2.setColorValue(2);
		HIData data3 = new HIData();
		data3.setName("C");
		data3.setValue(4);
		data3.setColorValue(3);
		HIData data4 = new HIData();
		data4.setName("D");
		data4.setValue(3);
		data4.setColorValue(4);
		HIData data5 = new HIData();
		data5.setName("E");
		data5.setValue(2);
		data5.setColorValue(5);
		HIData data6 = new HIData();
		data6.setName("F");
		data6.setValue(2);
		data6.setColorValue(6);
		HIData data7 = new HIData();
		data7.setName("G");
		data7.setValue(1);
		data7.setColorValue(7);

		series1.setData(new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6, data7)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		HashMap<String, Object> additionalOptions = new HashMap<>();
		HashMap<String, Object> colorAxis = new HashMap<>();
		colorAxis.put("minColor", "#FFFFFF");
		colorAxis.put("maxColor", "#7cb5ec");
		additionalOptions.put("colorAxis", colorAxis);

		options.additionalOptions = additionalOptions;

		chartView.setOptions(options);
	}
}


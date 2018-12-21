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

		chartView.plugins = new ArrayList<>();
		chartView.plugins.add("cylinder");

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("cylinder");
		chart.setOptions3d(new HIOptions3d());
		chart.getOptions3d().setEnabled(true);
		chart.getOptions3d().setAlpha(15);
		chart.getOptions3d().setBeta(15);
		chart.getOptions3d().setDepth(50);
		chart.getOptions3d().setViewDistance(25);
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Highcharts Cylinder Chart");
		options.setTitle(title);

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setCylinder(new HICylinder());
		plotoptions.getCylinder().setDepth(25);
		plotoptions.getCylinder().setColorByPoint(true);

		HICylinder cylinder = new HICylinder();
		cylinder.setData(new ArrayList<>(Arrays.asList(29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
		cylinder.setName("Cylinders");
		cylinder.setShowInLegend(false);

		options.setSeries(new ArrayList<>(Collections.singletonList(cylinder)));

		chartView.setOptions(options);
	}
}


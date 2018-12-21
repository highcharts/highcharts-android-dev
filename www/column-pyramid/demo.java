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

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("columnpyramid");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("The 5 highest pyramids in the World");
		options.setTitle(title);

		options.setColors(new ArrayList<>(Arrays.asList("#C79D6D", "#B5927B", "#CE9B84", "#B7A58C", "#C7A58C")));

		HIXAxis xaxis = new HIXAxis();
		xaxis.setCrosshair(new HICrosshair());
		xaxis.setLabels(new HILabels());
		xaxis.getLabels().setStyle(new HICSSObject());
		xaxis.getLabels().getStyle().setFontSize("14px");
		xaxis.setType("category");
		options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

		HIYAxis yaxis = new HIYAxis();
		yaxis.setMin(0);
		yaxis.setTitle(new HITitle());
		yaxis.getTitle().setText("Height (m)");
		options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

		HITooltip tooltip = new HITooltip();
		tooltip.setValueSuffix(" m");
		options.setTooltip(tooltip);

		HIColumnpyramid columnpyramid = new HIColumnpyramid();
		columnpyramid.setName("Height");
		columnpyramid.setColorByPoint(true);
		columnpyramid.setData(new ArrayList<>(Arrays.asList(
		        new Object[]{"Pyramid of Khufu", 138.8},
		        new Object[]{"Pyramid of Khafre", 136.4},
		        new Object[]{"Red Pyramid", 104},
		        new Object[]{"Bent Pyramid", 138.8},
		        new Object[]{"Pyramid of the Sun", 75}
		    )
		));
		columnpyramid.setShowInLegend(false);

		options.setSeries(new ArrayList<>(Collections.singletonList(columnpyramid)));

		chartView.setOptions(options);
	}
}


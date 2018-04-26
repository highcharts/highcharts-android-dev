package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "solidgauge";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "";
		options.title = title;

		HIPane pane = new HIPane();
		String[] center = new String[] { "50%", "85%" };
		pane.center = new ArrayList<>(Arrays.asList(center));
		pane.size = "140%";
		pane.startAngle = -90;
		pane.endAngle = 90;
		HIBackground background = new HIBackground();
		background.backgroundColor = HIColor.initWithHexValue("EEE");
		background.innerRadius = "60%";
		background.outerRadius = "100%";
		background.shape = "arc";
		pane.background = new ArrayList<>(Arrays.asList(background));
		options.pane = pane;

		HITooltip tooltip = new HITooltip();
		tooltip.enabled = false;
		options.tooltip = tooltip;

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.solidgauge = new HISolidgauge();
		plotoptions.solidgauge.dataLabels = new HIDataLabels();
		plotoptions.solidgauge.dataLabels.y = 5;
		plotoptions.solidgauge.dataLabels.borderWidth = 0;
		plotoptions.solidgauge.dataLabels.useHTML = true;
		options.plotOptions = plotoptions;

		HIYAxis yaxis = new HIYAxis();
		ArrayList<Object> stop1 = new ArrayList<>(Arrays.asList(0.1, "#55BF3B" ));
		ArrayList<Object> stop2 = new ArrayList<>(Arrays.asList(0.5, "#DDDF0D" ));
		ArrayList<Object> stop3 = new ArrayList<>(Arrays.asList(0.9, "#DF5353" ));
		yaxis.stops = new ArrayList<>(Arrays.asList(stop1, stop2, stop3));
		yaxis.lineWidth = 0;
		yaxis.tickAmount = 2;
		yaxis.title = new HITitle();
		yaxis.title.text = "Speed";
		yaxis.labels = new HILabels();
		yaxis.labels.y = 16;
		yaxis.min = 0;
		yaxis.max = 200;
		options.yAxis = new ArrayList<>(Arrays.asList(yaxis));

		HICredits credits = new HICredits();
		credits.enabled = false;
		options.credits = credits;

		HISolidgauge series1 = new HISolidgauge();
		series1.name = "Speed";
		series1.tooltip = new HITooltip();
		series1.tooltip.valueSuffix = " km/h";
		series1.dataLabels = new HIDataLabels();
		series1.dataLabels.format = "<div style=\"text-align:center\"><span style=\"font-size:25px;color:black\">{y}</span><br/><span style=\"font-size:12px;color:silver\">km/h</span></div>";
		Number[] series1_data = new Number[] { 80 };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		options.series = new ArrayList<>(Arrays.asList(series1));

		chartView.options = options;
	}
}


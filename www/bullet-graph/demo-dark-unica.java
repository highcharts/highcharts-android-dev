package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
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

		chartView.plugins = new ArrayList<>(Arrays.asList("bullet"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "bullet";
		chart.inverted = true;
		chart.marginLeft = 135;
		options.chart = chart;

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HITitle title = new HITitle();
		title.text = "2017 YTD";
		options.title = title;

		HIXAxis xAxis = new HIXAxis();
		String[] categories = new String[] { "<span class=\"hc-cat-title\">Revenue</span><br/>U.S. $ (1,000s)" };
		xAxis.categories = new ArrayList<>(Arrays.asList(categories));
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yaxis = new HIYAxis();
		yaxis.gridLineWidth = 0;

		HIPlotBands plotbands1 = new HIPlotBands();
		plotbands1.from = 0;
		plotbands1.to = 150;
		plotbands1.color = HIColor.initWithHexValue("666");

		HIPlotBands plotbands2 = new HIPlotBands();
		plotbands2.from = 150;
		plotbands2.to = 250;
		plotbands2.color = HIColor.initWithHexValue("999");

		HIPlotBands plotbands3 = new HIPlotBands();
		plotbands3.from = 225;
		plotbands3.to = 9e9;
		plotbands3.color = HIColor.initWithHexValue("bbb");

		yaxis.plotBands = new ArrayList<>(Arrays.asList(plotbands1, plotbands2, plotbands3));
		yaxis.title = new HITitle();
		options.yAxis = new ArrayList<HIYAxis>(){{add(yaxis);}};

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.series = new HISeries();
		plotoptions.series.borderWidth = 0;
		plotoptions.series.color = HIColor.initWithHexValue("000");
		options.plotOptions = plotoptions;

		HICredits credits = new HICredits();
		credits.enabled = false;
		options.credits = credits;

		HIExporting exporting = new HIExporting();
		exporting.enabled = false;
		options.exporting = exporting;

		HIBullet series1 = new HIBullet();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("y" , 275);
		map1.put("target" , 250);
		series1.data = new ArrayList<>(Arrays.asList(map1));
		series1.tooltip = new HITooltip();
		series1.tooltip.pointFormat = "<b>{point.y}</b> (with target at {point.target})";
		options.series = new ArrayList<>(Arrays.asList(series1));

		chartView.options = options;
	}
}


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

		chartView.plugins = new ArrayList<>(Arrays.asList("bullet"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("bullet");
		chart.setInverted(true);
		chart.setMarginLeft(135);
		options.setChart(chart);

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HITitle title = new HITitle();
		title.setText("2017 YTD");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		String[] categories = new String[] { "<span class=\"hc-cat-title\">Revenue</span><br/>U.S. $ (1,000s)" };
		xAxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yaxis = new HIYAxis();
		yaxis.setGridLineWidth(0);

		HIPlotBands plotbands1 = new HIPlotBands();
		plotbands1.setFrom(0);
		plotbands1.setTo(150);
		plotbands1.setColor(HIColor.initWithHexValue("666"));

		HIPlotBands plotbands2 = new HIPlotBands();
		plotbands2.setFrom(150);
		plotbands2.setTo(250);
		plotbands2.setColor(HIColor.initWithHexValue("999"));

		HIPlotBands plotbands3 = new HIPlotBands();
		plotbands3.setFrom(225);
		plotbands3.setTo(9e9);
		plotbands3.setColor(HIColor.initWithHexValue("bbb"));

		yaxis.setPlotBands(new ArrayList<>(Arrays.asList(plotbands1, plotbands2, plotbands3)));
		yaxis.setTitle(new HITitle());
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setSeries(new HISeries());
		plotoptions.getSeries().setColor(HIColor.initWithHexValue("000"));
		options.setPlotOptions(plotoptions);

		HICredits credits = new HICredits();
		credits.setEnabled(false);
		options.setCredits(credits);

		HIExporting exporting = new HIExporting();
		exporting.setEnabled(false);
		options.setExporting(exporting);

		HIBullet series1 = new HIBullet();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("y" , 275);
		map1.put("target" , 250);
		series1.setData(new ArrayList<>(Arrays.asList(map1)));
		series1.setTooltip(new HITooltip());
		series1.getTooltip().setPointFormat("<b>{point.y}</b> (with target at {point.target})");
		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	    }
}


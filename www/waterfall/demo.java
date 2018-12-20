package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

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

		HITitle title = new HITitle();
		title.setText("Highcharts Waterfall");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("category");
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setTitle(new HITitle());
		yAxis.getTitle().setText("USD");
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HITooltip tooltip = new HITooltip();
		tooltip.setPointFormat("<b>${point.y:,.2f}</b> USD");
		options.setTooltip(tooltip);

		HIWaterfall series1 = new HIWaterfall();
		series1.setUpColor(HIColor.initWithHexValue("90ed7d"));
		series1.setColor(HIColor.initWithHexValue("f7a35c"));

		//You can add objects by hand or creating data objects - one presented below:

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "Start");
		map1.put("y", 120000);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "Product Revenue");
		map2.put("y", 569000);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name", "Service Revenue");
		map3.put("y", 231000);

		HIData data = new HIData();
		data.setName("Positive Balance");
		data.setIsIntermediateSum(true);
		data.setColor(HIColor.initWithHexValue("434348"));

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Fixed Costs");
		map4.put("y", -342000);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Variable Costs");
		map5.put("y", -233000);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Balance");
		map6.put("isSum", true);
		map6.put("color", "#434348");

		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, data, map4, map5, map6)));

		series1.setDataLabels(new HIDataLabels());
		series1.getDataLabels().setEnabled(true);
		series1.getDataLabels().setFormatter(new HIFunction( "function () { return Highcharts.numberFormat(this.y / 1000, 0, ',') + 'k'; }"));
		series1.getDataLabels().setStyle(new HICSSObject());
		series1.getDataLabels().getStyle().setFontWeight("bold");
		series1.setPointPadding(0);

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


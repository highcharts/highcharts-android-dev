package com.highsoft.highcharts.example;

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
		chart.type = "column";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Efficiency Optimization by Branch";
		options.title = title;

		HIXAxis xAxis = new HIXAxis();
		String[] categoriesList = new String[] {"Seattle HQ", "San Francisco", "Tokyo" };
		xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis1 = new HIYAxis();
		yAxis1.min = 0;
		yAxis1.title = new HITitle();
		yAxis1.title.text = "Employees";

		HIYAxis yAxis2 = new HIYAxis();
		yAxis2.title = new HITitle();
		yAxis2.title.text = "Profit (millions)";
		yAxis2.opposite = true;

		options.yAxis = new ArrayList<HIYAxis>(Arrays.asList(yAxis1, yAxis2));

		HILegend legend = new HILegend();
		legend.shadow = false;
		options.legend = legend;

		HITooltip tooltip = new HITooltip();
		tooltip.shared = true;
		options.tooltip = tooltip;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.column = new HIColumn();
		plotOptions.column.grouping = false;
		plotOptions.column.shadow = false;
		plotOptions.column.borderWidth = 0;
		options.plotOptions = plotOptions;

		HIColumn series1 = new HIColumn();
		series1.name = "Employees";
		series1.color = HIColor.initWithRGBA(165, 170, 217, 1);
		Number[] series1_data = new Number[] {150, 73, 20};
		series1.data = new ArrayList<>(Arrays.asList(series1_data));
		series1.pointPadding = 0.3;
		series1.pointPlacement = -0.2;
		HIColumn series2 = new HIColumn();
		series2.name = "Employees Optimized";
		series2.color = HIColor.initWithRGBA(126, 86, 134, 0.9);
		Number[] series2_data = new Number[] {140, 90, 40};
		series2.data = new ArrayList<>(Arrays.asList(series2_data));
		series2.pointPadding = 0.4;
		series2.pointPlacement = -0.2;
		HIColumn series3 = new HIColumn();
		series3.name = "Profit";
		series3.color = HIColor.initWithRGBA(248, 161, 63, 1);
		Number[] series3_data = new Number[] {183.6, 178.8, 198.5};
		series3.data = new ArrayList<>(Arrays.asList(series3_data));
		series3.tooltip = new HITooltip();
		series3.tooltip.valuePrefix = "$";
		series3.tooltip.valueSuffix = " M";
		series3.pointPadding = 0.3;
		series3.pointPlacement = 0.2;
		series3.yAxis = 1;
		HIColumn series4 = new HIColumn();
		series4.name = "Profit Optimized";
		series4.color = HIColor.initWithRGBA(186, 60, 61, 0.9);
		Number[] series4_data = new Number[] {203.6, 198.8, 208.5};
		series4.data = new ArrayList<>(Arrays.asList(series4_data));
		series3.tooltip = new HITooltip();
		series3.tooltip.valuePrefix = "$";
		series3.tooltip.valueSuffix = " M";
		series4.pointPadding = 0.4;
		series4.pointPlacement = 0.2;
		series4.yAxis = 1;
		options.series = new ArrayList<>(Arrays.asList(series1, series2, series3, series4));


		chartView.options = options;
	}
}


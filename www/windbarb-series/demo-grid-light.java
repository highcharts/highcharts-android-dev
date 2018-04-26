package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("windbarb"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "windbarb";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Highcharts Wind Barbs";
		options.title = title;

		HIXAxis xAxis = new HIXAxis();
		xAxis.type = "datetime";
		xAxis.offset = 40;
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.series = new HISeries();
		plotOptions.series.pointStart = 1485648000000L;
		plotOptions.series.pointInterval = 36e5;
		options.plotOptions = plotOptions;

		HIWindbarb series1 = new HIWindbarb();
		series1.name = "Wind";
		series1.color = HIColor.initWithHexValue("0d233a");
		series1.showInLegend = false;
		series1.tooltip = new HITooltip();
		series1.tooltip.valueSuffix = " m/s";
		Number[][] series1_data = new Number[][] { {9.8, 177.9}, {10.1, 177.2}, {11.3, 179.7}, {10.9, 175.5}, {9.3, 159.9}, {8.8, 159.6}, {7.8, 162.6}, {5.6, 186.2}, {6.8, 146.0}, {6.4, 139.9}, {3.1, 180.2}, {4.3, 177.6}, {5.3, 191.8}, {6.3, 173.1}, {7.7, 140.2}, {8.5, 136.1}, {9.4, 142.9}, {10.0, 140.4}, {5.3, 142.1}, {3.8, 141.0}, {3.3, 116.5}, {1.5, 327.5}, {0.1, 1.1}, {1.2, 11.1} };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		HIArea series2 = new HIArea();
		series2.type = "area";
		String[] keys = new String[] { "y", "rotation" };
		series2.keys = new ArrayList<>(Arrays.asList(keys));
		Number[][] series2_data = new Number[][] { {9.8, 177.9}, {10.1, 177.2}, {11.3, 179.7}, {10.9, 175.5}, {9.3, 159.9}, {8.8, 159.6}, {7.8, 162.6}, {5.6, 186.2}, {6.8, 146.0}, {6.4, 139.9}, {3.1, 180.2}, {4.3, 177.6}, {5.3, 191.8}, {6.3, 173.1}, {7.7, 140.2}, {8.5, 136.1}, {9.4, 142.9}, {10.0, 140.4}, {5.3, 142.1}, {3.8, 141.0}, {3.3, 116.5}, {1.5, 327.5}, {0.1, 1.1}, {1.2, 11.1} };
		series2.data = new ArrayList<>(Arrays.asList(series2_data));
		series2.color = HIColor.initWithHexValue("2f7ed8");
		HashMap<String, Number> radialGradient = new HashMap<>();
		radialGradient.put("x1", 0);
		radialGradient.put("x2", 0);
		radialGradient.put("y1", 0);
		radialGradient.put("y2", 1);
		List<List> stops1 = new ArrayList<>();
		List<Object> s11 = new LinkedList<>();
		s11.add(0);
		s11.add("#2f7ed8");
		List<Object> s12 = new LinkedList<>();
		s12.add(1);
		s12.add("rgba(47, 126, 216, 0.25)");
		stops1.add(s11);
		stops1.add(s12);
		series2.fillColor = HIColor.initWithLinearGradient(radialGradient, stops1);
		series2.name = "Wind speed";
		series2.tooltip = new HITooltip();
		series2.tooltip.valueSuffix = " m/s";

		options.series = new ArrayList<>(Arrays.asList(series1, series2));


		chartView.options = options;
	}
}


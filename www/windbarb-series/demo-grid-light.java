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

		HITitle title = new HITitle();
		title.setText("Highcharts Wind Barbs");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("datetime");
		xAxis.setOffset(40);
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSeries(new HISeries());
		plotOptions.getSeries().setPointInterval(1485648000000L);
		plotOptions.getSeries().setPointInterval(36e5);
		options.setPlotOptions(plotOptions);

		HIWindbarb series1 = new HIWindbarb();
		series1.setName("Wind");
		series1.setColor(HIColor.initWithHexValue("0d233a"));
		series1.setShowInLegend(false);
		series1.setTooltip(new HITooltip());
		series1.getTooltip().setValueSuffix(" m/s");
		Number[][] series1_data = new Number[][] { {9.8, 177.9}, {10.1, 177.2}, {11.3, 179.7}, {10.9, 175.5}, {9.3, 159.9}, {8.8, 159.6}, {7.8, 162.6}, {5.6, 186.2}, {6.8, 146.0}, {6.4, 139.9}, {3.1, 180.2}, {4.3, 177.6}, {5.3, 191.8}, {6.3, 173.1}, {7.7, 140.2}, {8.5, 136.1}, {9.4, 142.9}, {10.0, 140.4}, {5.3, 142.1}, {3.8, 141.0}, {3.3, 116.5}, {1.5, 327.5}, {0.1, 1.1}, {1.2, 11.1} };
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

		HIArea series2 = new HIArea();
		series2.setType("area");
		String[] keys = new String[] { "y", "rotation" };
		series2.setKeys(new ArrayList<>(Arrays.asList(keys)));
		Number[][] series2_data = new Number[][] { {9.8, 177.9}, {10.1, 177.2}, {11.3, 179.7}, {10.9, 175.5}, {9.3, 159.9}, {8.8, 159.6}, {7.8, 162.6}, {5.6, 186.2}, {6.8, 146.0}, {6.4, 139.9}, {3.1, 180.2}, {4.3, 177.6}, {5.3, 191.8}, {6.3, 173.1}, {7.7, 140.2}, {8.5, 136.1}, {9.4, 142.9}, {10.0, 140.4}, {5.3, 142.1}, {3.8, 141.0}, {3.3, 116.5}, {1.5, 327.5}, {0.1, 1.1}, {1.2, 11.1} };
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
		series2.setColor(HIColor.initWithHexValue("2f7ed8"));
		LinkedList<HIStop> stops = new LinkedList<>();
		stops.add(new HIStop(0, HIColor.initWithHexValue("2f7ed8")));
		stops.add(new HIStop(1, HIColor.initWithRGBA(47, 126, 216, 0.25)));
		series2.setFillColor(HIColor.initWithLinearGradient(new HIGradient(), stops));
		series2.setName("Wind speed");
		series2.setTooltip(new HITooltip());
		series2.getTooltip().setValueSuffix(" m/s");

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

		chartView.setOptions(options);
	}
}


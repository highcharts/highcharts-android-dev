package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("gauge");
		chart.setAlignTicks(false);
		chart.setPlotBorderWidth(0);
		chart.setPlotShadow(false);
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Speedometer with dual axes");
		options.setTitle(title);

		HIPane pane = new HIPane();
		pane.setStartAngle(-150);
		pane.setEndAngle(150);
		options.setPane(pane);

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.setMin(0);
		yaxis1.setMax(200);
		yaxis1.setLineColor(HIColor.initWithHexValue("339"));
		yaxis1.setTickColor(HIColor.initWithHexValue("339"));
		yaxis1.setMinorTickColor(HIColor.initWithHexValue("339"));
		yaxis1.setOffset(-25);
		yaxis1.setLineWidth(2);
		yaxis1.setLabels(new HILabels());
		yaxis1.getLabels().setDistance(-20);
		yaxis1.setTickLength(5);
		yaxis1.setMinorTickLength(5);
		yaxis1.setEndOnTick(false);

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.setMin(0);
		yaxis2.setMax(124);
		yaxis2.setTickPosition("outside");
		yaxis2.setLineColor(HIColor.initWithHexValue("933"));
		yaxis2.setLineWidth(2);
		yaxis2.setMinorTickPosition("outside");
		yaxis2.setTickColor(HIColor.initWithHexValue("933"));
		yaxis2.setMinorTickColor(HIColor.initWithHexValue("933"));
		yaxis2.setOffset(-20);
		yaxis2.setLabels(new HILabels());
		yaxis2.getLabels().setDistance(12);
		yaxis2.setTickLength(5);
		yaxis2.setMinorTickLength(5);
		yaxis2.setEndOnTick(false);

		options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

		HIGauge series = new HIGauge();
		series.setName("Speed");
		series.setTooltip(new HITooltip());
		series.getTooltip().setValueSuffix(" km/h");
		series.setDataLabels(new HIDataLabels());
		series.getDataLabels().setFormatter(new HIFunction(
		        f -> {
		            Double kmh = (double) f.getProperty("y");
		            Double mph = (double) Math.round(kmh * 0.621);
		            return "<span style=\"color:#339\">" + kmh + " km/h</span><br/>" + "<span style=\"color:#933\">" + mph + " mph</span>";
		        },
		        new String[] {"y"}
		));
		Number[] series1_data = new Number[] { 80 };
		series.setData(new ArrayList<>(Arrays.asList(series1_data)));

		options.setSeries(new ArrayList<>(Collections.singletonList(series)));

		chartView.setOptions(options);
	}
}


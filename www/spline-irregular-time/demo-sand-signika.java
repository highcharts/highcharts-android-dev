package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("series-label"));
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Snow depth at Vikjafjellet, Norway");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Irregular time data in Highcharts JS");
		options.setSubtitle(subtitle);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("datetime");
		xAxis.setDateTimeLabelFormats(new HIDateTimeLabelFormats());
		xAxis.getDateTimeLabelFormats().setMonth("%e. %b");
		xAxis.getDateTimeLabelFormats().setYear("%b");
		xAxis.setTitle(new HITitle());
		xAxis.getTitle().setText("Date");
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setTitle(new HITitle());
		yAxis.getTitle().setText("Snow depth (m)");
		yAxis.setMin(0);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HITooltip tooltip = new HITooltip();
		tooltip.setHeaderFormat("<b>{series.name}</b><br>");
		tooltip.setPointFormat("{point.x:%e. %b}: {point.y:.2f} m");
		options.setTooltip(tooltip);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSpline(new HISpline());
		plotOptions.getSpline().setMarker(new HIMarker());
		plotOptions.getSpline().getMarker().setEnabled(true);
		options.setPlotOptions(plotOptions);

		HISpline series1 = new HISpline();
		series1.setName("Winter 2012-2013");
		Number[][] series1_data = new Number[][] { { 25315200000L, 0 }, { 26524800000L, 0.28 }, { 26956800000L, 0.25 }, { 28512000000L, 0.2 }, { 28944000000L, 0.28 }, { 31017600000L, 0.28 }, { 31276800000L, 0.47 }, { 32400000000L, 0.79 }, { 33696000000L, 0.72 }, { 34387200000L, 1.02 }, { 35078400000L, 1.12 }, { 36288000000L, 1.2 }, { 37497600000L, 1.18 }, { 40176000000L, 1.19 }, { 41904000000L, 1.85 }, { 42249600000L, 2.22 }, { 43459200000L, 1.15 }, { 44755200000L, 0 } };
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

		HISpline series2 = new HISpline();
		series2.setName("Winter 2013-2014");
		Number[][] series2_data = new Number[][] { { 26006400000L, 0 }, { 26956800000L, 0.4 }, { 28857600000L, 0.25 }, { 31536000000L, 1.66 }, { 32313600000L, 1.8 }, { 35769600000L, 1.76 }, { 38707200000L, 2.62 }, { 40867200000L, 2.41 }, { 41817600000L, 2.05 }, { 43027200000L, 1.7 }, { 43891200000L, 1.1 }, { 45360000000L, 0 } };
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

		HISpline series3 = new HISpline();
		series3.setName("Winter 2014-2015");
		Number[][] series3_data = new Number[][] { { 28339200000L, 0 }, { 29289600000L, 0.25 }, { 30499200000L, 1.41 }, { 30931200000L, 1.64 }, { 31795200000L, 1.6 }, { 32918400000L, 2.55 }, { 33523200000L, 2.62 }, { 34473600000L, 2.5 }, { 35337600000L, 2.42 }, { 37065600000L, 2.74 }, { 37756800000L, 2.62 }, { 38620800000L, 2.6 }, { 39398400000L, 2.81 }, { 40262400000L, 2.63 }, { 41644800000L, 2.77 }, { 42249600000L, 2.68 }, { 42681600000L, 2.56 }, { 43113600000L, 2.39 }, { 43545600000L, 2.3 }, { 44928000000L, 2 }, { 45360000000L, 1.85 }, { 45792000000L, 1.49 }, { 46483200000L, 1.08 } };
		series3.setData(new ArrayList<>(Arrays.asList(series3_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));

		chartView.setOptions(options);
	}
}


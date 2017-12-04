package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("series-label"));
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "spline";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Wind speed during two days";
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "May 31 and and June 1, 2015 at two locations in Vik i Sogn, Norway";
		options.subtitle = subtitle;

		HIXAxis xAxis = new HIXAxis();
		xAxis.type = "datetime";
		xAxis.labels = new HILabels();
		xAxis.labels.overflow = "justify";
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.title = new HITitle();
		yAxis.title.text = "Wind speed (m/s)";
		yAxis.minorGridLineWidth = 0;
		yAxis.gridLineWidth = 0;
		yAxis.alternateGridColor = null;

		HIPlotBands plotBands1 = new HIPlotBands();
		plotBands1.from = 0.3;
		plotBands1.to = 1.5;
		plotBands1.color = HIColor.initWithRGBA(68, 170, 213, 0.1);
		plotBands1.label = new HILabel();
		plotBands1.label.text = "Light air";
		plotBands1.label.style = new HIStyle();
		plotBands1.label.style.color = "606060";

		HIPlotBands plotBands2 = new HIPlotBands();
		plotBands2.from = 1.5;
		plotBands2.to = 3.3;
		plotBands2.color = HIColor.initWithRGBA(0, 0, 0, 0);
		plotBands2.label = new HILabel();
		plotBands2.label.text = "Light breeze";
		plotBands2.label.style = new HIStyle();
		plotBands2.label.style.color = "#606060";

		HIPlotBands plotBands3 = new HIPlotBands();
		plotBands3.from = 3.3;
		plotBands3.to = 5.5;
		plotBands3.color = HIColor.initWithRGBA(68, 170, 213, 0.1);
		plotBands3.label = new HILabel();
		plotBands3.label.text = "Gentle breeze";
		plotBands3.label.style = new HIStyle();
		plotBands3.label.style.color = "#606060";

		HIPlotBands plotBands4 = new HIPlotBands();
		plotBands4.from = 5.5;
		plotBands4.to = 8;
		plotBands4.color = HIColor.initWithRGBA(0, 0, 0, 0);
		plotBands4.label = new HILabel();
		plotBands4.label.text = "Moderate breeze";
		plotBands4.label.style = new HIStyle();
		plotBands4.label.style.color = "#606060";

		HIPlotBands plotBands5 = new HIPlotBands();
		plotBands5.from = 8;
		plotBands5.to = 11;
		plotBands5.color = HIColor.initWithRGBA(68, 170, 213, 0.1);
		plotBands5.label = new HILabel();
		plotBands5.label.text = "Fresh breeze";
		plotBands5.label.style = new HIStyle();
		plotBands5.label.style.color = "#606060";

		HIPlotBands plotBands6 = new HIPlotBands();
		plotBands6.from = 11;
		plotBands6.to = 14;
		plotBands6.color = HIColor.initWithRGBA(0, 0, 0, 0);
		plotBands6.label = new HILabel();
		plotBands6.label.text = "Strong breeze";
		plotBands6.label.style = new HIStyle();
		plotBands6.label.style.color = "#606060";

		HIPlotBands plotBands7 = new HIPlotBands();
		plotBands7.from = 14;
		plotBands7.to = 15;
		plotBands7.color = HIColor.initWithRGBA(68, 170, 213, 0.1);
		plotBands6.label = new HILabel();
		plotBands6.label.text = "High wind";
		plotBands6.label.style = new HIStyle();
		plotBands6.label.style.color = "#606060";

		HIPlotBands[] plotBandsList = new HIPlotBands[] { plotBands1, plotBands2, plotBands3, plotBands4, plotBands5, plotBands6, plotBands7 };
		yAxis.plotBands = new ArrayList<>(Arrays.asList(plotBandsList));
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HITooltip tooltip = new HITooltip();
		tooltip.valueSuffix = " m/s";
		options.tooltip = tooltip;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.spline = new HISpline();
		plotOptions.spline.lineWidth = 4;
		plotOptions.spline.states = new HIStates();
		plotOptions.spline.states.hover = new HIHover();
		plotOptions.spline.states.hover.lineWidth = 5;
		plotOptions.spline.marker = new HIMarker();
		plotOptions.spline.marker.enabled = false;
		plotOptions.spline.pointInterval = 3600000;
		plotOptions.spline.pointStart = Date.UTC(2015, 4, 31, 0, 0, 0);
		options.plotOptions = plotOptions;

		HISpline series1 = new HISpline();
		series1.name = "Hestavollane";
		Number[] series1_data = new Number[] {0.2, 0.8, 0.8, 0.8, 1, 1.3, 1.5, 2.9, 1.9, 2.6, 1.6, 3, 4, 3.6, 4.5, 4.2, 4.5, 4.5, 4, 3.1, 2.7, 4, 2.7, 2.3, 2.3, 4.1, 7.7, 7.1, 5.6, 6.1, 5.8, 8.6, 7.2, 9, 10.9, 11.5, 11.6, 11.1, 12, 12.3, 10.7, 9.4, 9.8, 9.6, 9.8, 9.5, 8.5, 7.4, 7.6};
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		HISpline series2 = new HISpline();
		series2.name = "Vik";
		Number[] series2_data = new Number[] {0, 0, 0.6, 0.9, 0.8, 0.2, 0, 0, 0, 0.1, 0.6, 0.7, 0.8, 0.6, 0.2, 0, 0.1, 0.3, 0.3, 0, 0.1, 0, 0, 0, 0.2, 0.1, 0, 0.3, 0, 0.1, 0.2, 0.1, 0.3, 0.3, 0, 3.1, 3.1, 2.5, 1.5, 1.9, 2.1, 1, 2.3, 1.9, 1.2, 0.7, 1.3, 0.4, 0.3};
		series2.data = new ArrayList<>(Arrays.asList(series2_data));

		options.series = new ArrayList<>(Arrays.asList(series1, series2));

		HINavigation navigation = new HINavigation();
		navigation.menuItemStyle = new HIMenuItemStyle();
		navigation.menuItemStyle.fontSize = "10px";
		options.navigation = navigation;


		chartView.options = options;
	}
}


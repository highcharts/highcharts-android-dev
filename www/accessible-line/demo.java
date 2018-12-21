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

		chartView.plugins = new ArrayList<>();
		chartView.plugins.add("accessibility");

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("spline");
		chart.setDefinition("Most commonly used desktop screen readers from January 2009 to July 2015 as reported in the Webaim Survey. JAWS remains the most used screen reader, but is steadily declining. ZoomText and WindowEyes are both displaying large growth from 2014 to 2015.");
		options.setChart(chart);

		HILegend legend = new HILegend();
		legend.setSymbolWidth(40);
		options.setLegend(legend);

		HITitle title = new HITitle();
		title.setText("Desktop screen readers from 2009 to 2015");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Click on point to visit official website");
		options.setSubtitle(subtitle);

		HIYAxis hiyAxis = new HIYAxis();
		hiyAxis.setTitle(new HITitle());
		hiyAxis.getTitle().setText("Percentage usage");
		options.setYAxis(new ArrayList<>(Collections.singletonList(hiyAxis)));

		HIXAxis hixAxis = new HIXAxis();
		hixAxis.setTitle(new HITitle());
		hixAxis.getTitle().setText("Time");
		hixAxis.setDefinition("Time from January 2009 to July 2015");
		hixAxis.setCategories(new ArrayList<String>(Arrays.asList("January 2009", "December 2010", "May 2012", "January 2014", "July 2015")));
		options.setXAxis(new ArrayList<>(Collections.singletonList(hixAxis)));

		HITooltip tooltip = new HITooltip();
		tooltip.setSplit(true);
		options.setTooltip(tooltip);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSeries(new HISeries());
		plotOptions.getSeries().setPoint(new HIPoint());
		plotOptions.getSeries().getPoint().setEvents(new HIEvents());
		plotOptions.getSeries().getPoint().getEvents().setClick(new HIFunction("function() { window.location.href = this.series.options.website; }"));
		plotOptions.getSeries().setCursor("pointer");
		options.setPlotOptions(plotOptions);

		HISpline spline1 = new HISpline();
		spline1.setName("JAWS");
		spline1.setData(new ArrayList<>(Arrays.asList(74, 69.6, 63.7, 63.9, 43.7)));

		HISpline spline2 = new HISpline();
		spline2.setName("NVDA");
		spline2.setData(new ArrayList<>(Arrays.asList(8, 34.8, 43.0, 51.2, 41.4)));
		spline2.setDashStyle("Dot");

		HISpline spline3 = new HISpline();
		spline3.setName("VoiceOver");
		spline3.setData(new ArrayList<>(Arrays.asList(8, 34.8, 43.0, 51.2, 41.4)));
		spline3.setDashStyle("ShortDot");
		spline3.setColor(HIColor.initWithHexValue("77a1e5"));

		HISpline spline4 = new HISpline();
		spline4.setName("Window-Eyes");
		spline4.setData(new ArrayList<>(Arrays.asList(23, 19.0, 20.7, 13.9, 29.6)));
		spline4.setDashStyle("Dash");
		spline4.setColor(HIColor.initWithHexValue("2f7ed8"));

		HISpline spline5 = new HISpline();
		spline5.setName("ZoomText");
		spline5.setData(new ArrayList<>(Arrays.asList(0, 6.1, 6.8, 5.3, 27.5)));
		spline5.setDashStyle("ShortDashDot");
		spline5.setColor(HIColor.initWithHexValue("c42525"));

		HISpline spline6 = new HISpline();
		spline6.setName("System Access To Go");
		spline6.setData(new ArrayList<>(Arrays.asList(0, 16.2, 22.1, 26.2, 6.9)));
		spline6.setDashStyle("ShortDash");
		spline6.setColor(HIColor.initWithHexValue("0d233a"));

		HISpline spline7 = new HISpline();
		spline7.setName("ChromeVox");
		spline7.setData(new ArrayList<>(Arrays.asList(0, 0, 2.8, 4.8, 2.8)));
		spline6.setDashStyle("DotDash");
		spline6.setColor(HIColor.initWithHexValue("1aadce"));

		HISpline spline8 = new HISpline();
		spline8.setName("Other");
		spline8.setData(new ArrayList<>(Arrays.asList(0, 7.4, 5.9, 9.3, 6.5)));
		spline8.setDashStyle("LongDash");
		spline8.setColor(HIColor.initWithHexValue("77a1e5"));

		options.setSeries(new ArrayList<>(Arrays.asList(spline1, spline2, spline3, spline4, spline5, spline6, spline7, spline8)));

		chartView.setOptions(options);
	}
}


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

		chartView.theme = "grid-light";

		chartView.plugins = new ArrayList<>();
		chartView.plugins.add("accessibility");
		chartView.plugins.add("pattern-fill");

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("pie");
		chart.setDefinition("Most commonly used desktop screen readers in July 2015 as reported in the Webaim Survey. Shown as percentage of respondents. JAWS is by far the most used screen reader, with 30% of respondents using it. ZoomText and Window-Eyes follow, each with around 20% usage.");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Desktop screen readers");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Click on point to visit official website");
		options.setSubtitle(subtitle);

		HIPlotOptions plotoptions  = new HIPlotOptions();
		plotoptions.setSeries(new HISeries());
		plotoptions.getSeries().setDataLabels(new HIDataLabels());
		plotoptions.getSeries().getDataLabels().setEnabled(true);
		plotoptions.getSeries().getDataLabels().setConnectorColor(HIColor.initWithHexValue("2f7ed8"));
		plotoptions.getSeries().getDataLabels().setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
		plotoptions.getSeries().setPoint(new HIPoint());
		plotoptions.getSeries().getPoint().setEvents(new HIEvents());
		plotoptions.getSeries().getPoint().getEvents().setClick(new HIFunction("function () { window.location.href = this.website; }"));
		plotoptions.getSeries().setCursor("pointer");
		options.setPlotOptions(plotoptions);

		HIPie pie  = new HIPie();
		pie.setName("Percentage usage");
		pie.setBorderColor(HIColor.initWithHexValue("2f7ed8"));

		HIData data1  = new HIData();
		data1.setName("JAWS");
		data1.setY(30.2);
		data1.setColor(HIColor.initWithName("url(#highcharts-default-pattern-0)"));
		data1.setDefinition("This is the most used desktop screen reader");
		HIData data2  = new HIData();
		data2.setName("ZoomText");
		data2.setY(22.2);
		data2.setColor(HIColor.initWithName("url(#highcharts-default-pattern-1)"));
		HIData data3  = new HIData();
		data3.setName("Window-Eyes");
		data3.setY(20.7);
		data3.setColor(HIColor.initWithName("url(#highcharts-default-pattern-2)"));
		HIData data4  = new HIData();
		data4.setName("NVDA");
		data4.setY(14.6);
		data4.setColor(HIColor.initWithName("url(#highcharts-default-pattern-4)"));
		HIData data5  = new HIData();
		data5.setName("VoiceOver");
		data5.setY(7.6);
		data5.setColor(HIColor.initWithName("url(#highcharts-default-pattern-3)"));
		HIData data6  = new HIData();
		data6.setName("System Access To Go");
		data6.setY(1.5);
		data6.setColor(HIColor.initWithName("url(#highcharts-default-pattern-7)"));
		HIData data7  = new HIData();
		data7.setName("ChromeVox");
		data7.setY(0.3);
		data7.setColor(HIColor.initWithName("url(#highcharts-default-pattern-6)"));
		HIData data8  = new HIData();
		data8.setName("Other");
		data8.setY(2.9);
		data8.setColor(HIColor.initWithName("url(#highcharts-default-pattern-5)"));

		pie.setData(new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6, data7, data8)));

		chartView.setOptions(options);
	}
}


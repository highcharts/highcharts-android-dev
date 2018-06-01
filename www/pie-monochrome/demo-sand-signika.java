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
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "pie";
		chart.plotBackgroundColor = null;
		chart.plotBorderWidth = null;
		chart.plotShadow = false;
		options.chart = chart;

		HIColor color1 = HIColor.initWithRGB(15, 72, 127);
		HIColor color2 = HIColor.initWithRGB(52, 109, 164);
		HIColor color3 = HIColor.initWithRGB(88, 145, 200);
		HIColor color4 = HIColor.initWithRGB(124, 181, 236);
		HIColor color5 = HIColor.initWithRGB(160, 217, 255);
		HIColor color6 = HIColor.initWithRGB(196, 253, 255);
		HIColor color7 = HIColor.initWithRGB(233, 255, 255);
		HIColor color8 = HIColor.initWithRGB(255, 255, 255);
		HIColor color9 = HIColor.initWithRGB(255, 255, 255);
		HIColor color10 = HIColor.initWithRGB(255, 255, 255);
		ArrayList<HIColor> colors = new ArrayList<>(Arrays.asList(color1, color2, color3, color4, color5, color6, color7, color8, color9, color10));
		options.setColors(colors);

		HITitle title = new HITitle();
		title.setText("Browser market shares at a specific website, 2014");
		options.setTitle(title);

		HITooltip tooltip = new HITooltip();
		tooltip.setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
		options.setTooltip(tooltip);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setPie(new HIPie());
		plotOptions.getPie().setAllowPointSelect(true);
		plotOptions.getPie().setCursor("pointer");
		plotOptions.getPie().setDataLabels(new HIDataLabels());
		plotOptions.getPie().getDataLabels().setEnabled(true);
		plotOptions.getPie().getDataLabels().setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
		plotOptions.getPie().getDataLabels().setStyle(new HIStyle());
		plotOptions.getPie().getDataLabels().getStyle().setColor("black");
		options.setPlotOptions(plotOptions);

		HIPie series1 = new HIPie();
		series1.setName("Brands");

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "Microsoft Internet Explorer");
		map1.put("y", 56.33);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "Chrome");
		map2.put("y", 24.03);
		map2.put("sliced", true);
		map2.put("selected", true);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name", "Firefox");
		map3.put("y", 10.38);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Safari");
		map4.put("y", 4.77);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Opera");
		map5.put("y", 0.91);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Proprietary or Undetectable");
		map6.put("y", 0.2);

		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


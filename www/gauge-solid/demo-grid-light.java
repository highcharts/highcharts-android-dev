package com.highcharts.DevGround.example;

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
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("solidgauge");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("");
		options.setTitle(title);

		HIPane pane = new HIPane();
		String[] center = new String[] { "50%", "85%" };
		pane.setCenter(new ArrayList<>(Arrays.asList(center)));
		pane.setSize("140%");
		pane.setStartAngle(-90);
		pane.setEndAngle(90);
		HIBackground background = new HIBackground();
		background.setBackgroundColor(HIColor.initWithHexValue("EEE"));
		background.setInnerRadius("60%");
		background.setOuterRadius("100%");
		background.setShape("arc");
		pane.setBackground(new ArrayList<>(Arrays.asList(background)));
		options.setPane(pane);

		HITooltip tooltip = new HITooltip();
		tooltip.setEnabled(false);
		options.setTooltip(tooltip);

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setSolidgauge(new HISolidgauge());
		plotoptions.getSolidgauge().setDataLabels(new HIDataLabels());
		plotoptions.getSolidgauge().getDataLabels().setY(5);
		plotoptions.getSolidgauge().getDataLabels().setBorderWidth(0);
		plotoptions.getSolidgauge().getDataLabels().setUseHTML(true);
		options.setPlotOptions(plotoptions);

		HIYAxis yaxis = new HIYAxis();
		ArrayList<Object> stop1 = new ArrayList<>(Arrays.asList(0.1, "#55BF3B" ));
		ArrayList<Object> stop2 = new ArrayList<>(Arrays.asList(0.5, "#DDDF0D" ));
		ArrayList<Object> stop3 = new ArrayList<>(Arrays.asList(0.9, "#DF5353" ));
		yaxis.setStops(new ArrayList<>(Arrays.asList(stop1, stop2, stop3)));
		yaxis.setLineWidth(0);
		yaxis.setTickAmount(2);
		yaxis.setTitle(new HITitle());
		yaxis.getTitle().setText("Speed");
		yaxis.setLabels(new HILabels());
		yaxis.getTitle().setY(16);
		yaxis.setMin(0);
		yaxis.setMax(200);
		options.setYAxis(new ArrayList<>(Arrays.asList(yaxis)));

		HICredits credits = new HICredits();
		credits.setEnabled(false);
		options.setCredits(credits);

		HISolidgauge series1 = new HISolidgauge();
		series1.setName("Speed");
		series1.setTooltip(new HITooltip());
		series1.getTooltip().setValueSuffix(" km/h");
		series1.setDataLabels(new HIDataLabels());
		series1.getDataLabels().setFormat("<div style=\"text-align:center\"><span style=\"font-size:25px;color:black\">{y}</span><br/><span style=\"font-size:12px;color:silver\">km/h</span></div>");
		Number[] series1_data = new Number[] { 80 };
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


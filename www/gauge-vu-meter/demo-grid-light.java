package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
		chart.setPlotBorderWidth(1);
		LinkedList<HIStop> stops = new LinkedList<>();
		stops.add(new HIStop(0, HIColor.initWithHexValue("FFF4C6")));
		stops.add(new HIStop(0.3f, HIColor.initWithHexValue("FFFFFF")));
		stops.add(new HIStop(1, HIColor.initWithHexValue("FFF4C6")));
		chart.setPlotBackgroundColor(HIColor.initWithLinearGradient(new HIGradient(), stops));
		chart.setHeight(200);
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("VU meter");
		options.setTitle(title);

		HIPane pane = new HIPane();
		pane.setStartAngle(-45);
		pane.setEndAngle(45);
		pane.setBackground(new ArrayList<>());
		pane.setSize(300);
		pane.setCenter(new ArrayList<>(Arrays.asList("50%", "130%")));
		options.setPane(pane);

		HITooltip tooltip = new HITooltip();
		tooltip.setEnabled(false);
		options.setTooltip(tooltip);

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.setMin(-20);
		yaxis1.setMax(6);
		yaxis1.setMinorTickPosition("outside");
		yaxis1.setTickPosition("outside");
		yaxis1.setLabels(new HILabels());
		yaxis1.getLabels().setDistance(20);
		yaxis1.setTitle(new HITitle());
		yaxis1.getTitle().setText("VU<br/><span style=\"font-size:8px\">Channel A</span>");
		yaxis1.getTitle().setY(-40);
		HIPlotBands plotband1 = new HIPlotBands();
		plotband1.setFrom(0);
		plotband1.setTo(6);
		plotband1.setColor(HIColor.initWithHexValue("C02316"));
		plotband1.setInnerRadius("100%");
		plotband1.setOuterRadius("105%");
		yaxis1.setPlotBands(new ArrayList<>(Collections.singletonList(plotband1)));

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.setMin(-20);
		yaxis2.setMax(6);
		yaxis2.setMinorTickPosition("outside");
		yaxis2.setTickPosition("outside");
		yaxis2.setLabels(new HILabels());
		yaxis2.getLabels().setDistance(20);
		yaxis2.setTitle(new HITitle());
		yaxis2.getTitle().setText("VU<br/><span style=\"font-size:8px\">Channel B</span>");
		yaxis2.getTitle().setY(-40);
		HIPlotBands plotband2 = new HIPlotBands();
		plotband2.setFrom(0);
		plotband2.setTo(6);
		plotband2.setColor(HIColor.initWithHexValue("C02316"));
		plotband2.setInnerRadius("100%");
		plotband2.setOuterRadius("105%");
		yaxis2.setPlotBands(new ArrayList<>(Collections.singletonList(plotband2)));

		options.setYAxis(new ArrayList<>(Arrays.asList(yaxis2, yaxis2)));

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setGauge(new HIGauge());
		plotoptions.getGauge().setDataLabels(new HIDataLabels());
		plotoptions.getGauge().getDataLabels().setEnabled(false);
		plotoptions.getGauge().setDial(new HIDial());
		plotoptions.getGauge().getDial().setRadius("100%");
		options.setPlotOptions(plotoptions);

		HIGauge gauge1 = new HIGauge();
		gauge1.setName("Channel A");
		gauge1.setYAxis(0);
		gauge1.setData(new ArrayList<>(Collections.singletonList(-20)));
		HIGauge gauge2 = new HIGauge();
		gauge2.setName("Channel A");
		gauge2.setYAxis(1);
		gauge2.setData(new ArrayList<>(Collections.singletonList(-20)));

		options.setSeries(new ArrayList<>(Arrays.asList(gauge2, gauge2)));

		chartView.setOptions(options);
        }
}

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
import java.util.Map;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                HIChartView chartView = findViewById(R.id.hc);

                HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("gauge");
		chart.setPlotBorderWidth(0);
		chart.setPlotShadow(false);
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Speedometer");
		options.setTitle(title);

		HIPane pane = new HIPane();
		pane.setStartAngle(-150);
		pane.setEndAngle(150);
		HIBackground background1 = new HIBackground();
		HIGradient gradient = new HIGradient();
		LinkedList<HIStop> stops = new LinkedList<>();
		stops.add(new HIStop(0, HIColor.initWithHexValue("FFF")));
		stops.add(new HIStop(1, HIColor.initWithHexValue("333")));
		background1.setBackgroundColor(HIColor.initWithLinearGradient(gradient, stops));
		background1.setBorderWidth(0);
		background1.setOuterRadius("109%");
		HIBackground background2 = new HIBackground();
		background2.setBackgroundColor(HIColor.initWithLinearGradient(gradient, stops));
		background2.setBorderWidth(1);
		background2.setOuterRadius("107%");
		HIBackground background3 = new HIBackground();
		HIBackground background4 = new HIBackground();
		background4.setBackgroundColor(HIColor.initWithHexValue("DDD"));
		background4.setBorderWidth(0);
		background4.setOuterRadius("105%");
		background4.setInnerRadius("103%");
		pane.setBackground(new ArrayList<>(Arrays.asList(background1, background2, background3, background4)));
		options.setPane(pane);

		HIYAxis yaxis = new HIYAxis();
		yaxis.setMin(0);
		yaxis.setMax(200);
		yaxis.setMinorTickWidth(1);
		yaxis.setMinorTickLength(10);
		yaxis.setMinorTickPosition("inside");
		yaxis.setMinorTickColor(HIColor.initWithHexValue("666"));
		yaxis.setTickPixelInterval(30);
		yaxis.setTickWidth(2);
		yaxis.setTickPosition("inside");
		yaxis.setTickLength(10);
		yaxis.setTickColor(HIColor.initWithHexValue("666"));
		yaxis.setLabels(new HILabels());
		yaxis.getLabels().setStep(2);
		yaxis.setTitle(new HITitle());
		yaxis.getTitle().setText("km/h");
		HIPlotBands plotband1 = new HIPlotBands();
		plotband1.setFrom(0);
		plotband1.setTo(120);
		plotband1.setColor(HIColor.initWithHexValue("55BF3B"));
		HIPlotBands plotband2 = new HIPlotBands();
		plotband2.setFrom(120);
		plotband2.setTo(160);
		plotband2.setColor(HIColor.initWithHexValue("DDDF0D"));
		HIPlotBands plotband3 = new HIPlotBands();
		plotband3.setFrom(160);
		plotband3.setTo(200);
		plotband3.setColor(HIColor.initWithHexValue("DF5353"));
		yaxis.setPlotBands(new ArrayList<>(Arrays.asList(plotband1, plotband2, plotband3)));
		options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

		HIGauge gauge = new HIGauge();
		gauge.setName("Speed");
		gauge.setTooltip(new HITooltip());
		gauge.getTooltip().setValueSuffix(" km/h");
		gauge.setData(new ArrayList<>(Collections.singletonList(80)));

		options.setSeries(new ArrayList<>(Collections.singletonList(gauge)));

                chartView.options = options;
        }
}


package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

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

                HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
		chartView.theme = "dark-unica";

                HIOptions options = new HIOptions();

                HIChart chart = new HIChart();
                chart.type = "gauge";
                chart.plotBorderWidth = 1;
                HashMap<String, Object>  gradientPoints = new HashMap<>();
                gradientPoints.put("x1", 0);
                gradientPoints.put("x2", 0);
                gradientPoints.put("y1", 0);
                gradientPoints.put("y2", 1);
                List<List> gradientColors = new ArrayList<>();
                List<Object> l1 = new LinkedList<>();
                l1.add(0);
                l1.add("#FFF4C6");
                List<Object> l2 = new LinkedList<>();
                l2.add(0.3);
                l2.add("#FFFFFF");
                List<Object> l3 = new LinkedList<>();
                l3.add(1);
                l3.add("#FFF4C6");
                gradientColors.add(l1);
                gradientColors.add(l2);
                gradientColors.add(l3);
                chart.plotBackgroundColor = HIColor.initWithLinearGradient(gradientPoints, gradientColors);
                chart.height = 200;
                options.chart = chart;

                HITitle title = new HITitle();
                title.text = "VU meter";
                options.title = title;

                HIPane pane = new HIPane();
                pane.startAngle = -45;
                pane.endAngle = 45;
                pane.background = new ArrayList<>();
                pane.size = 300;
                pane.center = new ArrayList<>(Arrays.asList("50%", "130%"));
                options.pane = pane;

                HITooltip tooltip = new HITooltip();
                tooltip.enabled = false;
                options.tooltip = tooltip;

                HIYAxis yaxis1 = new HIYAxis();
                yaxis1.min = -20;
                yaxis1.max = 6;
                yaxis1.minorTickPosition = "outside";
                yaxis1.tickPosition = "outside";
                yaxis1.labels = new HILabels();
                yaxis1.labels.distance = 20;
                yaxis1.title = new HITitle();
                yaxis1.title.text = "VU<br/><span style=\"font-size:8px\">Channel A</span>";
                yaxis1.title.y = -40;
                HIPlotBands plotband1 = new HIPlotBands();
                plotband1.from = 0;
                plotband1.to = 6;
                plotband1.color = HIColor.initWithHexValue("C02316");
                plotband1.innerRadius = "100%";
                plotband1.outerRadius = "105%";
                yaxis1.plotBands = new ArrayList<>(Collections.singletonList(plotband1));

                HIYAxis yaxis2 = new HIYAxis();
                yaxis2.min = -20;
                yaxis2.max = 6;
                yaxis2.minorTickPosition = "outside";
                yaxis2.tickPosition = "outside";
                yaxis2.labels = new HILabels();
                yaxis2.labels.distance = 20;
                yaxis2.title = new HITitle();
                yaxis2.title.text = "VU<br/><span style=\"font-size:8px\">Channel B</span>";
                yaxis2.title.y = -40;
                HIPlotBands plotband2 = new HIPlotBands();
                plotband2.from = 0;
                plotband2.to = 6;
                plotband2.color = HIColor.initWithHexValue("C02316");
                plotband2.innerRadius = "100%";
                plotband2.outerRadius = "105%";
                yaxis2.plotBands = new ArrayList<>(Collections.singletonList(plotband2));

                options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

                HIPlotOptions plotoptions = new HIPlotOptions();
                plotoptions.gauge = new HIGauge();
                plotoptions.gauge.dataLabels = new HIDataLabels();
                plotoptions.gauge.dataLabels.enabled = false;
                plotoptions.gauge.dial = new HIDial();
                plotoptions.gauge.dial.radius = "100%";
                options.plotOptions = plotoptions;

                HIGauge gauge1 = new HIGauge();
                gauge1.name = "Channel A";
                gauge1.yAxis = 0;
                gauge1.data = new ArrayList<>(Collections.singletonList(-20));
                HIGauge gauge2 = new HIGauge();
                gauge2.name = "Channel B";
                gauge2.yAxis = 1;
                gauge2.data = new ArrayList<>(Collections.singletonList(-20));

                options.series = new ArrayList<>(Arrays.asList(gauge1, gauge2));

                chartView.options = options;
        }
}

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
		chartView.theme = "sand-signika";

                HIOptions options = new HIOptions();

                HIChart chart = new HIChart();
                chart.type = "gauge";
                chart.plotBorderWidth = 0;
                chart.plotShadow = false;
                options.chart = chart;

                HITitle title = new HITitle();
                title.text = "Speedometer";
                options.title = title;

                HIPane pane = new HIPane();
                pane.startAngle = -150;
                pane.endAngle = 150;
                HIBackground background1 = new HIBackground();
                Map<String, Number> fillGradientPoints = new HashMap<>();
                fillGradientPoints.put("x1", 0);
                fillGradientPoints.put("y1", 0);
                fillGradientPoints.put("x2", 0);
                fillGradientPoints.put("y2", 1);
                List<List> fillGradientColors = new ArrayList<>();
                List<Object> g1 = new LinkedList<>();
                g1.add(0);
                g1.add("#FFF");
                List<Object> g2 = new LinkedList<>();
                g2.add(1);
                g2.add("#333");
                fillGradientColors.add(g1);
                fillGradientColors.add(g2);
                background1.backgroundColor = HIColor.initWithLinearGradient(fillGradientPoints, fillGradientColors);
                background1.borderWidth = 0;
                background1.outerRadius = "109%";
                HIBackground background2 = new HIBackground();
                Map<String, Number> fillGradientPoints2 = new HashMap<>();
                fillGradientPoints2.put("x1", 0);
                fillGradientPoints2.put("y1", 0);
                fillGradientPoints2.put("x2", 0);
                fillGradientPoints2.put("y2", 1);
                List<List> fillGradientColors2 = new ArrayList<>();
                List<Object> g11 = new LinkedList<>();
                g11.add(0);
                g11.add("#FFF");
                List<Object> g22 = new LinkedList<>();
                g22.add(1);
                g22.add("#333");
                fillGradientColors2.add(g11);
                fillGradientColors2.add(g22);
                background1.backgroundColor = HIColor.initWithLinearGradient(fillGradientPoints2, fillGradientColors2);
                background2.borderWidth = 1;
                background2.outerRadius = "107%";
                HIBackground background3 = new HIBackground();
                HIBackground background4 = new HIBackground();
                background4.backgroundColor = HIColor.initWithHexValue("DDD");
                background4.borderWidth = 0;
                background4.outerRadius = "105%";
                background4.innerRadius = "103%";
                pane.background = new ArrayList<>(Arrays.asList(background1, background2, background3, background4));
                options.pane = pane;

                HIYAxis yaxis = new HIYAxis();
                yaxis.min = 0;
                yaxis.max = 200;
                yaxis.minorTickWidth = 1;
                yaxis.minorTickLength = 10;
                yaxis.minorTickPosition = "inside";
                yaxis.minorTickColor = HIColor.initWithHexValue("666");
                yaxis.tickPixelInterval = 30;
                yaxis.tickWidth = 2;
                yaxis.tickPosition = "inside";
                yaxis.tickLength = 10;
                yaxis.tickColor = HIColor.initWithHexValue("666");
                yaxis.labels = new HILabels();
                yaxis.labels.step = 2;
                yaxis.title = new HITitle();
                yaxis.title.text = "km/h";
                HIPlotBands plotband1 = new HIPlotBands();
                plotband1.from = 0;
                plotband1.to = 120;
                plotband1.color = HIColor.initWithHexValue("55BF3B");
                HIPlotBands plotband2 = new HIPlotBands();
                plotband2.from = 120;
                plotband2.to = 160;
                plotband2.color = HIColor.initWithHexValue("DDDF0D");
                HIPlotBands plotband3 = new HIPlotBands();
                plotband3.from = 160;
                plotband3.to = 200;
                plotband3.color = HIColor.initWithHexValue("DF5353");
                yaxis.plotBands = new ArrayList<>(Arrays.asList(plotband1, plotband2, plotband3));
                options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

                HIauge gauge = new HIauge();
                gauge.name = "Speed";
                gauge.tooltip = new HITooltip();
                gauge.tooltip.valueSuffix = " km/h";
                gauge.data = new ArrayList<>(Collections.singletonList(80));

                options.series = new ArrayList<>(Collections.singletonList(gauge));


                chartView.options = options;
        }
}


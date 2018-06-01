package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("spline");
        chart.setInverted(true);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Atmosphere Temperature by Altitude");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("According to the Standard Atmosphere Model");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setReversed(true);
        xAxis.setTitle(new HITitle());
        xAxis.getTitle().setText("Altitude");
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setFormatter(new HIFunction(
                f -> f.getProperty("value") + "km",
                new String[] {"value"}));
        xAxis.setMaxPadding(0.05);
        xAxis.setShowLastLabel(true);
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Temperature");
        yAxis.setLabels(new HILabels());
        yAxis.getLabels().setFormatter(new HIFunction(
                f -> f.getProperty("value") + "°C",
                new String[] {"value"}));
        yAxis.setLineWidth(2);
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setHeaderFormat("<b>{series.name}</b><br/>");
        tooltip.setPointFormat("{point.x}'km': {point.y}°C");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSpline(new HISpline());
        plotOptions.getSpline().setMarker(new HIMarker());
        plotOptions.getSpline().getMarker().setEnabled(false);
        options.setPlotOptions(plotOptions);

        HISpline series1 = new HISpline();
        series1.setName("Temperature");
        Number[][] series1_data = new Number[][] {{0, 15}, {10, -50}, {20, -56.5}, {30, -46.5}, {40, -22.1}, {50, -2.5}, {60, -27.7}, {70, -55.7}, {80, -76.5}};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.setOptions(options);
    }
}


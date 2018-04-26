package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "funnel";
        chart.marginRight = 100;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Sales funnel";
        title.x = -50;
        options.title = title;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.funnel = new HIFunnel();
        plotOptions.funnel.dataLabels = new HIDataLabels();
        plotOptions.funnel.dataLabels.enabled = true;
        plotOptions.funnel.dataLabels.format = "<b>{point.name}</b> ({point.y:,.0f})";
        plotOptions.funnel.dataLabels.color = HIColor.initWithHexValue("FFFFFF");
        plotOptions.funnel.dataLabels.softConnector = 1;
        plotOptions.funnel.neckWidth = "30%";
        plotOptions.funnel.neckHeight = "25%";
        options.plotOptions = plotOptions;

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HIFunnel series = new HIFunnel();
        series.name = "Unique users";
        series.data = new ArrayList<>(Arrays.asList(
                new Object[] { "Website visits", 15654},
                new Object[] { "Downloads", 4064 },
                new Object[] { "Requested price list", 1987},
                new Object[] { "Invoice sent", 976},
                new Object[] { "Finalized", 846}
        ));
        options.series = new ArrayList<>(Collections.singletonList(series));

        chartView.options = options;
    }
}

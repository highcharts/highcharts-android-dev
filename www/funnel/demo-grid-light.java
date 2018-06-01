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
        chart.setType("funnel");
        chart.setMarginRight(100);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Sales funnel");
        title.setX(-50);
        options.setTitle(title);

        HIPlotOptions plotOptions = new HIPlotOptions();
        HIFunnel funnel = new HIFunnel();
        funnel.setDataLabels(new HIDataLabels());
        funnel.getDataLabels().setEnabled(true);
        funnel.getDataLabels().setFormat("<b>{point.name}</b> ({point.y:,.0f})");
        funnel.getDataLabels().setColor(HIColor.initWithHexValue("FFFFFF")); ;
        funnel.getDataLabels().setSoftConnector(1);
        funnel.setNeckWidth("30%");
        funnel.setNeckHeight("25%");
        plotOptions.setFunnel(funnel);
        options.setPlotOptions(plotOptions);

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIFunnel series = new HIFunnel();
        series.setName("Unique users");
        series.setData(new ArrayList<>(Arrays.asList(
                new Object[] { "Website visits", 15654},
                new Object[] { "Downloads", 4064 },
                new Object[] { "Requested price list", 1987},
                new Object[] { "Invoice sent", 976},
                new Object[] { "Finalized", 846}
        )));
        options.setSeries(new ArrayList<>(Collections.singletonList(series)));

        chartView.setOptions(options);
    }
}

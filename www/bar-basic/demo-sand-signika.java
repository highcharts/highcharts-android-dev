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

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("bar");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Historic World Population by Region");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: <a href=\\\"https://en.wikipedia.org/wiki/World_population\\\">Wikipedia.org</a>Source: <a href=\\\"https://en.wikipedia.org/wiki/World_population\\\">Wikipedia.org</a>");
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        String[] categories = new String[] { "Africa", "America", "Asia", "Europe", "Oceania"};
        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setMin(0);
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Population (millions)");
        yaxis.getTitle().setAlign("high");
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setOverflow("justify");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setValueSuffix(" millions");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setBar(new HIBar());
        plotOptions.getBar().setDataLabels(new HIDataLabels());
        plotOptions.getBar().getDataLabels().setEnabled(true);
        options.setPlotOptions(plotOptions);

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("right");
        legend.setVerticalAlign("top");
        legend.setX(-40);
        legend.setY(80);
        legend.setFloating(true);
        legend.setBorderWidth(1);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        legend.setShadow(true);
        options.setLegend(legend);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HIBar bar1 = new HIBar();
        bar1.setName("Year 1800");
        Number[] bar1Data = new Number[] {107, 31, 635, 203, 2 };
        bar1.setData(new ArrayList<>(Arrays.asList(bar1Data)));

        HIBar bar2 = new HIBar();
        bar2.setName("Year 1900");
        Number[] bar2Data = new Number[] { 133, 156, 947, 408, 6 };
        bar2.setData(new ArrayList<>(Arrays.asList(bar2Data)));

        HIBar bar3 = new HIBar();
        bar3.setName("Year 2012");
        Number[] bar3Data = new Number[] { 1052, 954, 4250, 740, 38 };
        bar3.setData(new ArrayList<>(Arrays.asList(bar3Data)));

        options.setSeries(new ArrayList<>(Arrays.asList(bar1, bar2,bar3)));

        chartView.setOptions(options);
    }
}

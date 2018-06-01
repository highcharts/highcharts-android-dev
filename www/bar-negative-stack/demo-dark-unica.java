package com.highcharts.DevGround.example;

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
        chart.setType( "bar");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Population pyramid for Germany, 2015");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: <a href=\"http://populationpyramid.net/germany/2015/\">Population Pyramids of the World from 1950 to 2100</a>");
        options.setSubtitle(subtitle);

        String[] categories = new String[] { "0-4", "5-9", "10-14", "15-19",
                "20-24", "25-29", "30-34", "35-39", "40-44",
                "45-49", "50-54", "55-59", "60-64", "65-69",
                "70-74", "75-79", "80-84", "85-89", "90-94",
                "95-99", "100 + " };

        HIXAxis xaxisLeft = new HIXAxis();
        xaxisLeft.setCategories(new ArrayList<>(Arrays.asList(categories)));
        xaxisLeft.setLabels(new HILabels());
        xaxisLeft.getLabels().setStep(1);

        HIXAxis xaxisRight = new HIXAxis();
        xaxisRight.setOpposite(true);
        xaxisRight.setReversed(false);
        xaxisRight.setCategories(new ArrayList<>(Arrays.asList(categories)));
        xaxisRight.setLinkedTo(0);
        xaxisRight.setLabels(new HILabels());
        xaxisRight.getLabels().setStep(1);

        options.setXAxis(new ArrayList<>(Arrays.asList(xaxisLeft, xaxisRight)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("");
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setFormatter(new HIFunction(
                f -> Math.abs((Double)f.getProperty("value")) + "%",
                new String[] {"value"}
        ));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setFormatter(new HIFunction("function () { return '<b>' + this.series.name + ', age ' + this.point.category + '</b><br/>' + 'Population: ' + Highcharts.numberFormat(Math.abs(this.point.y), 0); }"));
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setBar(new HIBar());
        plotOptions.getBar().setStacking("normal");
        options.setPlotOptions(plotOptions);

        HIBar barMale = new HIBar();
        barMale.setName("Year 1800");
        Number[] barMaleData = new Number[] {-2.2, -2.2, -2.3, -2.5, -2.7, -3.1, -3.2,
                -3.0, -3.2, -4.3, -4.4, -3.6, -3.1, -2.4,
                -2.5, -2.3, -1.2, -0.6, -0.2, -0.0, -0.0 };
        barMale.setData(new ArrayList<>(Arrays.asList(barMaleData)));

        HIBar barFemale = new HIBar();
        barFemale.setName("Year 1900");
        Number[] barFemaleData = new Number[] { 2.1, 2.0, 2.2, 2.4, 2.6, 3.0, 3.1, 2.9,
                3.1, 4.1, 4.3, 3.6, 3.4, 2.6, 2.9, 2.9,
                1.8, 1.2, 0.6, 0.1, 0.0 };
        barFemale.setData(new ArrayList<>(Arrays.asList(barFemaleData)));

        options.setSeries(new ArrayList<>(Arrays.asList(barMale, barFemale)));
        chartView.setOptions(options);
    }
}

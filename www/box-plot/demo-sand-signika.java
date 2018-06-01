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

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("boxplot");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Highcharts Box Plot Example");
        options.setTitle(title);

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5")));
        xaxis.setTitle(new HITitle());
        xaxis.getTitle().setText("Experiment No.");

        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Observations");
        HIPlotLines plotlines = new HIPlotLines();
        plotlines.setValue(932);
        plotlines.setColor(HIColor.initWithName("red"));
        plotlines.setWidth(1);
        plotlines.setLabel(new HILabel());
        plotlines.getLabel().setText("Theoretical mean: 932");
        plotlines.getLabel().setAlign("center");
        plotlines.getLabel().setStyle(new HIStyle());
        plotlines.getLabel().getStyle().setColor("gray");
        yaxis.setPlotLines(new ArrayList<>(Collections.singletonList(plotlines)));
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HIBoxplot series1 = new HIBoxplot();
        series1.setName("Observations");
        Object[][] series1Data = new Object[][] {
                {760, 801, 848, 895, 965},
                {733, 853, 939, 980, 1080},
                {714, 762, 817, 870, 918},
                {724, 802, 806, 871, 950},
                {834, 836, 864, 882, 910}
        };
        series1.setData(new ArrayList<>(Arrays.asList(series1Data)));
        series1.setTooltip(new HITooltip());
        series1.getTooltip().setHeaderFormat("<em>Experiment No {point.key}</em><br/>");

        HIScatter series2 = new HIScatter();
        series2.setName("Outliner");
        series2.setColor(HIColor.initWithHexValue("7cb5ec"));
        Object[][] series2Data = new Object[][] {
                {0, 644},
                {4, 718},
                {4, 951},
                {4, 969}
        };
        series2.setData(new ArrayList<>(Arrays.asList(series2Data)));
        series2.setMarker(new HIMarker());
        series2.getMarker().setFillColor(HIColor.initWithName("white"));
        series2.getMarker().setLineWidth(1);
        series2.getMarker().setLineColor(HIColor.initWithHexValue("7cb5ec"));
        series2.setTooltip(new HITooltip());
        series2.getTooltip().setPointFormat("Observation: {point.y}");

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);
    }
}

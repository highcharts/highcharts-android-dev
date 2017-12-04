package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "boxplot";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Highcharts Box Plot Example";
        options.title = title;

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        xaxis.title = new HITitle();
        xaxis.title.text = "Experiment No.";

        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Observations";
        HIPlotLines plotlines = new HIPlotLines();
        plotlines.value = 932;
        plotlines.color = HIColor.initWithName("red");
        plotlines.width = 1;
        plotlines.label = new HILabel();
        plotlines.label.text = "Theoretical mean: 932";
        plotlines.label.align = "center";
        plotlines.label.style = new HIStyle();
        plotlines.label.style.color = "gray";
        yaxis.plotLines = new ArrayList<>(Collections.singletonList(plotlines));
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HIBoxplot series1 = new HIBoxplot();
        series1.name = "Observations";
        Object[][] series1Data = new Object[][] {
                {760, 801, 848, 895, 965},
                {733, 853, 939, 980, 1080},
                {714, 762, 817, 870, 918},
                {724, 802, 806, 871, 950},
                {834, 836, 864, 882, 910}
        };
        series1.data = new ArrayList<>(Arrays.asList(series1Data));
        series1.tooltip = new HITooltip();
        series1.tooltip.headerFormat = "<em>Experiment No {point.key}</em><br/>";

        HIScatter series2 = new HIScatter();
        series2.name = "Outliner";
        series2.type = "scatter";
        series2.color = HIColor.initWithHexValue("7cb5ec");
        Object[][] series2Data = new Object[][] {
                {0, 644},
                {4, 718},
                {4, 951},
                {4, 969}
        };
        series2.data = new ArrayList<>(Arrays.asList(series2Data));
        series2.marker = new HIMarker();
        series2.marker.fillColor = HIColor.initWithName("white");
        series2.marker.lineWidth = 1;
        series2.marker.lineColor = HIColor.initWithHexValue("7cb5ec");
        series2.tooltip = new HITooltip();
        series2.tooltip.pointFormat = "Observation: {point.y}";

        options.series = new ArrayList<>(Arrays.asList(series1, series2));

        chartView.options = options;
    }
}

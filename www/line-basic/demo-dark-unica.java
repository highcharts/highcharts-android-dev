package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Solar Employment Growth by Sector, 2010-2016";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: thesolarfoundation.com";
        options.subtitle = subtitle;

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Number of Employees";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "right";
        legend.verticalAlign = "middle";
        options.legend = legend;

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.series = new HISeries();
        plotoptions.series.label = new HILabel();
        plotoptions.series.label.connectorAllowed = false;;
        plotoptions.series.pointStart = 2010;

        HILine line1 = new HILine();
        line1.name = "Installation";
        line1.data = new ArrayList<>(Arrays.asList(43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175));

        HILine line2 = new HILine();
        line2.name = "Manufacturing";
        line2.data = new ArrayList<>(Arrays.asList(24916, 24064, 29742, 29851, 32490, 30282, 38121, 404340));

        HILine line3 = new HILine();
        line3.name = "Sales & Distribution";
        line3.data = new ArrayList<>(Arrays.asList(11744, 17722, 16005, 19771, 20185, 24377, 32147, 39387));

        HILine line4 = new HILine();
        line4.name = "Project Development";
        line4.data = new ArrayList<>(Arrays.asList(null, null, 7988, 12169, 15112, 22452, 34400, 34227));

        HILine line5 = new HILine();
        line5.name = "Other";
        line5.data = new ArrayList<>(Arrays.asList(12908, 5948, 8105, 11248, 8989, 11816, 18274, 18111));

        HIResponsive responsive = new HIResponsive();

        HIRules rules1 = new HIRules();
        rules1.condition = new HICondition();
        rules1.condition.maxWidth = 500;
        HashMap<String, HashMap> chartLegend = new HashMap<>();
        HashMap<String, String> legendOptions = new HashMap<>();
        legendOptions.put("layout", "horizontal");
        legendOptions.put("align", "center");
        legendOptions.put("verticalAlign", "bottom");
        chartLegend.put("legend", legendOptions);
        rules1.chartOptions = chartLegend;
        responsive.rules = new ArrayList<>(Collections.singletonList(rules1));
        options.responsive = responsive;

        options.series = new ArrayList<>(Arrays.asList(line1, line2, line3, line4, line5));

        chartView.options = options;
    }
}

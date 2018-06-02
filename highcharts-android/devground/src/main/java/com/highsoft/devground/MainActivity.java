package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXrange;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("column");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("UEFA Champions League 2016/17");
        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Team statistics");
        options.setTitle(title);
        options.setSubtitle(subtitle);

        final HIXAxis hixAxis = new HIXAxis();
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Goals");
        categories.add("Assists");
        categories.add("Shots On Goal");
        categories.add("Shots");
        hixAxis.setCategories(categories);
        options.setXAxis(new ArrayList<HIXAxis>(){{add(hixAxis);}});

        final HIYAxis hiyAxis = new HIYAxis();
        hiyAxis.setMin(0);
        hiyAxis.setTitle(new HITitle());
        hiyAxis.getTitle().setText("Number");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(hiyAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setHeaderFormat("<span style=\"font-size:15px\">{point.key}</span><table>");
        tooltip.setPointFormat("<tr><td style=\"color:{series.color};padding:0\">{series.name}: </td>" + "<td style=\"padding:0\"><b>{point.y}</b></td></tr>");
        tooltip.setFooterFormat("</talble>");

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumn(new HIColumn());
        plotOptions.getColumn().setPointPadding(0.2);
        plotOptions.getColumn().setBorderWidth(0);
        options.setPlotOptions(plotOptions);

        HIColumn realMadrid = new HIColumn();
        realMadrid.setName("Real Madrid");
        ArrayList<Integer> realMadridData = new ArrayList<>();
        realMadridData.add(36);
        realMadridData.add(31);
        realMadridData.add(93);
        realMadridData.add(236);
        realMadrid.setData(realMadridData);

        HIColumn juventus = new HIColumn();
        juventus.setName("Juventus");
        ArrayList<Integer> juventusData = new ArrayList<>();
        juventusData.add(22);
        juventusData.add(10);
        juventusData.add(66);
        juventusData.add(178);
        juventus.setData(juventusData);

        HIColumn monaco = new HIColumn();
        monaco.setName("Monaco");
        ArrayList<Integer> monacoData = new ArrayList<>();
        monacoData.add(22);
        monacoData.add(17);
        monacoData.add(56);
        monacoData.add(147);
        monaco.setData(monacoData);

        HIColumn atleticoMadrid = new HIColumn();
        atleticoMadrid.setName("Atlético Madrid");
        ArrayList<Integer> atleticoMadridData = new ArrayList<>();
        atleticoMadridData.add(15);
        atleticoMadridData.add(9);
        atleticoMadridData.add(55);
        atleticoMadridData.add(160);
        atleticoMadrid.setData(atleticoMadridData);

        ArrayList<HISeries> series = new ArrayList<>();
        series.add(realMadrid);
        series.add(juventus);
        series.add(monaco);
        series.add(atleticoMadrid);
        options.setSeries(series);

        chartView.setOptions(options);
    }
}
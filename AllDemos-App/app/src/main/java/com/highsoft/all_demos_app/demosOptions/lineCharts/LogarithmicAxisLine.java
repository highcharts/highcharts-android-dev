//package com.highsoft.all_demos_app.demosOptions.lineCharts;
//
//import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
//import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
//import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
//import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
//import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
//import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
//import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
///**
// * Created by bartosz on 28.03.18.
// */
//
//public class LogarithmicAxisLine {
//
//    private static HIOptions options = new HIOptions();
//
//    public static HIOptions getOptions() {
//
//        HIChart chart = new HIChart();
//        chart.type = "line";
//        options.chart = chart;
//
//        HITitle title = new HITitle();
//        title.text = "Logarithmic axis demo";
//        options.title = title;
//
//
//        HIXAxis xaxis = new HIXAxis();
//        xaxis.tickInterval = 1;
//        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));
//
//        HIYAxis yaxis = new HIYAxis();
//        yaxis.type = "logarithmic";
//        yaxis.minorTickInterval = 0.1;
//        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));
//
//        HITooltip tooltip = new HITooltip();
//        tooltip.headerFormat = "<b>{series.name}</b><br />";
//        tooltip.pointFormat = "x = {point.x}, y = {point.y}";
//        options.tooltip = tooltip;
//
//        HILine line1 = new HILine();
//        line1.pointStart = 1;
//        line1.data = new ArrayList<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512));
//        options.series = new ArrayList<>(Collections.singletonList(line1));
//
//        return options;
//    }
//}

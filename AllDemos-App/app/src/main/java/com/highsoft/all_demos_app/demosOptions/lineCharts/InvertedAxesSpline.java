package com.highsoft.all_demos_app.demosOptions.lineCharts;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bartosz on 28.03.18.
 */

public class InvertedAxesSpline {

    private static HIOptions options = new HIOptions();

    public static HIOptions getOptions() {

        HIChart chart = new HIChart();
        chart.type = "spline";
        chart.inverted = true;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Atmosphere Temperature by Altitude";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "According to the Standard Atmosphere Model";
        options.subtitle = subtitle;

        final HIXAxis xAxis = new HIXAxis();
        xAxis.reversed = false;
        xAxis.title = new HITitle();
        xAxis.title.text = "Altitude";
        xAxis.labels = new HILabels();
        xAxis.labels.formatter = new HIFunction("function () { return this.value + 'km'; }");
        xAxis.maxPadding = 0.05;
        xAxis.showLastLabel = true;
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        final HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Temperature";
        yAxis.labels = new HILabels();
        yAxis.labels.formatter = new HIFunction("function () { return this.value + ''; }");
        yAxis.lineWidth = 2;
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.headerFormat = "<b>{series.name}</b><br/>";
        tooltip.pointFormat = "{point.x}'km': {point.y}C";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.spline = new HISpline();
        plotOptions.spline.marker = new HIMarker();
        plotOptions.spline.marker.enabled = false;
        options.plotOptions = plotOptions;

        HISpline series1 = new HISpline();
        series1.name = "Temperature";
        Number[][] series1_data = new Number[][] {{0, 15}, {10, -50}, {20, -56.5}, {30, -46.5}, {40, -22.1}, {50, -2.5}, {60, -27.7}, {70, -55.7}, {80, -76.5}};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<HISeries>(Collections.singletonList(series1));

        return options;
    }
}

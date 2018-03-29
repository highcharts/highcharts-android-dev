package com.highsoft.all_demos_app.demosOptions.lineCharts;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by bartosz on 28.03.18.
 */

public class DataLabelsLine {

    private static HIOptions options = new HIOptions();

    public static HIOptions getOptions() {

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Monthly Average Temperature";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: WorldClimate.com";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Temperature (°C)";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.line = new HILine();
        plotOptions.line.dataLabels = new HIDataLabels();
        plotOptions.line.dataLabels.enabled = true;
        plotOptions.line.enableMouseTracking = false;
        options.plotOptions = plotOptions;

        HILine series1 = new HILine();
        series1.name = "Tokyo";
        Number[] series1_data = new Number[] {7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HILine series2 = new HILine();
        series2.name = "London";
        Number[] series2_data = new Number[] {3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2));

        return options;
    }
}

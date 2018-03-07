package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.webkit.JavascriptInterface;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIEvents;
import com.highsoft.highcharts.Common.HIChartsClasses.HIExporting;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = (HIChartView) findViewById(R.id.hc);
        HIOptions options = new HIOptions();

//        chartView.plugins = new ArrayList<>(Arrays.asList("moment.min", "moment-timezone-with-data-2012-2022.min"));

        HIXAxis hixAxis = new HIXAxis();
        hixAxis.type = "datetime";
        options.xAxis = new ArrayList<>(Collections.singletonList(hixAxis));


        HISeries series = new HISeries();
        series.data = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.enabled = true;
        dataLabels.format = "{x:%H:%M}";
        series.dataLabels = dataLabels;
        Date d = new Date();
        series.pointStart = d.UTC(2016,9,22,0,0,0);
        series.pointInterval = 24 * 365;
        series.name = "UTC Midnight";
        series.tooltip = new HITooltip();
        series.tooltip.pointFormat = "UTC midnight = {point.x:%H:%M} local time";
        options.series = new ArrayList<>(Collections.singletonList(series));

        options.chart = new HIChart();
        options.chart.backgroundColor = HIColor.initWithRGBA(255,255,255, 0.0);

        options.plotOptions = new HIPlotOptions();
        options.plotOptions.series = series;
        options.plotOptions.series.events = new HIEvents();
        options.plotOptions.series.events.click = new HIFunction(
                "function() { " +
//                        "var message = 'Clicked x: ' + this.x + ', y ' + this.y;" +
                        "var message = 'Hello from JS';" +
                        "console.log(message); " +
                        "jsint.createDialog(message); " +
                        "}",
                true
        );

//        chartView.options.exporting.enabled = false;

        chartView.options = options;
        chartView.options.exporting = new HIExporting();
        chartView.options.exporting.enabled = false;
    }

    /*@JavascriptInterface
    public void createDialog(Object object){
        new AlertDialog.Builder(getApplicationContext())
                .setTitle("Clicked value:")
                .setMessage((String)object)
                .create().show();
    }*/
}

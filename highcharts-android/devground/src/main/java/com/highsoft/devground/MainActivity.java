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
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

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


        HISpline series = new HISpline();
        series.data = new ArrayList<>(Arrays.asList(0,5,8,9,3,5,4,4,2,10));
        series.name = "Colors test 1";

        HISpline series2 = new HISpline();
        series2.data = new ArrayList<>(Arrays.asList(4,2,6,7,2,3,3,7,9,1));
        series2.name = "Colors test";

        options.series = new ArrayList<HISeries>(Arrays.asList(series, series2));

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

        options.colors = new ArrayList<>();
        options.colors.add(HIColor.initWithRGB(255, 0, 0));
//        options.colors.add(HIColor.initWithRGB(0, 0, 255));
        LinkedList<HIStop> stops = new LinkedList<>();
        stops.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stops.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));
        options.colors.add(HIColor.initWithLinearGradient(new HIGradient(), stops));

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

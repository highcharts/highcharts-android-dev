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
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLOutput;
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


//        try {
//            chartView.setJavascriptHandler(JavascriptMethods.class.getName());
//        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
//            e.printStackTrace();
//        }


        HIOptions options = new HIOptions();

//        chartView.plugins = new ArrayList<>(Arrays.asList("moment.min", "moment-timezone-with-data-2012-2022.min"));

        HIXAxis hixAxis = new HIXAxis();
        options.xAxis = new ArrayList<>(Collections.singletonList(hixAxis));

        HISpline spline1 = new HISpline();
        spline1.data = new ArrayList<>(Arrays.asList(0,5,8,9,3,5,4,4,2,10));
        spline1.name = "Colors test 1";

        HISpline spline2 = new HISpline();
        spline2.data = new ArrayList<>(Arrays.asList(4,2,6,7,2,3,3,7,9,1));
        spline2.name = "Colors test";

        options.series = new ArrayList<>(Arrays.asList(spline1, spline2));

        options.plotOptions = new HIPlotOptions();
        options.plotOptions.series = spline1;
        options.plotOptions.series.point = new HIPoint();
        options.plotOptions.series.point.events = new HIEvents();
//        options.plotOptions.series.point.events.click = new HIFunction(
////                "function() { " +
//////                        "var message = 'Clicked x: ' + this.x + ', y ' + this.y;" +
////                        "var message = 'Hello from JS';" +
////                        "console.log(message); " +
////                        "jsint.createDialog(message); " +
////                        "}",
//                "function() { " +
//                        "var y = this.y;" +
//                        "Android.createDialog(y); }",
//                true
//        );
//        options.plotOptions.series.point.events.click = new HIFunction(
//                () -> {
//                    System.out.println("Lambda runned from Android!");
////                    new android.app.AlertDialog.Builder(getApplicationContext())
////                            .setTitle("Clicked value:")
////                            .setMessage("Brawo, udalo sie")
////                            .create().show();
////                    return 0;
//                }, chartView
//        );

        //NEW FUNCTIONS IMPLEMENTATION
        options.plotOptions.series.point.events.click = new HIFunction(
                    hiContext -> {
                        hiContext.getParameter(5);
                        new AlertDialog.Builder(this)
                                .setTitle("Information")
                                .setMessage("You've just clicked series point.")
                                .create().show();
                        Foo f = new Foo("something");
                        f.bar();
                    },
                    chartView
            );

        options.colors = new ArrayList<>();
        options.colors.add(HIColor.initWithRGB(255, 0, 0));
        LinkedList<HIStop> stops = new LinkedList<>();
        stops.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stops.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));
        options.colors.add(HIColor.initWithLinearGradient(new HIGradient(), stops));

        chartView.options = options;
//        chartView.options.chart.backgroundColor = HIColor.initWithRGB(255,255,255);
        chartView.options.exporting = new HIExporting();
        chartView.options.exporting.enabled = false;
    }
}

package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.highsoft.highcharts.Common.HIChartsClasses.HIEvents;
import com.highsoft.highcharts.Common.HIChartsClasses.HIExporting;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIContext;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = (HIChartView) findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        options.title = new HITitle();
        options.title.text = "Functions tests";

//        HISpline spline1 = new HISpline();
//        spline1.data = new ArrayList<>(Arrays.asList(0,5,8,9,3,5,4,4,2,10));
//        spline1.name = "Red series";
//        spline1.point = new HIPoint();
//        spline1.point.events = new HIEvents();
//        spline1.point.events.click = new HIFunction(
//                f -> {
//                    Toast t = Toast.makeText(this, "Toast from " + spline1.name, Toast.LENGTH_SHORT);
//                    t.show();
//                }
//        );

        HISpline spline2 = new HISpline();
        spline2.data = new ArrayList<>(Arrays.asList(4,2,6,7,2,3,3,7,9,1));
        spline2.name = "Gradient series";
        spline2.point = new HIPoint();
        spline2.point.events = new HIEvents();
        spline2.point.events.click = new HIFunction(
                f ->
                    new AlertDialog.Builder(this)
                            .setTitle("Alert from" + spline2.name)
                            .setMessage("Clicked point: [ " +
                                    f.getVal("x")
                                    + " , " +
                                    f.getVal("y") + " ]")
                            .create().show(),
                new String[] {"x", "y"}
        );
//        spline2.point.events.click = new HIFunction(
//                () -> {
//                    System.out.println("Hello, runnable, go go go!");
//                    Toast t = Toast.makeText(this, "Toast from series: " + spline2.name, Toast.LENGTH_SHORT);
//                    t.show();
//                    System.out.println("Runnable made toast and feels gooood");
//                }
//        );
//        options.series = new ArrayList<>(Arrays.asList(spline1, spline2));
        options.series = new ArrayList<>(Collections.singletonList(spline2));
        options.colors = new ArrayList<>();
        options.colors.add(HIColor.initWithRGB(255, 0, 0));
        LinkedList<HIStop> stops = new LinkedList<>();
        stops.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stops.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));
        options.colors.add(HIColor.initWithLinearGradient(new HIGradient(), stops));

        chartView.options = options;
        chartView.options.exporting = new HIExporting();
        chartView.options.exporting.enabled = false;
    }
}

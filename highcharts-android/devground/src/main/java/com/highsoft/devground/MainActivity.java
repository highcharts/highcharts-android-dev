package com.highsoft.devground;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIEvents;
import com.highsoft.highcharts.Common.HIChartsClasses.HIExporting;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        options.exporting = new HIExporting();
        options.exporting.enabled = false;
        options.tooltip = new HITooltip();
//        options.tooltip.enabled = false;
        options.tooltip.formatter = new HIFunction("function() { return 'Test test';}");
        options.tooltip.formatter = new HIFunction(
                f -> "Test tooltip x = " + f.getProperty("x") + ", y = " + f.getProperty("y"),
                new String[] {"x", "y"}
        );
        options.chart = new HIChart();
        options.chart.type = "spline";
        options.title = new HITitle();
        options.title.text = "Functions tests";

        HISpline spline1 = new HISpline();
        spline1.data = new ArrayList<>(Arrays.asList(0.3,5.3,8.0,9.1,3.2,5.4,4.0,4.2,2.1,10.0));
        spline1.name = "Red series";
        spline1.point = new HIPoint();
        spline1.point.events = new HIEvents();
        spline1.point.events.click = new HIFunction(
                f -> {
                    Toast t = Toast.makeText(
                            this,
                            "Clicked point [ " + f.getProperty("x") + ", " + f.getProperty("y") + " ]",
                            Toast.LENGTH_SHORT);
                    t.show();
                },
                new String[] {"x", "y"}
        );

        HISpline spline2 = new HISpline();
        spline2.data = new ArrayList<>(Arrays.asList(4.1,2.3,6.4,7.8,2.3,3.3,3.0,7.6,9.0,1.5));
        spline2.name = "Gradient series";
        spline2.point = new HIPoint();
        spline2.point.events = new HIEvents();
        spline2.point.events.click = new HIFunction(
                f -> {
                    new AlertDialog.Builder(this)
                            .setTitle("Alert from" + spline2.name)
                            .setMessage("Clicked point: [ " +
                                    f.getProperty("x")
                                    + " , " +
                                    f.getProperty("y") + " ]")
                            .create().show();
                },
                new String[] {"x", "y"}
        );

        options.series = new ArrayList<>(Arrays.asList(spline1, spline2));
        options.colors = new ArrayList<>();
        options.colors.add(HIColor.initWithRGB(255, 0, 0));
        LinkedList<HIStop> stops = new LinkedList<>();
        stops.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stops.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));
        options.colors.add(HIColor.initWithLinearGradient(new HIGradient(), stops));
        chartView.options = options;

    }
}

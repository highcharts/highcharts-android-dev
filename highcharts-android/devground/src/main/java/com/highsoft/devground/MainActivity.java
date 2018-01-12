package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Common.HIStops;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
        HIOptions options = new HIOptions();

       /* HIChart chart = new HIChart();
        chart.type = "column";
        chart.zoomType = "x";
        chart.resetZoomButton = new HIResetZoomButton();
        options.chart = chart;

        //Current way to initiate gradient color:
        Map<String, Number> linearGradient = new HashMap<>();
        linearGradient.put("x1", 0);
        linearGradient.put("y1", 0);
        linearGradient.put("x2", 0);
        linearGradient.put("y2", 1);
        List<List> stopsOld = new ArrayList<>();
        List<Object> l1 = new LinkedList<>();
        l1.add(0);
        l1.add("rgb(66, 218, 113)");
        List<Object> l2 = new LinkedList<>();
        l2.add(1);
        l2.add("rgb(80, 140, 200)");
        stopsOld.add(l1);
        stopsOld.add(l2);
//        chart.backgroundColor = HIColor.initWithLinearGradient(gradientPoints, gradientColors);


        //!!! new way to init Gradient test: !!!///
        HIGradient gradient = new HIGradient(0,0,0,1);

        //stops v1
        HIStops stops = new HIStops(new Object[] {0, "rgb(66, 218, 113)"}, new Object[] {1, "rgb(80, 140, 200)"});
        //stops v2 better!
        LinkedList<HIStop> stopsNew = new LinkedList<>();
        stopsNew.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stopsNew.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));

        HIArea area = new HIArea();
        area.data = new ArrayList<>(Arrays.asList(299000, 7150000, 1064000, 1292000, 1440000, 1760000,
                1356000, 1485000, 2164000, 1941000, 956000, 544000));
        area.type = "area"; // this will not be needed in future release (need to add type to constructor)
//        area.fillColor = HIColor.initWithLinearGradient(linearGradient, stopsOld); // old initialization
//        area.fillColor = HIColor.initWithLinearGradientTest(gradient, stops); //stops v1
        area.fillColor = HIColor.initWithLinearGradientTest2(gradient, stopsNew); //stops v2 better!
        options.series = new ArrayList<HISeries>(Collections.singletonList(area));*/

       chartView.plugins = new ArrayList<>(Arrays.asList("moment.min", "moment-timezone-with-data-2012-2022.min"));

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
        series.pointInterval = 24 * 36e5;
        series.name = "UTC Midnight";
        series.tooltip = new HITooltip();
        series.tooltip.pointFormat = "UTC midnight = {point.x:%H:%M} local time";
        options.series = new ArrayList<>(Collections.singletonList(series));






        //LANG tests
//        HILang lang = new HILang();
//        lang.numericSymbols  = new ArrayList<>(Arrays.asList("万", "億"));
//        lang.numericSymbolMagnitude = 10000;
//        lang.resetZoom = "Testest";
//        chartView.lang = lang;


        //GLOBAL tests
        HIGlobal global = new HIGlobal();
//        global.useUTC = true;
        global.timezone = "Europe/Oslo";
        chartView.global = global;
        System.out.println("A Tutaj: " + global.getParams());

        chartView.options = options;
    }
}

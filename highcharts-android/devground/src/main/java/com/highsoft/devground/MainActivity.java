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

        HIChart chart = new HIChart();
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


        //new way to init Gradient test:
        HIGradient gradient = new HIGradient(0,0,0,1);

        //stops v1
        HIStops stops = new HIStops(new Object[] {0, "rgb(66, 218, 113)"}, new Object[] {1, "rgb(80, 140, 200)"});

        //stops v2 better!
        LinkedList<HIStop> stopsNew = new LinkedList<>();
        stopsNew.add(new HIStop(0.4f, HIColor.initWithRGB(66, 218, 113)));
        stopsNew.add(new HIStop(1, HIColor.initWithRGB(80, 140, 200)));

        HIArea area = new HIArea();
        area.data = new ArrayList<>(Arrays.asList(2990, 7150, 10640, 12920, 14400, 17600,
                13560, 14850, 21640, 19410, 9560, 5440));
        area.type = "area"; // this will not be needed in future release (need to add type to constructor)
//        area.fillColor = HIColor.initWithLinearGradient(linearGradient, stopsOld); // old initialization
//        area.fillColor = HIColor.initWithLinearGradientTest(gradient, stops); //stops v1
        area.fillColor = HIColor.initWithLinearGradientTest2(gradient, stopsNew); //stops v2 better!
        options.series = new ArrayList<HISeries>(Collections.singletonList(area));

//        HISeries customSeries = new HISeries();
//        customSeries.data = new ArrayList<>(Arrays.asList(4, 7, 2));
//
//        options.series = new ArrayList<>(Arrays.asList(area, customSeries));
        HILang lang = new HILang();
        lang.numericSymbols  = new ArrayList<>(Arrays.asList("万", "億"));
        lang.numericSymbolMagnitude = 10000;
        lang.resetZoom = "DUPA";
        chartView.lang = lang;
        chartView.options = options;
    }
}

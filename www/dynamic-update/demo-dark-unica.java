package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "spline";
        chart.animation = "Highcharts.svg"; // don't animate in old IE
        chart.marginRight = 10;
        HIEvents events = new HIEvents();
        events.load = new HIFunction("function () { var series = this.series[0]; setInterval(function () { var x = (new Date()).getTime(), y = Math.random(); series.addPoint([x, y], true, true); }, 1000); }", true);
        chart.events = events;
        options.chart = chart;


        HITitle title = new HITitle();
        title.text = "Live random data";
        options.title = title;

        HIXAxis xaxis =  new HIXAxis();
        xaxis.type = "datetime";
        xaxis.tickPixelInterval = 150;
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis =  new HIYAxis();
        yaxis.title =  new HITitle();
        yaxis.title.text = "Value";
        HIPlotLines plotLines =  new HIPlotLines();
        plotLines.value = 0;
        plotLines.width = 1;
        plotLines.color =  HIColor.initWithHexValue("808080");
        yaxis.plotLines = new ArrayList<>(Collections.singletonList(plotLines));
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HITooltip tooltip =  new HITooltip();
        tooltip.formatter =  new HIFunction("function () { return '<b>' + this.series.name + '</b><br/>' + Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' + Highcharts.numberFormat(this.y, 2); }", true);
        options.tooltip = tooltip;

        HILegend legend =  new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HIExporting exporting =  new HIExporting();
        exporting.enabled = false;
        options.exporting = exporting;

        HISpline spline =  new HISpline();
        spline.name = "Random data";
        HashMap<String, Object> splineData1 = new HashMap<>();
        splineData1.put("x", 1506522303996L);
        splineData1.put("y", 0.9008867958057089 );
        HashMap<String, Object> splineData2 = new HashMap<>();
        splineData2.put("x", 1506522304996L);
        splineData2.put("y", 0.8231864980698256 );
        HashMap<String, Object> splineData3 = new HashMap<>();
        splineData3.put("x", 1506522305996L);
        splineData3.put("y", 0.9825011509882808 );
        HashMap<String, Object> splineData4 = new HashMap<>();
        splineData4.put("x", 1506522306996L);
        splineData4.put("y", 0.003652610490540442 );
        HashMap<String, Object> splineData5 = new HashMap<>();
        splineData5.put("x", 1506522307996L);
        splineData5.put("y", 0.002609150181310582 );
        HashMap<String, Object> splineData6 = new HashMap<>();
        splineData6.put("x", 1506522308996L);
        splineData6.put("y", 0.01461317357831804 );
        HashMap<String, Object> splineData7 = new HashMap<>();
        splineData7.put("x", 1506522309996L);
        splineData7.put("y", 0.8999787609990089 );
        HashMap<String, Object> splineData8 = new HashMap<>();
        splineData8.put("x", 1506522310996L);
        splineData8.put("y", 0.14058473457764165 );
        HashMap<String, Object> splineData9 = new HashMap<>();
        splineData9.put("x", 1506522311996L);
        splineData9.put("y", 0.34443475714783733 );
        HashMap<String, Object> splineData10 = new HashMap<>();
        splineData10.put("x", 1506522312996L);
        splineData10.put("y", 0.5556814038393371 );
        HashMap<String, Object> splineData11 = new HashMap<>();
        splineData11.put("x", 1506522313996L);
        splineData11.put("y", 0.6196520717912178 );
        HashMap<String, Object> splineData12 = new HashMap<>();
        splineData12.put("x", 1506522314996L);
        splineData12.put("y", 0.03434593570780475 );
        HashMap<String, Object> splineData13 = new HashMap<>();
        splineData13.put("x", 1506522315996L);
        splineData13.put("y", 0.2980087069912135 );
        HashMap<String, Object> splineData14 = new HashMap<>();
        splineData14.put("x", 1506522316996L);
        splineData14.put("y", 0.7572371332071955 );
        HashMap<String, Object> splineData15 = new HashMap<>();
        splineData15.put("x", 1506522317996L);
        splineData15.put("y", 0.6794544224961554 );
        HashMap<String, Object> splineData16 = new HashMap<>();
        splineData16.put("x", 1506522318996L);
        splineData16.put("y", 0.07563910614922953 );
        HashMap<String, Object> splineData17 = new HashMap<>();
        splineData17.put("x", 1506522319996L);
        splineData17.put("y", 0.049179773664749016 );
        HashMap<String, Object> splineData18 = new HashMap<>();
        splineData18.put("x", 1506522320996L);
        splineData18.put("y", 0.6572695585799792 );
        HashMap<String, Object> splineData19 = new HashMap<>();
        splineData19.put("x", 1506522321996L);
        splineData19.put("y", 0.3828701378166286 );
        HashMap<String, Object> splineData20 = new HashMap<>();
        splineData20.put("x", 1506522322996L);
        splineData20.put("y", 0.2583323455534311);
        spline.data =  new ArrayList<>(Arrays.asList(splineData1, splineData2, splineData3, splineData4, splineData5, splineData6, splineData7, splineData8, splineData9, splineData10, splineData11, splineData12, splineData13, splineData14, splineData15, splineData16, splineData17, splineData18, splineData19, splineData20));
        options.series = new ArrayList<>(Collections.singletonList(spline));

        chartView.options = options;
    }
}

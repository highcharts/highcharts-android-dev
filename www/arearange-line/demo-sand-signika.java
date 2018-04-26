package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "arearange";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "July temperatures";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.type = "daytime";
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HITooltip tooltip = new HITooltip();
        tooltip.crosshairs = true;
        tooltip.shared = true;
        tooltip.valueSuffix = "°C";
        options.tooltip = tooltip;

        HILegend legend = new HILegend();
        options.legend = legend;

        HILine line = new HILine();
        line.type = "line";
        line.name = "Temperature";
        line.zIndex = 1;
        line.marker = new HIMarker();
        line.marker.fillColor = HIColor.initWithName("white");
        line.marker.lineWidth = 2;
        line.marker.lineColor = HIColor.initWithHexValue("7cb5ec");
        Number[][] lineData = new Number[][] {
                {1246406400000L, 21.5},
                {1246492800000L, 22.1},
                {1246579200000L, 23},
                {1246665600000L, 23.8},
                {1246752000000L, 21.4},
                {1246838400000L, 21.3},
                {1246924800000L, 18.3},
                {1247011200000L, 15.4},
                {1247097600000L, 16.4},
                {1247184000000L, 17.7},
                {1247270400000L, 17.5},
                {1247356800000L, 17.6},
                {1247443200000L, 17.7},
                {1247529600000L, 16.8},
                {1247616000000L, 17.7},
                {1247702400000L, 16.3},
                {1247788800000L, 17.8},
                {1247875200000L, 18.1},
                {1247961600000L, 17.2},
                {1248048000000L, 14.4},
                {1248134400000L, 13.7},
                {1248220800000L, 15.7},
                {1248307200000L, 14.6},
                {1248393600000L, 15.3},
                {1248480000000L, 15.3},
                {1248566400000L, 15.8},
                {1248652800000L, 15.2},
                {1248739200000L, 14.8},
                {1248825600000L, 14.4},
                {1248912000000L, 15},
                {1248998400000L, 13.6}
        };
        line.data = new ArrayList<>(Arrays.asList(lineData));

        HIArearange arearange = new HIArearange();
        arearange.type = "arearange";
        arearange.name = "Range";
        arearange.lineWidth = 0;
        arearange.linkedTo = ":previous";
        arearange.color = HIColor.initWithHexValue("7cb5ec");
        arearange.fillOpacity = 0.3;
        arearange.zIndex = 0;
        Number[][] arearangeData = new Number[][]{
                {1246406400000L, 14.3, 27.7},
                {1246492800000L, 14.5, 27.8},
                {1246579200000L, 15.5, 29.6},
                {1246665600000L, 16.7, 30.7},
                {1246752000000L, 16.5, 25.0},
                {1246838400000L, 17.8, 25.7},
                {1246924800000L, 13.5, 24.8},
                {1247011200000L, 10.5, 21.4},
                {1247097600000L, 9.2, 23.8},
                {1247184000000L, 11.6, 21.8},
                {1247270400000L, 10.7, 23.7},
                {1247356800000L, 11.0, 23.3},
                {1247443200000L, 11.6, 23.7},
                {1247529600000L, 11.8, 20.7},
                {1247616000000L, 12.6, 22.4},
                {1247702400000L, 13.6, 19.6},
                {1247788800000L, 11.4, 22.6},
                {1247875200000L, 13.2, 25.0},
                {1247961600000L, 14.2, 21.6},
                {1248048000000L, 13.1, 17.1},
                {1248134400000L, 12.2, 15.5},
                {1248220800000L, 12.0, 20.8},
                {1248307200000L, 12.0, 17.1},
                {1248393600000L, 12.7, 18.3},
                {1248480000000L, 12.4, 19.4},
                {1248566400000L, 12.6, 19.9},
                {1248652800000L, 11.9, 20.2},
                {1248739200000L, 11.0, 19.3},
                {1248825600000L, 10.8, 17.8},
                {1248912000000L, 11.8, 18.5},
                {1248998400000L, 10.8, 16.1}
        };
        arearange.data = new ArrayList<>(Arrays.asList(arearangeData));

        options.series = new ArrayList<>(Arrays.asList(arearange, line));

        chartView.options = options;
    }

}

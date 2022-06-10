package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.HIGradient;
import com.highsoft.highcharts.common.HIStop;
import com.highsoft.highcharts.common.hichartsclasses.HIAnimationOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIArea;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HIColumnrange;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HICrosshair;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIInactive;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotBands;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HIShadowOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIStates;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIZones;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class IssuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        HIChartView chartView = findViewById(R.id.chartview1);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setHeight(300);
        chart.setWidth(300);
        options.setChart(chart);
        chart.setType("area");
        HIEvents events =  new HIEvents();
//        HIFunction load = new HIFunction("function() { var H = Highcharts, rel = H.relativeLength;  H.wrap(H.seriesTypes.column.prototype, 'translate', function(proceed) { var options = this.options, topMargin = options.topMargin || 0, bottomMargin = options.bottomMargin || 0; proceed.call(this); this.points.forEach(function(point) { var shapeArgs = point.shapeArgs, w = shapeArgs.width, h = shapeArgs.height, x = shapeArgs.x, y = shapeArgs.y;  var rTopLeft = rel(options.borderRadiusTopLeft || 0, w), rTopRight = rel(options.borderRadiusTopRight || 0, w), rBottomRight = rel(options.borderRadiusBottomRight || 0, w), rBottomLeft = rel(options.borderRadiusBottomLeft || 0, w); if (rTopLeft || rTopRight || rBottomRight || rBottomLeft) { var maxR = (Math.min(w, h) / 2); if (rTopLeft > maxR) { rTopLeft = maxR; } if (rTopRight > maxR) { rTopRight = maxR; } if (rBottomRight > maxR) { rBottomRight = maxR; } if (rBottomLeft > maxR) { rBottomLeft = maxR; } point.dlBox = point.shapeArgs; point.shapeType = 'path'; point.shapeArgs = {  d: [ ['M', x + rTopLeft, y + topMargin], ['L', x + w - rTopRight, y + topMargin], ['C', x + w - rTopRight / 2, y, x + w, y + rTopRight / 2, x + w, y + rTopRight], ['L', x + w, y + h - rBottomRight], ['C', x + w, y + h - rBottomRight / 2, x + w - rBottomRight / 2, y + h, x + w - rBottomRight, y + h + bottomMargin], ['L', x + rBottomLeft, y + h + bottomMargin], ['C', x + rBottomLeft / 2, y + h, x, y + h - rBottomLeft / 2, x, y + h - rBottomLeft], ['L', x, y + rTopLeft], ['C', x, y + rTopLeft / 2, x + rTopLeft / 2, y, x + rTopLeft, y], ['Z'] ] }; } }); }); this.series[0].update({  borderRadiusTopLeft: 20, borderRadiusTopRight: 20 } ); }");
//        events.setLoad(load);
        chart.setEvents(events);
        options.setChart(chart);

//        labels.setFormatter(new HIFunction("function() { if(this.value === 2) { return '<img src=\"https://www.highcharts.com/samples/graphics/snow.png\"/>' }  }"));
//        hiyAxis.setType("category");
//        HILabels labels = new HILabels();
//        labels.setUseHTML(true);
//        labels.setX(10);
//        String imgUrl = "file:///android_asset/ic_android.png";
//        labels.setFormatter(new HIFunction("function() { if(this.value === 2) { return '<img src=\"" + imgUrl + "\" />' }  }"));
//        hiyAxis.setLabels(labels);
//        hiyAxis.setTitle(new HITitle());
//        hiyAxis.getTitle().setText("");

        HIYAxis hiyAxis = new HIYAxis();

        HIPlotBands plotBands = new HIPlotBands();
        plotBands.setColor(HIColor.initWithName("red"));
        plotBands.setFrom(2);
        plotBands.setTo(4);

        hiyAxis.setPlotBands(new ArrayList<>(Collections.singletonList(plotBands)));

        options.setYAxis(new ArrayList<>(Collections.singletonList(hiyAxis)));

        HILine series1 = new HILine();
        series1.setName("Tokyo");
        Number[] series1_data = new Number[] {1, 2, 3, 2, 4};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

//        HIChart chart = new HIChart();
//        chart.setType("columnrange");
//        chart.setHeight(300);
//        chart.setMarginLeft(45);
//        HIEvents events =  new HIEvents();
//        HIFunction load = new HIFunction("function() { var H = Highcharts, rel = H.relativeLength;  H.wrap(H.seriesTypes.column.prototype, 'translate', function(proceed) { var options = this.options, topMargin = options.topMargin || 0, bottomMargin = options.bottomMargin || 0; proceed.call(this); this.points.forEach(function(point) { var shapeArgs = point.shapeArgs, w = shapeArgs.width, h = shapeArgs.height, x = shapeArgs.x, y = shapeArgs.y;  var rTopLeft = rel(options.borderRadiusTopLeft || 0, w), rTopRight = rel(options.borderRadiusTopRight || 0, w), rBottomRight = rel(options.borderRadiusBottomRight || 0, w), rBottomLeft = rel(options.borderRadiusBottomLeft || 0, w); if (rTopLeft || rTopRight || rBottomRight || rBottomLeft) { var maxR = (Math.min(w, h) / 2); if (rTopLeft > maxR) { rTopLeft = maxR; } if (rTopRight > maxR) { rTopRight = maxR; } if (rBottomRight > maxR) { rBottomRight = maxR; } if (rBottomLeft > maxR) { rBottomLeft = maxR; } point.dlBox = point.shapeArgs; point.shapeType = 'path'; point.shapeArgs = {  d: [ ['M', x + rTopLeft, y + topMargin], ['L', x + w - rTopRight, y + topMargin], ['C', x + w - rTopRight / 2, y, x + w, y + rTopRight / 2, x + w, y + rTopRight], ['L', x + w, y + h - rBottomRight], ['C', x + w, y + h - rBottomRight / 2, x + w - rBottomRight / 2, y + h, x + w - rBottomRight, y + h + bottomMargin], ['L', x + rBottomLeft, y + h + bottomMargin], ['C', x + rBottomLeft / 2, y + h, x, y + h - rBottomLeft / 2, x, y + h - rBottomLeft], ['L', x, y + rTopLeft], ['C', x, y + rTopLeft / 2, x + rTopLeft / 2, y, x + rTopLeft, y], ['Z'] ] }; } }); }); this.series[0].update({  borderRadiusTopLeft: 20, borderRadiusTopRight: 20 } ); }");
//        events.setLoad(load);
//        chart.setEvents(events);
//        options.setChart(chart);
//
//        HILegend legend = new HILegend();
//        legend.setEnabled(false);
//        options.setLegend(legend);
//
//        HITitle title = new HITitle();
//        title.setText("");
//        options.setTitle(title);
//
//        HIXAxis hixAxis = new HIXAxis();
//        hixAxis.setTickWidth(0);
//        ArrayList<HIXAxis> xaxisList = new ArrayList<>();
//        xaxisList.add(hixAxis);
//        options.setXAxis(xaxisList);
//
//
//
//
//        HIYAxis hiyAxis = new HIYAxis();
//        hiyAxis.setType("category");
//        hiyAxis.setMin(0);
//        hiyAxis.setMax(4);
//        HILabels labels = new HILabels();
//        labels.setY(0);
//        labels.setX(-40);
//        labels.setUseHTML(true);
//        HICSSObject style = new HICSSObject();
//        style.setWidth(32);
//        labels.setStyle(style);
////        labels.setFormatter(new HIFunction("function() { return '<span class=\"f32\"> <span class=\"flag us\"></span> </span>' }"));
////        hiyAxis.setLabels(labels);
//        HITitle yaxisTitle = new HITitle();
//        yaxisTitle.setText("");
//        hiyAxis.setTitle(yaxisTitle);
//        ArrayList<HIYAxis> yaxisList = new ArrayList<>();
//        yaxisList.add(hiyAxis);
//        options.setYAxis(yaxisList);
//
//        HIColumnrange columnrange = new HIColumnrange();
//        columnrange.setBorderRadius(5);
//        columnrange.setPointPadding(0.4);
//
//        ArrayList<Double> l1 = new ArrayList<>();
//        l1.add(18.0);
//        l1.add(2.5);
//        l1.add(3.5);
//
//        ArrayList<Double> l2 = new ArrayList<>();
//        l2.add(20.0);
//        l2.add(2.5);
//        l2.add(3.5);
//
//        ArrayList<Double> l3 = new ArrayList<>();
//        l3.add(21.0);
//        l3.add(3.5);
//        l3.add(4.5);
//
//        ArrayList<Double> l4 = new ArrayList<>();
//        l4.add(22.0);
//        l4.add(-0.5);
//        l4.add(0.5);
//
//        ArrayList<Double> l5 = new ArrayList<>();
//        l5.add(23.0);
//        l5.add(0.5);
//        l5.add(1.5);
//
//        ArrayList<Double> l6 = new ArrayList<>();
//        l6.add(24.0);
//        l6.add(2.5);
//        l6.add(3.5);
//
//        ArrayList<ArrayList<Double>> data = new ArrayList<>();
//        data.add(l1);
//        data.add(l2);
//        data.add(l3);
//        data.add(l4);
//        data.add(l5);
//        data.add(l6);
//        columnrange.setData(data);
//
//        HIZones zone1 = new HIZones();
//        zone1.setValue(0);
//        zone1.setColor(HIColor.initWithName("green"));
//
//        HIZones zone2 = new HIZones();
//        zone2.setValue(1);
//        zone2.setColor(HIColor.initWithName("blue"));
//
//        HIZones zone3 = new HIZones();
//        zone3.setValue(2);
//        zone3.setColor(HIColor.initWithName("red"));
//
//        HIZones zone4 = new HIZones();
//        zone4.setValue(3);
//        zone4.setColor(HIColor.initWithName("orange"));
//
//        HIZones zone5 = new HIZones();
//        zone5.setValue(3);
//        zone5.setColor(HIColor.initWithName("black"));
//
//        ArrayList<HIZones> zonesList = new ArrayList<>();
//        zonesList.add(zone1);
//        zonesList.add(zone2);
//        zonesList.add(zone3);
//        zonesList.add(zone4);
//        zonesList.add(zone5);
//        columnrange.setZones(zonesList);
//
//        options.setSeries(new ArrayList<>(Collections.singletonList(columnrange)));

        chartView.setOptions(options);
    }
}

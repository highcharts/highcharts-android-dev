package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIAnimationOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIAnnotations;
import com.highsoft.highcharts.common.hichartsclasses.HIBackground;
import com.highsoft.highcharts.common.hichartsclasses.HIBubbleLegend;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HICrosshair;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HILabel;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HILoading;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPane;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotBands;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISolidgauge;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


    private static final String TAG = "Issue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

//        Button btn = findViewById(R.id.btn);
//        btn.setText("Series update");
        HIChartView chartView = findViewById(R.id.hc);
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("annotations");

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setPanning(true);
        chart.setZoomType("x");


        chart.setEvents(new HIEvents());
        chart.getEvents().setLoad(new HIFunction("function () { var chart = this, r = chart.renderer, legend = chart.legend.group, y = legend.translateY; r.path(['M', 0, y, 'L', chart.plotLeft + chart.plotWidth, y]) .attr({ 'stroke-width': 2, stroke: 'red', zIndex: 1 }) .add() }"));
        options.setChart(chart);

        HIAnnotations annotations = new HIAnnotations();
        annotations.setLabels(new ArrayList<HILabel>());
        HILabels label = new HILabels();
        label.setPoint(new HIPoint());
        label.getPoint().setX(0);
        label.getPoint().setY(0);
        label.setText("example");
        annotations.getLabels().add(label);
        options.setAnnotations(new ArrayList<>());
        options.getAnnotations().add(annotations);
//        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
////        mRecyclerView.setHasFixedSize(true); // todo - check performance
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        ArrayList<ChartInfo> info = new ArrayList<>();
//        info.add(new ChartInfo("area", "1"));
//        info.add(new ChartInfo("spline", "2"));
//        info.add(new ChartInfo("bar", "3"));
//        info.add(new ChartInfo("line", "4"));
//        info.add(new ChartInfo("column", "5"));
//        info.add(new ChartInfo("line", "6"));
//        info.add(new ChartInfo("area", "7"));
//        info.add(new ChartInfo("area", "8"));
//
//        MyAdapter mAdapter = new MyAdapter(info);
//        mRecyclerView.setAdapter(mAdapter);


        HILegend legend = new HILegend();
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setXDateFormat("%A, %b %d, %Y");
        options.setTooltip(tooltip);

//        tooltip.setFollowTouchMove(false);

        HIXAxis hixAxis = new HIXAxis();
        hixAxis.setType("datetime");
        HIPlotBands plotBands = new HIPlotBands();
        plotBands.setEvents(new HIFunction(() -> {

        }));
        hixAxis.setPlotBands(new ArrayList<>(Collections.singletonList(plotBands)));
        options.setXAxis(new ArrayList<>(Collections.singletonList(hixAxis)));

        HISeries series = new HISeries();
        series.setData(randData(10));
        options.setSeries(new ArrayList<>(Collections.singletonList(series)));

        chartView.setOptions(options);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });
    }


    private ArrayList randData(int bound){
        ArrayList<Integer> data = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            data.add(r.nextInt(bound));
        }
        return data;
    }

    class ChartInfo {
        String type;
        String name;

        public ChartInfo(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}

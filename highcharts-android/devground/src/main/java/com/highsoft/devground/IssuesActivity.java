package com.highsoft.devground;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIDrilldown;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIHover;
import com.highsoft.highcharts.common.hichartsclasses.HIInactive;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HINormal;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotBands;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HIScatter;
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea;
import com.highsoft.highcharts.common.hichartsclasses.HISelect;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HIShadowOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
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
import java.util.HashMap;
import java.util.LinkedList;

public class IssuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        TextView loadingView = findViewById(R.id.loading);
        Button btnTest = findViewById(R.id.btnTest);

        HIChartView chartView = findViewById(R.id.chartview1);
        HIOptions options = new HIOptions();

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});


        HISpline series1 = new HISpline();
        series1.setName("Tokyo");
        series1.setColor(HIColor.initWithName("green"));
        series1.setData(new ArrayList<>(Arrays.asList(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)));

        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        HITooltip tooltip = new HITooltip();
        tooltip.setEnabled(true);
        tooltip.setFormatter(new HIFunction("function() { return `<span style=\"color:${this.color}\">●</span> ${this.series.name}<br> x: <b>${this.point.category}</b><br>y: <b>${this.y}`; }"));
        options.setTooltip(tooltip);

        chartView.setOptions(options);

//        HIChartView chartView = findViewById(R.id.chartview1);
//        HIOptions options = new HIOptions();
//
//        HIXAxis xAxis = new HIXAxis();
//        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
//        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
//        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});
//
//
//        HISpline series1 = new HISpline();
//        series1.setName("Tokyo");
//        series1.setColor(HIColor.initWithName("green"));
//        series1.setData(new ArrayList<>(Arrays.asList(7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6)));
//
//        options.setSeries(new ArrayList<>(Arrays.asList(series1)));
//
//        HITooltip tooltip = new HITooltip();
//        tooltip.setEnabled(true);
//        tooltip.setFormatter(new HIFunction("function() { return `<span style=\"color:${this.color}\">●</span> ${this.series.name}<br> x: <b>${this.point.category}</b><br>y: <b>${this.y}`; }"));
//        options.setTooltip(tooltip);
//
//        chartView.setOptions(options);

//        HIChartView chartView = findViewById(R.id.chartview1);
//        HIOptions options = new HIOptions();
//
//        HIChart chart = new HIChart();
//        chart.setType("column");
//        chart.setScrollablePlotArea(new HIScrollablePlotArea());
//        chart.getScrollablePlotArea().setMinWidth(700);
//        options.setChart(chart);
//
//        HIXAxis xAxis = new HIXAxis();
//        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
//        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
//        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});
//
//        HIYAxis yAxis = new HIYAxis();
//        yAxis.setMax(1);
//        yAxis.setVisible(false);
//        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});
//
//        HITooltip tooltip = new HITooltip();
//        tooltip.setShared(true);
//        tooltip.setFollowPointer(false);
//        options.setTooltip(tooltip);
//
        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSeries(new HISeries());
        plotOptions.getSeries().
        plotOptions.getSeries().setAllowPointSelect(true);
        plotOptions.getSeries().setPoint(new HIPoint());
        plotOptions.getSeries().getPoint().setEvents(new HIEvents());
        plotOptions.getSeries().getPoint().getEvents().setClick(new HIFunction("function() { const point = this, chart = point.series.chart, seriesIndex = point.series.index, otherPoint = chart.series[seriesIndex === 0 ? 1 : 0].points[point.x]; chart.series.forEach(series => { series.points.forEach(point => { point.update({ color: Highcharts.color(series.color).setOpacity(0.2).get() }, false) }) }); if (point.state !== 'select') { otherPoint.update({ color: otherPoint.series.color }, false, false) } chart.redraw() }"));
        plotOptions.getSeries().setStates(new HIStates());
        plotOptions.getSeries().getStates().setNormal(new HINormal());
        plotOptions.getSeries().getStates().getNormal().setAnimation(new HIAnimationOptionsObject());
        plotOptions.getSeries().getStates().getNormal().getAnimation().setDuration(0);
        plotOptions.getSeries().getStates().setHover(new HIHover());
        plotOptions.getSeries().getStates().getHover().setEnabled(false);
        options.setPlotOptions(plotOptions);

//        HIColumn column1 = new HIColumn();
//        column1.setName("CHF 8,100");
//        column1.setColor(HIColor.initWithHexValue("006622"));
//        column1.setStates(new HIStates());
//        column1.getStates().setSelect(new HISelect());
//        column1.getStates().getSelect().setColor(HIColor.initWithHexValue("006622"));
//        column1.getStates().getSelect().setBorderColor(HIColor.initWithName("transparent"));
//        Number[] columnData1 = new Number[] { 0.24241777588120805, 0.3365607760984871, 0.6486666367455813, 0.025683369602743755, 0.873850736669133, 0.689106033785561, 0.33545651337196414, 0.09455847318642174, 0.6306711083884627, 0.19374049973082375, 0.4634314466302971, 0.19322149629497987 };
//        column1.setData(new ArrayList<>(Arrays.asList(columnData1)));
//
//        HIColumn column2 = new HIColumn();
//        column2.setName("CHF 1,850");
//        column2.setColor(HIColor.initWithHexValue("cc3300"));
//        column2.setStates(new HIStates());
//        column2.getStates().setSelect(new HISelect());
//        column2.getStates().getSelect().setColor(HIColor.initWithHexValue("cc3300"));
//        column2.getStates().getSelect().setBorderColor(HIColor.initWithName("transparent"));
//        Number[] columnData2 = new Number[] { 0.22441811642798026, 0.2708184240447048, 0.6264280444742762, 0.7513558282273284, 0.47233378113842406, 0.23098273059767893, 0.11325184334763871, 0.4869911560003778, 0.08685336967961499, 0.448150689615636, 0.2673804685200395, 0.3796370223648643 };
//        column2.setData(new ArrayList<>(Arrays.asList(columnData2)));
//        options.setSeries(new ArrayList<>(Arrays.asList(column1, column2)));
//
//        chartView.setOptions(options);


        btnTest.setOnClickListener(view -> chartView.clearFocus());

    }
}

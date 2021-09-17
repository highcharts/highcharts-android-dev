package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIDial;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HIGauge;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPane;
import com.highsoft.highcharts.common.hichartsclasses.HIPivot;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotBands;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStackLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartContext;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;
import com.highsoft.highcharts.core.HIFunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Stacked column chart");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Plain");
        options.setSubtitle(subtitle);

//        HIXAxis xaxis = new HIXAxis();
//        xaxis.setCategories(new ArrayList<>(Arrays.asList("Appled", "Oranges", "Pears", "Grapes", "Bananas")));
//        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));
//
//        HIYAxis yaxis = new HIYAxis();
//        yaxis.setMin(0);
//        yaxis.setTitle(new HITitle());
//        yaxis.getTitle().setText("Total fruit consumption");

        HIStackLabels hiStackLabels = new HIStackLabels();
        hiStackLabels.setEnabled(true);
        hiStackLabels.setRotation(0);
        hiStackLabels.setBackgroundColor(HIColor.initWithRGBA(255, 0, 0, 0));
        hiStackLabels.setBorderRadius(4);
        hiStackLabels.setBorderColor(HIColor.initWithHexValue("e0e0e0"));
        hiStackLabels.setAlign("center");
        hiStackLabels.setVerticalAlign("center");
        hiStackLabels.setAllowOverlap(false);
        hiStackLabels.setStyle(new HICSSObject());
        hiStackLabels.getStyle().setTextOutline("none");
        hiStackLabels.setOverflow("none");
        hiStackLabels.setAllowOverlap(false);
        hiStackLabels.setCrop(true);
        hiStackLabels.getStyle().setColor("#000000");
        hiStackLabels.setTextAlign("center");
        hiStackLabels.setY(-5);
        hiStackLabels.setBorderWidth(1);

//        yaxis.setStackLabels(hiStackLabels);
//        yaxis.setStackLabels(new HIStackLabels());
//        yaxis.getStackLabels().setEnabled(true);
//        yaxis.getStackLabels().setStyle(new HICSSObject());
//        yaxis.getStackLabels().getStyle().setFontWeight("bold");
//        yaxis.getStackLabels().getStyle().setColor("gray");
//        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HILegend legend = new HILegend();
//        legend.setAlign("right");
//        legend.setX(-30);
//        legend.setVerticalAlign("top");
//        legend.setY(25);
//        legend.setFloating(true);
//        legend.setBackgroundColor(HIColor.initWithName("white"));
//        legend.setBorderColor(HIColor.initWithHexValue("ccc"));
//        legend.setBorderWidth(1);
//        legend.setShadow(false);
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: {point.y}<br/>Total: {point.stackTotal}");
        tooltip.setHeaderFormat("<b>{point.x}</b><br/>");
        options.setTooltip(tooltip);

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setColumn(new HIColumn());
        plotoptions.getColumn().setStacking("normal");
//        plotoptions.getColumn().setPointPadding(0);
//        plotoptions.getColumn().setGroupPadding(0);
        ArrayList<HIDataLabels> hiDataLabelsArrayList = new ArrayList<>();
        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.setEnabled(true);
//        dataLabels.setColor(HIColor.initWithName("white"));
//        dataLabels.setStyle(new HIStyle());
//        dataLabels.getStyle().setTextOutline("0 0 3px black");

        dataLabels.setFormatter(new HIFunction(new HIFunctionInterface<HIChartContext, String>() {
            @Override
            public String apply(HIChartContext hiContext) {
                Double value = (Double) hiContext.getProperty("x");
                // do some computation with the value
                String test = value.toString() + " HEHE";
                System.out.println("TEST FORMATTERS: " + test);
                return test;
            }
        }, new String[] {"x"}));
        hiDataLabelsArrayList.add(dataLabels);
//        plotoptions.getColumn().setDataLabels(hiDataLabelsArrayList);
//        options.setPlotOptions(plotoptions);

        HIColumn column1 = new HIColumn();
        column1.setName("John");
        column1.setDataLabels(hiDataLabelsArrayList);
        Number[] column1Data = new Number[] { 5, 3, 4, 7, 2 };
        column1.setData(new ArrayList<>(Arrays.asList(column1Data)));

        HISpline column2 = new HISpline();
//        column2.setName("Jane");
//        column2.setDataLabels(hiDataLabelsArrayList);
        Number[] column2Data = new Number[] { 2, 2, 3, 2, 1 };
        column2.setData(new ArrayList<>(Arrays.asList(column2Data)));
//
//        HIColumn column3 = new HIColumn();
//        column3.setName("Joe");
//        column3.setDataLabels(hiDataLabelsArrayList);
//        Number[] column3Data = new Number[] { 3, 4, 4, 2, 5 };
//        column3.setData(new ArrayList<>(Arrays.asList(column3Data)));

        options.setSeries(new ArrayList<>(Arrays.asList(column1)));

        chartView.setOptions(options);
    }
}

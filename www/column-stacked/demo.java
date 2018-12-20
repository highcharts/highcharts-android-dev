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

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Stacked column chart");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Plain");
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setCategories(new ArrayList<>(Arrays.asList("Appled", "Oranges", "Pears", "Grapes", "Bananas")));
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setMin(0);
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Total fruit consumption");
        yaxis.setStackLabels(new HIStackLabels());
        yaxis.getStackLabels().setEnabled(true);
        yaxis.getStackLabels().setStyle(new HICSSObject());
        yaxis.getStackLabels().getStyle().setFontWeight("bold");
        yaxis.getStackLabels().getStyle().setColor("gray");
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HILegend legend = new HILegend();
        legend.setAlign("right");
        legend.setX(-30);
        legend.setVerticalAlign("top");
        legend.setY(25);
        legend.setFloating(true);
        legend.setBackgroundColor(HIColor.initWithName("white"));
        legend.setBorderColor(HIColor.initWithHexValue("ccc"));
        legend.setBorderWidth(1);
        legend.setShadow(false);
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: {point.y}<br/>Total: {point.stackTotal}");
        tooltip.setHeaderFormat("<b>{point.x}</b><br/>");
        options.setTooltip(tooltip);

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setColumn(new HIColumn());
        plotoptions.getColumn().setStacking("normal");
        plotoptions.getColumn().setDataLabels(new HIDataLabels());
        plotoptions.getColumn().getDataLabels().setEnabled(true);
        plotoptions.getColumn().getDataLabels().setColor(HIColor.initWithName("white"));
        plotoptions.getColumn().getDataLabels().setStyle(new HICSSObject());
        plotoptions.getColumn().getDataLabels().getStyle().setTextOutline("0 0 3px black");
        options.setPlotOptions(plotoptions);

        HIColumn column1 = new HIColumn();
        column1.setName("John");
        Number[] column1Data = new Number[] { 5, 3, 4, 7, 2 };
        column1.setData(new ArrayList<>(Arrays.asList(column1Data)));

        HIColumn column2 = new HIColumn();
        column2.setName("Jane");
        Number[] column2Data = new Number[] { 2, 2, 3, 2, 1 };
        column2.setData(new ArrayList<>(Arrays.asList(column2Data)));

        HIColumn column3 = new HIColumn();
        column3.setName("Joe");
        Number[] column3Data = new Number[] { 3, 4, 4, 2, 5 };
        column3.setData(new ArrayList<>(Arrays.asList(column3Data)));

        options.setSeries(new ArrayList<>(Arrays.asList(column1, column2, column3)));

        chartView.options = options;
    }
}

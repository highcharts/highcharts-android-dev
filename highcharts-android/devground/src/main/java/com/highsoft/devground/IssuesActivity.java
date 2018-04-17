package com.highsoft.devground;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.highsoft.highcharts.Common.HIChartsClasses.HIAnnotations;
import com.highsoft.highcharts.Common.HIChartsClasses.HIBoost;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HICondition;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabel;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HIResponsive;
import com.highsoft.highcharts.Common.HIChartsClasses.HIRules;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Core.HIChartView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class IssuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.text = "Issue chart";
        options.title = title;

//        chartView.plugins = new ArrayList<>();
//        chartView.plugins.add("boost-canvas");
//        chartView.plugins.add("boost");
//
//        HIBoost boost = new HIBoost();
//        boost.useGPUTranslations = true;
//        boost.enabled = true;
//        options.boost = boost;

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;


        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Quantity Sold";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

//        HIXAxis xaxis = new HIXAxis();
//        xaxis.categories=orderVelocityWeekPojo.getRange();
//        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HILegend legend = new HILegend();
        legend.layout = "vertical";
        legend.align = "right";
        legend.verticalAlign = "middle";
        options.legend = legend;

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.series = new HISeries();
        plotoptions.series.label = new HILabel();
        plotoptions.series.label.connectorAllowed = false;
        plotoptions.series.pointStart = 2010;
        options.plotOptions = plotoptions;

        HILine line1 = new HILine();
        line1.name = "Sample nameSample nameSample nameSample name";
        line1.data = new ArrayList<>(Arrays.asList(4,1,4,5,6,1,5,4,1,4,2,6,8,4));


        HIResponsive responsive = new HIResponsive();

        HIRules rules1 = new HIRules();
        rules1.condition = new HICondition();
        rules1.condition.maxWidth = 500;
        HashMap<String, HashMap> chartLegend = new HashMap<>();
        HashMap<String, String> legendOptions = new HashMap<>();
        legendOptions.put("layout", "horizontal");
        legendOptions.put("align", "center");
        legendOptions.put("verticalAlign", "bottom");
        chartLegend.put("legend", legendOptions);
        rules1.chartOptions = chartLegend;
        responsive.rules = new ArrayList<>(Collections.singletonList(rules1));
        options.responsive = responsive;
        options.series = new ArrayList<>(Collections.singletonList(line1));

        chartView.options = options;
    }

}

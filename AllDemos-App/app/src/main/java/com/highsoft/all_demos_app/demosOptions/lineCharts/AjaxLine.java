package com.highsoft.all_demos_app.demosOptions.lineCharts;

import android.app.AlertDialog;
import android.content.Context;

import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HICondition;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIEvents;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HIResponsive;
import com.highsoft.highcharts.Common.HIChartsClasses.HIRules;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by bartosz on 28.03.18.
 */

public class AjaxLine {

    private static HIOptions options = new HIOptions();

    public static HIOptions getOptions(Context context){

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;

        HIData data = new HIData();
        data.csv = "# ----------------------------------------\n# highcharts.com\n# Audience Overview\n# 20130309-20130408\n# ----------------------------------------\nDay,Visits,Unique Visitors\n3/9/13,5691,4346\n3/10/13,5403,4112\n3/11/13,15574,11356\n3/12/13,16211,11876\n3/13/13,16427,11966\n3/14/13,16486,12086\n3/15/13,14737,10916\n3/16/13,5838,4507\n3/17/13,5542,4202\n3/18/13,15560,11523\n3/19/13,18940,14431\n3/20/13,16970,12599\n3/21/13,17580,13094\n3/22/13,17511,13234\n3/23/13,6601,5213\n3/24/13,6158,4806\n3/25/13,17353,12639\n3/26/13,17660,12768\n3/27/13,16921,12389\n3/28/13,15964,11686\n3/29/13,12028,8891\n3/30/13,5835,4513\n3/31/13,4799,3661\n4/1/13,13037,9503\n4/2/13,16976,12666\n4/3/13,17100,12635\n4/4/13,15701,11394\n4/5/13,14378,10530\n4/6/13,5889,4521\n4/7/13,6779,5109\n4/8/13,16068,11599\n";
//        data.csvURL = "https://cdn.rawgit.com/highcharts/highcharts/057b672172ccc6c08fe7dbb27fc17ebca3f5b770/samples/data/analytics.csv";
//        data.beforeParse = new HIFunction(
//                "function (csv) { return csv.replace(/\n\n/g, '\n'); }");
        options.data = data;

        HITitle title = new HITitle();
        title.text = "Daily visits at www.highcharts.com";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: Google Analytics";
        options.subtitle = subtitle;

        HIXAxis xaxis = new HIXAxis();
        xaxis.tickInterval = (7 * 24 * 3600 *1000);
        xaxis.tickWidth = 0;
        xaxis.gridLineWidth = 1;
        xaxis.labels = new HILabels();
        xaxis.labels.align = "left";
        xaxis.labels.x = 3;
        xaxis.labels.y = -3;
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.title = new HITitle();
        yaxis1.labels = new HILabels();
        yaxis1.labels.align = "left";
        yaxis1.labels.x = 3;
        yaxis1.labels.y = 16;
        yaxis1.labels.format = "{value:.,0f}";
        yaxis1.showFirstLabel = false;

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.linkedTo = 0;
        yaxis2.gridLineWidth = 0;
        yaxis2.opposite = true;
        yaxis2.title = new HITitle();
        yaxis2.labels = new HILabels();
        yaxis2.labels.x = -3;
        yaxis2.labels.y = 16;
        yaxis2.labels.format = "{value:.,0f}";
        yaxis2.showFirstLabel = false;

        options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

        HILegend legend = new HILegend();
        legend.align = "left";
        legend.verticalAlign = "top";
        legend.y = 20;
        legend.floating = true;
        legend.borderWidth = 0;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.shared = true;
        options.tooltip = tooltip;

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.series = new HISeries();
        plotoptions.series.cursor = "pointer";
        plotoptions.series.point = new HIPoint();
        plotoptions.series.point.events = new HIEvents();
//        plotoptions.series.point.events.click = new HIFunction("function (e) {" +
//                "                        hs.htmlExpand(null, {" +
//                "                            pageOrigin: {" +
//                "                                x: e.pageX || e.clientX," +
//                "                                y: e.pageY || e.clientY" +
//                "                            }," +
//                "                            headingText: this.series.name," +
//                "                            maincontentText: Highcharts.dateFormat('%A, %b %e, %Y', this.x) + ':<br/> ' +" +
//                "                                this.y + ' sessions'," +
//                "                            width: 200" +
//                "                        });" +
//                "                    }");
        plotoptions.series.point.events.click = new HIFunction(
                f -> {
                    new AlertDialog.Builder(context)
                            .setTitle((String)f.getProperty("series.name"))
                            .setMessage(f.getProperty("y") + " sessions")
                            .create().show();
                },
                new String[] {"series.name", "y"}
        );
        plotoptions.series.marker = new HIMarker();
        plotoptions.series.marker.lineWidth = 1;
        options.plotOptions = plotoptions;

        HILine line1 = new HILine();
        line1.name = "All visits";
        line1.lineWidth = 4;
        line1.marker = new HIMarker();
        line1.marker.radius = 4;

        HILine line2 = new HILine();
        line2.name = "New visitors";

        HIResponsive responsive = new HIResponsive();
        HIRules rules1 = new HIRules();
        rules1.condition = new HICondition();
        rules1.condition.maxWidth = 600;
        HashMap<String, HashMap> chartLegend = new HashMap<>();
        HashMap<String, Object> legendOptions = new HashMap<>();
        legendOptions.put("verticalAlign", "bottom");
        legendOptions.put("y", 0);
        legendOptions.put("floating", false);
        chartLegend.put("legend", legendOptions);
        rules1.chartOptions = chartLegend;
        responsive.rules = new ArrayList<>(Collections.singletonList(rules1));
        options.responsive = responsive;

        options.series = new ArrayList<>(Arrays.asList(line1, line2));

        return options;
    }
}

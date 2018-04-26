package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
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
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("data");
        chartView.plugins.add("series-label");
        chartView.plugins.add("export-data");

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "line";
        options.chart = chart;

        HIData data = new HIData();
        data.csvURL = "https://cdn.rawgit.com/highcharts/highcharts/057b672172ccc6c08fe7dbb27fc17ebca3f5b770/samples/data/analytics.csv";
        data.beforeParse = new HIFunction("function(csv) {  return csv.replace(/\n\n/g, '\n'); }");
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
        plotoptions.series.point.events.click = new HIFunction("function (e) { hs.htmlExpand(null, { pageOrigin: { x: e.pageX || e.clientX, y: e.pageY || e.clientY }, headingText: this.series.name, maincontentText: Highcharts.dateFormat('%A, %b %e, %Y', this.x) + ':<br/> ' + this.y + ' visits', width: 200 }); }");
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

        chartView.options = options;
    }
}

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
        chartView.plugins = new ArrayList<>(Arrays.asList("data", "series-label", "export-data"));

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("line");
        options.setChart(chart);

        HIData data = new HIData();
        data.setCsvURL("https://cdn.rawgit.com/highcharts/highcharts/057b672172ccc6c08fe7dbb27fc17ebca3f5b770/samples/data/analytics.csv");
        data.setBeforeParse(new HIFunction("function(csv) {  return csv.replace(/\n\n/g, '\n'); }"));
        options.setData(data);

        HITitle title = new HITitle();
        title.setText("Daily visits at www.highcharts.com");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: Google Analytics");
        options.setSubtitle(subtitle);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setTickInterval(7 * 24 * 3600 *1000);
        xaxis.setTickWidth(0);
        xaxis.setGridLineWidth(1);
        xaxis.setLabels(new HILabels());
        xaxis.getLabels().setAlign("left");
        xaxis.getLabels().setX(3);
        xaxis.getLabels().setY(-3);
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.setTitle(new HITitle());
        yaxis1.setLabels(new HILabels());
        yaxis1.getLabels().setAlign("left");
        yaxis1.getLabels().setX(3);
        yaxis1.getLabels().setY(16);
        yaxis1.getLabels().setFormat("{value:.,0f}");
        yaxis1.setShowFirstLabel(false);

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.setLinkedTo(0);
        yaxis2.setGridLineWidth(0);
        yaxis2.setOpposite(true);
        yaxis2.setTitle(new HITitle());
        yaxis2.setLabels(new HILabels());
        yaxis2.getLabels().setX(-3);
        yaxis2.getLabels().setY(16);
        yaxis2.getLabels().setFormat("{value:.,0f}");
        yaxis2.setShowFirstLabel(false);

        options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

        HILegend legend = new HILegend();
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setY(20);
        legend.setFloating(true);
        legend.setBorderWidth(0);
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        options.setTooltip(tooltip);

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setSeries(new HISeries());
        plotoptions.getSeries().setCursor("pointer");
        plotoptions.getSeries().setPoint(new HIPoint());
        plotoptions.getSeries().getPoint().setEvents(new HIEvents());
        plotoptions.getSeries().getPoint().getEvents().setClick(new HIFunction("function (e) { hs.htmlExpand(null, { pageOrigin: { x: e.pageX || e.clientX, y: e.pageY || e.clientY }, headingText: this.series.name, maincontentText: Highcharts.dateFormat('%A, %b %e, %Y', this.x) + ':<br/> ' + this.y + ' visits', width: 200 }); }"));
        plotoptions.getSeries().setMarker(new HIMarker());
        plotoptions.getSeries().getMarker().setLineWidth(1);
        options.setPlotOptions(plotoptions);

        HILine line1 = new HILine();
        line1.setName("All visits");
        line1.setLineWidth(4);
        line1.setMarker(new HIMarker());
        line1.getMarker().setRadius(4);

        HILine line2 = new HILine();
        line2.setName("New visitors");

        HIResponsive responsive = new HIResponsive();
        HIRules rules1 = new HIRules();
        rules1.setCondition(new HICondition());
        rules1.getCondition().setMaxWidth(600);
        HashMap<String, HashMap> chartLegend = new HashMap<>();
        HashMap<String, Object> legendOptions = new HashMap<>();
        legendOptions.put("verticalAlign", "bottom");
        legendOptions.put("y", 0);
        legendOptions.put("floating", false);
        chartLegend.put("legend", legendOptions);
        rules1.setChartOptions(chartLegend);
        responsive.setRules(new ArrayList<>(Collections.singletonList(rules1)));
        options.setResponsive(responsive);

        options.setSeries(new ArrayList<>(Arrays.asList(line1, line2)));

        chartView.setOptions(options);
    }
}

package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import com.highsoft.highcharts.Common.HIColor;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("scatter");
        Number[] marginList = new Number[] {70, 50, 60, 80 };
        chart.setMargin(new ArrayList<>(Arrays.asList(marginList)));
        chart.setEvents(new HIEvents());
        chart.getEvents().setClick(new HIFunction(
                "function (e) {" +
                        " /*find the clicked values and the series*/ " +
                        "var x = Math.round(e.xAxis[0].value), " +
                        "y = Math.round(e.yAxis[0].value), " +
                        "series = this.series[0]; " +
                        "/*Add it*/ " +
                        "series.addPoint([x, y]); }"));
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("User supplied data");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Click the plot area to add a point. Click a point to remove it.");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setGridLineWidth(1);
        xAxis.setMinPadding(0.2);
        xAxis.setMaxPadding(0.2);
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Value");
        yAxis.setMinPadding(0.2);
        yAxis.setMaxPadding(0.2);

        HIPlotLines plotLines1 = new HIPlotLines();
        plotLines1.setValue(0);
        plotLines1.setWidth(1);
        plotLines1.setColor(HIColor.initWithHexValue("808080"));

        HIPlotLines[] plotLinesList = new HIPlotLines[] {plotLines1 };
        yAxis.setPlotLines(new ArrayList<>(Arrays.asList(plotLinesList)));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIExporting exporting = new HIExporting();
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSeries(new HISeries());
        plotOptions.getSeries().setLineWidth(1);
        plotOptions.getSeries().setPoint(new HIPoint());
        plotOptions.getSeries().getPoint().setEvents(new HIEvents());
        plotOptions.getSeries().getPoint().getEvents().setClick(new HIFunction(
                "function () { " +
                        "if (this.series.data.length > 1) { " +
                        "this.remove(); " +
                        "}}"));
        options.setPlotOptions(plotOptions);

        HIScatter series1 = new HIScatter();
        Number[][] series1_data = new Number[][] {{20, 20}, {80, 80}};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        options.setSeries(new ArrayList<>(Collections.singletonList(series1)));

        chartView.setOptions(options);
    }
}


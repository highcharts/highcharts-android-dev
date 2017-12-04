package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "area";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Historic and Estimated Worldwide Population Distribution by Region";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: Wikipedia.org";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"1750", "1800", "1850", "1900", "1950", "1999", "2050" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        xAxis.tickmarkPlacement = "on";
        xAxis.title = new HITitle();
        xAxis.title.enabled = false;
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.title = new HITitle();
        yAxis.title.text = "Percent";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "<span style=\"color:{series.color}\">{series.name}</span>: <b>{point.percentage:.1f}%</b> ({point.y:,.0f} millions)<br/>";
        tooltip.split = true;
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.area = new HIArea();
        plotOptions.area.stacking = "percent";
        plotOptions.area.lineColor = HIColor.initWithHexValue("ffffff");
        plotOptions.area.lineWidth = 1;
        plotOptions.area.marker = new HIMarker();
        plotOptions.area.marker.lineWidth = 1;
        plotOptions.area.marker.lineColor = HIColor.initWithHexValue("ffffff");
        options.plotOptions = plotOptions;

        HIArea series1 = new HIArea();
        series1.name = "Asia";
        Number[] series1_data = new Number[] {502, 635, 809, 947, 1402, 3634, 5268};
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        HIArea series2 = new HIArea();
        series2.name = "Africa";
        Number[] series2_data = new Number[] {106, 107, 111, 133, 221, 767, 1766};
        series2.data = new ArrayList<>(Arrays.asList(series2_data));
        HIArea series3 = new HIArea();
        series3.name = "Europe";
        Number[] series3_data = new Number[] {163, 203, 276, 408, 547, 729, 628};
        series3.data = new ArrayList<>(Arrays.asList(series3_data));
        HIArea series4 = new HIArea();
        series4.name = "America";
        Number[] series4_data = new Number[] {18, 31, 54, 156, 339, 818, 1201};
        series4.data = new ArrayList<>(Arrays.asList(series4_data));
        HIArea series5 = new HIArea();
        series5.name = "Oceania";
        Number[] series5_data = new Number[] {2, 2, 2, 6, 13, 30, 46};
        series5.data = new ArrayList<>(Arrays.asList(series5_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series2, series3, series4, series5));


        chartView.options = options;
    }
}


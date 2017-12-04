package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import com.highsoft.highcharts.Core.HIGFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "heatmap";
        chart.marginTop = 40;
        chart.marginBottom = 80;
        chart.plotBorderWidth = 1;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Sales per employee per weekday";
        options.title = title;

        HIXAxis xaxis = new HIXAxis();
        xaxis.categories = new ArrayList<>(Arrays.asList("Alexander", "Marie", "Maximilian", "Sophia", "Lukas", "Maria", "Leon", "Anna", "Tim", "Laura"));
        options.xAxis = new ArrayList<>(Collections.singletonList(xaxis));

        HIYAxis yaxis = new HIYAxis();
        yaxis.categories = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
        yaxis.title = new HITitle();
        yaxis.title.text = "";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HILegend legend = new HILegend();
        legend.align = "right";
        legend.layout = "vertical";
        legend.margin = 0;
        legend.verticalAlign = "top";
        legend.y = 25;
        legend.symbolHeight = 280;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.formatter = new HIGFunction("function () { return '<b>' + this.series.xAxis.categories[this.point.x] + '</b> sold <br><b>' + this.point.value + '</b> items on <br><b>' + this.series.yAxis.categories[this.point.y] + '</b>'; }", true);
        options.tooltip = tooltip;

        HIHeatmap heatmap = new HIHeatmap();
        heatmap.name = "Sales per employee";
        heatmap.borderWidth = 1;
        heatmap.dataLabels = new HIDataLabels();
        heatmap.dataLabels.enabled = true;
        heatmap.dataLabels.color = HIColor.initWithHexValue("000000");
        Number[][] heatmapData = new Number[][]{
                {0, 0, 10},
                {0, 1, 19},
                {0, 2, 8},
                {0, 3, 24},
                {0, 4, 67},
                {1, 0, 92},
                {1, 1, 58},
                {1, 2, 78},
                {1, 3, 117},
                {1, 4, 48},
                {2, 0, 35},
                {2, 1, 15},
                {2, 2, 123},
                {2, 3, 64},
                {2, 4, 52},
                {3, 0, 72},
                {3, 1, 132},
                {3, 2, 114},
                {3, 3, 19},
                {3, 4, 16},
                {4, 0, 38},
                {4, 1, 5},
                {4, 2, 8},
                {4, 3, 117},
                {4, 4, 115},
                {5, 0, 88},
                {5, 1, 32},
                {5, 2, 12},
                {5, 3, 6},
                {5, 4, 120},
                {6, 0, 13},
                {6, 1, 44},
                {6, 2, 88},
                {6, 3, 98},
                {6, 4, 96},
                {7, 0, 31},
                {7, 1, 1},
                {7, 2, 82},
                {7, 3, 32},
                {7, 4, 30},
                {8, 0, 85},
                {8, 1, 97},
                {8, 2, 123},
                {8, 3, 64},
                {8, 4, 84},
                {9, 0, 47},
                {9, 1, 114},
                {9, 2, 31},
                {9, 3, 48},
                {9, 4, 91}
        };
        heatmap.data = new ArrayList<>(Arrays.asList(heatmapData));
        options.series = new ArrayList<>(Collections.singletonList(heatmap));

        options.additionalOptions = new HashMap<>();
        HashMap<String, Object> colorAxisOptions = new HashMap<>();
        colorAxisOptions.put("min", 0);
        colorAxisOptions.put("minColor", "#FFFFFF");
        colorAxisOptions.put("maxColor", "#7cb5ec");
        options.additionalOptions.put("colorAxis", colorAxisOptions);

        chartView.options = options;
    }
}

package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.highsoft.highcharts.Common.HIChartsClasses.HIBar;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotBands;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIZones;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateTest();
    }

    public void updateTest(){
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.style = new HIStyle();
        title.style.fontSize = "40px";
        title.text = "Update feature test";
//        options.title = title;
        options.setTitle(title);

        HIChart chart = new HIChart();
        chart.type = "column";
        chart.backgroundColor = HIColor.initWithName("grey");
        chart.borderWidth = 10;
        chart.borderColor = HIColor.initWithName("lightblue");
        chart.setSpacing(new ArrayList<>(Arrays.asList(30,30,100,30)));
//        chart.spacing = new ArrayList<>(Arrays.asList(30,30,100,30));
//        options.chart = chart;
        options.setChart(chart);

        HISeries series = new HISeries();
        series.data = new ArrayList<>(Arrays.asList(5,8,10,2,5,1,7,4));
        HISeries series1 = new HISeries();
        series1.data = new ArrayList<>(Arrays.asList(5,12,14,6,1,8,4,6));

//        options.series = new ArrayList<>(Arrays.asList(series, series1));
        options.setSeries(new ArrayList<>(Arrays.asList(series, series1)));
        options.colors = new ArrayList<>(Arrays.asList(HIColor.initWithName("red"), HIColor.initWithName("yellow")));

//        chartView.options = options;
        chartView.setOptions(options);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                chartView.getOptions().getChart().setType("spline");
//                chartView.getOptions().getChart().setBackgroundColor(HIColor.initWithName("lightblue"));

//                HISeries newSeries = chartView.getOptions().getSeries().get(0);
////                newSeries.setData(new ArrayList<>(Arrays.asList(5,19,2,15,18,10,8)));
//                ArrayList firstSeriesData = chartView.getOptions().getSeries().get(0).getData();
//                firstSeriesData.set(0, 10);
//                newSeries.setData(firstSeriesData);
//                chartView.getOptions().setSeries(new ArrayList<>(Arrays.asList(newSeries, series1)));
                chartView.getOptions().getChart().setSpacing(new ArrayList<>(Arrays.asList(5,5,10,5)));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                chartView.options.chart.setBorderWidth(50);

                HIOptions options1 = new HIOptions();
                options.setChart(new HIChart());
                options.getChart().setBackgroundColor(HIColor.initWithName("blue"));
                chartView.setOptions(options1);
//                HISeries series1 = new HISeries();
//                series1.data = new ArrayList<>(Arrays.asList(6,9,10,11,13,8,9,6));
//                HISeries series2 = new HISeries();
//                series2.data = new ArrayList<>(Arrays.asList(9,1,2,2,9,8,5,4));
//                chartView.options.setSeries(new ArrayList<>(Arrays.asList(series1,series2)));
            }
        });
    }

    public void liveDataColumns61(){
        HIChartView chartView = findViewById(R.id.hc);
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("data");
        HIOptions options = new HIOptions();
        options.chart = new HIChart();
        options.chart.type = "bar";
//        options.chart.height = 650;
//        options.chart.width = 1300;
        options.title = new HITitle();
        options.title.text = "Server Monitoring Demo";
        options.legend = new HILegend();
        options.legend.enabled = false;
        options.subtitle = new HISubtitle();
        options.subtitle.text = "Instance Load";
        options.data = new HIData();
        options.data.csvURL = "https://demo-live-data.highcharts.com/vs-load.csv";
        options.data.enablePolling = true;
        options.data.dataRefreshRate = 1;
        options.plotOptions = new HIPlotOptions();
        options.plotOptions.bar = new HIBar();
        options.plotOptions.bar.colorByPoint = true;
        options.plotOptions.series = new HISeries();
        HIZones zones1 = new HIZones();
        zones1.color = HIColor.initWithHexValue("4CAF50");
        zones1.value = 0;
        HIZones zones2 = new HIZones();
        zones2.color = HIColor.initWithHexValue("8BC34A");
        zones2.value = 10;
        HIZones zones3 = new HIZones();
        zones3.color = HIColor.initWithHexValue("CDDC39");
        zones3.value = 20;
        HIZones zones4 = new HIZones();
        zones4.color = HIColor.initWithHexValue("CDDC39");
        zones4.value = 30;
        HIZones zones5 = new HIZones();
        zones5.color = HIColor.initWithHexValue("FFEB3B");
        zones5.value = 40;
        HIZones zones6 = new HIZones();
        zones6.color = HIColor.initWithHexValue("FFEB3B");
        zones6.value = 50;
        HIZones zones7 = new HIZones();
        zones7.color = HIColor.initWithHexValue("FFC107");
        zones7.value = 60;
        HIZones zones8 = new HIZones();
        zones8.color = HIColor.initWithHexValue("FF9800");
        zones8.value = 70;
        HIZones zones9 = new HIZones();
        zones9.color = HIColor.initWithHexValue("FF5722");
        zones9.value = 80;
        HIZones zones10 = new HIZones();
        zones10.color = HIColor.initWithHexValue("F44336");
        zones10.value = 90;
        HIZones zones11 = new HIZones();
        zones11.color = HIColor.initWithHexValue("F44336");
        zones11.value = 100;
        options.plotOptions.series.zones = new ArrayList<>(Arrays.asList(zones1,zones2,zones3,zones4,zones5,zones6,zones7,zones8,zones9,zones10,zones11));
        options.plotOptions.series.dataLabels = new HIDataLabels();
        options.plotOptions.series.dataLabels.enabled = true;
        options.plotOptions.series.dataLabels.format = "{point.y:.0f}%";
        options.tooltip = new HITooltip();
        options.tooltip.valueDecimals = 1;
        options.tooltip.valueSuffix = "%";
        options.xAxis = new ArrayList<>();
        HIXAxis hixAxis = new HIXAxis();
        hixAxis.type = "category";
        hixAxis.labels = new HILabels();
        hixAxis.labels.style = new HIStyle();
        hixAxis.labels.style.fontSize = "10px";
        options.xAxis.add(hixAxis);
        options.yAxis = new ArrayList<>();
        HIYAxis hiyAxis = new HIYAxis();
        hiyAxis.max = 100;
//        hiyAxis.title = false; ?????
        hiyAxis.plotBands = new ArrayList<>();
        HIPlotBands plotBands1 = new HIPlotBands();
        plotBands1.from = 0;
        plotBands1.to = 30;
        plotBands1.color = HIColor.initWithHexValue("E8F5E9");
        HIPlotBands plotBands2 = new HIPlotBands();
        plotBands2.from = 30;
        plotBands2.to = 70;
        plotBands2.color = HIColor.initWithHexValue("FFFDE7");
        HIPlotBands plotBands3 = new HIPlotBands();
        plotBands3.from = 70;
        plotBands3.to = 100;
        plotBands3.color = HIColor.initWithHexValue("FFEBEE");
        hiyAxis.plotBands.add(plotBands1);
        hiyAxis.plotBands.add(plotBands2);
        hiyAxis.plotBands.add(plotBands3);
        options.yAxis.add(hiyAxis);
        chartView.options = options;
    }
}

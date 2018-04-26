package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.type = "bubble";
        chart.plotBorderWidth = 1;
        chart.zoomType = "xy";
        options.chart = chart;

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HITitle title = new HITitle();
        title.text = "Sugar and fat intake per country";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: <a href=\"http://www.euromonitor.com/\">Euromonitor</a> and <a href=\"https://data.oecd.org/\">OECD</a>";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        xAxis.gridLineWidth = 1;
        xAxis.title = new HITitle();
        xAxis.title.text = "Daily fat intake";
        xAxis.labels = new HILabels();
        xAxis.labels.format = "{value} gr";
        HIPlotLines plotLines1 = new HIPlotLines();
        plotLines1.color = HIColor.initWithHexValue("FFFFFF");
        plotLines1.dashStyle = "dot";
        plotLines1.width = 2;
        plotLines1.value = 65;
        plotLines1.label = new HILabel();
        plotLines1.label.rotation = 0;
        plotLines1.label.y = 15;
        plotLines1.label.style = new HIStyle();
        plotLines1.label.style.fontWeight = "italic";
        plotLines1.label.text = "Safe fat intake 65g/day";
        plotLines1.zIndex = 3;
        HIPlotLines[] plotLinesList1 = new HIPlotLines[] {plotLines1 };
        xAxis.plotLines = new ArrayList<>(Arrays.asList(plotLinesList1));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.startOnTick = false;
        yAxis.endOnTick = false;
        yAxis.title = new HITitle();
        yAxis.title.text = "Daily sugar intake";
        yAxis.labels = new HILabels();
        yAxis.labels.format = "{value} gr";
        yAxis.maxPadding = 0.2;
        HIPlotLines plotLines2 = new HIPlotLines();
        plotLines2.color = HIColor.initWithHexValue("FFFFFF");
        plotLines2.dashStyle = "dot";
        plotLines2.width = 2;
        plotLines2.value = 50;
        plotLines2.label = new HILabel();
        plotLines2.label.align = "right";
        plotLines2.label.x = -10;
        plotLines2.label.style = new HIStyle();
        plotLines2.label.style.fontWeight = "italic";
        plotLines2.label.text = "Safe sugar intake 50g/day";
        plotLines2.zIndex = 3;
        HIPlotLines[] plotLinesList2 = new HIPlotLines[] {plotLines2 };
        yAxis.plotLines = new ArrayList<>(Arrays.asList(plotLinesList2));
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HITooltip tooltip = new HITooltip();
        tooltip.useHTML = true;
        tooltip.headerFormat = "<table>";
        tooltip.pointFormat = "<tr><th colspan=\"2\"><h3>{point.country}</h3></th></tr><tr><th>Fat'intake':</th><td>{point.x}g</td></tr><tr><th>Sugar'intake':</th><td>{point.y}g</td></tr><tr><th>Obesity (adults):</th><td>{point.z}%</td></tr>";
        tooltip.footerFormat = "</table>";
        tooltip.followPointer = true;
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.series = new HISeries();
        plotOptions.series.dataLabels = new HIDataLabels();
        plotOptions.series.dataLabels.enabled = true;
        plotOptions.series.dataLabels.format = "{point.name}";
        options.plotOptions = plotOptions;

        HIBubble series1 = new HIBubble();

        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("x", 95);
        map1.put("y", 95);
        map1.put("z", 13.8);
        map1.put("name", "BE");
        map1.put("country", "Belgium");

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("x", 86.5);
        map2.put("y", 102.9);
        map2.put("z", 14.7);
        map2.put("name", "DE");
        map2.put("country", "Germany");

        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("x", 80.8);
        map3.put("y", 91.5);
        map3.put("z", 15.8);
        map3.put("name", "FI");
        map3.put("country", "Finland");

        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("x", 80.4);
        map4.put("y", 102.5);
        map4.put("z", 12);
        map4.put("name", "NL");
        map4.put("country", "Netherlands");

        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("x", 80.3);
        map5.put("y", 86.1);
        map5.put("z", 11.8);
        map5.put("name", "SE");
        map5.put("country", "Sweden");

        HashMap<String, Object> map6 = new HashMap<>();
        map6.put("x", 78.4);
        map6.put("y", 70.1);
        map6.put("z", 16.6);
        map6.put("name", "ES");
        map6.put("country", "Spain");

        HashMap<String, Object> map7 = new HashMap<>();
        map7.put("x", 74.2);
        map7.put("y", 68.5);
        map7.put("z", 14.5);
        map7.put("name", "FR");
        map7.put("country", "France");

        HashMap<String, Object> map8 = new HashMap<>();
        map8.put("x", 73.5);
        map8.put("y", 83.1);
        map8.put("z", 10);
        map8.put("name", "NO");
        map8.put("country", "Norway");

        HashMap<String, Object> map9 = new HashMap<>();
        map9.put("x", 71);
        map9.put("y", 93.2);
        map9.put("z", 24.7);
        map9.put("name", "UK");
        map9.put("country", "United Kingdom");

        HashMap<String, Object> map10 = new HashMap<>();
        map10.put("x", 69.2);
        map10.put("y", 57.6);
        map10.put("z", 10.4);
        map10.put("name", "IT");
        map10.put("country", "Italy");

        HashMap<String, Object> map11 = new HashMap<>();
        map11.put("x", 68.6);
        map11.put("y", 20);
        map11.put("z", 16);
        map11.put("name", "RU");
        map11.put("country", "Russia");

        HashMap<String, Object> map12 = new HashMap<>();
        map12.put("x", 65.5);
        map12.put("y", 126.4);
        map12.put("z", 35.3);
        map12.put("name", "US");
        map12.put("country", "United States");

        HashMap<String, Object> map13 = new HashMap<>();
        map13.put("x", 65.4);
        map13.put("y", 50.8);
        map13.put("z", 28.5);
        map13.put("name", "HU");
        map13.put("country", "Hungary");

        HashMap<String, Object> map14 = new HashMap<>();
        map14.put("x", 63.4);
        map14.put("y", 51.8);
        map14.put("z", 15.4);
        map14.put("name", "PT");
        map14.put("country", "Portugal");

        HashMap<String, Object> map15 = new HashMap<>();
        map15.put("x", 64);
        map15.put("y", 82.9);
        map15.put("z", 31.3);
        map15.put("name", "NZ");
        map15.put("country", "New Zealand");

        HashMap[] series1_data = new HashMap[] { map1, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13, map14, map15 };
        series1.data = new ArrayList<>(Arrays.asList(series1_data));
        options.series = new ArrayList<>(Arrays.asList(series1, series1));


        chartView.options = options;
    }
}


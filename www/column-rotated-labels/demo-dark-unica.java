package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "column";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "World\"s largest cities per 2014";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: <a href=\"http://en.wikipedia.org/wiki/List_of_cities_proper_by_population\">Wikipedia</a>";
        options.subtitle = subtitle;

        HIXAxis xAxis = new HIXAxis();
        xAxis.type = "category";
        xAxis.labels = new HILabels();
        xAxis.labels.rotation = -45;
        xAxis.labels.style = new HIStyle();
        xAxis.labels.style.fontSize = "13px";
        xAxis.labels.style.fontFamily = "Verdana, sans-serif";
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIYAxis yAxis = new HIYAxis();
        yAxis.min = 0;
        yAxis.title = new HITitle();
        yAxis.title.text = "Population (millions)";
        options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

        HILegend legend = new HILegend();
        legend.enabled = false;
        options.legend = legend;

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "Population in'2008': <b>{point.y:.1f} millions</b>";
        options.tooltip = tooltip;

        HIColumn series1 = new HIColumn();
        series1.name = "Population";

        Object[] object1 = new Object[] { "Shanghai", 23.7 };
        Object[] object2 = new Object[] { "Lagos", 16.1 };
        Object[] object3 = new Object[] { "Istanbul", 14.2 };
        Object[] object4 = new Object[] { "Karachi", 14 };
        Object[] object5 = new Object[] { "Mumbai", 12.5 };
        Object[] object6 = new Object[] { "Moscow", 12.1 };
        Object[] object7 = new Object[] { "São Paulo", 11.8 };
        Object[] object8 = new Object[] { "Beijing", 11.7 };
        Object[] object9 = new Object[] { "Guangzhou", 11.1 };
        Object[] object10 = new Object[] { "Delhi", 11.1 };
        Object[] object11 = new Object[] { "Shenzhen", 10.5 };
        Object[] object12 = new Object[] { "Seoul", 10.4 };
        Object[] object13 = new Object[] { "Jakarta", 10 };
        Object[] object14 = new Object[] { "Kinshasa", 9.3 };
        Object[] object15 = new Object[] { "Tianjin", 9.3 };
        Object[] object16 = new Object[] { "Tokyo", 9 };
        Object[] object17 = new Object[] { "Cairo", 8.9 };
        Object[] object18 = new Object[] { "Dhaka", 8.9 };
        Object[] object19 = new Object[] { "Mexico City", 8.9 };
        Object[] object20 = new Object[] { "Lima", 8.9 };

        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20));

        series1.dataLabels = new HIDataLabels();
        series1.dataLabels.enabled = true;
        series1.dataLabels.rotation = -90;
        series1.dataLabels.color = HIColor.initWithHexValue("FFFFFF");
        series1.dataLabels.align = "right";
        series1.dataLabels.format = "{point.y:.1f}";
        series1.dataLabels.y = 10;
        series1.dataLabels.style = new HIStyle();
        series1.dataLabels.style.fontSize = "13px";
        series1.dataLabels.style.fontFamily = "Verdana, sans-serif";
        options.series = new ArrayList<>(Arrays.asList(series1));
        

        chartView.options = options;
    }
}


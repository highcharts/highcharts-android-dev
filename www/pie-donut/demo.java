package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
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

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "pie";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Browser market share, January, 2015 to May, 2015";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "Source: <a href=\"http://netmarketshare.com/\">netmarketshare.com</a>";
        options.subtitle = subtitle;

        HIYAxis yaxis = new HIYAxis();
        yaxis.title = new HITitle();
        yaxis.title.text = "Total percent market share";
        options.yAxis = new ArrayList<>(Collections.singletonList(yaxis));

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.pie = new HIPie();
        plotoptions.pie.shadow = false;
        plotoptions.pie.center = new ArrayList<>(Arrays.asList("50%", "50%"));
        options.plotOptions = plotoptions;

        HITooltip tooltip = new HITooltip();
        tooltip.valueSuffix = "%";
        options.tooltip = tooltip;

        HIPie pie1 = new HIPie();
        pie1.name = "Browsers";
        pie1.size = "60%";
        pie1.dataLabels = new HIDataLabels();
        pie1.dataLabels.formatter = new HIFunction(
                f -> {
                    if((double)f.getProperty("y") > 5)  { //display only if larger than 5
                        return (String)f.getProperty("point.name");
                    } else
                        return null;
                },
                new String[] {"y", "point.name"}
        ); pie1.dataLabels.color = HIColor.initWithHexValue("ffffff");
        pie1.dataLabels.distance = -30;
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "MSIE");
        map1.put("y", 56.33);
        map1.put("color", "#7cb5ec");
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "Firefox");
        map2.put("y", 10.38);
        map2.put("color", "#434348");
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("name", "Chrome");
        map3.put("y", 24.03);
        map3.put("color", "#90ed7d");
        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("name", "Safari");
        map4.put("y", 4.77);
        map4.put("color", "#f7a35c");
        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("name", "Opera");
        map5.put("y", 0.91);
        map5.put("color", "#8085e9");
        HashMap<String, Object> map6 = new HashMap<>();
        map6.put("y", 0.2);
        map6.put("color", "#f15c80");
        pie1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6));

        HIPie pie2 = new HIPie();
        pie2.name = "Versions";
        pie2.size = "80%";
        pie2.innerSize = "60%";
        pie2.dataLabels = new HIDataLabels();
        pie2.dataLabels.formatter = new HIFunction(
                f -> {
                    if((double)f.getProperty("y") > 3)  { //display only if larger than 3
                        return "<b>" + f.getProperty("point.name") + ":</b> " + f.getProperty("y") + "%";
                    } else
                        return null;
                },
                new String[] {"y", "point.name"}
        );
        HashMap<String, Object> map7 = new HashMap<>();
        map7.put("name", "MSIE 6.0");
        map7.put("y", 1.06);
        map7.put("color", "rgb(175,232,255)");
        HashMap<String, Object> map8 = new HashMap<>();
        map8.put("name", "MSIE 7.0");
        map8.put("y", 0.5);
        map8.put("color", "rgb(166,223,255)");
        HashMap<String, Object> map9 = new HashMap<>();
        map9.put("name", "MSIE 8.0");
        map9.put("y", 17.2);
        map9.put("color", "rgb(158,215,255)");
        HashMap<String, Object> map10 = new HashMap<>();
        map10.put("name", "MSIE 9.0");
        map10.put("y", 8.11);
        map10.put("color", "rgb(149,206,255)");
        HashMap<String, Object> map11 = new HashMap<>();
        map11.put("name", "MSIE 10.0");
        map11.put("y", 5.33);
        map11.put("color", "rgb(141,198,253)");
        HashMap<String, Object> map12 = new HashMap<>();
        map12.put("name", "MSIE 11.0");
        map12.put("y", 24.13);
        map12.put("color", "rgb(132,189,244)");
        HashMap<String, Object> map13 = new HashMap<>();
        map13.put("name", "Firefox v31");
        map13.put("y", 0.33);
        map13.put("color", "rgb(118,118,123)");
        HashMap<String, Object> map14 = new HashMap<>();
        map14.put("name", "Firefox v32");
        map14.put("y", 0.15);
        map14.put("color", "rgb(111,111,116)");
        HashMap<String, Object> map15 = new HashMap<>();
        map15.put("name", "Firefox v33");
        map15.put("y", 0.22);
        map15.put("color", "rgb(105,105,110)");
        HashMap<String, Object> map16 = new HashMap<>();
        map16.put("name", "Firefox v35");
        map16.put("y", 1.27);
        map16.put("color", "rgb(98,98,103)");
        HashMap<String, Object> map17 = new HashMap<>();
        map17.put("name", "Firefox v36");
        map17.put("y", 2.76);
        map17.put("color", "rgb(92,92,97)");
        HashMap<String, Object> map18 = new HashMap<>();
        map18.put("name", "Firefox v37");
        map18.put("y", 2.32);
        map18.put("color", "rgb(86,86,91)");
        HashMap<String, Object> map19 = new HashMap<>();
        map19.put("name", "Firefox v38");
        map19.put("y", 2.31);
        map19.put("color", "rgb(79,79,84)");
        HashMap<String, Object> map20 = new HashMap<>();
        map20.put("y", 1.02);
        map20.put("color", "rgb(73,73,78)");
        HashMap<String, Object> map21 = new HashMap<>();
        map21.put("name", "Chrome v30.0");
        map21.put("y", 0.14);
        map21.put("color", "rgb(195,255,176)");
        HashMap<String, Object> map22 = new HashMap<>();
        map22.put("name", "Chrome v31.0");
        map22.put("y", 1.24);
        map22.put("color", "rgb(191,255,172)");
        HashMap<String, Object> map23 = new HashMap<>();
        map23.put("name", "Chrome v32.0");
        map23.put("y", 0.55);
        map23.put("color", "rgb(187,255,168)");
        HashMap<String, Object> map24 = new HashMap<>();
        map24.put("name", "Chrome v33.0");
        map24.put("y", 0.19);
        map24.put("color", "rgb(184,255,165)");
        HashMap<String, Object> map25 = new HashMap<>();
        map25.put("name", "Chrome v34.0");
        map25.put("y", 0.14);
        map25.put("color", "rgb(180,255,161)");
        HashMap<String, Object> map26 = new HashMap<>();
        map26.put("name", "Chrome v36.0");
        map26.put("y", 1.85);
        map26.put("color", "rgb(177,256,158)");
        HashMap<String, Object> map27 = new HashMap<>();
        map27.put("name", "Chrome v37.0");
        map27.put("y", 3.53);
        map27.put("color", "rgb(174,256,155)");
        HashMap<String, Object> map28 = new HashMap<>();
        map28.put("name", "Chrome v38.0");
        map28.put("y", 1.38);
        map28.put("color", "rgb(170,256,151)");
        HashMap<String, Object> map29 = new HashMap<>();
        map29.put("name", "Chrome v39.0");
        map29.put("y", 1.6);
        map29.put("color", "rgb(166,256,147)");
        HashMap<String, Object> map30 = new HashMap<>();
        map30.put("name", "Chrome v40.0");
        map30.put("y", 3.96);
        map30.put("color", "rgb(163,256,144)");
        HashMap<String, Object> map31 = new HashMap<>();
        map31.put("name", "Chrome v41.0");
        map31.put("y", 6);
        map31.put("color", "rgb(159,252,140)");
        HashMap<String, Object> map32 = new HashMap<>();
        map32.put("name", "Chrome v42.0");
        map32.put("y", 5.32);
        map32.put("color", "rgb(155,248,136)");
        HashMap<String, Object> map33 = new HashMap<>();
        map33.put("name", "Chrome v43.0");
        map33.put("y", 4.6800003);
        map33.put("color", "rgb(152,245,133)");
        HashMap<String, Object> map34 = new HashMap<>();
        map34.put("name", "Chrome v44.0");
        map34.put("y", 2.45);
        map34.put("color", "rgb(148,241,129)");
        HashMap<String, Object> map35 = new HashMap<>();
        map35.put("name", "Safari v6.0");
        map35.put("y", 1.3);
        map35.put("color", "rgb(256,215,144)");
        HashMap<String, Object> map36 = new HashMap<>();
        map36.put("name", "Safari v6.1");
        map36.put("y", 1.42);
        map36.put("color", "rgb(256,207,136)");
        HashMap<String, Object> map37 = new HashMap<>();
        map37.put("name", "Safari v7.1");
        map37.put("y", 1.29);
        map37.put("color", "rgb(256,200,129)");
        HashMap<String, Object> map38 = new HashMap<>();
        map38.put("name", "Safari v7.2");
        map38.put("y", 1.17);
        map38.put("color", "rgb(256,193,122)");
        HashMap<String, Object> map39 = new HashMap<>();
        map39.put("name", "Safari v8.0");
        map39.put("y", 1.26);
        map39.put("color", "rgb(256,185,114)");
        HashMap<String, Object> map40 = new HashMap<>();
        map40.put("name", "Safari v8.1");
        map40.put("y", 1.77);
        map40.put("color", "rgb(256,178,107)");
        HashMap<String, Object> map41 = new HashMap<>();
        map41.put("name", "Safari v9.0");
        map41.put("y", 3.56);
        map41.put("color", "rgb(255,171,100)");
        HashMap<String, Object> map42 = new HashMap<>();
        map42.put("name", "Opera v13.x");
        map42.put("y", 1.34);
        map42.put("color", "rgb(180,185,256)");
        HashMap<String, Object> map43 = new HashMap<>();
        map43.put("name", "Opera v28");
        map43.put("y", 1.17);
        map43.put("color", "rgb(167,172,256)");
        HashMap<String, Object> map44 = new HashMap<>();
        map44.put("name", "Opera v29");
        map44.put("y", 1.24);
        map44.put("color", "rgb(154,159,256)");
        HashMap<String, Object> map45 = new HashMap<>();
        map45.put("name", "Opera v30");
        map45.put("y", 1.16);
        map45.put("color", "rgb(141,146,246)");
        pie2.data = new ArrayList<>(Arrays.asList(map7, map8, map9, map10, map11, map12, map13, map14, map15, map16, map17, map18, map19, map20, map21, map22, map23, map24, map25, map26, map27, map28, map29, map30, map31, map32, map33, map34, map35, map36, map37, map38, map39, map40, map41, map42, map43, map44, map45));

        options.series = new ArrayList<>(Arrays.asList(pie1, pie2));

        chartView.options = options;
    }
}

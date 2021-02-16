package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.HIGradient;
import com.highsoft.highcharts.common.HIStop;
import com.highsoft.highcharts.common.hichartsclasses.HIArea;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIHover;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPie;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIStates;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        HIChartView chartView = findViewById(R.id.hc);

//        HashMap<String, Object> optionsMap = new HashMap<>();
//        HashMap<String, Object> title = new HashMap<>();
//        title.put("Text", "Solar Employment Growth by Sector, 2010-2016");
//        optionsMap.put("title", title);
//        ArrayList<Object> seriesArray = new ArrayList<>();
//        HashMap<String, Object> seriesEntry1 = new HashMap<>();
//        HashMap<String, Object> seriesEntry2 = new HashMap<>();
//        HashMap<String, Object> seriesEntry3 = new HashMap<>();
//        seriesEntry1.put("name", "Installation");
//        ArrayList<Number> data1 = new ArrayList<>();
//        data1.add(43934);
//        data1.add(52503);
//        data1.add(57177);
//        data1.add(69658);
//        seriesEntry1.put("data", data1);
//        seriesEntry2.put("name", "Manufacturing");
//        ArrayList<Number> data2 = new ArrayList<>();
//        data2.add(24916);
//        data2.add(24064);
//        data2.add(29742);
//        data2.add(29851);
//        seriesEntry2.put("data", data2);
//        seriesEntry3.put("name", "Sales & Distribution");
//        ArrayList<Number> data3 = new ArrayList<>();
//        data3.add(11744);
//        data3.add(17722);
//        data3.add(16005);
//        data3.add(19771);
//        seriesEntry1.put("data", data3);
//        seriesArray.add(seriesEntry1);
//        seriesArray.add(seriesEntry2);
//        seriesArray.add(seriesEntry3);
//        optionsMap.put("series", seriesArray);
//
//        chartView.loadJSONOptions(optionsMap);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("pie");
        chart.setPlotShadow(false);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Browser market shares January, 2015 to May, 2015");
        options.setTitle(title);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setPie(new HIPie());
        plotOptions.getPie().setAllowPointSelect(true);
        plotOptions.getPie().setCursor("pointer");
        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.setEnabled(true);
        dataLabels.setFormat("<b>{point.name}</b>: {point.percentage:.1f} %"); ;
        dataLabels.setStyle(new HIStyle());
        dataLabels.getStyle().setColor("black");
        ArrayList<HIDataLabels> dataLabelsList = new ArrayList<>();
        dataLabelsList.add(dataLabels);
        plotOptions.getPie().setDataLabels(dataLabelsList);
        options.setPlotOptions(plotOptions);

        HIPie pie = new HIPie();
        pie.setName("Brands");
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "Microsoft Internet Explorer");
        map1.put("y", 56.33);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "Chrome");
        map2.put("y", 24.03);
        map2.put("sliced", true);
        map2.put("selected", true);
        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("name", "Firefox");
        map3.put("y", 10.38);
        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("name", "Safari");
        map4.put("y", 4.77);
        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("name", "Opera");
        map5.put("y", 0.91);
        HashMap<String, Object> map6 = new HashMap<>();
        map6.put("name", "Others");
        map6.put("y", 0.2);
        pie.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6)));

        options.setSeries(new ArrayList<>(Collections.singletonList(pie)));

        chartView.setOptions(options);
    }
}

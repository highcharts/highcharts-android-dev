package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.plotBackgroundColor = new HIColor();
        chart.plotShadow = false;
        chart.type = "pie";
        options.chart = chart;

        ArrayList<HIColor> colors = new ArrayList<>();

        HashMap<String, Number> radialGradient = new HashMap<>();
        radialGradient.put("cx", 0.5);
        radialGradient.put("cy", 0.3);
        radialGradient.put("r", 0.7);

        List<List> stops1 = new ArrayList<>();
        List<Object> s11 = new LinkedList<>();
        s11.add(0);
        s11.add("#7cb5ec");
        List<Object> s12 = new LinkedList<>();
        s12.add(1);
        s12.add("rgb(48,105,160)");
        stops1.add(s11);
        stops1.add(s12);

        colors.add(HIColor.initWithLinearGradient(radialGradient, stops1));

        List<List> stops2 = new ArrayList<>();
		List<Object> s21 = new LinkedList<>();
		s21.add(0);
		s21.add("#434348");
		List<Object> s22 = new LinkedList<>();
		s22.add(1);
		s22.add("rgb(0,0,0)");
		stops2.add(s21);
		stops2.add(s22);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops2));

        List<List> stops3 = new ArrayList<>();
		List<Object> s31 = new LinkedList<>();
		s31.add(0);
		s31.add("#90ed7d");
		List<Object> s32 = new LinkedList<>();
		s32.add(1);
		s32.add("rgb(68,161,49)");
		stops3.add(s31);
		stops3.add(s32);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops3));

        List<List> stops4 = new ArrayList<>();
		List<Object> s41 = new LinkedList<>();
		s41.add(0);
		s41.add("#f7a35c");
		List<Object> s42 = new LinkedList<>();
		s42.add(1);
		s42.add("rgb(171,87,16)");
		stops4.add(s41);
		stops4.add(s42);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops4));

        List<List> stops5 = new ArrayList<>();
		List<Object> s51 = new LinkedList<>();
		s51.add(0);
		s51.add("#8085e9");
		List<Object> s52 = new LinkedList<>();
		s52.add(1);
		s52.add("rgb(52,57,157)");
		stops5.add(s51);
		stops5.add(s52);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops5));

        List<List> stops6 = new ArrayList<>();
		List<Object> s61 = new LinkedList<>();
		s61.add(0);
		s61.add("#f15c80");
		List<Object> s62 = new LinkedList<>();
		s62.add(1);
		s62.add("rgb(165,16,52)");
		stops6.add(s61);
		stops6.add(s62);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops6));

        List<List> stop7 = new ArrayList<>();
		List<Object> s71 = new LinkedList<>();
		s71.add(0);
		s71.add("#e4d354");
		List<Object> s72 = new LinkedList<>();
		s72.add(1);
		s72.add("#e4d354");
		stop7.add(s71);
		stop7.add(s72);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stop7));

        List<List> stops8 = new ArrayList<>();
		List<Object> s81 = new LinkedList<>();
		s81.add(0);
		s81.add("#2b908f");
		List<Object> s82 = new LinkedList<>();
		s82.add(1);
		s82.add("rgb(0,68,67)");
		stops8.add(s81);
		stops8.add(s82);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops8));

        List<List> stops9 = new ArrayList<>();
		List<Object> s91 = new LinkedList<>();
		s91.add(0);
		s91.add("#f45b5b");
		List<Object> s92 = new LinkedList<>();
		s92.add(1);
		s92.add("rgb(168,15,15)");
		stops9.add(s91);
		stops9.add(s92);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops9));

        List<List> stops10 = new ArrayList<>();
		List<Object> s101 = new LinkedList<>();
		s101.add(0);
		s101.add("#91e8e1");
		List<Object> s102 = new LinkedList<>();
		s102.add(1);
		s102.add("rgb(69,156,149)");
		stops10.add(s101);
		stops10.add(s102);

		colors.add(HIColor.initWithLinearGradient(radialGradient, stops10));

        options.colors = colors;

        HITitle title = new HITitle();
        title.text = "Browser market shares. January, 2015 to May, 2015";
        options.title = title;

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "{series.name}: <b>{point.percentage:.1f}%</b>";
        options.tooltip = tooltip;

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.pie = new HIPie();
        plotoptions.pie.allowPointSelect = true;
        plotoptions.pie.cursor = "pointer";
        plotoptions.pie.dataLabels = new HIDataLabels();
        plotoptions.pie.dataLabels.enabled = true;
        plotoptions.pie.dataLabels.format = "<b>{point.name}</b>: {point.percentage:.1f} %";
        plotoptions.pie.dataLabels.style = new HIStyle();
        plotoptions.pie.dataLabels.style.color = "black";
        plotoptions.pie.dataLabels.connectorColor = "silver";
        options.plotOptions = plotoptions;

        HIPie pie = new HIPie();
        pie.name = "Brands";
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
        map6.put("name", "Proprietary or Undetectable");
        map6.put("y", 0.2);

        pie.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6));

        options.series = new ArrayList<>(Collections.singletonList(pie));

        chartView.options = options;
    }
}

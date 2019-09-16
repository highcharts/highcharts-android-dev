package com.highsoft.devground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabelsOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIDrilldown;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPie;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
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

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        HIChartView chartView = findViewById(R.id.hc);

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
        HIDataLabelsOptionsObject dataLabels = new HIDataLabelsOptionsObject();
        dataLabels.setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
        dataLabels.setStyle(new HICSSObject());
        dataLabels.getStyle().setColor("black");
        dataLabels.setEnabled(true);
        plotOptions.getPie().setDataLabels(new ArrayList<>(Collections.singletonList(dataLabels)));
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
        chartView.setOptions(options);
    }
}

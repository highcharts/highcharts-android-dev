package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
        
        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.type = "pie";
        chart.options3d = new HIOptions3d();
        chart.options3d.enabled = true;
        chart.options3d.alpha = 45;
        chart.options3d.beta = 0;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Browser market shares at a specific website, 2014";
        options.title = title;

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "{series.name}: <b>{point.percentage:.1f}%</b>";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.pie = new HIPie();
        plotOptions.pie.allowPointSelect = true;
        plotOptions.pie.cursor = "pointer";
        plotOptions.pie.depth = 35;
        plotOptions.pie.dataLabels = new HIDataLabels();
        plotOptions.pie.dataLabels.enabled = true;
        plotOptions.pie.dataLabels.format = "{point.name}";
        options.plotOptions = plotOptions;

        HIPie series1 = new HIPie();
        series1.type = "pie";
        series1.name = "Browser share";
        Object[] firefoxData = new Object[] { "Firefox", 45.0 };
        Object[] IEData = new Object[] { "IE", 26.0 };
        HashMap<String, Object> chromeData = new HashMap<>();
        chromeData.put("name", "Chrome");
        chromeData.put("y", 12.8);
        chromeData.put("sliced", true);
        chromeData.put("selected", true);
        Object[] safariData = new Object[] { "Safari", 8.5 };
        Object[] operaData = new Object[] { "Opera", 6.2 };
        Object[] othersData = new Object[] { "Others", 0.7 };
        series1.data = new ArrayList<>(Arrays.asList(firefoxData, IEData, chromeData, safariData, operaData, othersData));
        options.series = new ArrayList<>(Arrays.asList(series1));

        chartView.options = options;
    }
}

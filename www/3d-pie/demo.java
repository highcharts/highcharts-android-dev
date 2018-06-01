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
        chart.setType("pie");
        chart.setOptions3d(new HIOptions3d());
        chart.getOptions3d().setEnabled(true);
        chart.getOptions3d().setAlpha(45);
        chart.getOptions3d().setBeta(0);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Browser market shares at a specific website, 2014");
        options.setTitle(title);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setPie(new HIPie());
        plotOptions.getPie().setAllowPointSelect(true);
        plotOptions.getPie().setCursor("pointer");
        plotOptions.getPie().setDepth(35);
        plotOptions.getPie().setDataLabels(new HIDataLabels());
        plotOptions.getPie().getDataLabels().setEnabled(true);
        plotOptions.getPie().getDataLabels().setFormat("{point.name}");
        options.setPlotOptions(plotOptions);

        HIPie series1 = new HIPie();
        series1.setName("Browser share");
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
        series1.setData(new ArrayList<>(Arrays.asList(firefoxData, IEData, chromeData, safariData, operaData, othersData)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));
        chartView.setOptions(options);
    }
}

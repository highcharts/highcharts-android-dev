package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("columnrange");
        chart.setInverted(true);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Temperature variation by month");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Observed in Vik i Sogn, Norway");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Temperature ( °C )");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setValueSuffix("°C");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setColumnrange(new HIColumnrange());
        plotOptions.getColumnrange().setDataLabels(new HIDataLabels());
        plotOptions.getColumnrange().getDataLabels().setEnabled(true);
        plotOptions.getColumnrange().getDataLabels().setFormatter(new HIFunction(
                f -> f.getProperty("y") + "°C",
        new String[] {"y"}));
        options.setPlotOptions(plotOptions);

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIColumnrange series1 = new HIColumnrange();
        series1.setName("Temperatures");
        Number[][] series1_data = new Number[][] {{-9.7, 9.4}, {-8.7, 6.5}, {-3.5, 9.4}, {-1.4, 19.9}, {0.0, 22.6}, {2.9, 29.5}, {9.2, 30.7}, {7.3, 26.5}, {4.4, 18.0}, {-3.1, 11.4}, {-5.2, 10.4}, {-13.5, 9.8}};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.options = options;
    }
}


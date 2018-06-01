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

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("area");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Historic and Estimated Worldwide Population Growth by Region");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: Wikipedia.org");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] {"1750", "1800", "1850", "1900", "1950", "1999", "2050" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        xAxis.setTickmarkPlacement("on");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Billions");
        yAxis.setLabels(new HILabels());
        yAxis.getLabels().setFormatter(new HIFunction(
                f -> { return String.valueOf((Double) f.getProperty("value") / 1000); },
                new String[] {"value"}
        ));
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setSplit(true);
        tooltip.setValueSuffix(" millions");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setArea(new HIArea());
        plotOptions.getArea().setStacking("normal");
        plotOptions.getArea().setLineColor(HIColor.initWithHexValue("666666"));
        plotOptions.getArea().setLineWidth(1);
        plotOptions.getArea().setMarker(new HIMarker());
        plotOptions.getArea().getMarker().setLineWidth(1);
        plotOptions.getArea().getMarker().setLineColor(HIColor.initWithHexValue("666666"));
        options.setPlotOptions(plotOptions);

        HIArea series1 = new HIArea();
        series1.setName("Asia");
        Number[] series1_data = new Number[] {502, 635, 809, 947, 1402, 3634, 5268};
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
        HIArea series2 = new HIArea();
        series2.setName("Africa");
        Number[] series2_data = new Number[] {106, 107, 111, 133, 221, 767, 1766};
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
        HIArea series3 = new HIArea();
        series3.setName("Europe");
        Number[] series3_data = new Number[] {163, 203, 276, 408, 547, 729, 628};
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));
        HIArea series4 = new HIArea();
        series4.setName("America");
        Number[] series4_data = new Number[] {18, 31, 54, 156, 339, 818, 1201};
        series4.setData(new ArrayList<>(Arrays.asList(series4_data)));
        HIArea series5 = new HIArea();
        series5.setName("Oceania");
        Number[] series5_data = new Number[] {2, 2, 2, 6, 13, 30, 46};
        series5.setData(new ArrayList<>(Arrays.asList(series5_data)));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3, series4, series5)));

        chartView.setOptions(options);
    }
}


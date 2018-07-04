package com.highcharts.DevGround.example;

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

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Average fruit consumption during one week");
        options.setTitle(title);

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setX(150);
        legend.setY(150);
        legend.setFloating(true);
        legend.setBorderWidth(1);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        options.setLegend(legend);

        HIXAxis xaxis = new HIXAxis();
        String[] categories = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
        HIPlotBands plotband = new HIPlotBands();
        plotband.setFrom(4.5);
        plotband.setTo(6.5);
        plotband.setColor(HIColor.initWithRGBA(68, 170, 213, 2));
        xaxis.setPlotBands(new ArrayList<>(Arrays.asList(plotband)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Fruit unit");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        tooltip.setValueSuffix(" units");
        options.setTooltip(tooltip);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setAreaspline(new HIAreaspline());
        plotOptions.getAreaspline().setFillOpacity(0.5);
        options.setPlotOptions(plotOptions);

        HIAreaspline areaspline1 = new HIAreaspline();
        areaspline1.setName("John");
        Number[] areaspline1Data = new Number[] {3, 4, 3, 5, 4, 10, 12 };
        areaspline1.setData(new ArrayList<>(Arrays.asList(areaspline1Data)));

        HIAreaspline areaspline2 = new HIAreaspline();
        areaspline2.setName("Jane");
        Number[] areaspline2Data = new Number[] { 1, 3, 4, 3, 3, 5, 4 };
        areaspline2.setData(new ArrayList<>(Arrays.asList(areaspline2Data)));

        options.setSeries(new ArrayList<>(Arrays.asList(areaspline1, areaspline2)));

        chartView.options = options;
    }
}






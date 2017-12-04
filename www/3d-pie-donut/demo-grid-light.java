package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "pie";
        chart.options3d = new HIOptions3d();
        chart.options3d.enabled = true;
        chart.options3d.alpha = 45;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Contents of Highsoft's weekly fruit delivery";
        options.title = title;

        HISubtitle subtitle = new HISubtitle();
        subtitle.text = "3D donut in Highcharts";
        options.subtitle = subtitle;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.pie = new HIPie();
        plotOptions.pie.innerSize = 100;
        plotOptions.pie.depth = 45;
        options.plotOptions = plotOptions;

        HIPie series1 = new HIPie();
        series1.name = "Delivered amount";
        Object[] object1 = new Object[] { "Bananas", 8};
        Object[] object2 = new Object[] { "Mixed nuts", 1};
        Object[] object3 = new Object[] { "Kiwi", 3 };
        Object[] object4 = new Object[] { "Oranges", 6 };
        Object[] object5 = new Object[] { "Apples", 8 };
        Object[] object6 = new Object[] { "Pears", 4 };
        Object[] object7 = new Object[] { "Clementines", 4 };
        Object[] object8 = new Object[] { "Reddish (bag)", 1 };
        Object[] object9 = new Object[] { "Grapes (bunch)", 1 };
        Object[] object10 = new Object[] { "Kiwi", 3 };
        Object[] object11 = new Object[] { "Kiwi", 3 };
        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11));
        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}


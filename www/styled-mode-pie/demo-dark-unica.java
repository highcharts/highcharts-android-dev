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

        chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();
        
	HIChart chart = new HIChart();
	chart.type = "pie";
	options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Pie point CSS";
        options.title = title;

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
        options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

        HIPie series1 = new HIPie();
        series1.allowPointSelect = true;
        String[] keys = new String[] { "name", "y", "selected", "sliced" };
        series1.keys = new ArrayList<>(Arrays.asList(keys));
        series1.showInLegend = true;

        Object[] object1 = new Object[] { "Apples", 29.9, false };
        Object[] object2 = new Object[] { "Pears", 71.5, false };
        Object[] object3 = new Object[] { "Oranges", 106.4, false };
        Object[] object4 = new Object[] { "Plums", 129.2, false };
        Object[] object5 = new Object[] { "Bananas", 144.0, false };
        Object[] object6 = new Object[] { "Peaches", 176.0, false };
        Object[] object7 = new Object[] { "Prunes", 135.6, true, true };
        Object[] object8 = new Object[] { "Avocados", 148.5, false };

        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8));
        
        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}


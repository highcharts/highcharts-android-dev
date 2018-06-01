package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    private Number[] data = new Number[] {
            3.5, 3, 3.2, 3.1, 3.6, 3.9, 3.4, 3.4, 2.9, 3.1, 3.7, 3.4, 3, 3, 4,
            4.4, 3.9, 3.5, 3.8, 3.8, 3.4, 3.7, 3.6, 3.3, 3.4, 3, 3.4, 3.5, 3.4, 3.2,
            3.1, 3.4, 4.1, 4.2, 3.1, 3.2, 3.5, 3.6, 3, 3.4, 3.5, 2.3, 3.2, 3.5, 3.8, 3,
            3.8, 3.2, 3.7, 3.3, 3.2, 3.2, 3.1, 2.3, 2.8, 2.8, 3.3, 2.4, 2.9, 2.7, 2, 3,
            2.2, 2.9, 2.9, 3.1, 3, 2.7, 2.2, 2.5, 3.2, 2.8, 2.5, 2.8, 2.9, 3, 2.8, 3,
            2.9, 2.6, 2.4, 2.4, 2.7, 2.7, 3, 3.4, 3.1, 2.3, 3, 2.5, 2.6, 3, 2.6, 2.3,
            2.7, 3, 2.9, 2.9, 2.5, 2.8, 3.3, 2.7, 3, 2.9, 3, 3, 2.5, 2.9, 2.5, 3.6,
            3.2, 2.7, 3, 2.5, 2.8, 3.2, 3, 3.8, 2.6, 2.2, 3.2, 2.8, 2.8, 2.7, 3.3, 3.2,
            2.8, 3, 2.8, 3, 2.8, 3.8, 2.8, 2.8, 2.6, 3, 3.4, 3.1, 3, 3.1, 3.1, 3.1, 2.7,
            3.2, 3.3, 3, 2.5, 3, 3.4, 3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";        
	chartView.plugins = new ArrayList<String>(){{add("histogram-bellcurve");}};
	
        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("bellcurve");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Bell curve");
        options.setTitle(title);

        HIXAxis xaxis1 = new HIXAxis();
        xaxis1.setTitle(new HITitle());
        xaxis1.getTitle().setText("Data");

        HIXAxis xaxis2 = new HIXAxis();
        xaxis2.setTitle(new HITitle());
        xaxis2.getTitle().setText("Bell curve");
        xaxis2.setOpposite(true);

        options.setXAxis(new ArrayList<>(Arrays.asList(xaxis1, xaxis2)));

        HIYAxis yaxis1 = new HIYAxis();
        yaxis1.setTitle(new HITitle());
        yaxis1.getTitle().setText("Data");

        HIYAxis yaxis2 = new HIYAxis();
        yaxis2.setTitle(new HITitle());
        yaxis2.getTitle().setText("Bell curve");
        yaxis2.setOpposite(true);

        options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

        HIBellcurve bellcurve = new HIBellcurve();
        bellcurve.setName("Bell curve");
        bellcurve.setXAxis(1);
        bellcurve.setYAxis(1);
        bellcurve.setBaseSeries(1);
        bellcurve.setZIndex(-1);

        HIScatter scatter = new HIScatter();
        scatter.setName("Data");
        scatter.setData(new ArrayList<>(Arrays.asList(this.data)));
        scatter.setMarker(new HIMarker());
        scatter.getMarker().setRadius(1.5);

        options.setSeries(new ArrayList<>(Arrays.asList(bellcurve, scatter)));

        chartView.setOptions(options);
    }
}

package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
        
        chartView.theme = "grid-light";

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Scatter plot with regression line");
        options.setTitle(title);

        HIXAxis xaxis = new HIXAxis();
        xaxis.setMin(-0.5);
        xaxis.setMax(5.5);
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setMin(0);
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HILine line = new HILine();
        line.setName("Regression Line");
        Number[][] lineData = new Number[][] { {0, 1.11}, {5, 4.51} };
        line.setData(new ArrayList<>(Arrays.asList(lineData)));
        line.setMarker(new HIMarker());
        line.getMarker().setEnabled(false);
        HIStates state = new HIStates();
        state.setHover(new HIHover());
        state.getHover().setLineWidth(0);
        line.setStates(state);
        line.setEnableMouseTracking(false);

        HIScatter scatter = new HIScatter();
        scatter.setName("Observations");
        Number[] scatterData = new Number[] { 1, 1.5, 2.8, 3.5, 3.9, 4.2 };
        scatter.setData(new ArrayList<>(Arrays.asList(scatterData)));
        scatter.setMarker(new HIMarker());
        scatter.getMarker().setRadius(4);

        options.setSeries(new ArrayList<>(Arrays.asList(line, scatter)));

        chartView.setOptions(options);
    }
}

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

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Logarithmic axis demo");
        options.setTitle(title);
        
        HIXAxis xaxis = new HIXAxis();
        xaxis.setTickInterval(1);
        options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

        HIYAxis yaxis = new HIYAxis();
        yaxis.setType("logarithmic");
        yaxis.setMinorTickInterval(0.1);
        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HITooltip tooltip = new HITooltip();
        tooltip.setHeaderFormat("<b>{series.name}</b><br />");
        tooltip.setPointFormat("x = {point.x}, y = {point.y}");
        options.setTooltip(tooltip);

        HILine line1 = new HILine();
        line1.setPointStart(1);
        line1.setData(new ArrayList<>(Arrays.asList(1, 2, 4, 8, 16, 32, 64, 128, 256, 512)));
        
        options.setSeries(new ArrayList<>(Collections.singletonList(line1)));
        
        chartView.setOptions(options);
    }
}

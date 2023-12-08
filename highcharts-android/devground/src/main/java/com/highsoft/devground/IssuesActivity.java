package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;

public class IssuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        TextView loadingView = findViewById(R.id.loading);
        Button btnTest = findViewById(R.id.btnTest);

        HIChartView chartView = findViewById(R.id.chartview1);
        HIOptions options = new HIOptions();

        HILine series1 = new HILine();
        HIData data = new HIData();
        data.setY(71.5);
        data.setColor(HIColor.initWithName("blue"));
        series1.setData(new ArrayList<>(Arrays.asList(49.9, data, 106.4, 129.2, 144, 176, 135.6)));
        series1.setColor(HIColor.initWithName("yellow"));
        HILine series2 = new HILine();
        series2.setData(new ArrayList<>(Arrays.asList(148.5, 216.4, 194.1, 95.6, 54.4, 68.9)));
        series2.setColor(HIColor.initWithName("red"));

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);
    }
}

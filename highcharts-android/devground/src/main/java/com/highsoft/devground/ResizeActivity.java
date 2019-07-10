package com.highsoft.devground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;

public class ResizeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resize);
        HIChartView chart = findViewById(R.id.hc);
        HIOptions options = new HIOptions();
        HISeries series = new HISeries();
        series.setData(new ArrayList<>(Arrays.asList(5,6,2,3,6,3,5,6)));
        chart.setOptions(options);
    }
}

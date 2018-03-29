package com.highsoft.devground;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.highsoft.highcharts.Common.HIChartsClasses.HIAnnotations;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Core.HIChartView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class IssuesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        HISpline spline = new HISpline();
        spline.data = new ArrayList<>(Arrays.asList(5,7,9,10,4,51));

        HIAnnotations annotations = new HIAnnotations();
        HILabels labels = new HILabels();
        labels.point = new HIPoint();
        labels.point.yAxis = 0;
        labels.point.y = 7;
        labels.text = "Haha";

        annotations.labels = new ArrayList<>(Collections.singletonList(labels));
        options.annotations = new ArrayList<>(Collections.singletonList(annotations));
        options.series = new ArrayList<>(Collections.singletonList(spline));
        chartView.options = options;
    }

}

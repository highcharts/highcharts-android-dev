package com.highsoft.devground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HIStackLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
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
        series.setData(new ArrayList<>(Arrays.asList(5, 6, 2, 3, 6, 3, 5, 6)));
        chart.setOptions(options);

        HIStackLabels hiStackLabels = new HIStackLabels();
        hiStackLabels.setEnabled(true);
        hiStackLabels.setRotation(0);
        hiStackLabels.setBackgroundColor(HIColor.initWithRGBA(255, 0, 0, 0));
        hiStackLabels.setBorderRadius(4);
        hiStackLabels.setBorderColor(HIColor.initWithHexValue("e0e0e0"));
        hiStackLabels.setAlign("center");
        hiStackLabels.setVerticalAlign("center");
        hiStackLabels.setAllowOverlap(false);
        hiStackLabels.setStyle(new HICSSObject());
        hiStackLabels.getStyle().setTextOutline("none");
        hiStackLabels.setOverflow("none");
        hiStackLabels.setAllowOverlap(false);
        hiStackLabels.setCrop(true);
        hiStackLabels.setTextAlign("center");
        hiStackLabels.setY(-5);
        hiStackLabels.setBorderWidth(1);

//        final HIYAxis hiyAxis = new HIYAxis();
//        hiyAxis.setTitle(new HITitle());
//        hiyAxis.getTitle().setText("");
//        hiyAxis.setTickWidth(0);
//        hiyAxis.setGridLineWidth(0);
//        hiyAxis.setStackLabels(hiStackLabels);
//        hiyAxis.setLabels(new HILabels());
//
//        HIDataLabels labels = new HIDataLabels();
//        labels.setEnabled(false);
//        labels.setRotation(0);
//        labels.setBackgroundColor(HIColor.initWithRGBA(255, 0, 0, 0));
//        labels.setBorderRadius(4);
//        labels.setBorderColor(HIColor.initWithHexValue("e0e0e0"));
//        labels.setAlign("center");
//        labels.setPadding(5);
//        labels.setAllowOverlap(false);
//        labels.setY(-10);
//        labels.setInside(false);
//        labels.setBorderWidth(1);
//
//        ArrayList<HIDataLabels> labelsArrayList = new ArrayList<>();
//        labelsArrayList.add(labels);
//
//        HIColumn hiColumn = new HIColumn();
//        hiColumn.setName(model.getName());
//        hiColumn.setDataLabels(labelsArrayList);
//        hiColumn.setBorderColor(HIColor.initWithRGBA(255, 0, 0, 0));
//        hiColumn.setColor(HIColor.initWithHexValue(model.getColor().replace("#", "")));
//
//        ArrayList<Float> yAxis = new ArrayList<>(model.getData());
//
//        hiColumn.setData(yAxis);
//        series.add(hiColumn);
    }
}

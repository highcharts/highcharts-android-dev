package com.highsoft.devground;

import android.os.Bundle;
import android.support.annotation.ArrayRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HINetworkgraph;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPie;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HINetworkgraph networkgraph = new HINetworkgraph();
        ArrayList<HIDataLabels> dataLabelsList = new ArrayList<>();
        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.setEnabled(true);
        networkgraph.setDataLabels(dataLabelsList);
        options.setSeries(new ArrayList<>(Collections.singletonList(networkgraph)));

        HIColumn series = new HIColumn();
        series.setData(new ArrayList<>(Arrays.asList(100000312,6,4,7,12,6,3)));
        HISpline series2 = new HISpline();
        series2.setData(new ArrayList<>(Arrays.asList(1,5,5,6,7,8,8)));
        ArrayList<HISeries> seriesArray = new ArrayList<>();
        seriesArray.add(series);
        seriesArray.add(series2);
        options.setSeries(seriesArray);

        HIDataLabels hiDataLabels = new HIDataLabels();
        hiDataLabels.setEnabled(true);
        HIFunction lebelFormatter = new HIFunction("function() { if ( this.point.y >= 10000000 ){ return Highcharts.numberFormat( this.point.y/10000000, 0) + 'C';}else if ( this.point.y >= 100000 ){ return Highcharts.numberFormat( this.point.y/100000, 0) + 'L';}else if ( this.point.y >= 1000 ){ return Highcharts.numberFormat( this.point.y/1000, 0) + 'K';}else if ( this.point.y < 1 && this.point.y > 0){return Highcharts.numberFormat(this.point.y,2);}return Highcharts.numberFormat(this.point.y,0);}");
        hiDataLabels.setFormatter(lebelFormatter);
        hiDataLabels.setColor(HIColor.initWithName("red"));
        series.setDataLabels(new ArrayList<>(Collections.singletonList(hiDataLabels)));

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("This is very long tooltip which we need to wrap on your chart for the pretty look");
        HICSSObject style = new HICSSObject();
        style.setWidth(50);
        tooltip.setStyle(style);
        options.setTooltip(tooltip);
//        series.setTooltip(tooltip);

        final double[] plotDim = {0.0, 0.0};
        HIChart chart = new HIChart();
        chart.setEvents(new HIEvents());
        chart.getEvents().setRender(new HIFunction(
                f -> {
                    plotDim[0] = (double) f.getProperty("plotHeight");
                    plotDim[1] = (double) f.getProperty("plotWidth");
                    System.out.println("plotHeight: " + plotDim[0] + " plotWidth: " + plotDim[1]);
                },
                new String[] { "plotWidth", "plotHeight"}
        ));
        options.setChart(chart);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            HISeries newSeries = new HISeries();
            newSeries.setData(new ArrayList<>(Arrays.asList(15,5,3,1,5,6,1,2)));
            HIOptions options1 = options;
            options1.setSeries(new ArrayList<>(Collections.singletonList(newSeries)));
            chartView.update(options1, false, true);
//            options.setSeries(new ArrayList<>(Collections.singletonList(newSeries)));
//            chartView.update(options1, true, true);
        });

//        chart.setBackgroundColor(HIColor.initWithRGBA(70, 130, 180, 0.6));
        chartView.setOptions(options);
    }
}

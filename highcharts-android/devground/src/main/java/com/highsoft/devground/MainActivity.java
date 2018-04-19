package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.highsoft.highcharts.Common.HIChartsClasses.HIBar;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotBands;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIZones;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateTest();
    }

    public void updateTest(){
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setStyle(new HIStyle());
        title.getStyle().setFontSize("40px");
        title.setText("Update feature test");
        options.setTitle(title);

        HIChart hiChart = new HIChart();
        hiChart.setType("column");
        hiChart.setBackgroundColor(HIColor.initWithName("grey"));
        hiChart.setBorderWidth(10);
        hiChart.setBorderColor(HIColor.initWithName("lightblue"));
//        hiChart.setSpacing(new ArrayList<>(Arrays.asList(30,30,100,30)));
//        options.hiChart = hiChart;
        options.setChart(hiChart);

        HISeries series = new HISeries();
        series.setData(new ArrayList<>(Arrays.asList(5,8,10,2,5,1,7,4)));
        HISeries series1 = new HISeries();
        series1.setData(new ArrayList<>(Arrays.asList(5,12,14,6,1,8,4,6)));

//        options.series = new ArrayList<>(Arrays.asList(series, series1));
        options.setSeries(new ArrayList<>(Arrays.asList(series, series1)));
        options.setColors(new ArrayList<>(Arrays.asList(HIColor.initWithName("red"), HIColor.initWithName("yellow"))));


        ArrayList<HIXAxis> xaxisList = new ArrayList<>();
        HIXAxis hixAxis = new HIXAxis();
        hixAxis.setType("linear");
        xaxisList.add(hixAxis);
        options.setXAxis(xaxisList);
        chartView.setOptions(options);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chartView.getOptions().getChart().setType("spline");
                chartView.getOptions().getChart().setBackgroundColor(HIColor.initWithName("lightblue"));

//                HISeries newSeries = chartView.getOptions().getSeries().get(0);
////                newSeries.setData(new ArrayList<>(Arrays.asList(5,19,2,15,18,10,8)));
//                ArrayList firstSeriesData = chartView.getOptions().getSeries().get(0).getData();
//                firstSeriesData.set(0, 10);
//                newSeries.setData(firstSeriesData);
//                chartView.getOptions().setSeries(new ArrayList<>(Arrays.asList(newSeries, series1)));

                //spacing bugged
//                chartView.getOptions().getChart().setSpacing(new ArrayList<>(Arrays.asList(5,5,10,5)));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                chartView.options.hiChart.setBorderWidth(50);

                //-- full option update still needs reload
                HIOptions options1 = chartView.options;
                options1.getChart().setBackgroundColor(HIColor.initWithName("blue"));
//                chartView.setOptions(options1);
//                chartView.reload();

                //-- update of first options children
//                HITitle title1 = new HITitle();
//                title1.setText("NEW TITLE");
//                chartView.getOptions().setTitle(title1);

                //-- update first children which is an array; testing in progress...

                HIXAxis xAxisNew = chartView.getOptions().getXAxis().get(0);
                if(xAxisNew.getType().equalsIgnoreCase("linear"))
                    xAxisNew.setType("datetime");
                else xAxisNew.setType("linear");
                xaxisList.set(0, xAxisNew);
                chartView.getOptions().setXAxis(xaxisList);

                //-- update first children wchich is array update whole array!
//                HISeries series1 = new HISeries();
//                series1.data = new ArrayList<>(Arrays.asList(6,9,10,11,13,8,9,6));
//                HISeries series2 = new HISeries();
//                series2.data = new ArrayList<>(Arrays.asList(9,1,2,2,9,8,5,4));
//                chartView.getOptions().setSeries(new ArrayList<>(Arrays.asList(series1,series2)));
            }
        });
    }
}

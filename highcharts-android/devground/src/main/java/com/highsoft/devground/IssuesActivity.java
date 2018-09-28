package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.highsoft.highcharts.Common.HIChartsClasses.HIAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIExporting;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIScrollablePlotArea;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.HashMap;

public class IssuesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        Button btn = findViewById(R.id.btn);

        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

//        HIChart chart = new HIChart();
//        HIScrollablePlotArea scrollablePlotArea = new HIScrollablePlotArea();
//        scrollablePlotArea.setMinWidth(1000);
//        scrollablePlotArea.setScrollPositionX(1);
//        chart.setScrollablePlotArea(scrollablePlotArea);
//        options.setChart(chart);

        ArrayList<HIYAxis> yaxis = new ArrayList<>();
        yaxis.add(new HIYAxis());
        options.setYAxis(yaxis);

        ArrayList<HIXAxis> xAxes = new ArrayList<>();
        HIXAxis hixAxis = new HIXAxis();
        xAxes.add(hixAxis);
        options.setXAxis(xAxes);

        HITooltip tooltip = new HITooltip();
        //general formatting
        tooltip.setBorderWidth(0);
        tooltip.setShadow(false);
        tooltip.setBorderColor(HIColor.initWithName("white"));
        //position of the tooltip
        tooltip.setPositioner(new HIFunction("function () { return { x: 100, y: 100 }; }"));
        //styling
        HIStyle tooltipStyle = new HIStyle();
        tooltipStyle.setFontFamily("serif");
        tooltipStyle.setColor("red");
        tooltip.setStyle(tooltipStyle);
        //text formatting, two lines
        tooltip.setFormatter(new HIFunction(f -> {
            String txt = f.getProperty("series.name") + "<br>" + "Value: " + f.getProperty("x");
            return txt;
        }, new String[] {"series.name", "x"}));
        options.setTooltip(tooltip);

        ArrayList<Number> data1 = new ArrayList<>();
        data1.add(2);
        data1.add(1);
        data1.add(5);
        data1.add(4);
        HILine line1 = new HILine();
        line1.setData(data1);


        options.setSeries(new ArrayList<>());
        options.getSeries().add(line1);
        chartView.setOptions(options);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HILabels yLablesCompare = new HILabels();
                HIYAxis yaxis2 = new HIYAxis();
                yaxis2.setOpposite(true);
                yaxis2.setLabels(yLablesCompare);
                options.getYAxis().add(yaxis2);

                ArrayList<Number> data2 = new ArrayList<>();
                data2.add(4);
                data2.add(3);
                data2.add(2);
                data2.add(6);
                HILine line2 = new HILine();
                line2.setYAxis(0);
                line2.setData(data2);
                options.getSeries().add(line2);

                chartView.reload();
            }
        });


    }
}

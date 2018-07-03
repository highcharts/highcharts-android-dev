package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Formatted shared tooltip");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Click on chart to compare data");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setType("datetime");
        options.setXAxis(new ArrayList<>(Collections.singletonList(xAxis)));

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Relative performance");
        yAxis.setLabels(new HILabels());
        yAxis.getLabels().setFormat("{value:.,0f}%");
        yAxis.setShowFirstLabel(false);

        options.setYAxis(new ArrayList<>(Collections.singletonList(yAxis)));

        // For shared tooltip only pure JS formatter is applicable
        HITooltip tooltip = new HITooltip();
        String function = "function() { "
                                + "var s = '<b>' + Highcharts.dateFormat( '%e %b %Y', new Date(this.x)) + '</b>';"
                                + "var percent = '';"
                                + "for(var key in this.points) {"
                                +   "s += '<br/><b>' + this.points[key].series.name + '</b> ' + this.points[key].point.actualValue;"
                                +   "percent = ' ' + Math.round(this.points[key].y * 100) / 100 + '%'; "
                                +   "s += '  +(' + percent + ')';"
                                +   "} return s }";
        tooltip.setFormatter(new HIFunction(function));
        tooltip.setShared(true);
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSpline(new HISpline());
        plotOptions.getSpline().setPointIntervalUnit("month");
        plotOptions.getSpline().setPointStart(Date.UTC(118,5,9,0,0,0));
        options.setPlotOptions(plotOptions);

        HISpline bankSeries1 = new HISpline();
        bankSeries1.setName("Bank A");
        bankSeries1.setData(generateRandomData());
        bankSeries1.setLineWidth(4);
        bankSeries1.setMarker(new HIMarker());
        bankSeries1.getMarker().setRadius(4);

        HISpline bankSeries2 = new HISpline();
        bankSeries2.setName("Bank B");
        bankSeries2.setData(generateRandomData());

        options.setSeries(new ArrayList<>(Arrays.asList(bankSeries1, bankSeries2)));

        chartView.setOptions(options);
    }

    /**
     * This method is just for demo purposes.
     * You can pass as an argument your data (e.g. from file)
     * create indexes dynamically by iterating over data.
     *
     * Values put under the "y" key are the relative performance in percents,
     * actual value is not used to create the chart but it is seen in the tooltip
     *
     * @return generated random data with relative performance
     */
    ArrayList<HashMap<String, Object>> generateRandomData(){
        ArrayList<HashMap<String, Object>> data = new ArrayList<>();
        HashMap<String, Object> firstPoint = new HashMap<>();
        Random r = new Random();
        int firstValue = (r.nextInt((20000 - 10000) + 1 ) + 10000);
        firstPoint.put("y", 0.0);
        firstPoint.put("actualValue", firstValue);
        data.add(firstPoint);
        for(int i = 0 ; i<30; i++){
            HashMap<String, Object> singlePoint = new HashMap<>();
            int actualValue = (r.nextInt((20000 - 10000) + 1 ) + 10000);
            double indexedValue = (double)actualValue/(double)firstValue;
            singlePoint.put("y", indexedValue);
            singlePoint.put("actualValue", actualValue);
            data.add(singlePoint);
        }
        return data;
    }
}
package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.HIAreaspline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIBackground;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HIColumnrange;
import com.highsoft.highcharts.Common.HIChartsClasses.HICredits;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIGauge;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPane;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotBands;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStackLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIStyle;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Average fruit consumption during one week");
        options.setTitle(title);

        HILegend legend = new HILegend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setX(150);
        legend.setY(150);
        legend.setFloating(true);
        legend.setBorderWidth(1);
        legend.setBackgroundColor(HIColor.initWithHexValue("FFFFFF"));
        options.setLegend(legend);

        HIXAxis xaxis = new HIXAxis();
        String[] categories = new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
        HIPlotBands plotband = new HIPlotBands();
        plotband.setFrom(4.5);
        plotband.setTo(6.5);
        plotband.setColor(HIColor.initWithRGBA(68, 170, 213, 2));
        xaxis.setPlotBands(new ArrayList<>(Arrays.asList(plotband)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        HIYAxis yaxis = new HIYAxis();
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Fruit unit");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        tooltip.setValueSuffix(" units");
        options.setTooltip(tooltip);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setAreaspline(new HIAreaspline());
        plotOptions.getAreaspline().setFillOpacity(0.5);
        options.setPlotOptions(plotOptions);

        HIAreaspline areaspline1 = new HIAreaspline();
        areaspline1.setName("John");
        Number[] areaspline1Data = new Number[] {3, 4, 3, 5, 4, 10, 12 };
        areaspline1.setData(new ArrayList<>(Arrays.asList(areaspline1Data)));

        HIAreaspline areaspline2 = new HIAreaspline();
        areaspline2.setName("Jane");
        Number[] areaspline2Data = new Number[] { 1, 3, 4, 3, 3, 5, 4 };
        areaspline2.setData(new ArrayList<>(Arrays.asList(areaspline2Data)));

        options.setSeries(new ArrayList<>(Arrays.asList(areaspline1, areaspline2)));

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
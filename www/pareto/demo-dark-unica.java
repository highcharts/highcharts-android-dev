package com.highcharts.DevGround.frameworktests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

                chartView.plugins = new ArrayList<>(Arrays.asList("pareto"));
		chartView.theme = "dark-unica";

                HIOptions options = new HIOptions();

                HIChart chart = new HIChart();
                chart.type = "column";
                chart.renderTo = "container";
                options.chart = chart;

                HITitle title = new HITitle();
                title.text = "Restaurants Complaints";
                options.title = title;

                HIXAxis xAxis = new HIXAxis();
                String[] categoriesList = new String[] { "Overpriced", "Small portions", "Wait time", "Food is tasteless", "No atmosphere", "Not clean", "Too noisy", "Unfriendly staff" };
                xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
                options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

                HIYAxis yaxis1 = new HIYAxis();
                yaxis1.title = new HITitle();
                yaxis1.title.text = "";

                HIYAxis yaxis2 = new HIYAxis();
                yaxis2.title = new HITitle();
                yaxis2.title.text = "";
                yaxis2.minPadding = 0;
                yaxis2.maxPadding = 0;
                yaxis2.max = 100;
                yaxis2.min = 0;
                yaxis2.opposite = true;
                yaxis2.labels = new HILabels();
                yaxis2.labels.format = "{value}%";

                options.yAxis = new ArrayList<>(Arrays.asList(yaxis1, yaxis2));

                HIPareto series1 = new HIPareto();
                series1.type = "pareto";
                series1.name = "Pareto";
                series1.yAxis = 1;
                series1.zIndex = 10;

                HIColumn series2 = new HIColumn();
                series2.name = "Complaints";
                series2.type = "column";
                series2.zIndex = 2;
                Number[] series2_data = new Number[] {755, 222, 151, 86, 72, 51, 36, 10};
                series2.data = new ArrayList<>(Arrays.asList(series2_data));

                options.series = new ArrayList<>(Arrays.asList(series1, series2));


                chartView.options = options;
        }
}


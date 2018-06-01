package com.highcharts.DevGround.frameworktests;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                HIChartView chartView = findViewById(R.id.hc);

                chartView.plugins = new ArrayList<>(Arrays.asList("pareto"));
		chartView.theme = "grid-light";

                HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("column");
		chart.setRenderTo("container");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Restaurants Complaints");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		String[] categoriesList = new String[] { "Overpriced", "Small portions", "Wait time", "Food is tasteless", "No atmosphere", "Not clean", "Too noisy", "Unfriendly staff" };
		xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yaxis1 = new HIYAxis();
		yaxis1.setTitle(new HITitle());
		yaxis1.getTitle().setText("");

		HIYAxis yaxis2 = new HIYAxis();
		yaxis2.setTitle(new HITitle());
		yaxis2.getTitle().setText("");
		yaxis2.setMinPadding(0);
		yaxis2.setMaxPadding(0);
		yaxis2.setMax(100);
		yaxis2.setMin(0);
		yaxis2.setOpposite(true);
		yaxis2.setLabels(new HILabels());
		yaxis2.getLabels().setFormat("{value}%");

		options.setYAxis(new ArrayList<>(Arrays.asList(yaxis1, yaxis2)));

		HIPareto series1 = new HIPareto();
		series1.setName("Pareto");
		series1.setYAxis(1);
		series1.setZIndex(10);
		series1.setBaseSeries(1);

		HIColumn series2 = new HIColumn();
		series2.setName("Complaints");
		series2.setZIndex(2);
		Number[] series2_data = new Number[] {755, 222, 151, 86, 72, 51, 36, 10};
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

		chartView.setOptions(options);
        }
}


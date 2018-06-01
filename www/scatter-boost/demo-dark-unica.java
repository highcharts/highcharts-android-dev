package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);
		chartView.plugins = new ArrayList<>(Arrays.asList("boost"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setZoomType("xy");
		chart.setHeight("100%");
		chart.setType("scatter");
		options.setChart(chart);

		HIBoost boost = new HIBoost();
		boost.setUseGPUTranslations(true);
		options.setBoost(boost);

		HITitle title = new HITitle();
		title.setText("Scatter chart with 1000 points");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setMin(0);
		xAxis.setMax(100);
		xAxis.setGridLineWidth(1);
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setTitle(new HITitle());
		yAxis.setMin(0);
		yAxis.setMax(100);
		yAxis.setMinPadding(0);
		yAxis.setMaxPadding(0);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIScatter series1 = new HIScatter();
		series1.setColor(HIColor.initWithRGBA(152, 0, 67, 0.1));
		Number[][] data = this.randomData();
		series1.setData(new ArrayList<>(Arrays.asList(data)));
		series1.setMarker(new HIMarker());
		series1.getMarker().setRadius(2);
		series1.setTooltip(new HITooltip());
		series1.getTooltip().setFollowPointer(false);
		series1.getTooltip().setPointFormat("[{point.x:.1f}, {point.y:.1f}]");

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}

	private Number[][] randomData(){
		int n = 1000;
		Random r = new Random();
		Number[][] seriesdata = new Number[n][2];
		for(int i = 0; i < n ; i++){
		    for(int j = 0; j < 2 ; j++){
		        seriesdata[i][j] = r.nextInt(100)-1 / 1.0;
		    }
		}
	 	return seriesdata;
	}
}


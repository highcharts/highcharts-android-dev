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

		chartView.plugins = new ArrayList<>(Arrays.asList("funnel"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "pyramid";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Sales pyramid";
		title.x = -50;
		options.title = title;

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.pyramid = new HIPyramid();
		plotoptions.pyramid.dataLabels = new HIDataLabels();
		plotoptions.pyramid.dataLabels.enabled = true;
		plotoptions.pyramid.dataLabels.format = "<b>{point.name}</b> ({point.y:,.0f})";
		plotoptions.pyramid.dataLabels.color = HIColor.initWithName("black");
		plotoptions.pyramid.dataLabels.softConnector = true;
		String[] center = new String[] {"40%", "50%" };
		plotoptions.pyramid.center = new ArrayList<>(Arrays.asList(center));
		plotoptions.pyramid.width = "80%";
		options.plotOptions = plotoptions;

		HIPyramid series1 = new HIPyramid();
		series1.name = "Unique users";

		Object[] object1 = new Object[] { "Website visits", 15654 };
		Object[] object2 = new Object[] { "Downloads", 4064 };
		Object[] object3 = new Object[] { "Requested price list", 1987 };
		Object[] object4 = new Object[] { "Invoice sent", 976 };
		Object[] object5 = new Object[] { "Finalized", 846 };

		series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5));

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}


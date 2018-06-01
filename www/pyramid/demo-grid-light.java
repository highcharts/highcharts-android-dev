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
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Sales pyramid");
		title.setX(-50);
		options.setTitle(title);

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setPyramid(new HIPyramid());
		plotoptions.getPyramid().setDataLabels(new HIDataLabels());
		plotoptions.getPyramid().getDataLabels().setEnabled(true);
		plotoptions.getPyramid().getDataLabels().setFormat("<b>{point.name}</b> ({point.y:,.0f})");
		plotoptions.getPyramid().getDataLabels().setColor(HIColor.initWithName("black"));
		plotoptions.getPyramid().getDataLabels().setSoftConnector(1);
		String[] center = new String[] {"40%", "50%" };
		plotoptions.getPyramid().setCenter(new ArrayList<>(Arrays.asList(center)));
		plotoptions.getPyramid().setWidth("80%");
		options.setPlotOptions(plotoptions);

		HIPyramid series1 = new HIPyramid();
		series1.setName("Unique users");

		Object[] object1 = new Object[] { "Website visits", 15654 };
		Object[] object2 = new Object[] { "Downloads", 4064 };
		Object[] object3 = new Object[] { "Requested price list", 1987 };
		Object[] object4 = new Object[] { "Invoice sent", 976 };
		Object[] object5 = new Object[] { "Finalized", 846 };

		series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


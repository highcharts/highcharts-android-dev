package com.highcharts.DevGround.example;

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

		chartView.plugins = new ArrayList<>(Arrays.asList("variwide"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Labor Costs in Europe, 2016");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Source: <a href=\"http://ec.europa.eu/eurostat/web/labour-market/labour-costs/main-tables\">eurostat</a>");
		options.setSubtitle(subtitle);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("category");
		xAxis.setTitle(new HITitle());
		xAxis.getTitle().setText("Column widths are proportional to GDP");
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIVariwide series1 = new HIVariwide();
		series1.setName("Labor Costs");

		Object[] object1 = new Object[] { "Norway", 50.2, 335504 };
		Object[] object2 = new Object[] { "Denmark", 42, 277339 };
		Object[] object3 = new Object[] { "Belgium", 39.2, 421611 };
		Object[] object4 = new Object[] { "Sweden", 38, 462057 };
		Object[] object5 = new Object[] { "France", 35.6, 2228857 };
		Object[] object6 = new Object[] { "Netherlands", 34.3, 702641 };
		Object[] object7 = new Object[] { "Germany", 33.0, 3144050 };
		Object[] object8 = new Object[] { "Austria", 32.7, 349344 };
		Object[] object9 = new Object[] { "Ireland", 30.4, 275567 };
		Object[] object10 = new Object[] { "Italy", 27.8, 1672438 };
		Object[] object11 = new Object[] { "United Kingdom", 26.7, 2366911 };
		Object[] object12 = new Object[] { "Spain", 21.3, 1113851 };
		Object[] object13 = new Object[] { "Greece", 14.2, 175887 };
		Object[] object14 = new Object[] { "Portugal", 13.7, 184933 };
		Object[] object15 = new Object[] { "Czech Republic", 10.2, 176564 };
		Object[] object16 = new Object[] { "Poland", 8.6, 424269 };
		Object[] object17 = new Object[] { "Romania", 5.5, 424269 };
		Object[] object18 = new Object[] { "Finland", 33.2, 215615 };

		series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18)));
		series1.setDataLabels(new HIDataLabels());
		series1.getDataLabels().setEnabled(true);
		series1.getDataLabels().setFormat("€{point.y:.0f}");
		series1.setTooltip(new HITooltip());
		series1.getTooltip().setPointFormat("Labor Costs: <b>€ {point.y}/h</b><br>GDP: <b>€ {point.z} million</b><br>");
		series1.setColorByPoint(true);

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


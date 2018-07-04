package com.highsoft.highcharts.example;

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

		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Efficiency Optimization by Branch");
		options.setTitle(title);

		HIXAxis xAxis = new HIXAxis();
		String[] categoriesList = new String[] {"Seattle HQ", "San Francisco", "Tokyo" };
		xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis1 = new HIYAxis();
		yAxis1.setMin(0);
		yAxis1.setTitle(new HITitle());
		yAxis1.getTitle().setText("Employees");

		HIYAxis yAxis2 = new HIYAxis();
		yAxis2.setTitle(new HITitle());
		yAxis2.getTitle().setText("Profit (millions)");
		yAxis2.setOpposite(true);

		options.setYAxis(new ArrayList<HIYAxis>(Arrays.asList(yAxis1, yAxis2)));

		HILegend legend = new HILegend();
		legend.setShadow(false);
		options.setLegend(legend);

		HITooltip tooltip = new HITooltip();
		tooltip.setShared(true);
		options.setTooltip(tooltip);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setColumn(new HIColumn());
		plotOptions.getColumn().setGrouping(false);
		plotOptions.getColumn().setShadow(false);
		plotOptions.getColumn().setBorderWidth(0);
		options.setPlotOptions(plotOptions);

		HIColumn series1 = new HIColumn();
		series1.setName("Employees");
		series1.setColor(HIColor.initWithRGBA(165, 170, 217, 1));
		Number[] series1_data = new Number[] {150, 73, 20};
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
		series1.setPointPadding(0.3);
		series1.setPointPlacement(-0.2);
		HIColumn series2 = new HIColumn();
		series2.setName("Employees Optimized");
		series2.setColor(HIColor.initWithRGBA(126, 86, 134, 0.9));
		Number[] series2_data = new Number[] {140, 90, 40};
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));
		series2.setPointPadding(0.4);
		series2.setPointPlacement(-0.2);
		HIColumn series3 = new HIColumn();
		series3.setName("Profit");
		series3.setColor(HIColor.initWithRGBA(248, 161, 63, 1));
		Number[] series3_data = new Number[] {183.6, 178.8, 198.5};
		series3.setData(new ArrayList<>(Arrays.asList(series3_data)));
		series3.setTooltip(new HITooltip());
		series3.getTooltip().setValuePrefix("$");
		series3.getTooltip().setValueSuffix(" M");
		series3.setPointPadding(0.3);
		series3.setPointPlacement(0.2);
		series3.setYAxis(1);
		HIColumn series4 = new HIColumn();
		series4.setName("Profit Optimized");
		series4.setColor(HIColor.initWithRGBA(186, 60, 61, 0.9));
		Number[] series4_data = new Number[] {203.6, 198.8, 208.5};
		series4.setData(new ArrayList<>(Arrays.asList(series4_data)));
		series3.setTooltip(new HITooltip());
		series3.getTooltip().setValuePrefix("$");
		series3.getTooltip().setValueSuffix(" M");
		series4.setPointPadding(0.4);
		series4.setPointPlacement(0.2);
		series4.setYAxis(1);
		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3, series4)));

		chartView.options = options;
	}
}


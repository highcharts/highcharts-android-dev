package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIChartView chartView = findViewById(R.id.hc);

		chartView.theme = "grid-light";
		chartView.plugins = new ArrayList<>();
		chartView.plugins.add("venn");

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Relationship between Euler and Venn diagrams");
		options.setTitle(title);

		HITooltip tooltip = new HITooltip();
		tooltip.setHeaderFormat("<span style=\"color:{point.color}\">\u2022</span> <span style=\"font-size: 14px\"> {point.point.name}</span><br/>");
		tooltip.setPointFormat("{point.description}<br><span style=\"font-size: 10px\">Source: Wikipedia</span>");
		options.setTooltip(tooltip);

		HIVenn venn = new HIVenn();
		HIData data1 = new HIData();
		data1.setSets(new ArrayList<>(Collections.singletonList("A")));
		data1.setValue(4);
		data1.setName("Euler diagrams");
		data1.setDefinition("An Euler diagram is a diagrammatic means of representing sets and their relationships. Unlike Venn diagrams, which show all possible relations between different sets, the Euler diagram shows only relevant relationships.");
		HIData data2 = new HIData();
		data2.setSets(new ArrayList<>(Collections.singletonList("B")));
		data2.setValue(1);
		data2.setName("Venn diagrams");
		data2.setDefinition("In Venn diagrams the curves are overlapped in every possible way, showing all possible relations between the sets. They are thus a special case of Euler diagrams, which do not necessarily show all relations'");
		HIData data3 = new HIData();
		data3.setSets(new ArrayList<>(Arrays.asList("A", "B")));
		data3.setValue(1);
		venn.setData(new ArrayList<>(Arrays.asList(data1, data2, data3)));

		options.setSeries(new ArrayList<>(Collections.singletonList(venn)));

		chartView.setOptions(options);
	}
}


package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("streamgraph", "series-label", "annotations"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "streamgraph";
		chart.marginBottom = 30;
		chart.zoomType = "x";
		options.chart = chart;

		HIColor color1 = HIColor.initWithHexValue("2f7ed8");
		HIColor color2 = HIColor.initWithHexValue("0d233a");
		HIColor color3 = HIColor.initWithHexValue("8bbc21");
		HIColor color4 = HIColor.initWithHexValue("910000");
		HIColor color5 = HIColor.initWithHexValue("1aadce");

		HIColor color6 = HIColor.initWithRGBA(73, 41, 112, 0.2);
		HIColor color7 = HIColor.initWithRGBA(73, 41, 112, 0.1);

		HIColor color8 = HIColor.initWithHexValue("492970");
		HIColor color9 = HIColor.initWithHexValue("f28f43");
		HIColor color10 = HIColor.initWithHexValue("77a1e5");
		HIColor color11 = HIColor.initWithHexValue("c42525");
		HIColor color12 = HIColor.initWithHexValue("a6c96a");
		HIColor color13 = HIColor.initWithHexValue("2f7ed8");
		HIColor color14 = HIColor.initWithHexValue("0d233a");
		HIColor color15 = HIColor.initWithHexValue("910000");

		HIColor color16 = HIColor.initWithRGBA(139, 188, 33, 0.1);
		HIColor color17 = HIColor.initWithRGBA(139, 188, 33, 0.2);
		HIColor color18 = HIColor.initWithRGBA(139, 188, 33, 0.3);

		options.colors = new ArrayList<>(Arrays.asList(color1, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13, color14, color15, color16, color17, color18));

		HITitle title = new HITitle();
		title.text = "Winter Olympic Medal Wins";
		title.align = "left";
		title.floating = true;
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "Source: <a href=\"https://www.sports-reference.com/olympics/winter/1924/\">sports-reference.com</a>";
		subtitle.align = "left";
		subtitle.floating = true;
		subtitle.y = 30;
		options.subtitle = subtitle;

		HIXAxis xAxis = new HIXAxis();
		xAxis.maxPadding = 0;
		xAxis.type = "category";
		xAxis.crosshair = new HICrosshair();
		String[] categoriesList = new String[] { "", "1924 Chamonix", "1928 St. Moritz", "1932 Lake Placid", "1936 Garmisch-Partenkirchen", "1940 <i>Cancelled (Sapporo)</i>", "1944 <i>Cancelled (Cortina d\'Ampezzo)</i>", "1948 St. Moritz", "1952 Oslo", "1956 Cortina d\'Ampezzo", "1960 Squaw Valley", "1964 Innsbruck", "1968 Grenoble", "1972 Sapporo", "1976 Innsbruck", "1980 Lake Placid", "1984 Sarajevo", "1988 Calgary", "1992 Albertville", "1994 Lillehammer", "1998 Nagano", "2002 Salt Lake City", "2006 Turin", "2010 Vancouver", "2014 Sochi" };
		xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
		xAxis.labels = new HILabels();
		xAxis.labels.align = "left";
		xAxis.labels.reserveSpace = false;
		xAxis.labels.rotation = 270;
		xAxis.lineWidth = 0;
		xAxis.tickWidth = 0;
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.visible = false;
		yAxis.startOnTick = false;
		yAxis.endOnTick = false;
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HIAnnotations annotations = new HIAnnotations();

		HILabels label1 = new HILabels();
		label1.point = new HIPoint();
		label1.point.x = 5.5;
		label1.point.xAxis = 0;
		label1.point.y = 30;
		label1.point.yAxis = 0;
		label1.text = "Cancelled<br>during<br>World War II";

		HILabels label2 = new HILabels();
		label2.point = new HIPoint();
		label2.point.x = 18;
		label2.point.xAxis = 0;
		label2.point.y = 90;
		label2.point.yAxis = 0;
		label2.text = "Soviet Union fell,<br>Germany united";

		annotations.labels = new ArrayList<>(Arrays.asList(label1, label2));
		annotations.labelOptions = new HILabelOptions();
		annotations.labelOptions.backgroundColor = HIColor.initWithRGBA(255, 255, 255, 0.5);
		annotations.labelOptions.borderColor = HIColor.initWithName("silver");
		options.annotations = new ArrayList<>(Arrays.asList(annotations));

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.series = new HISeries();
		plotoptions.series.label = new HILabel();
		plotoptions.series.label.minFontSize = 5;
		plotoptions.series.label.maxFontSize = 15;
		plotoptions.series.label.style = new HIStyle();
		plotoptions.series.label.style.color = "rgba(255,255,255,0.75)";
		options.plotOptions = plotoptions;

		HIExporting exporting = new HIExporting();
		exporting.sourceWidth = 800;
		exporting.sourceHeight = 600;
		options.exporting = exporting;

		HIStreamgraph series1 = new HIStreamgraph();
		series1.name = "Finland";
		Number[] series1_data = new Number[] { 0, 11, 4, 3, 6, 0, 0, 6, 9, 7, 8, 10, 5, 5, 7, 9, 13, 7, 7, 6, 12, 7, 9, 5, 5 };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		HIStreamgraph series2 = new HIStreamgraph();
		series2.name = "Austria";
		Number[] series2_data = new Number[] { 0, 3, 4, 2, 4, 0, 0, 8, 8, 11, 6, 12, 11, 5, 6, 7, 1, 10, 21, 9, 17, 17, 23, 16, 17 };
		series2.data = new ArrayList<>(Arrays.asList(series2_data));

		HIStreamgraph series3 = new HIStreamgraph();
		series3.name = "Sweden";
		Number[] series3_data = new Number[] { 0, 2, 5, 3, 7, 0, 0, 10, 4, 10, 7, 7, 8, 4, 2, 4, 8, 6, 4, 3, 3, 7, 14, 11, 15 };
		series3.data = new ArrayList<>(Arrays.asList(series3_data));

		HIStreamgraph series4 = new HIStreamgraph();
		series4.name = "Norway";
		Number[] series4_data = new Number[] { 0, 17, 15, 10, 15, 0, 0, 10, 16, 4, 6, 15, 14, 12, 7, 10, 9, 5, 20, 26, 25, 25, 19, 23, 26 };
		series4.data = new ArrayList<>(Arrays.asList(series4_data));

		HIStreamgraph series5 = new HIStreamgraph();
		series5.name = "U.S.";
		Number[] series5_data = new Number[] { 0, 4, 6, 12, 4, 0, 0, 9, 11, 7, 10, 7, 7, 8, 10, 12, 8, 6, 11, 13, 13, 34, 25, 37, 28 };
		series5.data = new ArrayList<>(Arrays.asList(series5_data));

		HIStreamgraph series6 = new HIStreamgraph();
		series6.name = "East Germany";
		Number[] series6_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 14, 19, 23, 24, 25, 0, 0, 0, 0, 0, 0, 0 };
		series6.data = new ArrayList<>(Arrays.asList(series6_data));

		HIStreamgraph series7 = new HIStreamgraph();
		series7.name = "West Germany";
		Number[] series7_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 5, 10, 5, 4, 8, 0, 0, 0, 0, 0, 0, 0 };
		series7.data = new ArrayList<>(Arrays.asList(series7_data));

		HIStreamgraph series8 = new HIStreamgraph();
		series8.name = "Germany";
		Number[] series8_data = new Number[] { 0, 0, 1, 2, 6, 0, 0, 0, 7, 2, 8, 9, 0, 0, 0, 0, 0, 0, 26, 24, 29, 36, 29, 30, 19 };
		series8.data = new ArrayList<>(Arrays.asList(series8_data));

		HIStreamgraph series9 = new HIStreamgraph();
		series9.name = "Netherlands";
		Number[] series9_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, 2, 9, 9, 6, 4, 0, 7, 4, 4, 11, 8, 9, 8, 24 };
		series9.data = new ArrayList<>(Arrays.asList(series9_data));

		HIStreamgraph series10 = new HIStreamgraph();
		series10.name = "Italy";
		Number[] series10_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 1, 4, 4, 5, 4, 2, 2, 5, 14, 20, 10, 13, 11, 5, 8 };
		series10.data = new ArrayList<>(Arrays.asList(series10_data));

		HIStreamgraph series11 = new HIStreamgraph();
		series11.name = "Canada";
		Number[] series11_data = new Number[] { 0, 1, 1, 7, 1, 0, 0, 3, 2, 3, 4, 3, 3, 1, 3, 2, 4, 5, 7, 13, 15, 17, 24, 26, 25 };
		series11.data = new ArrayList<>(Arrays.asList(series11_data));

		HIStreamgraph series12 = new HIStreamgraph();
		series12.name = "Switzerland";
		Number[] series12_data = new Number[] { 0, 3, 1, 1, 3, 0, 0, 10, 2, 6, 2, 0, 6, 10, 5, 5, 5, 15, 3, 9, 7, 11, 14, 9, 11 };
		series12.data = new ArrayList<>(Arrays.asList(series12_data));

		HIStreamgraph series13 = new HIStreamgraph();
		series13.name = "Great Britain";
		Number[] series13_data = new Number[] { 0, 4, 1, 0, 3, 0, 0, 2, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 2, 1, 2, 1, 1, 4 };
		series13.data = new ArrayList<>(Arrays.asList(series13_data));

		HIStreamgraph series14 = new HIStreamgraph();
		series14.name = "France";
		Number[] series14_data = new Number[] { 0, 3, 1, 1, 1, 0, 0, 5, 1, 0, 3, 7, 9, 3, 1, 1, 3, 2, 9, 5, 8, 11, 9, 11, 15 };
		series14.data = new ArrayList<>(Arrays.asList(series14_data));

		HIStreamgraph series15 = new HIStreamgraph();
		series15.name = "Hungary";
		Number[] series15_data = new Number[] { 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		series15.data = new ArrayList<>(Arrays.asList(series15_data));

		HIStreamgraph series16 = new HIStreamgraph();
		series16.name = "Unified Team";
		Number[] series16_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0 };
		series16.data = new ArrayList<>(Arrays.asList(series16_data));

		HIStreamgraph series17 = new HIStreamgraph();
		series17.name = "Soviet Union";
		Number[] series17_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 21, 25, 13, 16, 27, 22, 25, 29, 0, 0, 0, 0, 0, 0, 0 };
		series17.data = new ArrayList<>(Arrays.asList(series17_data));

		HIStreamgraph series18 = new HIStreamgraph();
		series18.name = "Russia";
		Number[] series18_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 18, 13, 22, 15, 33 };
		series18.data = new ArrayList<>(Arrays.asList(series18_data));

		HIStreamgraph series19 = new HIStreamgraph();
		series19.name = "Japan";
		Number[] series19_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 1, 1, 1, 7, 5, 10, 2, 1, 5, 8 };
		series19.data = new ArrayList<>(Arrays.asList(series19_data));

		HIStreamgraph series20 = new HIStreamgraph();
		series20.name = "Czechoslovakia";
		Number[] series20_data = new Number[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 4, 3, 1, 1, 6, 3, 3, 0, 0, 0, 0, 0, 0 };
		series20.data = new ArrayList<>(Arrays.asList(series20_data));

		HIStreamgraph series21 = new HIStreamgraph();
		series21.name = "Poland";
		Number[] series21_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 6, 6 };
		series21.data = new ArrayList<>(Arrays.asList(series21_data));

		HIStreamgraph series22 = new HIStreamgraph();
		series22.name = "Spain";
		Number[] series22_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series22.data = new ArrayList<>(Arrays.asList(series22_data));

		HIStreamgraph series23 = new HIStreamgraph();
		series23.name = "China";
		Number[] series23_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 8, 8, 11, 11, 9 };
		series23.data = new ArrayList<>(Arrays.asList(series23_data));

		HIStreamgraph series24 = new HIStreamgraph();
		series24.name = "South Korea";
		Number[] series24_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 6, 4, 11, 14, 8 };
		series24.data = new ArrayList<>(Arrays.asList(series24_data));

		HIStreamgraph series25 = new HIStreamgraph();
		series25.name = "Czech Republi";
		Number[] series25_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 4, 6, 8 };
		series25.data = new ArrayList<>(Arrays.asList(series25_data));

		HIStreamgraph series26 = new HIStreamgraph();
		series26.name = "Belarus";
		Number[] series26_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 1, 3, 6 };
		series26.data = new ArrayList<>(Arrays.asList(series26_data));

		HIStreamgraph series27 = new HIStreamgraph();
		series27.name = "Kazakhstan";
		Number[] series27_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 1, 1 };
		series27.data = new ArrayList<>(Arrays.asList(series27_data));

		HIStreamgraph series28 = new HIStreamgraph();
		series28.name = "Bulgaria";
		Number[] series28_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 3, 1, 0, 0 };
		series28.data = new ArrayList<>(Arrays.asList(series28_data));

		HIStreamgraph series29 = new HIStreamgraph();
		series29.name = "Denmark";
		Number[] series29_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
		series29.data = new ArrayList<>(Arrays.asList(series29_data));

		HIStreamgraph series30 = new HIStreamgraph();
		series30.name = "Ukraine";
		Number[] series30_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 2, 0, 2 };
		series30.data = new ArrayList<>(Arrays.asList(series30_data));

		HIStreamgraph series31 = new HIStreamgraph();
		series31.name = "Australia";
		Number[] series31_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3 };
		series31.data = new ArrayList<>(Arrays.asList(series31_data));

		HIStreamgraph series32 = new HIStreamgraph();
		series32.name = "Belgium";
		Number[] series32_data = new Number[] { 0, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
		series32.data = new ArrayList<>(Arrays.asList(series32_data));

		HIStreamgraph series33 = new HIStreamgraph();
		series33.name = "Romania";
		Number[] series33_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		series33.data = new ArrayList<>(Arrays.asList(series33_data));

		HIStreamgraph series34 = new HIStreamgraph();
		series34.name = "Liechtenstein";
		Number[] series34_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0 };
		series34.data = new ArrayList<>(Arrays.asList(series34_data));

		HIStreamgraph series35 = new HIStreamgraph();
		series35.name = "Yugoslavia";
		Number[] series35_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0 };
		series35.data = new ArrayList<>(Arrays.asList(series35_data));

		HIStreamgraph series36 = new HIStreamgraph();
		series36.name = "Luxembourg";
		Number[] series36_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 };
		series36.data = new ArrayList<>(Arrays.asList(series36_data));

		HIStreamgraph series37 = new HIStreamgraph();
		series37.name = "New Zealand";
		Number[] series37_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series37.data = new ArrayList<>(Arrays.asList(series37_data));

		HIStreamgraph series38 = new HIStreamgraph();
		series38.name = "North Korea";
		Number[] series38_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series38.data = new ArrayList<>(Arrays.asList(series38_data));

		HIStreamgraph series39 = new HIStreamgraph();
		series39.name = "Slovakia";
		Number[] series39_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 };
		series39.data = new ArrayList<>(Arrays.asList(series39_data));

		HIStreamgraph series40 = new HIStreamgraph();
		series40.name = "Croatia";
		Number[] series40_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 3, 1 };
		series40.data = new ArrayList<>(Arrays.asList(series40_data));

		HIStreamgraph series41 = new HIStreamgraph();
		series41.name = "Slovenia";
		Number[] series41_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 3, 8 };
		series41.data = new ArrayList<>(Arrays.asList(series41_data));

		HIStreamgraph series42 = new HIStreamgraph();
		series42.name = "Latvia";
		Number[] series42_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 4 };
		series42.data = new ArrayList<>(Arrays.asList(series42_data));

		HIStreamgraph series43 = new HIStreamgraph();
		series43.name = "Estonia";
		Number[] series43_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 1, 0 };
		series43.data = new ArrayList<>(Arrays.asList(series43_data));

		HIStreamgraph series44 = new HIStreamgraph();
		series44.name = "Uzbekistan";
		Number[] series44_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
		series44.data = new ArrayList<>(Arrays.asList(series44_data));

		options.series = new ArrayList<>(Arrays.asList(series1, series2, series3, series4, series5, series6, series7, series8, series9, series10, series11, series12, series13, series14, series15, series16, series17, series18, series19, series20, series21, series22, series23, series24, series25, series26, series27, series28, series29, series30, series31, series32, series33, series34, series35, series36, series37, series38, series39, series40, series41, series42, series43, series44));


		chartView.options = options;
	}
}


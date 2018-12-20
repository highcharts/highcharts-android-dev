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

		chartView.plugins = new ArrayList<>(Arrays.asList("streamgraph", "series-label", "annotations"));

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("streamgraph");
		chart.setMarginBottom(30);
		chart.setZoomType("x");
		options.setChart(chart);

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

		options.setColors(new ArrayList<>(Arrays.asList(color1, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13, color14, color15, color16, color17, color18)));

		HITitle title = new HITitle();
		title.setText("Winter Olympic Medal Wins");
		title.setAlign("left");
		title.setFloating(true);
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Source: <a href=\"https://www.sports-reference.com/olympics/winter/1924/\">sports-reference.com</a>");
		subtitle.setAlign("left");
		subtitle.setFloating(true);
		subtitle.setY(30);
		options.setSubtitle(subtitle);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setMaxPadding(0);
		xAxis.setType("category");
		xAxis.setCrosshair(new HICrosshair());
		String[] categoriesList = new String[] { "", "1924 Chamonix", "1928 St. Moritz", "1932 Lake Placid", "1936 Garmisch-Partenkirchen", "1940 <i>Cancelled (Sapporo)</i>", "1944 <i>Cancelled (Cortina d\'Ampezzo)</i>", "1948 St. Moritz", "1952 Oslo", "1956 Cortina d\'Ampezzo", "1960 Squaw Valley", "1964 Innsbruck", "1968 Grenoble", "1972 Sapporo", "1976 Innsbruck", "1980 Lake Placid", "1984 Sarajevo", "1988 Calgary", "1992 Albertville", "1994 Lillehammer", "1998 Nagano", "2002 Salt Lake City", "2006 Turin", "2010 Vancouver", "2014 Sochi" };
		xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
		xAxis.setLabels(new HILabels());
		xAxis.getLabels().setAlign("left");
		xAxis.getLabels().setReserveSpace(false);
		xAxis.getLabels().setRotation(270);
		xAxis.setLineWidth(0);
		xAxis.setTickWidth(0);
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setVisible(false);
		yAxis.setStartOnTick(false);
		yAxis.setEndOnTick(false);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIAnnotations annotations = new HIAnnotations();

		HILabels label1 = new HILabels();
		label1.setPoint(new HIPoint());
		label1.getPoint().setX(5.5);
		label1.getPoint().setXAxis(0);
		label1.getPoint().setY(30);
		label1.getPoint().setYAxis(0);
		label1.setText("Cancelled<br>during<br>World War II");

		HILabels label2 = new HILabels();
		label2.setPoint(new HIPoint());
		label2.getPoint().setX(18);
		label2.getPoint().setXAxis(0);
		label2.getPoint().setY(90);
		label2.getPoint().setYAxis(0);
		label2.setText("Soviet Union fell,<br>Germany united");

		annotations.setLabels(new ArrayList<>(Arrays.asList(label1, label2)));
		annotations.setLabelOptions(new HILabelOptions());
		annotations.getLabelOptions().setBackgroundColor(HIColor.initWithRGBA(255, 255, 255, 0.5));
		annotations.getLabelOptions().setBorderColor(HIColor.initWithName("silver"));
		options.setAnnotations(new ArrayList<>(Arrays.asList(annotations)));

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setSeries(new HISeries());
		plotoptions.getSeries().setLabel(new HILabel());
		plotoptions.getSeries().getLabel().setMinFontSize(5);
		plotoptions.getSeries().getLabel().setMaxFontSize(15);
		plotoptions.getSeries().getLabel().setStyle(new HICSSObject());
		plotoptions.getSeries().getLabel().getStyle().setColor("rgba(255,255,255,0.75)");
		options.setPlotOptions(plotoptions);

		HIExporting exporting = new HIExporting();
		exporting.setSourceWidth(800);
		exporting.setSourceHeight(600);
		options.setExporting(exporting);

		HIStreamgraph series1 = new HIStreamgraph();
		series1.setName("Finland");
		Number[] series1_data = new Number[] { 0, 11, 4, 3, 6, 0, 0, 6, 9, 7, 8, 10, 5, 5, 7, 9, 13, 7, 7, 6, 12, 7, 9, 5, 5 };
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

		HIStreamgraph series2 = new HIStreamgraph();
		series2.setName("Austria");
		Number[] series2_data = new Number[] { 0, 3, 4, 2, 4, 0, 0, 8, 8, 11, 6, 12, 11, 5, 6, 7, 1, 10, 21, 9, 17, 17, 23, 16, 17 };
		series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

		HIStreamgraph series3 = new HIStreamgraph();
		series3.setName("Sweden");
		Number[] series3_data = new Number[] { 0, 2, 5, 3, 7, 0, 0, 10, 4, 10, 7, 7, 8, 4, 2, 4, 8, 6, 4, 3, 3, 7, 14, 11, 15 };
		series3.setData(new ArrayList<>(Arrays.asList(series3_data)));

		HIStreamgraph series4 = new HIStreamgraph();
		series4.setName("Norway");
		Number[] series4_data = new Number[] { 0, 17, 15, 10, 15, 0, 0, 10, 16, 4, 6, 15, 14, 12, 7, 10, 9, 5, 20, 26, 25, 25, 19, 23, 26 };
		series4.setData(new ArrayList<>(Arrays.asList(series4_data)));

		HIStreamgraph series5 = new HIStreamgraph();
		series5.setName("U.S.");
		Number[] series5_data = new Number[] { 0, 4, 6, 12, 4, 0, 0, 9, 11, 7, 10, 7, 7, 8, 10, 12, 8, 6, 11, 13, 13, 34, 25, 37, 28 };
		series5.setData(new ArrayList<>(Arrays.asList(series5_data)));

		HIStreamgraph series6 = new HIStreamgraph();
		series6.setName("East Germany");
		Number[] series6_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 14, 19, 23, 24, 25, 0, 0, 0, 0, 0, 0, 0 };
		series6.setData(new ArrayList<>(Arrays.asList(series6_data)));

		HIStreamgraph series7 = new HIStreamgraph();
		series7.setName("West Germany");
		Number[] series7_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 5, 10, 5, 4, 8, 0, 0, 0, 0, 0, 0, 0 };
		series7.setData(new ArrayList<>(Arrays.asList(series7_data)));

		HIStreamgraph series8 = new HIStreamgraph();
		series8.setName("Germany");
		Number[] series8_data = new Number[] { 0, 0, 1, 2, 6, 0, 0, 0, 7, 2, 8, 9, 0, 0, 0, 0, 0, 0, 26, 24, 29, 36, 29, 30, 19 };
		series8.setData(new ArrayList<>(Arrays.asList(series8_data)));

		HIStreamgraph series9 = new HIStreamgraph();
		series9.setName("Netherlands");
		Number[] series9_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 2, 2, 9, 9, 6, 4, 0, 7, 4, 4, 11, 8, 9, 8, 24 };
		series9.setData(new ArrayList<>(Arrays.asList(series9_data)));

		HIStreamgraph series10 = new HIStreamgraph();
		series10.setName("Italy");eries29.setData(new ArrayList<>(Arrays.asList(series29_data)));

		HIStreamgraph series30 = new HIStreamgraph();
		series30.setName("Ukraine");
		Number[] series30_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 2, 0, 2 };
		series30.setData(new ArrayList<>(Arrays.asList(series30_data)));

		HIStreamgraph series31 = new HIStreamgraph();
		series31.setName("Australia");
		Number[] series31_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3 };
		series31.setData(new ArrayList<>(Arrays.asList(series31_data)));

		HIStreamgraph series32 = new HIStreamgraph();
		series32.setName("Belgium");
		Number[] series32_data = new Number[] { 0, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
		series32.setData(new ArrayList<>(Arrays.asList(series32_data)));

		HIStreamgraph series33 = new HIStreamgraph();
		series33.setName("Romania");
		Number[] series33_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		series33.setData(new ArrayList<>(Arrays.asList(series33_data)));

		HIStreamgraph series34 = new HIStreamgraph();
		series34.setName("Liechtenstein");
		Number[] series34_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0 };
		series34.setData(new ArrayList<>(Arrays.asList(series34_data)));

		HIStreamgraph series35 = new HIStreamgraph();
		series35.setName("Yugoslavia");
		Number[] series35_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0 };
		series35.setData(new ArrayList<>(Arrays.asList(series35_data)));

		HIStreamgraph series36 = new HIStreamgraph();
		series36.setName("Luxembourg");
		Number[] series36_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 };
		series36.setData(new ArrayList<>(Arrays.asList(series36_data)));

		HIStreamgraph series37 = new HIStreamgraph();
		series37.setName("New Zealand");
		Number[] series37_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series37.setData(new ArrayList<>(Arrays.asList(series37_data)));

		HIStreamgraph series38 = new HIStreamgraph();
		series38.setName("North Korea");
		Number[] series38_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series38.setData(new ArrayList<>(Arrays.asList(series38_data)));

		HIStreamgraph series39 = new HIStreamgraph();
		series39.setName("Slovakia");
		Number[] series39_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 };
		series39.setData(new ArrayList<>(Arrays.asList(series39_data)));

		HIStreamgraph series40 = new HIStreamgraph();
		series40.setName("Croatia");
		Number[] series40_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 3, 1 };
		series40.setData(new ArrayList<>(Arrays.asList(series40_data)));

		HIStreamgraph series41 = new HIStreamgraph();
		series41.setName("Slovenia");
		Number[] series41_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 3, 8 };
		series41.setData(new ArrayList<>(Arrays.asList(series41_data)));

		HIStreamgraph series42 = new HIStreamgraph();
		series42.setName("Latvia");
		Number[] series42_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 4 };
		series42.setData(new ArrayList<>(Arrays.asList(series42_data)));

		HIStreamgraph series43 = new HIStreamgraph();
		series43.setName("Estonia");
		Number[] series43_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 1, 0 };
		series43.setData(new ArrayList<>(Arrays.asList(series43_data)));

		HIStreamgraph series44 = new HIStreamgraph();
		series44.setName("Uzbekistan");
		Number[] series44_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
		series44.setData(new ArrayList<>(Arrays.asList(series44_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3, series4, series5, series6, series7, series8, series9, series10, series11, series12, series13, series14, series15, series16, series17, series18, series19, series20, series21, series22, series23, series24, series25, series26, series27, series28, series29, series30, series31, series32, series33, series34, series35, series36, series37, series38, series39, series40, series41, series42, series43, series44)));

		chartView.setOptions(options);
		Number[] series10_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 1, 4, 4, 5, 4, 2, 2, 5, 14, 20, 10, 13, 11, 5, 8 };
		series10.setData(new ArrayList<>(Arrays.asList(series10_data)));

		HIStreamgraph series11 = new HIStreamgraph();
		series11.setName("Canada");
		Number[] series11_data = new Number[] { 0, 1, 1, 7, 1, 0, 0, 3, 2, 3, 4, 3, 3, 1, 3, 2, 4, 5, 7, 13, 15, 17, 24, 26, 25 };
		series11.setData(new ArrayList<>(Arrays.asList(series11_data)));

		HIStreamgraph series12 = new HIStreamgraph();
		series12.setName("Switzerland");
		Number[] series12_data = new Number[] { 0, 3, 1, 1, 3, 0, 0, 10, 2, 6, 2, 0, 6, 10, 5, 5, 5, 15, 3, 9, 7, 11, 14, 9, 11 };
		series12.setData(new ArrayList<>(Arrays.asList(series12_data)));

		HIStreamgraph series13 = new HIStreamgraph();
		series13.setName("Great Britain");
		Number[] series13_data = new Number[] { 0, 4, 1, 0, 3, 0, 0, 2, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 2, 1, 2, 1, 1, 4 };
		series13.setData(new ArrayList<>(Arrays.asList(series13_data)));

		HIStreamgraph series14 = new HIStreamgraph();
		series14.setName("France");
		Number[] series14_data = new Number[] { 0, 3, 1, 1, 1, 0, 0, 5, 1, 0, 3, 7, 9, 3, 1, 1, 3, 2, 9, 5, 8, 11, 9, 11, 15 };
		series14.setData(new ArrayList<>(Arrays.asList(series14_data)));

		HIStreamgraph series15 = new HIStreamgraph();
		series15.setName("Hungary");
		Number[] series15_data = new Number[] { 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		series15.setData(new ArrayList<>(Arrays.asList(series15_data)));

		HIStreamgraph series16 = new HIStreamgraph();
		series16.setName("Unified Team");
		Number[] series16_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 0, 0, 0, 0, 0 };
		series16.setData(new ArrayList<>(Arrays.asList(series16_data)));

		HIStreamgraph series17 = new HIStreamgraph();
		series17.setName("Soviet Union");
		Number[] series17_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 21, 25, 13, 16, 27, 22, 25, 29, 0, 0, 0, 0, 0, 0, 0 };
		series17.setData(new ArrayList<>(Arrays.asList(series17_data)));

		HIStreamgraph series18 = new HIStreamgraph();
		series18.setName("Russia");
		Number[] series18_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 23, 18, 13, 22, 15, 33 };
		series18.setData(new ArrayList<>(Arrays.asList(series18_data)));

		HIStreamgraph series19 = new HIStreamgraph();
		series19.setName("Japan");
		Number[] series19_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 1, 1, 1, 7, 5, 10, 2, 1, 5, 8 };
		series19.setData(new ArrayList<>(Arrays.asList(series19_data)));

		HIStreamgraph series20 = new HIStreamgraph();
		series20.setName("Czechoslovakia");
		Number[] series20_data = new Number[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 4, 3, 1, 1, 6, 3, 3, 0, 0, 0, 0, 0, 0 };
		series20.setData(new ArrayList<>(Arrays.asList(series20_data)));

		HIStreamgraph series21 = new HIStreamgraph();
		series21.setName("Poland");
		Number[] series21_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 2, 6, 6 };
		series21.setData(new ArrayList<>(Arrays.asList(series21_data)));

		HIStreamgraph series22 = new HIStreamgraph();
		series22.setName("Spain");
		Number[] series22_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series22.setData(new ArrayList<>(Arrays.asList(series22_data)));

		HIStreamgraph series23 = new HIStreamgraph();
		series23.setName("China");
		Number[] series23_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 8, 8, 11, 11, 9 };
		series23.setData(new ArrayList<>(Arrays.asList(series23_data)));

		HIStreamgraph series24 = new HIStreamgraph();
		series24.setName("South Korea");
		Number[] series24_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 6, 4, 11, 14, 8 };
		series24.setData(new ArrayList<>(Arrays.asList(series24_data)));

		HIStreamgraph series25 = new HIStreamgraph();
		series25.setName("Czech Republi");
		Number[] series25_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 4, 6, 8 };
		series25.setData(new ArrayList<>(Arrays.asList(series25_data)));

		HIStreamgraph series26 = new HIStreamgraph();
		series26.setName("Belarus");
		Number[] series26_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 1, 3, 6 };
		series26.setData(new ArrayList<>(Arrays.asList(series26_data)));

		HIStreamgraph series27 = new HIStreamgraph();
		series27.setName("Kazakhstan");
		Number[] series27_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 1, 1 };
		series27.setData(new ArrayList<>(Arrays.asList(series27_data)));

		HIStreamgraph series28 = new HIStreamgraph();
		series28.setName("Bulgaria");
		Number[] series28_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 3, 1, 0, 0 };
		series28.setData(new ArrayList<>(Arrays.asList(series28_data)));

		HIStreamgraph series29 = new HIStreamgraph();
		series29.setName("Denmark");
		Number[] series29_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
		series29.setData(new ArrayList<>(Arrays.asList(series29_data)));

		HIStreamgraph series30 = new HIStreamgraph();
		series30.setName("Ukraine");
		Number[] series30_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 2, 0, 2 };
		series30.setData(new ArrayList<>(Arrays.asList(series30_data)));

		HIStreamgraph series31 = new HIStreamgraph();
		series31.setName("Australia");
		Number[] series31_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3 };
		series31.setData(new ArrayList<>(Arrays.asList(series31_data)));

		HIStreamgraph series32 = new HIStreamgraph();
		series32.setName("Belgium");
		Number[] series32_data = new Number[] { 0, 1, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
		series32.setData(new ArrayList<>(Arrays.asList(series32_data)));

		HIStreamgraph series33 = new HIStreamgraph();
		series33.setName("Romania");
		Number[] series33_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		series33.setData(new ArrayList<>(Arrays.asList(series33_data)));

		HIStreamgraph series34 = new HIStreamgraph();
		series34.setName("Liechtenstein");
		Number[] series34_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0 };
		series34.setData(new ArrayList<>(Arrays.asList(series34_data)));

		HIStreamgraph series35 = new HIStreamgraph();
		series35.setName("Yugoslavia");
		Number[] series35_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 0, 0, 0, 0, 0, 0, 0 };
		series35.setData(new ArrayList<>(Arrays.asList(series35_data)));

		HIStreamgraph series36 = new HIStreamgraph();
		series36.setName("Luxembourg");
		Number[] series36_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0 };
		series36.setData(new ArrayList<>(Arrays.asList(series36_data)));

		HIStreamgraph series37 = new HIStreamgraph();
		series37.setName("New Zealand");
		Number[] series37_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series37.setData(new ArrayList<>(Arrays.asList(series37_data)));

		HIStreamgraph series38 = new HIStreamgraph();
		series38.setName("North Korea");
		Number[] series38_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 };
		series38.setData(new ArrayList<>(Arrays.asList(series38_data)));

		HIStreamgraph series39 = new HIStreamgraph();
		series39.setName("Slovakia");
		Number[] series39_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 };
		series39.setData(new ArrayList<>(Arrays.asList(series39_data)));

		HIStreamgraph series40 = new HIStreamgraph();
		series40.setName("Croatia");
		Number[] series40_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 3, 1 };
		series40.setData(new ArrayList<>(Arrays.asList(series40_data)));

		HIStreamgraph series41 = new HIStreamgraph();
		series41.setName("Slovenia");
		Number[] series41_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 1, 0, 3, 8 };
		series41.setData(new ArrayList<>(Arrays.asList(series41_data)));

		HIStreamgraph series42 = new HIStreamgraph();
		series42.setName("Latvia");
		Number[] series42_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 4 };
		series42.setData(new ArrayList<>(Arrays.asList(series42_data)));

		HIStreamgraph series43 = new HIStreamgraph();
		series43.setName("Estonia");
		Number[] series43_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 1, 0 };
		series43.setData(new ArrayList<>(Arrays.asList(series43_data)));

		HIStreamgraph series44 = new HIStreamgraph();
		series44.setName("Uzbekistan");
		Number[] series44_data = new Number[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 };
		series44.setData(new ArrayList<>(Arrays.asList(series44_data)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3, series4, series5, series6, series7, series8, series9, series10, series11, series12, series13, series14, series15, series16, series17, series18, series19, series20, series21, series22, series23, series24, series25, series26, series27, series28, series29, series30, series31, series32, series33, series34, series35, series36, series37, series38, series39, series40, series41, series42, series43, series44)));

		chartView.setOptions(options);
	}
}


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

		chartView.plugins = new ArrayList<>(Arrays.asList("heatmap", "tilemap"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

HIChart chart = new HIChart();
		chart.setType("tilemap");
		chart.setInverted(true);
		chart.setHeight("80%");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("U.S. states by population in 2016");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Source:<a href=\"https://simple.wikipedia.org/wiki/List_of_U.S._states_by_population\">Wikipedia</a>");
		options.setSubtitle(subtitle);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setVisible(false);
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setVisible(false);
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HIColorAxis colorAxis = new HIColorAxis();

		HIDataClasses dataClasses1 = new HIDataClasses();
		dataClasses1.setFrom(0);
		dataClasses1.setTo(1000000);
		dataClasses1.setColor(HIColor.initWithHexValue("F9EDB3"));
		dataClasses1.setName("< 1M");
		HIDataClasses dataClasses2 = new HIDataClasses();
		dataClasses2.setFrom(1000000);
		dataClasses2.setTo(5000000);
		dataClasses2.setColor(HIColor.initWithHexValue("FFC428"));
		dataClasses2.setName("1M - 5M");
		HIDataClasses dataClasses3 = new HIDataClasses();
		dataClasses3.setFrom(5000000);
		dataClasses3.setTo(20000000);
		dataClasses3.setColor(HIColor.initWithHexValue("FF7987"));
		dataClasses3.setName("5M - 20M");
		HIDataClasses dataClasses4 = new HIDataClasses();
		dataClasses4.setFrom(20000000);
		dataClasses4.setColor(HIColor.initWithHexValue("FF2371"));
		dataClasses4.setName("> 20M");
		HIDataClasses[] dataClassesList = new HIDataClasses[] { dataClasses1, dataClasses2, dataClasses3, dataClasses4 };
		colorAxis.setDataClasses(new ArrayList<>(Arrays.asList(dataClassesList)));
		options.setColorAxis(colorAxis);

		HITooltip tooltip = new HITooltip();
		tooltip.setHeaderFormat("");
		tooltip.setPointFormat("The population of <b> {point.name}</b> is <b>{point.value}</b>");
		options.setTooltip(tooltip);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSeries(new HISeries());
		plotOptions.getSeries().setDataLabels(new HIDataLabels());
		plotOptions.getSeries().getDataLabels().setEnabled(true);
		plotOptions.getSeries().getDataLabels().setFormat("{point.hc-a2}");
		plotOptions.getSeries().getDataLabels().setColor(HIColor.initWithHexValue("000000"));
		plotOptions.getSeries().getDataLabels().setStyle(new HICSSObject());
		plotOptions.getSeries().getDataLabels().getStyle().setTextOutline("false");
		options.setPlotOptions(plotOptions);

		HITilemap series1 = new HITilemap();
		series1.setName("");

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("hc-a2", "AK");
		map1.put("name", "Alabama");
		map1.put("region", "South");
		map1.put("x", 6);
		map1.put("y", 7);
		map1.put("value", 4849377);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("hc-a2", "AL");
		map2.put("name", "Alaska");
		map2.put("region", "West");
		map2.put("x", 0);
		map2.put("y", 0);
		map2.put("value", 737732);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("hc-a2", "AZ");
		map3.put("name", "Arizona");
		map3.put("region", "West");
		map3.put("x", 5);
		map3.put("y", 3);
		map3.put("value", 6745408);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("hc-a2", "AR");
		map4.put("name", "Arkansas");
		map4.put("region", "South");
		map4.put("x", 5);
		map4.put("y", 6);
		map4.put("value", 2994079);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("hc-a2", "CA");
		map5.put("name", "California");
		map5.put("region", "South");
		map5.put("x", 5);
		map5.put("y", 2);
		map5.put("value", 39250017);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("hc-a2", "CO");
		map6.put("name", "Colorado");
		map6.put("region", "West");
		map6.put("x", 4);
		map6.put("y", 3);
		map6.put("value", 5540545);

		HashMap<String, Object> map7 = new HashMap<>();
		map7.put("hc-a2", "CT");
		map7.put("name", "Connecticut");
		map7.put("region", "Northeast");
		map7.put("x", 3);
		map7.put("y", 11);
		map7.put("value", 3596677);

		HashMap<String, Object> map8 = new HashMap<>();
		map8.put("hc-a2", "DE");
		map8.put("name", "Delaware");
		map8.put("region", "South");
		map8.put("x", 4);
		map8.put("y", 9);
		map8.put("value", 935614);

		HashMap<String, Object> map9 = new HashMap<>();
		map9.put("hc-a2", "DC");
		map9.put("name", "District of Columbia");
		map9.put("region", "South");
		map9.put("x", 4);
		map9.put("y", 10);
		map9.put("value", 7288000);

		HashMap<String, Object> map10 = new HashMap<>();
		map10.put("hc-a2", "FL");
		map10.put("name", "Florida");
		map10.put("region", "South");
		map10.put("x", 8);
		map10.put("y", 8);
		map10.put("value", 20612439);

		HashMap<String, Object> map11 = new HashMap<>();
		map11.put("hc-a2", "GA");
		map11.put("name", "Georgia");
		map11.put("region", "South");
		map11.put("x", 7);
		map11.put("y", 8);
		map11.put("value", 10310371);

		HashMap<String, Object> map12 = new HashMap<>();
		map12.put("hc-a2", "HI");
		map12.put("name", "Hawaii");
		map12.put("region", "West");
		map12.put("x", 8);
		map12.put("y", 0);
		map12.put("value", 1419561);

		HashMap<String, Object> map13 = new HashMap<>();
		map13.put("hc-a2", "ID");
		map13.put("name", "Idaho");
		map13.put("region", "West");
		map13.put("x", 3);
		map13.put("y", 2);
		map13.put("value", 1634464);

		HashMap<String, Object> map14 = new HashMap<>();
		map14.put("hc-a2", "IL");
		map14.put("name", "Illinois");
		map14.put("region", "Midwest");
		map14.put("x", 3);
		map14.put("y", 6);
		map14.put("value", 12801539);

		HashMap<String, Object> map15 = new HashMap<>();
		map15.put("hc-a2", "IN");
		map15.put("name", "Indiana");
		map15.put("region", "Midwest");
		map15.put("x", 3);
		map15.put("y", 7);
		map15.put("value", 6596855);

		HashMap<String, Object> map16 = new HashMap<>();
		map16.put("hc-a2", "IA");
		map16.put("name", "Iowa");
		map16.put("region", "Midwest");
		map16.put("x", 3);
		map16.put("y", 5);
		map16.put("value", 3107126);

		HashMap<String, Object> map17 = new HashMap<>();
		map17.put("hc-a2", "KS");
		map17.put("name", "Kansas");
		map17.put("region", "Midwest");
		map17.put("x", 5);
		map17.put("y", 5);
		map17.put("value", 2904021);

		HashMap<String, Object> map18 = new HashMap<>();
		map18.put("hc-a2", "KY");
		map18.put("name", "Kentucky");
		map18.put("region", "South");
		map18.put("x", 4);
		map18.put("y", 6);
		map18.put("value", 4413457);

		HashMap<String, Object> map19 = new HashMap<>();
		map19.put("hc-a2", "LA");
		map19.put("name", "Louisiana");
		map19.put("region", "South");
		map19.put("x", 6);
		map19.put("y", 5);
		map19.put("value", 4649676);

		HashMap<String, Object> map20 = new HashMap<>();
		map20.put("hc-a2", "ME");
		map20.put("name", "Maine");
		map20.put("region", "Northeast");
		map20.put("x", 0);
		map20.put("y", 11);
		map20.put("value", 1330089);

		HashMap<String, Object> map21 = new HashMap<>();
		map21.put("hc-a2", "MD");
		map21.put("name", "Maryland");
		map21.put("region", "South");
		map21.put("x", 4);
		map21.put("y", 8);
		map21.put("value", 6016447);

		HashMap<String, Object> map22 = new HashMap<>();
		map22.put("hc-a2", "MA");
		map22.put("name", "Massachusetts");
		map22.put("region", "Northeast");
		map22.put("x", 2);
		map22.put("y", 10);
		map22.put("value", 6811779);

		HashMap<String, Object> map23 = new HashMap<>();
		map23.put("hc-a2", "MI");
		map23.put("name", "Michigan");
		map23.put("region", "Midwest");
		map23.put("x", 2);
		map23.put("y", 7);
		map23.put("value", 9928301);

		HashMap<String, Object> map24 = new HashMap<>();
		map24.put("hc-a2", "MN");
		map24.put("name", "Minnesota");
		map24.put("region", "Midwest");
		map24.put("x", 2);
		map24.put("y", 4);
		map24.put("value", 5519952);

		HashMap<String, Object> map25 = new HashMap<>();
		map25.put("hc-a2", "MS");
		map25.put("name", "Mississippi");
		map25.put("region", "South");
		map25.put("x", 6);
		map25.put("y", 6);
		map25.put("value", 2984926);

		HashMap<String, Object> map26 = new HashMap<>();
		map26.put("hc-a2", "MO");
		map26.put("name", "Missouri");
		map26.put("region", "Midwest");
		map26.put("x", 4);
		map26.put("y", 5);
		map26.put("value", 6093000);

		HashMap<String, Object> map27 = new HashMap<>();
		map27.put("hc-a2", "MT");
		map27.put("name", "Montana");
		map27.put("region", "West");
		map27.put("x", 2);
		map27.put("y", 2);
		map27.put("value", 1023579);

		HashMap<String, Object> map28 = new HashMap<>();
		map28.put("hc-a2", "NE");
		map28.put("name", "Nebraska");
		map28.put("region", "Midwest");
		map28.put("x", 4);
		map28.put("y", 4);
		map28.put("value", 1881503);

		HashMap<String, Object> map29 = new HashMap<>();
		map29.put("hc-a2", "NV");
		map29.put("name", "Nevada");
		map29.put("region", "West");
		map29.put("x", 4);
		map29.put("y", 2);
		map29.put("value", 2839099);

		HashMap<String, Object> map30 = new HashMap<>();
		map30.put("hc-a2", "NH");
		map30.put("name", "New Hampshire");
		map30.put("region", "Northeast");
		map30.put("x", 1);
		map30.put("y", 11);
		map30.put("value", 1326813);

		HashMap<String, Object> map31 = new HashMap<>();
		map31.put("hc-a2", "NJ");
		map31.put("name", "New Jersey");
		map31.put("region", "Northeast");
		map31.put("x", 3);
		map31.put("y", 10);
		map31.put("value", 8944469);

		HashMap<String, Object> map32 = new HashMap<>();
		map32.put("hc-a2", "NM");
		map32.put("name", "New Mexico");
		map32.put("region", "West");
		map32.put("x", 6);
		map32.put("y", 3);
		map32.put("value", 2085572);

		HashMap<String, Object> map33 = new HashMap<>();
		map33.put("hc-a2", "NY");
		map33.put("name", "New York");
		map33.put("region", "Northeast");
		map33.put("x", 2);
		map33.put("y", 9);
		map33.put("value", 19745289);

		HashMap<String, Object> map34 = new HashMap<>();
		map34.put("hc-a2", "NC");
		map34.put("name", "North Carolin");
		map34.put("region", "South");
		map34.put("x", 5);
		map34.put("y", 9);
		map34.put("value", 10146788);

		HashMap<String, Object> map35 = new HashMap<>();
		map35.put("hc-a2", "ND");
		map35.put("name", "North Dakota");
		map35.put("region", "Midwest");
		map35.put("x", 2);
		map35.put("y", 3);
		map35.put("value", 739482);

		HashMap<String, Object> map36 = new HashMap<>();
		map36.put("hc-a2", "OH");
		map36.put("name", "Ohio");
		map36.put("region", "Midwest");
		map36.put("x", 3);
		map36.put("y", 8);
		map36.put("value", 11614373);

		HashMap<String, Object> map37 = new HashMap<>();
		map37.put("hc-a2", "OK");
		map37.put("name", "Oklahoma");
		map37.put("region", "South");
		map37.put("x", 6);
		map37.put("y", 4);
		map37.put("value", 3878051);

		HashMap<String, Object> map38 = new HashMap<>();
		map38.put("hc-a2", "OR");
		map38.put("name", "Oregon");
		map38.put("region", "West");
		map38.put("x", 4);
		map38.put("y", 1);
		map38.put("value", 3970239);

		HashMap<String, Object> map39 = new HashMap<>();
		map39.put("hc-a2", "PA");
		map39.put("name", "Pennsylvania");
		map39.put("region", "Northeast");
		map39.put("x", 3);
		map39.put("y", 9);
		map39.put("value", 12784227);

		HashMap<String, Object> map40 = new HashMap<>();
		map40.put("hc-a2", "RI");
		map40.put("name", "Rhode Island");
		map40.put("region", "Northeast");
		map40.put("x", 2);
		map40.put("y", 11);
		map40.put("value", 1055173);

		HashMap<String, Object> map41 = new HashMap<>();
		map41.put("hc-a2", "SC");
		map41.put("name", "South Carolina");
		map41.put("region", "South");
		map41.put("x", 6);
		map41.put("y", 8);
		map41.put("value", 4832482);

		HashMap<String, Object> map42 = new HashMap<>();
		map42.put("hc-a2", "SD");
		map42.put("name", "South Dakota");
		map42.put("region", "Midwest");
		map42.put("x", 3);
		map42.put("y", 4);
		map42.put("value", 853175);

		HashMap<String, Object> map43 = new HashMap<>();
		map43.put("hc-a2", "TN");
		map43.put("name", "Tennessee");
		map43.put("region", "South");
		map43.put("x", 5);
		map43.put("y", 7);
		map43.put("value", 6651194);

		HashMap<String, Object> map44 = new HashMap<>();
		map44.put("hc-a2", "TX");
		map44.put("name", "Texas");
		map44.put("region", "South");
		map44.put("x", 7);
		map44.put("y", 4);
		map44.put("value", 27862596);

		HashMap<String, Object> map45 = new HashMap<>();
		map45.put("hc-a2", "UT");
		map45.put("name", "Utah");
		map45.put("region", "West");
		map45.put("x", 5);
		map45.put("y", 4);
		map45.put("value", 2942902);

		HashMap<String, Object> map46 = new HashMap<>();
		map46.put("hc-a2", "VT");
		map46.put("name", "Vermont");
		map46.put("region", "Northeast");
		map46.put("x", 1);
		map46.put("y", 10);
		map46.put("value", 626011);

		HashMap<String, Object> map47 = new HashMap<>();
		map47.put("hc-a2", "VA");
		map47.put("name", "Virginia");
		map47.put("region", "South");
		map47.put("x", 5);
		map47.put("y", 8);
		map47.put("value", 8411808);

		HashMap<String, Object> map48 = new HashMap<>();
		map48.put("hc-a2", "WA");
		map48.put("name", "Washington");
		map48.put("region", "West");
		map48.put("x", 2);
		map48.put("y", 1);
		map48.put("value", 7288000);

		HashMap<String, Object> map49 = new HashMap<>();
		map49.put("hc-a2", "WV");
		map49.put("name", "West Virginia");
		map49.put("region", "South");
		map49.put("x", 4);
		map49.put("y", 7);
		map49.put("value", 1850326);

		HashMap<String, Object> map50 = new HashMap<>();
		map50.put("hc-a2", "WI");
		map50.put("name", "Wisconsin");
		map50.put("region", "Midwest");
		map50.put("x", 2);
		map50.put("y", 5);
		map50.put("value", 5778708);

		HashMap<String, Object> map51 = new HashMap<>();
		map51.put("hc-a2", "WY");
		map51.put("name", "Wyoming");
		map51.put("region", "West");
		map51.put("x", 3);
		map51.put("y", 3);
		map51.put("value", 584153);

		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13, map14, map15, map16, map17, map18, map19, map20, map21, map22, map23, map24, map25, map26, map27, map28, map29, map30, map31, map32, map33, map34, map35, map36, map37, map38, map39, map40, map41, map42, map43, map44, map45, map46, map47, map48, map49, map50, map51)));

		options.setSeries(new ArrayList<>(Arrays.asList(series1)));
		chartView.setOptions(options);
	}
}


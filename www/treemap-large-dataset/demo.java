package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
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

		chartView.plugins = new ArrayList<>(Arrays.asList("heatmap", "treemap"));

		HIOptions options = new HIOptions();

		HITitle title = new HITitle();
		title.setText("Click points to drill down. Source: <a href=\"http://apps.who.int/gho/data/node.main.12?lang=en\">WHO</a>.");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Global Mortality Rate 2012, per 100 000 population");
		options.setSubtitle(subtitle);

		HITreemap series1 = new HITreemap();
		series1.setLayoutAlgorithm("squarified");
		series1.setAllowDrillToNode(true);
		series1.setAnimationLimit(1000);
		series1.setDataLabels(new HIDataLabels());
		series1.getDataLabels().setEnabled(false);
		series1.setLevelIsConstant(false);

		HILevels level = new HILevels();
		level.setLevel(1);
		HashMap<String, Object> dataLabels = new HashMap<>();
		dataLabels.put("enabled", true);
		level.setDataLabels(dataLabels);
		level.setBorderWidth(3);

		series1.setLevels(new ArrayList<>(Arrays.asList(level)));

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("id", "id_0_0");
		map1.put("name", "Sri Lanka");
		map1.put("parent", "id_0");

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("id", "id_0_0_0");
		map2.put("name", "Communicable diseases");
		map2.put("parent", "id_0_0");
		map2.put("value", 76);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("id", "id_0_0_1");
		map3.put("name", "Injuries");
		map3.put("parent", "id_0_0");
		map3.put("value", 89);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("id", "id_0_0_2");
		map4.put("name", "Non-communicable diseases");
		map4.put("parent", "id_0_0");
		map4.put("value", 501);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("id", "id_0_1");
		map5.put("name", "Bangladesh");
		map5.put("parent", "id_0");

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("id", "id_0_1_0");
		map6.put("name", "Non-communicable diseases");
		map6.put("parent", "id_0_1");
		map6.put("value", 549);

		HashMap<String, Object> map7 = new HashMap<>();
		map7.put("id", "id_0_1_1");
		map7.put("name", "Injuries");
		map7.put("parent", "id_0_1");
		map7.put("value", 64);

		HashMap<String, Object> map8 = new HashMap<>();
		map8.put("id", "id_0_1_2");
		map8.put("name", "Communicable diseases");
		map8.put("parent", "id_0_1");
		map8.put("value", 235);

		HashMap<String, Object> map9 = new HashMap<>();
		map9.put("id", "id_0_2");
		map9.put("name", "Myanmar");
		map9.put("parent", "id_0");

		HashMap<String, Object> map10 = new HashMap<>();
		map10.put("id", "id_0_2_0");
		map10.put("name", "Communicable diseases");
		map10.put("parent", "id_0_2");
		map10.put("value", 316);

		HashMap<String, Object> map11 = new HashMap<>();
		map11.put("id", "id_0_2_1");
		map11.put("name", "Injuries");
		map11.put("parent", "id_0_2");
		map11.put("value", 102);

		HashMap<String, Object> map12 = new HashMap<>();
		map12.put("id", "id_0_2_2");
		map12.put("name", "Non-communicable diseases");
		map12.put("parent", "id_0_2");
		map12.put("value", 709);

		HashMap<String, Object> map13 = new HashMap<>();
		map13.put("id", "id_0_3");
		map13.put("name", "Maldives");
		map13.put("parent", "id_0");

        HashMap<String, Object> map14 = new HashMap<>();
        map14.put("id", "id_0_3_0");
        map14.put("name", "Injuries");
        map14.put("parent", "id_0_3");
        map14.put("value", 35);

        HashMap<String, Object> map15 = new HashMap<>();
        map15.put("id", "id_0_3_1");
        map15.put("name", "Non-communicable diseases");
        map15.put("parent", "id_0_3");
        map15.put("value", 487);

        HashMap<String, Object> map16 = new HashMap<>();
        map16.put("id", "id_0_3_2");
        map16.put("name", "Communicable diseases");
        map16.put("parent", "id_0_3");
        map16.put("value", 59);

        HashMap<String, Object> map17 = new HashMap<>();
        map17.put("id", "id_0_4");
        map17.put("name", "Democratic People's Republic of Korea");
        map17.put("parent", "id_0");

        HashMap<String, Object> map18 = new HashMap<>();
        map18.put("id", "id_0_4_0");
        map18.put("name", "Injuries");
        map18.put("parent", "id_0_4");
        map18.put("value", 92);

        HashMap<String, Object> map19 = new HashMap<>();
        map19.put("id", "id_0_4_1");
        map19.put("name", "Non-communicable diseases");
        map19.put("parent", "id_0_4");
        map19.put("value", 751);

        HashMap<String, Object> map20 = new HashMap<>();
        map20.put("id", "id_0_4_2");
        map20.put("name", "Communicable diseases");
        map20.put("parent", "id_0_4");
        map20.put("value", 117);

        HashMap<String, Object> map21 = new HashMap<>();
        map21.put("id", "id_0_5");
        map21.put("name", "Bhutan");
        map21.put("parent", "id_0");

        HashMap<String, Object> map22 = new HashMap<>();
        map22.put("id", "id_0_5_0");
        map22.put("name", "Injuries");
        map22.put("parent", "id_0_5");
        map22.put("value", 142);

        HashMap<String, Object> map23 = new HashMap<>();
        map23.put("id", "id_0_5_1");
        map23.put("name", "Non-communicable diseases");
        map23.put("parent", "id_0_5");
        map23.put("value", 573);

        HashMap<String, Object> map24 = new HashMap<>();
        map24.put("id", "id_0_5_2");
        map24.put("name", "Communicable diseases");
        map24.put("parent", "id_0_5");
        map24.put("value", 187);

        HashMap<String, Object> map25 = new HashMap<>();
        map25.put("id", "id_0_6");
        map25.put("name", "Thailand");
        map25.put("parent", "id_0");

        HashMap<String, Object> map26 = new HashMap<>();
        map26.put("id", "id_0_6_0");
        map26.put("name", "Injuries");
        map26.put("parent", "id_0_6");
        map26.put("value", 73);

        HashMap<String, Object> map27 = new HashMap<>();
        map27.put("id", "id_0_6_1");
        map27.put("name", "Communicable diseases");
        map27.put("parent", "id_0_6");
        map27.put("value", 123);

        HashMap<String, Object> map28 = new HashMap<>();
        map28.put("id", "id_0_6_2");
        map28.put("name", "Non-communicable diseases");
        map28.put("parent", "id_0_6");
        map28.put("value", 449);

        HashMap<String, Object> map29 = new HashMap<>();
        map29.put("id", "id_0_7");
        map29.put("name", "Nepal");
        map29.put("parent", "id_0");

        HashMap<String, Object> map30 = new HashMap<>();
        map30.put("id", "id_0_7_0");
        map30.put("name", "Non-communicable diseases");
        map30.put("parent", "id_0_7");
        map30.put("value", 678);

        HashMap<String, Object> map31 = new HashMap<>();
        map31.put("id", "id_0_7_1");
        map31.put("name", "Injuries");
        map31.put("parent", "id_0_7");
        map31.put("value", 89);

        HashMap<String, Object> map32 = new HashMap<>();
        map32.put("id", "id_0_7_2");
        map32.put("name", "Communicable diseases");
        map32.put("parent", "id_0_7");
        map32.put("value", 252);

        HashMap<String, Object> map33 = new HashMap<>();
        map33.put("id", "id_0_8");
        map33.put("name", "Timor-Leste");
        map33.put("parent", "id_0");

        HashMap<String, Object> map34 = new HashMap<>();
        map34.put("id", "id_0_8_0");
        map34.put("name", "Injuries");
        map34.put("parent", "id_0_8");
        map34.put("value", 69);

        HashMap<String, Object> map35 = new HashMap<>();
        map35.put("id", "id_0_8_1");
        map35.put("name", "Non-communicable diseases");
        map35.put("parent", "id_0_8");
        map35.put("value", 671);

        HashMap<String, Object> map36 = new HashMap<>();
        map36.put("id", "id_0_8_2");
        map36.put("name", "Communicable diseases");
        map36.put("parent", "id_0_8");
        map36.put("value", 344);

        HashMap<String, Object> map37 = new HashMap<>();
        map37.put("id", "id_0_9");
        map37.put("name", "India");
        map37.put("parent", "id_0");

        HashMap<String, Object> map38 = new HashMap<>();
        map38.put("id", "id_0_9_0");
        map38.put("name", "Communicable diseases");
        map38.put("parent", "id_0_9");
        map38.put("value", 253);

        HashMap<String, Object> map39 = new HashMap<>();
        map39.put("id", "id_0_9_1");
        map39.put("name", "Injuries");
        map39.put("parent", "id_0_9");
        map39.put("value", 116);

        HashMap<String, Object> map40 = new HashMap<>();
        map40.put("id", "id_0_9_2");
        map40.put("name", "Non-communicable diseases");
        map40.put("parent", "id_0_9");
        map40.put("value", 682);

        HashMap<String, Object> map41 = new HashMap<>();
        map41.put("id", "id_0_10");
        map41.put("name", "Indonesia");
        map41.put("parent", "id_0");

        HashMap<String, Object> map42 = new HashMap<>();
        map42.put("id", "id_0_10_0");
        map42.put("name", "Injuries");
        map42.put("parent", "id_0_10");
        map42.put("value", 49);

        HashMap<String, Object> map43 = new HashMap<>();
        map43.put("id", "id_0_10_1");
        map43.put("name", "Non-communicable diseases");
        map43.put("parent", "id_0_10");
        map43.put("value", 680);

        HashMap<String, Object> map44 = new HashMap<>();
        map44.put("id", "id_0_10_2");
        map44.put("name", "Communicable diseases");
        map44.put("parent", "id_0_10");
        map44.put("value", 162);

        HashMap<String, Object> map45 = new HashMap<>();
        map45.put("id", "id_0");
        map45.put("name", "South-East Asia");
        map45.put("color", "#7cb5ec");
        map45.put("value", 889);

        HashMap<String, Object> map46 = new HashMap<>();
        map46.put("id", "id_1_0");
        map46.put("name", "Hungary");
        map46.put("parent", "id_1");

        HashMap<String, Object> map47 = new HashMap<>();
        map47.put("id", "id_1_0_0");
        map47.put("name", "Communicable diseases");
        map47.put("parent", "id_1_0");
        map47.put("value", 17);

        HashMap<String, Object> map48 = new HashMap<>();
        map48.put("id", "id_1_0_1");
        map48.put("name", "Non-communicable diseases");
        map48.put("parent", "id_1_0");
        map48.put("value", 603);

        HashMap<String, Object> map49 = new HashMap<>();
        map49.put("id", "id_1_0_2");
        map49.put("name", "Injuries");
        map49.put("parent", "id_1_0");
        map49.put("value", 44);

        HashMap<String, Object> map50 = new HashMap<>();
        map50.put("id", "id_1_1");
        map50.put("name", "Poland");
        map50.put("parent", "id_1");

        HashMap<String, Object> map51 = new HashMap<>();
        map51.put("id", "id_1_1_0");
        map51.put("name", "Communicable diseases");
        map51.put("parent", "id_1_1");
        map51.put("value", 23);

        HashMap<String, Object> map52 = new HashMap<>();
        map52.put("id", "id_1_1_1");
        map52.put("name", "Non-communicable diseases");
        map52.put("parent", "id_1_1");
        map52.put("value", 495);

        HashMap<String, Object> map53 = new HashMap<>();
        map53.put("id", "id_1_1_2");
        map53.put("name", "Injuries");
        map53.put("parent", "id_1_1");
        map53.put("value", 49);

        HashMap<String, Object> map54 = new HashMap<>();
        map54.put("id", "id_1_2");
        map54.put("name", "Israel");
        map54.put("parent", "id_1");

        HashMap<String, Object> map55 = new HashMap<>();
        map55.put("id", "id_1_2_0");
        map55.put("name", "Communicable diseases");
        map55.put("parent", "id_1_2");
        map55.put("value", 31);

        HashMap<String, Object> map56 = new HashMap<>();
        map56.put("id", "id_1_2_1");
        map56.put("name", "Non-communicable diseases");
        map56.put("parent", "id_1_2");
        map56.put("value", 311);

        HashMap<String, Object> map57 = new HashMap<>();
        map57.put("id", "id_1_2_2");
        map57.put("name", "Injuries");
        map57.put("parent", "id_1_2");
        map57.put("value", 21);

        HashMap<String, Object> map58 = new HashMap<>();
        map58.put("id", "id_1_3");
        map58.put("name", "France");
        map58.put("parent", "id_1");

        HashMap<String, Object> map59 = new HashMap<>();
        map59.put("id", "id_1_3_0");
        map59.put("name", "Communicable diseases");
        map59.put("parent", "id_1_3");
        map59.put("value", 21);

        HashMap<String, Object> map60 = new HashMap<>();
        map60.put("id", "id_1_3_1");
        map60.put("name", "Non-communicable diseases");
        map60.put("parent", "id_1_3");
        map60.put("value", 313);

        HashMap<String, Object> map61 = new HashMap<>();
        map61.put("id", "id_1_3_2");
        map61.put("name", "Injuries");
        map61.put("parent", "id_1_3");
        map61.put("value", 35);

        HashMap<String, Object> map62 = new HashMap<>();
        map62.put("id", "id_1_4");
        map62.put("name", "Turkey");
        map62.put("parent", "id_1");

        HashMap<String, Object> map63 = new HashMap<>();
        map63.put("id", "id_1_4_0");
        map63.put("name", "Injuries");
        map63.put("parent", "id_1_4");
        map63.put("value", 39);

        HashMap<String, Object> map64 = new HashMap<>();
        map64.put("id", "id_1_4_1");
        map64.put("name", "Communicable diseases");
        map64.put("parent", "id_1_4");
        map64.put("value", 44);

        HashMap<String, Object> map65 = new HashMap<>();
        map65.put("id", "id_1_4_2");
        map65.put("name", "Non-communicable diseases");
        map65.put("parent", "id_1_4");
        map65.put("value", 555);

        HashMap<String, Object> map66 = new HashMap<>();
        map66.put("id", "id_1_5");
        map66.put("name", "Kyrgyzstan");
        map66.put("parent", "id_1");

        HashMap<String, Object> map67 = new HashMap<>();
        map67.put("id", "id_1_5_0");
        map67.put("name", "Communicable diseases");
        map67.put("parent", "id_1_5");
        map67.put("value", 66);

        HashMap<String, Object> map68 = new HashMap<>();
        map68.put("id", "id_1_5_1");
        map68.put("name", "Injuries");
        map68.put("parent", "id_1_5");
        map68.put("value", 65);

        HashMap<String, Object> map69 = new HashMap<>();
        map69.put("id", "id_1_5_2");
        map69.put("name", "Non-communicable diseases");
        map69.put("parent", "id_1_5");
        map69.put("value", 835);

        HashMap<String, Object> map70 = new HashMap<>();
        map70.put("id", "id_1_6");
        map70.put("name", "Croatia");
        map70.put("parent", "id_1");

        HashMap<String, Object> map71 = new HashMap<>();
        map71.put("id", "id_1_6_0");
        map71.put("name", "Communicable diseases");
        map71.put("parent", "id_1_6");
        map71.put("value", 12);

        HashMap<String, Object> map72 = new HashMap<>();
        map72.put("id", "id_1_6_1");
        map72.put("name", "Non-communicable diseases");
        map72.put("parent", "id_1_6");
        map72.put("value", 496);

        HashMap<String, Object> map73 = new HashMap<>();
        map73.put("id", "id_1_6_2");
        map73.put("name", "Injuries");
        map73.put("parent", "id_1_6");
        map73.put("value", 40);

        HashMap<String, Object> map74 = new HashMap<>();
        map74.put("id", "id_1_7");
        map74.put("name", "Portugal");
        map74.put("parent", "id_1");

        HashMap<String, Object> map75 = new HashMap<>();
        map75.put("id", "id_1_7_0");
        map75.put("name", "Injuries");
        map75.put("parent", "id_1_7");
        map75.put("value", 25);

        HashMap<String, Object> map76 = new HashMap<>();
        map76.put("id", "id_1_7_1");
        map76.put("name", "Communicable diseases");
        map76.put("parent", "id_1_7");
        map76.put("value", 40);

        HashMap<String, Object> map77 = new HashMap<>();
        map77.put("id", "id_1_7_2");
        map77.put("name", "Non-communicable diseases");
        map77.put("parent", "id_1_7");
        map77.put("value", 343);

        HashMap<String, Object> map78 = new HashMap<>();
        map78.put("id", "id_1_8");
        map78.put("name", "Greece");
        map78.put("parent", "id_1");

        HashMap<String, Object> map79 = new HashMap<>();
        map79.put("id", "id_1_8_0");
        map79.put("name", "Injuries");
        map79.put("parent", "id_1_8");
        map79.put("value", 27);

        HashMap<String, Object> map80 = new HashMap<>();
        map80.put("id", "id_1_8_1");
        map80.put("name", "Non-communicable diseases");
        map80.put("parent", "id_1_8");
        map80.put("value", 365);

        HashMap<String, Object> map81 = new HashMap<>();
        map81.put("id", "id_1_8_2");
        map81.put("name", "Communicable diseases");
        map81.put("parent", "id_1_8");
        map81.put("value", 24);

        HashMap<String, Object> map82 = new HashMap<>();
        map82.put("id", "id_1_9");
        map82.put("name", "Italy");
        map82.put("parent", "id_1");

        HashMap<String, Object> map83 = new HashMap<>();
        map83.put("id", "id_1_9_0");
        map83.put("name", "Injuries");
        map83.put("parent", "id_1_9");
        map83.put("value", 20);

        HashMap<String, Object> map84 = new HashMap<>();
        map84.put("id", "id_1_9_1");
        map84.put("name", "Communicable diseases");
        map84.put("parent", "id_1_9");
        map84.put("value", 16);

        HashMap<String, Object> map85 = new HashMap<>();
        map85.put("id", "id_1_9_2");
        map85.put("name", "Non-communicable diseases");
        map85.put("parent", "id_1_9");
        map85.put("value", 304);

        HashMap<String, Object> map86 = new HashMap<>();
        map86.put("id", "id_1_10");
        map86.put("name", "Belgium");
        map86.put("parent", "id_1");

        HashMap<String, Object> map87 = new HashMap<>();
        map87.put("id", "id_1_10_0");
        map87.put("name", "Communicable diseases");
        map87.put("parent", "id_1_10");
        map87.put("value", 28);

        HashMap<String, Object> map88 = new HashMap<>();
        map88.put("id", "id_1_10_1");
        map88.put("name", "Injuries");
        map88.put("parent", "id_1_10");
        map88.put("value", 39);

        HashMap<String, Object> map89 = new HashMap<>();
        map89.put("id", "id_1_10_2");
        map89.put("name", "Non-communicable diseases");
        map89.put("parent", "id_1_10");
        map89.put("value", 357);

        HashMap<String, Object> map90 = new HashMap<>();
        map90.put("id", "id_1_11");
        map90.put("name", "Lithuania");
        map90.put("parent", "id_1");

        HashMap<String, Object> map91 = new HashMap<>();
        map91.put("id", "id_1_11_0");
        map91.put("name", "Non-communicable diseases");
        map91.put("parent", "id_1_11");
        map91.put("value", 581);

        HashMap<String, Object> map92 = new HashMap<>();
        map92.put("id", "id_1_11_1");
        map92.put("name", "Communicable diseases");
        map92.put("parent", "id_1_11");
        map92.put("value", 26);

        HashMap<String, Object> map93 = new HashMap<>();
        map93.put("id", "id_1_11_2");
        map93.put("name", "Injuries");
        map93.put("parent", "id_1_11");
        map93.put("value", 76);

        HashMap<String, Object> map94 = new HashMap<>();
        map94.put("id", "id_1_12");
        map94.put("name", "Uzbekistan");
        map94.put("parent", "id_1");

        HashMap<String, Object> map95 = new HashMap<>();
        map95.put("id", "id_1_12_0");
        map95.put("name", "Communicable diseases");
        map95.put("parent", "id_1_12");
        map95.put("value", 86);

        HashMap<String, Object> map96 = new HashMap<>();
        map96.put("id", "id_1_12_1");
        map96.put("name", "Injuries");
        map96.put("parent", "id_1_12");
        map96.put("value", 47);

        HashMap<String, Object> map97 = new HashMap<>();
        map97.put("id", "id_1_12_2");
        map97.put("name", "Non-communicable diseases");
        map97.put("parent", "id_1_12");
        map97.put("value", 811);

        HashMap<String, Object> map98 = new HashMap<>();
        map98.put("id", "id_1_13");
        map98.put("name", "Serbia");
        map98.put("parent", "id_1");

        HashMap<String, Object> map99 = new HashMap<>();
        map99.put("id", "id_1_13_0");
        map99.put("name", "Communicable diseases");
        map99.put("parent", "id_1_13");
        map99.put("value", 19);

        HashMap<String, Object> map100 = new HashMap<>();
        map100.put("id", "id_1_13_1");
        map100.put("name", "Injuries");
        map100.put("parent", "id_1_13");
        map100.put("value", 32);

        HashMap<String, Object> map101 = new HashMap<>();
        map101.put("id", "id_1_13_2");
        map101.put("name", "Non-communicable diseases");
        map101.put("parent", "id_1_13");
        map101.put("value", 658);

        HashMap<String, Object> map102 = new HashMap<>();
        map102.put("id", "id_1_14");
        map102.put("name", "Austria");
        map102.put("parent", "id_1");

        HashMap<String, Object> map103 = new HashMap<>();
        map103.put("id", "id_1_14_0");
        map103.put("name", "Non-communicable diseases");
        map103.put("parent", "id_1_14");
        map103.put("value", 360);

        HashMap<String, Object> map104 = new HashMap<>();
        map104.put("id", "id_1_14_1");
        map104.put("name", "Injuries");
        map104.put("parent", "id_1_14");
        map104.put("value", 31);

        HashMap<String, Object> map105 = new HashMap<>();
        map105.put("id", "id_1_14_2");
        map105.put("name", "Communicable diseases");
        map105.put("parent", "id_1_14");
        map105.put("value", 13);

        HashMap<String, Object> map106 = new HashMap<>();
        map106.put("id", "id_1_15");
        map106.put("name", "Bosnia and Herzegovina");
        map106.put("parent", "id_1");

        HashMap<String, Object> map107 = new HashMap<>();
        map107.put("id", "id_1_15_0");
        map107.put("name", "Injuries");
        map107.put("parent", "id_1_15");
        map107.put("value", 42);

        HashMap<String, Object> map108 = new HashMap<>();
        map108.put("id", "id_1_15_1");
        map108.put("name", "Non-communicable diseases");
        map108.put("parent", "id_1_15");
        map108.put("value", 513);

        HashMap<String, Object> map109 = new HashMap<>();
        map109.put("id", "id_1_15_2");
        map109.put("name", "Communicable diseases");
        map109.put("parent", "id_1_15");
        map109.put("value", 20);

        HashMap<String, Object> map110 = new HashMap<>();
        map110.put("id", "id_1_16");
        map110.put("name", "Slovakia");
        map110.put("parent", "id_1");

        HashMap<String, Object> map111 = new HashMap<>();
        map111.put("id", "id_1_16_0");
        map111.put("name", "Injuries");
        map111.put("parent", "id_1_16");
        map111.put("value", 39);

        HashMap<String, Object> map112 = new HashMap<>();
        map112.put("id", "id_1_16_1");
        map112.put("name", "Communicable diseases");
        map112.put("parent", "id_1_16");
        map112.put("value", 35);

        HashMap<String, Object> map113 = new HashMap<>();
        map113.put("id", "id_1_16_2");
        map113.put("name", "Non-communicable diseases");
        map113.put("parent", "id_1_16");
        map113.put("value", 533);

        HashMap<String, Object> map114 = new HashMap<>();
        map114.put("id", "id_1_17");
        map114.put("name", "The former Yugoslav republic of Macedonia");
        map114.put("parent", "id_1");

        HashMap<String, Object> map115 = new HashMap<>();
        map115.put("id", "id_1_17_0");
        map115.put("name", "Injuries");
        map115.put("parent", "id_1_17");
        map115.put("value", 24);

        HashMap<String, Object> map116 = new HashMap<>();
        map116.put("id", "id_1_17_1");
        map116.put("name", "Communicable diseases");
        map116.put("parent", "id_1_17");
        map116.put("value", 17);

        HashMap<String, Object> map117 = new HashMap<>();
        map117.put("id", "id_1_17_2");
        map117.put("name", "Non-communicable diseases");
        map117.put("parent", "id_1_17");
        map117.put("value", 637);

        HashMap<String, Object> map118 = new HashMap<>();
        map118.put("id", "id_1_18");
        map118.put("name", "Sweden");
        map118.put("parent", "id_1");

        HashMap<String, Object> map119 = new HashMap<>();
        map119.put("id", "id_1_18_0");
        map119.put("name", "Communicable diseases");
        map119.put("parent", "id_1_18");
        map119.put("value", 19);

        HashMap<String, Object> map120 = new HashMap<>();
        map120.put("id", "id_1_18_1");
        map120.put("name", "Non-communicable diseases");
        map120.put("parent", "id_1_18");
        map120.put("value", 334);

        HashMap<String, Object> map121 = new HashMap<>();
        map121.put("id", "id_1_18_2");
        map121.put("name", "Injuries");
        map121.put("parent", "id_1_18");
        map121.put("value", 26);

        HashMap<String, Object> map122 = new HashMap<>();
        map122.put("id", "id_1_19");
        map122.put("name", "Russian Federation");
        map122.put("parent", "id_1");

        HashMap<String, Object> map123 = new HashMap<>();
        map123.put("id", "id_1_19_0");
        map123.put("name", "Non-communicable diseases");
        map123.put("parent", "id_1_19");
        map123.put("value", 790);

        HashMap<String, Object> map124 = new HashMap<>();
        map124.put("id", "id_1_19_1");
        map124.put("name", "Communicable diseases");
        map124.put("parent", "id_1_19");
        map124.put("value", 74);

        HashMap<String, Object> map125 = new HashMap<>();
        map125.put("id", "id_1_19_2");
        map125.put("name", "Injuries");
        map125.put("parent", "id_1_19");
        map125.put("value", 103);

        HashMap<String, Object> map126 = new HashMap<>();
        map126.put("id", "id_1_20");
        map126.put("name", "Republic of Moldova");
        map126.put("parent", "id_1");

        HashMap<String, Object> map127 = new HashMap<>();
        map127.put("id", "id_1_20_0");
        map127.put("name", "Non-communicable diseases");
        map127.put("parent", "id_1_20");
        map127.put("value", 788);

        HashMap<String, Object> map128 = new HashMap<>();
        map128.put("id", "id_1_20_1");
        map128.put("name", "Injuries");
        map128.put("parent", "id_1_20");
        map128.put("value", 76);

        HashMap<String, Object> map129 = new HashMap<>();
        map129.put("id", "id_1_20_2");
        map129.put("name", "Communicable diseases");
        map129.put("parent", "id_1_20");
        map129.put("value", 45);

        HashMap<String, Object> map130 = new HashMap<>();
        map130.put("id", "id_1_21");
        map130.put("name", "Ireland");
        map130.put("parent", "id_1");

        HashMap<String, Object> map131 = new HashMap<>();
        map131.put("id", "id_1_21_0");
        map131.put("name", "Injuries");
        map131.put("parent", "id_1_21");
        map131.put("value", 32);

        HashMap<String, Object> map132 = new HashMap<>();
        map132.put("id", "id_1_21_1");
        map132.put("name", "Communicable diseases");
        map132.put("parent", "id_1_21");
        map132.put("value", 22);

        HashMap<String, Object> map133 = new HashMap<>();
        map133.put("id", "id_1_21_2");
        map133.put("name", "Non-communicable diseases");
        map133.put("parent", "id_1_21");
        map133.put("value", 344);

        HashMap<String, Object> map134 = new HashMap<>();
        map134.put("id", "id_1_22");
        map134.put("name", "Estonia");
        map134.put("parent", "id_1");

        HashMap<String, Object> map135 = new HashMap<>();
        map135.put("id", "id_1_22_0");
        map135.put("name", "Injuries");
        map135.put("parent", "id_1_22");
        map135.put("value", 47);

        HashMap<String, Object> map136 = new HashMap<>();
        map136.put("id", "id_1_22_1");
        map136.put("name", "Communicable diseases");
        map136.put("parent", "id_1_22");
        map136.put("value", 19);

        HashMap<String, Object> map137 = new HashMap<>();
        map137.put("id", "id_1_22_2");
        map137.put("name", "Non-communicable diseases");
        map137.put("parent", "id_1_22");
        map137.put("value", 511);

        HashMap<String, Object> map138 = new HashMap<>();
        map138.put("id", "id_1_23");
        map138.put("name", "Cyprus");
        map138.put("parent", "id_1");

        HashMap<String, Object> map139 = new HashMap<>();
        map139.put("id", "id_1_23_0");
        map139.put("name", "Non-communicable diseases");
        map139.put("parent", "id_1_23");
        map139.put("value", 333);

        HashMap<String, Object> map140 = new HashMap<>();
        map140.put("id", "id_1_23_1");
        map140.put("name", "Injuries");
        map140.put("parent", "id_1_23");
        map140.put("value", 27);

        HashMap<String, Object> map141 = new HashMap<>();
        map141.put("id", "id_1_23_2");
        map141.put("name", "Communicable diseases");
        map141.put("parent", "id_1_23");
        map141.put("value", 16);

        HashMap<String, Object> map142 = new HashMap<>();
        map142.put("id", "id_1_24");
        map142.put("name", "Kazakhstan");
        map142.put("parent", "id_1");

        HashMap<String, Object> map143 = new HashMap<>();
        map143.put("id", "id_1_24_0");
        map143.put("name", "Non-communicable diseases");
        map143.put("parent", "id_1_24");
        map143.put("value", 950);

        HashMap<String, Object> map144 = new HashMap<>();
        map144.put("id", "id_1_24_1");
        map144.put("name", "Injuries");
        map144.put("parent", "id_1_24");
        map144.put("value", 102);

        HashMap<String, Object> map145 = new HashMap<>();
        map145.put("id", "id_1_24_2");
        map145.put("name", "Communicable diseases");
        map145.put("parent", "id_1_24");
        map145.put("value", 55);

        HashMap<String, Object> map146 = new HashMap<>();
        map146.put("id", "id_1_25");
        map146.put("name", "Netherlands");
        map146.put("parent", "id_1");

        HashMap<String, Object> map147 = new HashMap<>();
        map147.put("id", "id_1_25_0");
        map147.put("name", "Non-communicable diseases");
        map147.put("parent", "id_1_25");
        map147.put("value", 355);

        HashMap<String, Object> map148 = new HashMap<>();
        map148.put("id", "id_1_25_1");
        map148.put("name", "Injuries");
        map148.put("parent", "id_1_25");
        map148.put("value", 22);

        HashMap<String, Object> map149 = new HashMap<>();
        map149.put("id", "id_1_25_2");
        map149.put("name", "Communicable diseases");
        map149.put("parent", "id_1_25");
        map149.put("value", 26);

        HashMap<String, Object> map150 = new HashMap<>();
        map150.put("id", "id_1_26");
        map150.put("name", "Finland");
        map150.put("parent", "id_1");

        HashMap<String, Object> map151 = new HashMap<>();
        map151.put("id", "id_1_26_0");
        map151.put("name", "Non-communicable diseases");
        map151.put("parent", "id_1_26");
        map151.put("value", 367);

        HashMap<String, Object> map152 = new HashMap<>();
        map152.put("id", "id_1_26_1");
        map152.put("name", "Injuries");
        map152.put("parent", "id_1_26");
        map152.put("value", 39);

        HashMap<String, Object> map153 = new HashMap<>();
        map153.put("id", "id_1_26_2");
        map153.put("name", "Communicable diseases");
        map153.put("parent", "id_1_26");
        map153.put("value", 9);

        HashMap<String, Object> map154 = new HashMap<>();
        map154.put("id", "id_1_27");
        map154.put("name", "Romania");
        map154.put("parent", "id_1");

        HashMap<String, Object> map155 = new HashMap<>();
        map155.put("id", "id_1_27_0");
        map155.put("name", "Non-communicable diseases");
        map155.put("parent", "id_1_27");
        map155.put("value", 612);

        HashMap<String, Object> map156 = new HashMap<>();
        map156.put("id", "id_1_27_1");
        map156.put("name", "Injuries");
        map156.put("parent", "id_1_27");
        map156.put("value", 41);

        HashMap<String, Object> map157 = new HashMap<>();
        map157.put("id", "id_1_27_2");
        map157.put("name", "Communicable diseases");
        map157.put("parent", "id_1_27");
        map157.put("value", 39);

        HashMap<String, Object> map158 = new HashMap<>();
        map158.put("id", "id_1_28");
        map158.put("name", "Albania");
        map158.put("parent", "id_1");

        HashMap<String, Object> map159 = new HashMap<>();
        map159.put("id", "id_1_28_0");
        map159.put("name", "Non-communicable diseases");
        map159.put("parent", "id_1_28");
        map159.put("value", 672);

        HashMap<String, Object> map160 = new HashMap<>();
        map160.put("id", "id_1_28_1");
        map160.put("name", "Injuries");
        map160.put("parent", "id_1_28");
        map160.put("value", 48);

        HashMap<String, Object> map161 = new HashMap<>();
        map161.put("id", "id_1_28_2");
        map161.put("name", "Communicable diseases");
        map161.put("parent", "id_1_28");
        map161.put("value", 47);

        HashMap<String, Object> map162 = new HashMap<>();
        map162.put("id", "id_1_29");
        map162.put("name", "Iceland");
        map162.put("parent", "id_1");

        HashMap<String, Object> map163 = new HashMap<>();
        map163.put("id", "id_1_29_0");
        map163.put("name", "Injuries");
        map163.put("parent", "id_1_29");
        map163.put("value", 29);

        HashMap<String, Object> map164 = new HashMap<>();
        map164.put("id", "id_1_29_1");
        map164.put("name", "Non-communicable diseases");
        map164.put("parent", "id_1_29");
        map164.put("value", 312);

        HashMap<String, Object> map165 = new HashMap<>();
        map165.put("id", "id_1_29_2");
        map165.put("name", "Communicable diseases");
        map165.put("parent", "id_1_29");
        map165.put("value", 14);

        HashMap<String, Object> map166 = new HashMap<>();
        map166.put("id", "id_1_30");
        map166.put("name", "Azerbaijan");
        map166.put("parent", "id_1");

        HashMap<String, Object> map167 = new HashMap<>();
        map167.put("id", "id_1_30_0");
        map167.put("name", "Non-communicable diseases");
        map167.put("parent", "id_1_30");
        map167.put("value", 664);

        HashMap<String, Object> map168 = new HashMap<>();
        map168.put("id", "id_1_30_1");
        map168.put("name", "Injuries");
        map168.put("parent", "id_1_30");
        map168.put("value", 34);

        HashMap<String, Object> map169 = new HashMap<>();
        map169.put("id", "id_1_30_2");
        map169.put("name", "Communicable diseases");
        map169.put("parent", "id_1_30");
        map169.put("value", 71);

        HashMap<String, Object> map170 = new HashMap<>();
        map170.put("id", "id_1_31");
        map170.put("name", "Tajikistan");
        map170.put("parent", "id_1");

        HashMap<String, Object> map171 = new HashMap<>();
        map171.put("id", "id_1_31_0");
        map171.put("name", "Injuries");
        map171.put("parent", "id_1_31");
        map171.put("value", 52);

        HashMap<String, Object> map172 = new HashMap<>();
        map172.put("id", "id_1_31_1");
        map172.put("name", "Communicable diseases");
        map172.put("parent", "id_1_31");
        map172.put("value", 148);

        HashMap<String, Object> map173 = new HashMap<>();
        map173.put("id", "id_1_31_2");
        map173.put("name", "Non-communicable diseases");
        map173.put("parent", "id_1_31");
        map173.put("value", 753);

        HashMap<String, Object> map174 = new HashMap<>();
        map174.put("id", "id_1_32");
        map174.put("name", "Bulgaria");
        map174.put("parent", "id_1");

        HashMap<String, Object> map175 = new HashMap<>();
        map175.put("id", "id_1_32_0");
        map175.put("name", "Communicable diseases");
        map175.put("parent", "id_1_32");
        map175.put("value", 33);

        HashMap<String, Object> map176 = new HashMap<>();
        map176.put("id", "id_1_32_1");
        map176.put("name", "Injuries");
        map176.put("parent", "id_1_32");
        map176.put("value", 36);

        HashMap<String, Object> map177 = new HashMap<>();
        map177.put("id", "id_1_32_2");
        map177.put("name", "Non-communicable diseases");
        map177.put("parent", "id_1_32");
        map177.put("value", 638);

        HashMap<String, Object> map178 = new HashMap<>();
        map178.put("id", "id_1_33");
        map178.put("name", "United Kingdom of Great Britain and Northern Ireland");
        map178.put("parent", "id_1");

        HashMap<String, Object> map179 = new HashMap<>();
        map1.put("id", "id_1_33_0");
        map1.put("name", "Communicable diseases");
        map1.put("parent", "id_1_33");
        map1.put("value", 29);

        HashMap<String, Object> map180 = new HashMap<>();
        map180.put("id", "id_1_33_1");
        map180.put("name", "Injuries");
        map180.put("parent", "id_1_33");
        map180.put("value", 22);

        HashMap<String, Object> map181 = new HashMap<>();
        map181.put("id", "id_1_33_2");
        map181.put("name", "Non-communicable diseases");
        map181.put("parent", "id_1_33");
        map181.put("value", 359);

        HashMap<String, Object> map182 = new HashMap<>();
        map182.put("id", "id_1_34");
        map182.put("name", "Spain");
        map182.put("parent", "id_1");

        HashMap<String, Object> map183 = new HashMap<>();
        map183.put("id", "id_1_34_0");
        map183.put("name", "Communicable diseases");
        map183.put("parent", "id_1_34");
        map183.put("value", 19);

        HashMap<String, Object> map184 = new HashMap<>();
        map184.put("id", "id_1_34_1");
        map184.put("name", "Injuries");
        map184.put("parent", "id_1_34");
        map184.put("value", 18);

        HashMap<String, Object> map185 = new HashMap<>();
        map185.put("id", "id_1_34_2");
        map185.put("name", "Non-communicable diseases");
        map185.put("parent", "id_1_34");
        map185.put("value", 323);

        HashMap<String, Object> map694 = new HashMap<>();
        map694.put("id", "id_1_35");
        map694.put("name", "Ukraine");
        map694.put("parent", "id_1");

        HashMap<String, Object> map186 = new HashMap<>();
        map186.put("id", "id_1_35_0");
        map186.put("name", "Communicable diseases");
        map186.put("parent", "id_1_35");
        map186.put("value", 69);

        HashMap<String, Object> map187 = new HashMap<>();
        map187.put("id", "id_1_35_1");
        map187.put("name", "Injuries");
        map187.put("parent", "id_1_35");
        map187.put("value", 67);

        HashMap<String, Object> map188 = new HashMap<>();
        map188.put("id", "id_1_35_2");
        map188.put("name", "Non-communicable diseases");
        map188.put("parent", "id_1_35");
        map188.put("value", 749);

        HashMap<String, Object> map189 = new HashMap<>();
        map189.put("id", "id_1_36");
        map189.put("name", "Norway");
        map189.put("parent", "id_1");

        HashMap<String, Object> map190 = new HashMap<>();
        map190.put("id", "id_1_36_0");
        map190.put("name", "Non-communicable diseases");
        map190.put("parent", "id_1_36");
        map190.put("value", 337);

        HashMap<String, Object> map191 = new HashMap<>();
        map191.put("id", "id_1_36_1");
        map191.put("name", "Communicable diseases");
        map191.put("parent", "id_1_36");
        map191.put("value", 25);

        HashMap<String, Object> map192 = new HashMap<>();
        map192.put("id", "id_1_36_2");
        map192.put("name", "Injuries");
        map192.put("parent", "id_1_36");
        map192.put("value", 26);

        HashMap<String, Object> map193 = new HashMap<>();
        map193.put("id", "id_1_37");
        map193.put("name", "Denmark");
        map193.put("parent", "id_1");

        HashMap<String, Object> map194 = new HashMap<>();
        map194.put("id", "id_1_37_0");
        map194.put("name", "Injuries");
        map194.put("parent", "id_1_37");
        map194.put("value", 23);

        HashMap<String, Object> map195 = new HashMap<>();
        map195.put("id", "id_1_37_1");
        map195.put("name", "Communicable diseases");
        map195.put("parent", "id_1_37");
        map195.put("value", 30);

        HashMap<String, Object> map196 = new HashMap<>();
        map196.put("id", "id_1_37_2");
        map196.put("name", "Non-communicable diseases");
        map196.put("parent", "id_1_37");
        map196.put("value", 406);

        HashMap<String, Object> map197 = new HashMap<>();
        map197.put("id", "id_1_38");
        map197.put("name", "Belarus");
        map197.put("parent", "id_1");

        HashMap<String, Object> map198 = new HashMap<>();
        map198.put("id", "id_1_38_0");
        map198.put("name", "Non-communicable diseases");
        map198.put("parent", "id_1_38");
        map198.put("value", 683);

        HashMap<String, Object> map199 = new HashMap<>();
        map199.put("id", "id_1_38_1");
        map199.put("name", "Communicable diseases");
        map199.put("parent", "id_1_38");
        map199.put("value", 28);

        HashMap<String, Object> map200 = new HashMap<>();
        map200.put("id", "id_1_38_2");
        map200.put("name", "Injuries");
        map200.put("parent", "id_1_38");
        map200.put("value", 91);

        HashMap<String, Object> map201 = new HashMap<>();
        map201.put("id", "id_1_39");
        map201.put("name", "Malta");
        map201.put("parent", "id_1");

        HashMap<String, Object> map202 = new HashMap<>();
        map202.put("id", "id_1_39_0");
        map202.put("name", "Non-communicable diseases");
        map202.put("parent", "id_1_39");
        map202.put("value", 365);

        HashMap<String, Object> map203 = new HashMap<>();
        map203.put("id", "id_1_39_1");
        map203.put("name", "Injuries");
        map203.put("parent", "id_1_39");
        map203.put("value", 19);

        HashMap<String, Object> map204 = new HashMap<>();
        map204.put("id", "id_1_39_2");
        map204.put("name", "Communicable diseases");
        map204.put("parent", "id_1_39");
        map204.put("value", 24);

        HashMap<String, Object> map205 = new HashMap<>();
        map205.put("id", "id_1_40");
        map205.put("name", "Latvia");
        map205.put("parent", "id_1");

        HashMap<String, Object> map206 = new HashMap<>();
        map206.put("id", "id_1_40_0");
        map206.put("name", "Non-communicable diseases");
        map206.put("parent", "id_1_40");
        map206.put("value", 624);

        HashMap<String, Object> map207 = new HashMap<>();
        map207.put("id", "id_1_40_1");
        map207.put("name", "Injuries");
        map207.put("parent", "id_1_40");
        map207.put("value", 55);

        HashMap<String, Object> map208 = new HashMap<>();
        map208.put("id", "id_1_40_2");
        map208.put("name", "Communicable diseases");
        map208.put("parent", "id_1_40");
        map208.put("value", 26);

        HashMap<String, Object> map209 = new HashMap<>();
        map209.put("id", "id_1_41");
        map209.put("name", "Turkmenistan");
        map209.put("parent", "id_1");

        HashMap<String, Object> map210 = new HashMap<>();
        map210.put("id", "id_1_41_0");
        map210.put("name", "Injuries");
        map210.put("parent", "id_1_41");
        map210.put("value", 93);

        HashMap<String, Object> map211 = new HashMap<>();
        map211.put("id", "id_1_41_1");
        map211.put("name", "Communicable diseases");
        map211.put("parent", "id_1_41");
        map211.put("value", 116);

        HashMap<String, Object> map212 = new HashMap<>();
        map212.put("id", "id_1_41_2");
        map212.put("name", "Non-communicable diseases");
        map212.put("parent", "id_1_41");
        map212.put("value", 1025);

        HashMap<String, Object> map213 = new HashMap<>();
        map213.put("id", "id_1_42");
        map213.put("name", "Switzerland");
        map213.put("parent", "id_1");

        HashMap<String, Object> map214 = new HashMap<>();
        map214.put("id", "id_1_42_0");
        map214.put("name", "Communicable diseases");
        map214.put("parent", "id_1_42");
        map214.put("value", 15);

        HashMap<String, Object> map215 = new HashMap<>();
        map215.put("id", "id_1_42_1");
        map215.put("name", "Non-communicable diseases");
        map215.put("parent", "id_1_42");
        map215.put("value", 292);

        HashMap<String, Object> map216 = new HashMap<>();
        map216.put("id", "id_1_42_2");
        map216.put("name", "Injuries");
        map216.put("parent", "id_1_42");
        map216.put("value", 25);

        HashMap<String, Object> map217 = new HashMap<>();
        map217.put("id", "id_1_43");
        map217.put("name", "Luxembourg");
        map217.put("parent", "id_1");

        HashMap<String, Object> map218 = new HashMap<>();
        map218.put("id", "id_1_43_0");
        map218.put("name", "Injuries");
        map218.put("parent", "id_1_43");
        map218.put("value", 31);

        HashMap<String, Object> map219 = new HashMap<>();
        map219.put("id", "id_1_43_1");
        map219.put("name", "Non-communicable diseases");
        map219.put("parent", "id_1_43");
        map219.put("value", 318);

        HashMap<String, Object> map220 = new HashMap<>();
        map220.put("id", "id_1_43_2");
        map220.put("name", "Communicable diseases");
        map220.put("parent", "id_1_43");
        map220.put("value", 21);

        HashMap<String, Object> map221 = new HashMap<>();
        map221.put("id", "id_1_44");
        map221.put("name", "Georgia");
        map221.put("parent", "id_1");

        HashMap<String, Object> map222 = new HashMap<>();
        map222.put("id", "id_1_44_0");
        map222.put("name", "Injuries");
        map222.put("parent", "id_1_44");
        map222.put("value", 32);

        HashMap<String, Object> map223 = new HashMap<>();
        map223.put("id", "id_1_44_1");
        map223.put("name", "Communicable diseases");
        map223.put("parent", "id_1_44");
        map223.put("value", 39);

        HashMap<String, Object> map224 = new HashMap<>();
        map224.put("id", "id_1_44_2");
        map224.put("name", "Non-communicable diseases");
        map224.put("parent", "id_1_44");
        map224.put("value", 615);

        HashMap<String, Object> map225 = new HashMap<>();
        map225.put("id", "id_1_45");
        map225.put("name", "Slovenia");
        map225.put("parent", "id_1");

        HashMap<String, Object> map226 = new HashMap<>();
        map226.put("id", "id_1_45_0");
        map226.put("name", "Non-communicable diseases");
        map226.put("parent", "id_1_45");
        map226.put("value", 369);

        HashMap<String, Object> map227 = new HashMap<>();
        map227.put("id", "id_1_45_1");
        map227.put("name", "Communicable diseases");
        map227.put("parent", "id_1_45");
        map227.put("value", 15);

        HashMap<String, Object> map228 = new HashMap<>();
        map228.put("id", "id_1_45_2");
        map228.put("name", "Injuries");
        map228.put("parent", "id_1_45");
        map228.put("value", 44);

        HashMap<String, Object> map229 = new HashMap<>();
        map229.put("id", "id_1_46");
        map229.put("name", "Montenegro");
        map229.put("parent", "id_1");

        HashMap<String, Object> map230 = new HashMap<>();
        map230.put("id", "id_1_46_0");
        map230.put("name", "Communicable diseases");
        map230.put("parent", "id_1_46");
        map230.put("value", 19);

        HashMap<String, Object> map231 = new HashMap<>();
        map231.put("id", "id_1_46_1");
        map231.put("name", "Non-communicable diseases");
        map231.put("parent", "id_1_46");
        map231.put("value", 572);

        HashMap<String, Object> map232 = new HashMap<>();
        map232.put("id", "id_1_46_2");
        map232.put("name", "Injuries");
        map232.put("parent", "id_1_46");
        map232.put("value", 41);

        HashMap<String, Object> map233 = new HashMap<>();
        map233.put("id", "id_1_47");
        map233.put("name", "Armenia");
        map233.put("parent", "id_1");

        HashMap<String, Object> map234 = new HashMap<>();
        map234.put("id", "id_1_47_0");
        map234.put("name", "Non-communicable diseases");
        map234.put("parent", "id_1_47");
        map234.put("value", 848);

        HashMap<String, Object> map235 = new HashMap<>();
        map235.put("id", "id_1_47_1");
        map235.put("name", "Communicable diseases");
        map235.put("parent", "id_1_47");
        map235.put("value", 45);

        HashMap<String, Object> map236 = new HashMap<>();
        map236.put("id", "id_1_47_2");
        map236.put("name", "Injuries");
        map236.put("parent", "id_1_47");
        map236.put("value", 49);

        HashMap<String, Object> map237 = new HashMap<>();
        map237.put("id", "id_1_48");
        map237.put("name", "Germany");
        map237.put("parent", "id_1");

        HashMap<String, Object> map238 = new HashMap<>();
        map238.put("id", "id_1_48_0");
        map238.put("name", "Injuries");
        map238.put("parent", "id_1_48");
        map238.put("value", 23);

        HashMap<String, Object> map239 = new HashMap<>();
        map239.put("id", "id_1_48_1");
        map239.put("name", "Communicable diseases");
        map239.put("parent", "id_1_48");
        map239.put("value", 22);

        HashMap<String, Object> map240 = new HashMap<>();
        map240.put("id", "id_1_48_2");
        map240.put("name", "Non-communicable diseases");
        map240.put("parent", "id_1_48");
        map240.put("value", 365);

        HashMap<String, Object> map241 = new HashMap<>();
        map241.put("id", "id_1_49");
        map241.put("name", "Czech Republic");
        map241.put("parent", "id_1");

        HashMap<String, Object> map242 = new HashMap<>();
        map242.put("id", "id_1_49_0");
        map242.put("name", "Injuries");
        map242.put("parent", "id_1_49");
        map242.put("value", 39);

        HashMap<String, Object> map243 = new HashMap<>();
        map243.put("id", "id_1_49_1");
        map243.put("name", "Non-communicable diseases");
        map243.put("parent", "id_1_49");
        map243.put("value", 461);

        HashMap<String, Object> map244 = new HashMap<>();
        map244.put("id", "id_1_49_2");
        map244.put("name", "Communicable diseases");
        map244.put("parent", "id_1_49");
        map244.put("value", 27);

        HashMap<String, Object> map245 = new HashMap<>();
        map245.put("id", "id_1");
        map245.put("name", "Europe");
        map245.put("color", "#434348");
        map245.put("value", 601);

        HashMap<String, Object> map246 = new HashMap<>();
        map246.put("id", "id_2_0");
        map246.put("name", "Equatorial Guinea");
        map246.put("parent", "id_2");

        HashMap<String, Object> map247 = new HashMap<>();
        map247.put("id", "id_2_0_0");
        map247.put("name", "Communicable diseases");
        map247.put("parent", "id_2_0");
        map247.put("value", 757);

        HashMap<String, Object> map248 = new HashMap<>();
        map248.put("id", "id_2_0_1");
        map248.put("name", "Injuries");
        map248.put("parent", "id_2_0");
        map248.put("value", 134);

        HashMap<String, Object> map249 = new HashMap<>();
        map249.put("id", "id_2_0_2");
        map249.put("name", "Non-communicable diseases");
        map249.put("parent", "id_2_0");
        map249.put("value", 729);

        HashMap<String, Object> map250 = new HashMap<>();
        map250.put("id", "id_2_1");
        map250.put("name", "Madagascar");
        map250.put("parent", "id_2");

        HashMap<String, Object> map251 = new HashMap<>();
        map251.put("id", "id_2_1_0");
        map251.put("name", "Non-communicable diseases");
        map251.put("parent", "id_2_1");
        map251.put("value", 649);

        HashMap<String, Object> map252 = new HashMap<>();
        map252.put("id", "id_2_1_1");
        map252.put("name", "Communicable diseases");
        map252.put("parent", "id_2_1");
        map252.put("value", 430);

        HashMap<String, Object> map253 = new HashMap<>();
        map253.put("id", "id_2_1_2");
        map253.put("name", "Injuries");
        map253.put("parent", "id_2_1");
        map253.put("value", 89);

        HashMap<String, Object> map254 = new HashMap<>();
        map254.put("id", "id_2_2");
        map254.put("name", "Swaziland");
        map254.put("parent", "id_2");

        HashMap<String, Object> map255 = new HashMap<>();
        map255.put("id", "id_2_2_0");
        map255.put("name", "Communicable diseases");
        map255.put("parent", "id_2_2");
        map255.put("value", 884);

        HashMap<String, Object> map256 = new HashMap<>();
        map256.put("id", "id_2_2_1");
        map256.put("name", "Injuries");
        map256.put("parent", "id_2_2");
        map256.put("value", 120);

        HashMap<String, Object> map257 = new HashMap<>();
        map257.put("id", "id_2_2_2");
        map257.put("name", "Non-communicable diseases");
        map257.put("parent", "id_2_2");
        map257.put("value", 702);

        HashMap<String, Object> map258 = new HashMap<>();
        map258.put("id", "id_2_3");
        map258.put("name", "Congo");
        map258.put("parent", "id_2");

        HashMap<String, Object> map259 = new HashMap<>();
        map259.put("id", "id_2_3_0");
        map259.put("name", "Non-communicable diseases");
        map259.put("parent", "id_2_3");
        map259.put("value", 632);

        HashMap<String, Object> map260 = new HashMap<>();
        map260.put("id", "id_2_3_1");
        map260.put("name", "Communicable diseases");
        map260.put("parent", "id_2_3");
        map260.put("value", 667);

        HashMap<String, Object> map261 = new HashMap<>();
        map261.put("id", "id_2_3_2");
        map261.put("name", "Injuries");
        map261.put("parent", "id_2_3");
        map261.put("value", 89);

        HashMap<String, Object> map262 = new HashMap<>();
        map262.put("id", "id_2_4");
        map262.put("name", "Burkina Faso");
        map262.put("parent", "id_2");

        HashMap<String, Object> map263 = new HashMap<>();
        map263.put("id", "id_2_4_0");
        map263.put("name", "Communicable diseases");
        map263.put("parent", "id_2_4");
        map263.put("value", 648);

        HashMap<String, Object> map264 = new HashMap<>();
        map264.put("id", "id_2_4_1");
        map264.put("name", "Non-communicable diseases");
        map264.put("parent", "id_2_4");
        map264.put("value", 784);

        HashMap<String, Object> map265 = new HashMap<>();
        map265.put("id", "id_2_4_2");
        map265.put("name", "Injuries");
        map265.put("parent", "id_2_4");
        map265.put("value", 119);

        HashMap<String, Object> map266 = new HashMap<>();
        map266.put("id", "id_2_5");
        map266.put("name", "Guinea-Bissau");
        map266.put("parent", "id_2");

        HashMap<String, Object> map267 = new HashMap<>();
        map267.put("id", "id_2_5_0");
        map267.put("name", "Communicable diseases");
        map267.put("parent", "id_2_5");
        map267.put("value", 870);

        HashMap<String, Object> map268 = new HashMap<>();
        map268.put("id", "id_2_5_1");
        map268.put("name", "Non-communicable diseases");
        map268.put("parent", "id_2_5");
        map268.put("value", 765);

        HashMap<String, Object> map269 = new HashMap<>();
        map269.put("id", "id_2_5_2");
        map269.put("name", "Injuries");
        map269.put("parent", "id_2_5");
        map269.put("value", 112);

        HashMap<String, Object> map270 = new HashMap<>();
        map270.put("id", "id_2_6");
        map270.put("name", "Democratic Republic of the Congo");
        map270.put("parent", "id_2");

        HashMap<String, Object> map271 = new HashMap<>();
        map271.put("id", "id_2_6_0");
        map271.put("name", "Non-communicable diseases");
        map271.put("parent", "id_2_6");
        map271.put("value", 724);

        HashMap<String, Object> map272 = new HashMap<>();
        map272.put("id", "id_2_6_1");
        map272.put("name", "Injuries");
        map272.put("parent", "id_2_6");
        map272.put("value", 137);

        HashMap<String, Object> map273 = new HashMap<>();
        map273.put("id", "id_2_6_2");
        map273.put("name", "Communicable diseases");
        map273.put("parent", "id_2_6");
        map273.put("value", 921);

        HashMap<String, Object> map274 = new HashMap<>();
        map274.put("id", "id_2_7");
        map274.put("name", "Mozambique");
        map274.put("parent", "id_2");

        HashMap<String, Object> map275 = new HashMap<>();
        map275.put("id", "id_2_7_0");
        map275.put("name", "Injuries");
        map275.put("parent", "id_2_7");
        map275.put("value", 175);

        HashMap<String, Object> map276 = new HashMap<>();
        map276.put("id", "id_2_7_1");
        map276.put("name", "Non-communicable diseases");
        map276.put("parent", "id_2_7");
        map276.put("value", 594);

        HashMap<String, Object> map277 = new HashMap<>();
        map277.put("id", "id_2_7_2");
        map277.put("name", "Communicable diseases");
        map277.put("parent", "id_2_7");
        map277.put("value", 998);

        HashMap<String, Object> map278 = new HashMap<>();
        map278.put("id", "id_2_8");
        map278.put("name", "Central African Republic");
        map278.put("parent", "id_2");

        HashMap<String, Object> map279 = new HashMap<>();
        map279.put("id", "id_2_8_0");
        map279.put("name", "Communicable diseases");
        map279.put("parent", "id_2_8");
        map279.put("value", 1212);

        HashMap<String, Object> map280 = new HashMap<>();
        map280.put("id", "id_2_8_1");
        map280.put("name", "Injuries");
        map280.put("parent", "id_2_8");
        map280.put("value", 108);

        HashMap<String, Object> map281 = new HashMap<>();
        map281.put("id", "id_2_8_2");
        map281.put("name", "Non-communicable diseases");
        map281.put("parent", "id_2_8");
        map281.put("value", 551);

        HashMap<String, Object> map282 = new HashMap<>();
        map282.put("id", "id_2_9");
        map282.put("name", "United Republic of Tanzania");
        map282.put("parent", "id_2");

        HashMap<String, Object> map283 = new HashMap<>();
        map283.put("id", "id_2_9_0");
        map283.put("name", "Non-communicable diseases");
        map283.put("parent", "id_2_9");
        map283.put("value", 570);

        HashMap<String, Object> map284 = new HashMap<>();
        map284.put("id", "id_2_9_1");
        map284.put("name", "Communicable diseases");
        map284.put("parent", "id_2_9");
        map284.put("value", 584);

        HashMap<String, Object> map285 = new HashMap<>();
        map285.put("id", "id_2_9_2");
        map285.put("name", "Injuries");
        map285.put("parent", "id_2_9");
        map285.put("value", 129);

        HashMap<String, Object> map286 = new HashMap<>();
        map286.put("id", "id_2_10");
        map286.put("name", "Cameroon");
        map286.put("parent", "id_2");

        HashMap<String, Object> map287 = new HashMap<>();
        map287.put("id", "id_2_10_0");
        map287.put("name", "Communicable diseases");
        map287.put("parent", "id_2_10");
        map287.put("value", 769);

        HashMap<String, Object> map288 = new HashMap<>();
        map288.put("id", "id_2_10_1");
        map288.put("name", "Injuries");
        map288.put("parent", "id_2_10");
        map288.put("value", 106);

        HashMap<String, Object> map289 = new HashMap<>();
        map289.put("id", "id_2_10_2");
        map289.put("name", "Non-communicable diseases");
        map289.put("parent", "id_2_10");
        map289.put("value", 675);

        HashMap<String, Object> map290 = new HashMap<>();
        map290.put("id", "id_2_11");
        map290.put("name", "Togo");
        map290.put("parent", "id_2");

        HashMap<String, Object> map291 = new HashMap<>();
        map291.put("id", "id_2_11_0");
        map291.put("name", "Non-communicable diseases");
        map291.put("parent", "id_2_11");
        map291.put("value", 679);

        HashMap<String, Object> map292 = new HashMap<>();
        map292.put("id", "id_2_11_1");
        map292.put("name", "Communicable diseases");
        map292.put("parent", "id_2_11");
        map292.put("value", 682);

        HashMap<String, Object> map293 = new HashMap<>();
        map293.put("id", "id_2_11_2");
        map293.put("name", "Injuries");
        map293.put("parent", "id_2_11");
        map293.put("value", 93);

        HashMap<String, Object> map294 = new HashMap<>();
        map294.put("id", "id_2_12");
        map294.put("name", "Eritrea");
        map294.put("parent", "id_2");

        HashMap<String, Object> map295 = new HashMap<>();
        map295.put("id", "id_2_12_0");
        map295.put("name", "Injuries");
        map295.put("parent", "id_2_12");
        map295.put("value", 119);

        HashMap<String, Object> map296 = new HashMap<>();
        map296.put("id", "id_2_12_1");
        map296.put("name", "Communicable diseases");
        map296.put("parent", "id_2_12");
        map296.put("value", 506);

        HashMap<String, Object> map297 = new HashMap<>();
        map297.put("id", "id_2_12_2");
        map297.put("name", "Non-communicable diseases");
        map297.put("parent", "id_2_12");
        map297.put("value", 672);

        HashMap<String, Object> map298 = new HashMap<>();
        map298.put("id", "id_2_13");
        map298.put("name", "Namibia");
        map298.put("parent", "id_2");

        HashMap<String, Object> map299 = new HashMap<>();
        map299.put("id", "id_2_13_0");
        map299.put("name", "Injuries");
        map299.put("parent", "id_2_13");
        map299.put("value", 76);

        HashMap<String, Object> map300 = new HashMap<>();
        map300.put("id", "id_2_13_1");
        map300.put("name", "Non-communicable diseases");
        map300.put("parent", "id_2_13");
        map300.put("value", 580);

        HashMap<String, Object> map301 = new HashMap<>();
        map301.put("id", "id_2_13_2");
        map301.put("name", "Communicable diseases");
        map301.put("parent", "id_2_13");
        map301.put("value", 357);

        HashMap<String, Object> map302 = new HashMap<>();
        map302.put("id", "id_2_14");
        map302.put("name", "Senegal");
        map302.put("parent", "id_2");

        HashMap<String, Object> map303 = new HashMap<>();
        map303.put("id", "id_2_14_0");
        map303.put("name", "Non-communicable diseases");
        map303.put("parent", "id_2_14");
        map303.put("value", 558);

        HashMap<String, Object> map304 = new HashMap<>();
        map304.put("id", "id_2_14_1");
        map304.put("name", "Injuries");
        map304.put("parent", "id_2_14");
        map304.put("value", 89);

        HashMap<String, Object> map305 = new HashMap<>();
        map305.put("id", "id_2_14_2");
        map305.put("name", "Communicable diseases");
        map305.put("parent", "id_2_14");
        map305.put("value", 588);

        HashMap<String, Object> map306 = new HashMap<>();
        map306.put("id", "id_2_15");
        map306.put("name", "Chad");
        map306.put("parent", "id_2");

        HashMap<String, Object> map307 = new HashMap<>();
        map307.put("id", "id_2_15_0");
        map307.put("name", "Communicable diseases");
        map307.put("parent", "id_2_15");
        map307.put("value", 1071);

        HashMap<String, Object> map308 = new HashMap<>();
        map308.put("id", "id_2_15_1");
        map308.put("name", "Injuries");
        map308.put("parent", "id_2_15");
        map308.put("value", 115);

        HashMap<String, Object> map309 = new HashMap<>();
        map309.put("id", "id_2_15_2");
        map309.put("name", "Non-communicable diseases");
        map309.put("parent", "id_2_15");
        map309.put("value", 713);

        HashMap<String, Object> map310 = new HashMap<>();
        map310.put("id", "id_2_16");
        map310.put("name", "Benin");
        map310.put("parent", "id_2");

        HashMap<String, Object> map311 = new HashMap<>();
        map311.put("id", "id_2_16_0");
        map311.put("name", "Injuries");
        map311.put("parent", "id_2_16");
        map311.put("value", 98);

        HashMap<String, Object> map312 = new HashMap<>();
        map312.put("id", "id_2_16_1");
        map312.put("name", "Non-communicable diseases");
        map312.put("parent", "id_2_16");
        map312.put("value", 762);

        HashMap<String, Object> map313 = new HashMap<>();
        map313.put("id", "id_2_16_2");
        map313.put("name", "Communicable diseases");
        map313.put("parent", "id_2_16");
        map313.put("value", 577);

        HashMap<String, Object> map314 = new HashMap<>();
        map314.put("id", "id_2_17");
        map314.put("name", "Zimbabwe");
        map314.put("parent", "id_2");

        HashMap<String, Object> map315 = new HashMap<>();
        map315.put("id", "id_2_17_0");
        map315.put("name", "Communicable diseases");
        map315.put("parent", "id_2_17");
        map315.put("value", 711);

        HashMap<String, Object> map316 = new HashMap<>();
        map316.put("id", "id_2_17_1");
        map316.put("name", "Injuries");
        map316.put("parent", "id_2_17");
        map316.put("value", 83);

        HashMap<String, Object> map317 = new HashMap<>();
        map317.put("id", "id_2_17_2");
        map317.put("name", "Non-communicable diseases");
        map317.put("parent", "id_2_17");
        map317.put("value", 599);

        HashMap<String, Object> map318 = new HashMap<>();
        map318.put("id", "id_2_18");
        map318.put("name", "Rwanda");
        map318.put("parent", "id_2");

        HashMap<String, Object> map319 = new HashMap<>();
        map319.put("id", "id_2_18_0");
        map319.put("name", "Non-communicable diseases");
        map319.put("parent", "id_2_18");
        map319.put("value", 585);

        HashMap<String, Object> map320 = new HashMap<>();
        map320.put("id", "id_2_18_1");
        map320.put("name", "Injuries");
        map320.put("parent", "id_2_18");
        map320.put("value", 106);

        HashMap<String, Object> map321 = new HashMap<>();
        map321.put("id", "id_2_18_2");
        map321.put("name", "Communicable diseases");
        map321.put("parent", "id_2_18");
        map321.put("value", 402);

        HashMap<String, Object> map322 = new HashMap<>();
        map322.put("id", "id_2_19");
        map322.put("name", "Zambia");
        map322.put("parent", "id_2");

        HashMap<String, Object> map323 = new HashMap<>();
        map323.put("id", "id_2_19_0");
        map323.put("name", "Non-communicable diseases");
        map323.put("parent", "id_2_19");
        map323.put("value", 587);

        HashMap<String, Object> map324 = new HashMap<>();
        map324.put("id", "id_2_19_1");
        map324.put("name", "Injuries");
        map324.put("parent", "id_2_19");
        map324.put("value", 156);

        HashMap<String, Object> map325 = new HashMap<>();
        map325.put("id", "id_2_19_2");
        map325.put("name", "Communicable diseases");
        map325.put("parent", "id_2_19");
        map325.put("value", 764);

        HashMap<String, Object> map326 = new HashMap<>();
        map326.put("id", "id_2_20");
        map326.put("name", "Mali");
        map326.put("parent", "id_2");

        HashMap<String, Object> map327 = new HashMap<>();
        map327.put("id", "id_2_20_0");
        map327.put("name", "Injuries");
        map327.put("parent", "id_2_20");
        map327.put("value", 120);

        HashMap<String, Object> map328 = new HashMap<>();
        map328.put("id", "id_2_20_1");
        map328.put("name", "Communicable diseases");
        map328.put("parent", "id_2_20");
        map328.put("value", 588);

        HashMap<String, Object> map329 = new HashMap<>();
        map329.put("id", "id_2_20_2");
        map329.put("name", "Non-communicable diseases");
        map329.put("parent", "id_2_20");
        map329.put("value", 866);

        HashMap<String, Object> map330 = new HashMap<>();
        map330.put("id", "id_2_21");
        map330.put("name", "Ethiopia");
        map330.put("parent", "id_2");

        HashMap<String, Object> map331 = new HashMap<>();
        map331.put("id", "id_2_21_0");
        map331.put("name", "Injuries");
        map331.put("parent", "id_2_21");
        map331.put("value", 95);

        HashMap<String, Object> map332 = new HashMap<>();
        map332.put("id", "id_2_21_1");
        map332.put("name", "Communicable diseases");
        map332.put("parent", "id_2_21");
        map332.put("value", 559);

        HashMap<String, Object> map333 = new HashMap<>();
        map333.put("id", "id_2_21_2");
        map333.put("name", "Non-communicable diseases");
        map333.put("parent", "id_2_21");
        map333.put("value", 476);

        HashMap<String, Object> map334 = new HashMap<>();
        map334.put("id", "id_2_22");
        map334.put("name", "South Africa");
        map334.put("parent", "id_2");

        HashMap<String, Object> map335 = new HashMap<>();
        map335.put("id", "id_2_22_0");
        map335.put("name", "Communicable diseases");
        map335.put("parent", "id_2_22");
        map335.put("value", 612);

        HashMap<String, Object> map336 = new HashMap<>();
        map336.put("id", "id_2_22_1");
        map336.put("name", "Injuries");
        map336.put("parent", "id_2_22");
        map336.put("value", 104);

        HashMap<String, Object> map337 = new HashMap<>();
        map337.put("id", "id_2_22_2");
        map337.put("name", "Non-communicable diseases");
        map337.put("parent", "id_2_22");
        map337.put("value", 711);

        HashMap<String, Object> map338 = new HashMap<>();
        map338.put("id", "id_2_23");
        map338.put("name", "Burundi");
        map338.put("parent", "id_2");

        HashMap<String, Object> map339 = new HashMap<>();
        map339.put("id", "id_2_23_0");
        map339.put("name", "Injuries");
        map339.put("parent", "id_2_23");
        map339.put("value", 147);

        HashMap<String, Object> map340 = new HashMap<>();
        map340.put("id", "id_2_23_1");
        map340.put("name", "Communicable diseases");
        map340.put("parent", "id_2_23");
        map340.put("value", 705);

        HashMap<String, Object> map341 = new HashMap<>();
        map341.put("id", "id_2_23_2");
        map341.put("name", "Non-communicable diseases");
        map341.put("parent", "id_2_23");
        map341.put("value", 730);

        HashMap<String, Object> map342 = new HashMap<>();
        map342.put("id", "id_2_24");
        map342.put("name", "Cabo Verde");
        map342.put("parent", "id_2");

        HashMap<String, Object> map343 = new HashMap<>();
        map343.put("id", "id_2_24_0");
        map343.put("name", "Injuries");
        map343.put("parent", "id_2_24");
        map343.put("value", 54);

        HashMap<String, Object> map344 = new HashMap<>();
        map344.put("id", "id_2_24_1");
        map344.put("name", "Non-communicable diseases");
        map344.put("parent", "id_2_24");
        map344.put("value", 482);

        HashMap<String, Object> map345 = new HashMap<>();
        map345.put("id", "id_2_24_2");
        map345.put("name", "Communicable diseases");
        map345.put("parent", "id_2_24");
        map345.put("value", 142);

        HashMap<String, Object> map346 = new HashMap<>();
        map346.put("id", "id_2_25");
        map346.put("name", "Liberia");
        map346.put("parent", "id_2");

        HashMap<String, Object> map347 = new HashMap<>();
        map347.put("id", "id_2_25_0");
        map347.put("name", "Non-communicable diseases");
        map347.put("parent", "id_2_25");
        map347.put("value", 657);

        HashMap<String, Object> map348 = new HashMap<>();
        map348.put("id", "id_2_25_1");
        map348.put("name", "Injuries");
        map348.put("parent", "id_2_25");
        map348.put("value", 83);

        HashMap<String, Object> map349 = new HashMap<>();
        map349.put("id", "id_2_25_2");
        map349.put("name", "Communicable diseases");
        map349.put("parent", "id_2_25");
        map349.put("value", 609);

        HashMap<String, Object> map350 = new HashMap<>();
        map350.put("id", "id_2_26");
        map350.put("name", "Uganda");
        map350.put("parent", "id_2");

        HashMap<String, Object> map351 = new HashMap<>();
        map351.put("id", "id_2_26_0");
        map351.put("name", "Non-communicable diseases");
        map351.put("parent", "id_2_26");
        map351.put("value", 664);

        HashMap<String, Object> map352 = new HashMap<>();
        map352.put("id", "id_2_26_1");
        map352.put("name", "Communicable diseases");
        map352.put("parent", "id_2_26");
        map352.put("value", 697);

        HashMap<String, Object> map353 = new HashMap<>();
        map353.put("id", "id_2_26_2");
        map353.put("name", "Injuries");
        map353.put("parent", "id_2_26");
        map353.put("value", 167);

        HashMap<String, Object> map354 = new HashMap<>();
        map354.put("id", "id_2_27");
        map354.put("name", "Mauritius");
        map354.put("parent", "id_2");

        HashMap<String, Object> map355 = new HashMap<>();
        map355.put("id", "id_2_27_0");
        map355.put("name", "Non-communicable diseases");
        map355.put("parent", "id_2_27");
        map355.put("value", 577);

        HashMap<String, Object> map356 = new HashMap<>();
        map356.put("id", "id_2_27_1");
        map356.put("name", "Injuries");
        map356.put("parent", "id_2_27");
        map356.put("value", 44);

        HashMap<String, Object> map357 = new HashMap<>();
        map357.put("id", "id_2_27_2");
        map357.put("name", "Communicable diseases");
        map357.put("parent", "id_2_27");
        map357.put("value", 62);

        HashMap<String, Object> map358 = new HashMap<>();
        map358.put("id", "id_2_28");
        map358.put("name", "Algeria");
        map358.put("parent", "id_2");

        HashMap<String, Object> map359 = new HashMap<>();
        map359.put("id", "id_2_28_0");
        map359.put("name", "Non-communicable diseases");
        map359.put("parent", "id_2_28");
        map359.put("value", 710);

        HashMap<String, Object> map360 = new HashMap<>();
        map360.put("id", "id_2_28_1");
        map360.put("name", "Injuries");
        map360.put("parent", "id_2_28");
        map360.put("value", 54);

        HashMap<String, Object> map361 = new HashMap<>();
        map361.put("id", "id_2_28_2");
        map361.put("name", "Communicable diseases");
        map361.put("parent", "id_2_28");
        map361.put("value", 98);

        HashMap<String, Object> map362 = new HashMap<>();
        map362.put("id", "id_2_29");
        map362.put("name", "Côte d'Ivoire");
        map362.put("parent", "id_2");

        HashMap<String, Object> map363 = new HashMap<>();
        map363.put("id", "id_2_29_0");
        map363.put("name", "Non-communicable diseases");
        map363.put("parent", "id_2_29");
        map363.put("value", 794);

        HashMap<String, Object> map364 = new HashMap<>();
        map364.put("id", "id_2_29_1");
        map364.put("name", "Injuries");
        map364.put("parent", "id_2_29");
        map364.put("value", 124);

        HashMap<String, Object> map365 = new HashMap<>();
        map365.put("id", "id_2_29_2");
        map365.put("name", "Communicable diseases");
        map365.put("parent", "id_2_29");
        map365.put("value", 861);

        HashMap<String, Object> map366 = new HashMap<>();
        map366.put("id", "id_2_30");
        map366.put("name", "Malawi");
        map366.put("parent", "id_2");

        HashMap<String, Object> map367 = new HashMap<>();
        map367.put("id", "id_2_30_0");
        map367.put("name", "Injuries");
        map367.put("parent", "id_2_30");
        map367.put("value", 98);

        HashMap<String, Object> map368 = new HashMap<>();
        map368.put("id", "id_2_30_1");
        map368.put("name", "Communicable diseases");
        map368.put("parent", "id_2_30");
        map368.put("value", 778);

        HashMap<String, Object> map369 = new HashMap<>();
        map369.put("id", "id_2_30_2");
        map369.put("name", "Non-communicable diseases");
        map369.put("parent", "id_2_30");
        map369.put("value", 655);

        HashMap<String, Object> map370 = new HashMap<>();
        map370.put("id", "id_2_31");
        map370.put("name", "Botswana");
        map370.put("parent", "id_2");

        HashMap<String, Object> map371 = new HashMap<>();
        map371.put("id", "id_2_31_0");
        map371.put("name", "Injuries");
        map371.put("parent", "id_2_31");
        map371.put("value", 88);

        HashMap<String, Object> map372 = new HashMap<>();
        map372.put("id", "id_2_31_1");
        map372.put("name", "Non-communicable diseases");
        map372.put("parent", "id_2_31");
        map372.put("value", 612);

        HashMap<String, Object> map373 = new HashMap<>();
        map373.put("id", "id_2_31_2");
        map373.put("name", "Communicable diseases");
        map373.put("parent", "id_2_31");
        map373.put("value", 555);

        HashMap<String, Object> map374 = new HashMap<>();
        map374.put("id", "id_2_32");
        map374.put("name", "Guinea");
        map374.put("parent", "id_2");

        HashMap<String, Object> map375 = new HashMap<>();
        map375.put("id", "id_2_32_0");
        map375.put("name", "Injuries");
        map375.put("parent", "id_2_32");
        map375.put("value", 96);

        HashMap<String, Object> map376 = new HashMap<>();
        map376.put("id", "id_2_32_1");
        map376.put("name", "Non-communicable diseases");
        map376.put("parent", "id_2_32");
        map376.put("value", 681);

        HashMap<String, Object> map377 = new HashMap<>();
        map377.put("id", "id_2_32_2");
        map377.put("name", "Communicable diseases");
        map377.put("parent", "id_2_32");
        map377.put("value", 680);

        HashMap<String, Object> map378 = new HashMap<>();
        map378.put("id", "id_2_33");
        map378.put("name", "Ghana");
        map378.put("parent", "id_2");

        HashMap<String, Object> map379 = new HashMap<>();
        map379.put("id", "id_2_33_0");
        map379.put("name", "Injuries");
        map379.put("parent", "id_2_33");
        map379.put("value", 76);

        HashMap<String, Object> map380 = new HashMap<>();
        map380.put("id", "id_2_33_1");
        map380.put("name", "Non-communicable diseases");
        map380.put("parent", "id_2_33");
        map380.put("value", 670);

        HashMap<String, Object> map381 = new HashMap<>();
        map381.put("id", "id_2_33_2");
        map381.put("name", "Communicable diseases");
        map381.put("parent", "id_2_33");
        map381.put("value", 476);

        HashMap<String, Object> map382 = new HashMap<>();
        map382.put("id", "id_2_34");
        map382.put("name", "Kenya");
        map382.put("parent", "id_2");

        HashMap<String, Object> map383 = new HashMap<>();
        map383.put("id", "id_2_34_0");
        map383.put("name", "Non-communicable diseases");
        map383.put("parent", "id_2_34");
        map383.put("value", 515);

        HashMap<String, Object> map384 = new HashMap<>();
        map384.put("id", "id_2_34_1");
        map384.put("name", "Injuries");
        map384.put("parent", "id_2_34");
        map384.put("value", 101);

        HashMap<String, Object> map385 = new HashMap<>();
        map385.put("id", "id_2_34_2");
        map385.put("name", "Communicable diseases");
        map385.put("parent", "id_2_34");
        map385.put("value", 658);

        HashMap<String, Object> map386 = new HashMap<>();
        map386.put("id", "id_2_35");
        map386.put("name", "Gambia");
        map386.put("parent", "id_2");

        HashMap<String, Object> map387 = new HashMap<>();
        map387.put("id", "id_2_35_0");
        map387.put("name", "Non-communicable diseases");
        map387.put("parent", "id_2_35");
        map387.put("value", 630);

        HashMap<String, Object> map388 = new HashMap<>();
        map388.put("id", "id_2_35_1");
        map388.put("name", "Injuries");
        map388.put("parent", "id_2_35");
        map388.put("value", 96);

        HashMap<String, Object> map389 = new HashMap<>();
        map389.put("id", "id_2_35_2");
        map389.put("name", "Communicable diseases");
        map389.put("parent", "id_2_35");
        map389.put("value", 591);

        HashMap<String, Object> map390 = new HashMap<>();
        map390.put("id", "id_2_36");
        map390.put("name", "Angola");
        map390.put("parent", "id_2");

        HashMap<String, Object> map391 = new HashMap<>();
        map391.put("id", "id_2_36_0");
        map391.put("name", "Injuries");
        map391.put("parent", "id_2_36");
        map391.put("value", 138);

        HashMap<String, Object> map392 = new HashMap<>();
        map392.put("id", "id_2_36_1");
        map392.put("name", "Non-communicable diseases");
        map392.put("parent", "id_2_36");
        map392.put("value", 768);

        HashMap<String, Object> map393 = new HashMap<>();
        map393.put("id", "id_2_36_2");
        map393.put("name", "Communicable diseases");
        map393.put("parent", "id_2_36");
        map393.put("value", 873);

        HashMap<String, Object> map394 = new HashMap<>();
        map394.put("id", "id_2_37");
        map394.put("name", "Sierra Leone");
        map394.put("parent", "id_2");

        HashMap<String, Object> map395 = new HashMap<>();
        map395.put("id", "id_2_37_0");
        map395.put("name", "Communicable diseases");
        map395.put("parent", "id_2_37");
        map395.put("value", 1327);

        HashMap<String, Object> map396 = new HashMap<>();
        map396.put("id", "id_2_37_1");
        map396.put("name", "Non-communicable diseases");
        map396.put("parent", "id_2_37");
        map396.put("value", 964);

        HashMap<String, Object> map397 = new HashMap<>();
        map397.put("id", "id_2_37_2");
        map397.put("name", "Injuries");
        map397.put("parent", "id_2_37");
        map397.put("value", 150);

        HashMap<String, Object> map398 = new HashMap<>();
        map398.put("id", "id_2_38");
        map398.put("name", "Mauritania");
        map398.put("parent", "id_2");

        HashMap<String, Object> map399 = new HashMap<>();
        map399.put("id", "id_2_38_0");
        map399.put("name", "Communicable diseases");
        map399.put("parent", "id_2_38");
        map399.put("value", 619);

        HashMap<String, Object> map400 = new HashMap<>();
        map400.put("id", "id_2_38_1");
        map400.put("name", "Injuries");
        map400.put("parent", "id_2_38");
        map400.put("value", 83);

        HashMap<String, Object> map401 = new HashMap<>();
        map401.put("id", "id_2_38_2");
        map401.put("name", "Non-communicable diseases");
        map401.put("parent", "id_2_38");
        map401.put("value", 555);

        HashMap<String, Object> map402 = new HashMap<>();
        map402.put("id", "id_2_39");
        map402.put("name", "Comoros");
        map402.put("parent", "id_2");

        HashMap<String, Object> map403 = new HashMap<>();
        map403.put("id", "id_2_39_0");
        map403.put("name", "Communicable diseases");
        map403.put("parent", "id_2_39");
        map403.put("value", 495);

        HashMap<String, Object> map404 = new HashMap<>();
        map404.put("id", "id_2_39_1");
        map404.put("name", "Injuries");
        map404.put("parent", "id_2_39");
        map404.put("value", 132);

        HashMap<String, Object> map405 = new HashMap<>();
        map405.put("id", "id_2_39_2");
        map405.put("name", "Non-communicable diseases");
        map405.put("parent", "id_2_39");
        map405.put("value", 696);

        HashMap<String, Object> map406 = new HashMap<>();
        map406.put("id", "id_2_40");
        map406.put("name", "Gabon");
        map406.put("parent", "id_2");

        HashMap<String, Object> map407 = new HashMap<>();
        map407.put("id", "id_2_40_0");
        map407.put("name", "Non-communicable diseases");
        map407.put("parent", "id_2_40");
        map407.put("value", 505);

        HashMap<String, Object> map408 = new HashMap<>();
        map408.put("id", "id_2_40_1");
        map408.put("name", "Injuries");
        map408.put("parent", "id_2_40");
        map408.put("value", 77);

        HashMap<String, Object> map409 = new HashMap<>();
        map409.put("id", "id_2_40_2");
        map409.put("name", "Communicable diseases");
        map409.put("parent", "id_2_40");
        map409.put("value", 589);

        HashMap<String, Object> map410 = new HashMap<>();
        map410.put("id", "id_2_41");
        map410.put("name", "Niger");
        map410.put("parent", "id_2");

        HashMap<String, Object> map411 = new HashMap<>();
        map411.put("id", "id_2_41_0");
        map411.put("name", "Injuries");
        map411.put("parent", "id_2_41");
        map411.put("value", 98);

        HashMap<String, Object> map412 = new HashMap<>();
        map412.put("id", "id_2_41_1");
        map412.put("name", "Communicable diseases");
        map412.put("parent", "id_2_41");
        map412.put("value", 740);

        HashMap<String, Object> map413 = new HashMap<>();
        map413.put("id", "id_2_41_2");
        map413.put("name", "Non-communicable diseases");
        map413.put("parent", "id_2_41");
        map413.put("value", 649);

        HashMap<String, Object> map414 = new HashMap<>();
        map414.put("id", "id_2_42");
        map414.put("name", "Lesotho");
        map414.put("parent", "id_2");

        HashMap<String, Object> map415 = new HashMap<>();
        map415.put("id", "id_2_42_0");
        map415.put("name", "Communicable diseases");
        map415.put("parent", "id_2_42");
        map415.put("value", 1111);

        HashMap<String, Object> map416 = new HashMap<>();
        map416.put("id", "id_2_42_1");
        map416.put("name", "Injuries");
        map416.put("parent", "id_2_42");
        map416.put("value", 143);

        HashMap<String, Object> map417 = new HashMap<>();
        map417.put("id", "id_2_42_2");
        map417.put("name", "Non-communicable diseases");
        map417.put("parent", "id_2_42");
        map417.put("value", 672);

        HashMap<String, Object> map418 = new HashMap<>();
        map418.put("id", "id_2_43");
        map418.put("name", "Nigeria");
        map418.put("parent", "id_2");

        HashMap<String, Object> map419 = new HashMap<>();
        map419.put("id", "id_2_43_0");
        map419.put("name", "Non-communicable diseases");
        map419.put("parent", "id_2_43");
        map419.put("value", 674);

        HashMap<String, Object> map420 = new HashMap<>();
        map420.put("id", "id_2_43_1");
        map420.put("name", "Communicable diseases");
        map420.put("parent", "id_2_43");
        map420.put("value", 866);

        HashMap<String, Object> map421 = new HashMap<>();
        map421.put("id", "id_2_43_2");
        map421.put("name", "Injuries");
        map421.put("parent", "id_2_43");
        map421.put("value", 146);

        HashMap<String, Object> map422 = new HashMap<>();
        map422.put("id", "id_2");
        map422.put("name", "Africa");
        map422.put("color", "#90ed7d");
        map422.put("value", 1443);

        HashMap<String, Object> map423 = new HashMap<>();
        map423.put("id", "id_3_0");
        map423.put("name", "Canada");
        map423.put("parent", "id_3");

        HashMap<String, Object> map424 = new HashMap<>();
        map424.put("id", "id_3_0_0");
        map424.put("name", "Non-communicable diseases");
        map424.put("parent", "id_3_0");
        map424.put("value", 318);

        HashMap<String, Object> map425 = new HashMap<>();
        map425.put("id", "id_3_0_1");
        map425.put("name", "Injuries");
        map425.put("parent", "id_3_0");
        map425.put("value", 31);

        HashMap<String, Object> map426 = new HashMap<>();
        map426.put("id", "id_3_0_2");
        map426.put("name", "Communicable diseases");
        map426.put("parent", "id_3_0");
        map426.put("value", 23);

        HashMap<String, Object> map427 = new HashMap<>();
        map427.put("id", "id_3_1");
        map427.put("name", "Bolivia (Plurinational State of)");
        map427.put("parent", "id_3");

        HashMap<String, Object> map428 = new HashMap<>();
        map428.put("id", "id_3_1_0");
        map428.put("name", "Communicable diseases");
        map428.put("parent", "id_3_1");
        map428.put("value", 226);

        HashMap<String, Object> map429 = new HashMap<>();
        map429.put("id", "id_3_1_1");
        map429.put("name", "Non-communicable diseases");
        map429.put("parent", "id_3_1");
        map429.put("value", 635);

        HashMap<String, Object> map430 = new HashMap<>();
        map430.put("id", "id_3_1_2");
        map430.put("name", "Injuries");
        map430.put("parent", "id_3_1");
        map430.put("value", 100);

        HashMap<String, Object> map431 = new HashMap<>();
        map431.put("id", "id_3_2");
        map431.put("name", "Haiti");
        map431.put("parent", "id_3");

        HashMap<String, Object> map432 = new HashMap<>();
        map432.put("id", "id_3_2_0");
        map432.put("name", "Communicable diseases");
        map432.put("parent", "id_3_2");
        map432.put("value", 405);

        HashMap<String, Object> map433 = new HashMap<>();
        map433.put("id", "id_3_2_1");
        map433.put("name", "Non-communicable diseases");
        map433.put("parent", "id_3_2");
        map433.put("value", 725);

        HashMap<String, Object> map434 = new HashMap<>();
        map434.put("id", "id_3_2_2");
        map434.put("name", "Injuries");
        map434.put("parent", "id_3_2");
        map434.put("value", 89);

        HashMap<String, Object> map435 = new HashMap<>();
        map435.put("id", "id_3_3");
        map435.put("name", "Belize");
        map435.put("parent", "id_3");

        HashMap<String, Object> map436 = new HashMap<>();
        map436.put("id", "id_3_3_0");
        map436.put("name", "Non-communicable diseases");
        map436.put("parent", "id_3_3");
        map436.put("value", 471);

        HashMap<String, Object> map437 = new HashMap<>();
        map437.put("id", "id_3_3_1");
        map437.put("name", "Injuries");
        map437.put("parent", "id_3_3");
        map437.put("value", 82);

        HashMap<String, Object> map438 = new HashMap<>();
        map438.put("id", "id_3_3_2");
        map438.put("name", "Communicable diseases");
        map438.put("parent", "id_3_3");
        map438.put("value", 105);

        HashMap<String, Object> map439 = new HashMap<>();
        map439.put("id", "id_3_4");
        map439.put("name", "Suriname");
        map439.put("parent", "id_3");

        HashMap<String, Object> map440 = new HashMap<>();
        map440.put("id", "id_3_4_0");
        map440.put("name", "Injuries");
        map440.put("parent", "id_3_4");
        map440.put("value", 71);

        HashMap<String, Object> map441 = new HashMap<>();
        map441.put("id", "id_3_4_1");
        map441.put("name", "Communicable diseases");
        map441.put("parent", "id_3_4");
        map441.put("value", 84);

        HashMap<String, Object> map442 = new HashMap<>();
        map442.put("id", "id_3_4_2");
        map442.put("name", "Non-communicable diseases");
        map442.put("parent", "id_3_4");
        map442.put("value", 375);

        HashMap<String, Object> map443 = new HashMap<>();
        map443.put("id", "id_3_5");
        map443.put("name", "Argentina");
        map443.put("parent", "id_3");

        HashMap<String, Object> map444 = new HashMap<>();
        map444.put("id", "id_3_5_0");
        map444.put("name", "Communicable diseases");
        map444.put("parent", "id_3_5");
        map444.put("value", 69);

        HashMap<String, Object> map445 = new HashMap<>();
        map445.put("id", "id_3_5_1");
        map445.put("name", "Injuries");
        map445.put("parent", "id_3_5");
        map445.put("value", 51);

        HashMap<String, Object> map446 = new HashMap<>();
        map446.put("id", "id_3_5_2");
        map446.put("name", "Non-communicable diseases");
        map446.put("parent", "id_3_5");
        map446.put("value", 467);

        HashMap<String, Object> map447 = new HashMap<>();
        map447.put("id", "id_3_6");
        map447.put("name", "Mexico");
        map447.put("parent", "id_3");

        HashMap<String, Object> map448 = new HashMap<>();
        map448.put("id", "id_3_6_0");
        map448.put("name", "Injuries");
        map448.put("parent", "id_3_6");
        map448.put("value", 63);

        HashMap<String, Object> map449 = new HashMap<>();
        map449.put("id", "id_3_6_1");
        map449.put("name", "Communicable diseases");
        map449.put("parent", "id_3_6");
        map449.put("value", 57);

        HashMap<String, Object> map450 = new HashMap<>();
        map450.put("id", "id_3_6_2");
        map450.put("name", "Non-communicable diseases");
        map450.put("parent", "id_3_6");
        map450.put("value", 468);

        HashMap<String, Object> map451 = new HashMap<>();
        map451.put("id", "id_3_7");
        map451.put("name", "Jamaica");
        map451.put("parent", "id_3");

        HashMap<String, Object> map452 = new HashMap<>();
        map452.put("id", "id_3_7_0");
        map452.put("name", "Injuries");
        map452.put("parent", "id_3_7");
        map452.put("value", 52);

        HashMap<String, Object> map453 = new HashMap<>();
        map453.put("id", "id_3_7_1");
        map453.put("name", "Communicable diseases");
        map453.put("parent", "id_3_7");
        map453.put("value", 97);

        HashMap<String, Object> map454 = new HashMap<>();
        map454.put("id", "id_3_7_2");
        map454.put("name", "Non-communicable diseases");
        map454.put("parent", "id_3_7");
        map454.put("value", 519);

        HashMap<String, Object> map455 = new HashMap<>();
        map455.put("id", "id_3_8");
        map455.put("name", "Peru");
        map455.put("parent", "id_3");

        HashMap<String, Object> map456 = new HashMap<>();
        map456.put("id", "id_3_8_0");
        map456.put("name", "Non-communicable diseases");
        map456.put("parent", "id_3_8");
        map456.put("value", 364);

        HashMap<String, Object> map457 = new HashMap<>();
        map457.put("id", "id_3_8_1");
        map457.put("name", "Injuries");
        map457.put("parent", "id_3_8");
        map457.put("value", 48);

        HashMap<String, Object> map458 = new HashMap<>();
        map458.put("id", "id_3_8_2");
        map458.put("name", "Communicable diseases");
        map458.put("parent", "id_3_8");
        map458.put("value", 121);

        HashMap<String, Object> map459 = new HashMap<>();
        map459.put("id", "id_3_9");
        map459.put("name", "Brazil");
        map459.put("parent", "id_3");

        HashMap<String, Object> map460 = new HashMap<>();
        map460.put("id", "id_3_9_0");
        map460.put("name", "Injuries");
        map460.put("parent", "id_3_9");
        map460.put("value", 80);

        HashMap<String, Object> map461 = new HashMap<>();
        map461.put("id", "id_3_9_1");
        map461.put("name", "Communicable diseases");
        map461.put("parent", "id_3_9");
        map461.put("value", 93);

        HashMap<String, Object> map462 = new HashMap<>();
        map462.put("id", "id_3_9_2");
        map462.put("name", "Non-communicable diseases");
        map462.put("parent", "id_3_9");
        map462.put("value", 514);

        HashMap<String, Object> map463 = new HashMap<>();
        map463.put("id", "id_3_10");
        map463.put("name", "Venezuela (Bolivarian Republic of)");
        map463.put("parent", "id_3");

        HashMap<String, Object> map464 = new HashMap<>();
        map464.put("id", "id_3_10_0");
        map464.put("name", "Communicable diseases");
        map464.put("parent", "id_3_10");
        map464.put("value", 58);

        HashMap<String, Object> map465 = new HashMap<>();
        map465.put("id", "id_3_10_1");
        map465.put("name", "Injuries");
        map465.put("parent", "id_3_10");
        map465.put("value", 103);

        HashMap<String, Object> map466 = new HashMap<>();
        map466.put("id", "id_3_10_2");
        map466.put("name", "Non-communicable diseases");
        map466.put("parent", "id_3_10");
        map466.put("value", 411);

        HashMap<String, Object> map467 = new HashMap<>();
        map467.put("id", "id_3_11");
        map467.put("name", "Paraguay");
        map467.put("parent", "id_3");

        HashMap<String, Object> map468 = new HashMap<>();
        map468.put("id", "id_3_11_0");
        map468.put("name", "Non-communicable diseases");
        map468.put("parent", "id_3_11");
        map468.put("value", 486);

        HashMap<String, Object> map469 = new HashMap<>();
        map469.put("id", "id_3_11_1");
        map469.put("name", "Communicable diseases");
        map469.put("parent", "id_3_11");
        map469.put("value", 77);

        HashMap<String, Object> map470 = new HashMap<>();
        map470.put("id", "id_3_11_2");
        map470.put("name", "Injuries");
        map470.put("parent", "id_3_11");
        map470.put("value", 68);

        HashMap<String, Object> map471 = new HashMap<>();
        map471.put("id", "id_3_12");
        map471.put("name", "Chile");
        map471.put("parent", "id_3");

        HashMap<String, Object> map472 = new HashMap<>();
        map472.put("id", "id_3_12_0");
        map472.put("name", "Non-communicable diseases");
        map472.put("parent", "id_3_12");
        map472.put("value", 367);

        HashMap<String, Object> map473 = new HashMap<>();
        map473.put("id", "id_3_12_1");
        map473.put("name", "Communicable diseases");
        map473.put("parent", "id_3_12");
        map473.put("value", 36);

        HashMap<String, Object> map474 = new HashMap<>();
        map474.put("id", "id_3_12_2");
        map474.put("name", "Injuries");
        map474.put("parent", "id_3_12");
        map474.put("value", 41);

        HashMap<String, Object> map475 = new HashMap<>();
        map475.put("id", "id_3_13");
        map475.put("name", "Trinidad and Tobago");
        map475.put("parent", "id_3");

        HashMap<String, Object> map476 = new HashMap<>();
        map476.put("id", "id_3_13_0");
        map476.put("name", "Non-communicable diseases");
        map476.put("parent", "id_3_13");
        map476.put("value", 705);

        HashMap<String, Object> map477 = new HashMap<>();
        map477.put("id", "id_3_13_1");
        map477.put("name", "Communicable diseases");
        map477.put("parent", "id_3_13");
        map477.put("value", 80);

        HashMap<String, Object> map478 = new HashMap<>();
        map478.put("id", "id_3_13_2");
        map478.put("name", "Injuries");
        map478.put("parent", "id_3_13");
        map478.put("value", 98);

        HashMap<String, Object> map479 = new HashMap<>();
        map479.put("id", "id_3_14");
        map479.put("name", "Colombia");
        map479.put("parent", "id_3");

        HashMap<String, Object> map480 = new HashMap<>();
        map480.put("id", "id_3_14_0");
        map480.put("name", "Non-communicable diseases");
        map480.put("parent", "id_3_14");
        map480.put("value", 377);

        HashMap<String, Object> map481 = new HashMap<>();
        map481.put("id", "id_3_14_1");
        map481.put("name", "Communicable diseases");
        map481.put("parent", "id_3_14");
        map481.put("value", 55);

        HashMap<String, Object> map482 = new HashMap<>();
        map482.put("id", "id_3_14_2");
        map482.put("name", "Injuries");
        map482.put("parent", "id_3_14");
        map482.put("value", 73);

        HashMap<String, Object> map483 = new HashMap<>();
        map483.put("id", "id_3_15");
        map483.put("name", "Cuba");
        map483.put("parent", "id_3");

        HashMap<String, Object> map484 = new HashMap<>();
        map484.put("id", "id_3_15_0");
        map484.put("name", "Injuries");
        map484.put("parent", "id_3_15");
        map484.put("value", 45);

        HashMap<String, Object> map485 = new HashMap<>();
        map485.put("id", "id_3_15_1");
        map485.put("name", "Non-communicable diseases");
        map485.put("parent", "id_3_15");
        map485.put("value", 422);

        HashMap<String, Object> map486 = new HashMap<>();
        map486.put("id", "id_3_15_2");
        map486.put("name", "Communicable diseases");
        map486.put("parent", "id_3_15");
        map486.put("value", 33);

        HashMap<String, Object> map487 = new HashMap<>();
        map487.put("id", "id_3_16");
        map487.put("name", "El Salvador");
        map487.put("parent", "id_3");

        HashMap<String, Object> map488 = new HashMap<>();
        map488.put("id", "id_3_16_0");
        map488.put("name", "Non-communicable diseases");
        map488.put("parent", "id_3_16");
        map488.put("value", 475);

        HashMap<String, Object> map489 = new HashMap<>();
        map489.put("id", "id_3_16_1");
        map489.put("name", "Injuries");
        map489.put("parent", "id_3_16");
        map489.put("value", 158);

        HashMap<String, Object> map490 = new HashMap<>();
        map490.put("id", "id_3_16_2");
        map490.put("name", "Communicable diseases");
        map490.put("parent", "id_3_16");
        map490.put("value", 96);

        HashMap<String, Object> map491 = new HashMap<>();
        map491.put("id", "id_3_17");
        map491.put("name", "Honduras");
        map491.put("parent", "id_3");

        HashMap<String, Object> map492 = new HashMap<>();
        map492.put("id", "id_3_17_0");
        map492.put("name", "Injuries");
        map492.put("parent", "id_3_17");
        map492.put("value", 81);

        HashMap<String, Object> map493 = new HashMap<>();
        map493.put("id", "id_3_17_1");
        map493.put("name", "Communicable diseases");
        map493.put("parent", "id_3_17");
        map493.put("value", 118);

        HashMap<String, Object> map494 = new HashMap<>();
        map494.put("id", "id_3_17_2");
        map494.put("name", "Non-communicable diseases");
        map494.put("parent", "id_3_17");
        map494.put("value", 442);

        HashMap<String, Object> map495 = new HashMap<>();
        map495.put("id", "id_3_18");
        map495.put("name", "Ecuador");
        map495.put("parent", "id_3");

        HashMap<String, Object> map496 = new HashMap<>();
        map496.put("id", "id_3_18_0");
        map496.put("name", "Non-communicable diseases");
        map496.put("parent", "id_3_18");
        map496.put("value", 410);

        HashMap<String, Object> map497 = new HashMap<>();
        map497.put("id", "id_3_18_1");
        map497.put("name", "Injuries");
        map497.put("parent", "id_3_18");
        map497.put("value", 84);

        HashMap<String, Object> map498 = new HashMap<>();
        map498.put("id", "id_3_18_2");
        map498.put("name", "Communicable diseases");
        map498.put("parent", "id_3_18");
        map498.put("value", 97);

        HashMap<String, Object> map499 = new HashMap<>();
        map499.put("id", "id_3_19");
        map499.put("name", "Costa Rica");
        map499.put("parent", "id_3");

        HashMap<String, Object> map500 = new HashMap<>();
        map500.put("id", "id_3_19_0");
        map500.put("name", "Communicable diseases");
        map500.put("parent", "id_3_19");
        map500.put("value", 31);

        HashMap<String, Object> map501 = new HashMap<>();
        map501.put("id", "id_3_19_1");
        map501.put("name", "Non-communicable diseases");
        map501.put("parent", "id_3_19");
        map501.put("value", 392);

        HashMap<String, Object> map502 = new HashMap<>();
        map502.put("id", "id_3_19_2");
        map502.put("name", "Injuries");
        map502.put("parent", "id_3_19");
        map502.put("value", 47);

        HashMap<String, Object> map503 = new HashMap<>();
        map503.put("id", "id_3_20");
        map503.put("name", "Dominican Republic");
        map503.put("parent", "id_3");

        HashMap<String, Object> map504 = new HashMap<>();
        map504.put("id", "id_3_20_0");
        map504.put("name", "Non-communicable diseases");
        map504.put("parent", "id_3_20");
        map504.put("value", 396);

        HashMap<String, Object> map505 = new HashMap<>();
        map505.put("id", "id_3_20_1");
        map505.put("name", "Injuries");
        map505.put("parent", "id_3_20");
        map505.put("value", 66);

        HashMap<String, Object> map506 = new HashMap<>();
        map506.put("id", "id_3_20_2");
        map506.put("name", "Communicable diseases");
        map506.put("parent", "id_3_20");
        map506.put("value", 77);

        HashMap<String, Object> map507 = new HashMap<>();
        map507.put("id", "id_3_21");
        map507.put("name", "Nicaragua");
        map507.put("parent", "id_3");

        HashMap<String, Object> map508 = new HashMap<>();
        map508.put("id", "id_3_21_0");
        map508.put("name", "Communicable diseases");
        map508.put("parent", "id_3_21");
        map508.put("value", 75);

        HashMap<String, Object> map509 = new HashMap<>();
        map509.put("id", "id_3_21_1");
        map509.put("name", "Injuries");
        map509.put("parent", "id_3_21");
        map509.put("value", 64);

        HashMap<String, Object> map510 = new HashMap<>();
        map510.put("id", "id_3_21_2");
        map510.put("name", "Non-communicable diseases");
        map510.put("parent", "id_3_21");
        map510.put("value", 547);

        HashMap<String, Object> map511 = new HashMap<>();
        map511.put("id", "id_3_22");
        map511.put("name", "Barbados");
        map511.put("parent", "id_3");

        HashMap<String, Object> map512 = new HashMap<>();
        map512.put("id", "id_3_22_0");
        map512.put("name", "Non-communicable diseases");
        map512.put("parent", "id_3_22");
        map512.put("value", 405);

        HashMap<String, Object> map513 = new HashMap<>();
        map513.put("id", "id_3_22_1");
        map513.put("name", "Injuries");
        map513.put("parent", "id_3_22");
        map513.put("value", 28);

        HashMap<String, Object> map514 = new HashMap<>();
        map514.put("id", "id_3_22_2");
        map514.put("name", "Communicable diseases");
        map514.put("parent", "id_3_22");
        map514.put("value", 61);

        HashMap<String, Object> map515 = new HashMap<>();
        map515.put("id", "id_3_23");
        map515.put("name", "Uruguay");
        map515.put("parent", "id_3");

        HashMap<String, Object> map516 = new HashMap<>();
        map516.put("id", "id_3_23_0");
        map516.put("name", "Non-communicable diseases");
        map516.put("parent", "id_3_23");
        map516.put("value", 446);

        HashMap<String, Object> map517 = new HashMap<>();
        map517.put("id", "id_3_23_1");
        map517.put("name", "Injuries");
        map517.put("parent", "id_3_23");
        map517.put("value", 54);

        HashMap<String, Object> map518 = new HashMap<>();
        map518.put("id", "id_3_23_2");
        map518.put("name", "Communicable diseases");
        map518.put("parent", "id_3_23");
        map518.put("value", 46);

        HashMap<String, Object> map519 = new HashMap<>();
        map519.put("id", "id_3_24");
        map519.put("name", "Panama");
        map519.put("parent", "id_3");

        HashMap<String, Object> map520 = new HashMap<>();
        map520.put("id", "id_3_24_0");
        map520.put("name", "Communicable diseases");
        map520.put("parent", "id_3_24");
        map520.put("value", 86);

        HashMap<String, Object> map521 = new HashMap<>();
        map521.put("id", "id_3_24_1");
        map521.put("name", "Injuries");
        map521.put("parent", "id_3_24");
        map521.put("value", 67);

        HashMap<String, Object> map522 = new HashMap<>();
        map522.put("id", "id_3_24_2");
        map522.put("name", "Non-communicable diseases");
        map522.put("parent", "id_3_24");
        map522.put("value", 373);

        HashMap<String, Object> map523 = new HashMap<>();
        map523.put("id", "id_3_25");
        map523.put("name", "Bahamas");
        map523.put("parent", "id_3");

        HashMap<String, Object> map524 = new HashMap<>();
        map524.put("id", "id_3_25_0");
        map524.put("name", "Non-communicable diseases");
        map524.put("parent", "id_3_25");
        map524.put("value", 465);

        HashMap<String, Object> map525 = new HashMap<>();
        map525.put("id", "id_3_25_1");
        map525.put("name", "Injuries");
        map525.put("parent", "id_3_25");
        map525.put("value", 46);

        HashMap<String, Object> map526 = new HashMap<>();
        map526.put("id", "id_3_25_2");
        map526.put("name", "Communicable diseases");
        map526.put("parent", "id_3_25");
        map526.put("value", 122);

        HashMap<String, Object> map527 = new HashMap<>();
        map527.put("id", "id_3_26");
        map527.put("name", "Guyana");
        map527.put("parent", "id_3");

        HashMap<String, Object> map528 = new HashMap<>();
        map528.put("id", "id_3_26_0");
        map528.put("name", "Communicable diseases");
        map528.put("parent", "id_3_26");
        map528.put("value", 177);

        HashMap<String, Object> map529 = new HashMap<>();
        map529.put("id", "id_3_26_1");
        map529.put("name", "Non-communicable diseases");
        map529.put("parent", "id_3_26");
        map529.put("value", 1024);

        HashMap<String, Object> map530 = new HashMap<>();
        map530.put("id", "id_3_26_2");
        map530.put("name", "Injuries");
        map530.put("parent", "id_3_26");
        map530.put("value", 150);

        HashMap<String, Object> map531 = new HashMap<>();
        map531.put("id", "id_3_27");
        map531.put("name", "United States of America");
        map531.put("parent", "id_3");

        HashMap<String, Object> map532 = new HashMap<>();
        map532.put("id", "id_3_27_0");
        map532.put("name", "Non-communicable diseases");
        map532.put("parent", "id_3_27");
        map532.put("value", 413);

        HashMap<String, Object> map533 = new HashMap<>();
        map533.put("id", "id_3_27_1");
        map533.put("name", "Injuries");
        map533.put("parent", "id_3_27");
        map533.put("value", 44);

        HashMap<String, Object> map534 = new HashMap<>();
        map534.put("id", "id_3_27_2");
        map534.put("name", "Communicable diseases");
        map534.put("parent", "id_3_27");
        map534.put("value", 31);

        HashMap<String, Object> map535 = new HashMap<>();
        map535.put("id", "id_3_28");
        map535.put("name", "Guatemala");
        map535.put("parent", "id_3");

        HashMap<String, Object> map536 = new HashMap<>();
        map536.put("id", "id_3_28_0");
        map536.put("name", "Communicable diseases");
        map536.put("parent", "id_3_28");
        map536.put("value", 213);

        HashMap<String, Object> map537 = new HashMap<>();
        map537.put("id", "id_3_28_1");
        map537.put("name", "Non-communicable diseases");
        map537.put("parent", "id_3_28");
        map537.put("value", 409);

        HashMap<String, Object> map538 = new HashMap<>();
        map538.put("id", "id_3_28_2");
        map538.put("name", "Injuries");
        map538.put("parent", "id_3_28");
        map538.put("value", 111);

        HashMap<String, Object> map539 = new HashMap<>();
        map539.put("id", "id_3");
        map539.put("name", "Americas");
        map539.put("color", "#f7a35c");
        map539.put("value", 647);

        HashMap<String, Object> map540 = new HashMap<>();
        map540.put("id", "id_4_0");
        map540.put("name", "Egypt");
        map540.put("parent", "id_4");

        HashMap<String, Object> map541 = new HashMap<>();
        map541.put("id", "id_4_0_0");
        map541.put("name", "Communicable diseases");
        map541.put("parent", "id_4_0");
        map541.put("value", 74);

        HashMap<String, Object> map542 = new HashMap<>();
        map542.put("id", "id_4_0_1");
        map542.put("name", "Non-communicable diseases");
        map542.put("parent", "id_4_0");
        map542.put("value", 782);

        HashMap<String, Object> map543 = new HashMap<>();
        map543.put("id", "id_4_0_2");
        map543.put("name", "Injuries");
        map543.put("parent", "id_4_0");
        map543.put("value", 34);

        HashMap<String, Object> map544 = new HashMap<>();
        map544.put("id", "id_4_1");
        map544.put("name", "South Sudan");
        map544.put("parent", "id_4");

        HashMap<String, Object> map545 = new HashMap<>();
        map545.put("id", "id_4_1_0");
        map545.put("name", "Injuries");
        map545.put("parent", "id_4_1");
        map545.put("value", 143);

        HashMap<String, Object> map546 = new HashMap<>();
        map546.put("id", "id_4_1_1");
        map546.put("name", "Communicable diseases");
        map546.put("parent", "id_4_1");
        map546.put("value", 831);

        HashMap<String, Object> map547 = new HashMap<>();
        map547.put("id", "id_4_1_2");
        map547.put("name", "Non-communicable diseases");
        map547.put("parent", "id_4_1");
        map547.put("value", 623);

        HashMap<String, Object> map548 = new HashMap<>();
        map548.put("id", "id_4_2");
        map548.put("name", "Sudan");
        map548.put("parent", "id_4");

        HashMap<String, Object> map549 = new HashMap<>();
        map549.put("id", "id_4_2_0");
        map549.put("name", "Injuries");
        map549.put("parent", "id_4_2");
        map549.put("value", 134);

        HashMap<String, Object> map550 = new HashMap<>();
        map550.put("id", "id_4_2_1");
        map550.put("name", "Non-communicable diseases");
        map550.put("parent", "id_4_2");
        map550.put("value", 551);

        HashMap<String, Object> map551 = new HashMap<>();
        map551.put("id", "id_4_2_2");
        map551.put("name", "Communicable diseases");
        map551.put("parent", "id_4_2");
        map551.put("value", 495);

        HashMap<String, Object> map552 = new HashMap<>();
        map552.put("id", "id_4_3");
        map552.put("name", "Libya");
        map552.put("parent", "id_4");

        HashMap<String, Object> map553 = new HashMap<>();
        map553.put("id", "id_4_3_0");
        map553.put("name", "Injuries");
        map553.put("parent", "id_4_3");
        map553.put("value", 63);

        HashMap<String, Object> map554 = new HashMap<>();
        map554.put("id", "id_4_3_1");
        map554.put("name", "Non-communicable diseases");
        map554.put("parent", "id_4_3");
        map554.put("value", 550);

        HashMap<String, Object> map555 = new HashMap<>();
        map555.put("id", "id_4_3_2");
        map555.put("name", "Communicable diseases");
        map555.put("parent", "id_4_3");
        map555.put("value", 53);

        HashMap<String, Object> map556 = new HashMap<>();
        map556.put("id", "id_4_4");
        map556.put("name", "Jordan");
        map556.put("parent", "id_4");

        HashMap<String, Object> map557 = new HashMap<>();
        map557.put("id", "id_4_4_0");
        map557.put("name", "Non-communicable diseases");
        map557.put("parent", "id_4_4");
        map557.put("value", 640);

        HashMap<String, Object> map558 = new HashMap<>();
        map558.put("id", "id_4_4_1");
        map558.put("name", "Injuries");
        map558.put("parent", "id_4_4");
        map558.put("value", 54);

        HashMap<String, Object> map559 = new HashMap<>();
        map559.put("id", "id_4_4_2");
        map559.put("name", "Communicable diseases");
        map559.put("parent", "id_4_4");
        map559.put("value", 53);

        HashMap<String, Object> map560 = new HashMap<>();
        map560.put("id", "id_4_5");
        map560.put("name", "Pakistan");
        map560.put("parent", "id_4");

        HashMap<String, Object> map561 = new HashMap<>();
        map561.put("id", "id_4_5_0");
        map561.put("name", "Communicable diseases");
        map561.put("parent", "id_4_5");
        map561.put("value", 296);

        HashMap<String, Object> map562 = new HashMap<>();
        map562.put("id", "id_4_5_1");
        map562.put("name", "Non-communicable diseases");
        map562.put("parent", "id_4_5");
        map562.put("value", 669);

        HashMap<String, Object> map563 = new HashMap<>();
        map563.put("id", "id_4_5_2");
        map563.put("name", "Injuries");
        map563.put("parent", "id_4_5");
        map563.put("value", 99);

        HashMap<String, Object> map564 = new HashMap<>();
        map564.put("id", "id_4_6");
        map564.put("name", "Djibouti");
        map564.put("parent", "id_4");

        HashMap<String, Object> map565 = new HashMap<>();
        map565.put("id", "id_4_6_0");
        map565.put("name", "Non-communicable diseases");
        map565.put("parent", "id_4_6");
        map565.put("value", 631);

        HashMap<String, Object> map566 = new HashMap<>();
        map566.put("id", "id_4_6_1");
        map566.put("name", "Communicable diseases");
        map566.put("parent", "id_4_6");
        map566.put("value", 626);

        HashMap<String, Object> map567 = new HashMap<>();
        map567.put("id", "id_4_6_2");
        map567.put("name", "Injuries");
        map567.put("parent", "id_4_6");
        map567.put("value", 106);

        HashMap<String, Object> map568 = new HashMap<>();
        map568.put("id", "id_4_7");
        map568.put("name", "Syrian Arab Republic");
        map568.put("parent", "id_4");

        HashMap<String, Object> map569 = new HashMap<>();
        map569.put("id", "id_4_7_0");
        map569.put("name", "Communicable diseases");
        map569.put("parent", "id_4_7");
        map569.put("value", 41);

        HashMap<String, Object> map570 = new HashMap<>();
        map570.put("id", "id_4_7_1");
        map570.put("name", "Injuries");
        map570.put("parent", "id_4_7");
        map570.put("value", 308);

        HashMap<String, Object> map571 = new HashMap<>();
        map571.put("id", "id_4_7_2");
        map571.put("name", "Non-communicable diseases");
        map571.put("parent", "id_4_7");
        map571.put("value", 573);

        HashMap<String, Object> map572 = new HashMap<>();
        map572.put("id", "id_4_8");
        map572.put("name", "Morocco");
        map572.put("parent", "id_4");

        HashMap<String, Object> map573 = new HashMap<>();
        map573.put("id", "id_4_8_0");
        map573.put("name", "Non-communicable diseases");
        map573.put("parent", "id_4_8");
        map573.put("value", 708);

        HashMap<String, Object> map574 = new HashMap<>();
        map574.put("id", "id_4_8_1");
        map574.put("name", "Communicable diseases");
        map574.put("parent", "id_4_8");
        map574.put("value", 132);

        HashMap<String, Object> map575 = new HashMap<>();
        map575.put("id", "id_4_8_2");
        map575.put("name", "Injuries");
        map575.put("parent", "id_4_8");
        map575.put("value", 47);

        HashMap<String, Object> map576 = new HashMap<>();
        map576.put("id", "id_4_9");
        map576.put("name", "Yemen");
        map576.put("parent", "id_4");

        HashMap<String, Object> map577 = new HashMap<>();
        map577.put("id", "id_4_9_0");
        map577.put("name", "Communicable diseases");
        map577.put("parent", "id_4_9");
        map577.put("value", 515);

        HashMap<String, Object> map578 = new HashMap<>();
        map578.put("id", "id_4_9_1");
        map578.put("name", "Non-communicable diseases");
        map578.put("parent", "id_4_9");
        map578.put("value", 627);

        HashMap<String, Object> map579 = new HashMap<>();
        map579.put("id", "id_4_9_2");
        map579.put("name", "Injuries");
        map579.put("parent", "id_4_9");
        map579.put("value", 84);

        HashMap<String, Object> map580 = new HashMap<>();
        map580.put("id", "id_4_10");
        map580.put("name", "Bahrain");
        map580.put("parent", "id_4");

        HashMap<String, Object> map581 = new HashMap<>();
        map581.put("id", "id_4_10_0");
        map581.put("name", "Injuries");
        map581.put("parent", "id_4_10");
        map581.put("value", 34);

        HashMap<String, Object> map582 = new HashMap<>();
        map582.put("id", "id_4_10_1");
        map582.put("name", "Non-communicable diseases");
        map582.put("parent", "id_4_10");
        map582.put("value", 506);

        HashMap<String, Object> map583 = new HashMap<>();
        map583.put("id", "id_4_10_2");
        map583.put("name", "Communicable diseases");
        map583.put("parent", "id_4_10");
        map583.put("value", 49);

        HashMap<String, Object> map584 = new HashMap<>();
        map584.put("id", "id_4_11");
        map584.put("name", "United Arab Emirates");
        map584.put("parent", "id_4");

        HashMap<String, Object> map585 = new HashMap<>();
        map585.put("id", "id_4_11_0");
        map585.put("name", "Non-communicable diseases");
        map585.put("parent", "id_4_11");
        map585.put("value", 547);

        HashMap<String, Object> map586 = new HashMap<>();
        map586.put("id", "id_4_11_1");
        map586.put("name", "Injuries");
        map586.put("parent", "id_4_11");
        map586.put("value", 32);

        HashMap<String, Object> map587 = new HashMap<>();
        map587.put("id", "id_4_11_2");
        map587.put("name", "Communicable diseases");
        map587.put("parent", "id_4_11");
        map587.put("value", 36);

        HashMap<String, Object> map588 = new HashMap<>();
        map588.put("id", "id_4_12");
        map588.put("name", "Lebanon");
        map588.put("parent", "id_4");

        HashMap<String, Object> map589 = new HashMap<>();
        map589.put("id", "id_4_12_0");
        map589.put("name", "Non-communicable diseases");
        map589.put("parent", "id_4_12");
        map589.put("value", 385);

        HashMap<String, Object> map590 = new HashMap<>();
        map590.put("id", "id_4_12_1");
        map590.put("name", "Injuries");
        map590.put("parent", "id_4_12");
        map590.put("value", 41);

        HashMap<String, Object> map591 = new HashMap<>();
        map591.put("id", "id_4_12_2");
        map591.put("name", "Communicable diseases");
        map591.put("parent", "id_4_12");
        map591.put("value", 31);

        HashMap<String, Object> map592 = new HashMap<>();
        map592.put("id", "id_4_13");
        map592.put("name", "Saudi Arabia");
        map592.put("parent", "id_4");

        HashMap<String, Object> map593 = new HashMap<>();
        map593.put("id", "id_4_13_0");
        map593.put("name", "Non-communicable diseases");
        map593.put("parent", "id_4_13");
        map593.put("value", 549);

        HashMap<String, Object> map594 = new HashMap<>();
        map594.put("id", "id_4_13_1");
        map594.put("name", "Injuries");
        map594.put("parent", "id_4_13");
        map594.put("value", 41);

        HashMap<String, Object> map595 = new HashMap<>();
        map595.put("id", "id_4_13_2");
        map595.put("name", "Communicable diseases");
        map595.put("parent", "id_4_13");
        map595.put("value", 71);

        HashMap<String, Object> map596 = new HashMap<>();
        map596.put("id", "id_4_14");
        map596.put("name", "Iran (Islamic Republic of)");
        map596.put("parent", "id_4");

        HashMap<String, Object> map597 = new HashMap<>();
        map597.put("id", "id_4_14_0");
        map597.put("name", "Injuries");
        map597.put("parent", "id_4_14");
        map597.put("value", 75);

        HashMap<String, Object> map598 = new HashMap<>();
        map598.put("id", "id_4_14_1");
        map598.put("name", "Communicable diseases");
        map598.put("parent", "id_4_14");
        map598.put("value", 56);

        HashMap<String, Object> map599 = new HashMap<>();
        map599.put("id", "id_4_14_2");
        map599.put("name", "Non-communicable diseases");
        map599.put("parent", "id_4_14");
        map599.put("value", 569);

        HashMap<String, Object> map600 = new HashMap<>();
        map600.put("id", "id_4_15");
        map600.put("name", "Iraq");
        map600.put("parent", "id_4");

        HashMap<String, Object> map601 = new HashMap<>();
        map601.put("id", "id_4_15_0");
        map601.put("name", "Communicable diseases");
        map601.put("parent", "id_4_15");
        map601.put("value", 87);

        HashMap<String, Object> map602 = new HashMap<>();
        map602.put("id", "id_4_15_1");
        map602.put("name", "Non-communicable diseases");
        map602.put("parent", "id_4_15");
        map602.put("value", 716);

        HashMap<String, Object> map603 = new HashMap<>();
        map603.put("id", "id_4_15_2");
        map603.put("name", "Injuries");
        map603.put("parent", "id_4_15");
        map603.put("value", 129);

        HashMap<String, Object> map604 = new HashMap<>();
        map604.put("id", "id_4_16");
        map604.put("name", "Qatar");
        map604.put("parent", "id_4");

        HashMap<String, Object> map605 = new HashMap<>();
        map605.put("id", "id_4_16_0");
        map605.put("name", "Communicable diseases");
        map605.put("parent", "id_4_16");
        map605.put("value", 28);

        HashMap<String, Object> map606 = new HashMap<>();
        map606.put("id", "id_4_16_1");
        map606.put("name", "Injuries");
        map606.put("parent", "id_4_16");
        map606.put("value", 41);

        HashMap<String, Object> map607 = new HashMap<>();
        map607.put("id", "id_4_16_2");
        map607.put("name", "Non-communicable diseases");
        map607.put("parent", "id_4_16");
        map607.put("value", 407);

        HashMap<String, Object> map608 = new HashMap<>();
        map608.put("id", "id_4_17");
        map608.put("name", "Afghanistan");
        map608.put("parent", "id_4");

        HashMap<String, Object> map609 = new HashMap<>();
        map609.put("id", "id_4_17_0");
        map609.put("name", "Communicable diseases");
        map609.put("parent", "id_4_17");
        map609.put("value", 363);

        HashMap<String, Object> map610 = new HashMap<>();
        map610.put("id", "id_4_17_1");
        map610.put("name", "Injuries");
        map610.put("parent", "id_4_17");
        map610.put("value", 169);

        HashMap<String, Object> map611 = new HashMap<>();
        map611.put("id", "id_4_17_2");
        map611.put("name", "Non-communicable diseases");
        map611.put("parent", "id_4_17");
        map611.put("value", 846);

        HashMap<String, Object> map612 = new HashMap<>();
        map612.put("id", "id_4_18");
        map612.put("name", "Somalia");
        map612.put("parent", "id_4");

        HashMap<String, Object> map613 = new HashMap<>();
        map613.put("id", "id_4_18_0");
        map613.put("name", "Non-communicable diseases");
        map613.put("parent", "id_4_18");
        map613.put("value", 551);

        HashMap<String, Object> map614 = new HashMap<>();
        map614.put("id", "id_4_18_1");
        map614.put("name", "Communicable diseases");
        map614.put("parent", "id_4_18");
        map614.put("value", 927);

        HashMap<String, Object> map615 = new HashMap<>();
        map615.put("id", "id_4_18_2");
        map615.put("name", "Injuries");
        map615.put("parent", "id_4_18");
        map615.put("value", 189);

        HashMap<String, Object> map616 = new HashMap<>();
        map616.put("id", "id_4_19");
        map616.put("name", "Kuwait");
        map616.put("parent", "id_4");

        HashMap<String, Object> map617 = new HashMap<>();
        map617.put("id", "id_4_19_0");
        map617.put("name", "Communicable diseases");
        map617.put("parent", "id_4_19");
        map617.put("value", 83);

        HashMap<String, Object> map618 = new HashMap<>();
        map618.put("id", "id_4_19_1");
        map618.put("name", "Injuries");
        map618.put("parent", "id_4_19");
        map618.put("value", 25);

        HashMap<String, Object> map619 = new HashMap<>();
        map619.put("id", "id_4_19_2");
        map619.put("name", "Non-communicable diseases");
        map619.put("parent", "id_4_19");
        map619.put("value", 406);

        HashMap<String, Object> map620 = new HashMap<>();
        map620.put("id", "id_4_20");
        map620.put("name", "Oman");
        map620.put("parent", "id_4");

        HashMap<String, Object> map621 = new HashMap<>();
        map621.put("id", "id_4_20_0");
        map621.put("name", "Injuries");
        map621.put("parent", "id_4_20");
        map621.put("value", 53);

        HashMap<String, Object> map622 = new HashMap<>();
        map622.put("id", "id_4_20_1");
        map622.put("name", "Non-communicable diseases");
        map622.put("parent", "id_4_20");
        map622.put("value", 478);

        HashMap<String, Object> map623 = new HashMap<>();
        map623.put("id", "id_4_20_2");
        map623.put("name", "Communicable diseases");
        map623.put("parent", "id_4_20");
        map623.put("value", 84);

        HashMap<String, Object> map624 = new HashMap<>();
        map624.put("id", "id_4_21");
        map624.put("name", "Tunisia");
        map624.put("parent", "id_4");

        HashMap<String, Object> map625 = new HashMap<>();
        map625.put("id", "id_4_21_0");
        map625.put("name", "Non-communicable diseases");
        map625.put("parent", "id_4_21");
        map625.put("value", 509);

        HashMap<String, Object> map626 = new HashMap<>();
        map626.put("id", "id_4_21_1");
        map626.put("name", "Communicable diseases");
        map626.put("parent", "id_4_21");
        map626.put("value", 65);

        HashMap<String, Object> map627 = new HashMap<>();
        map627.put("id", "id_4_21_2");
        map627.put("name", "Injuries");
        map627.put("parent", "id_4_21");
        map627.put("value", 39);

        HashMap<String, Object> map628 = new HashMap<>();
        map628.put("id", "id_4");
        map628.put("name", "Eastern Mediterranean");
        map628.put("color", "#8085e9");
        map628.put("value", 898);

        HashMap<String, Object> map629 = new HashMap<>();
        map629.put("id", "id_5_0");
        map629.put("name", "Mongolia");
        map629.put("parent", "id_5");

        HashMap<String, Object> map630 = new HashMap<>();
        map630.put("id", "id_5_0_0");
        map630.put("name", "Injuries");
        map630.put("parent", "id_5_0");
        map630.put("value", 69);

        HashMap<String, Object> map631 = new HashMap<>();
        map631.put("id", "id_5_0_1");
        map631.put("name", "Non-communicable diseases");
        map631.put("parent", "id_5_0");
        map631.put("value", 967);

        HashMap<String, Object> map632 = new HashMap<>();
        map632.put("id", "id_5_0_2");
        map632.put("name", "Communicable diseases");
        map632.put("parent", "id_5_0");
        map632.put("value", 83);

        HashMap<String, Object> map633 = new HashMap<>();
        map633.put("id", "id_5_1");
        map633.put("name", "Cambodia");
        map633.put("parent", "id_5");

        HashMap<String, Object> map634 = new HashMap<>();
        map634.put("id", "id_5_1_0");
        map634.put("name", "Injuries");
        map634.put("parent", "id_5_1");
        map634.put("value", 62);

        HashMap<String, Object> map635 = new HashMap<>();
        map635.put("id", "id_5_1_1");
        map635.put("name", "Communicable diseases");
        map635.put("parent", "id_5_1");
        map635.put("value", 228);

        HashMap<String, Object> map636 = new HashMap<>();
        map636.put("id", "id_5_1_2");
        map636.put("name", "Non-communicable diseases");
        map636.put("parent", "id_5_1");
        map636.put("value", 394);

        HashMap<String, Object> map637 = new HashMap<>();
        map637.put("id", "id_5_2");
        map637.put("name", "Japan");
        map637.put("parent", "id_5");

        HashMap<String, Object> map638 = new HashMap<>();
        map638.put("id", "id_5_2_0");
        map638.put("name", "Injuries");
        map638.put("parent", "id_5_2");
        map638.put("value", 41);

        HashMap<String, Object> map639 = new HashMap<>();
        map639.put("id", "id_5_2_1");
        map639.put("name", "Non-communicable diseases");
        map639.put("parent", "id_5_2");
        map639.put("value", 244);

        HashMap<String, Object> map640 = new HashMap<>();
        map640.put("id", "id_5_2_2");
        map640.put("name", "Communicable diseases");
        map640.put("parent", "id_5_2");
        map640.put("value", 34);

        HashMap<String, Object> map641 = new HashMap<>();
        map641.put("id", "id_5_3");
        map641.put("name", "Brunei Darussalam");
        map641.put("parent", "id_5");

        HashMap<String, Object> map642 = new HashMap<>();
        map642.put("id", "id_5_3_0");
        map642.put("name", "Injuries");
        map642.put("parent", "id_5_3");
        map642.put("value", 45);

        HashMap<String, Object> map643 = new HashMap<>();
        map643.put("id", "id_5_3_1");
        map643.put("name", "Non-communicable diseases");
        map643.put("parent", "id_5_3");
        map643.put("value", 475);

        HashMap<String, Object> map644 = new HashMap<>();
        map644.put("id", "id_5_3_2");
        map644.put("name", "Communicable diseases");
        map644.put("parent", "id_5_3");
        map644.put("value", 56);

        HashMap<String, Object> map645 = new HashMap<>();
        map645.put("id", "id_5_4");
        map645.put("name", "Solomon Islands");
        map645.put("parent", "id_5");

        HashMap<String, Object> map646 = new HashMap<>();
        map646.put("id", "id_5_4_0");
        map646.put("name", "Communicable diseases");
        map646.put("parent", "id_5_4");
        map646.put("value", 231);

        HashMap<String, Object> map647 = new HashMap<>();
        map647.put("id", "id_5_4_1");
        map647.put("name", "Injuries");
        map647.put("parent", "id_5_4");
        map647.put("value", 75);

        HashMap<String, Object> map648 = new HashMap<>();
        map648.put("id", "id_5_4_2");
        map648.put("name", "Non-communicable diseases");
        map648.put("parent", "id_5_4");
        map648.put("value", 710);

        HashMap<String, Object> map649 = new HashMap<>();
        map649.put("id", "id_5_5");
        map649.put("name", "Viet Nam");
        map649.put("parent", "id_5");

        HashMap<String, Object> map650 = new HashMap<>();
        map650.put("id", "id_5_5_0");
        map650.put("name", "Communicable diseases");
        map650.put("parent", "id_5_5");
        map650.put("value", 96);

        HashMap<String, Object> map651 = new HashMap<>();
        map651.put("id", "id_5_5_1");
        map651.put("name", "Injuries");
        map651.put("parent", "id_5_5");
        map651.put("value", 59);

        HashMap<String, Object> map652 = new HashMap<>();
        map652.put("id", "id_5_5_2");
        map652.put("name", "Non-communicable diseases");
        map652.put("parent", "id_5_5");
        map652.put("value", 435);

        HashMap<String, Object> map653 = new HashMap<>();
        map653.put("id", "id_5_6");
        map653.put("name", "Lao People's Democratic Republic");
        map653.put("parent", "id_5");

        HashMap<String, Object> map654 = new HashMap<>();
        map654.put("id", "id_5_6_0");
        map654.put("name", "Communicable diseases");
        map654.put("parent", "id_5_6");
        map654.put("value", 329);

        HashMap<String, Object> map655 = new HashMap<>();
        map655.put("id", "id_5_6_1");
        map655.put("name", "Injuries");
        map655.put("parent", "id_5_6");
        map655.put("value", 75);

        HashMap<String, Object> map656 = new HashMap<>();
        map656.put("id", "id_5_6_2");
        map656.put("name", "Non-communicable diseases");
        map656.put("parent", "id_5_6");
        map656.put("value", 680);

        HashMap<String, Object> map657 = new HashMap<>();
        map657.put("id", "id_5_7");
        map657.put("name", "China");
        map657.put("parent", "id_5");

        HashMap<String, Object> map658 = new HashMap<>();
        map658.put("id", "id_5_7_0");
        map658.put("name", "Communicable diseases");
        map658.put("parent", "id_5_7");
        map658.put("value", 41);

        HashMap<String, Object> map659 = new HashMap<>();
        map659.put("id", "id_5_7_1");
        map659.put("name", "Non-communicable diseases");
        map659.put("parent", "id_5_7");
        map659.put("value", 576);

        HashMap<String, Object> map660 = new HashMap<>();
        map660.put("id", "id_5_7_2");
        map660.put("name", "Injuries");
        map660.put("parent", "id_5_7");
        map660.put("value", 50);

        HashMap<String, Object> map661 = new HashMap<>();
        map661.put("id", "id_5_8");
        map661.put("name", "New Zealand");
        map661.put("parent", "id_5");

        HashMap<String, Object> map662 = new HashMap<>();
        map662.put("id", "id_5_8_0");
        map662.put("name", "Injuries");
        map662.put("parent", "id_5_8");
        map662.put("value", 33);

        HashMap<String, Object> map663 = new HashMap<>();
        map663.put("id", "id_5_8_1");
        map663.put("name", "Non-communicable diseases");
        map663.put("parent", "id_5_8");
        map663.put("value", 314);

        HashMap<String, Object> map664 = new HashMap<>();
        map664.put("id", "id_5_8_2");
        map664.put("name", "Communicable diseases");
        map664.put("parent", "id_5_8");
        map664.put("value", 18);

        HashMap<String, Object> map665 = new HashMap<>();
        map665.put("id", "id_5_9");
        map665.put("name", "Papua New Guinea");
        map665.put("parent", "id_5");

        HashMap<String, Object> map666 = new HashMap<>();
        map666.put("id", "id_5_9_0");
        map666.put("name", "Injuries");
        map666.put("parent", "id_5_9");
        map666.put("value", 100);

        HashMap<String, Object> map667 = new HashMap<>();
        map667.put("id", "id_5_9_1");
        map667.put("name", "Communicable diseases");
        map667.put("parent", "id_5_9");
        map667.put("value", 554);

        HashMap<String, Object> map668 = new HashMap<>();
        map668.put("id", "id_5_9_2");
        map668.put("name", "Non-communicable diseases");
        map668.put("parent", "id_5_9");
        map668.put("value", 693);

        HashMap<String, Object> map669 = new HashMap<>();
        map669.put("id", "id_5_10");
        map669.put("name", "Philippines");
        map669.put("parent", "id_5");

        HashMap<String, Object> map670 = new HashMap<>();
        map670.put("id", "id_5_10_0");
        map670.put("name", "Communicable diseases");
        map670.put("parent", "id_5_10");
        map670.put("value", 226);

        HashMap<String, Object> map671 = new HashMap<>();
        map671.put("id", "id_5_10_1");
        map671.put("name", "Non-communicable diseases");
        map671.put("parent", "id_5_10");
        map671.put("value", 720);

        HashMap<String, Object> map672 = new HashMap<>();
        map672.put("id", "id_5_10_2");
        map672.put("name", "Injuries");
        map672.put("parent", "id_5_10");
        map672.put("value", 54);

        HashMap<String, Object> map673 = new HashMap<>();
        map673.put("id", "id_5_11");
        map673.put("name", "Malaysia");
        map673.put("parent", "id_5");

        HashMap<String, Object> map674 = new HashMap<>();
        map674.put("id", "id_5_11_0");
        map674.put("name", "Injuries");
        map674.put("parent", "id_5_11");
        map674.put("value", 63);

        HashMap<String, Object> map675 = new HashMap<>();
        map675.put("id", "id_5_11_1");
        map675.put("name", "Non-communicable diseases");
        map675.put("parent", "id_5_11");
        map675.put("value", 563);

        HashMap<String, Object> map676 = new HashMap<>();
        map676.put("id", "id_5_11_2");
        map676.put("name", "Communicable diseases");
        map676.put("parent", "id_5_11");
        map676.put("value", 117);

        HashMap<String, Object> map677 = new HashMap<>();
        map677.put("id", "id_5_12");
        map677.put("name", "Australia");
        map677.put("parent", "id_5");

        HashMap<String, Object> map678 = new HashMap<>();
        map678.put("id", "id_5_12_0");
        map678.put("name", "Communicable diseases");
        map678.put("parent", "id_5_12");
        map678.put("value", 14);

        HashMap<String, Object> map679 = new HashMap<>();
        map679.put("id", "id_5_12_1");
        map679.put("name", "Non-communicable diseases");
        map679.put("parent", "id_5_12");
        map679.put("value", 303);

        HashMap<String, Object> map680 = new HashMap<>();
        map680.put("id", "id_5_12_2");
        map680.put("name", "Injuries");
        map680.put("parent", "id_5_12");
        map680.put("value", 28);

        HashMap<String, Object> map681 = new HashMap<>();
        map681.put("id", "id_5_13");
        map681.put("name", "Fiji");
        map681.put("parent", "id_5");

        HashMap<String, Object> map682 = new HashMap<>();
        map682.put("id", "id_5_13_0");
        map682.put("name", "Non-communicable diseases");
        map682.put("parent", "id_5_13");
        map682.put("value", 804);

        HashMap<String, Object> map683 = new HashMap<>();
        map683.put("id", "id_5_13_1");
        map683.put("name", "Injuries");
        map683.put("parent", "id_5_13");
        map683.put("value", 64);

        HashMap<String, Object> map684 = new HashMap<>();
        map684.put("id", "id_5_13_2");
        map684.put("name", "Communicable diseases");
        map684.put("parent", "id_5_13");
        map684.put("value", 105);

        HashMap<String, Object> map685 = new HashMap<>();
        map685.put("id", "id_5_14");
        map685.put("name", "Singapore");
        map685.put("parent", "id_5");

        HashMap<String, Object> map686 = new HashMap<>();
        map686.put("id", "id_5_14_0");
        map686.put("name", "Communicable diseases");
        map686.put("parent", "id_5_14");
        map686.put("value", 66);

        HashMap<String, Object> map687 = new HashMap<>();
        map687.put("id", "id_5_14_1");
        map687.put("name", "Non-communicable diseases");
        map687.put("parent", "id_5_14");
        map687.put("value", 265);

        HashMap<String, Object> map688 = new HashMap<>();
        map688.put("id", "id_5_14_2");
        map688.put("name", "Injuries");
        map688.put("parent", "id_5_14");
        map688.put("value", 18);

        HashMap<String, Object> map689 = new HashMap<>();
        map689.put("id", "id_5_15");
        map689.put("name", "Republic of Korea");
        map689.put("parent", "id_5");

        HashMap<String, Object> map690 = new HashMap<>();
        map690.put("id", "id_5_15_0");
        map690.put("name", "Injuries");
        map690.put("parent", "id_5_15");
        map690.put("value", 53);

        HashMap<String, Object> map691 = new HashMap<>();
        map691.put("id", "id_5_15_1");
        map691.put("name", "Communicable diseases");
        map691.put("parent", "id_5_15");
        map691.put("value", 34);

        HashMap<String, Object> map692 = new HashMap<>();
        map692.put("id", "id_5_15_2");
        map692.put("name", "Non-communicable diseases");
        map692.put("parent", "id_5_15");
        map692.put("value", 302);

        HashMap<String, Object> map693 = new HashMap<>();
        map693.put("id", "id_5");
        map693.put("name", "Western Pacific");
        map693.put("color", "#f15c80");
        map693.put("value", 723);

            /*can't deal with more than 215 maps*/
		series1.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13, map14, map15, map16, map17, map18, map19, map20, map21, map22, map23, map24, map25, map26, map27, map28, map29, map30, map31, map32, map33, map34, map35, map36, map37, map38, map39, map40, map41, map42, map43, map44, map45, map46, map47, map48, map49, map50, map51, map52, map53, map54, map55, map56, map57, map58, map59, map60, map61, map62, map63, map64, map65, map66, map67, map68, map69, map70, map71, map72, map73, map74, map75, map76, map77, map78, map79, map80, map81, map82, map83, map84, map85, map86, map87, map88, map89, map90, map91, map92, map93, map94, map95, map96, map97, map98, map99, map100, map101, map102, map103, map104, map105, map106, map107, map108, map109, map110, map111, map112, map113, map114, map115, map116, map117, map118, map119, map120, map121, map122, map123, map124, map125, map126, map127, map128, map129, map130, map131, map132, map133, map134, map135, map136, map137, map138, map139, map140, map141, map142, map143, map144, map145, map146, map147, map148, map149, map150, map151, map152, map153, map154, map155, map156, map157, map158, map159, map160, map161, map162, map163, map164, map165, map166, map167, map168, map169, map170, map171, map172, map173, map174, map175, map176, map177, map178, map179, map180, map181, map182, map183, map184, map185, map186, map187, map188, map189, map190, map191, map192, map193, map194, map195, map196, map197, map198, map199, map200, map201, map202, map203, map204, map205, map206, map207, map208, map209, map210, map211, map212, map213, map214, map215/*, map216, map217, map218, map219, map220, map221, map222, map223, map224, map225, map226, map227, map228, map229, map230, map231, map232, map233, map234, map235, map236, map237, map238, map239, map240, map241, map242, map243, map244, map245, map246, map247, map248, map249, map250, map251, map252, map253, map254, map255, map256, map257, map258, map259, map260, map261, map262, map263, map264, map265, map266, map267, map268, map269, map270, map271, map272, map273, map274, map275, map276, map277, map278, map279, map280, map281, map282, map283, map284, map285, map286, map287, map288, map289, map290, map291, map292, map293, map294, map295, map296, map297, map298, map299, map300, map301, map302, map303, map304, map305, map306, map307, map308, map309, map310, map311, map312, map313, map314, map315, map316, map317, map318, map319, map320, map321, map322, map323, map324, map325, map326, map327, map328, map329, map330, map331, map332, map333, map334, map335, map336, map337, map338, map339, map340, map341, map342, map343, map344, map345, map346, map347, map348, map349, map350, map351, map352, map353, map354, map355, map356, map357, map358, map359, map360, map361, map362, map363, map364, map365, map366, map367, map368, map369, map370, map371, map372, map373, map374, map375, map376, map377, map378, map379, map380, map381, map382, map383, map384, map385, map386, map387, map388, map389, map390, map391, map392, map393, map394, map395, map396, map397, map398, map399, map400, map401, map402, map403, map404, map405, map406, map407, map408, map409, map410, map411, map412, map413, map414, map415, map416, map417, map418, map419, map420, map421, map422, map423, map424, map425, map426, map427, map428, map429, map430, map431, map432, map433, map434, map435, map436, map437, map438, map439, map440, map441, map442, map443, map444, map445, map446, map447, map448, map449, map450, map451, map452, map453, map454, map455, map456, map457, map458, map459, map460, map461, map462, map463, map464, map465, map466, map467, map468, map469, map470, map471, map472, map473, map474, map475, map476, map477, map478, map479, map480, map481, map482, map483, map484, map485, map486, map487, map488, map489, map490, map491, map492, map493, map494, map495, map496, map497, map498, map499, map500, map501, map502, map503, map504, map505, map506, map507, map508, map509, map510, map511, map512, map513, map514, map515, map516, map517, map518, map519, map520, map521, map522, map523, map524, map525, map526, map527, map528, map529, map530, map531, map532, map533, map534, map535, map536, map537, map538, map539, map540, map541, map542, map543, map544, map545, map546, map547, map548, map549, map550, map551, map552, map553, map554, map555, map556, map557, map558, map559, map560, map561, map562, map563, map564, map565, map566, map567, map568, map569, map570, map571, map572, map573, map574, map575, map576, map577, map578, map579, map580, map581, map582, map583, map584, map585, map586, map587, map588, map589, map590, map591, map592, map593, map594, map595, map596, map597, map598, map599, map600, map601, map602, map603, map604, map605, map606, map607, map608, map609, map610, map611, map612, map613, map614, map615, map616, map617, map618, map619, map620, map621, map622, map623, map624, map625, map626, map627, map628, map629, map630, map631, map632, map633, map634, map635, map636, map637, map638, map639, map640, map641, map642, map643, map644, map645, map646, map647, map648, map649, map650, map651, map652, map653, map654, map655, map656, map657, map658, map659, map660, map661, map662, map663, map664, map665, map666, map667, map668, map669, map670, map671, map672, map673, map674, map675, map676, map677, map678, map679, map680, map681, map682, map683, map684, map685, map686, map687, map688, map689, map690, map691, map692, map693, map694*/)));
		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		chartView.setOptions(options);
	}
}


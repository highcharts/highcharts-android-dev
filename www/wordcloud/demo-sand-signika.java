package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);

		chartView.plugins = new ArrayList<>(Arrays.asList("wordcloud"));
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "wordcloud";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Wordcloud of Lorem Ipsum";
		options.title = title;

		HIWordcloud series1 = new HIWordcloud();
		series1.name = "Occurrences";

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name" , "Lorem");
		map1.put("weight" , 1);

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name" , "ipsum");
		map2.put("weight" , 1);

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name" , "dolor");
		map3.put("weight" , 1);

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name" , "sit");
		map4.put("weight" , 1);

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name" , "amet");
		map5.put("weight" , 1);

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name" , "consectetur");
		map6.put("weight" , 1);

		HashMap<String, Object> map7 = new HashMap<>();
		map7.put("name" , "adipiscing");
		map7.put("weight" , 1);

		HashMap<String, Object> map8 = new HashMap<>();
		map8.put("name" , "elit");
		map8.put("weight" , 1);

		HashMap<String, Object> map9 = new HashMap<>();
		map9.put("name" , "Aenean");
		map9.put("weight" , 1);

		HashMap<String, Object> map10 = new HashMap<>();
		map10.put("name" , "bibendum");
		map10.put("weight" , 1);

		HashMap<String, Object> map11 = new HashMap<>();
		map11.put("name" , "erat");
		map11.put("weight" , 1);

		HashMap<String, Object> map12 = new HashMap<>();
		map12.put("name" , "ac");
		map12.put("weight" , 1);

		HashMap<String, Object> map13 = new HashMap<>();
		map13.put("name" , "justo");
		map13.put("weight" , 1);

		HashMap<String, Object> map14 = new HashMap<>();
		map14.put("name" , "sollicitudin");
		map14.put("weight" , 1);

		HashMap<String, Object> map15 = new HashMap<>();
		map15.put("name" , "quis");
		map15.put("weight" , 1);

		HashMap<String, Object> map16 = new HashMap<>();
		map16.put("name" , "lacinia");
		map16.put("weight" , 1);

		HashMap<String, Object> map17 = new HashMap<>();
		map17.put("name" , "ligula");
		map17.put("weight" , 1);

		HashMap<String, Object> map18 = new HashMap<>();
		map18.put("name" , "fringilla");
		map18.put("weight" , 1);

		HashMap<String, Object> map19 = new HashMap<>();
		map19.put("name" , "Pellentesque");
		map19.put("weight" , 1);

		HashMap<String, Object> map20 = new HashMap<>();
		map20.put("name" , "hendrerit");
		map20.put("weight" , 1);

		HashMap<String, Object> map21 = new HashMap<>();
		map21.put("name" , "nisi");
		map21.put("weight" , 1);

		HashMap<String, Object> map22 = new HashMap<>();
		map22.put("name" , "vitae");
		map22.put("weight" , 1);

		HashMap<String, Object> map23 = new HashMap<>();
		map23.put("name" , "posuere");
		map23.put("weight" , 1);

		HashMap<String, Object> map24 = new HashMap<>();
		map24.put("name" , "condimentum");
		map24.put("weight" , 1);

		HashMap<String, Object> map25 = new HashMap<>();
		map25.put("name" , "lectus");
		map25.put("weight" , 1);

		HashMap<String, Object> map26 = new HashMap<>();
		map26.put("name" , "urna");
		map26.put("weight" , 1);

		HashMap<String, Object> map27 = new HashMap<>();
		map27.put("name" , "accumsan");
		map27.put("weight" , 1);

		HashMap<String, Object> map28 = new HashMap<>();
		map28.put("name" , "libero");
		map28.put("weight" , 1);

		HashMap<String, Object> map29 = new HashMap<>();
		map29.put("name" , "rutrum");
		map29.put("weight" , 1);

		HashMap<String, Object> map30 = new HashMap<>();
		map30.put("name" , "commodo");
		map30.put("weight" , 1);

		HashMap<String, Object> map31 = new HashMap<>();
		map31.put("name" , "mi");
		map31.put("weight" , 1);

		HashMap<String, Object> map32 = new HashMap<>();
		map32.put("name" , "lacus");
		map32.put("weight" , 1);

		HashMap<String, Object> map33 = new HashMap<>();
		map33.put("name" , "pretium");
		map33.put("weight" , 1);

		HashMap<String, Object> map34 = new HashMap<>();
		map34.put("name" , "erat");
		map34.put("weight" , 1);

		HashMap<String, Object> map35 = new HashMap<>();
		map35.put("name" , "Phasellus");
		map35.put("weight" , 1);

		HashMap<String, Object> map36 = new HashMap<>();
		map36.put("name" , "pretium");
		map36.put("weight" , 1);

		HashMap<String, Object> map37 = new HashMap<>();
		map37.put("name" , "ultrices");
		map37.put("weight" , 1);

		HashMap<String, Object> map38 = new HashMap<>();
		map38.put("name" , "mi");
		map38.put("weight" , 1);

		HashMap<String, Object> map39 = new HashMap<>();
		map39.put("name" , "sed");
		map39.put("weight" , 1);

		HashMap<String, Object> map40 = new HashMap<>();
		map40.put("name" , "semper");
		map40.put("weight" , 1);

		HashMap<String, Object> map41 = new HashMap<>();
		map41.put("name" , "Praesent");
		map41.put("weight" , 1);

		HashMap<String, Object> map42 = new HashMap<>();
		map42.put("name" , "ut");
		map42.put("weight" , 1);

		HashMap<String, Object> map43 = new HashMap<>();
		map43.put("name" , "tristique");
		map43.put("weight" , 1);

		HashMap<String, Object> map44 = new HashMap<>();
		map44.put("name" , "magna");
		map44.put("weight" , 1);

		HashMap<String, Object> map45 = new HashMap<>();
		map45.put("name" , "Donec");
		map45.put("weight" , 1);

		HashMap<String, Object> map46 = new HashMap<>();
		map46.put("name" , "nisl");
		map46.put("weight" , 1);

		HashMap<String, Object> map47 = new HashMap<>();
		map47.put("name" , "tellus");
		map47.put("weight" , 1);

		HashMap<String, Object> map48 = new HashMap<>();
		map48.put("name" , "sagittis");
		map48.put("weight" , 1);

		HashMap<String, Object> map49 = new HashMap<>();
		map49.put("name" , "ut");
		map49.put("weight" , 1);

		HashMap<String, Object> map50 = new HashMap<>();
		map50.put("name" , "tempus");
		map50.put("weight" , 1);

		HashMap<String, Object> map51 = new HashMap<>();
		map51.put("name" , "sit");
		map51.put("weight" , 1);

		HashMap<String, Object> map52 = new HashMap<>();
		map52.put("name" , "amet");
		map52.put("weight" , 1);

		HashMap<String, Object> map53 = new HashMap<>();
		map53.put("name" , "consectetur");
		map53.put("weight" , 1);

		HashMap<String, Object> map54 = new HashMap<>();
		map54.put("name" , "eget");
		map54.put("weight" , 1);

		HashMap<String, Object> map55 = new HashMap<>();
		map55.put("name" , "pretium");
		map55.put("weight" , 1);

		HashMap<String, Object> map56 = new HashMap<>();
		map56.put("name" , "est");
		map56.put("weight" , 1);

		HashMap<String, Object> map57 = new HashMap<>();
		map57.put("name" , "laoreet");
		map57.put("weight" , 1);

		HashMap<String, Object> map58 = new HashMap<>();
		map58.put("name" , "ut");
		map58.put("weight" , 1);

		HashMap<String, Object> map59 = new HashMap<>();
		map59.put("name" , "Quisque");
		map59.put("weight" , 1);

		HashMap<String, Object> map60 = new HashMap<>();
		map60.put("name" , "tristique");
		map60.put("weight" , 1);

		HashMap<String, Object> map61 = new HashMap<>();
		map61.put("name" , "augue");
		map61.put("weight" , 1);

		HashMap<String, Object> map62 = new HashMap<>();
		map62.put("name" , "ac");
		map62.put("weight" , 1);

		HashMap<String, Object> map63 = new HashMap<>();
		map63.put("name" , "eros");
		map63.put("weight" , 1);

		HashMap<String, Object> map64 = new HashMap<>();
		map64.put("name" , "malesuada");
		map64.put("weight" , 1);

		HashMap<String, Object> map65 = new HashMap<>();
		map65.put("name" , "vitae");
		map65.put("weight" , 1);

		HashMap<String, Object> map66 = new HashMap<>();
		map66.put("name" , "facilisis");
		map66.put("weight" , 1);

		HashMap<String, Object> map67 = new HashMap<>();
		map67.put("name" , "mauris");
		map67.put("weight" , 1);

		HashMap<String, Object> map68 = new HashMap<>();
		map68.put("name" , "sollicitudin");
		map68.put("weight" , 1);

		HashMap<String, Object> map69 = new HashMap<>();
		map69.put("name" , "Mauris");
		map69.put("weight" , 1);

		HashMap<String, Object> map70 = new HashMap<>();
		map70.put("name" , "ac");
		map70.put("weight" , 1);

		HashMap<String, Object> map71 = new HashMap<>();
		map71.put("name" , "molestie");
		map71.put("weight" , 1);

		HashMap<String, Object> map72 = new HashMap<>();
		map72.put("name" , "nulla");
		map72.put("weight" , 1);

		HashMap<String, Object> map73 = new HashMap<>();
		map73.put("name" , "vitae");
		map73.put("weight" , 1);

		HashMap<String, Object> map74 = new HashMap<>();
		map74.put("name" , "facilisis");
		map74.put("weight" , 1);

		HashMap<String, Object> map75 = new HashMap<>();
		map75.put("name" , "quam");
		map75.put("weight" , 1);

		HashMap<String, Object> map76 = new HashMap<>();
		map76.put("name" , "Curabitur");
		map76.put("weight" , 1);

		HashMap<String, Object> map77 = new HashMap<>();
		map77.put("name" , "placerat");
		map77.put("weight" , 1);

		HashMap<String, Object> map78 = new HashMap<>();
		map78.put("name" , "ornare");
		map78.put("weight" , 1);

		HashMap<String, Object> map79 = new HashMap<>();
		map79.put("name" , "sem");
		map79.put("weight" , 1);

		HashMap<String, Object> map80 = new HashMap<>();
		map80.put("name" , "in");
		map80.put("weight" , 1);

		HashMap<String, Object> map81 = new HashMap<>();
		map81.put("name" , "mattis");
		map81.put("weight" , 1);

		HashMap<String, Object> map82 = new HashMap<>();
		map82.put("name" , "purus");
		map82.put("weight" , 1);

		HashMap<String, Object> map83 = new HashMap<>();
		map83.put("name" , "posuere");
		map83.put("weight" , 1);

		HashMap<String, Object> map84 = new HashMap<>();
		map84.put("name" , "eget");
		map84.put("weight" , 1);

		HashMap<String, Object> map85 = new HashMap<>();
		map85.put("name" , "Praesent");
		map85.put("weight" , 1);

		HashMap<String, Object> map86 = new HashMap<>();
		map86.put("name" , "non");
		map86.put("weight" , 1);

		HashMap<String, Object> map87 = new HashMap<>();
		map87.put("name" , "condimentum");
		map87.put("weight" , 1);

		HashMap<String, Object> map88 = new HashMap<>();
		map88.put("name" , "odio");
		map88.put("weight" , 1);

		HashMap<String, Object> map89 = new HashMap<>();
		map89.put("name" , "Nunc");
		map89.put("weight" , 1);

		HashMap<String, Object> map90 = new HashMap<>();
		map90.put("name" , "aliquet");
		map90.put("weight" , 1);

		HashMap<String, Object> map91 = new HashMap<>();
		map91.put("name" , "odio");
		map91.put("weight" , 1);

		HashMap<String, Object> map92 = new HashMap<>();
		map92.put("name" , "nec");
		map92.put("weight" , 1);

		HashMap<String, Object> map93 = new HashMap<>();
		map93.put("name" , "auctor");
		map93.put("weight" , 1);

		HashMap<String, Object> map94 = new HashMap<>();
		map94.put("name" , "congue");
		map94.put("weight" , 1);

		HashMap<String, Object> map95 = new HashMap<>();
		map95.put("name" , "sapien");
		map95.put("weight" , 1);

		HashMap<String, Object> map96 = new HashMap<>();
		map96.put("name" , "justo");
		map96.put("weight" , 1);

		HashMap<String, Object> map97 = new HashMap<>();
		map97.put("name" , "dictum");
		map97.put("weight" , 1);

		HashMap<String, Object> map98 = new HashMap<>();
		map98.put("name" , "massa");
		map98.put("weight" , 1);

		HashMap<String, Object> map99 = new HashMap<>();
		map99.put("name" , "nec");
		map99.put("weight" , 1);

		HashMap<String, Object> map100 = new HashMap<>();
		map100.put("name" , "fermentum");
		map100.put("weight" , 1);

		HashMap<String, Object> map101 = new HashMap<>();
		map101.put("name" , "massa");
		map101.put("weight" , 1);

		HashMap<String, Object> map102 = new HashMap<>();
		map102.put("name" , "sapien");
		map102.put("weight" , 1);

		HashMap<String, Object> map103 = new HashMap<>();
		map103.put("name" , "non");
		map103.put("weight" , 1);

		HashMap<String, Object> map104 = new HashMap<>();
		map104.put("name" , "tellus");
		map104.put("weight" , 1);

		HashMap<String, Object> map105 = new HashMap<>();
		map105.put("name" , "Praesent");
		map105.put("weight" , 1);

		HashMap<String, Object> map106 = new HashMap<>();
		map106.put("name" , "luctus");
		map106.put("weight" , 1);

		HashMap<String, Object> map107 = new HashMap<>();
		map107.put("name" , "eros");
		map107.put("weight" , 1);

		HashMap<String, Object> map108 = new HashMap<>();
		map108.put("name" , "et");
		map108.put("weight" , 1);

		HashMap<String, Object> map109 = new HashMap<>();
		map109.put("name" , "nunc");
		map109.put("weight" , 1);

		HashMap<String, Object> map110 = new HashMap<>();
		map110.put("name" , "pretium");
		map110.put("weight" , 1);

		HashMap<String, Object> map111 = new HashMap<>();
		map111.put("name" , "hendrerit");
		map111.put("weight" , 1);

		HashMap<String, Object> map112 = new HashMap<>();
		map112.put("name" , "In");
		map112.put("weight" , 1);

		HashMap<String, Object> map113 = new HashMap<>();
		map113.put("name" , "consequat");
		map113.put("weight" , 1);

		HashMap<String, Object> map114 = new HashMap<>();
		map114.put("name" , "et");
		map114.put("weight" , 1);

		HashMap<String, Object> map115 = new HashMap<>();
		map115.put("name" , "eros");
		map115.put("weight" , 1);

		HashMap<String, Object> map116 = new HashMap<>();
		map116.put("name" , "nec");
		map116.put("weight" , 1);

		HashMap<String, Object> map117 = new HashMap<>();
		map117.put("name" , "interdum");
		map117.put("weight" , 1);

		HashMap<String, Object> map118 = new HashMap<>();
		map118.put("name" , "Ut");
		map118.put("weight" , 1);

		HashMap<String, Object> map119 = new HashMap<>();
		map119.put("name" , "neque");
		map119.put("weight" , 1);

		HashMap<String, Object> map120 = new HashMap<>();
		map120.put("name" , "dui");
		map120.put("weight" , 1);

		HashMap<String, Object> map121 = new HashMap<>();
		map121.put("name" , "maximus");
		map121.put("weight" , 1);

		HashMap<String, Object> map122 = new HashMap<>();
		map122.put("name" , "id");
		map122.put("weight" , 1);

		HashMap<String, Object> map123 = new HashMap<>();
		map123.put("name" , "elit");
		map123.put("weight" , 1);

		HashMap<String, Object> map124 = new HashMap<>();
		map124.put("name" , "ac");
		map124.put("weight" , 1);

		HashMap<String, Object> map125 = new HashMap<>();
		map125.put("name" , "consequat");
		map125.put("weight" , 1);

		HashMap<String, Object> map126 = new HashMap<>();
		map126.put("name" , "pretium");
		map126.put("weight" , 1);

		HashMap<String, Object> map127 = new HashMap<>();
		map127.put("name" , "tellus");
		map127.put("weight" , 1);

		HashMap<String, Object> map128 = new HashMap<>();
		map128.put("name" , "Nullam");
		map128.put("weight" , 1);

		HashMap<String, Object> map129 = new HashMap<>();
		map129.put("name" , "vel");
		map129.put("weight" , 1);

		HashMap<String, Object> map130 = new HashMap<>();
		map130.put("name" , "accumsan");
		map130.put("weight" , 1);

		HashMap<String, Object> map131 = new HashMap<>();
		map131.put("name" , "lorem");
		map131.put("weight" , 1);

		series1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6, map7, map8, map9, map10, map11, map12, map13, map14, map15, map16, map17, map18, map19, map20, map21, map22, map23, map24, map25, map26, map27, map28, map29, map30, map31, map32, map33, map34, map35, map36, map37, map38, map39, map40, map41, map42, map43, map44, map45, map46, map47, map48, map49, map50, map51, map52, map53, map54, map55, map56, map57, map58, map59, map60, map61, map62, map63, map64, map65, map66, map67, map68, map69, map70, map71, map72, map73, map74, map75, map76, map77, map78, map79, map80, map81, map82, map83, map84, map85, map86, map87, map88, map89, map90, map91, map92, map93, map94, map95, map96, map97, map98, map99, map100, map101, map102, map103, map104, map105, map106, map107, map108, map109, map110, map111, map112, map113, map114, map115, map116, map117, map118, map119, map120, map121, map122, map123, map124, map125, map126, map127, map128, map129, map130, map131));

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}


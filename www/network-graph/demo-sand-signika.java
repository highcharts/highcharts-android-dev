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

		chartView.theme = "sand-signika";

		chartView.plugins = new ArrayList<>();
		chartView.plugins.add("networkgraph");

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.setType("networkgraph");
		chart.setHeight("100%");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("The Indo-European Laungauge Tree");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("A Force-Directed Network Graph in Highcharts");
		options.setSubtitle(subtitle);

		HIPlotOptions plotoptions = new HIPlotOptions();
		plotoptions.setNetworkgraph(new HINetworkgraph());
		plotoptions.getNetworkgraph().setKeys(new ArrayList<>(Arrays.asList("from", "to")));
		plotoptions.getNetworkgraph().setLayoutAlgorithm(new HILayoutAlgorithm());
		plotoptions.getNetworkgraph().getLayoutAlgorithm().setEnableSimulation(true);
		options.setPlotOptions(plotoptions);

		HINetworkgraph networkgraph = new HINetworkgraph();
		networkgraph.setDataLabels(new HIDataLabels());
		networkgraph.getDataLabels().setEnabled(true);

		ArrayList<String[]> data = new ArrayList<>(Arrays.asList(
		new String[]{"Proto Indo-European", "Balto-Slavic"},
		new String[]{"Proto Indo-European", "Germanic"},
		new String[]{"Proto Indo-European", "Celtic"},
		new String[]{"Proto Indo-European", "Italic"},
		new String[]{"Proto Indo-European", "Hellenic"},
		new String[]{"Proto Indo-European", "Anatolian"},
		new String[]{"Proto Indo-European", "Indo-Iranian"},
		new String[]{"Proto Indo-European", "Tocharian"},
		new String[]{"Indo-Iranian", "Dardic"},
		new String[]{"Indo-Iranian", "Indic"},
		new String[]{"Indo-Iranian", "Iranian"},
		new String[]{"Iranian", "Old Persian"},
		new String[]{"Old Persian", "Middle Persian"},
		new String[]{"Indic", "Sanskrit"},
		new String[]{"Italic", "Osco-Umbrian"},
		new String[]{"Italic", "Latino-Faliscan"},
		new String[]{"Latino-Faliscan", "Latin"},
		new String[]{"Celtic", "Brythonic"},
		new String[]{"Celtic", "Goidelic"},
		new String[]{"Germanic", "North Germanic"},
		new String[]{"Germanic", "West Germanic"},
		new String[]{"Germanic", "East Germanic"},
		new String[]{"North Germanic", "Old Norse"},
		new String[]{"North Germanic", "Old Swedish"},
		new String[]{"North Germanic", "Old Danish"},
		new String[]{"West Germanic", "Old English"},
		new String[]{"West Germanic", "Old Frisian"},
		new String[]{"West Germanic", "Old Dutch"},
		new String[]{"West Germanic", "Old Low German"},
		new String[]{"West Germanic", "Old High German"},
		new String[]{"Old Norse", "Old Icelandic"},
		new String[]{"Old Norse", "Old Norwegian"},
		new String[]{"Old Norwegian", "Middle Norwegian"},
		new String[]{"Old Swedish", "Middle Swedish"},
		new String[]{"Old Danish", "Middle Danish"},
		new String[]{"Old English", "Middle English"},
		new String[]{"Old Dutch", "Middle Dutch"},
		new String[]{"Old Low German", "Middle Low German"},
		new String[]{"Old High German", "Middle High German"},
		new String[]{"Balto-Slavic", "Baltic"},
		new String[]{"Balto-Slavic", "Slavic"},
		new String[]{"Slavic", "East Slavic"},
		new String[]{"Slavic", "West Slavic"},
		new String[]{"Slavic", "South Slavic"},
		// Leaves:
		new String[]{"Proto Indo-European", "Phrygian"},
		new String[]{"Proto Indo-European", "Armenian"},
		new String[]{"Proto Indo-European", "Albanian"},
		new String[]{"Proto Indo-European", "Thracian"},
		new String[]{"Tocharian", "Tocharian A"},
		new String[]{"Tocharian", "Tocharian B"},
		new String[]{"Anatolian", "Hittite"},
		new String[]{"Anatolian", "Palaic"},
		new String[]{"Anatolian", "Luwic"},
		new String[]{"Anatolian", "Lydian"},
		new String[]{"Iranian", "Balochi"},
		new String[]{"Iranian", "Kurdish"},
		new String[]{"Iranian", "Pashto"},
		new String[]{"Iranian", "Sogdian"},
		new String[]{"Old Persian", "Pahlavi"},
		new String[]{"Middle Persian", "Persian"},
		new String[]{"Hellenic", "Greek"},
		new String[]{"Dardic", "Dard"},
		new String[]{"Sanskrit", "Sindhi"},
		new String[]{"Sanskrit", "Romani"},
		new String[]{"Sanskrit", "Urdu"},
		new String[]{"Sanskrit", "Hindi"},
		new String[]{"Sanskrit", "Bihari"},
		new String[]{"Sanskrit", "Assamese"},
		new String[]{"Sanskrit", "Bengali"},
		new String[]{"Sanskrit", "Marathi"},
		new String[]{"Sanskrit", "Gujarati"},
		new String[]{"Sanskrit", "Punjabi"},
		new String[]{"Sanskrit", "Sinhalese"},
		new String[]{"Osco-Umbrian", "Umbrian"},
		new String[]{"Osco-Umbrian", "Oscan"},
		new String[]{"Latino-Faliscan", "Faliscan"},
		new String[]{"Latin", "Portugese"},
		new String[]{"Latin", "Spanish"},
		new String[]{"Latin", "French"},
		new String[]{"Latin", "Romanian"},
		new String[]{"Latin", "Italian"},
		new String[]{"Latin", "Catalan"},
		new String[]{"Latin", "Franco-Provençal"},
		new String[]{"Latin", "Rhaeto-Romance"},
		new String[]{"Brythonic", "Welsh"},
		new String[]{"Brythonic", "Breton"},
		new String[]{"Brythonic", "Cornish"},
		new String[]{"Brythonic", "Cuymbric"},
		new String[]{"Goidelic", "Modern Irish"},
		new String[]{"Goidelic", "Scottish Gaelic"},
		new String[]{"Goidelic", "Manx"},
		new String[]{"East Germanic", "Gothic"},
		new String[]{"Middle Low German", "Low German"},
		new String[]{"Middle High German", "(High) German"},
		new String[]{"Middle High German", "Yiddish"},
		new String[]{"Middle English", "English"},
		new String[]{"Middle Dutch", "Hollandic"},
		new String[]{"Middle Dutch", "Flemish"},
		new String[]{"Middle Dutch", "Dutch"},
		new String[]{"Middle Dutch", "Limburgish"},
		new String[]{"Middle Dutch", "Brabantian"},
		new String[]{"Middle Dutch", "Rhinelandic"},
		new String[]{"Old Frisian", "Frisian"},
		new String[]{"Middle Danish", "Danish"},
		new String[]{"Middle Swedish", "Swedish"},
		new String[]{"Middle Norwegian", "Norwegian"},
		new String[]{"Old Norse", "Faroese"},
		new String[]{"Old Icelandic", "Icelandic"},
		new String[]{"Baltic", "Old Prussian"},
		new String[]{"Baltic", "Lithuanian"},
		new String[]{"Baltic", "Latvian"},
		new String[]{"West Slavic", "Polish"},
		new String[]{"West Slavic", "Slovak"},
		new String[]{"West Slavic", "Czech"},
		new String[]{"West Slavic", "Wendish"},
		new String[]{"East Slavic", "Bulgarian"},
		new String[]{"East Slavic", "Old Church Slavonic"},
		new String[]{"East Slavic", "Macedonian"},
		new String[]{"East Slavic", "Serbo-Croatian"},
		new String[]{"East Slavic", "Slovene"},
		new String[]{"South Slavic", "Russian"},
		new String[]{"South Slavic", "Ukrainian"},
		new String[]{"South Slavic", "Belarusian"},
		new String[]{"South Slavic", "Rusyn"}
		));
		networkgraph.setData(data);

		options.setSeries(new ArrayList<>(Collections.singletonList(networkgraph)));

		chartView.setOptions(options);
	}
}


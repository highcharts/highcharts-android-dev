package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                HIChartView chartView = findViewById(R.id.hc);
                chartView.plugins = new ArrayList<>(Arrays.asList("heatmap", "data", "boost-canvas", "boost"));
		chartView.theme = "sand-signika";

                HIOptions options = new HIOptions();

HIData data = new HIData();
		data.setCsv(this.csv());
		options.setData(data);

		HIChart chart = new HIChart();
		chart.setType("heatmap");
		chart.setMargin(new ArrayList<>(Arrays.asList(60, 10, 80, 50)));
		options.setChart(chart);

		HIBoost boost = new HIBoost();
		boost.setUseGPUTranslations(true);
		options.setBoost(boost);

		HITitle title = new HITitle();
		title.setText("Highcharts heat map");
		title.setAlign("left");
		title.setX(40);
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Temperature variation by day and hour through 2013");
		subtitle.setAlign("left");
		subtitle.setX(40);
		options.setSubtitle(subtitle);

		HIXAxis xaxis = new HIXAxis();
		xaxis.setType("datetime");
		xaxis.setMin(1356998400000L);
		xaxis.setMax(1388534400000L);
		xaxis.setLabels(new HILabels());
		xaxis.getLabels().setAlign("left");
		xaxis.getLabels().setX(5);
		xaxis.getLabels().setY(14);
		xaxis.setShowLastLabel(false);
		xaxis.setTickLength(16);
		options.setXAxis(new ArrayList<>(Collections.singletonList(xaxis)));

		HIYAxis yaxis = new HIYAxis();
		yaxis.setTitle(new HITitle());
		yaxis.setLabels(new HILabels());
		yaxis.getLabels().setFormat("{value}:00");
		yaxis.setMinPadding(0);
		yaxis.setMaxPadding(0);
		yaxis.setStartOnTick(false);
		yaxis.setEndOnTick(false);
		yaxis.setTickPosition("[0, 6, 12, 18, 24]");
		yaxis.setTickWidth(1);
		yaxis.setMin(0);
		yaxis.setMax(23);
		yaxis.setReversed(true);
		options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

		HIColorAxis coloraxis = new HIColorAxis();
		ArrayList<Object> stops1 = new ArrayList<>();
		stops1.add(0);
		stops1.add("#3060cf");
		ArrayList<Object> stops2 = new ArrayList<>();
		stops2.add(0.5);
		stops2.add("#fffbbc");
		ArrayList<Object> stops3 = new ArrayList<>();
		stops3.add(0.9);
		stops3.add("#c4463a");
		coloraxis.setStops(new ArrayList<>());
		coloraxis.getStops().add(stops1);
		coloraxis.getStops().add(stops2);
		coloraxis.getStops().add(stops3);
		coloraxis.setMin(-15);
		coloraxis.setMax(25);
		coloraxis.setStartOnTick(false);
		coloraxis.setEndOnTick(false);
		coloraxis.setLabels(new HILabels());
		coloraxis.getLabels().setFormat("{value}℃");
		options.setColorAxis(coloraxis);

		HIHeatmap heatmap = new HIHeatmap();
		heatmap.setBoostThreshold(100);
		heatmap.setNullColor(HIColor.initWithHexValue("EFEFEF"));
		heatmap.setColsize((24 * 36e5));
		heatmap.setTooltip(new HITooltip());
		heatmap.getTooltip().setHeaderFormat("Temperature<br/>");
		heatmap.getTooltip().setPointFormat("{point.x:%e %b, %Y} {point.y}:00: <b>{point.value} ℃</b>");
		heatmap.setTurboThreshold(1.7976931348623157e+308);
		options.setSeries(new ArrayList<>(Collections.singletonList(heatmap)));

		chartView.setOptions(options);
        }

        private String csv() {
                return "Date,Time,Temperature\\n2013-01-01,0,1.3\\n2013-01-01,1,1.4\n2013-01-01,2,1.6\n2013-01-01,3,2.0\n2013-01-01,4,2.4\n2013-01-01,5,2.9\n2013-01-01,6,3.1\n2013-01-01,7,2.8\n2013-01-01,8,2.8\n2013-01-01,9,2.7\n2013-01-01,10,3.4\n2013-01-01,11,2.6\n2013-01-01,12,2.4\n2013-01-01,13,2.9\n2013-01-01,15,2.8\n2013-01-01,14,2.8\n2013-01-01,16,2.2\n2013-01-01,18,1.7\n2013-01-01,17,1.8\n2013-01-01,19,1.8\n2013-01-01,20,1.8\n2013-01-01,21,1.7\n2013-01-01,22,1.7\n2013-01-01,23,2.2\n2013-01-02,0,2.2\n2013-01-02,1,2.1\n2013-01-02,2,1.9\n2013-01-02,3,2.0\n2013-01-02,4,2.0\n2013-01-02,5,2.0\n2013-01-02,6,2.2\n2013-01-02,7,2.3\n2013-01-02,8,2.7\n2013-01-02,9,2.9\n2013-01-02,10,2.7\n2013-01-02,11,2.7\n2013-01-02,12,2.6\n2013-01-02,13,2.6\n2013-01-02,14,2.6\n2013-01-02,15,2.5\n2013-01-02,16,2.6\n2013-01-02,17,2.3\n2013-01-02,18,2.2\n2013-01-02,19,2.2\n2013-01-02,20,2.1\n2013-01-02,21,1.9\n2013-01-02,22,1.8\n2013-01-02,23,2.2\n2013-01-03,0,2.2\n2013-01-03,1,1.9\n2013-01-03,3,0.7\n2013-01-03,2,1.5\n2013-01-03,4,0.7\n2013-01-03,5,0.6\n2013-01-03,6,0.7\n2013-01-03,7,0.8\n2013-01-03,8,1.3\n2013-01-03,9,2.5\n2013-01-03,10,4.7\n2013-01-03,11,6.1\n2013-01-03,12,5.7\n2013-01-03,13,5.9\n2013-01-03,14,6.3\n2013-01-03,15,6.4\n2013-01-03,16,6.4\n2013-01-03,17,6.5\n2013-01-03,18,6.5\n2013-01-03,19,6.6\n2013-01-03,20,6.0\n2013-01-03,21,5.4\n2013-01-03,22,4.7\n2013-01-03,23,4.0\n2013-01-04,0,3.8\n2013-01-04,1,4.0\n2013-01-04,3,3.7\n2013-01-04,4,5.0\n2013-01-04,2,3.9\n2013-01-04,5,4.7\n2013-01-04,6,3.9\n2013-01-04,7,3.7\n2013-01-04,8,3.5\n2013-01-04,9,3.3\n2013-01-04,10,3.0\n2013-01-04,11,3.1\n2013-01-04,12,3.5\n2013-01-04,13,4.2\n2013-01-04,15,6.1\n2013-01-04,14,4.7\n2013-01-04,16,7.3\n2013-01-04,17,7.5\n2013-01-04,18,5.6\n2013-01-04,19,4.7\n2013-01-04,20,4.6\n2013-01-04,21,4.4\n2013-01-04,22,4.3\n2013-01-04,23,3.9\n2013-01-05,0,3.2\n2013-01-05,1,3.3\n2013-01-05,2,3.4\n2013-01-05,3,3.5\n2013-01-05,4,3.4\n2013-01-05,5,3.3\n2013-01-05,6,3.3\n2013-01-05,7,3.3\n2013-01-05,8,3.3\n2013-01-05,9,3.2\n2013-01-05,10,3.2\n2013-01-05,11,3.3\n2013-01-05,12,3.4\n2013-01-05,13,3.6\n2013-01-05,14,3.7\n2013-01-05,15,3.8\n2013-01-05,16,3.6\n2013-01-05,17,3.1\n2013-01-05,18,3.2\n2013-01-05,19,3.0\n2013-01-05,20,2.9\n2013-01-05,21,2.9\n2013-01-05,22,2.9\n2013-01-05,23,2.8\n2013-01-06,0,2.8\n2013-01-06,1,2.6\n2013-01-06,2,2.4\n2013-01-06,3,2.4\n2013-01-06,4,2.6\n2013-01-06,5,2.7\n2013-01-06,6,2.9\n2013-01-06,7,3.0\n2013-01-06,8,2.9\n2013-01-06,9,2.9\n2013-01-06,10,3.0\n2013-01-06,11,3.1\n2013-01-06,12,3.4\n2013-01-06,13,3.8\n2013-01-06,14,3.9\n2013-01-06,15,3.7\n2013-01-06,16,3.4\n2013-01-06,17,3.5\n2013-01-06,18,3.4\n2013-01-06,19,3.2\n2013-01-06,20,3.3\n2013-01-06,21,3.2\n2013-01-06,22,3.1\n2013-01-06,23,3.0\n2013-01-07,0,2.8\n2013-01-07,1,2.9\n2013-01-07,2,2.9\n2013-01-07,3,2.6\n2013-01-07,4,2.7\n2013-01-07,5,2.2\n2013-01-07,6,2.3\n2013-01-07,7,2.3\n2013-01-07,8,2.3\n2013-01-07,9,2.3\n2013-01-07,10,2.8\n2013-01-07,11,2.9\n2013-01-07,12,2.8\n2013-01-07,13,3.1\n2013-01-07,14,3.5\n2013-01-07,15,3.5\n2013-01-07,16,3.2\n2013-01-07,17,2.9\n2013-01-07,18,2.8\n2013-01-07,19,2.9\n2013-01-07,20,2.7\n2013-01-07,21,2.8\n2013-01-07,22,2.9\n2013-01-07,23,3.0\n2013-01-08,0,3.3\n2013-01-08,1,3.7\n2013-01-08,2,3.3\n2013-01-08,3,2.8\n2013-01-08,4,2.8\n2013-01-08,5,2.5\n2013-01-08,6,2.5\n2013-01-08,7,2.4\n2013-01-08,8,2.1\n2013-01-08,9,1.2\n2013-01-08,10,0.9\n2013-01-08,11,1.3\n2013-01-08,12,1.5\n2013-01-08,13,2.0\n2013-01-08,14,2.2\n2013-01-08,15,2.2\n2013-01-08,16,2.0\n2013-01-08,17,1.8\n2013-01-08,18,1.8\n2013-01-08,19,1.7\n2013-01-08,20,1.7\n2013-01-08,21,1.5\n2013-01-08,22,1.2\n2013-01-08,23,1.1\n2013-01-09,0,1.2\n2013-01-09,1,1.3\n2013-01-09,2,1.3\n2013-01-09,3,1.1\n2013-01-09,4,0.9\n2013-01-09,5,0.9\n2013-01-09,6,0.9\n2013-01-09,7,0.9\n2013-01-09,8,0.7\n2013-01-09,9,0.7\n2013-01-09,10,0.9\n2013-01-09,11,0.9\n2013-01-09,12,1.1\n2013-01-09,13,1.2\n2013-01-09,14,1.4\n2013-01-09,15,1.5\n2013-01-09,16,1.2\n2013-01-09,17,1.1\n2013-01-09,18,1.0\n2013-01-09,19,1.1\n2013-01-09,20,1.1\n2013-01-09,21,1.3\n2013-01-09,22,1.2\n2013-01-09,23,1.2\n2013-01-10,0,1.1\n2013-01-10,1,1.1\n2013-01-10,2,1.1\n2013-01-10,3,1.0\n2013-01-10,4,0.8\n2013-01-10,5,0.7\n2013-01-10,6,0.3\n2013-01-10,7,-0.8\n2013-01-10,8,-2.0\n2013-01-10,9,-2.5\n2013-01-10,10,-3.0\n2013-01-10,11,-3.3\n2013-01-10,12,-3.3";
        }
}

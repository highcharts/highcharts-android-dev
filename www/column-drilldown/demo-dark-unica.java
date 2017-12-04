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

		chartView.plugins = new ArrayList<>(Arrays.asList("drilldown"));
		chartView.theme = "dark-unica";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "column";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Browser market shares. January, 2015 to May, 2015";
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "Click the columns to view versions.'Source': <a href=\"http://netmarketshare.com\">netmarketshare.com</a>.";
		options.subtitle = subtitle;

		HIXAxis xAxis = new HIXAxis();
		xAxis.type = "category";
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.title = new HITitle();
		yAxis.title.text = "Total percent market share";
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.series = new HISeries();
		plotOptions.series.borderWidth = 0;
		plotOptions.series.dataLabels = new HIDataLabels();
		plotOptions.series.dataLabels.enabled = true;
		plotOptions.series.dataLabels.format = "{point.y:.1f}%";
		options.plotOptions = plotOptions;

		HITooltip tooltip = new HITooltip();
		tooltip.headerFormat = "<span style=\"font-size:11px\">{series.name}</span><br>";
		tooltip.pointFormat = "<span style=\"color:{point.color}\">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>";
		options.tooltip = tooltip;

		HIColumn series1 = new HIColumn();
		series1.name = "Brands";
		series1.colorByPoint = true;

		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("name", "Microsoft Internet Explorer");
		map1.put("y", 56.33);
		map1.put("drilldown", "Microsoft Internet Explorer");

		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("name", "Chrome");
		map2.put("y", 24.03);
		map2.put("drilldown", "Chrome");

		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("name", "Firefox");
		map3.put("y", 10.38);
		map3.put("drilldown", "Firefox");

		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("name", "Safari");
		map4.put("y", 4.77);
		map4.put("drilldown", "Safari");

		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("name", "Opera");
		map5.put("y", 0.91);
		map5.put("drilldown", "Opera");

		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("name", "Proprietary or Undetectable");
		map6.put("y", 0.2);
		map6.put("drilldown", null);

		HashMap[] series1_data = new HashMap[] { map1, map2, map3, map4, map5, map6 };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));
		options.series = new ArrayList<>(Arrays.asList(series1));

		HIDrilldown drilldown = new HIDrilldown();

		HIColumn series2 = new HIColumn();
		series2.name = "Microsoft Internet Explorer";
		series2.id = "Microsoft Internet Explorer";

		Object[] object1 = new Object[] { "v11.0", 24.13 };
		Object[] object2 = new Object[] { "v8.0", 17.2 };
		Object[] object3 = new Object[] { "v9.0", 8.11 };
		Object[] object4 = new Object[] { "v10.0", 5.33 };
		Object[] object5 = new Object[] { "v6.0", 1.06 };
		Object[] object6 = new Object[] { "v7.0", 0.5 };

		series2.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6));

		HIColumn series3 = new HIColumn();
		series3.name = "Chrome";
		series3.id = "Chrome";

		Object[] object7 = new Object[] { "v41.0", 4.32 };
		Object[] object8 = new Object[] { "v42.0", 3.68 };
		Object[] object9 = new Object[] { "v39.0", 2.96 };
		Object[] object10 = new Object[] { "v36.0", 2.53 };
		Object[] object11 = new Object[] { "v43.0", 1.45 };
		Object[] object12 = new Object[] { "v31.0", 1.24 };
		Object[] object13 = new Object[] { "v35.0", 0.85 };
		Object[] object14 = new Object[] { "v38.0", 0.6 };
		Object[] object15 = new Object[] { "v32.0", 0.55 };
		Object[] object16 = new Object[] { "v37.0", 0.38 };
		Object[] object17 = new Object[] { "v33.0", 0.19 };
		Object[] object18 = new Object[] { "v34.0", 0.14 };
		Object[] object19 = new Object[] { "v30.0", 0.14 };
		Object[] object20 = new Object[] { "v40.0", 5 };

		series3.data = new ArrayList<>(Arrays.asList(object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20));

		HIColumn series4 = new HIColumn();
		series4.name = "Firefox";
		series4.id = "Firefox";

		Object[] object21 = new Object[] { "v35", 2.76 };
		Object[] object22 = new Object[] { "v36", 2.32 };
		Object[] object23 = new Object[] { "v37", 2.31 };
		Object[] object24 = new Object[] { "v34", 1.27 };
		Object[] object25 = new Object[] { "v38", 1.02 };
		Object[] object26 = new Object[] { "v31", 0.33 };
		Object[] object27 = new Object[] { "v33", 0.22 };
		Object[] object28 = new Object[] { "v32", 0.15 };

		series4.data = new ArrayList<>(Arrays.asList(object21, object22, object23, object24, object25, object26, object27, object28));

		HIColumn series5 = new HIColumn();
		series5.name = "Safari";
		series5.id = "Safari";

		Object[] object29 = new Object[] { "v8.0", 2.56 };
		Object[] object30 = new Object[] { "v7.1", 0.77 };
		Object[] object31 = new Object[] { "v5.1", 0.42 };
		Object[] object32 = new Object[] { "v5.0", 0.3 };
		Object[] object33 = new Object[] { "v6.1", 0.29 };
		Object[] object34 = new Object[] { "v7.0", 0.26 };
		Object[] object35 = new Object[] { "v6.2", 0.17 };

		series5.data = new ArrayList<>(Arrays.asList(object29, object30, object31, object32, object33, object34, object35));

		HIColumn series6 = new HIColumn();
		series6.name = "Opera";
		series6.id = "Opera";

		Object[] object36 = new Object[] { "v12.x", 0.34 };
		Object[] object37 = new Object[] { "v28", 0.24 };
		Object[] object38 = new Object[] { "v27", 0.17 };
		Object[] object39 = new Object[] { "v29", 0.16 };

		series6.data = new ArrayList<>(Arrays.asList(object36, object37, object38, object39));

		HIColumn[] seriesList = new HIColumn[] {series2, series3, series4, series5, series6 };
		drilldown.series = new ArrayList<>(Arrays.asList(seriesList));
		options.drilldown = drilldown;


		chartView.options = options;
	}
}


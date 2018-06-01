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

		chartView.plugins = new ArrayList<>(Arrays.asList("drilldown"));
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();


		HIChart chart = new HIChart();
		chart.setType("column");
		options.setChart(chart);

		HITitle title = new HITitle();
		title.setText("Browser market shares. January, 2015 to May, 2015");
		options.setTitle(title);

		HISubtitle subtitle = new HISubtitle();
		subtitle.setText("Click the columns to view versions. 'Source': <a href=\"http://netmarketshare.com\">netmarketshare.com</a>.");
		options.setSubtitle(subtitle);

		HIXAxis xAxis = new HIXAxis();
		xAxis.setType("category");
		options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

		HIYAxis yAxis = new HIYAxis();
		yAxis.setTitle(new HITitle());
		yAxis.getTitle().setText("Total percent market share");
		options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

		HILegend legend = new HILegend();
		legend.setEnabled(false);
		options.setLegend(legend);

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.setSeries(new HISeries());
		plotOptions.getSeries().setDataLabels(new HIDataLabels());
		plotOptions.getSeries().getDataLabels().setEnabled(true);
		plotOptions.getSeries().getDataLabels().setFormat("{point.y:.1f}%");
		options.setPlotOptions(plotOptions);

		HITooltip tooltip = new HITooltip();
		tooltip.setHeaderFormat("<span style=\"font-size:11px\">{series.name}</span><br>");
		tooltip.setPointFormat("<span style=\"color:{point.color}\">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>");
		options.setTooltip(tooltip);

		HIColumn series1 = new HIColumn();
		series1.setName("Brands");
		series1.setColorByPoint(true);

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
		series1.setData(new ArrayList<>(Arrays.asList(series1_data)));
		options.setSeries(new ArrayList<>(Arrays.asList(series1)));

		HIDrilldown drilldown = new HIDrilldown();

		HIColumn series2 = new HIColumn();
		series2.setName("Microsoft Internet Explorer");
		series2.setId("Microsoft Internet Explorer");

		Object[] object1 = new Object[] { "v11.0", 24.13 };
		Object[] object2 = new Object[] { "v8.0", 17.2 };
		Object[] object3 = new Object[] { "v9.0", 8.11 };
		Object[] object4 = new Object[] { "v10.0", 5.33 };
		Object[] object5 = new Object[] { "v6.0", 1.06 };
		Object[] object6 = new Object[] { "v7.0", 0.5 };

		series2.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6)));

		HIColumn series3 = new HIColumn();
		series3.setName("Chrome");
		series3.setId("Chrome");

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

		series3.setData(new ArrayList<>(Arrays.asList(object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20)));

		HIColumn series4 = new HIColumn();
		series4.setName("Firefox");
		series4.setId("Firefox");

		Object[] object21 = new Object[] { "v35", 2.76 };
		Object[] object22 = new Object[] { "v36", 2.32 };
		Object[] object23 = new Object[] { "v37", 2.31 };
		Object[] object24 = new Object[] { "v34", 1.27 };
		Object[] object25 = new Object[] { "v38", 1.02 };
		Object[] object26 = new Object[] { "v31", 0.33 };
		Object[] object27 = new Object[] { "v33", 0.22 };
		Object[] object28 = new Object[] { "v32", 0.15 };

		series4.setData(new ArrayList<>(Arrays.asList(object21, object22, object23, object24, object25, object26, object27, object28)));

		HIColumn series5 = new HIColumn();
		series5.setName("Safari");
		series5.setId("Safari");

		Object[] object29 = new Object[] { "v8.0", 2.56 };
		Object[] object30 = new Object[] { "v7.1", 0.77 };
		Object[] object31 = new Object[] { "v5.1", 0.42 };
		Object[] object32 = new Object[] { "v5.0", 0.3 };
		Object[] object33 = new Object[] { "v6.1", 0.29 };
		Object[] object34 = new Object[] { "v7.0", 0.26 };
		Object[] object35 = new Object[] { "v6.2", 0.17 };

		series5.setData(new ArrayList<>(Arrays.asList(object29, object30, object31, object32, object33, object34, object35)));

		HIColumn series6 = new HIColumn();
		series6.setName("Opera");
		series6.setId("Opera");

		Object[] object36 = new Object[] { "v12.x", 0.34 };
		Object[] object37 = new Object[] { "v28", 0.24 };
		Object[] object38 = new Object[] { "v27", 0.17 };
		Object[] object39 = new Object[] { "v29", 0.16 };

		series6.setData(new ArrayList<>(Arrays.asList(object36, object37, object38, object39)));

		HIColumn[] seriesList = new HIColumn[] {series2, series3, series4, series5, series6 };
		drilldown.setSeries(new ArrayList<>(Arrays.asList(seriesList)));
		options.setDrilldown(drilldown);
		
		chartView.setOptions(options);
	    }
}


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
		chartView.theme = "sand-signika";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "pie";
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Browser market shares. January, 2015 to May, 2015";
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "Click the slices to view versions.'Source': netmarketshare.com.";
		options.subtitle = subtitle;

		HIPlotOptions plotOptions = new HIPlotOptions();
		plotOptions.series = new HISeries();
		plotOptions.series.dataLabels = new HIDataLabels();
		plotOptions.series.dataLabels.enabled = true;
		plotOptions.series.dataLabels.format = "{point.name}: {point.y:.1f}%";
		options.plotOptions = plotOptions;

		HITooltip tooltip = new HITooltip();
		tooltip.headerFormat = "<span style=\"font-size:11px\">{series.name}</span><br>";
		tooltip.pointFormat = "<span style=\"color:{point.color}\">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>";
		options.tooltip = tooltip;

		HIPie series1 = new HIPie();
		series1.name = "Brands";

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

		series1.data = new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6));
		options.series = new ArrayList<>(Arrays.asList(series1));

		HIDrilldown drilldown = new HIDrilldown();

		HISeries dseries1 = new HISeries();
		dseries1.name = "Microsoft Internet Explorer";
		dseries1.id = "Microsoft Internet Explorer";

		Object[] object1 = new Object[] { "v11.0", 24.13 };
		Object[] object2 = new Object[] { "v8.0", 17.2 };
		Object[] object3 = new Object[] { "v9.0", 8.11 };
		Object[] object4 = new Object[] { "v10.0", 5.33 };
		Object[] object5 = new Object[] { "v6.0", 1.06 };
		Object[] object6 = new Object[] { "v7.0", 0.5 };

		dseries1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6));

		HISeries dseries2 = new HISeries();
		dseries2.name = "Chrome";
		dseries2.id = "Chrome";

		Object[] object7 = new Object[] { "v40.0", 5 };
		Object[] object8 = new Object[] { "v41.0", 4.32 };
		Object[] object9 = new Object[] { "v42.0", 3.68 };
		Object[] object10 = new Object[] { "v39.0", 2.96 };
		Object[] object11 = new Object[] { "v36.0", 2.53 };
		Object[] object12 = new Object[] { "v43.0", 1.45 };
		Object[] object13 = new Object[] { "v31.0", 1.24 };
		Object[] object14 = new Object[] { "v35.0", 0.85 };
		Object[] object15 = new Object[] { "v38.0", 0.6 };
		Object[] object16 = new Object[] { "v32.0", 0.55 };
		Object[] object17 = new Object[] { "v37.0", 0.38 };
		Object[] object18 = new Object[] { "v33.0", 0.19 };
		Object[] object19 = new Object[] { "v34.0", 0.14 };
		Object[] object20 = new Object[] { "v30.0", 0.14 };

		dseries2.data = new ArrayList<>(Arrays.asList(object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20));

		HISeries dseries3 = new HISeries();
		dseries3.name = "Firefox";
		dseries3.id = "Firefox";

		Object[] object21 = new Object[] { "v35", 2.76 };
		Object[] object22 = new Object[] { "v36", 2.32 };
		Object[] object23 = new Object[] { "v37", 2.31 };
		Object[] object24 = new Object[] { "v34", 1.27 };
		Object[] object25 = new Object[] { "v38", 1.02 };
		Object[] object26 = new Object[] { "v31", 0.33 };
		Object[] object27 = new Object[] { "v33", 0.22 };
		Object[] object28 = new Object[] { "v32", 0.15 };

		dseries3.data = new ArrayList<>(Arrays.asList(object21, object22, object23, object24, object25, object26, object27, object28));

		HISeries dseries4 = new HISeries();
		dseries4.name = "Safari";
		dseries4.id = "Safari";

		Object[] object29 = new Object[] { "v8.0", 2.56 };
		Object[] object30 = new Object[] { "v7.1", 0.77 };
		Object[] object31 = new Object[] { "v5.1", 0.42 };
		Object[] object32 = new Object[] { "v5.0", 0.3 };
		Object[] object33 = new Object[] { "v6.1", 0.29 };
		Object[] object34 = new Object[] { "v7.0", 0.26 };
		Object[] object35 = new Object[] { "v6.2", 0.17 };

		dseries4.data = new ArrayList<>(Arrays.asList(object29, object30, object31, object32, object33, object34, object35));

		HISeries dseries5 = new HISeries();
		dseries5.name = "Opera";
		dseries5.id = "Opera";

		Object[] object36 = new Object[] { "v12.x", 0.34 };
		Object[] object37 = new Object[] { "v28", 0.24 };
		Object[] object38 = new Object[] { "v27", 0.17 };
		Object[] object39 = new Object[] { "v29", 0.16 };

		dseries5.data = new ArrayList<>(Arrays.asList(object36, object37, object38, object39));

		HISeries[] seriesList = new HISeries[] {dseries1, dseries2, dseries3, dseries4, dseries5 };
		drilldown.series = new ArrayList<>(Arrays.asList(seriesList));
		options.drilldown = drilldown;


		chartView.options = options;
	}
}


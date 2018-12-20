package com.highsoft.highcharts.example;

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

        HIOptions options = new HIOptions();
		
        HIChart chart = new HIChart();
        chart.setType("pie");
        chart.setBackgroundColor(null);
        chart.setPlotBorderWidth(0);
        chart.setPlotShadow(false);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Browser<br>shares<br>2015");
        title.setAlign("center");
        title.setVerticalAlign("middle");
        title.setY(40);
        options.setTitle(title);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setPie(new HIPie());
        plotOptions.getPie().setDataLabels(new HIDataLabels());
        plotOptions.getPie().getDataLabels().setEnabled(true);
        plotOptions.getPie().getDataLabels().setDistance(-50);
        plotOptions.getPie().getDataLabels().setStyle(new HICSSObject());
        plotOptions.getPie().getDataLabels().getStyle().setFontWeight("bold");
        plotOptions.getPie().getDataLabels().getStyle().setColor("white");
        plotOptions.getPie().setStartAngle(-90);
        plotOptions.getPie().setEndAngle(90);
        String[] centerList = new String[] {"50%", "75%" };
        plotOptions.getPie().setCenter(new ArrayList<>(Arrays.asList(centerList)));
        options.setPlotOptions(plotOptions);


        HIData data = new HIData();
        data.setName("Proprietary or Undetectable");
        data.setY(0.2);
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("enabled", false);
        data.setDataLabels(map1);

        HIPie series1 = new HIPie();
        series1.setName("Browser share");
        series1.setInnerSize("50%");

        Object[] object1 = new Object[] { "Firefox", 10.38 };
        Object[] object2 = new Object[] { "IE", 56.33 };
        Object[] object3 = new Object[] { "Chrome", 24.03 };
        Object[] object4 = new Object[] { "Safari", 4.77 };
        Object[] object5 = new Object[] { "Opera", 0.91 };

        series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, data)));

        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.setOptions(options);
    }
}


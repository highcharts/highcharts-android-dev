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
        chart.plotBackgroundColor = null;
        chart.plotBorderWidth = 0;
        chart.plotShadow = false;
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Browser<br>shares<br>2015";
        title.align = "center";
        title.verticalAlign = "middle";
        title.y = 40;
        options.title = title;

        HITooltip tooltip = new HITooltip();
        tooltip.pointFormat = "{series.name}: <b>{point.percentage:.1f}%</b>";
        options.tooltip = tooltip;

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.pie = new HIPie();
        plotOptions.pie.dataLabels = new HIDataLabels();
        plotOptions.pie.dataLabels.enabled = true;
        plotOptions.pie.dataLabels.distance = -50;
        plotOptions.pie.dataLabels.style = new HIStyle();
        plotOptions.pie.dataLabels.style.fontWeight = "bold";
        plotOptions.pie.dataLabels.style.color = "white";
        plotOptions.pie.startAngle = -90;
        plotOptions.pie.endAngle = 90;
        String[] centerList = new String[] {"50%", "75%" };
        plotOptions.pie.center = new ArrayList<>(Arrays.asList(centerList));
        options.plotOptions = plotOptions;

        HIPie series1 = new HIPie();

        HIData data = new HIData();
        data.name = "Proprietary or Undetectable";
        data.y = 0.2;
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("enabled", false);
        data.dataLabels = map1;

        series1.type = "pie";
        series1.name = "Browser share";
        series1.innerSize = "50%";

        Object[] object1 = new Object[] { "Firefox", 10.38 };
        Object[] object2 = new Object[] { "IE", 56.33 };
        Object[] object3 = new Object[] { "Chrome", 24.03 };
        Object[] object4 = new Object[] { "Safari", 4.77 };
        Object[] object5 = new Object[] { "Opera", 0.91 };

        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, data));
        
        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}


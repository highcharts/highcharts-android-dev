package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        HIOptions options = new HIOptions();
		
        HITitle title = new HITitle();
        title.setText("World's largest cities per 2014");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Source: <a href=\"http://en.wikipedia.org/wiki/List_of_cities_proper_by_population\">Wikipedia</a>");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setType("category");
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setRotation(-45);
        xAxis.getLabels().setStyle(new HICSSObject());
        xAxis.getLabels().getStyle().setFontSize("13px");
        xAxis.getLabels().getStyle().setFontFamily("Verdana, sans-serif");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setMin(0);
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Population (millions)");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("Population in'2008': <b>{point.y:.1f} millions</b>");
        options.setTooltip(tooltip);

        HIColumn series1 = new HIColumn();
        series1.setName("Population");

        Object[] object1 = new Object[] { "Shanghai", 23.7 };
        Object[] object2 = new Object[] { "Lagos", 16.1 };
        Object[] object3 = new Object[] { "Istanbul", 14.2 };
        Object[] object4 = new Object[] { "Karachi", 14 };
        Object[] object5 = new Object[] { "Mumbai", 12.5 };
        Object[] object6 = new Object[] { "Moscow", 12.1 };
        Object[] object7 = new Object[] { "São Paulo", 11.8 };
        Object[] object8 = new Object[] { "Beijing", 11.7 };
        Object[] object9 = new Object[] { "Guangzhou", 11.1 };
        Object[] object10 = new Object[] { "Delhi", 11.1 };
        Object[] object11 = new Object[] { "Shenzhen", 10.5 };
        Object[] object12 = new Object[] { "Seoul", 10.4 };
        Object[] object13 = new Object[] { "Jakarta", 10 };
        Object[] object14 = new Object[] { "Kinshasa", 9.3 };
        Object[] object15 = new Object[] { "Tianjin", 9.3 };
        Object[] object16 = new Object[] { "Tokyo", 9 };
        Object[] object17 = new Object[] { "Cairo", 8.9 };
        Object[] object18 = new Object[] { "Dhaka", 8.9 };
        Object[] object19 = new Object[] { "Mexico City", 8.9 };
        Object[] object20 = new Object[] { "Lima", 8.9 };

        series1.setData(new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20)));

        series1.setDataLabels(new HIDataLabels());
        series1.getDataLabels().setEnabled(true);
        series1.getDataLabels().setRotation(-90);
        series1.getDataLabels().setColor(HIColor.initWithHexValue("FFFFFF"));
        series1.getDataLabels().setAlign("right");
        series1.getDataLabels().setFormat("{point.y:.1f}");
        series1.getDataLabels().setY(10);
        series1.getDataLabels().setStyle(new HICSSObject());
        series1.getDataLabels().getStyle().setFontSize("13px");
        series1.getDataLabels().getStyle().setFontFamily("Verdana, sans-serif");
        options.setSeries(new ArrayList<>(Arrays.asList(series1)));

        chartView.options = options;
    }
}


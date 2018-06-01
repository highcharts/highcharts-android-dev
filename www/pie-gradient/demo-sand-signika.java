package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setPlotBackgroundColor(null);
        chart.setPlotBorderWidth(null);
        chart.setPlotShadow(false);
        chart.setType("pie");
        options.setChart(chart);

        ArrayList<HIColor> colors = new ArrayList<>();
        HIGradient gradient = new HIGradient(0.5f, 0.3f, 0.7f);
        
        LinkedList<HIStop> s1 = new LinkedList<>();
        s1.add(new HIStop(0, HIColor.initWithHexValue("7cb5ec")));
        s1.add(new HIStop(1, HIColor.initWithRGB(48,105,160)));

        colors.add(HIColor.initWithLinearGradient(gradient, s1));

        LinkedList<HIStop> s2 = new LinkedList<>();
        s2.add(new HIStop(0, HIColor.initWithHexValue("434348")));
        s2.add(new HIStop(1, HIColor.initWithRGB(0,0,0)));

        colors.add(HIColor.initWithLinearGradient(gradient, s2));

        LinkedList<HIStop> s3 = new LinkedList<>();
        s3.add(new HIStop(0, HIColor.initWithHexValue("90ed7d")));
        s3.add(new HIStop(1, HIColor.initWithRGB(68,161,49)));

        colors.add(HIColor.initWithLinearGradient(gradient, s3));
        
        LinkedList<HIStop> s4 = new LinkedList<>();
        s4.add(new HIStop(0, HIColor.initWithHexValue("f7a35c")));
        s4.add(new HIStop(1, HIColor.initWithRGB(171,87,16)));

        colors.add(HIColor.initWithLinearGradient(gradient, s4));

        LinkedList<HIStop> s5 = new LinkedList<>();
        s5.add(new HIStop(0, HIColor.initWithHexValue("8085e9")));
        s5.add(new HIStop(1, HIColor.initWithRGB(52,57,157)));

        colors.add(HIColor.initWithLinearGradient(gradient, s5));

        LinkedList<HIStop> s6 = new LinkedList<>();
        s6.add(new HIStop(0, HIColor.initWithHexValue("f15c80")));
        s6.add(new HIStop(1, HIColor.initWithRGB(165,16,52)));

        colors.add(HIColor.initWithLinearGradient(gradient, s6));

        LinkedList<HIStop> s7 = new LinkedList<>();
        s7.add(new HIStop(0, HIColor.initWithHexValue("e4d354")));
        s7.add(new HIStop(1, HIColor.initWithHexValue("e4d354")));

        colors.add(HIColor.initWithLinearGradient(gradient, s7));

        LinkedList<HIStop> s8 = new LinkedList<>();
        s8.add(new HIStop(0, HIColor.initWithHexValue("2b908f")));
        s8.add(new HIStop(1, HIColor.initWithRGB(0,68,67)));

        colors.add(HIColor.initWithLinearGradient(gradient, s8));

        LinkedList<HIStop> s9 = new LinkedList<>();
        s9.add(new HIStop(0, HIColor.initWithHexValue("f45b5b")));
        s9.add(new HIStop(1, HIColor.initWithRGB(168,15,15)));

        colors.add(HIColor.initWithLinearGradient(gradient, s9));

        LinkedList<HIStop> s10 = new LinkedList<>();
        s10.add(new HIStop(0, HIColor.initWithHexValue("91e8e1")));
        s10.add(new HIStop(1, HIColor.initWithRGB(69,156,149)));

        colors.add(HIColor.initWithLinearGradient(gradient, s10));

        options.setColors(colors);

        HITitle title = new HITitle();
        title.setText("Browser market shares. January, 2015 to May, 2015");
        options.setTitle(title);

        HITooltip tooltip = new HITooltip();
        tooltip.setPointFormat("{series.name}: <b>{point.percentage:.1f}%</b>");
        options.setTooltip(tooltip);

        HIPlotOptions plotoptions = new HIPlotOptions();
        plotoptions.setPie(new HIPie());
        plotoptions.getPie().setAllowPointSelect(true);
        plotoptions.getPie().setCursor("pointer");
        plotoptions.getPie().setDataLabels(new HIDataLabels());
        plotoptions.getPie().getDataLabels().setEnabled(true);
        plotoptions.getPie().getDataLabels().setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
        plotoptions.getPie().getDataLabels().setStyle(new HIStyle());
        plotoptions.getPie().getDataLabels().getStyle().setColor("black");
        plotoptions.getPie().getDataLabels().setConnectorColor("silver");
        options.setPlotOptions(plotoptions);

        HIPie pie = new HIPie();
        pie.setName("Brands");
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "Microsoft Internet Explorer");
        map1.put("y", 56.33);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("name", "Chrome");
        map2.put("y", 24.03);
        map2.put("sliced", true);
        map2.put("selected", true);

        HashMap<String, Object> map3 = new HashMap<>();
        map3.put("name", "Firefox");
        map3.put("y", 10.38);

        HashMap<String, Object> map4 = new HashMap<>();
        map4.put("name", "Safari");
        map4.put("y", 4.77);

        HashMap<String, Object> map5 = new HashMap<>();
        map5.put("name", "Opera");
        map5.put("y", 0.91);

        HashMap<String, Object> map6 = new HashMap<>();
        map6.put("name", "Proprietary or Undetectable");
        map6.put("y", 0.2);

        pie.setData(new ArrayList<>(Arrays.asList(map1, map2, map3, map4, map5, map6)));

        options.setSeries(new ArrayList<>(Collections.singletonList(pie)));

        chartView.setOptions(options);
    }
}

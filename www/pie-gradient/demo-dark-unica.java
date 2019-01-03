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

	chartView.theme = "dark-unica";

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
        plotoptions.getPie().getDataLabels().setStyle(new HICSSObject());
        plotoptions.getPie().getDataLabels().getStyle().setColor("black");
        plotoptions.getPie().getDataLabels().setConnectorColor(HIColor.initWithName("silver"));
        options.setPlotOptions(plotoptions);

        HIPie pie = new HIPie();
        pie.setName("Brands");

        HIData data1 = new HIData();
        data1.setName("Chrome");
        data1.setY(56.33);
        data1.setColor(colors.get(0));
        data1.setSliced(true);
        data1.setSelected(true);

        HIData data2 = new HIData();
        data2.setName("Internet Explorer");
        data2.setY(24.03);
        data2.setColor(colors.get(1));

        HIData data3 = new HIData();
        data3.setName("Firefox");
        data3.setY(10.38);
        data3.setColor(colors.get(2));

        HIData data4 = new HIData();
        data4.setName("Safari");
        data4.setY(4.77);
        data4.setColor(colors.get(3));

        HIData data5 = new HIData();
        data5.setName("Opera");
        data5.setY(0.91);
        data5.setColor(colors.get(4));

        HIData data6 = new HIData();
        data6.setName("Proprietary or Undetectable");
        data6.setY(0.2);
        data6.setColor(colors.get(5));
        
        pie.setData(new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6)));

        options.setSeries(new ArrayList<>(Collections.singletonList(pie)));


        chartView.setOptions(options);
    }
}

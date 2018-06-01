package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);
	chartView.theme = "sand-signika";	

        HIOptions options = new HIOptions();

        Date now = new Date();

        HIChart chart = new HIChart();
        chart.setType("gauge");
        chart.setPlotBackgroundImage("");
        chart.setPlotBorderWidth(0);
        chart.setPlotShadow(false);
        chart.setHeight(200);
        options.setChart(chart);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HITitle title = new HITitle();
        title.setText("The Highcharts clock");
        options.setTitle(title);

        HIPane pane = new HIPane();

        HIBackground paneBackground = new HIBackground();

        pane.setBackground(new ArrayList<>(Collections.singletonList(paneBackground)));

        options.setPane(pane);

        HIYAxis yaxis = new HIYAxis();
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setDistance(-20);
        yaxis.setMin(0);
        yaxis.setMax(12);
        yaxis.setLineWidth(0);
        yaxis.setShowFirstLabel(false);
        yaxis.setMinorTickWidth(1);
        yaxis.setMinorTickLength(5);
        yaxis.setMinorTickPosition("inside");
        yaxis.setGridLineWidth(0);
        yaxis.setMinorTickColor(HIColor.initWithHexValue("666"));

        yaxis.setTickInterval(1);
        yaxis.setTickWidth(2);
        yaxis.setTickPosition("inside");
        yaxis.setTickLength(10);
        yaxis.setTickColor(HIColor.initWithHexValue("666"));
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("Powered by<br/>Highcharts");
        yaxis.getTitle().setStyle(new HIStyle());
        yaxis.getTitle().getStyle().setColor("#BBB");
        yaxis.getTitle().getStyle().setFontWeight("normal");
        yaxis.getTitle().getStyle().setFontSize("8px");
        yaxis.getTitle().setY(10);

        options.setYAxis(new ArrayList<>(Collections.singletonList(yaxis)));

        HITooltip tooltip = new HITooltip();
        tooltip.setFormatter(new HIFunction(
                f -> (String)f.getProperty("series.chart.tooltipText"),
                new String[] {"series.chart.tooltipText"}
        ));
        options.setTooltip(tooltip);

        HIGauge gauge = new HIGauge();

        HIData data1 = new HIData();
        data1.setId("hour");
        data1.setY(now.getHours());

        HIDial dial1 = new HIDial();
        dial1.setRadius("60%");
        dial1.setBaseWidth(4);
        dial1.setBaseLength("95%");
        dial1.setRearLength("0");

        HIData data2 = new HIData();
        data2.setId("minute");
        data2.setY(now.getMinutes());

        HIDial dial2 = new HIDial();
        dial2.setBaseLength("95%");
        dial2.setRearLength("0");

        HIData data3 = new HIData();
        data3.setId("second");
        data3.setY(now.getSeconds());

        HIDial dial3 = new HIDial();
        dial3.setRadius("100%");
        dial3.setBaseWidth(1);
        dial3.setRearLength("20%");

        gauge.setDial(dial1);
        gauge.setData(new ArrayList<>(Arrays.asList(data1, data2)));
        gauge.setAnimation(new HIAnimation());
        gauge.getAnimation().setDuration(0);
        gauge.setDataLabels(new HIDataLabels());
        gauge.getDataLabels().setEnabled(false);

        options.setSeries(new ArrayList<>(Collections.singletonList(gauge)));

        chartView.setOptions(options);
    }
}

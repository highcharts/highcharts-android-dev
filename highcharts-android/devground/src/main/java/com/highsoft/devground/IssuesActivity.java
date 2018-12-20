package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.HIGradient;
import com.highsoft.highcharts.common.HIStop;
import com.highsoft.highcharts.common.hichartsclasses.HIAnimation;
import com.highsoft.highcharts.common.hichartsclasses.HIBackground;
import com.highsoft.highcharts.common.hichartsclasses.HIBubble;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIColumn;
import com.highsoft.highcharts.common.hichartsclasses.HIColumnrange;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIDateTimeLabelFormats;
import com.highsoft.highcharts.common.hichartsclasses.HIDial;
import com.highsoft.highcharts.common.hichartsclasses.HIDrilldown;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HIGauge;
import com.highsoft.highcharts.common.hichartsclasses.HIHeatmap;
import com.highsoft.highcharts.common.hichartsclasses.HIHover;
import com.highsoft.highcharts.common.hichartsclasses.HIItems;
import com.highsoft.highcharts.common.hichartsclasses.HILabel;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILang;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIMonth;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPane;
import com.highsoft.highcharts.common.hichartsclasses.HIPie;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotLines;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HIScatter;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStackLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIStates;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYear;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


    private static final String TAG = "Issue";
    private ArrayList data1;
    private ArrayList data2;
    private ArrayList<HIData> ddSeries1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);


        Button btn = findViewById(R.id.btn);
        btn.setText("Series update");
        HIChartView hiChartView = findViewById(R.id.hc);
        hiChartView.plugins = new ArrayList<>();
        hiChartView.plugins.add("export-data");

        HIOptions options = new HIOptions();
//        hiChartView.plugins = new ArrayList<>();
//        hiChartView.plugins.add("drilldown");
//        HILang hiLang = new HILang();
//        hiLang.setThousandsSep(",");
//        hiChartView.lang = hiLang;
//
//        data1 = randData(10);
//        data2 = randData(10);
////
////        HIDrilldown drilldown = new HIDrilldown();
////        HILine line1 = new HILine();
////        line1.setData(data2);
////        line1.setId("test");
////        drilldown.setSeries(new ArrayList<>(Collections.singletonList(line1)));
////        hiOptions.setDrilldown(drilldown);
//
//        HILine line = new HILine();
//        ddSeries1 = new ArrayList<>();
//        for(int i = 1 ; i < 5; i++){
//            HIData data = new HIData();
//            data.setY(i);
//            data.setDrilldown("test");
//            ddSeries1.add(data);
//        }
//        line.setData(ddSeries1);
//        line.setPoint(new HIPoint());
//        line.getPoint().setEvents(new HIEvents());
//        line.getPoint().getEvents().setClick(new HIFunction(
//                f-> {
//                    Toast.makeText(this, "Val: " + f.getProperty("x") + " / " + f.getProperty("y"), Toast.LENGTH_SHORT).show();
//                },
//                new String[]{"x", "y"}
//        ));
//
//
//        HITooltip tooltip = new HITooltip();
//        tooltip.setShared(true);
//        hiOptions.setTooltip(tooltip);
//
//        hiOptions.setSeries(new ArrayList<>(Arrays.asList(line)));
//        hiChartView.setOptions(hiOptions);
//        hiChartView.setOptions(firstChart());

        HITitle title = new HITitle();
        title.setText("Snow depth at Vikjafjellet, Norway");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Irregular time data in Highcharts JS");
        options.setSubtitle(subtitle);

        HIXAxis xAxis = new HIXAxis();
        xAxis.setType("datetime");
        xAxis.setDateTimeLabelFormats(new HIDateTimeLabelFormats());
        xAxis.getDateTimeLabelFormats().setMonth(new HIMonth());
        xAxis.getDateTimeLabelFormats().getMonth().setMain("%e. %b");
        xAxis.getDateTimeLabelFormats().setYear(new HIYear());
        xAxis.getDateTimeLabelFormats().getYear().setMain("%b");
        xAxis.setTitle(new HITitle());
        xAxis.getTitle().setText("Date");
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Snow depth (m)");
        yAxis.setMin(0);
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HITooltip tooltip = new HITooltip();
        tooltip.setHeaderFormat("<b>{series.name}</b><br>");
        tooltip.setPointFormat("{point.x:%e. %b}: {point.y:.2f} m");
        options.setTooltip(tooltip);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSpline(new HISpline());
        plotOptions.getSpline().setMarker(new HIMarker());
        plotOptions.getSpline().getMarker().setEnabled(true);
        options.setPlotOptions(plotOptions);

        HISpline series1 = new HISpline();
        series1.setName("Winter 2012-2013");
        Number[][] series1_data = new Number[][] { { 25315200000L, 0 }, { 26524800000L, 0.28 }, { 26956800000L, 0.25 }, { 28512000000L, 0.2 }, { 28944000000L, 0.28 }, { 31017600000L, 0.28 }, { 31276800000L, 0.47 }, { 32400000000L, 0.79 }, { 33696000000L, 0.72 }, { 34387200000L, 1.02 }, { 35078400000L, 1.12 }, { 36288000000L, 1.2 }, { 37497600000L, 1.18 }, { 40176000000L, 1.19 }, { 41904000000L, 1.85 }, { 42249600000L, 2.22 }, { 43459200000L, 1.15 }, { 44755200000L, 0 } };
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

        HISpline series2 = new HISpline();
        series2.setName("Winter 2013-2014");
        Number[][] series2_data = new Number[][] { { 26006400000L, 0 }, { 26956800000L, 0.4 }, { 28857600000L, 0.25 }, { 31536000000L, 1.66 }, { 32313600000L, 1.8 }, { 35769600000L, 1.76 }, { 38707200000L, 2.62 }, { 40867200000L, 2.41 }, { 41817600000L, 2.05 }, { 43027200000L, 1.7 }, { 43891200000L, 1.1 }, { 45360000000L, 0 } };
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

        HISpline series3 = new HISpline();
        series3.setName("Winter 2014-2015");
        Number[][] series3_data = new Number[][] { { 28339200000L, 0 }, { 29289600000L, 0.25 }, { 30499200000L, 1.41 }, { 30931200000L, 1.64 }, { 31795200000L, 1.6 }, { 32918400000L, 2.55 }, { 33523200000L, 2.62 }, { 34473600000L, 2.5 }, { 35337600000L, 2.42 }, { 37065600000L, 2.74 }, { 37756800000L, 2.62 }, { 38620800000L, 2.6 }, { 39398400000L, 2.81 }, { 40262400000L, 2.63 }, { 41644800000L, 2.77 }, { 42249600000L, 2.68 }, { 42681600000L, 2.56 }, { 43113600000L, 2.39 }, { 43545600000L, 2.3 }, { 44928000000L, 2 }, { 45360000000L, 1.85 }, { 45792000000L, 1.49 }, { 46483200000L, 1.08 } };
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));
        hiChartView.setOptions(options);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                hiChartView.getOptions().getTitle().setText("CHANGED");
//                hiChartView.setOptions(secondChart());

                secondChart(hiChartView.getOptions());
//                hiChartView.getOptions().getTitle().setText("CHANGED TEXT HOHOHO");

//                hiChartView.reload();
//                hiChartView.reload();

//                HILine series = new HILine();
//                series.setData(randData(7));
//                hiOptions.setSeries(new ArrayList<>(Collections.singletonList(series)));

//                HIYAxis hiyaxis = new HIYAxis();
//                hiyaxis.setMax(8);
//                hiyaxis.setMin(-3);
//                hiOptions.setYAxis(new ArrayList<>(Collections.singletonList(hiyaxis)));
            }
        });
    }

    private ArrayList randData(int bound){
        ArrayList<Integer> data = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            data.add(r.nextInt(bound));
        }
        return data;
    }

    // OP CODE

    public HIOptions firstChart(){

//        HIOptions options = new HIOptions();
//
////        chart.setType("line");
////        chart.getAnimation();
//
//        HITooltip tooltip = new HITooltip();
//        options.setTooltip(tooltip);
//        HIChart chart = new HIChart();
//        chart.setEvents(new HIEvents());
//        chart.getEvents().setLoad(new HIFunction(
//                "function () { this.series[0].data[0].setState('hover'); this.series[1].data[4].setState('hover'); }"
//        ));
//        options.setChart(chart);
//
//        HIExporting exporting = new HIExporting();
//        exporting.setEnabled(false);
//        options.setExporting(exporting);
//
//        HICredits credits = new HICredits();
//        credits.setEnabled(false);
//        options.setCredits(credits);
//
//        HICSSObject titleStyle = new HICSSObject();
//        titleStyle.setFontFamily("serif");
//        titleStyle.setFontSize("20px");
//        titleStyle.setColor("red");
//
//        HITitle title = new HITitle();
//        title.setText("First Chart");
//        title.setStyle(titleStyle);
//        options.setTitle(title);
//
//        String categories[] = new String[0];
//        categories = new String[]{"100Kg", "200Kg", "300Kg", "400Kg", "500Kg", "600Kg", "700Kg", "800Kg"};
//
//        HIMarker marker = new HIMarker();
//        marker.setEnabled(true);
//
//        final HIXAxis xaxis = new HIXAxis();
//        xaxis.setLabels(new HILabels());
//        xaxis.getLabels().setStyle(new HICSSObject());
//        xaxis.getLabels().getStyle().setColor("red");
//        xaxis.setTickmarkPlacement("on");
//
//        HICSSObject hicssObject = new HICSSObject();
//        hicssObject.setFontFamily("Arial");
//        hicssObject.setFontSize("20px");
//        hicssObject.setColor("red");
//
//        xaxis.getLabels().setStyle(hicssObject);
//        xaxis.getLabels().setY(0);
//        xaxis.getLabels().setStep(2);
//        xaxis.getLabels().setRotation(270);
//        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
//        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});
//
//        final HIYAxis yaxis = new HIYAxis();
//        yaxis.setLineWidth(1);
//        yaxis.setGridLineWidth(1);
//        yaxis.setLabels(new HILabels());
//        yaxis.getLabels().setStyle(hicssObject);
//        yaxis.getLabels().setX(-3);
//        yaxis.setTitle(new HITitle());
//        yaxis.getTitle().setText("");
//        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});
//
//        HIDataLabels dataLabels = new HIDataLabels();
//        dataLabels.setEnabled(true);
//
//        HILine line1 = new HILine();
//        line1.setName("line1");
//        line1.setDataLabels(dataLabels);
//        line1.setColor(HIColor.initWithRGBA(0, 155, 255, 1));
//        line1.getDataLabels().setY(-30);
//        line1.getDataLabels().setRotation(270);
//        line1.setData(new ArrayList<>(Arrays.asList(934, 503, 177, 658, 031, 931, 133, 175)));
//        line1.setPoint(new HIPoint());
//        line1.getPoint().setEvents(new HIEvents());
////        line1.getPoint().getEvents().setClick(new HIFunction(
////                f -> {
////                    double xVal = (double) f.getProperty("x");
////                    Toast.makeText(this, "FIRST TOAST; val: " + xVal, Toast.LENGTH_SHORT).show();
////                    int indx = (int) xVal;
////                    double rem = xVal - indx;
////                    if (rem > 0.5) {
////                        indx += 1;
////                    }
////                    getSelectedValues(indx);
////                },
////                new String[]{"x"}
////        ));
//
//
//        options.setTooltip(new HITooltip());
//        options.getTooltip().setFormatter(new HIFunction(
//                f -> {
//                    return myMethod(f.getProperty("x"), f.getProperty("y"));
//                },
//                new String[] {"x", "y"}
//        ));
//
//        HILine line2 = new HILine();
//        line2.setName("line2");
//        line2.setColor(HIColor.initWithRGBA(255, 104, 0, 1));
//        line2.setData(new ArrayList<>(Arrays.asList(916, 164, 742, 851, 490, 282, 121, 340)));
//        line2.setPoint(new HIPoint());
//        line2.getPoint().setEvents(new HIEvents());
////        line2.getPoint().getEvents().setClick(new HIFunction(
////                () -> new AlertDialog.Builder(this)
////                .setTitle("Series point clicked")
////                .setMessage("Clciked FIRST time")
////                .create().show()
////        ));
//
//        options.setSeries(new ArrayList<HISeries>(Arrays.asList(line1, line2)));

        HIOptions options = new HIOptions();
        HIChart chart = new HIChart();
        chart.setType("line");

        HITooltip tooltip = new HITooltip();
        tooltip.setEnabled(false);
        options.setTooltip(tooltip);
        options.setChart(chart);

        HIExporting exporting = new HIExporting();
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        //here
        HICSSObject ChartTitleStyle = new HICSSObject();
        ChartTitleStyle.setColor("red");
        ChartTitleStyle.setFontSize("5px");
        ChartTitleStyle.setFontFamily("Arial");

        HITitle title = new HITitle();
        title.setText("First Chart");
        title.setStyle(ChartTitleStyle);
        options.setTitle(title);
        //here

        String categories[] = new String[0];
        categories = new String[]{"100Kg", "200Kg", "300Kg", "400Kg", "500Kg", "600Kg", "700Kg", "800Kg"};

        HIMarker marker = new HIMarker();
        marker.setEnabled(true);

        final HIXAxis xaxis = new HIXAxis();
        xaxis.setLabels(new HILabels());
        xaxis.setTickmarkPlacement("on");

        HICSSObject hicssObject = new HICSSObject();
        hicssObject.setFontFamily("Arial");
        hicssObject.setFontSize("10px");

        xaxis.getLabels().setStyle(hicssObject);
        xaxis.getLabels().setY(0);
        xaxis.getLabels().setStep(2);
        xaxis.getLabels().setRotation(270);
        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        final HIYAxis yaxis = new HIYAxis();
        yaxis.setLineWidth(1);
        yaxis.setGridLineWidth(1);
        yaxis.setLabels(new HILabels());
        yaxis.getLabels().setStyle(hicssObject);
        yaxis.getLabels().setX(-3);
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.setEnabled(true);

        HILine line1 = new HILine();
        line1.setName("line1");
        line1.setDataLabels(dataLabels);
        line1.setColor(HIColor.initWithRGBA(0, 155, 255, 1));
        line1.getDataLabels().setY(-30);
        line1.getDataLabels().setRotation(270);
        line1.setData(new ArrayList<>(Arrays.asList(934, 503, 177, 658, 031, 931, 133, 175)));
        line1.setPoint(new HIPoint());
        line1.getPoint().setEvents(new HIEvents());
        line1.getPoint().getEvents().setClick(new HIFunction(
                f -> {
                    double xVal = (double) f.getProperty("x");
                    int indx = (int) xVal;
                    double rem = xVal - indx;
                    if (rem > 0.5) {
                        indx += 1;
                    }
                    getSelectedValues(indx);
                },
                new String[]{"x"}
        ));

        HILine line2 = new HILine();
        line2.setName("line2");
        line2.setColor(HIColor.initWithRGBA(255, 104, 0, 1));
        line2.setData(new ArrayList<>(Arrays.asList(916, 164, 742, 851, 490, 282, 121, 340)));

        options.setSeries(new ArrayList<HISeries>(Arrays.asList(line1, line2)));

        return options;
    }

    private String myMethod(Object x, Object y){
        return "The values are: " + x + " and " + y;
    }

    public void secondChart(HIOptions options){

        Log.e(TAG, "Second chart is drawing");
//        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("line");
//        chart.getAnimation();


        HITooltip tooltip = new HITooltip();
        options.setTooltip(tooltip);



        options.setChart(chart);

        HIExporting exporting = new HIExporting();
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);

        HITitle title = new HITitle();
        title.setText("Second Chart");
        options.setTitle(title);

        String categories[] = new String[0];
        categories = new String[]{"10AM", "11AM", "12AM", "13AM", "14AM","15AM","16AM","17AM","18AM"};

        HIMarker marker = new HIMarker();
        marker.setEnabled(true);

        final HIXAxis xaxis = new HIXAxis();
        xaxis.setLabels(new HILabels());
        xaxis.setTickmarkPlacement("on");

        HICSSObject hicssObject = new HICSSObject();
        hicssObject.setFontFamily("Arial");
        hicssObject.setFontSize("10px");

        xaxis.getLabels().setStyle(hicssObject);
        xaxis.getLabels().setY(0);
        xaxis.getLabels().setStep(2);
        xaxis.getLabels().setRotation(270);
        xaxis.setCategories(new ArrayList<>(Arrays.asList(categories)));
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xaxis);}});

        final HIYAxis yaxis = new HIYAxis();
        yaxis.setLineWidth(1);
        yaxis.setGridLineWidth(1);
        yaxis.setLabels(new HILabels());

        yaxis.getLabels().setStyle(hicssObject);
        yaxis.getLabels().setX(-3);
        yaxis.setTitle(new HITitle());
        yaxis.getTitle().setText("");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yaxis);}});

        HIDataLabels dataLabels = new HIDataLabels();
        dataLabels.setEnabled(true);

        HILine line1 = new HILine();
//        HILine line1 = (HILine) options.getSeries().get(0);
        line1.setName("line1");
        line1.setDataLabels(dataLabels);
        line1.setColor(HIColor.initWithRGBA(0, 155, 255, 1));
        line1.getDataLabels().setY(-30);
        line1.getDataLabels().setRotation(270);
        line1.setData(new ArrayList<>(Arrays.asList(43934, 52503, 57177, 69658, 97031, 119931, 137133, 154175)));
        line1.setPoint(new HIPoint());
        line1.getPoint().setEvents(new HIEvents());
//        line1.getPoint().getEvents().setClick(new HIFunction("function() { alert('TESTTEST');}"));
        line1.getPoint().getEvents().setClick(new HIFunction(
                f -> {
                    double xVal = (double) f.getProperty("x");
                    Toast.makeText(this, "Second toast val: " + xVal, Toast.LENGTH_SHORT).show();
                    int indx = (int) xVal;
                    double rem = xVal - indx;
                    if (rem > 0.5) {
                        indx += 1;
                    }
                    getSelectedValues(indx);
                },
                new String[]{"x"}
        ));
        HILine line2 = new HILine();
        line2.setName("line2");
        line2.setColor(HIColor.initWithRGBA(255, 104, 0, 1));
        line2.setData(new ArrayList<>(Arrays.asList(24916, 24064, 29742, 29851, 32490, 30282, 38121, 34340)));
        line2.setPoint(new HIPoint());
        line2.getPoint().setEvents(new HIEvents());
//        line2.getPoint().getEvents().setClick(new HIFunction(
//                f -> {
//                    double xVal = (double) f.getProperty("x");
//                    Toast.makeText(this, "!!!DONE!!!! Val: " + xVal, Toast.LENGTH_SHORT).show();
//                },
//                new String[]{"x"}
//        ));
//        line2.getPoint().getEvents().setClick(new HIFunction(
//                () -> new AlertDialog.Builder(this)
//                        .setTitle("Series point clicked !!!")
//                        .setMessage("Clciked SECOND time")
//                        .create().show()
//        ));


//        options.getTooltip().setFormatter(new HIFunction(
//                f -> "NOW THE X VAL is: " + f.getProperty("x"),
//                new String[] {"x"}
//        ));

        options.setTooltip(new HITooltip());
        options.getTooltip().setFormatter(new HIFunction(
                f -> "TDIPAPDSADPSDOASFNDGHSDJGJHGSFhkj: " + f.getProperty("x"),
                new String[] {"x"}
        ));
        options.setSeries(new ArrayList<HISeries>(Arrays.asList(line1, line2)));
//        return options;
    }

    public void getSelectedValues(int index) {
//        MainActivity fact = new MainActivity();
        getIndexOfChartSelcetion("value passed"); // ??
    }

    public void getIndexOfChartSelcetion(String chartValue) {
        Log.e("getValue",chartValue);
    }
}

package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.HIGradient;
import com.highsoft.highcharts.common.HIStop;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIMarker;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPie;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


//    private static final String TAG = "Issue");
    private ArrayList data1;
    private ArrayList data2;
    private ArrayList<HIData> ddSeries1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        Button btn = findViewById(R.id.btn);
        btn.setText("Series update");


        HIChartView chartView = findViewById(R.id.hc);

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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                hiChartView.getOptions().getTitle().setText("CHANGED");
//                hiChartView.setOptions(secondChart());

                secondChart(chartView.getOptions());
//                hiChartView.getOptions().getTitle().setText("CHANGED TEXT HOHOHO");

//                hiChartView.reload();
//                hiChartView.reload();

//                HILine series = new HILine();
//                getSeries().setData(randData(7));
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
        for(int i = 0 ; i < 100 ; i ++){
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
//        titlegetStyle().setFontFamily("serif");
//        titlegetStyle().setFontSize("20px");
//        titlegetStyle().setColor("red");
//
//        HITitle title = new HITitle();
//        title.setText("First Chart");
//        title.setStyle(titleStyle);
//        options.setTitle(title);
//
//        String categories[] = new String[0));
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
//        getDataLabels().setEnabled(true);
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
//        ChartTitlegetStyle().setColor("red");
//        ChartTitlegetStyle().setFontSize("5px");
//        ChartTitlegetStyle().setFontFamily("Arial");

        HITitle title = new HITitle();
        title.setText("First Chart");
        title.setStyle(ChartTitleStyle);
        options.setTitle(title);
        //here

        String categories[] = new String[]{"100Kg", "200Kg", "300Kg", "400Kg", "500Kg", "600Kg", "700Kg", "800Kg"};

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
//        getDataLabels().setEnabled(true);

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

//        Log.e(TAG, "Second chart is drawing");
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

        String categories[] = new String[]{"10AM", "11AM", "12AM", "13AM", "14AM","15AM","16AM","17AM","18AM"};

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
//        getDataLabels().setEnabled(true);

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

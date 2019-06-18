package com.highsoft.devground;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIArea;
import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabels;
import com.highsoft.highcharts.common.hichartsclasses.HIDataLabelsOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIEvents;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HILabels;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotPieDataLabelsOptionsObject;
import com.highsoft.highcharts.common.hichartsclasses.HIPoint;
import com.highsoft.highcharts.common.hichartsclasses.HIScrollablePlotArea;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HISpline;
import com.highsoft.highcharts.common.hichartsclasses.HIStyle;
import com.highsoft.highcharts.common.hichartsclasses.HISubtitle;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HITooltip;
import com.highsoft.highcharts.common.hichartsclasses.HIVariwide;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;
import com.highsoft.highcharts.core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


    private static final String TAG = "Issue";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);
//        Button btn = findViewById(R.id.btn);
//        btn.setText("Series update");
//        TextView txt = findViewById(R.id.txtView);
//        txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(IssuesActivity.this, "TEXT VIEW CLICKED", Toast.LENGTH_SHORT).show();
//            }
//        });
//        txt.setFocusableInTouchMode(true);
//        txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if(!hasFocus) {
//                    txt.setText("Testerino no focuso");
//                } else {
//
////                    txt.setText("MAMY FOCUS ELO");
//                }
//            }
//        });

        HIChartView chartView = (HIChartView) findViewById(R.id.hc);
        HIOptions options = new HIOptions();
        HIChart chart = new HIChart();
        chart.setType("line");
        chart.setZoomType("x");
        chart.setEvents(new HIEvents());
//        chart.getEvents().setSelection(new HIFunction(
//                f -> {
//                    String xMin = (String) f.getProperty("min");
//                    String xMax = (String) f.getProperty("max");
//                    System.out.println("min and max : = " + xMin + "" + xMax);
//                    Log.e("log", "min and max : = " + xMin + " " + xMax);
//                    //     Log.d("log", "min and max : = " + f.getProperty("min") + "" + f.getProperty("max"));
//
//                },
//                new String[]{"xAxis[0].min", "xAxis[0].max"}
//        ));
        chart.getEvents().setSelection(new HIFunction("function(events) { console.log('value: ' +events.xAxis[0].max);}"));
        chart.getEvents().setClick(new HIFunction(() -> Log.e("TAG", "CLICKED!")));
        options.setChart(chart);

        HILegend legend = new HILegend();
        legend.setLabelFormatter(new HIFunction(("function() { return this.name + ' test'; }")));
        options.setLegend(legend);

        HITitle title = new HITitle();
        title.setText("Demo chart");
        options.setTitle(title);

        HIExporting exporting = new HIExporting();
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HILine series = new HILine();
        series.setData(new ArrayList<>(Arrays.asList(49.9, 71.5, 106.4, 129.2, 144, 176, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4)));
        options.setSeries(new ArrayList<HISeries>(Collections.singletonList(series)));
        chartView.setOptions(options);

//        HIChartView chartView = findViewById(R.id.hc);
//
//        HIOptions options = new HIOptions();
//
//        HIChart chart = new HIChart();
//        chart.setType("bar");
//        options.setChart(chart);
//
//
//        ArrayList<String> categories = new ArrayList<>(Arrays.asList(
//                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
//                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
//                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
//                "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
//        ));
//
//        HIXAxis axis = new HIXAxis();
//        axis.setCategories(categories);
//        options.setXAxis(new ArrayList<>(Collections.singletonList(axis)));
//
//        HISeries series = new HISeries();
//        series.setName("brands");
//        ArrayList<HashMap<String, Object>> dataList = new ArrayList<>();
//        Random r = new Random();
//        for(int i = 0; i < categories.size(); i++){
//            HashMap<String, Object> map = new HashMap<>();
//            map.put("name", "yolo" + i);
//            map.put("y", r.nextInt(80) + 20);
//            dataList.add(map);
//        }
//
//        HIStyle dataLableStyle = new HIStyle();
//        dataLableStyle.setFontSize("10px");
//        HIDataLabelsOptionsObject dataLabels = new HIDataLabelsOptionsObject();
//        dataLabels.setEnabled(true);
//        dataLabels.setCrop(false);
//        dataLabels.setAllowOverlap(false);
//        dataLabels.setUseHTML(true);
//        String jsfunction = "function() { var percentile = Number(((this.y - this.point.prior) / this.point.prior * 100).toFixed(0)); var yData = this.y; if (yData > 100) { yData = Highcharts.numberFormat(yData, 0, ',', ','); } var labelValue; var percent = percentile; labelValue = '<span style = ' + 'color:#000' + '>'+yData+'</span>'; if (yData == 0) { labelValue += ''; } else { labelValue += '<span style =' + 'color:#e28507' + ';font-weight:bold' + '>' + ' : ' + percent + '</span>'; } return labelValue; }";
//        HIFunction labelFormatter = new HIFunction(jsfunction);
//        dataLabels.setFormatter(labelFormatter);
//        dataLabels.setStyle(dataLableStyle);
//
//        series.setDataLabels(dataLabels);
//        series.setData(dataList);
//
//        options.setSeries(new ArrayList<>(Collections.singletonList(series)));
//
////        options.getChart().setScrollablePlotArea(new HIScrollablePlotArea());
////        options.getChart().getScrollablePlotArea().setMinWidth(1000);
////        options.getChart().getScrollablePlotArea().setScrollPositionX(0);
//
//
//        chartView.setOptions(options);




//        btn.setOnClickListener(v -> {
//            HIData data = new HIData();
//            data.setY(6);
//            HICredits credits = new HICredits();
//            credits.setEnabled(true);
//            credits.setText("CREDITSY PRO");
//            credits.setStyle(new HICSSObject());
//            credits.getStyle().setFontSize("20sp");
//            HIYAxis axisnew = new HIYAxis();
//            axisnew.setOpposite(true);
//            axisnew.setLineColor(HIColor.initWithName("blue"));
//        });
    }

    private ArrayList randData(int bound){
        ArrayList<Integer> data = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            data.add(r.nextInt(bound));
        }
        return data;
    }

    class ChartInfo {
        String type;
        String name;

        public ChartInfo(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}

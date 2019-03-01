package com.highsoft.devground;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.highsoft.highcharts.common.hichartsclasses.HICSSObject;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIData;
import com.highsoft.highcharts.common.hichartsclasses.HILine;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;
import com.highsoft.highcharts.core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class IssuesActivity extends AppCompatActivity {


    private static final String TAG = "Issue";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        Button btn = findViewById(R.id.btn);
        btn.setText("Series update");
        TextView txt = findViewById(R.id.txtView);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IssuesActivity.this, "TEXT VIEW CLICKED", Toast.LENGTH_SHORT).show();
            }
        });
        txt.setFocusableInTouchMode(true);
        txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus) {
                    txt.setText("Testerino no focuso");
                } else {
                    txt.setText("MAMY FOCUS ELO");
                }
            }
        });
        HIChartView chartView = findViewById(R.id.hc);
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("data");
        chartView.addFont(R.font.griphite);

        HIOptions options = new HIOptions();
        HITitle title = new HITitle();
        title.setText("EXAMPLE TITLE");
        options.setTitle(title);
        HIChart chart = new HIChart();
        chart.setPanning(true);
        chart.setZoomType("x");
        chart.setStyle(new HICSSObject());
        chart.getStyle().setFontFamily("griphite");
        options.setChart(chart);
        HIXAxis hixAxis = new HIXAxis();
        options.setXAxis(new ArrayList<>(Collections.singletonList(hixAxis)));
        HIYAxis hiyAxis1 = new HIYAxis();
        HIYAxis hiyAxis2 = new HIYAxis();
        hiyAxis2.setOpposite(true);
        options.setYAxis(new ArrayList<>(Arrays.asList(hiyAxis1, hiyAxis2)));

        HILine series1 = new HILine();
        series1.setData(randData(10));
        HILine series2 = new HILine();
        series2.setYAxis(1);
        series2.setData(randData(15));
        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2)));

        chartView.setOptions(options);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series1.hide();
                series1.setName("CHANGES MF");
//                chartView.getOptions().getTitle().setText("CHANGED TIT");
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

    class ChartInfo {
        String type;
        String name;

        public ChartInfo(String type, String name) {
            this.type = type;
            this.name = name;
        }
    }
}

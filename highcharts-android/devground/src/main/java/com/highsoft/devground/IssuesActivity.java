package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.highsoft.highcharts.Common.HIChartsClasses.HIArea;
import com.highsoft.highcharts.Common.HIChartsClasses.HIBar;
import com.highsoft.highcharts.Common.HIChartsClasses.HIChart;
import com.highsoft.highcharts.Common.HIChartsClasses.HICredits;
import com.highsoft.highcharts.Common.HIChartsClasses.HIDataLabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HIEvents;
import com.highsoft.highcharts.Common.HIChartsClasses.HILabels;
import com.highsoft.highcharts.Common.HIChartsClasses.HILang;
import com.highsoft.highcharts.Common.HIChartsClasses.HILegend;
import com.highsoft.highcharts.Common.HIChartsClasses.HILine;
import com.highsoft.highcharts.Common.HIChartsClasses.HIMarker;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotLines;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPlotOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HIPoint;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIChartsClasses.HISpline;
import com.highsoft.highcharts.Common.HIChartsClasses.HISubtitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITime;
import com.highsoft.highcharts.Common.HIChartsClasses.HITitle;
import com.highsoft.highcharts.Common.HIChartsClasses.HITooltip;
import com.highsoft.highcharts.Common.HIChartsClasses.HIXAxis;
import com.highsoft.highcharts.Common.HIChartsClasses.HIYAxis;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Common.HIStop;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Logger;

public class IssuesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        Button btn = findViewById(R.id.btn);
        btn.setText("Series update");
        HIChartView hiChartView = findViewById(R.id.hc);
        HIOptions hiOptions = new HIOptions();

        HILang hiLang = new HILang();
        hiLang.setThousandsSep(",");
        hiChartView.lang = hiLang;

        HILine line = new HILine();
        line.setData(randData(10));
        HILine line1 = new HILine();
        line1.setData(randData(10));

        HITooltip tooltip = new HITooltip();
        tooltip.setShared(true);
        hiOptions.setTooltip(tooltip);


        hiOptions.setSeries(new ArrayList<>(Arrays.asList(line, line1)));
        hiChartView.setOptions(hiOptions);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HILine series = new HILine();
                series.setData(randData(5));
                hiOptions.setSeries(new ArrayList<>(Collections.singletonList(series)));
                HIYAxis hiyaxis = new HIYAxis();
                hiyaxis.setMax(8);
                hiyaxis.setMin(-3);
                hiOptions.setYAxis(new ArrayList<>(Collections.singletonList(hiyaxis)));
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
}

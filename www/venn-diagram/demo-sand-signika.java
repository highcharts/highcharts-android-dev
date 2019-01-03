package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import com.highsoft.highcharts.Core.HIFunction;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

	chartView.theme = "sand-signika";
        chartView.plugins = new ArrayList<>();
        chartView.plugins.add("venn");

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("venn");
        options.setChart(chart);

        HITitle title = new HITitle();;
        title.setText("The Unattainable Triangle");
        options.setTitle(title);

        HIVenn venn = new HIVenn();
        venn.setType("venn");
        venn.setName("The Unattainable Triangle");
        HIData data1 = new HIData();
        data1.setSets(new ArrayList<>(Arrays.asList("Good")));
        data1.setValue(2);
        HIData data2 = new HIData();
        data2.setSets(new ArrayList<>(Arrays.asList("Fast")));
        data2.setValue(2);
        HIData data3 = new HIData();
        data3.setSets(new ArrayList<>(Arrays.asList("Cheap")));
        data3.setValue(2);
        HIData data4 = new HIData();
        data4.setSets(new ArrayList<>(Arrays.asList("Good", "Fast")));
        data4.setValue(1);
        data4.setName("More expensive");
        HIData data5 = new HIData();
        data5.setSets(new ArrayList<>(Arrays.asList("Good", "Cheap")));
        data5.setValue(1);
        data5.setName("Will take time to deliver");
        HIData data6 = new HIData();
        data6.setSets(new ArrayList<>(Arrays.asList("Fast", "Cheap")));
        data6.setValue(1);
        data6.setName("Not the best quality");
        HIData data7 = new HIData();
        data7.setSets(new ArrayList<>(Arrays.asList("Fast", "Cheap", "Good")));
        data7.setValue(1);
        data7.setName("They\'re dreaming");
        venn.setData(new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6, data7)));
        options.setSeries(new ArrayList<>(Collections.singletonList(venn)));

        chartView.setOptions(options);
    }
}


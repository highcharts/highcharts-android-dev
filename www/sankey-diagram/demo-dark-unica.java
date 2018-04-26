package com.highsoft.highcharts.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HIChartView chartView = findViewById(R.id.hc);

        chartView.theme = "dark-unica";

        chartView.plugins = new ArrayList<>(Arrays.asList("sankey"));

        HIOptions options = new HIOptions();
        
        HIChart chart = new HIChart();
        chart.type = "sankey";
        options.chart = chart;

        HITitle title = new HITitle();
        title.text = "Highcharts Sankey Diagram";
        options.title = title;

        HISankey series1 = new HISankey();
        String[] keys = new String[] {"from", "to", "weight" };
        series1.keys = new ArrayList<>(Arrays.asList(keys));
        series1.name = "Sankey demo series";
        
        Object[] object1 = new Object[] { "Brazil", "Portugal", 5 };
        Object[] object2 = new Object[] { "Brazil", "France", 1 };
        Object[] object3 = new Object[] { "Brazil", "Spain", 1 };
        Object[] object4 = new Object[] { "Brazil", "England", 1 };
        Object[] object5 = new Object[] { "Canada", "Portugal", 1 };
        Object[] object6 = new Object[] { "Canada", "France", 5 };
        Object[] object7 = new Object[] { "Canada", "England", 1 };
        Object[] object8 = new Object[] { "Mexico", "Portugal", 1 };
        Object[] object9 = new Object[] { "Mexico", "France", 1 };
        Object[] object10 = new Object[] { "Mexico", "Spain", 5 };
        Object[] object11 = new Object[] { "Mexico", "England", 1 };
        Object[] object12 = new Object[] { "USA", "Portugal", 1 };
        Object[] object13 = new Object[] { "USA", "France", 1 };
        Object[] object14 = new Object[] { "USA", "Spain", 1 };
        Object[] object15 = new Object[] { "USA", "England", 5 };
        Object[] object16 = new Object[] { "Portugal", "Angola", 2 };
        Object[] object17 = new Object[] { "Portugal", "Senegal", 1 };
        Object[] object18 = new Object[] { "Portugal", "Morocco", 1 };
        Object[] object19 = new Object[] { "Portugal", "South Africa", 3 };
        Object[] object20 = new Object[] { "France", "Angola", 1 };
        Object[] object21 = new Object[] { "France", "Senegal", 3 };
        Object[] object22 = new Object[] { "France", "Mali", 3 };
        Object[] object23 = new Object[] { "France", "Morocco", 3 };
        Object[] object24 = new Object[] { "France", "South Africa", 1 };
        Object[] object25 = new Object[] { "Spain", "Senegal", 1 };
        Object[] object26 = new Object[] { "Spain", "Morocco", 3 };
        Object[] object27 = new Object[] { "Spain", "South Africa", 1 };
        Object[] object28 = new Object[] { "England", "Angola", 1 };
        Object[] object29 = new Object[] { "England", "Senegal", 1 };
        Object[] object30 = new Object[] { "England", "Morocco", 2 };
        Object[] object31 = new Object[] { "England", "South Africa", 7 };
        Object[] object32 = new Object[] { "South Africa", "China", 5 };
        Object[] object33 = new Object[] { "South Africa", "India", 1 };
        Object[] object34 = new Object[] { "South Africa", "Japan", 3 };
        Object[] object35 = new Object[] { "Angola", "China", 5 };
        Object[] object36 = new Object[] { "Angola", "India", 1 };
        Object[] object37 = new Object[] { "Angola", "Japan", 3 };
        Object[] object38 = new Object[] { "Senegal", "China", 5 };
        Object[] object39 = new Object[] { "Senegal", "India", 1 };
        Object[] object40 = new Object[] { "Senegal", "Japan", 3 };
        Object[] object41 = new Object[] { "Mali", "China", 5 };
        Object[] object42 = new Object[] { "Mali", "India", 1 };
        Object[] object43 = new Object[] { "Mali", "Japan", 3 };
        Object[] object44 = new Object[] { "Morocco", "China", 5 };
        Object[] object45 = new Object[] { "Morocco", "India", 1 };
        Object[] object46 = new Object[] { "Morocco", "Japan", 3 };

        series1.data = new ArrayList<>(Arrays.asList(object1, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22, object23, object24, object25, object26, object27, object28, object29, object30, object31, object32, object33, object34, object35, object36, object37, object38, object39, object40, object41, object42, object43, object44, object45, object46));

        options.series = new ArrayList<>(Arrays.asList(series1));


        chartView.options = options;
    }
}


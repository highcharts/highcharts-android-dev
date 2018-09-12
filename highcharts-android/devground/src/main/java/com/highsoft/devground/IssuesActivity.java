package com.highsoft.devground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.HIColumn;
import com.highsoft.highcharts.Common.HIChartsClasses.HIData;
import com.highsoft.highcharts.Common.HIChartsClasses.HIExporting;
import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;

public class IssuesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issues);

        HIChartView chartView = findViewById(R.id.hc);
        HIOptions options = new HIOptions();

        options.setExporting(new HIExporting());
        options.getExporting().setEnabled(false);

//
//        Button btn = findViewById(R.id.btn);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final LayoutInflater inflater = getLayoutInflater();
//                final View alertLayout = inflater.inflate(R.layout.dialog_custom, null);
//
//                HIChartView chartView = alertLayout.findViewById(R.id.hc);
//                HIColumn column = new HIColumn();
//                column.setType("column");
//                column.setName("Rainfall");
//                ArrayList<HIColor> listColors = new ArrayList<>();
//                Number[] columnData = new Number[] {49.9, 71.5, 106.4};
//                HIColor c1 = HIColor.initWithHexValue("ff0000");
//                HIColor c2 = HIColor.initWithHexValue("00ff00");
//                HIColor c3 = HIColor.initWithHexValue("0000ff");
//                listColors.add(c1);
//                listColors.add(c2);
//                listColors.add(c3);
//                options.setColors(listColors);
//                column.setData(new ArrayList<>(Arrays.asList(columnData)));
//                column.setTooltip(new HITooltip());
//                column.getTooltip().setValueSuffix(" mm");
//
//                options.setSeries(new ArrayList<>(Collections.singletonList(column)));
//                chartView.setOptions(options);
//
//                AlertDialog.Builder alert = new AlertDialog.Builder(IssuesActivity.this);
//                alert.setTitle("Graph");
//                alert.setView(alertLayout);
//                alert.setCancelable(false);
//
//                alert.setNegativeButton("Cancel", (dialog, which) -> Toast.makeText(getBaseContext(), "Cancel clicked", Toast.LENGTH_SHORT).show());
//                alert.setPositiveButton("Done", (dialog, which) -> Toast.makeText(getBaseContext(), "Done click", Toast.LENGTH_SHORT).show());
//
//                AlertDialog dialog = alert.create();
//                dialog.show();
//            }
//        });


        HIColumn series1 = new HIColumn();
        series1.setName("Realisasi");
        ArrayList<ChartData> listData = new ArrayList<>();
        listData.add(new ChartData(1, "blue"));
        listData.add(new ChartData(3, "yellow"));
        listData.add(new ChartData(4, "blue"));
        listData.add(new ChartData(1, "blue"));
        ArrayList<HIData> listDataFromApi = new ArrayList<>();
        for (int i = 0; i < listData.size(); i++) {
            HIData data = new HIData();
            data.setY(listData.get(i).realisasi_simplified);
            if(listData.get(i).color.equals("blue")){
                HIColor blue = HIColor.initWithHexValue("3f89df");
                data.setColor(blue);

            }else if (listData.get(i).color.equals("yellow")){
                HIColor yellow = HIColor.initWithHexValue("ffad48");
                data.setColor(yellow);
            }
            listDataFromApi.add(data);
        }
        series1.setData(listDataFromApi);
        series1.setPointPadding(0.2);
        series1.setPointPlacement(-0.2);

//        HIColumn series3 = new HIColumn();
//        series3.setName("Target Realisasi");
//        series3.setColor(HIColor.initWithHexValue("f3f3f3"));
//        ArrayList<Float> listDataSeries3 = new ArrayList<>();
//        for (int i = 0; i < listData.size(); i++) {
//            listDataSeries3.add(listData.get(i).target_simplified);
//        }
//        series3.setData(listDataSeries3);
//        series3.setPointPadding(0.4);
//        series3.setPointPlacement(-0.2);

        ArrayList<HISeries> listSeries = new ArrayList<>();
        listSeries.add(series1);
//        listSeries.add(series3);
        options.setSeries(listSeries);


        chartView.setOptions(options);

    }
}

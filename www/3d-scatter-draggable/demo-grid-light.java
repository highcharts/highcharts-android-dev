package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Core.HIGChartView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HIGChartView chartView = (HIGChartView) findViewById(R.id.hc);
		chartView.theme = "grid-light";

		HIOptions options = new HIOptions();

		HIChart chart = new HIChart();
		chart.renderTo = "container";
		chart.margin = new ArrayList<>(Arrays.asList(100));
		chart.type = "scatter3d";
		chart.options3d = new HIOptions3d();
		chart.options3d.enabled = true;
		chart.options3d.alpha = 10;
		chart.options3d.beta = 30;
		chart.options3d.depth = 250;
		chart.options3d.viewDistance = 5;
		chart.options3d.fitToPlot = false;
		chart.options3d.frame = new HIFrame();
		chart.options3d.frame.bottom = new HIBottom();
		chart.options3d.frame.bottom.size = 1;
		chart.options3d.frame.bottom.color = HIColor.initWithRGBA(0, 0, 0, 0.02);
		chart.options3d.frame.back = new HIBack();
		chart.options3d.frame.back.size = 1;
		chart.options3d.frame.back.color = HIColor.initWithRGBA(0, 0, 0, 0.04);
		chart.options3d.frame.side = new HISide();
		chart.options3d.frame.side.size = 1;
		chart.options3d.frame.side.color = HIColor.initWithRGBA(0, 0, 0, 0.06);
		options.chart = chart;

		HITitle title = new HITitle();
		title.text = "Draggable box";
		options.title = title;

		HISubtitle subtitle = new HISubtitle();
		subtitle.text = "";
		options.subtitle = subtitle;

		HIXAxis xAxis = new HIXAxis();
		xAxis.min = 0;
		xAxis.max = 10;
		xAxis.gridLineWidth = 1;
		options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();
		yAxis.min = 0;
		yAxis.max = 10;
		yAxis.title = new HITitle();
		options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		HILegend legend = new HILegend();
		legend.enabled = false;
		options.legend = legend;

		HIScatter3d series1 = new HIScatter3d();
		series1.name = "Reading";

		Number[] data1 = new Number[] {  1, 6, 5  } ;
		Number[] data2 = new Number[] {  8, 7, 9  } ;
		Number[] data3 = new Number[] {  1, 3, 4  } ;
		Number[] data4 = new Number[] {  4, 6, 8  } ;
		Number[] data5 = new Number[] {  5, 7, 7  } ;
		Number[] data6 = new Number[] {  6, 9, 6  } ;
		Number[] data7 = new Number[] {  7, 0, 5  } ;
		Number[] data8 = new Number[] {  2, 3, 3  } ;
		Number[] data9 = new Number[] {  3, 9, 8  } ;
		Number[] data10 = new Number[] {  3, 6, 5  } ;
		Number[] data11 = new Number[] {  4, 9, 4  } ;
		Number[] data12 = new Number[] {  2, 3, 3  } ;
		Number[] data13 = new Number[] {  6, 9, 9  } ;
		Number[] data14 = new Number[] {  0, 7, 0  } ;
		Number[] data15 = new Number[] {  7, 7, 9  } ;
		Number[] data16 = new Number[] {  7, 2, 9  } ;
		Number[] data17 = new Number[] {  0, 6, 2  } ;
		Number[] data18 = new Number[] {  4, 6, 7  } ;
		Number[] data19 = new Number[] {  3, 7, 7  } ;
		Number[] data20 = new Number[] {  0, 1, 7  } ;
		Number[] data21 = new Number[] {  2, 8, 6  } ;
		Number[] data22 = new Number[] {  2, 3, 7  } ;
		Number[] data23 = new Number[] {  6, 4, 8  } ;
		Number[] data24 = new Number[] {  3, 5, 9  } ;
		Number[] data25 = new Number[] {  7, 9, 5  } ;
		Number[] data26 = new Number[] {  3, 1, 7  } ;
		Number[] data27 = new Number[] {  4, 4, 2  } ;
		Number[] data28 = new Number[] {  3, 6, 2  } ;
		Number[] data29 = new Number[] {  3, 1, 6  } ;
		Number[] data30 = new Number[] {  6, 8, 5  } ;
		Number[] data31 = new Number[] {  6, 6, 7  } ;
		Number[] data32 = new Number[] {  4, 1, 1  } ;
		Number[] data33 = new Number[] {  7, 2, 7  } ;
		Number[] data34 = new Number[] {  7, 7, 0  } ;
		Number[] data35 = new Number[] {  8, 8, 9  } ;
		Number[] data36 = new Number[] {  9, 4, 1  } ;
		Number[] data37 = new Number[] {  8, 3, 4  } ;
		Number[] data38 = new Number[] {  9, 8, 9  } ;
		Number[] data39 = new Number[] {  3, 5, 3  } ;
		Number[] data40 = new Number[] {  0, 2, 4  } ;
		Number[] data41 = new Number[] {  6, 0, 2  } ;
		Number[] data42 = new Number[] {  2, 1, 3  } ;
		Number[] data43 = new Number[] {  5, 8, 9  } ;
		Number[] data44 = new Number[] {  2, 1, 1  } ;
		Number[] data45 = new Number[] {  9, 7, 6  } ;
		Number[] data46 = new Number[] {  3, 0, 2  } ;
		Number[] data47 = new Number[] {  9, 9, 0  } ;
		Number[] data48 = new Number[] {  3, 4, 8  } ;
		Number[] data49 = new Number[] {  2, 6, 1  } ;
		Number[] data50 = new Number[] {  8, 9, 2  } ;
		Number[] data51 = new Number[] {  7, 6, 5  } ;
		Number[] data52 = new Number[] {  6, 3, 1  } ;
		Number[] data53 = new Number[] {  9, 3, 1  } ;
		Number[] data54 = new Number[] {  8, 9, 3  } ;
		Number[] data55 = new Number[] {  9, 1, 0  } ;
		Number[] data56 = new Number[] {  3, 8, 7  } ;
		Number[] data57 = new Number[] {  8, 0, 0  } ;
		Number[] data58 = new Number[] {  4, 9, 7  } ;
		Number[] data59 = new Number[] {  8, 6, 2  } ;
		Number[] data60 = new Number[] {  4, 3, 0  } ;
		Number[] data61 = new Number[] {  2, 3, 5  } ;
		Number[] data62 = new Number[] {  9, 1, 4  } ;
		Number[] data63 = new Number[] {  1, 1, 4  } ;
		Number[] data64 = new Number[] {  6, 0, 2  } ;
		Number[] data65 = new Number[] {  6, 1, 6  } ;
		Number[] data66 = new Number[] {  3, 8, 8  } ;
		Number[] data67 = new Number[] {  8, 8, 7  } ;
		Number[] data68 = new Number[] {  5, 5, 0  } ;
		Number[] data69 = new Number[] {  3, 9, 6  } ;
		Number[] data70 = new Number[] {  5, 4, 3  } ;
		Number[] data71 = new Number[] {  6, 8, 3  } ;
		Number[] data72 = new Number[] {  0, 1, 5  } ;
		Number[] data73 = new Number[] {  6, 7, 3  } ;
		Number[] data74 = new Number[] {  8, 3, 2  } ;
		Number[] data75 = new Number[] {  3, 8, 3  } ;
		Number[] data76 = new Number[] {  2, 1, 6  } ;
		Number[] data77 = new Number[] {  4, 6, 7  } ;
		Number[] data78 = new Number[] {  8, 9, 9  } ;
		Number[] data79 = new Number[] {  5, 4, 2  } ;
		Number[] data80 = new Number[] {  6, 1, 3  } ;
		Number[] data81 = new Number[] {  6, 9, 5  } ;
		Number[] data82 = new Number[] {  4, 8, 2  } ;
		Number[] data83 = new Number[] {  9, 7, 4  } ;
		Number[] data84 = new Number[] {  5, 4, 2  } ;
		Number[] data85 = new Number[] {  9, 6, 1  } ;
		Number[] data86 = new Number[] {  2, 7, 3  } ;
		Number[] data87 = new Number[] {  4, 5, 4  } ;
		Number[] data88 = new Number[] {  6, 8, 1  } ;
		Number[] data89 = new Number[] {  3, 4, 0  } ;
		Number[] data90 = new Number[] {  2, 2, 6  } ;
		Number[] data91 = new Number[] {  5, 1, 2  } ;
		Number[] data92 = new Number[] {  9, 9, 7  } ;
		Number[] data93 = new Number[] {  6, 9, 9  } ;
		Number[] data94 = new Number[] {  8, 4, 3  } ;
		Number[] data95 = new Number[] {  4, 1, 7  } ;
		Number[] data96 = new Number[] {  6, 2, 5  } ;
		Number[] data97 = new Number[] {  0, 4, 9  } ;
		Number[] data98 = new Number[] {  3, 5, 9  } ;
		Number[] data99 = new Number[] {  6, 9, 1  } ;
		Number[] data100 = new Number[] {  1, 9, 2  } ;
		series1.data = new ArrayList<>(Arrays.asList(data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14, data15, data16, data17, data18, data19, data20, data21, data22, data23, data24, data25, data26, data27, data28, data29, data30, data31, data32, data33, data34, data35, data36, data37, data38, data39, data40, data41, data42, data43, data44, data45, data46, data47, data48, data49, data50, data51, data52, data53, data54, data55, data56, data57, data58, data59, data60, data61, data62, data63, data64, data65, data66, data67, data68, data69, data70, data71, data72, data73, data74, data75, data76, data77, data78, data79, data80, data81, data82, data83, data84, data85, data86, data87, data88, data89, data90, data91, data92, data93, data94, data95, data96, data97, data98, data99, data100));

		options.series = new ArrayList<>(Arrays.asList(series1));


		chartView.options = options;
	}
}

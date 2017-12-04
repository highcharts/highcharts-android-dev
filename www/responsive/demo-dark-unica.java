package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIGChartView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	private HIGChartView chartView;
	private String currentButtonClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chartView = (HIGChartView) findViewById(R.id.hc);

	this.chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

	HIChart chart = new HIChart();
	chart.type = "column";
	options.chart = chart;
	currentButtonClicked = "";

	HITitle title = new HITitle();
	title.text = "Highcharts responsive chart";
	options.title = title;

	HISubtitle subtitle = new HISubtitle();
	subtitle.text = "Resize the frame or click buttons to change appearance";
	options.subtitle = subtitle;

	HILegend legend = new HILegend();
	legend.align = "right";
	legend.verticalAlign = "middle";
	legend.layout = "vertical";
	options.legend = legend;

	HIXAxis xAxis = new HIXAxis();
	String[] categoriesList = new String[] { "Apples", "Oranges", "Bananas" };
	xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
	xAxis.labels = new HILabels();
	xAxis.labels.x = -10;
	options.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

	HIYAxis yAxis = new HIYAxis();
	yAxis.allowDecimals = false;
	yAxis.title = new HITitle();
	yAxis.title.text = "Amount";
	options.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

	HIColumn series1 = new HIColumn();
	series1.name = "Christmas Eve";
	Number[] series1_data = new Number[] { 1, 4, 3 };
	series1.data = new ArrayList<>(Arrays.asList(series1_data));

	HIColumn series2 = new HIColumn();
	series2.name = "Christmas Day before dinner";
	Number[] series2_data = new Number[] { 6, 4, 2 };
	series2.data = new ArrayList<>(Arrays.asList(series2_data));

	HIColumn series3 = new HIColumn();
	series3.name = "Christmas Day after dinner";
	Number[] series3_data = new Number[] { 8, 4, 3 };
	series3.data = new ArrayList<>(Arrays.asList(series3_data));

	options.series = new ArrayList<>(Arrays.asList(series1, series2, series3));

        chartView.options = options;

	Button largeButton = (Button) findViewById(R.id.large);
	largeButton.setOnClickListener(v -> changeChartDimensions(currentButtonClicked, (String) largeButton.getText()));
	Button smallButton = (Button) findViewById(R.id.small);
	smallButton.setOnClickListener(v -> changeChartDimensions(currentButtonClicked, (String) smallButton.getText()));
    }

	private void changeChartDimensions(String current, String buttonText){

		if(buttonText.equals(current)) return;

		HIOptions newOptions = new HIOptions();

		HIChart chart = new HIChart();
		chart.type = "column";

		HITitle title = new HITitle();
		title.text = "Highcharts responsive chart";
		newOptions.title = title;

		HISubtitle subtitle = new HISubtitle();

		HILegend legend = new HILegend();

		HICredits credits = new HICredits();

		HIXAxis xAxis = new HIXAxis();
		String[] categoriesList = new String[] { "Apples", "Oranges", "Bananas" };
		xAxis.categories = new ArrayList<>(Arrays.asList(categoriesList));
		xAxis.labels = new HILabels();
		xAxis.labels.x = -10;
		newOptions.xAxis = new ArrayList<HIXAxis>(){{add(xAxis);}};

		HIYAxis yAxis = new HIYAxis();

		HIColumn series1 = new HIColumn();
		series1.name = "Christmas Eve";
		Number[] series1_data = new Number[] { 1, 4, 3 };
		series1.data = new ArrayList<>(Arrays.asList(series1_data));

		HIColumn series2 = new HIColumn();
		series2.name = "Christmas Day before dinner";
		Number[] series2_data = new Number[] { 6, 4, 2 };
		series2.data = new ArrayList<>(Arrays.asList(series2_data));

		HIColumn series3 = new HIColumn();
		series3.name = "Christmas Day after dinner";
		Number[] series3_data = new Number[] { 8, 4, 3 };
		series3.data = new ArrayList<>(Arrays.asList(series3_data));

		newOptions.series = new ArrayList<>(Arrays.asList(series1, series2, series3));

		switch (buttonText) {
			case "LARGE":
				currentButtonClicked = buttonText;
				chart.width = 400;

				subtitle.text = "Resize the frame or click buttons to change appearance";

				legend.align = "right";
				legend.verticalAlign = "middle";
				legend.layout = "vertical";

				yAxis.allowDecimals = false;
				yAxis.title = new HITitle();
				yAxis.title.text = "Amount";
				break;
			case "SMALL":
				currentButtonClicked = buttonText;
				chart.width = 400;
				chart.height = 300;

				subtitle.text = "";

				credits.enabled = false;

				legend.align = "center";
				legend.verticalAlign = "bottom";
				legend.layout = "horizontal";

				yAxis.title = new HITitle();
				yAxis.title.text = "";
				yAxis.labels = new HILabels();
				yAxis.labels.align = "left";
				yAxis.labels.x = 0;
				yAxis.labels.y = -5;
				break;
		}

		newOptions.chart = chart;
		newOptions.title = title;
		newOptions.subtitle = subtitle;
		newOptions.credits = credits;
		newOptions.legend = legend;
		newOptions.yAxis = new ArrayList<HIYAxis>(){{add(yAxis);}};

		this.chartView.options = newOptions;
		this.chartView.reload();
	}
}

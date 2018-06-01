package com.highcharts.DevGround.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.highsoft.highcharts.Common.HIChartsClasses.*;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

	private HIChartView chartView;
	private String currentButtonClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.chartView = findViewById(R.id.hc);

	this.chartView.theme = "dark-unica";

        HIOptions options = new HIOptions();

        HITitle title = new HITitle();
        title.setText("Highcharts responsive chart");
        options.setTitle(title);

        HISubtitle subtitle = new HISubtitle();
        subtitle.setText("Resize the frame or click buttons to change appearance");
        options.setSubtitle(subtitle);

        HICredits credits = new HICredits();
        options.setCredits(credits);

        HILegend legend = new HILegend();
        legend.setAlign("right");
        legend.setVerticalAlign("middle");
        legend.setLayout("vertical");
        options.setLegend(legend);

        HIXAxis xAxis = new HIXAxis();
        String[] categoriesList = new String[] { "Apples", "Oranges", "Bananas" };
        xAxis.setCategories(new ArrayList<>(Arrays.asList(categoriesList)));
        xAxis.setLabels(new HILabels());
        xAxis.getLabels().setX(-10);
        options.setXAxis(new ArrayList<HIXAxis>(){{add(xAxis);}});

        HIYAxis yAxis = new HIYAxis();
        yAxis.setAllowDecimals(false);
        yAxis.setTitle(new HITitle());
        yAxis.getTitle().setText("Amount");
        options.setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

        HIColumn series1 = new HIColumn();
        series1.setName("Christmas Eve");
        Number[] series1_data = new Number[] { 1, 4, 3 };
        series1.setData(new ArrayList<>(Arrays.asList(series1_data)));

        HIColumn series2 = new HIColumn();
        series2.setName("Christmas Day before dinner");
        Number[] series2_data = new Number[] { 6, 4, 2 };
        series2.setData(new ArrayList<>(Arrays.asList(series2_data)));

        HIColumn series3 = new HIColumn();
        series3.setName("Christmas Day after dinner");
        Number[] series3_data = new Number[] { 8, 4, 3 };
        series3.setData(new ArrayList<>(Arrays.asList(series3_data)));

        options.setSeries(new ArrayList<>(Arrays.asList(series1, series2, series3)));

        chartView.setOptions(options);

        Button largeButton = (Button) findViewById(R.id.large);
        largeButton.setOnClickListener(v -> changeChartDimensions(currentButtonClicked, (String) largeButton.getText()));
        Button smallButton = (Button) findViewById(R.id.small);
        smallButton.setOnClickListener(v -> changeChartDimensions(currentButtonClicked, (String) smallButton.getText()));
    }

    private void changeChartDimensions(String current, String buttonText){

        if(buttonText.equals(current)) return;
        switch (buttonText) {
            case "LARGE":
                currentButtonClicked = buttonText;
                chartView.getOptions().getChart().setWidth(600);
                chartView.getOptions().getChart().setHeight(300);
                chartView.getOptions().getCredits().setEnabled(true);
                chartView.getOptions().getSubtitle().setText("Resize the frame or click buttons to change appearance");
                chartView.getOptions().getLegend().setAlign("right");
                chartView.getOptions().getLegend().setVerticalAlign("middle");
                chartView.getOptions().getLegend().setLayout("vertical");
                HIYAxis yAxis = new HIYAxis();
                yAxis.setAllowDecimals(false);
                yAxis.setTitle(new HITitle());
                yAxis.getTitle().setText("Amount");
                chartView.getOptions().setYAxis(new ArrayList<HIYAxis>(){{add(yAxis);}});

                break;
            case "SMALL":
                currentButtonClicked = buttonText;
                chartView.getOptions().getChart().setWidth(400);
                chartView.getOptions().getChart().setHeight(300);
                chartView.getOptions().getSubtitle().setText("");
                chartView.getOptions().getCredits().setEnabled(false);
                chartView.getOptions().getLegend().setAlign("center");
                chartView.getOptions().getLegend().setVerticalAlign("bottom");
                chartView.getOptions().getLegend().setLayout("horizontal");
                HIYAxis hiyAxis = new HIYAxis();
                hiyAxis.setTitle(new HITitle());
                hiyAxis.getTitle().setText("");
                hiyAxis.setLabels(new HILabels());
                hiyAxis.getLabels().setX(0);
                hiyAxis.getLabels().setY(-5);
                chartView.getOptions().setYAxis(new ArrayList<>(Collections.singletonList(hiyAxis)));
                break;
        }
    }
}

package com.highsoft.devground;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.highsoft.devground.databinding.FragmentBlankBinding;
import com.highsoft.highcharts.common.HIColor;
import com.highsoft.highcharts.common.hichartsclasses.HIAccessibility;
import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HILabel;
import com.highsoft.highcharts.common.hichartsclasses.HILegend;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HIPlotOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.common.hichartsclasses.HIXAxis;
import com.highsoft.highcharts.common.hichartsclasses.HIYAxis;

import java.util.ArrayList;
import java.util.Arrays;

public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    public BlankFragment() {
    }

    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        HIOptions options = new HIOptions();

        HIExporting exporting = new HIExporting();
        exporting.setEnabled(false);
        options.setExporting(exporting);

        HIChart chart = new HIChart();
        chart.setIgnoreHiddenSeries(false);
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("");
        options.setTitle(title);

        HIYAxis yAxis = new HIYAxis();
        yAxis.setTitle(title);
        yAxis.getTitle().setText("");
        yAxis.setAccessibility(new HIAccessibility());
        yAxis.getAccessibility().setRangeDescription("Range: 0% to 100%");
        yAxis.setMin(0);

        options.setYAxis(new ArrayList<>(Arrays.asList(yAxis)));

//        ArrayList<MeetingTrend> sevenDayTrends = get7DaysData(index);
//        ArrayList<String> dates = new ArrayList<>();
//        for (int i = 0; i < sevenDayTrends.size(); i++) {
//            dates.add(sevenDayTrends.get(i).getMeeting_date());
//        }
        HIXAxis xAxis = new HIXAxis();
//        xAxis.setCategories(dates);
        options.setXAxis(new ArrayList<>(Arrays.asList(xAxis)));

        HILegend legend = new HILegend();
        legend.setEnabled(false);
        options.setLegend(legend);

        HIPlotOptions plotOptions = new HIPlotOptions();
        plotOptions.setSeries(new HISeries());
        plotOptions.getSeries().setLabel(new HILabel());
        plotOptions.getSeries().getLabel().setConnectorAllowed(true);
        plotOptions.getSeries().setPointStart(0);
        options.setPlotOptions(plotOptions);

        HISeries adheranceSeries = new HISeries();
        adheranceSeries.setName("Adherance");
        adheranceSeries.setColor(HIColor.initWithRGB(148, 135, 254));
//        ArrayList<Integer> adheranceSeriesData = new ArrayList<>();
//        for (int i = 0; i < sevenDayTrends.size(); i++) {
//            adheranceSeriesData.add(sevenDayTrends.get(i).getAdherance());
//        }
        ArrayList<Integer> adheranceSeriesData = new ArrayList<>();
        adheranceSeriesData.add(3);
        adheranceSeriesData.add(7);
        adheranceSeriesData.add(2);
        adheranceSeriesData.add(4);
        adheranceSeriesData.add(7);
        adheranceSeries.setData(adheranceSeriesData);

        HISeries scoreSeries = new HISeries();
        scoreSeries.setName("Score");
        scoreSeries.setColor(HIColor.initWithRGB(255, 166, 123));
//        ArrayList<Integer> scoreSeriesData = new ArrayList<>();
//        for (int i = 0; i < sevenDayTrends.size(); i++) {
//            scoreSeriesData.add(sevenDayTrends.get(i).getScore());
//        }
        ArrayList<Integer> scoreSeriesData = new ArrayList<>();
        scoreSeriesData.add(1);
        scoreSeriesData.add(4);
        scoreSeriesData.add(7);
        scoreSeriesData.add(8);
        scoreSeriesData.add(3);
        scoreSeries.setData(scoreSeriesData);

        options.setSeries(new ArrayList<>(Arrays.asList(adheranceSeries, scoreSeries)));

        binding.hc.setOptions(options);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
package com.highsoft.devground;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.highsoft.highcharts.common.hichartsclasses.HIChart;
import com.highsoft.highcharts.common.hichartsclasses.HICredits;
import com.highsoft.highcharts.common.hichartsclasses.HIExporting;
import com.highsoft.highcharts.common.hichartsclasses.HIOptions;
import com.highsoft.highcharts.common.hichartsclasses.HISeries;
import com.highsoft.highcharts.common.hichartsclasses.HITime;
import com.highsoft.highcharts.common.hichartsclasses.HITitle;
import com.highsoft.highcharts.core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Created by bartosz on 09.08.18.
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<IssuesActivity.ChartInfo> mValues;

    public MyAdapter(ArrayList<IssuesActivity.ChartInfo> mValues) {
        this.mValues = mValues;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public HIChartView chartView;
        public ViewHolder(View v) {
            super(v);
            chartView = v.findViewById(R.id.hc_row);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.hc_rv_holder, parent, false);
        ViewHolder vh = new ViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        HIOptions options = new HIOptions();
        options.setTitle(new HITitle());
        options.getTitle().setText("");
        options.setCredits(new HICredits());
        options.getCredits().setEnabled(false);
        options.setExporting(new HIExporting());
        options.getExporting().setEnabled(false);
        HIChart chart = new HIChart();
        chart.setType(mValues.get(position).type);
        options.setChart(chart);
        HITitle title = new HITitle();
        title.setText(mValues.get(position).name);
        options.setTitle(title);
        HICredits credits = new HICredits();
        credits.setEnabled(false);
        options.setCredits(credits);
        HISeries series = new HISeries();
        series.setData(randData(10));
        options.setSeries(new ArrayList<>(Collections.singletonList(series)));
        options.setTime(new HITime());
        holder.chartView.plugins = new ArrayList<>();
        holder.chartView.plugins.add("Moment");
        holder.chartView.setOptions(options);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    @Override
    public long getItemId(int position) {
        return mValues.get(position).hashCode();
    }
//
//    @Override
//    public int getItemViewType(int position) {
//        return position;
//    }

    private ArrayList randData(int bound){
        ArrayList<Integer> data = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 10 ; i ++){
            data.add(r.nextInt(bound));
        }
        return data;
    }
}

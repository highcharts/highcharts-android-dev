package com.highsoft.devground;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.highsoft.highcharts.Common.HIChartsClasses.HIOptions;
import com.highsoft.highcharts.Common.HIChartsClasses.HISeries;
import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by bartosz on 09.08.18.
 */

class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

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
        System.out.println("KURWA?");
        HIOptions options = new HIOptions();
        HISeries series = new HISeries();
        series.setData(new ArrayList<>(Arrays.asList(5,3,4,5,6,9,3,1)));
        options.setSeries(new ArrayList<>(Collections.singletonList(series)));
//        holder.chartView.setOptions(options);
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

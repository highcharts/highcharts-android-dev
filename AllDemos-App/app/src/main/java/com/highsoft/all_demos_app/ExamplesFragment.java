package com.highsoft.all_demos_app;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ExamplesFragment extends Fragment {

    private static final String ARG_FRAGMENT_NAME = "name";
    private static final String ARG_STRING_ARRAY = "array";
    private OptionsProvider optionsProvider;

    private String mName;
    private String[] mArray;

    public ExamplesFragment() {
        // Required empty public constructor
    }

    public static ExamplesFragment newInstance(String mName, String[] mArray) {
        ExamplesFragment fragment = new ExamplesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_FRAGMENT_NAME, mName);
        args.putStringArray(ARG_STRING_ARRAY, mArray);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_FRAGMENT_NAME);
            mArray = getArguments().getStringArray(ARG_STRING_ARRAY);
            optionsProvider = new OptionsProvider(mName, getContext());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_examples, container, false);
        ((MainActivity) getActivity()).setActionBarTitle(mName);
        final HIChartView chartView = view.findViewById(R.id.hc);
        chartView.options = optionsProvider.getChartOptions(mArray[0]);
        chartView.plugins = new ArrayList<>(); //todo move plugins addition to specific chart options
        chartView.plugins.add("annotations");
        chartView.plugins.add("series-label");
        chartView.plugins.add("data");
        chartView.plugins.add("boost");
        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<String> examplesAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, mArray);
        spinner.setAdapter(examplesAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                chartView.options = optionsProvider.getChartOptions(mArray[position]);
                chartView.reload();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });
        return view;
    }
}

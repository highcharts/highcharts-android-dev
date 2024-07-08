package com.highsoft.all_demos_app;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.fragment.app.Fragment;

import com.highsoft.highcharts.Core.HIChartView;

import java.util.ArrayList;

public class ExamplesFragment extends Fragment {

    private static final String ARG_FRAGMENT_NAME = "name";
    private static final String ARG_STRING_ARRAY = "array";
    private OptionsProvider optionsProvider;

    private String mName;
    private String[] mArray;

    public ExamplesFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance(String mName, String[] mArray) {
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
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                optionsProvider = new OptionsProvider(mName, getContext());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_examples, container, false);
        final HIChartView chartView = view.findViewById(R.id.hc);
        chartView.options = optionsProvider.getChartOptions(mArray[0]);
        chartView.plugins = new ArrayList<>(); //todo move plugins addition to specific chart options
        chartView.plugins.add("annotations");
        chartView.plugins.add("series-label");
        chartView.plugins.add("data");
        chartView.plugins.add("boost");
        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<String> examplesAdapter = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            examplesAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, mArray);
        }
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

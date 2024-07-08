package com.highsoft.all_demos_app;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoriesListFragment extends Fragment {

    public CategoriesListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories_list, container, false);
        ListView categoriesListView = view.findViewById(R.id.categoriesListView);
        Resources res = getResources();
        final String[] categoriesArray = res.getStringArray(R.array.charts_categories);
        ArrayAdapter<String> categoriesAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, categoriesArray);
        categoriesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                Resources res = getResources();
                String[] categoryExamplesList = new String[0];
                switch (position){
                    case 0:
                        categoryExamplesList = res.getStringArray(R.array.line_charts);
                        break;
                    case 1:
                        categoryExamplesList = res.getStringArray(R.array.area_charts);
                        break;
                    case 2:
                        categoryExamplesList = res.getStringArray(R.array.column_and_bar_charts);
                        break;
                    case 3:
                        categoryExamplesList = res.getStringArray(R.array.pie_charts);
                        break;
                    case 4:
                        categoryExamplesList = res.getStringArray(R.array.scatter_and_bubble_charts);
                        break;
                    case 5:
                        categoryExamplesList = res.getStringArray(R.array.combinations);
                        break;
                    case 6:
                        categoryExamplesList = res.getStringArray(R.array.styled_mode_css_styling);
                        break;
                    case 7:
                        categoryExamplesList = res.getStringArray(R.array.dynamic_charts);
                        break;
                    case 8:
                        categoryExamplesList = res.getStringArray(R.array.charts_3d);
                        break;
                    case 9:
                        categoryExamplesList = res.getStringArray(R.array.gauges);
                        break;
                    case 10:
                        categoryExamplesList = res.getStringArray(R.array.heat_and_tree_maps);
                        break;
                    case 11:
                        categoryExamplesList = res.getStringArray(R.array.more_chart_types);
                        break;
                    default:
                        break;
                }
                transaction.addToBackStack(null);
                transaction.replace(R.id.fragment_container, ExamplesFragment.newInstance(categoriesArray[position], categoryExamplesList));
                transaction.commit();
            }
        });
        categoriesListView.setAdapter(categoriesAdapter);
        return view;
    }

}

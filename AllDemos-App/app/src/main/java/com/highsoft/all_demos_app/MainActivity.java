package com.highsoft.all_demos_app;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null) return;
        }

        CategoriesListFragment categoriesListFragment = new CategoriesListFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, categoriesListFragment)
                .commit();
    }
}

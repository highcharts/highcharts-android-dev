package com.highsoft.all_demos_app;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

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

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}

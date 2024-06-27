package com.highsoft.devground;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.highsoft.devground.databinding.ActivityResizeBinding;

public class ResizeActivity extends AppCompatActivity {

    private ActivityResizeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResizeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.holder.getId(), BlankFragment.newInstance(), "blankFrag")
                .commit();
    }
}

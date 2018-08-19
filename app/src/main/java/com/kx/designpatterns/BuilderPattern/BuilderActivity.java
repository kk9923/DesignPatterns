package com.kx.designpatterns.BuilderPattern;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kx.designpatterns.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
    }
}

package com.example.androidlibrary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpleToast(this, "Test");

    }
}
package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class wahtisbmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahtisbmi);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));
}
}
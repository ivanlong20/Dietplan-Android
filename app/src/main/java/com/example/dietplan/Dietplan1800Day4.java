package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Dietplan1800Day4 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1, imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1800_day4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton1 = findViewById(R.id.ib11800d4);
        imageButton1.setOnClickListener(this);
        imageButton2 = findViewById(R.id.ib21800d4);
        imageButton2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib11800d4: {
                Intent i = new Intent(this, Dietplan1800Day3.class);
                startActivity(i);
                break; }
            case R.id.ib21800d4: {
                Intent i = new Intent(this, Dietplan1800Day5.class);
                startActivity(i);
                break; }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottom_nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent i = new Intent(this, Dietplan1800Activity.class);
                startActivity(i);
                return true;
            }
            case R.id.navigation_home:{
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;
            }
            case R.id.navigation_bmr:{
                Intent i = new Intent(this, BMRFragment.class);
                startActivity(i);
                return true;
            }
            case R.id.navigation_bmi:{
                Intent i = new Intent(this, BMIFragment.class);
                startActivity(i);
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
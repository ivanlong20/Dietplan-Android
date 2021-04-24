package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan1500Day3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1500_day3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        go_1500_day4 ();
        go_1500_day2 ();
        go_banana ();
        go_taco ();
        go_salmon ();
    }

    private void go_salmon (){
        RelativeLayout dietplan1500Day3_btn8 = (RelativeLayout) findViewById(R.id.dietplan2000Day3_btn8);
        dietplan1500Day3_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day3.this, RecipesOfEasySalmonCakes.class));
            }
        });
    }

    private void go_taco (){
        RelativeLayout dietplan1500Day3_btn5 = (RelativeLayout) findViewById(R.id.dietplan2000Day3_btn5);
        dietplan1500Day3_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day3.this, RecipesOfChipotleLimeCauliflowerTacoBowls.class));
            }
        });
    }

    private void go_banana (){
        RelativeLayout dietplan1500Day3_btn0 = (RelativeLayout) findViewById(R.id.dietplan2000Day3_btn0);
        dietplan1500Day3_btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day3.this, RecipesOfBakedBananaNutOatmealCups.class));
            }
        });
    }

    private void go_1500_day4 (){
        ImageButton ib2 = (ImageButton) findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day3.this, Dietplan1500Day4.class));
            }
        });
    }

    private void go_1500_day2 (){
        ImageButton ib1 = (ImageButton) findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day3.this, Dietplan1500Day2.class));
            }
        });
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
                Intent i = new Intent(this, Dietplan1500Activity.class);
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
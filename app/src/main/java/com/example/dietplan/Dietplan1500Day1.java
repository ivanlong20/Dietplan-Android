package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan1500Day1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1500_day1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        go_1500_day2 ();
        go_1500_day7 ();
        go_banana ();
        go_sandwich ();
        go_sheet_chicken ();
    }

    private void go_banana (){
        RelativeLayout dietplan1500Day1_btn0 = (RelativeLayout) findViewById(R.id.dietplan2000Day1_btn0);
        dietplan1500Day1_btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day1.this, RecipesOfBakedBananaNutOatmealCups.class));
            }
        });
    }

    private void go_sandwich (){
        RelativeLayout dietplan1500Day1_btn4 = (RelativeLayout) findViewById(R.id.dietplan2000Day1_btn4);
        dietplan1500Day1_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day1.this, RecipesOfVeggieHummusSandwich.class));
            }
        });
    }

    private void go_sheet_chicken (){
        RelativeLayout dietplan1500Day1_btn8 = (RelativeLayout) findViewById(R.id.dietplan2000Day1_btn8);
        dietplan1500Day1_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day1.this, RecipesOfSheetPanChickenFajitaBowls.class));
            }
        });
    }

    private void go_1500_day2 (){
        ImageButton ib2 = (ImageButton) findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day1.this, Dietplan1500Day2.class));
            }
        });
    }

    private void go_1500_day7 (){
        ImageButton ib1 = (ImageButton) findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day1.this, Dietplan1500Day7.class));
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
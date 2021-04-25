package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan1200Day2 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1,  imageButton2;
    RelativeLayout dietplan1200Day2_btn0, dietplan1200Day2_btn1, dietplan1200Day2_btn2, dietplan1200Day2_btn3, dietplan1200Day2_btn4,dietplan1200Day2_btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1200_day2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton1 = findViewById(R.id.ib1);
        imageButton1.setOnClickListener(this);
        imageButton2 = findViewById(R.id.ib2);
        imageButton2.setOnClickListener(this);
        dietplan1200Day2_btn0 = findViewById(R.id.dietplan1200Day7_btn0);
        dietplan1200Day2_btn0.setOnClickListener(this);
        dietplan1200Day2_btn1 = findViewById(R.id.dietplan1200Day7_btn1);
        dietplan1200Day2_btn1.setOnClickListener(this);
        dietplan1200Day2_btn2 = findViewById(R.id.dietplan1200Day7_btn2);
        dietplan1200Day2_btn2.setOnClickListener(this);
        dietplan1200Day2_btn3 = findViewById(R.id.dietplan1200Day2_btn3);
        dietplan1200Day2_btn3.setOnClickListener(this);
        dietplan1200Day2_btn4 = findViewById(R.id.dietplan1200Day2_btn4);
        dietplan1200Day2_btn4.setOnClickListener(this);
        dietplan1200Day2_btn5 = findViewById(R.id.dietplan1200Day2_btn5);
        dietplan1200Day2_btn5.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottom_nav_menu2, menu);
        return true;
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib1: {
                Intent i = new Intent(this, Dietplan1200Day1.class);
                startActivity(i);
                break; }
            case R.id.ib2: {
                Intent i = new Intent(this, Dietplan1200Day3.class);
                startActivity(i);
                break; }
            case R.id.dietplan1200Day7_btn0:{
                Intent i = new Intent(this, RecipesOfBakedBananaNutOatmealCups.class);
                startActivity(i);
                break;
            }
            case R.id.dietplan1200Day2_btn3:{
                Intent i = new Intent(this, RecipesOfChipotleLimeCauliflowerTacoBowls.class);
                startActivity(i);
                break;
            }
            case R.id.dietplan1200Day2_btn5:{
                Intent i = new Intent(this, RecipesOfZucchiniChickpeaVeggieBurgerswithTahiniRanchSauce.class);
                startActivity(i);
                break;
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent i = new Intent(this, Dietplan1200Activity.class);
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
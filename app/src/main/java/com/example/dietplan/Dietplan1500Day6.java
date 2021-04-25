package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan1500Day6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1500_day6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        go_1500_day7 ();
        go_1500_day5 ();
        go_muesli();
        go_veggie();
        go_curried();
        go_spinach();
    }

    private void go_spinach (){
        RelativeLayout dietplan2000Day6_btn33 = (RelativeLayout) findViewById(R.id.dietplan2000Day6_btn9);
        dietplan2000Day6_btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, RecipesOfCurriedSweetPotatoPeanutSoup.class));
            }
        });
    }

    private void go_curried (){
        RelativeLayout dietplan2000Day6_btn33 = (RelativeLayout) findViewById(R.id.dietplan2000Day6_btn9);
        dietplan2000Day6_btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, RecipesOfCurriedSweetPotatoPeanutSoup.class));
            }
        });
    }

    private void go_veggie (){
        RelativeLayout dietplan1500Day6_btn4 = (RelativeLayout) findViewById(R.id.dietplan2000Day6_btn4);
        dietplan1500Day6_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, RecipesOfVeggieHummusSandwich.class));
            }
        });
    }

    private void go_muesli (){
        RelativeLayout dietplan1500Day6_btn0 = (RelativeLayout) findViewById(R.id.dietplan2000Day6_btn0);
        dietplan1500Day6_btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, RecipesOfMuesliwithRaspberries.class));
            }
        });
    }

    private void go_1500_day7 (){
        ImageButton ib2 = (ImageButton) findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, Dietplan1500Day7.class));
            }
        });
    }

    private void go_1500_day5 (){
        ImageButton ib1 = (ImageButton) findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dietplan1500Day6.this, Dietplan1500Day5.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bottom_nav_menu2, menu);
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
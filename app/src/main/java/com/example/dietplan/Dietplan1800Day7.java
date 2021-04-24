package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan1800Day7 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1, imageButton2;
    private RelativeLayout rl0, rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1800_day7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton1 = findViewById(R.id.ib11800d7);
        imageButton1.setOnClickListener(this);
        imageButton2 = findViewById(R.id.ib21800d7);
        imageButton2.setOnClickListener(this);

        rl0 = findViewById(R.id.dietplan1800Day7_btn0);
        rl0.setOnClickListener(this);
        rl1 = findViewById(R.id.dietplan1800Day7_btn1);
        rl1.setOnClickListener(this);
        rl2 = findViewById(R.id.dietplan1800Day7_btn2);
        rl2.setOnClickListener(this);
        rl3 = findViewById(R.id.dietplan1800Day7_btn3);
        rl3.setOnClickListener(this);
        rl4 = findViewById(R.id.dietplan1800Day7_btn4);
        rl4.setOnClickListener(this);
        rl5 = findViewById(R.id.dietplan1800Day7_btn5);
        rl5.setOnClickListener(this);
        rl6 = findViewById(R.id.dietplan1800Day7_btn6);
        rl6.setOnClickListener(this);
        rl7 = findViewById(R.id.dietplan1800Day7_btn7);
        rl7.setOnClickListener(this);
        rl8 = findViewById(R.id.dietplan1800Day7_btn8);
        rl8.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib11800d7: {
                Intent i = new Intent(this, Dietplan1800Day6.class);
                startActivity(i);
                break; }
            case R.id.ib21800d7: {
                Intent i = new Intent(this, Dietplan1800Day1.class);
                startActivity(i);
                break; }
            case R.id.dietplan1800Day1_btn0: {
                Intent i = new Intent(this, RecipesOfEgg_in_a_HolePepperswithAvocadoSalsa.class);
                startActivity(i);
                break; }
            case R.id.dietplan1800Day1_btn3: {
                Intent i = new Intent(this, RecipesOfCurriedSweetPotatoPeanutSoup.class);
                startActivity(i);
                break; }
            case R.id.dietplan1800Day1_btn5: {
                Intent i = new Intent(this, RecipesOfSpinachArtichokeDipPasta.class);
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
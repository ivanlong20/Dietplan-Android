package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Dietplan2000Day7 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1,  imageButton2;
    RelativeLayout dietplan2000Day7_btn0, dietplan2000Day7_btn1, dietplan2000Day7_btn2,dietplan2000Day7_btn3,
            dietplan2000Day7_btn4,dietplan2000Day7_btn5,dietplan2000Day7_btn6,dietplan2000Day7_btn7,dietplan2000Day7_btn8,dietplan2000Day7_btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan2000_day7);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("2000 Calories");

        imageButton1 = findViewById(R.id.ib1);
        imageButton1.setOnClickListener(this);
        imageButton2 = findViewById(R.id.ib2);
        imageButton2.setOnClickListener(this);
        dietplan2000Day7_btn0 = findViewById(R.id.dietplan2000Day7_btn0);
        dietplan2000Day7_btn0.setOnClickListener(this);
        dietplan2000Day7_btn1 = findViewById(R.id.dietplan2000Day7_btn1);
        dietplan2000Day7_btn1.setOnClickListener(this);
        dietplan2000Day7_btn2 = findViewById(R.id.dietplan2000Day7_btn2);
        dietplan2000Day7_btn2.setOnClickListener(this);
        dietplan2000Day7_btn3 = findViewById(R.id.dietplan2000Day7_btn3);
        dietplan2000Day7_btn3.setOnClickListener(this);
        dietplan2000Day7_btn4 = findViewById(R.id.dietplan2000Day7_btn4);
        dietplan2000Day7_btn4.setOnClickListener(this);
        dietplan2000Day7_btn5 = findViewById(R.id.dietplan2000Day7_btn5);
        dietplan2000Day7_btn5.setOnClickListener(this);
        dietplan2000Day7_btn6 = findViewById(R.id.dietplan2000Day7_btn6);
        dietplan2000Day7_btn6.setOnClickListener(this);
        dietplan2000Day7_btn7 = findViewById(R.id.dietplan2000Day7_btn7);
        dietplan2000Day7_btn7.setOnClickListener(this);
        dietplan2000Day7_btn8 = findViewById(R.id.dietplan2000Day7_btn8);
        dietplan2000Day7_btn8.setOnClickListener(this);
        dietplan2000Day7_btn9 = findViewById(R.id.dietplan2000Day7_btn9);
        dietplan2000Day7_btn9.setOnClickListener(this);
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
                Intent i = new Intent(this, Dietplan2000Day6.class);
                startActivity(i);
                break; }
            case R.id.ib2: {
                Intent i = new Intent(this, Dietplan2000Day1.class);
                startActivity(i);
                break; }
            case R.id.dietplan2000Day7_btn0:{
                Intent i = new Intent(this, RecipesOfEgg_in_a_HolePepperswithAvocadoSalsa.class);
                startActivity(i);
                break;
            }
            case R.id.dietplan2000Day7_btn4:{
                Intent i = new Intent(this, RecipesOfMuesliwithRaspberries.class);
                startActivity(i);
                break;
            }
            case R.id.dietplan2000Day7_btn6:{
                Intent i = new Intent(this, RecipesOfSpinachArtichokeDipPasta.class);
                startActivity(i);
                break;
            }
            case R.id.dietplan2000Day7_btn7:{
                Intent i = new Intent(this, RecipesOfBalsamicVinaigrette.class);
                startActivity(i);
                break;
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home: {
                Intent i = new Intent(this, Dietplan2000Activity.class);
                startActivity(i);
                return true;
            }
            case R.id.navigation_home:{
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;
            }

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
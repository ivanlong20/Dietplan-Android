package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class Dietplan1800Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1800);
        setTitle("Diet Plan for weight loss");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RelativeLayout dietplan1800_btn0 = findViewById(R.id.dietplan1800_btn0);
        dietplan1800_btn0.setOnClickListener(this);
        RelativeLayout dietplan1800_btn1 = findViewById(R.id.dietplan1800_btn1);
        dietplan1800_btn1.setOnClickListener(this);
        RelativeLayout dietplan1800_btn2 = findViewById(R.id.dietplan1800_btn2);
        dietplan1800_btn2.setOnClickListener(this);
        RelativeLayout dietplan1800_btn3 = findViewById(R.id.dietplan1800_btn3);
        dietplan1800_btn3.setOnClickListener(this);
        RelativeLayout dietplan1800_btn4 = findViewById(R.id.dietplan1800_btn4);
        dietplan1800_btn4.setOnClickListener(this);
        RelativeLayout dietplan1800_btn5 = findViewById(R.id.dietplan1800_btn5);
        dietplan1800_btn5.setOnClickListener(this);
        RelativeLayout dietplan1800_btn6 = findViewById(R.id.dietplan1800_btn6);
        dietplan1800_btn6.setOnClickListener(this);
    }
    // Updated [Onclick --> onClick]
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dietplan1800_btn0: {
                Intent intent = new Intent(this, Dietplan1800Day1.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn1: {
                Intent intent = new Intent(this, Dietplan1800Day2.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn2: {
                Intent intent = new Intent(this, Dietplan1800Day3.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn3: {
                Intent intent = new Intent(this, Dietplan1800Day4.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn4: {
                Intent intent = new Intent(this, Dietplan1800Day5.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn5: {
                Intent intent = new Intent(this, Dietplan1800Day6.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan1800_btn6: {
                Intent intent = new Intent(this, Dietplan1800Day7.class);
                startActivity(intent);
                break;
            }
        }}

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                // todo: goto back activity from here

                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
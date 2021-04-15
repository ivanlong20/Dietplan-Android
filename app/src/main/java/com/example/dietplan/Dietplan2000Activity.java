package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class Dietplan2000Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan2000);
        setTitle("Diet Plan for weight loss");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RelativeLayout dietplan2000_btn0 = findViewById(R.id.dietplan2000_btn0);
        dietplan2000_btn0.setOnClickListener(this);
        RelativeLayout dietplan2000_btn1 = findViewById(R.id.dietplan2000_btn1);
        dietplan2000_btn1.setOnClickListener(this);
        RelativeLayout dietplan2000_btn2 = findViewById(R.id.dietplan2000_btn2);
        dietplan2000_btn2.setOnClickListener(this);
        RelativeLayout dietplan2000_btn3 = findViewById(R.id.dietplan2000_btn3);
        dietplan2000_btn3.setOnClickListener(this);
        RelativeLayout dietplan2000_btn4 = findViewById(R.id.dietplan2000_btn4);
        dietplan2000_btn4.setOnClickListener(this);
        RelativeLayout dietplan2000_btn5 = findViewById(R.id.dietplan2000_btn5);
        dietplan2000_btn5.setOnClickListener(this);
        RelativeLayout dietplan2000_btn6 = findViewById(R.id.dietplan2000_btn6);
        dietplan2000_btn6.setOnClickListener(this);
    }
    // Updated [Onclick --> onClick]
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dietplan2000_btn0: {
                Intent intent = new Intent(this, Dietplan2000Day1.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn1: {
                Intent intent = new Intent(this, Dietplan2000Day2.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn2: {
                Intent intent = new Intent(this, Dietplan2000Day3.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn3: {
                Intent intent = new Intent(this, Dietplan2000Day4.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn4: {
                Intent intent = new Intent(this, Dietplan2000Day5.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn5: {
                Intent intent = new Intent(this, Dietplan2000Day6.class);
                startActivity(intent);
                break;
            }
            case R.id.dietplan2000_btn6: {
                Intent intent = new Intent(this, Dietplan2000Day7.class);
                startActivity(intent);
                break;
            }
        }}

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
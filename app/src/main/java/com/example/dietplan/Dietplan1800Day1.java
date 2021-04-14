package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Dietplan1800Day1 extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButton1,  imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan1800_day1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageButton1 = findViewById(R.id.ib11800d1);
        imageButton1.setOnClickListener(this);
        imageButton2 = findViewById(R.id.ib21800d1);
        imageButton2.setOnClickListener(this);
    }
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

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ib11800d1: {
                Intent i = new Intent(Dietplan1800Day1.this, Dietplan1800Day7.class);
                startActivity(i);
                break; }
            case R.id.ib21800d1: {
                Intent i = new Intent(Dietplan1800Day1.this, Dietplan1800Day2.class);
                startActivity(i);
                break; }
        }
    }
}
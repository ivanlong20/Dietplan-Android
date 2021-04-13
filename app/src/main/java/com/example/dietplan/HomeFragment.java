package com.example.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment implements View.OnClickListener {
    Button button1;
    TextView tv1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = LayoutInflater.from(getActivity()).inflate(
                R.layout.fragment_home, null);

        RelativeLayout dietplancover_btn0 = (RelativeLayout) v.findViewById(R.id.dietplancover_btn0);
        dietplancover_btn0.setOnClickListener(this);
        RelativeLayout dietplancover_btn1= (RelativeLayout) v.findViewById(R.id.dietplancover_btn1);
        dietplancover_btn1.setOnClickListener(this);
        RelativeLayout dietplancover_btn2= (RelativeLayout) v.findViewById(R.id.dietplancover_btn2);
        dietplancover_btn2.setOnClickListener(this);
        RelativeLayout dietplancover_btn3= (RelativeLayout) v.findViewById(R.id.dietplancover_btn3);
        dietplancover_btn3.setOnClickListener(this);
        button1 = (Button) v.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        tv1 = (TextView) v.findViewById(R.id.tv1);
        return v;
    }
    // Updated [Onclick --> onClick]
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                tv1.setText("on9");

            case R.id.dietplancover_btn0:
                /*Intent intent = new Intent(getActivity(), Dietplan1200Activity.class);
                startActivity(intent);*/
                tv1.setText("on9");
                break;
            case R.id.dietplancover_btn1:
                Intent intent1 = new Intent(getActivity(), Dietplan1200Activity.class);
                startActivity(intent1);
            case R.id.dietplancover_btn2:
                Intent intent2 = new Intent(getActivity(), Dietplan1200Activity.class);
                startActivity(intent2);
            case R.id.dietplancover_btn3:
                Intent intent3 = new Intent(getActivity(), Dietplan1200Activity.class);
                startActivity(intent3);
        }
    }
    /*public void goToAttract(){
        Intent intent = new Intent(getActivity(), Dietplan1200Activity.class);
        startActivity(intent);
    }*/
}
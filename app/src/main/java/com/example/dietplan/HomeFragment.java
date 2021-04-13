package com.example.dietplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment implements View.OnClickListener {
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
        return v;
    }
    // Updated [Onclick --> onClick]
    public void onClick(View v){
        switch (v.getId()){
            case R.id.dietplancover_btn0:{
                Intent intent = new Intent(getActivity(), Dietplan1200Activity.class);
                startActivity(intent);
                break;}
            case R.id.dietplancover_btn1:{
                Intent intent = new Intent(getActivity(), Dietplan1500Activity.class);
                startActivity(intent);
                break;}
            case R.id.dietplancover_btn2:{
                Intent intent = new Intent(getActivity(), Dietplan1800Activity.class);
                startActivity(intent);
                break;}
            case R.id.dietplancover_btn3:{
                Intent intent = new Intent(getActivity(), Dietplan2000Activity.class);
                startActivity(intent);
                break;}
        }
    }
}
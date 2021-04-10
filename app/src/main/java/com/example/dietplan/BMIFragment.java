package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BMIFragment extends Fragment implements OnClickListener {

    Button button;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = LayoutInflater.from(getActivity()).inflate(
                R.layout.fragment_bmi, null);

        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(this);
        tv = (TextView) v.findViewById(R.id.tv);
        return v;
    }
    public void Onclick(View v){
        switch (v.getId()){
            case R.id.button:
                tv.setText("on9");
        }
    }
}
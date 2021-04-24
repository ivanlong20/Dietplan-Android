package com.example.dietplan;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class BMIFragment extends Fragment implements View.OnClickListener {

    Button button;
    TextView tvResult, tvTips, tvTips1;
    EditText editTextNumberWeight, editTextNumberHeight;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = LayoutInflater.from(getActivity()).inflate(
                R.layout.fragment_bmi, null);

        editTextNumberHeight = (EditText) v.findViewById(R.id.editTextNumberHeight);
        editTextNumberWeight = (EditText) v.findViewById(R.id.editTextNumberWeight);

       button = (Button) v.findViewById(R.id.button);
       button.setOnClickListener(this);
       tvResult = (TextView) v.findViewById(R.id.tvResult);
        tvTips = (TextView) v.findViewById(R.id.tvTips);
        tvTips1 = (TextView) v.findViewById(R.id.tvTips1);
        return v;
    }
    // Updated [Onclick --> onClick]
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                String field1 =  editTextNumberHeight.getText().toString();
                String field2 =  editTextNumberWeight.getText().toString();
                if (field1.isEmpty() || field2.isEmpty() ) {
                    Toast.makeText(getActivity(), "Please fill in all information", Toast.LENGTH_SHORT).show();
                    return;
                }
               double height = Double.valueOf(String.valueOf(editTextNumberHeight.getText()));
               double weight = Double.valueOf(String.valueOf(editTextNumberWeight.getText()));
               double bmi = weight/((height/100)*(height/100));


               //String bmiResult = Double.toString(bmi);
                if(bmi<18.5){

                    tvResult.setTextColor(Color.parseColor("#dbd5d0"));
                    tvTips.setTextColor(Color.parseColor("#dbd5d0"));
                    tvResult.setText(String.format("%.2f",bmi));
                    tvTips.setText("Under Weight");
                    tvTips1.setText("You should not lose your weight");
                }
                if(bmi>18.5 && bmi<25){

                    tvResult.setTextColor(Color.parseColor("#07eb4f"));
                    tvTips.setTextColor(Color.parseColor("#07eb4f"));
                    tvResult.setText(String.format("%.2f",bmi));
                    tvTips.setText("Healthy");
                    tvTips1.setText("You are not necessary to lose your weight");
                }
                if(bmi>25 && bmi<30){

                    tvResult.setTextColor(Color.parseColor("#eba307"));
                    tvTips.setTextColor(Color.parseColor("#eba307"));
                    tvResult.setText(String.format("%.2f",bmi));
                    tvTips.setText("Overweight");
                    tvTips1.setText("You should lose your weight");
                }
                if(bmi>30) {

                    tvResult.setTextColor(Color.parseColor("#f50505"));
                    tvTips.setTextColor(Color.parseColor("#f50505"));
                    tvResult.setText(String.format("%.2f",bmi));
                    tvTips.setText("Obese");
                    tvTips1.setText("You should lose your weight");
                }
            break;
        }
    }
}
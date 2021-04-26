package com.example.dietplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class BMRFragment extends Fragment implements View.OnClickListener{

    Button button;
    ImageButton ImageButton;
    TextView tvResult, tvTips, tvTips1, tv_cm_inch, tv_kg_pound, tvTips4;
    EditText editTextNumberWeight, editTextNumberHeight, editTextNumberAge;
    Switch switch1, switch2;
    Chip chipMale, chipFemale, chip0, chip1to3, chip3to5, chip6to7, chipExtra;
    ChipGroup Sex, Frequency;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
            ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = LayoutInflater.from(getActivity()).inflate(
                R.layout.fragment_bmr, null);

        editTextNumberHeight = (EditText) v.findViewById(R.id.editTextNumberHeight);
        editTextNumberWeight = (EditText) v.findViewById(R.id.editTextNumberWeight);
        editTextNumberAge = (EditText) v.findViewById(R.id.editTextNumberAge);
        chipMale = (Chip) v.findViewById(R.id.chipMale);
        chipFemale = (Chip) v.findViewById(R.id.chipFemale);
        chip0 = (Chip) v.findViewById(R.id.chip0);
        chip1to3 = (Chip) v.findViewById(R.id.chip1to3);
        chip3to5 = (Chip) v.findViewById(R.id.chip3to5);
        chip6to7 = (Chip) v.findViewById(R.id.chip6to7);
        chipExtra = (Chip) v.findViewById(R.id.chipExtra);
        Sex = (ChipGroup) v.findViewById(R.id.Sex);
        Frequency = (ChipGroup) v.findViewById(R.id.Frequency);

        button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(this);
        tvResult = (TextView) v.findViewById(R.id.tvResult);
        tvTips = (TextView) v.findViewById(R.id.tvTips);
        tvTips1 = (TextView) v.findViewById(R.id.tvTips1);
        tvTips4 = (TextView) v.findViewById(R.id.tvTips4);
        tv_cm_inch = (TextView) v.findViewById(R.id.tv_cm_inch);
        tv_kg_pound = (TextView) v.findViewById(R.id.tv_kg_pound);
        switch1 = (Switch) v.findViewById(R.id.switch1);
        switch2 = (Switch) v.findViewById(R.id.switch2);
        ImageButton = (ImageButton) v.findViewById(R.id.quest_bmr);
        ImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.quest_bmr:{
                        Intent intent = new Intent(getActivity(), whatisbmr.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusSwitch1, statusSwitch2;
                if (switch1.isChecked())
                    tv_cm_inch.setText("inch");
                else
                    tv_cm_inch.setText("cm");
            }
        });
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusSwitch1, statusSwitch2;
                if (!switch2.isChecked())
                    tv_kg_pound.setText("kg");
                else
                    tv_kg_pound.setText("pounds");
            }
        });
        return v;

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                String field1 =  editTextNumberHeight.getText().toString();
                String field2 =  editTextNumberWeight.getText().toString();
                String field3 =  editTextNumberAge.getText().toString();
                if (field1.isEmpty() || field2.isEmpty() || field3.isEmpty()) {
                    Toast.makeText(getActivity(), "Please fill in all information", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(switch1.isChecked()){
                    if(switch2.isChecked()){//inch+pound
                        double height = Double.valueOf(String.valueOf(editTextNumberHeight.getText()))*0.0254*100;//cm
                        double weight = Double.valueOf(String.valueOf(editTextNumberWeight.getText()))*0.45359237;//kg
                        double age = Double.valueOf(String.valueOf(editTextNumberAge.getText()));//age
                        if(chipMale.isChecked()){//male
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                        else{//female
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                    }
                    else{//inch+kg
                        double height = Double.valueOf(String.valueOf(editTextNumberHeight.getText()))*0.0254*100;
                        double weight = Double.valueOf(String.valueOf(editTextNumberWeight.getText()));
                        double age = Double.valueOf(String.valueOf(editTextNumberAge.getText()));//age
                        if(chipMale.isChecked()){//male
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                        else{//female
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                    }
                }
                else{//cm+pound
                    if(switch2.isChecked()){
                        double height = Double.valueOf(String.valueOf(editTextNumberHeight.getText()));
                        double weight = Double.valueOf(String.valueOf(editTextNumberWeight.getText()))*0.45359237;
                        double age = Double.valueOf(String.valueOf(editTextNumberAge.getText()));//age
                        if(chipMale.isChecked()){//male
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                        else{//female
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                    }
                    else{//cm+kg
                        double height = Double.valueOf(String.valueOf(editTextNumberHeight.getText()));
                        double weight = Double.valueOf(String.valueOf(editTextNumberWeight.getText()));
                        double age = Double.valueOf(String.valueOf(editTextNumberAge.getText()));//age
                        if(chipMale.isChecked()){//male
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age +5)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                        else{//female
                            if(chip0.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.2;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.2));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip1to3.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.375;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.375));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip3to5.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.55;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.55));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chip6to7.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.725;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.725));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                            if(chipExtra.isChecked()){
                                double bmr = (10*weight + 6.25*height - 5*age -161)*1.9;
                                tvResult.setText(String.format("%.0f Calories / day",bmr/1.9));
                                tvTips1.setText(String.format("%.0f Calories / day",bmr));
                                tvTips4.setText(String.format("%.0f Calories / day",bmr*0.75));
                            }
                        }
                    }
                }
                break;
        }

    }
}
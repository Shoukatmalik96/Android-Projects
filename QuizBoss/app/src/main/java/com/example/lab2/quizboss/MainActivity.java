package com.example.lab2.quizboss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton1,radioButton2,radioButton3;
    RadioGroup  radiogroup1,radiogroup2,radiogroup3;
    String answer1,answer2,answer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*getting radiogroup object*/
        radiogroup1=(RadioGroup)findViewById(R.id.Rg_1);
        radiogroup2=(RadioGroup)findViewById(R.id.Rg_2);
        radiogroup3=(RadioGroup)findViewById(R.id.Rg_3);
        /*getting radiobutton object*/
        radioButton1 = (RadioButton) findViewById(R.id.Q1_Op_a);
        radioButton2 = (RadioButton) findViewById(R.id.Q1_Op_b);
        radioButton3 = (RadioButton) findViewById(R.id.Q1_Op_c);

        /*Correct Answers of the question*/
        ArrayList answers =new ArrayList(3);
        answers.add("Java");
        answers.add("Java");
        answers.add("swift");


radiogroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
     RadioButton radiobutton=(RadioButton)findViewById(checkedId);
        answer1 = radiobutton.getText().toString();

    }
});

    }



}

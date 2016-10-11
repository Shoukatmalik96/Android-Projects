package com.example.lab2.radiobutton_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String checkedAnswerOne, checkedAnswerTwo, checkedAnswerThree;

    private RadioButton radioButtonOneFirstQuestion;
    private RadioButton radioButtonTwoSecondQuestion;
    private RadioButton radioButtonThreeThirdQuestion;

    private RadioGroup radioGroupOne;
    private RadioGroup radioGroupTwo;
    private RadioGroup radioGroupThree;

    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupOne = (RadioGroup) findViewById(R.id.RadioGroup_1);
        radioGroupTwo = (RadioGroup) findViewById(R.id.RadioGroup_2);
        radioGroupThree = (RadioGroup) findViewById(R.id.RadioGroup_3);

        radioButtonOneFirstQuestion = (RadioButton) findViewById(R.id.question_one_radio_one);
        radioButtonTwoSecondQuestion = (RadioButton) findViewById(R.id.question_two_radio_two);
        radioButtonThreeThirdQuestion = (RadioButton) findViewById(R.id.question_three_radio_one);


        Button checkButton = (Button) findViewById(R.id.checkAnswer);

        arrayList.add("Java");
        arrayList.add("Single class and multiple interfaces");
        arrayList.add("Linear Layout");

        radioGroupOne.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (arrayList.get(0).equals(radioButtonOneFirstQuestion.getText()) && radioButtonOneFirstQuestion.isChecked()){

                    checkedAnswerOne = "First question answer '" + radioButtonOneFirstQuestion.getText() +  "' is correct";
                } else {

                    checkedAnswerOne = "First question answer is not correct";
                }
            }
        });

        radioGroupTwo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (arrayList.get(1).equals(radioButtonTwoSecondQuestion.getText()) && radioButtonTwoSecondQuestion.isChecked()){

                    checkedAnswerTwo = "Second question answer '" +radioButtonTwoSecondQuestion.getText() + "' is correct";
                } else {

                    checkedAnswerTwo = "Second question answer is not correct";
                }
            }
        });

        radioGroupThree.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (arrayList.get(2).equals(radioButtonThreeThirdQuestion.getText()) && radioButtonThreeThirdQuestion.isChecked()){

                    checkedAnswerThree = "Third question answer '" + radioButtonThreeThirdQuestion.getText() + "' is correct";

                } else {

                    checkedAnswerThree = "Third question answer is not correct";
                }
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,checkedAnswerOne + "\n\n" + checkedAnswerTwo + "\n\n" + checkedAnswerThree, Toast.LENGTH_SHORT ).show();
            }
        });

    }
}

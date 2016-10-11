package com.example.android.quizboss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button submit_btn;
    RadioButton Rb_QuestionOne_Option_One,
                Rb_QuestionTwo_Option_One,
                Rb_QuestionThree_Option_Two;

    RadioGroup radiogroup1,radiogroup2,radiogroup3;

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
        Rb_QuestionOne_Option_One = (RadioButton) findViewById(R.id.Q1_Op_a);
        Rb_QuestionTwo_Option_One = (RadioButton) findViewById(R.id.Q2_Op_a);
        Rb_QuestionThree_Option_Two = (RadioButton) findViewById(R.id.Q3_Op_b);

        /*getting radiobutton object*/
        submit_btn= (Button)findViewById(R.id.btn_submit);

        /*Correct Answers of the question*/
        final ArrayList list =new ArrayList(3);
        list.add("Java");
        list.add("Java");
        list.add("swift");


        radiogroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radiobutton=(RadioButton)findViewById(checkedId);
                if (list.get(0).equals(Rb_QuestionOne_Option_One.getText()) && Rb_QuestionOne_Option_One.isChecked()){

                    answer1= " Question One answer '" +Rb_QuestionOne_Option_One.getText() + "' is correct";
                } else {

                    answer1= "Question One answer is not correct";
                }

            }
        });
        radiogroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (list.get(1).equals(Rb_QuestionTwo_Option_One.getText()) && Rb_QuestionTwo_Option_One.isChecked()){

                    answer2= "Question Two answer '" +Rb_QuestionTwo_Option_One.getText() + "' is correct";
                } else {

                    answer2= "Question Two answer is not correct";
                }
            }
        });

        radiogroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (list.get(2).equals(Rb_QuestionThree_Option_Two.getText()) && Rb_QuestionThree_Option_Two.isChecked()){

                    answer3= "Question Three answer'" +Rb_QuestionThree_Option_Two.getText() + "' is correct";
                } else {

                    answer3= "Question Three answer is not correct";
                }

            }
        });


    }

    public void submitAnswers(View view) {

        Toast.makeText(MainActivity.this,answer1 + "\n\n" + answer2 + "\n\n" + answer3 +"\n\n", Toast.LENGTH_LONG).show();
    }
}

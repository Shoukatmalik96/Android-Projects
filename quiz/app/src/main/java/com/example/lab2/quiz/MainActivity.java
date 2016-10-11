package com.example.lab2.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton java, c, c2;
    RadioButton ex, hyper, none;
    RadioButton apple, jva, cmaina;

    RadioGroup rg1, rg2, rg3;
    RadioGroup hg1, hg2, hg3;


    String ans1String;
    String ex1, ex2, ex3;
    String cmania1, cmania2, cmaina3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1 = (RadioGroup) findViewById(R.id.rg1);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //if (checkedId == R.id.rd1) {
                    int correctAnswer = rg1.getCheckedRadioButtonId();
                    Toast.makeText(MainActivity.this, "correctAnswer,;"+correctAnswer, Toast.LENGTH_SHORT).show();
                ans1String = ((RadioButton) findViewById(correctAnswer)).getText().toString();
                    Toast.makeText(MainActivity.this, "rg1question,;"+ans1String, Toast.LENGTH_SHORT).show();
                   //Toast.makeText(MainActivity.this, "yes"+rg1question, Toast.LENGTH_SHORT).show();


              //  }
            }
        });
        /* c =(RadioButton) findViewById(R.id.c);
        c2=(RadioButton) findViewById(R.id.c2);

        ex= (RadioButton) findViewById(R.id.ex);
        hyper =(RadioButton) findViewById(R.id.hyper);
        none=(RadioButton) findViewById(R.id.none);

        apple= (RadioButton) findViewById(R.id.apple);
        jva=(RadioButton) findViewById(R.id.jva);
        cmaina=(RadioButton) findViewById(R.id.cmania);
*/


    }
/*
   public void submit(View view){

       javs=java.getText().toString();
       cs=c.getText().toString();
       cs1=c2.getText().toString();

       ex1=ex.getText().toString();
       ex2=hyper.getText().toString();
       ex3=none.getText().toString();

       cmania1=apple.getText().toString();
       cmania2=jva.getText().toString();
       cmaina3=cmaina.getText().toString();





   }*/


}

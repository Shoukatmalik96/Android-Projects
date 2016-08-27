package com.example.shoukatmalik.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenNumberList(View view){

     Intent intent=new Intent(this,NumbersActivity.class);
        startActivity(intent);

    }
    public void OpenFamilyList(View view){

        Intent intent=new Intent(this,FamilyMembers.class);
        startActivity(intent);

    }
    public void OpenColorList(View view){

        Intent intent=new Intent(this,Colors.class);
        startActivity(intent);
    }
    public void OpenPhrasesList(View view){

        Intent intent=new Intent(this,Phrases.class);
        startActivity(intent);
    }
}

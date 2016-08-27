package com.example.shoukatmalik.currencycounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convert( View view){

        EditText dollarField=(EditText)findViewById(R.id.dollarField);
        Double dollarAmount=Double.parseDouble(dollarField.getText().toString());
        Double poundAmount=dollarAmount* 0.65;
        Log.i(" dollarField",poundAmount.toString());

        //Toast.makeText(getApplicationContext(),"$"+poundAmount.toString(),Toast.LENGTH_SHORT);
    }
}

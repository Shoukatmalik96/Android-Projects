package com.example.lab2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    EditText ed_name,ed_email,ed_password,ed_confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ed_name=(EditText)findViewById(R.id.edit_name);
        ed_email=(EditText)findViewById(R.id.edit_email);
        ed_password=(EditText)findViewById(R.id.edit_password);
        ed_confirm=(EditText)findViewById(R.id.edit_c_passord);
    }

    public void signup(View view) {
        if((ed_name.getText().toString()).length()<1){
            Toast.makeText(Signup.this, "Name field cannot be empty", Toast.LENGTH_SHORT).show();
        }else if((ed_email.getText().toString()).length()<1){
            Toast.makeText(Signup.this, "Email field cannot be empty", Toast.LENGTH_SHORT).show();

        }else if((ed_password.getText().toString()).length()<1){
            Toast.makeText(Signup.this, "password field cannot be empty", Toast.LENGTH_SHORT).show();

        }else if((ed_confirm.getText().toString()).length()<1){
            Toast.makeText(Signup.this, "Confirm password field cannot be empty", Toast.LENGTH_SHORT).show();

        }else {
            if((ed_password.getText().toString()).equals((ed_confirm.getText().toString()))){
                Userdata.name=ed_name.getText().toString();
                Userdata.email=ed_email.getText().toString();
                Userdata.password=ed_password.getText().toString();
                Toast.makeText(Signup.this, "Added Succesfully ", Toast.LENGTH_SHORT).show();
                goLogin();
            }else {

                Toast.makeText(Signup.this, "Password does not Match ", Toast.LENGTH_SHORT).show();

            }
        }


    }
    public void goLogin(){
        Intent intent=new Intent(Signup.this,LoginActivity.class);
        startActivity(intent);
    }
}

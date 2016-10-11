package com.example.lab2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText login_email,login_password;
    String email ,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_email=(EditText)findViewById(R.id.ed_login_email);
        login_password=(EditText)findViewById(R.id.ed_login_password);

    }

    public void doLogin(View view) {
        email=login_email.getText().toString();
        password=login_password.getText().toString();

        if(email.equals(Userdata.email) && password.equals(Userdata.password)){
            Toast.makeText(LoginActivity.this, "Login Succesfully", Toast.LENGTH_SHORT).show();
            goLogin() ;
        }else{

            Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
        }



    }
    public void goLogin(){
        Intent intent=new Intent(LoginActivity.this,WelcomeActivity.class);
        startActivity(intent);
    }
}

package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout InputMobile,InputPassword;

    Button LogIn,SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        InputMobile=(TextInputLayout) findViewById(R.id.in_mobile);
        InputPassword=(TextInputLayout) findViewById(R.id.in_password);
        LogIn=(Button) findViewById(R.id.btn_login);
        SignUp=(Button) findViewById(R.id.btn_sign);


    }
    private boolean validatePassword(){
        String val=InputPassword.getEditText().getText().toString();
        if(val.isEmpty()){
            InputPassword.setError("Field cannot be empty");
            return false;
        }
        else {
            InputPassword.setError(null);
            InputPassword.setErrorEnabled(false);
            return true;
        }

    }
    private boolean validateMobile(){
        String val=InputMobile.getEditText().getText().toString();

        if(val.isEmpty()){
            InputMobile.setError("Field cannot be empty");
            return false;
        }
        else {
            InputMobile.setError(null);
            InputMobile.setErrorEnabled(false);
            return true;
        }

    }

    public void Btn_login(View view) {
        if(!validatePassword() | !validateMobile()){
            return;
        }

        Intent i = new Intent(getApplicationContext(),Sign_Up.class);
        startActivity(i);
        //rootNode = FirebaseDatabase.getInstance();
        //reference=rootNode.getReference("users");
    }

    public void Btn_signup(View view) {
        //Toast.makeText(this,"Sign up Button click", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),Sign_Up.class);
        startActivity(i);
    }

    public void Forgot_pg(View view) {
        Toast.makeText(this,"Please try to remember the password ", Toast.LENGTH_SHORT).show();
    }
}



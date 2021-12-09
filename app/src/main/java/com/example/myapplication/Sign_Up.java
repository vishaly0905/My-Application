package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sign_Up extends AppCompatActivity {
    TextInputLayout regName,regMobile,regEmail,regPassword;
    Button Register,SignIn;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        regName=findViewById(R.id.full_name);
        regMobile=findViewById(R.id.mobile);
        regEmail=findViewById(R.id.email);
        regPassword=findViewById(R.id.pass_word);
        Register=findViewById(R.id.register);
        SignIn=findViewById(R.id.btn_sign);

       /* Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rootNode = FirebaseDatabase.getInstance();
                reference=rootNode.getReference("users");
                 //full_name,mobile,email,pass_word;
                String full_name=regName.getEditText().getText().toString();
                String mobile=regMobile.getEditText().getText().toString();
                String email=regEmail.getEditText().getText().toString();
                String pass_word=regPassword.getEditText().getText().toString();


                UserHelperClass helperClass=new UserHelperClass(full_name,mobile,email,pass_word);
                reference.child(mobile).setValue(helperClass);
            }
        });*/

    }

    private boolean validateName(){
        String val=regName.getEditText().getText().toString();
        if(val.isEmpty()){
            regName.setError("Field cannot be empty");
            return false;
        }
        else {
             regName.setError(null);
             regName.setErrorEnabled(false);
             return true;
        }

    }

    private boolean validateMobile(){
        String val=regMobile.getEditText().getText().toString();

        if(val.isEmpty()){
            regMobile.setError("Field cannot be empty");
            return false;
        }
        else {
            regMobile.setError(null);
            regMobile.setErrorEnabled(false);
            return true;
        }

    }

    private boolean validateEmail(){
        String val=regEmail.getEditText().getText().toString();
        String emailPattern="[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]+";
        if(val.isEmpty()){
            regEmail.setError("Field cannot be empty");
            return false;
        }
        else if(!val.matches(emailPattern)){
            regEmail.setError("Invalid Email Address");
            return false;

        }
        else {
            regEmail.setError(null);
            regEmail.setErrorEnabled(false);
            return true;
        }

    }

    private boolean validatePassword(){
        String val=regPassword.getEditText().getText().toString();
        if(val.isEmpty()){
            regPassword.setError("Field cannot be empty");
            return false;
        }
        else {
            regPassword.setError(null);
            regPassword.setErrorEnabled(false);
            return true;
        }

    }

    public void Btn_Register(View view) {
        if(!validateName() | !validateEmail() | !validateMobile() | !validatePassword())
        {
            return ;
        }

        rootNode = FirebaseDatabase.getInstance();
        reference=rootNode.getReference("users");
        //full_name,mobile,email,pass_word;
        String full_name=regName.getEditText().getText().toString();
        String mobile=regMobile.getEditText().getText().toString();
        String email=regEmail.getEditText().getText().toString();
        String pass_word=regPassword.getEditText().getText().toString();


        UserHelperClass helperClass=new UserHelperClass(full_name,mobile,email,pass_word);
        reference.child(mobile).setValue(helperClass);


    }

    public void Btn_signup(View view) {
        Toast.makeText(this,"Congrutulation !! Registration Done!!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);
    }
}
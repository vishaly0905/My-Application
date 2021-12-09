package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Btn_Next(View view) {
        Toast.makeText(this,"Next Button click", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);
    }
}
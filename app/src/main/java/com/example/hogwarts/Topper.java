package com.example.hogwarts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Topper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topper);
    }

    public void FirstPage(View view) {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
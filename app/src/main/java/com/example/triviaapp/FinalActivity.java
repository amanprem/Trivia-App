package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_final);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");

        TextView textView =  (TextView) findViewById(R.id.txtnamehere);
        textView.setText(name);
    }
}
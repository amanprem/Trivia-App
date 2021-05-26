package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CricketerActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button btnnexttoflab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_cricketer);
        initview();
    }

    private void initview() {

        Button btnnexttoflab = findViewById(R.id.btnnexttoindian);
        radioGroup = (RadioGroup) findViewById(R.id.answersonecricket);
        btnnexttoflab.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                selectedRadioButton  = (RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                String youranscricketer = selectedRadioButton.getText().toString();
                Toast.makeText(CricketerActivity.this, "Selected Radio Button is:" + youranscricketer , Toast.LENGTH_LONG).show();



                Intent intent = new Intent (CricketerActivity.this, IndiaflagActivity.class);
                startActivity (intent);
                finish ();
            }
        });
    }
}
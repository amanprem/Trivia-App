package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class IndiaflagActivity extends AppCompatActivity {

    CheckBox check, checkone, checktwo, checkthree;
    private android.widget.Toast Toast;
    Button btnnexttwofinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_indiaflag);
        initview();
    }

    private void initview() {
        check = (CheckBox) findViewById (R.id.checkone);
        checkone = (CheckBox) findViewById (R.id.checktwo);
        checktwo = (CheckBox) findViewById (R.id.checkthree);
        checkthree = (CheckBox) findViewById (R.id.checkfour);
        btnnexttwofinal = (Button) findViewById (R.id.btnnexttofinal);
    }

        public void Check (View v)
        {
            String msg = "";


            // Concatenation of the checked options in if

            // isChecked() is used to check whether
            // the CheckBox is in true state or not.

            if ( check.isChecked () )
                msg = msg + " White ";
            if ( checkone.isChecked () )
                msg = msg + " Yellow ";
            if ( checktwo.isChecked () )
                msg = msg + " Orange ";
            if ( checkthree.isChecked () )
                msg = msg + " Green ";

            // Toast is created to display the
            // message using show() method.
            Toast.makeText (this, msg + "are selected", Toast.LENGTH_LONG).show ();


            btnnexttwofinal.setOnClickListener (new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (IndiaflagActivity.this, FinalActivity.class);
                    startActivity (intent);
                }
            });
        }





}
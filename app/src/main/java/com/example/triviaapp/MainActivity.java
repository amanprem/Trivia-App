package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        initview();
    }

    private void initview() {

        Button btnmainname = findViewById(R.id.btn_nextone);
        btnmainname.setOnClickListener (v -> {

            EditText edtname = findViewById (R.id.edtname);
            String name = edtname.getText ().toString ().trim ();
            if ( name.isEmpty () ){

                edtname.setError ("Please Enter Name");
                return;
            }

            btnmainname.setOnClickListener (new View.OnClickListener () {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (MainActivity.this, CricketerActivity.class);
                    intent.putExtra("name",edtname.getText().toString());

                    startActivity (intent);
                    finish ();
                }
            });

        });
    }
}
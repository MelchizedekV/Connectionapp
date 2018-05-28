package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly8 extends Boly7 {
    EditText e8;
    Button b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly8);
        e8=(EditText)findViewById(R.id.bde8);
        b8=(Button)findViewById(R.id.bdb8);
        b8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e8.getText().toString().toLowerCase().equals("murder"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly8.this,Sboly.class);
        startActivity(i);
    }
}

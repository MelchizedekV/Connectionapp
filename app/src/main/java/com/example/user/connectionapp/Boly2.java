package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly2 extends Boly1 {

    EditText e2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly2);
        e2=(EditText)findViewById(R.id.bde2);
        b2=(Button)findViewById(R.id.bdb2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e2.getText().toString().toLowerCase().equals("toilet"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly2.this,Boly3.class);
        startActivity(i);
    }
}

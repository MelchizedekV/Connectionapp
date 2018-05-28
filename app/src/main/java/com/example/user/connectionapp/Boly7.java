package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly7 extends Boly6 {
    EditText e7;
    Button b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly7);
        e7=(EditText)findViewById(R.id.bde7);
        b7=(Button)findViewById(R.id.bdb7);
        b7.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e7.getText().toString().toLowerCase().equals("half girlfriend"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly7.this,Boly8.class);
        startActivity(i);
    }
}

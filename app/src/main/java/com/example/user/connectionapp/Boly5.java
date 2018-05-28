package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly5 extends Boly4 {
    EditText e5;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly5);
        e5=(EditText)findViewById(R.id.bde5);
        b5=(Button)findViewById(R.id.bdb5);
        b5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e5.getText().toString().toLowerCase().equals("pink"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly5.this,Boly6.class);
        startActivity(i);
    }
}

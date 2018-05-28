package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly6 extends Boly5 {
    EditText e6;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly6);
        e6=(EditText)findViewById(R.id.bde6);
        b6=(Button)findViewById(R.id.bdb6);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e6.getText().toString().toLowerCase().equals("Newton"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly6.this,Boly7.class);
        startActivity(i);
    }
}

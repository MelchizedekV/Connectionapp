package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly4 extends Boly3 {
    EditText e4;
    Button b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly4);
        e4=(EditText)findViewById(R.id.bde4);
        b4=(Button)findViewById(R.id.bdb4);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e4.getText().toString().toLowerCase().equals("Secret superstar"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly4.this,Boly5.class);
        startActivity(i);
    }
}

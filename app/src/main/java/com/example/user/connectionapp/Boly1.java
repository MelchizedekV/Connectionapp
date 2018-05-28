package com.example.user.connectionapp;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly1 extends category implements View.OnClickListener {

    public  static int bdsc=0;
    public  static int bdcr=0;
    public  static int bdwr=0;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly1);


        e1=(EditText)findViewById(R.id.bde1);

        b1=(Button)findViewById(R.id.bdb1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(e1.getText().toString().toLowerCase().equals("two states"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;
        }
        else
        {
            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly1.this,Boly2.class);
        startActivity(i);
    }
}

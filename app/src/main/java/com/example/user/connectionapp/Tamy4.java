package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy4 extends Tamy3{


    EditText e4;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy4);

        e4=(EditText)findViewById(R.id.Tme4);
        b4=(Button)findViewById(R.id.Tmb4);
        b4.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(e4.getText().toString().toLowerCase().equals("maan karate"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy4.this,Tamy5.class);
        startActivity(i);
    }



}

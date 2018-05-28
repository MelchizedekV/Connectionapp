package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy3 extends Tamy2 {


    EditText e3;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy3);

        e3=(EditText)findViewById(R.id.Tme3);
        b3=(Button)findViewById(R.id.Tmb3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e3.getText().toString().toLowerCase().equals("balloon"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy3.this,Tamy4.class);
        startActivity(i);
    }






}

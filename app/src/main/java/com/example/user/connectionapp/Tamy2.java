package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy2 extends Tamy1 {

    EditText e2;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy2);
        e2=(EditText)findViewById(R.id.Tme2);
        b2=(Button)findViewById(R.id.Tmb2);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e2.getText().toString().toLowerCase().equals("kodi"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy2.this,Tamy3.class);
        startActivity(i);
    }
}



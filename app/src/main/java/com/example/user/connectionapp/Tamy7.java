package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy7 extends Tamy6 {
    EditText e7;
    Button b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy7);


        e7=(EditText)findViewById(R.id.Tme7);
        b7=(Button)findViewById(R.id.Tmb7);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(e7.getText().toString().toLowerCase().equals("joker"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy7.this,Tamy8.class);
        startActivity(i);
    }

}

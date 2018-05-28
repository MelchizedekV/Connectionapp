package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy5 extends Tamy4 {

    EditText e5;
    Button b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy5);
        e5=(EditText)findViewById(R.id.Tme5);
        b5=(Button)findViewById(R.id.Tmb5);
        b5.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        if(e5.getText().toString().toLowerCase().equals("24"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy5.this,Tamy6.class);
        startActivity(i);
    }




}

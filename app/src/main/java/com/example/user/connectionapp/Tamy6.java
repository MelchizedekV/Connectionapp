package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy6 extends Tamy5 {


    EditText e6;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy6);

        e6=(EditText)findViewById(R.id.Tme6);
        b6=(Button)findViewById(R.id.Tmb6);
        b6.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(e6.getText().toString().toLowerCase().equals("mankatha"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy6.this,Tamy7.class);
        startActivity(i);
    }



}

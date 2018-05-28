package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy4 extends Holy3 implements View.OnClickListener {

    EditText het4;
    Button hbt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy4);

        het4=(EditText)findViewById(R.id.he4);
        hbt4=(Button)findViewById(R.id.hb4);
        hbt4.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {
        if(het4.getText().toString().toLowerCase().equals("lion king"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy4.this,Holy6.class);
        startActivity(i);

    }

}



























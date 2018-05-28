package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy2 extends Holy1 implements View.OnClickListener {
    EditText het2;
    Button hbt2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy2);

        het2=(EditText)findViewById(R.id.he2);
        hbt2=(Button)findViewById(R.id.hb2);
        hbt2.setOnClickListener(this);


    }@Override
    public void onClick(View view)
    {
        if(het2.getText().toString().toLowerCase().equals("batman"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy2.this,Holy3.class);
        startActivity(i);

    }

}



























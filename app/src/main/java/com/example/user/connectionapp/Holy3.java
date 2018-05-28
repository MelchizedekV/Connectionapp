package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy3 extends Holy2 implements View.OnClickListener {

    EditText het3;
    Button hbt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy3);
        het3=(EditText)findViewById(R.id.he3);
        hbt3=(Button)findViewById(R.id.hb3);
        hbt3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if(het3.getText().toString().toLowerCase().equals("home alone"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy3.this,Holy4.class);
        startActivity(i);

    }

}



























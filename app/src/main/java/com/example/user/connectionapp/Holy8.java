package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy8 extends Holy7 implements  View.OnClickListener
    {
        EditText het8;
        Button hbt8;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy8);

            het8=(EditText)findViewById(R.id.he8);
            hbt8=(Button)findViewById(R.id.hb8);
            hbt8.setOnClickListener(this);




    }

        @Override
    public void onClick(View view)
    {
        if(het8.getText().toString().toLowerCase().equals("terminator"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy8.this,Holy9.class);
        startActivity(i);

    }

}































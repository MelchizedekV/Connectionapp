package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy6 extends Holy4 implements View.OnClickListener {
    EditText het6;
    Button hbt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy6);

        het6=(EditText)findViewById(R.id.he6);
        hbt6=(Button)findViewById(R.id.hb6);
        hbt6.setOnClickListener(this);



    }


    @Override
    public void onClick(View view)
    {
        if(het6.getText().toString().toLowerCase().equals("captain america"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy6.this,Holy7.class);
        startActivity(i);

    }

}































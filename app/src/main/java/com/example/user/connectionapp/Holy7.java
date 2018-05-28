package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy7 extends Holy6 implements View.OnClickListener{



    EditText het7;
    Button hbt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy7);


        het7=(EditText)findViewById(R.id.he7);
        hbt7=(Button)findViewById(R.id.hb7);
        hbt7.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        if(het7.getText().toString().toLowerCase().equals("broken arrow"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy7.this,Holy8.class);
        startActivity(i);

    }

}































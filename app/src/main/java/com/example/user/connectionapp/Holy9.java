package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy9 extends Holy8 implements  View.OnClickListener{

    EditText het9;
    Button hbt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy9);

        het9=(EditText)findViewById(R.id.he9);
        hbt9=(Button)findViewById(R.id.hb9);
        hbt9.setOnClickListener(this);



    }



    @Override
    public void onClick(View view)
    {
        if(het8.getText().toString().toLowerCase().equals("wrong turn"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy9.this,Sholy.class);
        startActivity(i);

    }

}































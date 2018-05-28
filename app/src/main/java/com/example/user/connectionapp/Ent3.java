package com.example.user.connectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent3 extends Ent2 implements View.OnClickListener
{
    EditText e3;
    Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent3);
        e3=(EditText)findViewById(R.id.eent3);

        b3=(Button)findViewById(R.id.bent3);
      b3.setOnClickListener(this);

    }


    @Override
    public void onClick(View view)
    {
        if(e3.getText().toString().toLowerCase().equals("denmark"))
        {
            score=score+10;
            crct_ans=crct_ans+1;

        }
        else
        {
            score=score+0;
            wrong_ans=wrong_ans+1;
        }
        Intent i=new Intent(Ent3.this,Ent4.class);
        startActivity(i);

    }






}


package com.example.user.connectionapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent2 extends Ent1 implements View.OnClickListener
{
    EditText e2;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent2);

        e2=(EditText)findViewById(R.id.eent2);

        b2=(Button)findViewById(R.id.bent2);
        b2.setOnClickListener(this);
    }



    @Override
    public void onClick(View view)
    {
        if(e2.getText().toString().toLowerCase().equals("dominos"))
        {
            score=score+10;
            crct_ans=crct_ans+1;
        }
        else
        {
            score= score +0;
            wrong_ans=wrong_ans+1;
        }
        Intent i=new Intent(Ent2.this,Ent3.class);
        startActivity(i);

    }
}

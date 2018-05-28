package com.example.user.connectionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent1 extends category implements View.OnClickListener {
   EditText e1;
   Button be1;
    public static  int score =0;
    public  static int crct_ans=0;
    public  static int wrong_ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent1);
        e1=(EditText)findViewById(R.id.eent1);
        be1=(Button)findViewById(R.id.bent1);
        be1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        if(e1.getText().toString().toLowerCase().equals("colgate"))
        {

            score=score+10;
            crct_ans=crct_ans+1;
        }
        else
        {
            score=score+0;
            wrong_ans=wrong_ans+1;
        }
        Intent i=new Intent(Ent1.this,Ent2.class);
        startActivity(i);

    }

}


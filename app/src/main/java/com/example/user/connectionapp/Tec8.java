package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec8 extends Tec7 {
EditText et8;
Button bt8;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec8);

  et8=(EditText)findViewById(R.id.etec8);
  bt8=(Button)findViewById(R.id.btec8);

  bt8.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        if(et8.getText().toString().toLowerCase().equals("alibaba"))
        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec8.this,Tec9.class);
        startActivity(i);

    }



}

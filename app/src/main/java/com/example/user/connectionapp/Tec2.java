package com.example.user.connectionapp;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec2 extends Tec1 implements View.OnClickListener  {

    EditText et2;
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec2);
    et2=(EditText)findViewById(R.id.etec2);
    bt2=(Button)findViewById(R.id.btec2);
    bt2.setOnClickListener(this);



    }
    @Override
    public void onClick(View v) {
        if(et2.getText().toString().toLowerCase().equals("minimilitia"))        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec2.this,Tec3.class);
        startActivity(i);

    }




}

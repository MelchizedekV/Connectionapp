package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec4 extends Tec3{

    EditText et4;
    Button bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec4);

        et4=(EditText)findViewById(R.id.etec4);

        bt4=(Button)findViewById(R.id.btec4);

    bt4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(et4.getText().toString().toLowerCase().equals("java"))
        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec4.this,Tec6.class);
        startActivity(i);

    }



}

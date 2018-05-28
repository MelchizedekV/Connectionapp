package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec7 extends Tec4{
EditText et7;
Button bt7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec7);

et7=(EditText)findViewById(R.id.etec7);
bt7=(Button)findViewById(R.id.btec7);

bt7.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(et7.getText().toString().toLowerCase().equals("paypal"))
        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec7.this,Tec8.class);
        startActivity(i);

    }




}

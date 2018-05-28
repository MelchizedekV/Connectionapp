package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec3 extends Tec2 {

    EditText et3;
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec3);

    et3=(EditText)findViewById(R.id.etec3);
    bt3=(Button)findViewById(R.id.btec3);
    bt3.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if(et3.getText().toString().toLowerCase().equals("flipkart"))
        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec3.this,Tec4.class);
        startActivity(i);

    }



}




package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec6 extends Tec4{

    EditText et6;
    Button bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec6);

et6=(EditText)findViewById(R.id.etec6);
bt6=(Button)findViewById(R.id.btec6);
bt6.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(et6.getText().toString().toLowerCase().equals("encapsulation"))
        {
            score+=10;
            Crct_ans=Crct_ans+1;
        }
        else
        {
            score=score+0;
            Wrng_ans=Wrng_ans+1;
        }
        Intent i=new Intent(Tec6.this,Tec7.class);
        startActivity(i);

    }


}

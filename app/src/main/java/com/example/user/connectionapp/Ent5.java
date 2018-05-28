package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent5 extends Ent4 implements View.OnClickListener
{

    EditText e5;
    Button b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent5);


        b5 = (Button) findViewById(R.id.bent5);
        e5 = (EditText) findViewById(R.id.eent5);

        b5.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if (e5.getText().toString().toLowerCase().equals("neet"))
        {
            score = score + 10;
            crct_ans=crct_ans+1;
        } else

        {
            score =score+0;
            wrong_ans=wrong_ans+1;
        }
        Intent i = new Intent(Ent5.this, Ent6.class);
        startActivity(i);
    }
}
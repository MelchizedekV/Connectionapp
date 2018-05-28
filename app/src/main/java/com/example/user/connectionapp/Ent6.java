package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent6 extends Ent5 implements View.OnClickListener
{
    EditText e6;
    Button b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent6);
   e6=(EditText)findViewById(R.id.eent6);
   b6=(Button)findViewById(R.id.bent6);
   b6.setOnClickListener(this);


    }


    @Override
    public void onClick (View v) {
        if (e6.getText().toString().toLowerCase().equals("hardik pandya"))
        {
            score = score + 10;
            crct_ans=crct_ans+1;
        }
        else

        {
            score =score+0;

            wrong_ans=wrong_ans+1;
        }
        Intent i = new Intent(Ent6.this, Dent7.class);
        startActivity(i);
    }
}

package com.example.user.connectionapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dent7 extends Ent6 {
    EditText de7;
    Button db7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dent7);
        de7=(EditText)findViewById(R.id.ednt7);
        db7=(Button)findViewById(R.id.dent7);
        db7.setOnClickListener(this);
    }
    @Override
    public void onClick (View v) {
        if (de7.getText().toString().toLowerCase().equals("chocolate"))
        {
            score = score + 10;
            crct_ans=crct_ans+1;
        }
        else

        {
            score =score+0;

            wrong_ans=wrong_ans+1;
        }
        Intent i = new Intent(Dent7.this, Ent9.class);
        startActivity(i);
    }
}


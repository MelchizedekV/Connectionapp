package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy8 extends Tamy7 {

    EditText e8;
    Button b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy8);
        e8=(EditText)findViewById(R.id.Tme8);
        b8=(Button)findViewById(R.id.Tmb8);
        b8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e8.getText().toString().toLowerCase().equals("thuppakki"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy8.this,Stamy.class);
        startActivity(i);
    }
}

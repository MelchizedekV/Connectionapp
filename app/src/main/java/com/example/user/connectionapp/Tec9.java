package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec9 extends Tec8 {


    EditText et9;
    Button bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec9);

    et9=(EditText)findViewById(R.id.etec9);
    bt9=(Button)findViewById(R.id.btec9);

    bt9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (et9.getText().toString().toLowerCase().equals("playstore")) {
            score += 10;
            Crct_ans=Crct_ans+1;
        }
        else
            {
            score = score + 0;
                Wrng_ans=Wrng_ans+1;
        }
        Intent i = new Intent(Tec9.this, Sctec.class);
        startActivity(i);

    }

}

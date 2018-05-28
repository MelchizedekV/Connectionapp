package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent9 extends Dent7 implements View.OnClickListener {
    EditText e9;
    Button b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent9);

        e9=(EditText)findViewById(R.id.eent9);
        b9=(Button)findViewById(R.id.bent9);
        b9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (e9.getText().toString().toLowerCase().equals("headphones"))
        {
            score = score + 10;
            crct_ans=crct_ans+1;
        } else

        {
            score =score+0;
            wrong_ans=wrong_ans+1;
        }
        Intent i = new Intent(Ent9.this, Score.class);
        startActivity(i);
    }

}

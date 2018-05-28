package com.example.user.connectionapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ent4 extends Ent3 implements View.OnClickListener
{

    EditText e4;
    Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ent4);

        e4 = (EditText) findViewById(R.id.eent4);
        b4 = (Button) findViewById(R.id.bent4);


        b4.setOnClickListener(this);
    }
        @Override
        public void onClick (View v)
        {
            if (e4.getText().toString().toLowerCase().equals("cutlet")) {
                score = score + 10;
                crct_ans=crct_ans+1;
            }
            else

            {
                score =score+0;
                wrong_ans=wrong_ans+1;
            }
            Intent i = new Intent(Ent4.this, Ent5.class);
            startActivity(i);




    }
}


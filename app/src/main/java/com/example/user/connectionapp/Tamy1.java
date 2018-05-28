package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tamy1 extends category implements View.OnClickListener {
    public  static int Tamsc=0;
    public  static int Tamcr=0;
    public  static int Tamwr=0;
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamy1);


        e1=(EditText)findViewById(R.id.Tme1);

        b1=(Button)findViewById(R.id.Tmb1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(e1.getText().toString().toLowerCase().equals("Kanchana"))
        {
            Tamsc=Tamsc+10;
            Tamcr=Tamcr+1;
        }
        else
        {
            Tamsc=Tamsc+0;
            Tamwr=Tamwr+1;

        }
        Intent i=new Intent(Tamy1.this,Tamy2.class);
        startActivity(i);
    }
}

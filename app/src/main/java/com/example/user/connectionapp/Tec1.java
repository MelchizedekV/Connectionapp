package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tec1 extends category implements View.OnClickListener {


    public  static int score=0;
    public  static int Crct_ans=0;
    public  static int Wrng_ans=0;
    EditText etec1;
    Button btec1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tec1);

etec1=(EditText)findViewById(R.id.etec1);

 btec1=(Button)findViewById(R.id.btec1);
        btec1.setOnClickListener(this);




    }




    @Override
    public void onClick(View v)
    {
if(etec1.getText().toString().toLowerCase().equals("kotlin"))
{
    score=score+10;
    Crct_ans=Crct_ans+1;
}
else
{
    score=score+0;
    Wrng_ans=Wrng_ans+1;

}
        Intent i=new Intent(Tec1.this,Tec2.class);
        startActivity(i);

    }
}

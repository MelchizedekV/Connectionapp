package com.example.user.connectionapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Holy1 extends category implements View.OnClickListener{

    EditText het1;
    Button hbt1;

    public static  int scores =0;
    public  static int crct_anss=0;
    public  static int wrong_anss=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holy1);

        het1=(EditText)findViewById(R.id.he1);
        hbt1=(Button)findViewById(R.id.hb1);
        hbt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if(het1.getText().toString().toLowerCase().equals("fast and furious"))
        {

            scores=scores+10;
            crct_anss=crct_anss+1;
        }
        else
        {
            scores=scores+0;
            wrong_anss=wrong_anss+1;
        }
        Intent i=new Intent(Holy1.this,Holy2.class);
        startActivity(i);

    }

}


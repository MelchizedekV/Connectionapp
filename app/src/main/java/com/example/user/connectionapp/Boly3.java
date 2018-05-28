
package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Boly3 extends Boly2 {
    EditText e3;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boly3);
        e3=(EditText)findViewById(R.id.bde3);
        b3=(Button)findViewById(R.id.bdb3);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(e3.getText().toString().toLowerCase().equals("Tubelight"))
        {
            bdsc=bdsc+10;
            bdcr=bdcr+1;

        }
        else
        {

            bdsc=bdsc+0;
            bdwr=bdwr+1;

        }
        Intent i=new Intent(Boly3.this,Boly4.class);
        startActivity(i);
    }
}

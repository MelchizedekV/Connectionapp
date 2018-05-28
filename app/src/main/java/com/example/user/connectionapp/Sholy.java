package com.example.user.connectionapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sholy extends Holy9 implements View.OnClickListener {
    EditText sscore;
    EditText scrct;
    EditText swrng;
    EditText sname;
    Button sbb1;
    Button sbb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholy);

        mydb = new DatabaseHelper(this);

        sscore = (EditText) findViewById(R.id.holyeditscore);
        scrct = (EditText) findViewById(R.id.holyeditcrct);
        swrng = (EditText) findViewById(R.id.holyeditwrng);
        sname = (EditText) findViewById(R.id.holyeditname);
        sscore.setText(String.valueOf(scores));
        scrct.setText(String.valueOf(crct_anss));
        swrng.setText(String.valueOf(wrong_anss));
        sname.setText(String.valueOf(hi));

        sbb1 = (Button) findViewById(R.id.bhcat);
        sbb1.setOnClickListener(this);
        sbb2 = (Button) findViewById(R.id.btnho);
        sbb2.setOnClickListener(this);

        mydb.inserthodata(sname.getText().toString(),sscore.getText().toString());
    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.bhcat) {
            scores = 0;
            crct_anss = 0;
            wrong_anss = 0;
            hi = " ";
            Intent i = new Intent(Sholy.this, category.class);
            startActivity(i);
        }

        if ( view.getId()==R.id.btnho)
        {
            Cursor res= mydb.gethoData();
            if (res.getCount()==0)
            {
                showmessages("First","Nothing Found");
            }
            StringBuffer buffer=new StringBuffer();
            while(res.moveToNext())
            {
                buffer.append("ID:"+" "+res.getString(0) +"\n");
                buffer.append("NAME:"+" "+res.getString(1) +"\n");
                buffer.append("MARKS:"+" "+res.getString(2) +"\n\n");

            }
            showmessages("Data",buffer.toString());


        }



    }
    public void showmessages(String Title,String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }
}


















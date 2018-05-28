package com.example.user.connectionapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Stamy extends Tamy8 {

    EditText fetam1;
    EditText  fetam2;
    EditText fetmwrng;
    EditText  fetmname;
    Button fbtm1;
    Button fbtm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stamy);

        mydb=new  DatabaseHelper(this);
        fetam1=(EditText)findViewById(R.id.tam_score);
        fetam2  =(EditText)findViewById(R.id.tam_correct);
        fetmwrng  =(EditText)findViewById(R.id.tam_wrn);
        fetmname =(EditText)findViewById(R.id.tam_name);
        fetam1.setText(String.valueOf(Tamsc));
        fetam2.setText(String.valueOf(Tamcr));
        fetmwrng.setText(String.valueOf(Tamwr));
        fetmname.setText(String.valueOf(hi));

        fbtm1=(Button)findViewById(R.id.btntm1);

        fbtm1.setOnClickListener(this);
        fbtm2=(Button)findViewById(R.id.btntm2);
        fbtm2.setOnClickListener(this);

        mydb.inserttamdata(fetmname.getText().toString(),fetam1.getText().toString());

    }
    @Override
    public void onClick(View view)
    {


        if ( view.getId()==R.id.btntm1)
        {
            Tamsc=0;
            Tamcr=0;
            Tamwr=0;
            hi=" ";
            Intent i=new Intent(Stamy.this,category.class);
            startActivity(i);
        }
        if ( view.getId()==R.id.btntm2)
        {
            Cursor res= mydb.gettamData();
            if (res.getCount()==0)
            {
                howmessages("First","Nothing Found");
            }
            StringBuffer buffer=new StringBuffer();
            while(res.moveToNext())
            {
                buffer.append("ID:"+" "+res.getString(0) +"\n");
                buffer.append("NAME:"+" "+res.getString(1) +"\n");
                buffer.append("MARKS:"+" "+res.getString(2) +"\n\n");

            }
            howmessages("Data",buffer.toString());


        }



    }
    public void howmessages(String Title,String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }
}




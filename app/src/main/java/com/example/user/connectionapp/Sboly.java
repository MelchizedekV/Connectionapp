package com.example.user.connectionapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sboly extends Boly8 {

    EditText febd1;
    EditText  febd2;
    EditText febdwrng;
    EditText  febdname;
    Button fbbd1;
    Button fbbd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sboly);

        mydb=new  DatabaseHelper(this);
        febd1=(EditText)findViewById(R.id.bd_score);
        febd2  =(EditText)findViewById(R.id.bd_correct);
        febdwrng  =(EditText)findViewById(R.id.bd_wrn);
        febdname =(EditText)findViewById(R.id.bd_name);
        febd1.setText(String.valueOf(bdsc));
        febd2.setText(String.valueOf(bdcr));
        febdwrng.setText(String.valueOf(bdwr));
        febdname.setText(String.valueOf(hi));

        fbbd1=(Button)findViewById(R.id.btnbd1);

        fbbd1.setOnClickListener(this);
        fbbd2=(Button)findViewById(R.id.btnbd2);
        fbbd2.setOnClickListener(this);

        mydb.insertbddata(febdname.getText().toString(),febd1.getText().toString());

    }
    @Override
    public void onClick(View view)
    {


        if ( view.getId()==R.id.btnbd1)
        {
            bdsc=0;
            bdcr=0;
            bdwr=0;
            hi=" ";
            Intent i=new Intent(Sboly.this,category.class);
            startActivity(i);
        }
        if ( view.getId()==R.id.btnbd2)
        {
            Cursor res= mydb.getbdData();
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




package com.example.user.connectionapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sctec extends Tec9
{
EditText editscore;
    EditText  tcrct;
    EditText twrng;
    EditText  tname;
    Button bb1;
    Button bb2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sctec);
        mydb=new  DatabaseHelper(this);
        editscore=(EditText)findViewById(R.id.tec_score);
        tcrct  =(EditText)findViewById(R.id.tec_correct);
        twrng  =(EditText)findViewById(R.id.tec_wrng);
        tname =(EditText)findViewById(R.id.tec_name);
        editscore.setText(String.valueOf(score));
        tcrct.setText(String.valueOf(Crct_ans));
        twrng.setText(String.valueOf(Wrng_ans));
        tname.setText(String.valueOf(hi));

        bb1=(Button)findViewById(R.id.btntec);

    bb1.setOnClickListener(this);
        bb2=(Button)findViewById(R.id.btntec2);
        bb2.setOnClickListener(this);

    mydb.inserttecdata(tname.getText().toString(),editscore.getText().toString());


    }

    @Override
    public void onClick(View view)
    {


if ( view.getId()==R.id.btntec)
{
    score=0;
    Crct_ans=0;
    Wrng_ans=0;
    hi=" ";
    Intent i=new Intent(Sctec.this,category.class);
    startActivity(i);
}
        if ( view.getId()==R.id.btntec2)
        {
            Cursor res= mydb.getstAllData();
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








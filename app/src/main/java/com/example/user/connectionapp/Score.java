package com.example.user.connectionapp;


import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Score extends Ent9 implements View.OnClickListener
{

    EditText sc;
    EditText  crct;
    EditText wrng;
    EditText  name;
    Button bw1;
    Button bw2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mydb=new  DatabaseHelper(this);
        crct = (EditText) findViewById(R.id.eecrct);
        wrng= (EditText) findViewById(R.id.eewrng);
        name= (EditText) findViewById(R.id.eename);
        sc = (EditText) findViewById(R.id.editec);
        bw2=(Button)findViewById(R.id.btnscore2);
        sc.setText(String.valueOf(score));
        crct.setText(String.valueOf(crct_ans));
        wrng.setText(String.valueOf(wrong_ans));
        bw1=(Button)findViewById(R.id.btnscore1);
name.setText(String.valueOf(hi));
        bw1.setOnClickListener(this);
        bw2.setOnClickListener(this);

        mydb.insertdata(name.getText().toString(),sc.getText().toString());
    }



    @Override
    public void onClick(View view)
    {

    if (view.getId()==R.id.btnscore1)
    {

        score=0;
        crct_ans=0;
        wrong_ans=0;
        hi=" ";
        Intent i=new Intent(Score.this,category.class);
        startActivity(i);



    }

        if (view.getId()==R.id.btnscore2)
        {
           Cursor res= mydb.getAllData();
           if (res.getCount()==0)
           {
               showmessage("First","Nothing Found");
           }
           StringBuffer buffer=new StringBuffer();
           while(res.moveToNext())
           {
               buffer.append("ID:"+" "+res.getString(0) +"\n");
               buffer.append("NAME:"+" "+res.getString(1) +"\n");
               buffer.append("MARKS:"+" "+res.getString(2) +"\n\n");

           }
            showmessage("Data",buffer.toString());


        }



    }
    public void showmessage(String Title,String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(Title);
        builder.setMessage(message);
        builder.show();
    }
}


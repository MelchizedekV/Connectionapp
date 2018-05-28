
package com.example.user.connectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class category extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    DatabaseHelper mydb;
    public static String hi=" ";
    Spinner s;
   EditText ec;

    List<String> li;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        s=(Spinner)findViewById(R.id.spinner);
        ec=(EditText)findViewById(R.id.editcategory);
        li= new ArrayList<String>();
        li.add("Select category");
        li.add("Entertainment");
        li.add("Technology");
        li.add("Hollywood movies");
        li.add("Tamil movies");
        li.add("Bollywood movies");

        ArrayAdapter<String> ad = new ArrayAdapter(getBaseContext(),android.R.layout.simple_list_item_1,li);
        s.setAdapter(ad);
        s.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)


    {
        if(i==0)

        {

            Toast.makeText(getApplicationContext(),"please select category",Toast.LENGTH_LONG).show();

        }


if(l==1)
{


    Intent in=new Intent(category.this,Ent1.class);
    startActivity(in);
   hi=ec.getText().toString();
}
if(l==2)
{
    Intent in=new Intent(category.this,Tec1.class);

    startActivity(in);
    hi=ec.getText().toString();

}

        if(l==3)
        {
            Intent in=new Intent(category.this,Holy1.class);

            startActivity(in);
            hi=ec.getText().toString();

        }
        if(l==4)
        {
            Intent in=new Intent(category.this,Tamy1.class);

            startActivity(in);
            hi=ec.getText().toString();

        }

        if(l==5)
        {
            Intent in=new Intent(category.this,Boly1.class);

            startActivity(in);
            hi=ec.getText().toString();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

package com.example.user.connectionapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 1/18/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="CONNEXION";
    public static final String TABLE_NAME1="ENTERTAINMENT " ;
    public static final String TABLE_NAME2="TECHNOLOGY " ;
    public static final String TABLE_NAME3="HOLLYWOOD " ;
    public static final String TABLE_NAME4="TAMIL " ;
    public static final String TABLE_NAME5="BOLLYWOOD " ;

    public static final String COL1="SNO " ;
    public static final String COL2="NAME " ;
    public static final String COL3="MARKS" ;




    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);






    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL("create table " +TABLE_NAME1 +" (SNO INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MARKS INTEGER)");
db.execSQL("create table " +TABLE_NAME2 +" (SNO INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MARKS INTEGER)");
db.execSQL("create table " +TABLE_NAME3+" (SNO INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MARKS INTEGER)");
db.execSQL("create table " +TABLE_NAME4+" (SNO INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MARKS INTEGER)");
db.execSQL("create table " +TABLE_NAME5+" (SNO INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME4 );
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME5 );


        onCreate(db);
    }

public boolean insertdata(String name,String marks)
{
    SQLiteDatabase db=this.getWritableDatabase();
    ContentValues contentValues=new ContentValues();
   contentValues.put(COL2,name);
    contentValues.put(COL3,marks);
    long result=db.insert(TABLE_NAME1,null,contentValues);
    if(result==-1)
        return false;
        else
            return true;
}


       public boolean inserttecdata(String name,String marks)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,marks);
        long result=db.insert(TABLE_NAME2,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }

    public boolean inserthodata(String name,String marks)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,marks);
        long result=db.insert(TABLE_NAME3,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean inserttamdata(String name,String marks)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,marks);
        long result=db.insert(TABLE_NAME4,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public boolean insertbddata(String name,String marks)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL2,name);
        contentValues.put(COL3,marks);
        long result=db.insert(TABLE_NAME5,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;
    }
    public Cursor getAllData ()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select*from " + TABLE_NAME1, null);
        return res;
    }
    public Cursor getstAllData ()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select*from " + TABLE_NAME2, null);
        return res;
    }


    public Cursor gethoData ()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select*from " + TABLE_NAME3, null);
        return res;
    }

    public Cursor gettamData ()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select*from " + TABLE_NAME4, null);
        return res;
    }
    public Cursor getbdData ()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select*from " + TABLE_NAME5, null);
        return res;
    }

}







package com.example.android.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Shoukat Malik on 9/10/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    SQLiteDatabase db;

    public  static final String DATABASE_NANE="Contact.db";
    public  static final String TABlE_NANE="Contacts";
    public  static final String COL_1="ID";
    public  static final String COL_2="NAME";
    public  static final String COL_3="SURNAME";
    public  static final String COL_4="MARKS";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NANE,null,1);
        SQLiteDatabase db=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table"+TABlE_NANE+"(ID INTEGER PRIMARY KEY AUTOMATIC,NAME TEXT,SURNAME TEXT, MARKS INTED)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST"+TABlE_NANE);
        onCreate(db);
    }
}
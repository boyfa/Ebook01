package com.example.test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {

    public static final String dbName = "BiMatHanhTrinhTinhYeu.db";
    public static final String TableName = "BMHTTY";
    public static final String Col_1 = "ID";
    public static final String Col_2 = "Chapter";
    public static final String Col_3 = "Content";

    public DbManager(Context context) {
        super(context, dbName, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TableName +
                "(" + Col_1 + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                Col_2 + " TEXT," +
                Col_3 + " TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TableName);
        onCreate(sqLiteDatabase);

    }

    public String addRecord (String Chapter, String Content){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("chapter", Chapter);
        cv.put("content", Content);
        long res = db.insert("BMHTTY", null,cv);

        if(res == -1)
            return "Failed";
        else
            return "Successfully";
    }

}

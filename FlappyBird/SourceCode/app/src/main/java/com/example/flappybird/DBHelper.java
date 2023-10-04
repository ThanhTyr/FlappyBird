package com.example.flappybird;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "DiemXH.db";
    public static final int DB_VERSION = 1;

    public DBHelper(@Nullable Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Tao bang DiemXH
        String sql = "CREATE TABLE IF NOT EXISTS DiemXH (" +
                "Id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Diem VARCHAR(200))";
        sqLiteDatabase.execSQL(sql); //Thuc thi chuoi lenh sql
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //Su dung trong truong hop thay doi cau truc bang, nang cap CSDL
        //Xoa bang neu ton tai bang DiemXH
        String sql = "DROP TABLE IF EXISTS DiemXH";
        sqLiteDatabase.execSQL(sql); //Thuc thi xoa bang
        onCreate(sqLiteDatabase); //Tao lai bang moi

    }
}

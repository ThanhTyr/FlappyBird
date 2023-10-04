package com.example.flappybird;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DiemXHDAO {
    private SQLiteDatabase db;
    public DiemXHDAO(Context context){
        DBHelper dbHelper = new DBHelper(context);
        //Mo CSDL o che do ghi de thuc hien cac thao tac them, xoa, sua cac bang
        db = dbHelper.getWritableDatabase();
    }
    public void dulieumau(){
        String sql = "INSERT INTO DiemXH VALUES(null, '6')";
        db.execSQL(sql);
    }
    public List<DiemXH> getDiemXH(){
        List<DiemXH> list = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM DiemXH ORDER BY Id DESC LIMIT 3", null);

        while (cursor.moveToNext()){
            DiemXH diemXH = new DiemXH();
            diemXH.setIdDiem(cursor.getInt(0));
            diemXH.setDiem(cursor.getString(1));
            list.add(diemXH);
        }
        return list;
    }
}

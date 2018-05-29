package com.truyenngontinh.nhung.truyenngontinh.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.truyenngontinh.nhung.truyenngontinh.Database.DbHelper;
import com.truyenngontinh.nhung.truyenngontinh.Entities.TheloaiEntity;

import java.util.ArrayList;

import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.TABLE_THELOAI;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.THELOAI_IDTHELOAI;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.THELOAI_IDTRUYEN;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.THELOAI_TENTHELOAI;

public class TheloaiDAO extends DbHelper {
    public TheloaiDAO(Context context) {
        super(context);
    }
    public void add(TheloaiEntity theloaiEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(THELOAI_IDTHELOAI, theloaiEntity.getIdtheloai()+"");
        values.put(THELOAI_IDTRUYEN, theloaiEntity.getIdtruyen()+"");
        values.put(THELOAI_TENTHELOAI, theloaiEntity.getTentheloai()+"");
        db.insert(TABLE_THELOAI, null, values);
        db.close();
    }
    public ArrayList<TheloaiEntity> getBySQL(String sql){
        ArrayList<TheloaiEntity> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do {
                String idtruyen = cursor.getString(0);
                String idtheloai = cursor.getString(1);
                String tentheloai = cursor.getString(2);
                TheloaiEntity theloaiEntity = new TheloaiEntity(idtruyen, idtheloai, tentheloai);
                list.add(theloaiEntity);
            }while (cursor.moveToNext());
        }
        db.close();
        return list;
    }
    public ArrayList<TheloaiEntity> getAll(){
        return getBySQL("select * from "+TABLE_THELOAI);
    }
    public void update(TheloaiEntity theloaiEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(THELOAI_TENTHELOAI, theloaiEntity.getTentheloai()+"");
        db.update(TABLE_THELOAI, values, THELOAI_IDTRUYEN+" like '"+theloaiEntity.getIdtruyen()+"' and "+THELOAI_IDTHELOAI+" like '"+theloaiEntity.getIdtheloai()+"'", null);
        db.close();
    }
    public void delete(String idtruyen, String idtheloai){
        SQLiteDatabase database = getWritableDatabase();
        database.delete(TABLE_THELOAI, THELOAI_IDTRUYEN+" like '"+idtruyen+"' and "+THELOAI_IDTHELOAI+" like '"+idtheloai+"'", null);
        database.close();
    }
}

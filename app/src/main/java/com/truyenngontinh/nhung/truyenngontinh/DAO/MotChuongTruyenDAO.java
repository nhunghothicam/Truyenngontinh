package com.truyenngontinh.nhung.truyenngontinh.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.truyenngontinh.nhung.truyenngontinh.Database.DbHelper;
import com.truyenngontinh.nhung.truyenngontinh.Entities.MotChuongTruyenEntity;

import java.util.ArrayList;

import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTCHUONGTRUYEN_CHITIET;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTCHUONGTRUYEN_IDCHUONG;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTCHUONGTRUYEN_IDTRUYEN;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTCHUONGTRUYEN_TENCHUONG;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.TABLE_MOTCHUONGTRUYEN;

public class MotChuongTruyenDAO extends DbHelper {
    public MotChuongTruyenDAO(Context context) {
        super(context);
    }
    public void add(MotChuongTruyenEntity motChuongTruyenEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MOTCHUONGTRUYEN_IDTRUYEN, motChuongTruyenEntity.getIdtruyen()+"");
        values.put(MOTCHUONGTRUYEN_IDCHUONG, motChuongTruyenEntity.getIdchuong()+"");
        values.put(MOTCHUONGTRUYEN_TENCHUONG, motChuongTruyenEntity.getChitiet()+"");
        values.put(MOTCHUONGTRUYEN_CHITIET, motChuongTruyenEntity.getChitiet()+"");
        db.insert(TABLE_MOTCHUONGTRUYEN, null, values);
        db.close();
    }
    public ArrayList<MotChuongTruyenEntity> getBySQL(String sql){
        ArrayList<MotChuongTruyenEntity> list = new ArrayList<>();
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if(cursor.moveToFirst()){
            do{
                String idtruyen = cursor.getString(0);
                String idchuong = cursor.getString(1);
                String ten = cursor.getString(2);
                String chitiet = cursor.getString(3);
                MotChuongTruyenEntity motChuongTruyenEntity = new MotChuongTruyenEntity(idtruyen, idchuong, ten, chitiet);
                list.add(motChuongTruyenEntity);
            }while (cursor.moveToNext());
        }
        db.close();
        return list;
    }
    public ArrayList<MotChuongTruyenEntity> getAll(){
        return getBySQL("select * from "+TABLE_MOTCHUONGTRUYEN);
    }
    public ArrayList<MotChuongTruyenEntity> getByIdTruyen(String idtruyen){
     return getBySQL("select * from "+TABLE_MOTCHUONGTRUYEN+" where "+MOTCHUONGTRUYEN_IDTRUYEN+" like '"+idtruyen+"'");
    }
    public void update(MotChuongTruyenEntity motChuongTruyenEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MOTCHUONGTRUYEN_TENCHUONG, motChuongTruyenEntity.getChitiet()+"");
        values.put(MOTCHUONGTRUYEN_CHITIET, motChuongTruyenEntity.getChitiet()+"");
        db.update(TABLE_MOTCHUONGTRUYEN, values, MOTCHUONGTRUYEN_IDTRUYEN+" like '"+motChuongTruyenEntity.getIdtruyen()+"' and "+MOTCHUONGTRUYEN_IDCHUONG+" like '"+motChuongTruyenEntity.getIdchuong()+"'", null);
        db.close();
    }
    public void delete(String idtruyen, String idchuong){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_MOTCHUONGTRUYEN, MOTCHUONGTRUYEN_IDTRUYEN+" like '"+idtruyen+"' and "+MOTCHUONGTRUYEN_IDCHUONG+" like '"+idchuong+"'", null);
        db.close();
    }
}

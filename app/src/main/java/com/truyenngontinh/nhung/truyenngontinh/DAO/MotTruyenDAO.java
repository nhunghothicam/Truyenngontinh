package com.truyenngontinh.nhung.truyenngontinh.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.truyenngontinh.nhung.truyenngontinh.Database.DbHelper;
import com.truyenngontinh.nhung.truyenngontinh.Entities.MotTruyenEntity;

import java.util.ArrayList;

import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_HINHANH;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_IDTRUYEN;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_MOTA;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_OFF;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_SOCHUONG;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_TACGIA;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_TENTRUYEN;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_TINHTRANG;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.MOTTRUYEN_YEUTHICH;
import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.TABLE_MOTTRUYEN;

public class MotTruyenDAO extends DbHelper {
    public MotTruyenDAO(Context context) {
        super(context);
    }
    public ArrayList<MotTruyenEntity> getBySQL(String sql){
      ArrayList<MotTruyenEntity> list = new ArrayList<>();
      SQLiteDatabase db = getReadableDatabase();
      Cursor cursor = db.rawQuery(sql, null);
      if(cursor.moveToFirst()){
          do{
              String id = cursor.getString(0);
              String ten = cursor.getString(1);
              String tacgia = cursor.getString(2);
              String hinhanh = cursor.getString(3);
              String mota = cursor.getString(4);
              String sochuong = cursor.getString(5);
              String tinhtrang = cursor.getString(6);
              int yeuthich = cursor.getInt(7);
              int off = cursor.getInt(8);
              MotTruyenEntity motTruyenEntity = new MotTruyenEntity(id,ten,tacgia, hinhanh, mota, sochuong, tinhtrang, yeuthich, off);
              list.add(motTruyenEntity);
          }while (cursor.moveToNext());
      }
      db.close();
      return list;
    }
    public ArrayList<MotTruyenEntity> getAll(){
        return getBySQL("select * from "+TABLE_MOTTRUYEN);
    }
    public void update(MotTruyenEntity motTruyenEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MOTTRUYEN_TENTRUYEN, motTruyenEntity.getTentruyen()+"");
        values.put(MOTTRUYEN_HINHANH, motTruyenEntity.getHinhanh()+"");
        values.put(MOTTRUYEN_MOTA, motTruyenEntity.getMota()+"");
        values.put(MOTTRUYEN_TACGIA, motTruyenEntity.getTacgia()+"");
        values.put(MOTTRUYEN_SOCHUONG, motTruyenEntity.getSochuong()+"");
        values.put(MOTTRUYEN_TINHTRANG, motTruyenEntity.getTinhtrang()+"");
        values.put(MOTTRUYEN_YEUTHICH, motTruyenEntity.getYeuthich());
        values.put(MOTTRUYEN_OFF, motTruyenEntity.getOff());
        db.update(TABLE_MOTTRUYEN, values, MOTTRUYEN_IDTRUYEN+" like '"+motTruyenEntity.getIdtruyen()+"'",null);
        db.close();
    }
    public int getConut(){
        int count = 0;
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from "+TABLE_MOTTRUYEN, null);
        if(cursor.moveToFirst()){
            do{
                count++;
            }while (cursor.moveToNext());
        }
        return count;
    }
    public void add(MotTruyenEntity motTruyenEntity){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(MOTTRUYEN_IDTRUYEN, motTruyenEntity.getIdtruyen()+"");
        values.put(MOTTRUYEN_TENTRUYEN, motTruyenEntity.getTentruyen()+"");
        values.put(MOTTRUYEN_HINHANH, motTruyenEntity.getHinhanh()+"");
        values.put(MOTTRUYEN_MOTA, motTruyenEntity.getMota()+"");
        values.put(MOTTRUYEN_TACGIA, motTruyenEntity.getTacgia()+"");
        values.put(MOTTRUYEN_SOCHUONG, motTruyenEntity.getSochuong()+"");
        values.put(MOTTRUYEN_TINHTRANG, motTruyenEntity.getTinhtrang()+"");
        values.put(MOTTRUYEN_YEUTHICH, motTruyenEntity.getYeuthich());
        values.put(MOTTRUYEN_OFF, motTruyenEntity.getOff());
        db.insert(TABLE_MOTTRUYEN, null, values);
        db.close();
    }
    public void delete(String id){
        SQLiteDatabase db = getWritableDatabase();
        db.delete(TABLE_MOTTRUYEN, MOTTRUYEN_IDTRUYEN+" like '"+id+"'", null);
    }
}

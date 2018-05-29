package com.truyenngontinh.nhung.truyenngontinh.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.truyenngontinh.nhung.truyenngontinh.Database.conf.TABLE_MOTTRUYEN;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "TruyenngontinhDbHelper", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE mottruyen\n" +
                "(\n" +
                "idtruyen varchar,\n" +
                "tentruyen varchar,\n" +
                "tacgia varchar,\n" +
                "hinhanh varchar,\n" +
                "mota varchar,\n" +
                "sochuong varchar,\n" +
                "tinhtrang varchar,\n" +
                "yeuthich integer,\n" +
                "off integer\n" +
                ");\n";
        db.execSQL(sql);
        sql = "CREATE TABLE motchuongtruyen\n" +
                "(\n" +
                "idtruyen varchar,\n" +
                "idchuong varchar,\n" +
                "tenchuong varchar,\n" +
                "chitiet varchar\n" +
                ");\n";
        db.execSQL(sql);
        sql = "CREATE TABLE theloai\n" +
                "(\n" +
                "idtruyen varchar,\n" +
                "idtheloai varchar,\n" +
                "tentheloai varchar\n" +
                ");\n";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

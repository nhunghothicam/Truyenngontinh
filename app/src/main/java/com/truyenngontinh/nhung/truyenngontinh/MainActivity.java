package com.truyenngontinh.nhung.truyenngontinh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.truyenngontinh.nhung.truyenngontinh.DAO.MotChuongTruyenDAO;
import com.truyenngontinh.nhung.truyenngontinh.DAO.MotTruyenDAO;
import com.truyenngontinh.nhung.truyenngontinh.DAO.TheloaiDAO;
import com.truyenngontinh.nhung.truyenngontinh.Entities.MotChuongTruyenEntity;
import com.truyenngontinh.nhung.truyenngontinh.Entities.MotTruyenEntity;
import com.truyenngontinh.nhung.truyenngontinh.Entities.TheloaiEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

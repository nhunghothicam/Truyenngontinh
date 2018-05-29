package com.truyenngontinh.nhung.truyenngontinh.Entities;

import java.io.Serializable;

public class MotChuongTruyenEntity implements Serializable{

    private String idtruyen, idchuong, tenchuong, chitiet;

    public MotChuongTruyenEntity(){}

    public MotChuongTruyenEntity(String idtruyen, String idchuong, String tenchuong, String chitiet){
        this.idtruyen = idtruyen;
        this.idchuong = idchuong;
        this.tenchuong = tenchuong;
        this.chitiet = chitiet;
    }

    public String getIdtruyen() {
        return idtruyen;
    }

    public void setIdtruyen(String idtruyen) {
        this.idtruyen = idtruyen;
    }

    public String getIdchuong() {
        return idchuong;
    }

    public void setIdchuong(String idchuong) {
        this.idchuong = idchuong;
    }

    public String getTenchuong() {
        return tenchuong;
    }

    public void setTenchuong(String tenchuong) {
        this.tenchuong = tenchuong;
    }

    public String getChitiet() {
        return chitiet;
    }

    public void setChitiet(String chitiet) {
        this.chitiet = chitiet;
    }
}

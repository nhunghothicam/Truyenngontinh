package com.truyenngontinh.nhung.truyenngontinh.Entities;

import java.io.Serializable;

public class MotTruyenEntity implements Serializable {

    private String idtruyen, tentruyen, tacgia, hinhanh, mota, sochuong, theloai, tinhtrang;
    private int yeuthich, off;

    public MotTruyenEntity(){}

    public MotTruyenEntity(String idtruyen, String tentruyen, String tacgia, String hinhanh, String mota, String sochuong, String theloai, String tinhtrang, int yeuthich, int off){
        this.idtruyen = idtruyen;
        this.tentruyen = tentruyen;
        this.tacgia = tacgia;
        this.hinhanh = hinhanh;
        this.mota = mota;
        this.sochuong = sochuong;
        this.theloai = theloai;
        this.tinhtrang = tinhtrang;
        this.yeuthich = yeuthich;
        this.off = off;
    }

    public String getIdtruyen() {
        return idtruyen;
    }

    public void setIdtruyen(String idtruyen) {
        this.idtruyen = idtruyen;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSochuong() {
        return sochuong;
    }

    public void setSochuong(String sochuong) {
        this.sochuong = sochuong;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getYeuthich() {
        return yeuthich;
    }

    public void setYeuthich(int yeuthich) {
        this.yeuthich = yeuthich;
    }

    public int getOff() {
        return off;
    }

    public void setOff(int off) {
        this.off = off;
    }
}

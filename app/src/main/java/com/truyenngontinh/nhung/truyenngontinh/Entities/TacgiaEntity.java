package com.truyenngontinh.nhung.truyenngontinh.Entities;

import java.io.Serializable;

public class TacgiaEntity implements Serializable {

    private String idtruyen, idtacgia, tentacgia, hinhanh, motatacgia;

    public TacgiaEntity(){}

    public TacgiaEntity(String idtruyen, String idtacgia, String tentacgia, String hinhanh, String motatacgia){
        this.idtruyen = idtruyen;
        this.idtacgia = idtacgia;
        this.tentacgia = tentacgia;
        this.hinhanh = hinhanh;
        this.motatacgia = motatacgia;
    }

    public String getIdtruyen() {
        return idtruyen;
    }

    public void setIdtruyen(String idtruyen) {
        this.idtruyen = idtruyen;
    }

    public String getIdtacgia() {
        return idtacgia;
    }

    public void setIdtacgia(String idtacgia) {
        this.idtacgia = idtacgia;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getMotatacgia() {
        return motatacgia;
    }

    public void setMotatacgia(String motatacgia) {
        this.motatacgia = motatacgia;
    }
}

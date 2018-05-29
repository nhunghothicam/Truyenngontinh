package com.truyenngontinh.nhung.truyenngontinh.Entities;

import java.io.Serializable;

public class TheloaiEntity implements Serializable {

    private String idtruyen, idtheloai, tentheloai, motatheloai;

    public TheloaiEntity(){}

    public TheloaiEntity(String idtruyen, String idtheloai, String tentheloai, String motatheloai){
        this.idtruyen = idtruyen;
        this.idtheloai = idtheloai;
        this.tentheloai = tentheloai;
        this.motatheloai = motatheloai;
    }

    public String getIdtruyen() {
        return idtruyen;
    }

    public void setIdtruyen(String idtruyen) {
        this.idtruyen = idtruyen;
    }

    public String getIdtheloai() {
        return idtheloai;
    }

    public void setIdtheloai(String idtheloai) {
        this.idtheloai = idtheloai;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public String getMotatheloai() {
        return motatheloai;
    }

    public void setMotatheloai(String motatheloai) {
        this.motatheloai = motatheloai;
    }
}

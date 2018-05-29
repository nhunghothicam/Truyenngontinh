package com.truyenngontinh.nhung.truyenngontinh.Entities;

import java.io.Serializable;

public class TheloaiEntity implements Serializable {

    private String idtruyen, idtheloai, tentheloai;

    public TheloaiEntity(){}

    public TheloaiEntity(String idtruyen, String idtheloai, String tentheloai){
        this.idtruyen = idtruyen;
        this.idtheloai = idtheloai;
        this.tentheloai = tentheloai;
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
}

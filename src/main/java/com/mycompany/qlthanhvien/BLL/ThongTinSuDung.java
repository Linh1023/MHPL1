/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Admin
 */
@Entity
public class ThongTinSuDung implements Serializable {

    @Id
    private int maTT;
    private int maTV;

    private Integer maTB;

    private Date tGVao;

    private Date tGMuon;

    private Date tGTra;

    public ThongTinSuDung() {
    }

    public ThongTinSuDung( int maTV, Integer maTB, Date tGVao, Date tGMuon, Date tGTra) {
        this.maTV = maTV;
        this.maTB = maTB;
        this.tGVao = tGVao;
        this.tGMuon = tGMuon;
        this.tGTra = tGTra;
    }

    public int getMaTT() {
        return maTT;
    }

    public int getMaTV() {
        return maTV;
    }

    public Integer getMaTB() {
        return maTB;
    }

    public Date getTGVao() {
        return tGVao;
    }

    public Date getTGMuon() {
        return tGMuon;
    }

    public Date getTGTra() {
        return tGTra;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public void setMaTB(Integer maTB) {
        this.maTB = maTB;
    }

    public void setTGVao(Date tGVao) {
        this.tGVao = tGVao;
    }

    public void setTGMuon(Date tGMuon) {
        this.tGMuon = tGMuon;
    }

    public void setTGTra(Date tGTra) {
        this.tGTra = tGTra;
    }

  

}

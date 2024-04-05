/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "ThongTinSuDung")
public class ThongTinSuDung implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTT")
    private int matt;
    
    private int matv;

    private Integer maTB;

    private Date tgvao;

    private Date tgmuon;

    private Date tgtra;

    public ThongTinSuDung() {
    }

    public ThongTinSuDung( int matv, Integer maTB, Date tgvao, Date tgmuon, Date tgtra) {
        this.matv = matv;
        this.maTB = maTB;
        this.tgvao = tgvao;
        this.tgmuon = tgmuon;
        this.tgtra = tgtra;
    }

    public int getMatt() {
        return matt;
    }

    public int getMatv() {
        return matv;
    }

    public Integer getMatb() {
        return maTB;
    }

    public Date getTgvao() {
        return tgvao;
    }

    public Date getTgmuon() {
        return tgmuon;
    }

    public Date getTgtra() {
        return tgtra;
    }

    public void setMatt(int matt) {
        this.matt = matt;
    }

    public void setMatv(int matv) {
        this.matv = matv;
    }

    public void setMatb(Integer maTB) {
        this.maTB = maTB;
    }

    public void setTgvao(Date tgvao) {
        this.tgvao = tgvao;
    }

    public void setTgmuon(Date tgmuon) {
        this.tgmuon = tgmuon;
    }

    public void setTgtra(Date tgtra) {
        this.tgtra = tgtra;
    }

  

}

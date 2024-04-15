/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity
@Table(name = "thongtinsd")
public class ThongTinSuDung implements Serializable {

    @Id
    private int maTT;
    
    private int maTV;

    private Integer maTB;

    private Date tGVao;

    private Date tGMuon;

    private Date tGTra;

    @ManyToOne(targetEntity = ThanhVien.class)
    @JoinColumn(name="MaTV")
    private ThanhVien thanhvien;
    public ThongTinSuDung() {
    }

    public ThongTinSuDung( int maTV, Integer maTB, Date tGVao, Date tGMuon, Date tGTra) {
        this.maTV = maTV;
        this.maTB = maTB;
        this.tGVao = tGVao;
        this.tGMuon = tGMuon;
        this.tGTra = tGTra;
    }  
}
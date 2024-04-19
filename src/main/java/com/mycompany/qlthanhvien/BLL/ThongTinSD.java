/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

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
public class ThongTinSD {

    @Id
    @Column(name = "MaTT")
    private int maTT;

    @Column(name = "MaTV")
    private int maTV;

//    dùng integer tại vì có thể null
    @Column(name = "MaTB")
    private Integer maTB;

    @Column(name = "TGVao")
    private Date tGVao;

    @Column(name = "TGMuon")
    private Date tGMuon;

    @Column(name = "TGTra")
    private Date tGTra;

    @ManyToOne
    @JoinColumn(name = "MaTV", insertable = false, updatable = false)
    private ThanhVien thanhVien;

    @ManyToOne
    @JoinColumn(name = "MaTB", insertable = false, updatable = false)
    private ThietBi thietBi;

    public ThongTinSD() {
    }
    
    public ThongTinSD(int maTV, Integer maTB, Date tGVao, Date tGMuon, Date tGTra) {
        this.maTV = maTV;
        this.maTB = maTB;
        this.tGVao = tGVao;
        this.tGMuon = tGMuon;
        this.tGTra = tGTra;
    }
}

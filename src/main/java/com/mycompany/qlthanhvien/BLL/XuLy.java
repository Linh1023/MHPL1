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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
@Entity
@Table(name = "xuly")
public class XuLy implements Serializable {

    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="MaXL")
    private int maXL;

    @Column(name = "MaTV")
    private int maTV;

    @Column(name = "HinhThucXL")
    private String hinhThucSX;

    @Column(name = "SoTien")
    private Integer soTien;

    @Column(name = "NgayXL")
    private Date NgayXL;
    
    @Column(name = "TrangThaiXL")
    private int TrangThaiXL;

    public XuLy() {
    }

    public XuLy(int maTV, int maXL, String hinhThucSX, int soTien, Date NgayXL, int TrangThaiXL) {
        this.maTV = maTV;
        this.maXL = maXL;
        this.hinhThucSX = hinhThucSX;
        this.soTien = soTien;
        this.NgayXL = NgayXL;
        this.TrangThaiXL = TrangThaiXL;
    }

}

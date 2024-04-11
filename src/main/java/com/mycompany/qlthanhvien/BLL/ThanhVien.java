/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Data
//@Entity
@Table(name = "Thanhvien")
public class ThanhVien implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTV")
    private int maTV;
    
    @Column(name = "Hoten")
    private String hoten;
    
    @Column(name = "Khoa")
    private String khoa;
    
    @Column(name = "Nganh")
    private String nganh;
    
    @Column(name = "SDT")
    private int sdt;
    
    public ThanhVien() {}

    public ThanhVien(String hoten, String khoa, String nganh, int sdt) {
        this.hoten = hoten;
        this.khoa = khoa;
        this.nganh = nganh;
        this.sdt = sdt;
    }
}

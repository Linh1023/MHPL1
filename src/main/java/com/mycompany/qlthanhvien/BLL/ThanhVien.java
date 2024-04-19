/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import java.io.Serializable;
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
@Table(name = "thanhvien")
public class ThanhVien implements Serializable{
    
    @Id
    @Column(name = "MaTV")
    private int maTV;
    
    @Column(name = "Hoten")
    private String hoten;
    
    @Column(name = "Khoa")
    private String khoa;
    
    @Column(name = "Nganh")
    private String nganh;
    
    @Column(name = "SDT")
    private String sdt;
    
    @Column(name = "PassWord")
    private String password;
    
    @Column(name = "Email")
    private String email;
    
    public ThanhVien() {}

    public ThanhVien(String hoten, String khoa, String nganh, String sdt, String password, String email ) {
        this.hoten = hoten;
        this.khoa = khoa;
        this.nganh = nganh;
        this.sdt = sdt;
        this.password = password;
        this.email = email;
    }
}

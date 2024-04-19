/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Admin
 */
@Entity
@Data
@Table(name ="thietbi")
public class ThietBi {

    @Id
    @Column(name = "MaTB")
    private int MaTB;
    
    @Column(name = "TenTB")
    String tenTB;

    @Column(name = "MoTaTB")
    String moTaTB;

    public ThietBi() {
    }

    public ThietBi( int MaTB,String tenTB, String moTaTB) {
        this.tenTB = tenTB;
        this.MaTB = MaTB;
        this.moTaTB = moTaTB;
    }
    @Override
    public String toString(){
        return ""+this.MaTB+";"+this.tenTB+";"+this.moTaTB;
    }
}

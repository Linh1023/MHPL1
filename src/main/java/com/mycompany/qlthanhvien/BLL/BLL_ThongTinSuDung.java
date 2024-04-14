/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThongTinSuDung;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author PC
 */
public class BLL_ThongTinSuDung {
    DAL_ThongTinSuDung dAL_ThongTinSuDung;

    
    
    public BLL_ThongTinSuDung() {
    SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        if (factory!=null) {
             dAL_ThongTinSuDung = new DAL_ThongTinSuDung(factory);
        } else {
            System.out.println("Failed to initialize SessionFactory.");
        }
    }
    
     public ArrayList<ThongTinSuDung> listThongTinSuDung() {
         return dAL_ThongTinSuDung.listThongTinSuDung();
     }
}

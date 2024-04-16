/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.BLL_ThanhVien;
import com.mycompany.qlthanhvien.BLL.ThanhVien;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author Admin
 */
public class DAL_ThanhVien {
    
    private Session session;
    
    public DAL_ThanhVien (){
         session = HibernateUtils.getSessionFactory().openSession();
    }
   
     public List<ThanhVien> getThanhvien() {
         
         List<ThanhVien> thanhvien;
         session.beginTransaction();
        thanhvien = this.session.createQuery("FROM ThanhVien").list();
        session.getTransaction().commit();
        return thanhvien;
    }
    public List<ThanhVien> SearchThanhvien(String column, String value ) {
         
         List<ThanhVien> thanhvien;
         session.beginTransaction();
    
        thanhvien = this.session.createQuery("FROM ThanhVien WHERE " + column + " = "+ value).list();
        session.getTransaction().commit();
        return thanhvien;
    }
     
    public void addThanhVien(ThanhVien thanhvien)
    {
        session.beginTransaction();
        session.save(thanhvien);   
        session.getTransaction().commit();
        
    }
    public void updateThanhVien(ThanhVien thanhvien)
    {
       session.beginTransaction();
       session.update(thanhvien);
       session.getTransaction().commit();
    }
    public void deleteThanhVien(ThanhVien thanhvien)
    {
        session.beginTransaction();
        session.delete(thanhvien);
        session.getTransaction().commit();
    }
    public boolean mergeThanhVien(ThanhVien tv) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.merge(tv);
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }
    public static void main(String[] args) {
        DAL_ThanhVien dAL_ThanhVien = new DAL_ThanhVien();
        
       //  Lấy ds
        List<ThanhVien> tvs = dAL_ThanhVien.getThanhvien();
        for (int i = 0;i< tvs.size(); i++) { 
            System.out.println(tvs.get(i).getMaTV());
            
        }
        

//        add
//        ThanhVien thanhVien = new ThanhVien();
//        thanhVien.setMaTV(1243);
//        thanhVien.setHoten("abc");
//        thanhVien.setEmail("emailcom");
//        thanhVien.setPassword("123123h");
//        dAL_ThanhVien.addThanhVien(thanhVien);
        
// update
//        ThanhVien thanhVien = new ThanhVien();
//        thanhVien.setMaTV(1243);
//        thanhVien.setHoten("loc hoang");
//        thanhVien.setEmail("emailcom");
//        thanhVien.setPassword("123123h");
//        dAL_ThanhVien.updateThanhVien(thanhVien);
        
//        delete 
//        ThanhVien thanhVien = new ThanhVien();
//        thanhVien.setMaTV(1243);
//         dAL_ThanhVien.deleteThanhVien(thanhVien);
        
          
    }
    
    
}
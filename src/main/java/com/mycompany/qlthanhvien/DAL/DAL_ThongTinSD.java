/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThongTinSD;
import java.util.List;
import org.hibernate.Session;

public class DAL_ThongTinSD {
    private Session session;
    
    public DAL_ThongTinSD (){
         session = HibernateUtils.getSessionFactory().openSession();
    }
   
     public List<ThongTinSD> getThongTinSD() {
         
         List<ThongTinSD> thongTinSDs;
         session.beginTransaction();
        thongTinSDs = this.session.createQuery("FROM ThongTinSD WHERE  MaTB is not NULL").list();
        session.getTransaction().commit();
        return thongTinSDs;
    }
     
    public void addThongTinSD(ThongTinSD thongTinSD)
    {
        session.beginTransaction();
        session.save(thongTinSD);   
        session.getTransaction().commit();
        
    }
    public void updateThongTinSD(ThongTinSD thongTinSD)
    {
       session.beginTransaction();
       session.update(thongTinSD);
       session.getTransaction().commit();
    }
    public void deleteThongTinSD(ThongTinSD thongTinSD)
    {
        session.beginTransaction();
        session.delete(thongTinSD);
        session.getTransaction().commit();
    }
     
//     public static void main(String[] args) {
//        DAL_ThongTinSD dAL_ThongTinSD = new DAL_ThongTinSD();
////        ThongTinSD thongTinSD = new ThongTinSD();
////        
////        thongTinSD.setMaTV(1123330257);
////        
////        
////        dAL_ThongTinSD.addThongTinSD(thongTinSD);
//            
//        List<ThongTinSD> thongTinSDs = dAL_ThongTinSD.getThongTinSD();
//        for (int i =  0; i<thongTinSDs.size(); i++) {
//            System.out.println(thongTinSDs.get(i).getMaTV());
//            System.out.println(thongTinSDs.get(i).getThietBi().getMaTB());
//        }
//    }
}
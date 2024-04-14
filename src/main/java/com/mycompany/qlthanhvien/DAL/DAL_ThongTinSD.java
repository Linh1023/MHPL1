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
         this.session = HibernateUtils.getSessionFactory().openSession();
         this.session.beginTransaction();
          
    }
   
     public List getThongTinSD() {
         
         List<ThongTinSD> thongTinSDs;
         this.session.beginTransaction();
        thongTinSDs = this.session.createQuery("FROM ThongTinSD WHERE  MaTB is not NULL").list();
        this.session.getTransaction().commit();
        return thongTinSDs;
    }
     
    public void addThongTinSD(ThongTinSD thongTinSD)
    {
        this.session.save(thongTinSD);   
         this.session.getTransaction().commit();
        
    }
    public void updateThongTinSD(ThongTinSD thongTinSD)
    {
        this.session.update(thongTinSD);
        this.session.getTransaction().commit();
    }
    public void deleteThongTinSD(ThongTinSD thongTinSD)
    {
        session.delete(thongTinSD);
        this.session.getTransaction().commit();
    }
     
     public static void main(String[] args) {
        DAL_ThongTinSD dAL_ThongTinSD = new DAL_ThongTinSD();
        ThongTinSD thongTinSD = new ThongTinSD();
//        thongTinSD.setMaTT(2);
        thongTinSD.setMaTV(1123330257);
        
        
        dAL_ThongTinSD.addThongTinSD(thongTinSD);
            
        List<ThongTinSD> thongTinSDs = dAL_ThongTinSD.getThongTinSD();
        for (int i =  0; i<thongTinSDs.size(); i++) {
            System.out.println(thongTinSDs.get(i).getThanhVien().getMaTV());
            System.out.println(thongTinSDs.get(i).getThietBi().getMaTB());
        }
    }
}
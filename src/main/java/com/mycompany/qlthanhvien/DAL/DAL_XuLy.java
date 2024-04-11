/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import com.mycompany.qlthanhvien.BLL.XuLy;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author quang
 */
public class DAL_XuLy {

    private static SessionFactory factory;

    public DAL_XuLy(SessionFactory factory) {
        this.factory = factory;

    }

    public static void main(String[] args) {
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        if (factory != null) {
            DAL_XuLy xl = new DAL_XuLy(factory);
            xl.listXuly();;
        } else {
            System.out.println("Failed to initialize SessionFactory.");
        }

    }

    public void listXuly() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String queryString = "FROM XuLy"; // Đảm bảo sử dụng tên entity chính xác (chữ hoa/chữ thường)
            List departments = session.createQuery(queryString).list();
            for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
                XuLy tv = (XuLy) iterator.next();
                System.out.print(" MaXL:" + tv.getMaXL());
                System.out.print("MaTV:" + tv.getMaTV());
                System.out.print(" Hinh THUC XU LY:" + tv.getHinhThucSX());
                System.out.print(" SoTien:" + tv.getSoTien());
                System.out.print(" NGAY XU LY:" + tv.getNgayXL());
                System.out.println(" Trang THAI:" + tv.getTrangThaiXL());
            }
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();

        } finally {
            session.close();
        }
    }

}

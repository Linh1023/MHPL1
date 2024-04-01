/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Admin
 */
public class HibernateQLTV {
    private static SessionFactory factory;

    public HibernateQLTV(SessionFactory factory) {
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
            HibernateQLTV hb = new HibernateQLTV(factory);
            hb.listThanhvien();
        } else {
            System.out.println("Failed to initialize SessionFactory.");
        }
    }

    public void listThanhvien() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String queryString = "FROM Thanhvien"; // Đảm bảo sử dụng tên entity chính xác (chữ hoa/chữ thường)
            List departments = session.createQuery(queryString).list();
            for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
                Thanhvien tv = (Thanhvien) iterator.next();
                System.out.println("MaTV:" + tv.getMaTV());
                System.out.println("HoTen:" + tv.getHoten());
                System.out.println("Khoa:" + tv.getKhoa());
                System.out.println("Nganh:" + tv.getNganh());
                System.out.println("SDT:" + tv.getSdt());
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

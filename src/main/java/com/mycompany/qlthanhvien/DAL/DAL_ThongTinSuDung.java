/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import java.util.Date;
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

public class DAL_ThongTinSuDung {
    private static SessionFactory factory;

    public DAL_ThongTinSuDung(SessionFactory factory) {
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
            DAL_ThongTinSuDung hb = new DAL_ThongTinSuDung(factory);
            Date date=new Date();
            hb.listThongTinSuDung();
            hb.addThongTinSuDung(1120150184, 1000002, date,  date,  date);
            hb.updateThongTinSuDung(3, 1000001);
            hb.listThongTinSuDung();
            hb.deleteThongTinSuDung(3);
            hb.listThongTinSuDung();
        } else {
            System.out.println("Failed to initialize SessionFactory.");
        }
    }

    public boolean listThongTinSuDung() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String queryString = "FROM ThongTinSuDung"; // Đảm bảo sử dụng tên entity chính xác (chữ hoa/chữ thường)
            List departments = session.createQuery(queryString).list();
            for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
                ThongTinSuDung tv = (ThongTinSuDung) iterator.next();
                System.out.print(" MaTT:" + tv.getMaTT());
                System.out.print("MaTV:" + tv.getMaTV());
                System.out.print(" MaTB:" + tv.getMaTB());
                System.out.print(" TGM:"+ tv.getTGMuon());
                System.out.print(" TGT:" + tv.getTGTra());
                System.out.println(" TGV:" + tv.getTGVao());
            }
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
    
    public Integer addThongTinSuDung(int matv, int matb, Date tgvao, Date tgmuon, Date tgtra) {
        Session session = factory.openSession();
        Integer matt = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ThongTinSuDung d = new ThongTinSuDung(matv,matb,tgvao,tgmuon,tgtra);
            matt = (Integer) session.save(d);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return matt;
    }

    public boolean updateThongTinSuDung(int maTT ,int matb) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ThongTinSuDung d = (ThongTinSuDung) session.get(ThongTinSuDung.class, maTT);
            d.setMaTB(matb);
            session.update(d);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public boolean deleteThongTinSuDung(Integer maTT) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ThongTinSuDung d = (ThongTinSuDung) session.get(ThongTinSuDung.class, maTT);
            session.delete(d);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import java.util.ArrayList;
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

     public ArrayList<ThongTinSuDung> listThongTinSuDung() {
        Session session = factory.openSession();
        Transaction tx = null;
        ArrayList<ThongTinSuDung> arrayListTTSD = new ArrayList<ThongTinSuDung>();
        try {
            tx = session.beginTransaction();
            String queryString = "FROM ThongTinSuDung"; // Đảm bảo sử dụng tên entity chính xác (chữ hoa/chữ thường)
            List departments = session.createQuery(queryString).list();
            for (Iterator iterator = departments.iterator(); iterator.hasNext();) {
                ThongTinSuDung thongTinSuDung = (ThongTinSuDung) iterator.next();
                arrayListTTSD.add(thongTinSuDung);
            }
            tx.commit();
            return arrayListTTSD;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return arrayListTTSD;
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

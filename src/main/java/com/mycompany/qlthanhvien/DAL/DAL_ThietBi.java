/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThietBi;
import java.util.ArrayList;
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
public class DAL_ThietBi {

    public DAL_ThietBi() {
        factory = HibernateUtil.getSessionFactory();
    }

    private SessionFactory factory;

    public List listThietBi() {
        Session session = factory.openSession();
        Transaction tx = null;
        List list = null;

        try {
            tx = (Transaction) session.beginTransaction();
            list = session.createQuery("FROM ThietBi").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    public boolean addThietBi(int maTB, String tenTB, String moTaTB) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            ThietBi existingThietBi = session.get(ThietBi.class, maTB);
            if (existingThietBi != null) {
                return false;
            }
            tx = session.beginTransaction();
            ThietBi d = new ThietBi(maTB, tenTB, moTaTB);
            session.save(d);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
        return true;
    }

    public boolean updateThietBi(int maTB, String tenTB, String moTaTB) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ThietBi d = (ThietBi) session.get(ThietBi.class, maTB);
            d.setMaTB(maTB);
            d.setTenTB(tenTB);
            d.setMoTaTB(moTaTB);
            session.update(d);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
        return true;
    }

    public boolean deleteThietBi(int maTB) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            ThietBi d = (ThietBi) session.get(ThietBi.class, maTB);
            session.delete(d);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
                return false;
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

}

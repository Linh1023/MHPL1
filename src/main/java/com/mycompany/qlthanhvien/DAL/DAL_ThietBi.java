/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThietBi;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author quang
 */
public class DAL_ThietBi {

    Session session;

    public DAL_ThietBi() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List<ThietBi> loadThietBi() {
        List<ThietBi> list = null;
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            list = session.createQuery("FROM ThietBi", ThietBi.class).list();
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return list;
    }

    public ThietBi getThietBi(int MaTB) {
        ThietBi tb = session.get(ThietBi.class, MaTB);
        return tb;
    }

    public void addThietBi(ThietBi tb) {
        session.save(tb);
    }

    public void updateThietBi(ThietBi tb) {
        session.saveOrUpdate(tb);
    }

    public void deleteThietBi(ThietBi tb) {
        session.delete(tb);
    }
}

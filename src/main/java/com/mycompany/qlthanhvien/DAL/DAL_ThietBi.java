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
import org.hibernate.exception.ConstraintViolationException;

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
        ThietBi tb = null;
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            tb = session.get(ThietBi.class, MaTB);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return tb;
    }

    public void addThietBi(ThietBi tb) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tb);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateThietBi(ThietBi tb) {
        Transaction transaction = null;
        try {
            session.clear();
            transaction = session.beginTransaction();
            session.update(tb);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public boolean mergeThietBi(ThietBi tb) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.merge(tb);
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

    public boolean deleteThietBi(ThietBi tb) {
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(tb);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if (e instanceof ConstraintViolationException) {
                System.out.println("Không thể xóa ThietBi do có ràng buộc khóa ngoại: " + e.getMessage());
            } else {
                System.out.println("Lỗi xóa DAL ThietBi: " + e.getMessage());
            }
            if (tx != null ) {
                tx.rollback();
            }
            return false;
        }
    }

    public boolean deleteThietBiStartingWith(String prefix) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.createQuery("DELETE FROM ThietBi WHERE maTB LIKE :prefix")
                    .setParameter("prefix", prefix + "%")
                    .executeUpdate();
            transaction.commit();
            return true;
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }

}

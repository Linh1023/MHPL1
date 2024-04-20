/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

//import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import com.mycompany.qlthanhvien.BLL.XuLy;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author quang
 */
public class DAL_XuLy {

    Session session;

    public DAL_XuLy() {
        session = HibernateUtils.getSessionFactory().openSession();

    }

    public List<XuLy> loadXuLy() {
        List<XuLy> list = null;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            list = session.createQuery("From XuLy", XuLy.class).list();
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
            }

        } finally {
            session.close();
        }
        return list;

    }

    public void addXulY(XuLy obj) {

        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        session.save(obj);

    }

    public void updateXuLy(XuLy obj) {
        session.update(obj);
    }

    public void deleteXuly(XuLy obj) {
        session.delete(obj);
    }

    public XuLy getXuLy(int XuLyId) {

        XuLy c = session.get(XuLy.class, XuLyId);
        return c;
    }

    public List getThongKeXuLy() {

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<XuLy> root = criteriaQuery.from(XuLy.class);

        criteriaQuery.multiselect(builder.count(root.get("maTV")), root.get("TrangThaiXL"));
        criteriaQuery.groupBy(root.get("TrangThaiXL"));

        List<Object[]> results = session.createQuery(criteriaQuery).getResultList();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            int trangthai = (int) result[1];
            System.out.println("So luong: " + soluong + ", date: " + trangthai);
        }
        return results;
    }

    public List<XuLy> getListDaXuLy() {
        
         List<XuLy> list = null;
         session.beginTransaction();
    
        list =  session.createQuery("FROM XuLy WHERE TrangThaiXL = 1 ").list();
        session.getTransaction().commit();
        return list;
    }

}

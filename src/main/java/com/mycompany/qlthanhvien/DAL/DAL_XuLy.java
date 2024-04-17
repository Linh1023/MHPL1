/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

//import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
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

    Session session;

    public DAL_XuLy() {
        session = HibernateUtils.getSessionFactory().openSession();

    }

    public static void main(String[] args) {
        DAL_XuLy dal = new DAL_XuLy();
        List list  = dal.loadXuLy();
          list.forEach(System.out::println);
        
    }

    public List<XuLy> loadXuLy() {
        List<XuLy> list = null;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
           list = session.createQuery("From XuLy",XuLy.class).list();
            transaction.commit();
}
            catch(HibernateException e)
                  {
                  
                  if (transaction != null) {
                transaction.rollback();
            }
                  
                  }
            finally {
            session.close();
        }
            return list;

        }
    

    public void addXulY(XuLy obj) {
        
        
        session.beginTransaction();
        session.save(obj);   
        session.getTransaction().commit();
        System.out.println("test"+session.save(obj));
        
        

    }
    public void updateXuLy(XuLy obj)
    {
        session.update(obj);
    }
    public void deleteXuly (XuLy obj)
    {
        session.delete(obj);
    }
    
    public XuLy getXuLy(int XuLyId)
            
    {
    
        XuLy c =session.get( XuLy.class,XuLyId);
        return c;
    }
    
}

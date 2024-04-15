/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThanhVien;
import java.util.ArrayList;
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
public class BLL_ThanhVien {
    private DAL_ThanhVien thanhVienDAL;
//    private static SessionFactory factory;

    public BLL_ThanhVien () {
        thanhVienDAL= new DAL_ThanhVien();
    }
    
    public List<ThanhVien> getThanhVien () {
        List<ThanhVien> thongTinSDs = thanhVienDAL.getThanhvien();
        return thongTinSDs;
    }
    public List<ThanhVien> SearchThanhVien (String column, String value) {
        List<ThanhVien> thongTinSDs = thanhVienDAL.SearchThanhvien(column, value);
        return thongTinSDs;
    }
public void addThanhVien(ThanhVien thongTinSD)
    {
       
        thanhVienDAL.addThanhVien(thongTinSD);   
        
        
    }
    public void updateThanhVien(ThanhVien thongTinSD)
    {
       
       thanhVienDAL.updateThanhVien(thongTinSD);
       
    }
    public void deleteThanhVien(ThanhVien thongTinSD)
    {
       
        thanhVienDAL.deleteThanhVien(thongTinSD);
   
    }
    public boolean importExcel(ArrayList<ThanhVien> danhsachThanhvien) {
        System.out.println("tới đây rồi");
        int a = 0;
        for (ThanhVien thanhVien : danhsachThanhvien) {
            thanhVienDAL.mergeThanhVien(thanhVien);
            System.out.println(a);
            a++;
        }
        return true;
    }
    
        
        
        
        
        
//        SessionFactory factory = null;
//        try {
//            factory = new Configuration().configure().buildSessionFactory();
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
//        if (factory!=null) {
//             thanhVienDAL = new DAL_ThanhVien(factory);
//        } else {
//            System.out.println("Failed to initialize SessionFactory.");
//        }
//    }
//    public BLL_ThanhVien(SessionFactory factory) {
//        factory = null;
//        try {
//            factory = new Configuration().configure().buildSessionFactory();
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
//        if (factory!=null) {
//             thanhVienDAL = new DAL_ThanhVien(factory);
//        } else {
//            System.out.println("Failed to initialize SessionFactory.");
//        }
//    }
//     // Phương thức để mở phiên làm việc với cơ sở dữ liệu
//    
//     public ArrayList<ThanhVien> listThanhVien() {
//         return thanhVienDAL.getAllThanhVien();
//     }
//     
//    public ArrayList<ThanhVien> searchThanhVienByValue(String column, String value) {
//        return thanhVienDAL.searchThanhVienByValue(column, value);
//    }
//    public void deleteThanhVien(int maTV) {
//        thanhVienDAL.deleteThanhVien(maTV);
//    }
//    
//    public void addThanhVien(int maTV, String Hoten, String Khoa, String Nganh, String Password, String Email, String email){
//        thanhVienDAL.addNewThanhVien(maTV, Hoten, Khoa, Nganh, Khoa, Password, Email);
//    }
//    public void updateThanhVien(int maTV, String hoTen, String khoa, String nganh, String sdt, String passWord, String email) {
//        thanhVienDAL.updateThanhVien(maTV, hoTen, khoa, nganh, sdt, passWord, email);
//    }
//    public void themDuLieuTuExcel(String filePath) {
//        thanhVienDAL.themDuLieuTuExcel(filePath);
//    }
//    public boolean themTVtuExcel(ThanhVien thanhVien){
//        return thanhVienDAL.addOrUpdate(thanhVien);
//        
//    }
    
//     public static void main(String[] args) {
//        BLL_ThanhVien bLL_ThanhVien = new BLL_ThanhVien();
//        ArrayList<ThanhVien> arrayList =  new ArrayList<ThanhVien>();
//        arrayList = bLL_ThanhVien.listThanhVien();
//        for (int i = 0; i<arrayList.size() ; i++)
//        {
//            System.out.println(arrayList.get(i).getMaTV());
//        }
  }

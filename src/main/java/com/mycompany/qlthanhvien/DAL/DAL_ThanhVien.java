/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThanhVien;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class DAL_ThanhVien {

    private Session session;

    public DAL_ThanhVien() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List<ThanhVien> getThanhvien() {

        List<ThanhVien> thanhvien;
        session.beginTransaction();
        thanhvien = this.session.createQuery("FROM ThanhVien").list();
        session.getTransaction().commit();
        return thanhvien;
    }

    public List<ThanhVien> SearchThanhvien(String column, String value) {

        List<ThanhVien> thanhvien;
        session.beginTransaction();

        thanhvien = this.session.createQuery("FROM ThanhVien WHERE " + column + " = " + value).list();
        session.getTransaction().commit();
        return thanhvien;
    }

    public void addThanhVien(ThanhVien thanhvien) {
        session.beginTransaction();
        session.save(thanhvien);
        session.getTransaction().commit();

    }

    public void updateThanhVien(ThanhVien thanhvien) {
        session.beginTransaction();
        session.update(thanhvien);
        session.getTransaction().commit();
    }

    public void deleteThanhVien(ThanhVien thanhvien) throws Exception {
        session.beginTransaction();
        // Kiểm tra xem mã thành viên có tồn tại trong bảng xuly hay không
        Long countXuLy = (Long) session.createQuery("SELECT COUNT(*) FROM XuLy WHERE MaTV = :maTV")
                .setParameter("maTV", thanhvien.getMaTV())
                .uniqueResult();
        if (countXuLy > 0) {
            throw new Exception("Không thể xóa thành viên do tồn tại trong bảng xuly.");
        }
        // Nếu không có ràng buộc khóa ngoại, thực hiện xóa
        session.delete(thanhvien);
        session.getTransaction().commit();
    }

    public boolean deleteThanhVienByYear(int year) {
        session.beginTransaction();
        List<ThanhVien> thanhViensToDelete = session.createQuery("FROM ThanhVien WHERE SUBSTRING(MaTV, 3, 2) = :year")
                .setParameter("year", String.valueOf(year))
                .list();

        boolean canDelete = true;
        for (ThanhVien thanhVien : thanhViensToDelete) {
            // Kiểm tra xem MaTV của ThanhVien có tồn tại trong bảng ThongTinsd hay không
            Long countThongTinsd = (Long) session.createQuery("SELECT COUNT(*) FROM ThongTinSD WHERE MaTV = :maTV")
                    .setParameter("maTV", thanhVien.getMaTV())
                    .uniqueResult();
            // Kiểm tra xem MaTV của ThanhVien có tồn tại trong bảng XuLy hay không
            Long countXuLy = (Long) session.createQuery("SELECT COUNT(*) FROM XuLy WHERE MaTV = :maTV")
                    .setParameter("maTV", thanhVien.getMaTV())
                    .uniqueResult();

            // Nếu MaTV tồn tại trong cả hai bảng ThongTinsd và XuLy, không thể xóa
            if (countThongTinsd > 0 || countXuLy > 0) {
                canDelete = false;
            } else {
                // Nếu không tồn tại trong cả hai bảng, thực hiện xóa thành viên
                session.delete(thanhVien);
            }
        }

        session.getTransaction().commit();

        return canDelete; // Trả về true nếu có thể xóa, ngược lại trả về false
    }

    public boolean mergeThanhVien(ThanhVien tv) {
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.merge(tv);
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

    public static void main(String[] args) {
        DAL_ThanhVien dAL_ThanhVien = new DAL_ThanhVien();

        // Lấy ds
        List<ThanhVien> tvs = dAL_ThanhVien.SearchThanhvien("MaTV", "1124420005");
        for (int i = 0; i < tvs.size(); i++) {
            System.out.println(tvs.get(i).getMaTV());

        }
    }

    public List<Integer> getDistinctYears() {
        List<Integer> years = new ArrayList<>();
        session.beginTransaction();
        List<ThanhVien> thanhvien = session.createQuery("FROM ThanhVien").list();
        session.getTransaction().commit();
        for (ThanhVien tv : thanhvien) {
            String maTV = String.valueOf(tv.getMaTV());
            String yearString = maTV.substring(2, 4);
            int year = Integer.parseInt(yearString);
            if (!years.contains(year)) {
                years.add(year);
            }
        }
        return years;
    }

    public List<ThanhVien> getThanhVienByYear(int year) {
        List<ThanhVien> thanhViens;
        session.beginTransaction();
        thanhViens = session.createQuery("FROM ThanhVien WHERE SUBSTRING(MaTV, 3, 2) = :year")
                .setParameter("year", String.valueOf(year))
                .list();
        session.getTransaction().commit();
        return thanhViens;
    }

}

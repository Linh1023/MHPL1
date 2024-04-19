/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThanhVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BLL_ThanhVien {
    private DAL_ThanhVien thanhVienDAL;

    public BLL_ThanhVien() {
        thanhVienDAL = new DAL_ThanhVien();
    }

    public List<ThanhVien> getThanhVien() {
        List<ThanhVien> thongTinSDs = thanhVienDAL.getThanhvien();
        return thongTinSDs;
    }

    public List<ThanhVien> SearchThanhVien(String column, String value) {
        List<ThanhVien> thongTinSDs = thanhVienDAL.SearchThanhvien(column, value);
        return thongTinSDs;
    }

    public void addThanhVien(ThanhVien thongTinSD) {
        thanhVienDAL.addThanhVien(thongTinSD);
    }

    public void updateThanhVien(ThanhVien thongTinSD) {
        thanhVienDAL.updateThanhVien(thongTinSD);
    }

    public void deleteThanhVien(ThanhVien thongTinSD) throws Exception {
        thanhVienDAL.deleteThanhVien(thongTinSD);
    }

    public boolean importExcel(ArrayList<ThanhVien> danhsachThanhvien) {
        int a = 0;
        for (ThanhVien thanhVien : danhsachThanhvien) {
            thanhVienDAL.mergeThanhVien(thanhVien);
            a++;
        }
        return true;
    }

    // Gọi hàm từ DAL để lấy danh sách các năm nhập học
    public List<Integer> getDistinctYears() {
        return thanhVienDAL.getDistinctYears();
    }

    public List<ThanhVien> getThanhVienByYear(int year) {
        return thanhVienDAL.getThanhVienByYear(year);
    }

    public boolean deleteThanhVienByYear(int year) {
        return thanhVienDAL.deleteThanhVienByYear(year);
    }

}

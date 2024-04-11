/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThietBi;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quang
 */
public class BLL_ThietBi {

    private DAL_ThietBi dal;

    public BLL_ThietBi() {
        dal = new DAL_ThietBi();
    }

    public List listThietBi() {
        List list = dal.listThietBi();
        return list;
    }

    public boolean addThietBi(String maTB, String tenTB, String moTaTB) {
        if (isInteger(maTB)) {
            return dal.addThietBi(Integer.parseInt(maTB), tenTB, moTaTB);
        } else {
            return false;
        }
    }

    public boolean updateThietBi(int maTB, String tenTB, String moTaTB) {
        return dal.updateThietBi(maTB, tenTB, moTaTB);
    }

    public boolean deleteThietBi(int maTB) {
        return dal.deleteThietBi(maTB);
    }

    public static boolean isInteger(String str) {
        String regex = "^-?\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}

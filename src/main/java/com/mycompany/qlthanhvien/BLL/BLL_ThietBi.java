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

    private DAL_ThietBi dal_TB;

    public BLL_ThietBi() {
        dal_TB = new DAL_ThietBi();
    }

    public List loadThietBi() {
        List list = dal_TB.loadThietBi();
        return list;
    }

    public boolean addThietBi(String maTB, String tenTB, String moTaTB) {
        if (isInteger(maTB)) {
            dal_TB.addThietBi(new ThietBi(Integer.parseInt(maTB), tenTB, moTaTB));
            return true;
        }
        return false;
    }

    public boolean updateThietBi(String maTB, String tenTB, String moTaTB) {

        if (isInteger(maTB)) {
            dal_TB.updateThietBi(new ThietBi(Integer.parseInt(maTB), tenTB, moTaTB));
            return true;
        }
        return false;
    }

    public boolean deleteThietBi(String maTB) {
        if (isInteger(maTB)) {
            ThietBi tb = dal_TB.getThietBi(Integer.parseInt(maTB));
            if (tb != null) {
                dal_TB.deleteThietBi(tb);
                return true;
            }
        }
        return false;
    }

    public ThietBi getThietBi(int MaTB) {
        ThietBi c = dal_TB.getThietBi(MaTB);
        return c;
    }

    public static boolean isInteger(String str) {
        String regex = "^-?\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

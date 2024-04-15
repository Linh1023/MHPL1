/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThongTinSuDung;
import java.util.List;

/**
 *
 * @author PC
 */
public class BLL_ThongTinSuDung {
    private DAL_ThongTinSuDung dal_TTSD;
    
    public BLL_ThongTinSuDung() {
        dal_TTSD = new DAL_ThongTinSuDung();
    }
    
    public List getThanhVienTheoTG(){
        return dal_TTSD.getThanhVienTheoTG();
    }
    
    public List getThanhVienTheoKhoa() {
        return dal_TTSD.getThanhVienTheoKhoa();
    }
    
    public List getThanhVienTheoNganh() {
        return dal_TTSD.getThanhVienTheoNganh();
    }
}

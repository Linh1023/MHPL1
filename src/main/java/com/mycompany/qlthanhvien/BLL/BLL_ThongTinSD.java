/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThongTinSD;
import java.util.List;

/**
 *
 * @author PC
 */
public class BLL_ThongTinSD {
    
    DAL_ThongTinSD dAL_ThongTinSD;
    
    public BLL_ThongTinSD () {
        dAL_ThongTinSD= new DAL_ThongTinSD();
    }
    
    public List<ThongTinSD> getThongTinSD () {
        List<ThongTinSD> thongTinSDs = dAL_ThongTinSD.getThongTinSD();
        return thongTinSDs;
    }
    public List<ThongTinSD> getListThongTinSD () {
        List<ThongTinSD> thongTinSDs = dAL_ThongTinSD.getListThongTinSD();
        return thongTinSDs;
    }
    public List<ThongTinSD> searchThongTinSD_MaTV_MaTB (String col, String value) {
        List<ThongTinSD> thongTinSDs = dAL_ThongTinSD.searchThongTinSD_MaTV_MaTB(col, value);
        return thongTinSDs;
    }
    
    public Object[][] convertListThongTinSD (List<ThongTinSD> thongTinSDs) {
        int rows = thongTinSDs.size();
        int cols = 8;
         Object[][] objectses = new Object[rows][cols];
         for (int i = 0; i<rows; i++) {
             objectses[i][0] = thongTinSDs.get(i).getMaTT();
             objectses[i][1] = thongTinSDs.get(i).getMaTV();
             objectses[i][2] = thongTinSDs.get(i).getThanhVien().getHoten();
             objectses[i][3] = thongTinSDs.get(i).getMaTB();
             objectses[i][4] = thongTinSDs.get(i).getThietBi().getTenTB();
             objectses[i][5] = thongTinSDs.get(i).getTGMuon();
             objectses[i][6] = thongTinSDs.get(i).getTGTra();
             if (objectses[i][6] == null) {
                 objectses[i][7] = "Đang mượn";
             } else {
                  objectses[i][7] = "Đã trả";
             }
         }
         return objectses;
    }
    
    public void addThongTinSD(ThongTinSD thongTinSD)
    {
       
        dAL_ThongTinSD.addThongTinSD(thongTinSD);   
        
        
    }
    public void updateThongTinSD(ThongTinSD thongTinSD)
    {
       
       dAL_ThongTinSD.updateThongTinSD(thongTinSD);
       
    }
    public void deleteThongTinSD(ThongTinSD thongTinSD)
    {
       
        dAL_ThongTinSD.deleteThongTinSD(thongTinSD);
   
    }
    
    public List getThanhVienTheoTG(){
        return dAL_ThongTinSD.getThanhVienTheoTG();
    }
    
    public List getThanhVienTheoKhoa() {
        return dAL_ThongTinSD.getThanhVienTheoKhoa();
    }
    
    public List getThanhVienTheoNganh() {
        return dAL_ThongTinSD.getThanhVienTheoNganh();
    }
    
}

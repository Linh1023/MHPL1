/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_XuLy;
import java.util.List;

/**
 *
 * @author quang
 */
public class BLL_XuLy {
  private DAL_XuLy xulyDal;

    public BLL_XuLy() {
        xulyDal = new DAL_XuLy();

    }

    public List load_xuLy() {
        List list;
        list = xulyDal.loadXuLy();
        return list;

    }

    public Object[][] convertList(List<XuLy> list) {

        int rows = list.size();
        int cols = 6;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getMaXL();
            obj[i][1] = list.get(i).getMaTV();
            obj[i][2] = list.get(i).getHinhThucSX();

            obj[i][3] = list.get(i).getSoTien();
            obj[i][4] = list.get(i).getNgayXL();
            obj[i][5] = list.get(i).getTrangThaiXL();
//            obj[i][3] = list.get(i).getListVegetable().size();
        }
        return obj;
    }

    public void newXuLy(XuLy c) {

        xulyDal.addXulY(c);
    }

    public XuLy getXuly(int XuLyId) {

        XuLy xl = xulyDal.getXuLy(XuLyId);
        return xl;

    }

    public void DeleteXuLy(XuLy c) {
        xulyDal.deleteXuly(c);
    }

    public void UpdateXuLy(XuLy c) {

        // Call DAL method to perform update (assuming it returns a boolean or throws exception on error)
     
        xulyDal.updateXuLy(c);

    }
    public List getThongKeXuLy() {
        return xulyDal.getThongKeXuLy();
    }

    public List getListDaXuLy() {
        return xulyDal.getListDaXuLy();
    }
    
    public long getTongTien(List<XuLy> list) {
        long s = 0; 
        for(int i = 0 ; i < list.size(); i++) {
            XuLy xl = (XuLy) list.get(i);
            if(xl.getSoTien() != null) {
                s += xl.getSoTien();
            }
        }
        return s;
    }
    
}

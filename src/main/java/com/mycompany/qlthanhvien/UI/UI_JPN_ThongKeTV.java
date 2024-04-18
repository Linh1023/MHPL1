/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlthanhvien.UI;

import com.mycompany.qlthanhvien.BLL.BLL_ThongTinSD;

import java.util.Date;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author quang
 */
public final class UI_JPN_ThongKeTV extends javax.swing.JPanel {

    private BLL_ThongTinSD bll_TTSD;
    private ChartPanel chartThongKeTheoThoiGian,chartThongKeTheoKhoa,chartThongKeTheoNganh;

    /**
     * Creates new form ThongKe
     */
    public UI_JPN_ThongKeTV() {
        initComponents();
        bll_TTSD = new BLL_ThongTinSD();
        createCharts();
    }
        
    public void createCharts() {
         chartThongKeTheoThoiGian = createBarChart("Thống kê số lượng thành viên vào khu học tập theo thời gian",
                                                            "Ngày",
                                                            "Số lượng", bll_TTSD.getThanhVienTheoTG());
        chartThongKeTheoThoiGian.setBounds(40, 40, 920, 300);

        chartThongKeTheoKhoa = createPieChart("Thống kê số lượng thành viên vào khu học tập theo khoa", bll_TTSD.getThanhVienTheoKhoa());
        chartThongKeTheoKhoa.setBounds(40, 350, 460, 275);
//        
        chartThongKeTheoNganh = createPieChart("Thống kê số lượng thành viên vào khu học tập theo ngành", bll_TTSD.getThanhVienTheoNganh());
        chartThongKeTheoNganh.setBounds(500, 350, 460, 275);
        this.add(chartThongKeTheoThoiGian);
        this.add(chartThongKeTheoKhoa);
        this.add(chartThongKeTheoNganh);
    }
    
    public ChartPanel createBarChart(String title, String labelCategory, String labelValue, List<Object[]> results) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            Date ngay = (Date) result[1];
            dataset.addValue(soluong, "số lượng", ngay.toString());
        }
        JFreeChart chart = ChartFactory.createBarChart(title, labelCategory, labelValue, dataset, PlotOrientation.VERTICAL, true, true, true);
        
        return new ChartPanel(chart);
    }

    public ChartPanel createPieChart(String title, List<Object[]> results) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            String key = (String) result[1];
            dataset.setValue(key, soluong);
        }
        JFreeChart chart = ChartFactory.createPieChart(title, dataset);
        return new ChartPanel(chart);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 700));

        btnUpdate.setText("Cập nhật mới nhất");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnUpdate)
                .addContainerGap(845, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdate)
                .addContainerGap(671, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        chartThongKeTheoKhoa.removeAll();
        chartThongKeTheoNganh.removeAll();
        chartThongKeTheoThoiGian.removeAll();
        
        createCharts();
         chartThongKeTheoKhoa.revalidate();
        chartThongKeTheoNganh.revalidate();
        chartThongKeTheoThoiGian.revalidate();
        chartThongKeTheoKhoa.repaint();
        chartThongKeTheoNganh.repaint();
        chartThongKeTheoThoiGian.repaint();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    // End of variables declaration//GEN-END:variables
}

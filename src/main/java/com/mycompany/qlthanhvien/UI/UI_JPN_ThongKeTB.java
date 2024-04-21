/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlthanhvien.UI;

import com.mycompany.qlthanhvien.BLL.BLL_ThietBi;
import com.mycompany.qlthanhvien.BLL.BLL_ThongTinSD;
import com.mycompany.qlthanhvien.BLL.ThietBi;
import com.mycompany.qlthanhvien.BLL.ThongTinSD;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author quang
 */
public class UI_JPN_ThongKeTB extends javax.swing.JPanel {

    private BLL_ThongTinSD bll_ttsd;
    private BLL_ThietBi bll_tb;
    ChartPanel chartPanel;

    public UI_JPN_ThongKeTB() {
        initComponents();
        bll_ttsd = new BLL_ThongTinSD();
        bll_tb = new BLL_ThietBi();
        this.add(createChartsTBDaM());
    }

    private ChartPanel createChartsTBDaM() {
        List<ThongTinSD> list = bll_ttsd.getThongTinSD();
        List<ThongTinSD> listNew = new ArrayList<>();
        for (ThongTinSD ttsd : list) {
            if (ttsd.getTGMuon() != null) {
                listNew.add(ttsd);
            }
        }
        chartPanel = createBarChartPanel("Thống kê Thiết Bị đã mượn theo thời gian", "Loại Thiết Bị",
                "Số lượng", listNew);
        chartPanel.setBounds(40, 80, 900, 580);
        return chartPanel;
    }

    private ChartPanel createChartsTBDM() {
        List<ThongTinSD> list = bll_ttsd.getThongTinSD();
        List<ThongTinSD> listNew = new ArrayList<>();
        for (ThongTinSD ttsd : list) {
            if (ttsd.getTGMuon() != null && ttsd.getTGTra() == null) {
                listNew.add(ttsd);
            }
        }
        chartPanel = createBarChartPanel("Thống kê Thiết Bị đang mượn theo thời gian", "Loại Thiết Bị",
                "Số lượng", listNew);
        chartPanel.setBounds(40, 80, 900, 580);
        return chartPanel;
    }

    private ChartPanel createChartsTB() {
        chartPanel = createBarChartPanel1("Thống kê Thiết Bị ", "Loại Thiết Bị",
                "Số lượng", bll_tb.loadThietBi());
        chartPanel.setBounds(40, 80, 900, 580);
        return chartPanel;
    }

    public ChartPanel createBarChartPanel(String title, String labelCategory, String labelValue, List<ThongTinSD> results) {
        JFreeChart chart = ChartFactory.createBarChart(title, labelCategory, labelValue, createCharset(results), PlotOrientation.VERTICAL, true, true, true);
        return new ChartPanel(chart);
    }

    private DefaultCategoryDataset createCharset(List<ThongTinSD> listItem) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Khởi tạo một mảng để đếm số lượng của từng loại thiết bị
        int[] counts = new int[7]; // Vì có 7 loại thiết bị từ 0 đến 6

// Lặp qua danh sách các mục và đếm số lượng của từng loại thiết bị
        for (ThongTinSD tb : listItem) {
            int matb = tb.getMaTB();
            int firstDigit = 0;
            // Lấy chữ số đầu tiên
            while (matb != 0) {
                firstDigit = matb % 10;
                matb = matb / 10;
            }
            // Tăng giá trị của loại thiết bị đó trong mảng
            counts[firstDigit]++;
        }

// Thêm số lượng của từng loại thiết bị vào dataset
        String[] labels = {"Chưa Phân Loại", "Micro", "Máy chiếu", "Máy ảnh", "Cassette", "Tivi", "Quạt Đứng"};
        for (int i = 0; i < counts.length; i++) {
            dataset.addValue(counts[i], "Số Lượng", labels[i]);
        }

        return dataset;
    }

    public ChartPanel createBarChartPanel1(String title, String labelCategory, String labelValue, List<ThietBi> results) {
        JFreeChart chart = ChartFactory.createBarChart(title, labelCategory, labelValue, createCharset1(results), PlotOrientation.VERTICAL, true, true, true);
        return new ChartPanel(chart);
    }

    private DefaultCategoryDataset createCharset1(List<ThietBi> listItem) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Khởi tạo một mảng để đếm số lượng của từng loại thiết bị
        int[] counts = new int[7]; // Vì có 7 loại thiết bị từ 0 đến 6

// Lặp qua danh sách các mục và đếm số lượng của từng loại thiết bị
        for (ThietBi tb : listItem) {
            int matb = tb.getMaTB();
            int firstDigit = 0;
            // Lấy chữ số đầu tiên
            while (matb != 0) {
                firstDigit = matb % 10;
                matb = matb / 10;
            }
            // Tăng giá trị của loại thiết bị đó trong mảng
            counts[firstDigit]++;
        }

// Thêm số lượng của từng loại thiết bị vào dataset
        String[] labels = {"Chưa Phân Loại", "Micro", "Máy chiếu", "Máy ảnh", "Cassette", "Tivi", "Quạt Đứng"};
        for (int i = 0; i < counts.length; i++) {
            dataset.addValue(counts[i], "Số Lượng", labels[i]);
        }

        return dataset;
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 700));

        btnUpdate.setText("Làm Mới");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thiết Bị Đã Mượn", "Thiết Bị Đang Mượn", "Tất Cả Thiết Bị" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Từ Ngày");

        jLabel2.setText("Đến Ngày");

        jButton1.setText("Xác Nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(662, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int selectedOption = jComboBox1.getSelectedIndex();
            this.remove(chartPanel);
            resettime();
            if (selectedOption == 0) {
                funcAddChart(createChartsTBDaM());
            }
            if (selectedOption == 1) {
                funcAddChart(createChartsTBDM());
            }
            if (selectedOption == 2) {
                funcAddChart(createChartsTB());
                jButton1.setEnabled(false);
            } else {
                jButton1.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    private void updateChartBasedOnSelection(Date date1, Date date2) {
        int selectedOption = jComboBox1.getSelectedIndex();
        this.remove(chartPanel);
        if (selectedOption == 0) {
            funcAddChart(createChartsTBDaM(date1, date2));
        }
        if (selectedOption == 1) {
            funcAddChart(createChartsTBDM(date1, date2));
        }
    }

    private ChartPanel createChartsTBDaM(Date date1, Date date2) {
        List<ThongTinSD> list = bll_ttsd.getThongTinSD();
        List<ThongTinSD> listNew = new ArrayList<>();
        //format ngày để hiển thị 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (ThongTinSD ttsd : list) {
            Date tgm = ttsd.getTGMuon();
            if (tgm != null) {
                if (tgm.compareTo(date1) > 0 && tgm.compareTo(date2) < 0) {
                    listNew.add(ttsd);
                }
            }
        }
        // Chuyển đổi date thành chuỗi sử dụng định dạng đã chỉ định
        String dateString = dateFormat.format(date1);
        String dateString1 = dateFormat.format(date2);

        chartPanel = createBarChartPanel("Thống kê Thiết Bị đã mượn từ " + dateString + " đến " + dateString1,
                "Loại Thiết Bị",
                "Số lượng", listNew
        );

        chartPanel.setBounds(
                40, 80, 900, 580);
        return chartPanel;
    }

    private ChartPanel createChartsTBDM(Date date1, Date date2) {
        List<ThongTinSD> list = bll_ttsd.getThongTinSD();
        List<ThongTinSD> listNew = new ArrayList<>();
        //format ngày để hiển thị 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (ThongTinSD ttsd : list) {
            Date tgm = ttsd.getTGMuon();
            Date tgt = ttsd.getTGTra();
            if (tgm != null && tgt != null) {
                if (tgm.compareTo(date1) > 0 && tgm.compareTo(date2) < 0) {
                    listNew.add(ttsd);
                }
            }
        }
        // Chuyển đổi date thành chuỗi sử dụng định dạng đã chỉ định
        String dateString = dateFormat.format(date1);
        String dateString1 = dateFormat.format(date2);
        chartPanel = createBarChartPanel("Thống kê Thiết Bị đang từ " + dateString + " đến " + dateString1, "Loại Thiết Bị",
                "Số lượng", listNew);
        chartPanel.setBounds(40, 80, 900, 580);
        return chartPanel;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date selectedDate1 = jDateChooser1.getDate();
        Date selectedDate2 = jDateChooser2.getDate();
        updateChartBasedOnSelection(selectedDate1, selectedDate2);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedOption = jComboBox1.getSelectedIndex();
        this.remove(chartPanel);
        resettime();
        if (selectedOption == 0) {
            funcAddChart(createChartsTBDaM());
        }
        if (selectedOption == 1) {
            funcAddChart(createChartsTBDM());
        }
        if (selectedOption == 2) {
            funcAddChart(createChartsTB());
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }
    }

    private void funcAddChart(ChartPanel chartPanel) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                add(chartPanel);
                revalidate();
                repaint();
            }
        });
    }

    private void resettime() {
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
    }
}

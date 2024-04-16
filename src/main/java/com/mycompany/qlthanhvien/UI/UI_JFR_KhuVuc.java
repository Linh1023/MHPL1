
import com.mycompany.qlthanhvien.BLL.BLLThanhVien;
import com.mycompany.qlthanhvien.BLL.BLL_ThongTinSuDung;
import com.mycompany.qlthanhvien.BLL.ThanhVien;
import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import com.mycompany.qlthanhvien.DAL.DAL_ThongTinSuDung;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SessionFactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class GUI_KHUVUC extends javax.swing.JFrame {
    private static SessionFactory factory;

    /**
     * Creates new form GUI_KHUVUC
     */
    public GUI_KHUVUC() {
        initComponents();
        txtSoLanVao.setEditable(false);
//        txtSoLanVao.setEnabled(false);
        
        loadListThongTin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtThemThanhVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnThemThanhVien = new javax.swing.JButton();
        jlbMaThanhVien = new javax.swing.JLabel();
        jlbHoTen = new javax.swing.JLabel();
        jlbKhoa = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbbTimKiemTheo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhuVucHocTap = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSoLanVao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNhapTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("KHOA :");

        btnThemThanhVien.setText("OKE");
        btnThemThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThanhVienActionPerformed(evt);
            }
        });

        jLabel11.setText("NHẬP THÔNG TIN :");

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("TRA CỨU THÔNG TIN ");

        cbbTimKiemTheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ Tên", "Mã TV", "Khoa" }));

        jLabel6.setText("TÌM KIẾM THEO :");

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel1.setText("KHU VỰC HỌC TẬP");

        btnTimKiem.setText("TÌM");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblKhuVucHocTap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TT", "Mã TV", "Họ Tên", "Khoa", "TG Vào"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKhuVucHocTap);

        jLabel7.setText("SỐ LẦN VÀO  :");

        txtSoLanVao.setEditable(false);
        txtSoLanVao.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("BẢNG KHU VỰC HỌC TẬP");

        txtNhapTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNhapTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("THÔNG TIN KHU VỰC");

        jLabel8.setText("MÃ THÀNH VIÊN :");

        jLabel4.setText("NHÃP MÃ THÀNH VIÊN :");

        jLabel9.setText("HỌ TÊN :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(508, 508, 508))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbTimKiemTheo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jlbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                                    .addComponent(jlbMaThanhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jlbKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(txtSoLanVao, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(btnThemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtThemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbMaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTimKiemTheo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLanVao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public  void loadListThongTin(){
           ArrayList<ThongTinSuDung> arrThongTinSuDung= new ArrayList<ThongTinSuDung>();
           BLL_ThongTinSuDung bll= new BLL_ThongTinSuDung();
           arrThongTinSuDung=(ArrayList<ThongTinSuDung>) bll.getThongTinSD();

           ArrayList<ThanhVien> arrayListThanhVien =  new ArrayList<ThanhVien>();
           BLLThanhVien bllThanhVien= new BLLThanhVien();
           arrayListThanhVien=bllThanhVien.listThanhVien();
          
           ThanhVien tvInsert = new ThanhVien();
           for (int i = 0; i<arrThongTinSuDung.size(); i++)  {
            ThongTinSuDung ttSuDung = arrThongTinSuDung.get(i);
            for(int j=0;j<arrayListThanhVien.size();j++){
                ThanhVien tv = arrayListThanhVien.get(j);
                if(tv.getMaTV()==ttSuDung.getMaTV()){
                   tvInsert = tv;
                }
            }
            Object[] newrow = {ttSuDung.getMaTT(),ttSuDung.getMaTV(),tvInsert.getHoten(),tvInsert.getKhoa(),ttSuDung.getTGVao()};
            DefaultTableModel model = (DefaultTableModel) tblKhuVucHocTap.getModel();
            model.addRow(newrow);
        }

    }
    public void deleteAllListThongTin(){
        DefaultTableModel model = (DefaultTableModel) tblKhuVucHocTap.getModel();
        model.setRowCount(0);
    }
    public boolean checkThemThanhVien(int x ){
        ArrayList<ThanhVien> arrayListThanhVien =  new ArrayList<ThanhVien>();
        BLLThanhVien bllThanhVien= new BLLThanhVien();
        arrayListThanhVien=bllThanhVien.listThanhVien();
        for(int i=0;i<arrayListThanhVien.size();i++){
            if(x==arrayListThanhVien.get(i).getMaTV()){
                return true;
            }
        }
        return false;
    }
    private void btnThemThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThanhVienActionPerformed
        // TODO add your handling code here:
        ArrayList<ThongTinSuDung> arrThongTinSuDung= new ArrayList<ThongTinSuDung>();
        BLL_ThongTinSuDung bll= new BLL_ThongTinSuDung();
        arrThongTinSuDung=(ArrayList<ThongTinSuDung>) bll.getThongTinSD();
        // tạo thông tin sử dụng mới
        ThongTinSuDung ttSuDungNew = new ThongTinSuDung();
        ttSuDungNew.setMaTB(null);
        ttSuDungNew.setMaTV(Integer.parseInt(txtThemThanhVien.getText()));
        java.util.Date date=new java.util.Date();
        ttSuDungNew.setTGVao(date);
        ttSuDungNew.setTGTra(null);
        ttSuDungNew.setTGMuon(null);
        
        if(checkThemThanhVien(Integer.parseInt(txtThemThanhVien.getText()))){
            arrThongTinSuDung.add(ttSuDungNew);
            deleteAllListThongTin();
            bll.addThongTinSD(ttSuDungNew);
            loadListThongTin();
            ArrayList<ThanhVien> arrayListThanhVien =  new ArrayList<ThanhVien>();
            BLLThanhVien bllThanhVien= new BLLThanhVien();
            arrayListThanhVien=bllThanhVien.listThanhVien();
            for(int j=0;j<arrayListThanhVien.size();j++){
                ThanhVien tv = arrayListThanhVien.get(j);
                if(tv.getMaTV()==Integer.parseInt(txtThemThanhVien.getText())){
                    jlbHoTen.setText(tv.getHoten());
                    jlbKhoa.setText(tv.getKhoa());
                    jlbMaThanhVien.setText( String. valueOf(tv.getMaTV()));
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Mã thành viên không hợp lệ");
        }
        txtThemThanhVien.setText("");
    }//GEN-LAST:event_btnThemThanhVienActionPerformed

    private void txtNhapTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNhapTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNhapTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
            if(txtNhapTimKiem.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "VUI LÒNG NHẬP TRƯỚC KHI TÌM KIẾM");
            }else{
            ArrayList<ThongTinSuDung> arrThongTinSuDung= new ArrayList<ThongTinSuDung>();
            BLL_ThongTinSuDung bll= new BLL_ThongTinSuDung();
            arrThongTinSuDung=(ArrayList<ThongTinSuDung>) bll.getThongTinSD();

            ArrayList<ThanhVien> arrayListThanhVien =  new ArrayList<ThanhVien>();
            BLLThanhVien bllThanhVien= new BLLThanhVien();
            arrayListThanhVien=bllThanhVien.listThanhVien();
            if(cbbTimKiemTheo.getSelectedIndex()==1){
                int dem=0;
                deleteAllListThongTin();
                for(int i=0;i<arrThongTinSuDung.size();i++){
                    ThongTinSuDung tv=arrThongTinSuDung.get(i);
                    ThanhVien tv1 = new ThanhVien();
                    if(tv.getMaTV()== Integer.parseInt(txtNhapTimKiem.getText())){
                        dem++;
                        for(int j=0;j<arrayListThanhVien.size();j++){
                         tv1 = arrayListThanhVien.get(j);
                         if(tv1.getMaTV()==tv.getMaTV()){
                             Object[] newrow = {tv.getMaTT(),tv.getMaTV(),tv1.getHoten(),tv1.getKhoa(),tv.getTGVao()};
                             DefaultTableModel model = (DefaultTableModel) tblKhuVucHocTap.getModel();
                             model.addRow(newrow);
                         }
                       }
                    }
                }
                txtSoLanVao.setText(String.valueOf(dem));
            }
             if(cbbTimKiemTheo.getSelectedIndex()==0){
                deleteAllListThongTin();
                txtSoLanVao.setText("");
                    for(int j=0;j<arrayListThanhVien.size();j++){
                         ThanhVien tv1 = new ThanhVien();
                         tv1 = arrayListThanhVien.get(j);
                         System.out.println(tv1.getHoten().toLowerCase().contains(txtNhapTimKiem.getText().toLowerCase()));
                         for(int i=0;i<arrThongTinSuDung.size();i++){
                             if( tv1.getHoten().toLowerCase().contains(txtNhapTimKiem.getText().toLowerCase())==true&&tv1.getMaTV()==arrThongTinSuDung.get(i).getMaTV()){
                             Object[] newrow = {arrThongTinSuDung.get(i).getMaTT(),arrThongTinSuDung.get(i).getMaTV(),tv1.getHoten(),tv1.getKhoa(),arrThongTinSuDung.get(i).getTGVao()};
                             DefaultTableModel model = (DefaultTableModel) tblKhuVucHocTap.getModel();
                             model.addRow(newrow);
                            }
                         }
                    }
             }    
             if(cbbTimKiemTheo.getSelectedIndex()==2){
                deleteAllListThongTin();
                txtSoLanVao.setText("");
                    for(int j=0;j<arrayListThanhVien.size();j++){
                         ThanhVien tv1 = new ThanhVien();
                         tv1 = arrayListThanhVien.get(j);
                         System.out.println(tv1.getHoten().toLowerCase().contains(txtNhapTimKiem.getText().toLowerCase()));
                         for(int i=0;i<arrThongTinSuDung.size();i++){
                             if( tv1.getKhoa().toLowerCase().contains(txtNhapTimKiem.getText().toLowerCase())==true&&tv1.getMaTV()==arrThongTinSuDung.get(i).getMaTV()){
                             Object[] newrow = {arrThongTinSuDung.get(i).getMaTT(),arrThongTinSuDung.get(i).getMaTV(),tv1.getHoten(),tv1.getKhoa(),arrThongTinSuDung.get(i).getTGVao()};
                             DefaultTableModel model = (DefaultTableModel) tblKhuVucHocTap.getModel();
                             model.addRow(newrow);
                            }
                         }
                    }
             }    
            }
           
        
        
    }//GEN-LAST:event_btnTimKiemActionPerformed
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtNhapTimKiem.setText("");
        txtThemThanhVien.setText("");
        txtSoLanVao.setText("");
        jlbHoTen.setText("");
                jlbKhoa.setText("");

                        jlbMaThanhVien.setText("");

        deleteAllListThongTin();
        loadListThongTin();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_KHUVUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_KHUVUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_KHUVUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_KHUVUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_KHUVUC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThemThanhVien;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbbTimKiemTheo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbHoTen;
    private javax.swing.JLabel jlbKhoa;
    private javax.swing.JLabel jlbMaThanhVien;
    private javax.swing.JTable tblKhuVucHocTap;
    private javax.swing.JTextField txtNhapTimKiem;
    private javax.swing.JTextField txtSoLanVao;
    private javax.swing.JTextField txtThemThanhVien;
    // End of variables declaration//GEN-END:variables
}

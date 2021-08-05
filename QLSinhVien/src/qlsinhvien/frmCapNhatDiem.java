/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author An
 */
public class frmCapNhatDiem extends javax.swing.JFrame {

    /**
     * Creates new form frmCapNhatDiem
     */
    public frmCapNhatDiem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        btnLuu = new javax.swing.JButton();
        btnXoaSV = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtDiem = new javax.swing.JTextField();
        jblDiem = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSuaTT = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jblTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblTitle.setText("DANH SÁCH SINH VIÊN");

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ Tên", "Điểm "
            }
        ));
        jScrollPane1.setViewportView(tbSinhVien);

        btnLuu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        btnLuu.setText("Lưu điểm");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnXoaSV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnXoaSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoaSV.setText("Xóa Sinh Viên");
        btnXoaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSVActionPerformed(evt);
            }
        });

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jblDiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblDiem.setText("Điểm");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm Sinh Viên");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSuaTT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSuaTT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update.png"))); // NOI18N
        btnSuaTT.setText("Sửa thông tin");
        btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTTActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật ");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jblTitle)
                        .addGap(44, 44, 44)
                        .addComponent(btnCapNhat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLuu)
                                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnThem)
                                    .addComponent(btnXoaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSuaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jblDiem)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jblDiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnLuu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoaSV)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaTT)
                                .addGap(18, 18, 18)
                                .addComponent(btnQuayLai)
                                .addGap(18, 18, 18)
                                .addComponent(btnThoat)))))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String maGV;
    public String getMaGV() {
        return maGV;
    }
    public void setMaGV(String MaGV) {
        this.maGV = MaGV;
    }
    
    public String tenNhom;
    public String getTenNhom() {
        return tenNhom;
    }
    public void setTenNhom(String TenNhom) {
        this.tenNhom = TenNhom;
    }
    
    public String maMon;
    public String getMaMon() {
        return maMon;
    }
    public void setMaMon(String MaMon) {
        this.maMon = MaMon;
    }
    
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if(output == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    public boolean CheckDiem(String str) {
        try {
            Float s = Float.parseFloat(str);
            if(s >= 0 && s <= 10) 
                return true;
        }catch(Exception ex) {
        }
        return false;
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            clsData.OpenConnect();
            PreparedStatement stm = clsData.con.prepareStatement("Select S.MSSV, S.HoTenSV, D.DiemSo\n" +
                                                                    "from GiangDay G join GiangVien V on G.MaGV=V.MaGV\n" +
                                                                    "join DiemMH D on G.Nhom = D.Nhom\n" +
                                                                    "join SinhVien S on D.MSSV=S.MSSV\n" +
                                                                    "where G.Nhom=? and G.MaGV=?");
            stm.setString(1, tenNhom);
            stm.setString(2, maGV);
            ResultSet rs = stm.executeQuery();
            DefaultTableModel m = new DefaultTableModel(new Object[]{"STT","MSSV","Họ Tên","Điểm"},0);
            tbSinhVien.setModel(m);
            int stt=0;
            while(rs.next()) {
                stt++;
                ((DefaultTableModel)tbSinhVien.getModel()).addRow(new Object[]{stt, rs.getString(1), rs.getString(2), rs.getFloat(3)});
            }
            clsData.CloseConnect();
        } catch (SQLException ex) {
            Logger.getLogger(frmCapNhatDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public String TinhDiemChu(Float DiemSo){
        String DiemChu = null;
        if(DiemSo >= 9 && DiemSo <= 10){
            DiemChu = "A";
        } else if (DiemSo >= 8 && DiemSo <= 8.9) {
            DiemChu = "B+";
        } else if (DiemSo >= 7 && DiemSo <= 7.9) {
            DiemChu = "B";
        } else if (DiemSo >= 6.5 && DiemSo <= 6.9) {
            DiemChu = "C+";
        } else if (DiemSo >= 5.5 && DiemSo <= 6.4) {
            DiemChu = "C";
        } else if (DiemSo >= 5 && DiemSo <= 5.4) {
            DiemChu = "D+";
        } else if (DiemSo >= 4 && DiemSo <= 4.9) {
            DiemChu = "D";
        } else {
            DiemChu = "F";
        }
        return  DiemChu;
    }
    
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        try {
            // TODO add your handling code here:
            int index = tbSinhVien.getSelectedRow();
            TableModel s = tbSinhVien.getModel();
            if(index == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng trước khi lưu!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if(CheckDiem(txtDiem.getText())) {
                    s.setValueAt(Float.parseFloat(txtDiem.getText()), index, 3);
                    clsData.OpenConnect();
                    PreparedStatement stm = clsData.con.prepareStatement("Update DiemMH set DiemSo=?, DiemChu=? where MSSV=? and Nhom=?");
                    stm.setFloat(1, Float.parseFloat(txtDiem.getText()));
                    stm.setString(2, TinhDiemChu(Float.parseFloat(txtDiem.getText())));
                    stm.setString(3, s.getValueAt(index, 1).toString());
                    stm.setString(4, tenNhom);
                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Lưu điểm thành công!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    clsData.CloseConnect();
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập lại điểm!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmCapNhatDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSVActionPerformed
        try {
            // TODO add your handling code here:
            int index = tbSinhVien.getSelectedRow();
            TableModel s = tbSinhVien.getModel();
            if(index == -1) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng trước khi xóa!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                clsData.OpenConnect();
                PreparedStatement stm = clsData.con.prepareStatement("Delete from DiemMH where MSSV=? and Nhom=?");
                stm.setString(1, s.getValueAt(index, 1).toString());
                stm.setString(2, tenNhom);
                String ten = s.getValueAt(index, 2).toString();
                ((DefaultTableModel)tbSinhVien.getModel()).removeRow(index);
                stm.executeUpdate();
                JOptionPane.showMessageDialog(this, "Đã xóa sinh viên " + ten + " thành công!", "Information", JOptionPane.INFORMATION_MESSAGE);
                clsData.CloseConnect();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmCapNhatDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaSVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        frmMSSV n = new frmMSSV();
        n.setVisible(true);
        n.setTitle("Thêm sinh viên");
        n.setMaGV(maGV);
        n.setMaMon(maMon);
        n.setNhom(tenNhom);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            clsData.OpenConnect();
            PreparedStatement stm = clsData.con.prepareStatement("Select S.MSSV, S.HoTenSV, D.DiemSo\n" +
                                                                    "from GiangDay G join GiangVien V on G.MaGV=V.MaGV\n" +
                                                                    "join DiemMH D on G.Nhom = D.Nhom\n" +
                                                                    "join SinhVien S on D.MSSV=S.MSSV\n" +
                                                                    "where G.Nhom=? and G.MaGV=?");
            stm.setString(1, tenNhom);
            stm.setString(2, maGV);
            ResultSet rs = stm.executeQuery();
            DefaultTableModel m = new DefaultTableModel(new Object[]{"STT","MSSV","Họ Tên","Điểm"},0);
            tbSinhVien.setModel(m);
            int stt=0;
            while(rs.next()) {
                stt++;
                ((DefaultTableModel)tbSinhVien.getModel()).addRow(new Object[]{stt, rs.getString(1), rs.getString(2), rs.getFloat(3)});
            }
            clsData.CloseConnect();
        } catch (SQLException ex) {
            Logger.getLogger(frmCapNhatDiem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
        int index = tbSinhVien.getSelectedRow();
        TableModel s = tbSinhVien.getModel();
        if(index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng chứa thông tin sinh viên cần chỉnh sửa!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            frmThongTin n = new frmThongTin();
            n.setTitle("Thông tin sinh viên");
            n.setVisible(true);
            n.setBtnUp(false);
            n.loadTT(s.getValueAt(index, 1).toString());
        }
    }//GEN-LAST:event_btnSuaTTActionPerformed
   
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
            java.util.logging.Logger.getLogger(frmCapNhatDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCapNhatDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSuaTT;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaSV;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblDiem;
    private javax.swing.JLabel jblTitle;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables
}
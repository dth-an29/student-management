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

/**
 *
 * @author An
 */
public class frmMainSV extends javax.swing.JFrame {

    /**
     * Creates new form frmMainSV
     */
    public frmMainSV() {
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

        jlbTitle = new javax.swing.JLabel();
        jblMaSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        jlbHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jlbGioiTinh = new javax.swing.JLabel();
        txtGioiTinh = new javax.swing.JTextField();
        jlbLop = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jblNganhHoc = new javax.swing.JLabel();
        txtNganhHoc = new javax.swing.JTextField();
        jblKhoaHoc = new javax.swing.JLabel();
        txtKhoaHoc = new javax.swing.JTextField();
        jblKhoa = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        btnXemDiem = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlbTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbTitle.setText("THÔNG TIN SINH VIÊN");

        jblMaSV.setText("Mã SV");

        jlbHoTen.setText("Họ tên");

        jblNgaySinh.setText("Ngày sinh");

        jlbGioiTinh.setText("Giới tính");

        jlbLop.setText("Lớp");

        jblNganhHoc.setText("Ngành học");

        jblKhoaHoc.setText("Khóa học");

        jblKhoa.setText("Khoa");

        btnXemDiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnXemDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Listed.png"))); // NOI18N
        btnXemDiem.setText("Xem kết quả học tập");
        btnXemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDiemActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jlbTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblMaSV)
                                    .addComponent(jlbHoTen)
                                    .addComponent(jblNgaySinh)
                                    .addComponent(jlbGioiTinh)
                                    .addComponent(jlbLop)
                                    .addComponent(jblNganhHoc)
                                    .addComponent(jblKhoaHoc)
                                    .addComponent(jblKhoa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtLop, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh)
                                    .addComponent(txtNganhHoc)
                                    .addComponent(txtKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXemDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(btnDangXuat)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblMaSV)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHoTen)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNgaySinh)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbGioiTinh)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLop)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNganhHoc)
                    .addComponent(txtNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblKhoaHoc)
                    .addComponent(txtKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblKhoa)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String MaDN;
    public String getMaDN() {
        return MaDN;
    }
    public void setMaDN(String maDn) {
        this.MaDN = maDn;
    }

    public void EnableText(boolean a) {
        txtGioiTinh.enable(a);
        txtHoTen.enable(a);
        txtKhoa.enable(a);
        txtKhoaHoc.enable(a);
        txtLop.enable(a);
        txtMSSV.enable(a);
        txtNganhHoc.enable(a);
        txtNgaySinh.enable(a);
    }
      
    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        int output = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if( output == JOptionPane.YES_OPTION) {
            this.hide();
            frmDangNhap m = new frmDangNhap();
            m.setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        EnableText(false);
        try {
            clsData.OpenConnect();
            PreparedStatement stm = clsData.con.prepareStatement("Select * from SinhVien where MSSV=?");
            stm.setString(1, MaDN);
            ResultSet rs = stm.executeQuery();
            //System.out.println(MaDN);
            while(rs.next()) {
                txtMSSV.setText(rs.getString(1));
                txtHoTen.setText(rs.getString(2));
                txtNgaySinh.setText(rs.getDate(3).toString());
                if(rs.getByte(4) == 1) {
                    txtGioiTinh.setText("Nam");
                } else {
                    txtGioiTinh.setText("Nữ");
                }
                txtLop.setText(rs.getString(5));
                txtNganhHoc.setText(rs.getString(6));
                txtKhoaHoc.setText(rs.getString(7));
                txtKhoa.setText(rs.getString(8));
            }
            clsData.CloseConnect();
        } catch (SQLException ex) {
            Logger.getLogger(frmMainSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnXemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDiemActionPerformed
        // TODO add your handling code here:
        frmDiem frmDiem = new frmDiem();
        frmDiem.setVisible(true);
        frmDiem.setMssv(txtMSSV.getText());
        frmDiem.setTitle(txtHoTen.getText());
    }//GEN-LAST:event_btnXemDiemActionPerformed

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
            java.util.logging.Logger.getLogger(frmMainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainSV().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnXemDiem;
    private javax.swing.JLabel jblKhoa;
    private javax.swing.JLabel jblKhoaHoc;
    private javax.swing.JLabel jblMaSV;
    private javax.swing.JLabel jblNganhHoc;
    private javax.swing.JLabel jblNgaySinh;
    private javax.swing.JLabel jlbGioiTinh;
    private javax.swing.JLabel jlbHoTen;
    private javax.swing.JLabel jlbLop;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtKhoaHoc;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNganhHoc;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}

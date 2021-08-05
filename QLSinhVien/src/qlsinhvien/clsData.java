/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author An
 */
public class clsData {
    public static Connection con;
    
    public static void OpenConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-MUEEJ9K\\SQLEXPRESS:1433;databaseName=QLSinhVien;user=sa;password=290222");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(clsData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CloseConnect() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(clsData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

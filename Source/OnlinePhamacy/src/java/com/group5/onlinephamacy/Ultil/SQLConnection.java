/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group5.onlinephamacy.Ultil;

/**
 *
 * @author Chung
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnection {
    public static Connection getConnection() {
        Connection con = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=eProject2";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "sa", "13121993");
        } catch (SQLException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}

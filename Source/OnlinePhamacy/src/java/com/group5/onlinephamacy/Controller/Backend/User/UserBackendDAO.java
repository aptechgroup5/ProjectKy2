/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group5.onlinephamacy.Controller.Backend.User;

import com.group5.onlinephamacy.Ultil.SQLConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chung
 */
public class UserBackendDAO {

    public static boolean vnk_CheckLogin_Backend(String Username, String Password) {
        try {
            String SQL = "SELECT Username FROM vnk_User WHERE Username = ? AND Password = ? AND Role = 1";
            PreparedStatement ps = SQLConnection.getConnection().prepareStatement(SQL);
            ps.setString(1, Username);
            ps.setString(2, Password);
            ResultSet rs1 = ps.executeQuery();
            if (rs1.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserBackendDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

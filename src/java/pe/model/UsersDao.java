/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.utils.DbUtils;

/**
 *
 * @author Computing Fundamental - HCM Campus
 */
public class UsersDao {
    //-----            your code here   --------------------------------
    private static final String LOGIN = "SELECT * FROM tblUsers WHERE userName=? AND password=? ";

    public UsersDto checkLogin(String userID, String password) throws SQLException {
        UsersDto user = null;
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(LOGIN);
                ptm.setString(1, userID);
                ptm.setString(2, password);
                rs = ptm.executeQuery();
                if (rs.next()) {
                    String fullName = rs.getString("fullName");
                    user = new UsersDto(userID, fullName, "***", 0);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }
}

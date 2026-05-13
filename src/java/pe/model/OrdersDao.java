/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.utils.DbUtils;

/**
 *
 * @author Computing Fundamental - HCM Campus
 */
public class OrdersDao {
    //-----            your code here   --------------------------------

    Connection connection;
    PreparedStatement ps;
    ResultSet rs;

    public List<OrdersDto> getAllByIdAndName(String description) {
        List<OrdersDto> OrdersList = new ArrayList<OrdersDto>();
        OrdersDto product;
        String sql = "SELECT * FROM tblOrders WHERE orderID LIKE ?;";
        try {
            connection = DbUtils.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, '%' + description + '%');

            rs = ps.executeQuery();
            while (rs.next()) {
                product = new OrdersDto(
                        rs.getString("orderID"),
                        rs.getDate("oderDate"),
                        rs.getString("customer"),
                        rs.getString("address"),
                        rs.getFloat("totalAmount"),
                        rs.getInt("status")
                );

                OrdersList.add(product);
            }
        } catch (Exception ex) {
        }

        return OrdersList;
    }
}

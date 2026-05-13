/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

import java.util.Date;

/**
 *
 * @author Computing Fundamental - HCM Campus
 */
public class OrdersDto {
    //-----            your code here   --------------------------------
    private String orderID;
    private Date orderDate;
    private String customer;
    private String address;
    private double totalAmount;
    private int status;

    public OrdersDto() {
    }

    public OrdersDto(String orderID, Date orderDate, String customer, String address, double totalAmount, int status) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customer = customer;
        this.address = address;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdersDto{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", customer=" + customer + ", address=" + address + ", totalAmount=" + totalAmount + ", status=" + status + '}';
    }
    
    
}

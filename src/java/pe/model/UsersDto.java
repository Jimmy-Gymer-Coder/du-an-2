/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

/**
 *
 * @author Computing Fundamental - HCM Campus
 */
public class UsersDto {
    //-----            your code here   --------------------------------
    private String userName;
    private String fullName;
    private String password;
    private int role;

    public UsersDto() {
    }

    public UsersDto(String userName, String fullName, String password, int role) {
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UsersDto{" + "userName=" + userName + ", fullName=" + fullName + ", password=" + password + ", role=" + role + '}';
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

public class UserSession {
    private static UserSession instance;
    private int userId;
    private String userRole;
    
    private UserSession() {
    }
    
    public static UserSession getInstance() {
        if(instance == null) {
            instance = new UserSession();
        }
        return instance;
    }
    
    // Getters and Setters
    public void setUserId(int userId) { this.userId = userId; }
    public void setUserRole(String userRole) { this.userRole = userRole; }
    
    public int getUserId() { return userId; }
    public String getUserRole() { return userRole; }
    
    public void clearSession() {
        userId = 0;
        userRole = null;
        instance = null;
    }
}

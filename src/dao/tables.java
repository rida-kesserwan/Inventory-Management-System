/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ridzi
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(50),name varchar(200),mobileNumber varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50))");
//            st.executeUpdate("insert into appuser(userRole,name,mobileNumber,email,password,address,status) values('SuperAdmin','Super Admin','03100200','admin@admin.com','admin123','adminstreet','true') ");
//            st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(200))");
//            st.executeUpdate("CREATE TABLE product ("
//    + "product_pk INT AUTO_INCREMENT PRIMARY KEY, "
//    + "name VARCHAR(200), "
//    + "quantity INT, "
//    + "price NUMERIC(10, 2), "
//    + "description VARCHAR(500), "
//    + "category_fk INT, "
//    + "FOREIGN KEY (category_fk) REFERENCES category(category_pk))");
//            st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,name varchar(200),mobileNumber varchar(50),email varchar(200))");
st.executeUpdate("CREATE TABLE OrderDetails ("
                + "order_pk INT AUTO_INCREMENT PRIMARY KEY, "
                + "orderId VARCHAR(200) NOT NULL UNIQUE, "
                + "orderDate DATE NOT NULL, "
                + "totalPaid DECIMAL(10,2) NOT NULL, "
                + "customer_fk INT NOT NULL, "
                + "FOREIGN KEY (customer_fk) REFERENCES Customer(customer_pk) ,"
                + "user_fk INT NOT NULL, "
                + "FOREIGN KEY (user_fk) REFERENCES appuser(appuser_pk))");

            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }
        }
    }
}

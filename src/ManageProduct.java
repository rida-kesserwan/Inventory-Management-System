/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.ConnectionProvider;
import java.awt.Color;
import java.sql.*;
import javax.swing.table.TableModel;

public class ManageProduct extends javax.swing.JFrame {

    private int productPk = 0;
    private double totalQuantity = 0;

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        setLocationRelativeTo(null);
        Color bg = new Color(216, 121, 210);
        getContentPane().setBackground(bg);
    }

    private void getAllCategory() {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            comboBoxCategory.removeAllItems();
            while (rs.next()) {
                comboBoxCategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtQuantity.getText().equals("") && !txtDescription.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Manage Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Description", "Category ID", "Category"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        tableProduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableProductComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 512));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 37, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 330, -1));

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 330, -1));

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuantity.setText("Quantity");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 330, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 37, -1));

        txtDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 330, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Category");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, -1, -1));

        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 330, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 850, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        getAllCategory();
        DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product inner join category on product.category_fk = category.category_pk");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("quantity"), rs.getString("price"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        tableProduct.setDefaultEditor(Object.class, null);
    }//GEN-LAST:event_formComponentShown

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index, 0).toString();
        productPk = Integer.parseInt(id);
        String name = model.getValueAt(index, 1).toString();
        txtName.setText(name);
        String quantity = model.getValueAt(index, 2).toString();
        totalQuantity = 0;
        lblQuantity.setText("Add Quantity");
        totalQuantity = Double.parseDouble(quantity);

        String price = model.getValueAt(index, 3).toString();
        txtPrice.setText(price);
        String description = model.getValueAt(index, 4).toString();
        txtDescription.setText(description);
        comboBoxCategory.removeAllItems();
        String categoryID = model.getValueAt(index, 5).toString();
        String categoryName = model.getValueAt(index, 6).toString();
        comboBoxCategory.addItem(categoryID + "-" + categoryName);

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            while (rs.next()) {
                if (Integer.parseInt(categoryID) != rs.getInt(1)) {
                    comboBoxCategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableProductMouseClicked

    private void tableProductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableProductComponentShown

    }//GEN-LAST:event_tableProductComponentShown

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into product (name,quantity,price,description,category_fk) values (?,?,?,?,?)");
                ps.setString(1, name);
                ps.setString(2, quantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Added Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = txtName.getText();
        String quantity = txtQuantity.getText();
        String price = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        String categoryId[] = category.split("-", 0);
        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                if (!quantity.equals("")) {
                    totalQuantity = totalQuantity + Double.parseDouble(quantity);
                    System.out.println(totalQuantity);
                }
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
                ps.setString(1, name);
                ps.setDouble(2, totalQuantity);
                ps.setString(3, price);
                ps.setString(4, description);
                ps.setString(5, categoryId[0]);
                ps.setInt(6, productPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Updated Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        setVisible(false);
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + txtName.getText() + "?", "Select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                int index = tableProduct.getSelectedRow();
                TableModel model = tableProduct.getModel();
                String id = model.getValueAt(index, 0).toString();
                productPk = Integer.parseInt(id);
                System.out.println(productPk);
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("DELETE FROM product WHERE product_pk=?");
                ps.setInt(1, productPk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Deleted Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed

    }//GEN-LAST:event_comboBoxCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.DbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AJ
 */
public class CreateForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public CreateForm() {
        initComponents();
        DuplicateCheck();
    }
    
        Color sidecolor = new Color(102,0,0);
        Color headcolor = new Color(255,0,0);
        Color bodycolor = new Color(153,0,0);
    
    public static String emails,usname;
    
    public boolean DuplicateCheck(){
        DbConnector dbc = new DbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE username = '" + uname.getText() + "' AND user_email = '" + email.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                emails=resultSet.getString("user_email");
                System.out.println(""+emails);
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used","Enter Another Email", JOptionPane.WARNING_MESSAGE);
                    email.setText("");
                }
                usname=resultSet.getString("username");
                if(usname.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used","Enter Another Username", JOptionPane.WARNING_MESSAGE);
                    uname.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    
        public boolean updateCheck(){
        DbConnector dbc = new DbConnector(); 
        try{
            String query = "SELECT * FROM tbl_user  WHERE (username = '"+uname.getText()+"'OR user_email ='"+email.getText()+"')AND user_id !='"+uid.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                emails=resultSet.getString("user_email");
                System.out.println(""+emails);
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used","Enter Another Email", JOptionPane.WARNING_MESSAGE);
                    email.setText("");
                }
                usname=resultSet.getString("username");
                if(usname.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used","Enter Another Username", JOptionPane.WARNING_MESSAGE);
                    uname.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        acctype = new javax.swing.JComboBox<>();
        stats = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create an Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Firstname         :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 110, 110, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Lastname         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 150, 110, 30);

        lname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(lname);
        lname.setBounds(200, 150, 220, 30);

        fname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(fname);
        fname.setBounds(200, 110, 220, 30);

        email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(email);
        email.setBounds(200, 190, 220, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Email               :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 190, 110, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("User Status       :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 350, 110, 30);

        pass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(pass);
        pass.setBounds(200, 270, 220, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Username         :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 230, 110, 30);

        uname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(uname);
        uname.setBounds(200, 230, 220, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Password          :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 270, 110, 30);

        acctype.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        acctype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        jPanel1.add(acctype);
        acctype.setBounds(200, 310, 220, 30);

        stats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactivate", "Pending" }));
        stats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statsActionPerformed(evt);
            }
        });
        jPanel1.add(stats);
        stats.setBounds(200, 350, 220, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Account Type    :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 310, 120, 30);

        uid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        uid.setEnabled(false);
        jPanel1.add(uid);
        uid.setBounds(200, 70, 220, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("User ID            :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 70, 110, 30);

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(90, 400, 80, 30);

        cancel.setBackground(new java.awt.Color(153, 153, 153));
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(90, 440, 80, 30);

        refresh.setBackground(new java.awt.Color(153, 153, 153));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        jPanel1.add(refresh);
        refresh.setBounds(310, 440, 90, 30);

        update.setBackground(new java.awt.Color(153, 153, 153));
        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("Update");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(200, 400, 90, 30);

        delete.setBackground(new java.awt.Color(153, 153, 153));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(310, 400, 90, 30);

        clear.setBackground(new java.awt.Color(153, 153, 153));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(200, 440, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statsActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked

        if(fname.getText().isEmpty()||lname.getText().isEmpty()||email.getText().isEmpty()
            ||uname.getText().isEmpty()||pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above","Warning", JOptionPane.WARNING_MESSAGE);
            pass.setText("");
        }else if(DuplicateCheck()){
            System.out.println("Duplicate Exist!");
        }

        else{
            DbConnector dbc = new DbConnector();

            if(dbc.insertData("INSERT INTO tbl_user (user_firstname, user_lastname, user_email, username, password, user_account, user_status) "
                + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+email.getText()+"', '"+uname.getText()+"', '"+pass.getText()+"', '"+acctype.getSelectedItem()+"',)"))
        {
            JOptionPane.showMessageDialog(null, "Registration Success","Success", JOptionPane.INFORMATION_MESSAGE);
            AdminForm ad = new AdminForm();
            ad.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error","Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||email.getText().isEmpty()
            ||uname.getText().isEmpty()||pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required","Warning", JOptionPane.WARNING_MESSAGE);
        }else if(pass.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above","Warning", JOptionPane.WARNING_MESSAGE);
            pass.setText("");
        }else if(updateCheck()){
            System.out.println("Update Exist!");
        }else{
            DbConnector dbc = new DbConnector();

            if(dbc.insertData("INSERT INTO tbl_user (user_firstname, user_lastname, user_email, username, password, user_account, user_status) "
                + "VALUES ('"+fname.getText()+"', '"+lname.getText()+"', '"+email.getText()+"', '"+uname.getText()+"', '"+pass.getText()+"', '"+acctype.getSelectedItem()+"', '"+stats.getSelectedItem()+"')"))
        {
            JOptionPane.showMessageDialog(null, "Registration Success","Success", JOptionPane.INFORMATION_MESSAGE);
            AdminForm ad = new AdminForm();
            ad.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error","Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_addActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        
    }//GEN-LAST:event_cancelMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||email.getText().isEmpty()
             ||uname.getText().isEmpty()||pass.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "All fields are required","Warning", JOptionPane.WARNING_MESSAGE);
         }else if(pass.getText().length()<8){
             JOptionPane.showMessageDialog(null, "Password character should be 8 above","Warning", JOptionPane.WARNING_MESSAGE);
             pass.setText("");
         }else if(updateCheck()){
             System.out.println("Update Exist!");
         }else{
        
       DbConnector dbc=new DbConnector();
       dbc.updateData("UPDATE tbl_user SET user_firstname='"+fname.getText()+"',user_lastname='"+lname.getText()+"',"
               +"user_email='"+email.getText()+"',username='"+uname.getText()+"',"
                   +"password='"+pass.getText()+"',user_account='"+acctype.getSelectedItem()+"',"
                       + "user_status='"+stats.getSelectedItem()+"'WHERE user_id='"+uid.getText()+"'");
            JOptionPane.showMessageDialog(null, "Update Successfully","Success", JOptionPane.INFORMATION_MESSAGE);
            AdminForm ad = new AdminForm();
            ad.setVisible(true);
            this.dispose();
         }
       
    }//GEN-LAST:event_updateActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseClicked

    private void cancel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel3ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
            AdminForm ad = new AdminForm();
            ad.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
    
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
            java.util.logging.Logger.getLogger(CreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> acctype;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField pass;
    private javax.swing.JButton refresh;
    public javax.swing.JComboBox<String> stats;
    public javax.swing.JTextField uid;
    public javax.swing.JTextField uname;
    public javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

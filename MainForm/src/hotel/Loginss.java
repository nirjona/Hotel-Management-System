/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.opencsv.CSVReader;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class Loginss extends javax.swing.JFrame {
    
    /**
     * Creates new form Loginss
     */
    public Loginss() {
        initComponents();
       
        this.setLocationRelativeTo(null);

          
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        Resetbutton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 430));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 330));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("User Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        username.setMinimumSize(new java.awt.Dimension(0, 26));
        username.setPreferredSize(new java.awt.Dimension(0, 26));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        password.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 51)));
        password.setMinimumSize(new java.awt.Dimension(0, 26));
        password.setPreferredSize(new java.awt.Dimension(0, 26));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(0, 0, 51));
        LoginButton.setText("Log In");
        LoginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LoginButton.setMaximumSize(new java.awt.Dimension(41, 19));
        LoginButton.setMinimumSize(new java.awt.Dimension(41, 19));
        LoginButton.setPreferredSize(new java.awt.Dimension(41, 19));
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 40));

        Resetbutton.setBackground(new java.awt.Color(255, 255, 255));
        Resetbutton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Resetbutton.setForeground(new java.awt.Color(0, 0, 51));
        Resetbutton.setText("Reset");
        Resetbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResetbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResetbuttonMouseExited(evt);
            }
        });
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 90, 40));

        Exitbutton.setBackground(new java.awt.Color(255, 255, 255));
        Exitbutton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        Exitbutton.setForeground(new java.awt.Color(0, 0, 51));
        Exitbutton.setText("Exit");
        Exitbutton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitbuttonMouseExited(evt);
            }
        });
        jPanel1.add(Exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Sign In");
        jLabel4.setMaximumSize(new java.awt.Dimension(123, 39));
        jLabel4.setMinimumSize(new java.awt.Dimension(123, 39));
        jLabel4.setPreferredSize(new java.awt.Dimension(123, 39));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Don't have any account?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 180, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Sign Up");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 440, 430));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(286, 336));
        jPanel2.setPreferredSize(new java.awt.Dimension(286, 336));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/receptionist.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 430));

        setSize(new java.awt.Dimension(767, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    boolean validdd(String str){
       // System.out.println("waaaa");
      for (int i=0; i<str.length();i++){
         // System.out.println(str.charAt(i)); 
         if(str.charAt(i)=='#' || str.charAt(i)=='$')
         {
           return false;
         }
      }
      return true;
    
    }
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        
       // if(username.getText().trim().equals("") && password.getText().trim().equals("")){
         //   JOptionPane.showMessageDialog(this, "Please fill up Username and Password!", "Error", JOptionPane.ERROR_MESSAGE);
        
      //  else if(username.getText().trim().equals("")){
            try {
                if(!validdd(username.getText())){
                 
                  throw new OverrallException("Username Can not be Accepted",this);
                }
            } catch (OverrallException ex) {
                //Logger.getLogger(Loginss.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
                        
            
            }
        /* if(username.getText().trim().equals("") && password.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill up Username and Password!", "Error", JOptionPane.ERROR_MESSAGE);   
         } 
         else if(username.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill up Username!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         */
        if(password.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please fill up Password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int p = new ForError().File_csv(username.getText(), password.getText());
              

           if(p==1){
              new MainForm().setVisible(true);
              dispose();
           }                
            
            else{
               JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }

        
        
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void ExitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMouseClicked
                      System.exit(0);        
    }//GEN-LAST:event_ExitbuttonMouseClicked

    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
      username.setText(null);
      password.setText(null);
    }//GEN-LAST:event_ResetbuttonActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new signupform().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
         LoginButton.setForeground(Color.black);
        LoginButton.setBackground(Color.white); 
       LoginButton.setBorderPainted(false);
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        LoginButton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        LoginButton.setForeground(Color.white);
         LoginButton.setBackground(new Color(0,0,51));// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonMouseExited

    private void ResetbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetbuttonMouseEntered
         Resetbutton.setForeground(Color.black);
        Resetbutton.setBackground(Color.white); 
       Resetbutton.setBorderPainted(false);
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        Resetbutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_ResetbuttonMouseEntered

    private void ResetbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetbuttonMouseExited
        Resetbutton.setForeground(Color.white);
         Resetbutton.setBackground(new Color(0,0,51));// TODO add your handling code here:
    }//GEN-LAST:event_ResetbuttonMouseExited

    private void ExitbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMouseEntered
        Exitbutton.setForeground(Color.black);
        Exitbutton.setBackground(Color.white); 
       Exitbutton.setBorderPainted(false);
        Border border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        Exitbutton.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_ExitbuttonMouseEntered

    private void ExitbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMouseExited
         Exitbutton.setForeground(Color.white);
          Exitbutton.setBackground(new Color(0,0,51));// TODO add your handling code here:
    }//GEN-LAST:event_ExitbuttonMouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Border signup_border = BorderFactory.createMatteBorder(1,1,1,1,Color.blue);
        jLabel6.setBorder(signup_border);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        Border signup_border = BorderFactory.createMatteBorder(0,0,1,0,Color.blue);
       jLabel6.setBorder(signup_border);  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(Loginss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbutton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton Resetbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Prankur Agarwal
 */
public class Doctor_Update extends javax.swing.JFrame {

    /**
     * Creates new form Doctor_Update
     */
    public Doctor_Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jLabel2.setText("Charge per visit:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jButton2.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 283, 93, 44));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 175, 177, -1));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 88, 177, -1));

        jButton4.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(225, 0, 0));
        jButton4.setText("Discard");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 283, -1, 44));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jLabel1.setText("Doctor Number:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 129, 31));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 133, 177, -1));

        jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 55, 85, -1));

        jButton1.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jButton1.setText("Get Doctor Number");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 283, -1, 44));

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jLabel3.setText("Education:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTextField4.setToolTipText("Please enter the name in small letters.");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 50, 177, -1));

        jList1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 48, 113, 201));

        jLabel4.setFont(new java.awt.Font("Bradley Hand ITC", 1, 16)); // NOI18N
        jLabel4.setText("Specialization:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 138, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Doctor_Update.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        setSize(new java.awt.Dimension(507, 348));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField4.getText().isEmpty() || jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) {
            jButton2.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Please enter the values in the empty spaces.");
        } else if (Integer.parseInt(jTextField3.getText()) > 1800) {
            JOptionPane.showMessageDialog(this, "Please enter economical charges per visit.");
            jTextField3.setText("");
        } else if (Integer.parseInt(jTextField3.getText()) < 300) {
            JOptionPane.showMessageDialog(this, "Please enter correct charges per visit.");
            jTextField3.setText("");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Do you want to update the data?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == 0) {
                try {
                    String d_name = jTextField4.getText();
                    String edu = jTextField1.getText();
                    String spe = jTextField2.getText();
                    String charge = jTextField3.getText();
                    String dno = (String) jList1.getSelectedValue();
                    Class.forName("java.sql.DriverManager");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mrproject", "root", "");
                    Statement s = (Statement) con.createStatement();
                    if (!(jTextField4.getText().isEmpty())) {
                        String q1 = "UPDATE doctor SET d_name='" + d_name + "' WHERE dno='" + dno + "';";
                        s.executeUpdate(q1);
                    }
                    if (!(jTextField1.getText().isEmpty())) {
                        String q1 = "UPDATE doctor SET edu='" + edu + "' WHERE dno='" + dno + "';";
                        s.executeUpdate(q1);
                    }
                    if (!(jTextField2.getText().isEmpty())) {
                        String q1 = "UPDATE doctor SET specialization='" + spe + "' WHERE dno='" + dno + "';";
                        s.executeUpdate(q1);
                    }
                    if (!(jTextField3.getText().isEmpty())) {
                        String q1 = "UPDATE doctor SET charge='" + charge + "' WHERE dno='" + dno + "';";
                        s.executeUpdate(q1);
                    }
                    JOptionPane.showMessageDialog(this, "Data update Successful...");
                    jTextField1.setEditable(false);
                    jTextField2.setEditable(false);
                    jTextField4.setEditable(false);
                    jTextField3.setEditable(false);
                    jTextField3.setText("");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField4.setText("");
                    jButton2.setEnabled(false);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
            } else {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char kc = evt.getKeyChar();
        if (!((kc >= '0' && kc <= '9') || (kc == KeyEvent.VK_BACK_SPACE) || (kc == KeyEvent.VK_DELETE))) {
            JOptionPane.showMessageDialog(this, "Please enter the correct charges to be taken per visit.");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char kc = evt.getKeyChar();
        if (!((kc >= 'a' && kc <= 'z') || (kc == KeyEvent.VK_BACK_SPACE) || (kc == KeyEvent.VK_DELETE) || (kc >= 'A' && kc <= 'Z') || (kc == '.'))) {
            JOptionPane.showMessageDialog(this, "Please enter the correct education");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char kc = evt.getKeyChar();
        if (!((kc >= 'a' && kc <= 'z') || (kc == KeyEvent.VK_BACK_SPACE) || (kc == KeyEvent.VK_DELETE))) {
            JOptionPane.showMessageDialog(this, "Please enter the correct specialization.");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel list = (DefaultListModel) jList1.getModel();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mrproject", "root", "");
            Statement s = (Statement) con.createStatement();
            String q = "SELECT dno FROM doctor ;";
            ResultSet rs = s.executeQuery(q);
            if (rs.next()) {
                rs.previous();
                while (rs.next()) {
                    String dno = rs.getString("dno");
                    list.addElement(dno);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No record found...");
            }
        } catch (Exception ea) {
            JOptionPane.showMessageDialog(this, ea.getMessage());
        }
        jList1.setSelectedIndex(0);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        char kc = evt.getKeyChar();
        if (!((kc >= 'a' && kc <= 'z') || (kc == KeyEvent.VK_BACK_SPACE) || (kc == KeyEvent.VK_DELETE) || (kc == '.'))) {
            JOptionPane.showMessageDialog(this, "Please enter correct the name.");
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        if (jList1.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a doctor number.");
        } else {
            jButton2.setEnabled(true);
            try {
                jButton2.setEnabled(true);
                jTextField1.setEditable(true);
                jTextField2.setEditable(true);
                jTextField4.setEditable(true);
                jTextField3.setEditable(true);
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mrproject", "root", "");
                Statement s = (Statement) con.createStatement();
                String dno = (String) jList1.getSelectedValue();
                String q1 = "SELECT d_name,edu,specialization,charge FROM doctor WHERE dno='" + dno + "';";
                ResultSet rs = s.executeQuery(q1);
                if (rs.next()) {
                    jTextField1.setText(rs.getString("edu"));
                    jTextField4.setText(rs.getString("d_name"));
                    jTextField2.setText(rs.getString("specialization"));
                    jTextField3.setText(rs.getString("charge"));
                }
            } catch (Exception ae) {
                JOptionPane.showMessageDialog(this, ae.getMessage());
            }
        }
    }//GEN-LAST:event_jList1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Doctor_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

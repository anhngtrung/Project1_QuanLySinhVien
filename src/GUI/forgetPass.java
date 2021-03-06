/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.SVNCApp;
import App.SVTCApp;
import App.SendMail;
import Object.SVNC;
import Object.SVTC;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class forgetPass extends javax.swing.JFrame {

    /**
     * Creates new form forgetPass
     */
    public forgetPass() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        selectHeSV = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xác nhận mật khẩu");

        jLabel2.setText("Enter your ID to receive new password in your email");

        jLabel3.setText("ID");

        textID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIDKeyPressed(evt);
            }
        });

        btnSubmit.setText("submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setText("Hệ sinh viên");

        selectHeSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tín chỉ", "Niên chế" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectHeSV, 0, 151, Short.MAX_VALUE)
                            .addComponent(textID))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectHeSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        SendMail sendmail = new SendMail();
        String newPass = sendmail.randomString();
        String mailSV = "";
        if (textID.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "ID không được để trống", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (selectHeSV.getSelectedItem().toString().contains("Tín chỉ")) {
                SVTCApp svtc = new SVTCApp();
                ArrayList<SVTC> list = svtc.loadFile();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(textID.getText())) {
                        list.get(i).setPassword(newPass);
                        mailSV = list.get(i).getEmail();
                        svtc.saveFile(list);
                        break;
                    }
                }
            } else {
                SVNCApp svnc = new SVNCApp();
                ArrayList<SVNC> list = svnc.loadFile();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(textID.getText())) {
                        list.get(i).setPassword(newPass);
                        mailSV = list.get(i).getEmail();
                        svnc.saveFile(list);
                        break;
                    }
                }
            }

            if (sendmail.sendmail(mailSV, newPass)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu mới của bạn đã được gửi về email sinh viên của bạn\n"
                        + "Vui lòng kiểm tra mail và xác nhận lại mật khẩu", "Xác nhận thay đổi mật khẩu", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi email xác nhận", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void textIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIDKeyPressed
        textID.setText(textID.getText());
    }//GEN-LAST:event_textIDKeyPressed

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
            java.util.logging.Logger.getLogger(forgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> selectHeSV;
    private javax.swing.JTextField textID;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import App.QLLHT;
import static GUI.Login.idLogin;
import Object.SubjectClass;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StudentDKLHT extends javax.swing.JFrame {

    /**
     * Creates new form QLHP
     */
    QLLHT dklh = new QLLHT();
    ArrayList<SubjectClass> listLHSVDK = dklh.loadLHSVDK(idLogin);

    public StudentDKLHT() {
        initComponents();
        showSubjectList(listLHSVDK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textMaHP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textIDLopHoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textBatDau = new javax.swing.JTextField();
        textTietKT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        selectThu = new javax.swing.JComboBox<>();
        textClassRoom = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DKLH = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setTitle("Đăng ký lớp học");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Mã HP");

        textMaHP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMaHPMouseReleased(evt);
            }
        });
        textMaHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textMaHPKeyPressed(evt);
            }
        });

        jLabel2.setText("Mã lớp học");

        textIDLopHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textIDLopHocKeyPressed(evt);
            }
        });

        jLabel3.setText("Phòng học");

        jLabel4.setText("Thứ");

        jLabel5.setText("Tiết bắt đầu");

        textBatDau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textBatDauKeyPressed(evt);
            }
        });

        textTietKT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textTietKTKeyPressed(evt);
            }
        });

        jLabel6.setText("Tiết kết thúc");

        selectThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "CN" }));

        textClassRoom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textClassRoomKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTietKT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textBatDau)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(selectThu, 0, 142, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textMaHP)
                            .addComponent(textIDLopHoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textClassRoom))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textIDLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textClassRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selectThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTietKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách Lớp học đăng ký", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        table_DKLH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học phần", "Mã Lớp học", "Phòng học", "Thứ", "Tiết bắt đầu", "Tiết kết thúc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_DKLH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_DKLHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_DKLH);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        btnAdd.setText("Đăng ký");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Hủy đăng ký");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(50, 50, 50)
                        .addComponent(btnDelete)
                        .addGap(42, 42, 42)
                        .addComponent(btnThoat)
                        .addGap(253, 253, 253))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        StudentPage studentPage = new StudentPage();
        studentPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    //add an object to table and database
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String subjectInfo = dklh.searchInfoLopHocByID(textIDLopHoc.getText());
        if (subjectInfo=="null") {
            JOptionPane.showMessageDialog(null, "Mã lớp học không hợp lệ", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //add to table
            DefaultTableModel tableModel = (DefaultTableModel) table_DKLH.getModel();
            String arr[]=subjectInfo.split("\t");
            tableModel.addRow(new Object[]{
                arr[0],arr[1],arr[2],arr[3],arr[4],arr[5] });
            //add to file
            SubjectClass lopHoc = new SubjectClass();
            lopHoc.setIdSubject(arr[0]);
            lopHoc.setIdLopHoc(arr[1]);
            lopHoc.setIdClassroom(arr[2]);
            lopHoc.setThu(arr[3]);
            lopHoc.setTietBatDau(arr[4]);
            lopHoc.setTietKetThuc(arr[5]);
            listLHSVDK.add(lopHoc);
            dklh.saveDKLH(listLHSVDK, idLogin);
            JOptionPane.showMessageDialog(null, "Thao tác thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table_DKLH.getModel();
        int index = table_DKLH.getSelectedRow();
        if (index >= 0) {
            //delete data in arraylist and file
            String idDel = tableModel.getValueAt(index, 0).toString();
            for (int i = 0; i < listLHSVDK.size(); i++) {
                if (listLHSVDK.get(i).getIdSubject().equalsIgnoreCase(idDel)) {
                    listLHSVDK.remove(i);
                    dklh.saveDKLH(listLHSVDK, idLogin);
                    //delete data in table
                    tableModel.removeRow(index);
                    JOptionPane.showMessageDialog(null, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Thao tác thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //when click a row in table, row's info display in detail info 
    private void table_DKLHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_DKLHMouseClicked
        // TODO add your handling code here:
        int index = table_DKLH.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) table_DKLH.getModel();
        textMaHP.setText(tableModel.getValueAt(index, 0).toString());
        textIDLopHoc.setText(tableModel.getValueAt(index, 1).toString());
        textClassRoom.setText(tableModel.getValueAt(index, 2).toString());
        String thu = tableModel.getValueAt(index, 3).toString();
        switch (thu) {
            case "2": {
                selectThu.setSelectedIndex(0);
            }
            break;
            case "3": {
                selectThu.setSelectedIndex(1);
            }
            break;
            case "4": {
                selectThu.setSelectedIndex(2);
            }
            break;
            case "5": {
                selectThu.setSelectedIndex(3);
            }
            break;
            case "6": {
                selectThu.setSelectedIndex(4);
            }
            break;
            case "7": {
                selectThu.setSelectedIndex(5);
            }
            break;
            case "CN": {
                selectThu.setSelectedIndex(6);
            }
            break;
        }
        textBatDau.setText(tableModel.getValueAt(index, 4).toString());
        textTietKT.setText(tableModel.getValueAt(index, 5).toString());
    }//GEN-LAST:event_table_DKLHMouseClicked

    private void textMaHPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMaHPMouseReleased
        textMaHP.getKeyListeners();
    }//GEN-LAST:event_textMaHPMouseReleased

    private void textMaHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textMaHPKeyPressed
        textMaHP.setText(textMaHP.getText());
    }//GEN-LAST:event_textMaHPKeyPressed

    private void textIDLopHocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textIDLopHocKeyPressed
        textIDLopHoc.setText(textIDLopHoc.getText());
    }//GEN-LAST:event_textIDLopHocKeyPressed

    private void textClassRoomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textClassRoomKeyPressed
        textClassRoom.setText(textClassRoom.getText());
    }//GEN-LAST:event_textClassRoomKeyPressed

    private void textBatDauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBatDauKeyPressed
        textBatDau.setText(textBatDau.getText());
    }//GEN-LAST:event_textBatDauKeyPressed

    private void textTietKTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textTietKTKeyPressed
        textTietKT.setText(textTietKT.getText());
    }//GEN-LAST:event_textTietKTKeyPressed

    //show list subject from arraylist to table in frame
    public void showSubjectList(ArrayList<SubjectClass> listLHSVDK) {
        DefaultTableModel model = (DefaultTableModel) table_DKLH.getModel();
        Object[] row;
        for (int i = 0; i < listLHSVDK.size(); i++) {
            row = new Object[7];
            row[0] = listLHSVDK.get(i).getIdSubject();
            row[1] = listLHSVDK.get(i).getIdLopHoc();
            row[2] = listLHSVDK.get(i).getIdClassroom();
            row[3] = listLHSVDK.get(i).getThu();
            row[4] = listLHSVDK.get(i).getTietBatDau();
            row[5] = listLHSVDK.get(i).getTietKetThuc();

            model.addRow(row);
        }
    }

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
            java.util.logging.Logger.getLogger(StudentDKLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDKLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDKLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDKLHT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StudentDKLHT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectThu;
    private javax.swing.JTable table_DKLH;
    private javax.swing.JTextField textBatDau;
    private javax.swing.JTextField textClassRoom;
    private javax.swing.JTextField textIDLopHoc;
    private javax.swing.JTextField textMaHP;
    private javax.swing.JTextField textTietKT;
    // End of variables declaration//GEN-END:variables

}

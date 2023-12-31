/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_GUI;

/**
 *
 * @author MBR
 */
import java.awt.*;
import javax.swing.*;
public class Lecturer1 extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    public Lecturer1() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Lecturer_FromLecturers = new java.awt.Button();
        button1 = new java.awt.Button();
        GoBack_FromStudents1 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddStudentButton_FromStudents = new java.awt.Button();
        ListStudentsButton_FromStudents = new java.awt.Button();
        UpdateDeleteStudentButton_FromStudents = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bgFocusLost(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 32, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 240, 30));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Admin");
        sidepane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 70));

        Lecturer_FromLecturers.setBackground(new java.awt.Color(85, 65, 118));
        Lecturer_FromLecturers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lecturer_FromLecturers.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        Lecturer_FromLecturers.setForeground(new java.awt.Color(255, 255, 255));
        Lecturer_FromLecturers.setLabel("Lecturers");
        Lecturer_FromLecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lecturer_FromLecturersActionPerformed(evt);
            }
        });
        sidepane.add(Lecturer_FromLecturers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 360, 50));

        button1.setBackground(new java.awt.Color(54, 32, 89));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("  Log out  ");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        sidepane.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 360, 50));

        GoBack_FromStudents1.setBackground(new java.awt.Color(54, 32, 89));
        GoBack_FromStudents1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GoBack_FromStudents1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        GoBack_FromStudents1.setForeground(new java.awt.Color(255, 255, 255));
        GoBack_FromStudents1.setLabel("Go Back");
        GoBack_FromStudents1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBack_FromStudents1ActionPerformed(evt);
            }
        });
        sidepane.add(GoBack_FromStudents1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 360, 50));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 790));

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin/Lecturer");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Manage Lecturers");

        AddStudentButton_FromStudents.setBackground(new java.awt.Color(54, 32, 89));
        AddStudentButton_FromStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStudentButton_FromStudents.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        AddStudentButton_FromStudents.setForeground(new java.awt.Color(255, 255, 255));
        AddStudentButton_FromStudents.setLabel("Add Lecturer");
        AddStudentButton_FromStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentButton_FromStudentsActionPerformed(evt);
            }
        });

        ListStudentsButton_FromStudents.setBackground(new java.awt.Color(54, 32, 89));
        ListStudentsButton_FromStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListStudentsButton_FromStudents.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        ListStudentsButton_FromStudents.setForeground(new java.awt.Color(255, 255, 255));
        ListStudentsButton_FromStudents.setLabel("List Lecturers");
        ListStudentsButton_FromStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListStudentsButton_FromStudentsActionPerformed(evt);
            }
        });

        UpdateDeleteStudentButton_FromStudents.setBackground(new java.awt.Color(54, 32, 89));
        UpdateDeleteStudentButton_FromStudents.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateDeleteStudentButton_FromStudents.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        UpdateDeleteStudentButton_FromStudents.setForeground(new java.awt.Color(255, 255, 255));
        UpdateDeleteStudentButton_FromStudents.setLabel("Update / Delete lecturer");
        UpdateDeleteStudentButton_FromStudents.setName(""); // NOI18N
        UpdateDeleteStudentButton_FromStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDeleteStudentButton_FromStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addGap(727, 727, 727))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpdateDeleteStudentButton_FromStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(AddStudentButton_FromStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(ListStudentsButton_FromStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(355, 355, 355))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(AddStudentButton_FromStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(UpdateDeleteStudentButton_FromStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(ListStudentsButton_FromStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 58, 1130, 690));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 40, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("College Examination Manage System");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 300, 40));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
       // this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void bgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bgFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_bgFocusLost

    private void AddStudentButton_FromStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentButton_FromStudentsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Add_Lecturer().setVisible(true);
    }//GEN-LAST:event_AddStudentButton_FromStudentsActionPerformed

    private void UpdateDeleteStudentButton_FromStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDeleteStudentButton_FromStudentsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Update_Lecturer().setVisible(true);
    }//GEN-LAST:event_UpdateDeleteStudentButton_FromStudentsActionPerformed

    private void ListStudentsButton_FromStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListStudentsButton_FromStudentsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new List_Lecturer().setVisible(true);
    }//GEN-LAST:event_ListStudentsButton_FromStudentsActionPerformed

    private void Lecturer_FromLecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lecturer_FromLecturersActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_Lecturer_FromLecturersActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login_form().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void GoBack_FromStudents1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBack_FromStudents1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Admin().setVisible(true);
    }//GEN-LAST:event_GoBack_FromStudents1ActionPerformed
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lecturer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Lecturer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AddStudentButton_FromStudents;
    private java.awt.Button GoBack_FromStudents1;
    private java.awt.Button Lecturer_FromLecturers;
    private java.awt.Button ListStudentsButton_FromStudents;
    private java.awt.Button UpdateDeleteStudentButton_FromStudents;
    private javax.swing.JPanel bg;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}

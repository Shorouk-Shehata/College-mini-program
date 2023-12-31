/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project1_GUI;

/**
 *
 * @author Nada Hassan
 */
public class AddPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPanel
     */
    public AddPanel() {
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

        Answers = new javax.swing.ButtonGroup();
        Question = new javax.swing.JLabel();
        jLabela1 = new javax.swing.JLabel();
        jLabelCorrect = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jTextFieldQuestion = new javax.swing.JTextField();
        jTextFielda2 = new javax.swing.JTextField();
        jTextFielda3 = new javax.swing.JTextField();
        jTextFielda4 = new javax.swing.JTextField();
        jTextFieldQNumber = new javax.swing.JTextField();
        jLabela2 = new javax.swing.JLabel();
        jLabela3 = new javax.swing.JLabel();
        jLabela4 = new javax.swing.JLabel();
        jTextFielda1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(85, 65, 118));

        Question.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setText("Question");

        jLabela1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabela1.setForeground(new java.awt.Color(255, 255, 255));
        jLabela1.setText("A");

        jLabelCorrect.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabelCorrect.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorrect.setText("Correct Answer:");

        saveButton.setBackground(new java.awt.Color(54, 32, 89));
        saveButton.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Confirm");
        saveButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveButton.setFocusPainted(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jTextFielda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielda2ActionPerformed(evt);
            }
        });

        jTextFielda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielda3ActionPerformed(evt);
            }
        });

        jTextFielda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielda4ActionPerformed(evt);
            }
        });

        jLabela2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabela2.setForeground(new java.awt.Color(255, 255, 255));
        jLabela2.setText("B");

        jLabela3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabela3.setForeground(new java.awt.Color(255, 255, 255));
        jLabela3.setText("C");

        jLabela4.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabela4.setForeground(new java.awt.Color(255, 255, 255));
        jLabela4.setText("D");

        jTextFielda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielda1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Message.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        A.setBackground(new java.awt.Color(85, 65, 118));
        Answers.add(A);
        A.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        A.setText("A");

        B.setBackground(new java.awt.Color(85, 65, 118));
        Answers.add(B);
        B.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        B.setText("B");

        C.setBackground(new java.awt.Color(85, 65, 118));
        Answers.add(C);
        C.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        C.setText("C");

        D.setBackground(new java.awt.Color(85, 65, 118));
        Answers.add(D);
        D.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        D.setText("D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabela2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabela3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabela4, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFielda3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addComponent(jTextFielda2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFielda1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFielda4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A)
                        .addGap(45, 45, 45)
                        .addComponent(B)
                        .addGap(53, 53, 53)
                        .addComponent(C)
                        .addGap(36, 36, 36)
                        .addComponent(D)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 456, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabela1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielda1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabela2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielda2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabela3)
                    .addComponent(jTextFielda3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabela4)
                    .addComponent(jTextFielda4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFielda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielda2ActionPerformed

    private void jTextFielda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielda3ActionPerformed

    private void jTextFielda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielda4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielda4ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (    !jTextFieldQNumber.getText().equals("")      &&
                !jTextFieldQuestion.getText().equals("")   &&
                !jTextFielda1.getText().equals("")    &&
                !jTextFielda2.getText().equals("")   &&
                !jTextFielda3.getText().equals("")   &&
                !jTextFielda4.getText().equals("")  &&
                (A.isSelected() || B.isSelected() || C.isSelected() || D.isSelected() )     ){
              
              
            Project.Exam x = new Project.Exam();
              
            if (x.searchExamById2(Integer.parseInt(jTextFieldQNumber.getText()))) {
                Message.setText("Change Question Number");
            }
            else {
                x.setQNumber(Integer.parseInt(jTextFieldQNumber.getText()));
                x.setQuestion(jTextFieldQuestion.getText());
                x.setA1(jTextFielda1.getText());
                x.setA2(jTextFielda2.getText());
                x.setA3(jTextFielda3.getText());
                x.setA4(jTextFielda4.getText());
              if (A.isSelected())
                x.setCorrect("A"); 
              if (B.isSelected())
                x.setCorrect("B");              
              if (C.isSelected())
                x.setCorrect("C"); 
              if (D.isSelected())
                x.setCorrect("D");  
              
              
              
                if (x.addExam()){
                  Message.setText("Done");
                  resetPanelData();
                }
                else {
                  Message.setText("Failed");
                }
            }
        }
        else {
               Message.setText("Please Fill Fields");
        
        }         
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jTextFielda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielda1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    
    
    private void resetPanelData() { 
        
            jTextFieldQNumber.setText("");
            jTextFieldQuestion.setText("");
            jTextFielda1.setText("");
            jTextFielda2.setText("");
            jTextFielda3.setText("");
            jTextFielda4.setText("");
            Answers.clearSelection();

         }  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.ButtonGroup Answers;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JLabel Message;
    private javax.swing.JLabel Question;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCorrect;
    private javax.swing.JLabel jLabela1;
    private javax.swing.JLabel jLabela2;
    private javax.swing.JLabel jLabela3;
    private javax.swing.JLabel jLabela4;
    private javax.swing.JTextField jTextFieldQNumber;
    private javax.swing.JTextField jTextFieldQuestion;
    private javax.swing.JTextField jTextFielda1;
    private javax.swing.JTextField jTextFielda2;
    private javax.swing.JTextField jTextFielda3;
    private javax.swing.JTextField jTextFielda4;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}

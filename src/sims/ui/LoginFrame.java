/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sims.ui;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sims.database.DatabaseConnector;
import sims.helper.Validator;
import sims.model.Email;
import sims.model.Fee;
import sims.model.Student;
import sims.model.StudentSubject;

/**
 *
 * @author johnc
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        loginLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        studentNumberOrEmailField = new javax.swing.JTextField();
        showPasswordCheckBox = new javax.swing.JCheckBox();
        studentNumberOrEmailLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("Login");
        loginLabel.setAlignmentX(0.5F);

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\sims\\assets\\student.png"));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(studentNumberOrEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 386, -1));

        showPasswordCheckBox.setText("show password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(showPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 127, 120, -1));

        studentNumberOrEmailLabel.setLabelFor(studentNumberOrEmailField);
        studentNumberOrEmailLabel.setText("Student Number / Email");
        jPanel1.add(studentNumberOrEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 205, -1));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, 386, -1));

        passwordLabel.setLabelFor(passwordField);
        passwordLabel.setText("Password");
        jPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 205, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String password = new String(passwordField.getPassword());
        var validator = new Validator();
        
        if (!validator.isValidText(studentNumberOrEmailField.getText())) {
            Modal.show("Student/Email field must have a value.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validator.isValidText(password)) {
            Modal.show("Password field must be valid.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String selectStudentQuery = """
                      SELECT * FROM student 
                      INNER JOIN student_info
                      	on student.id = student_info.studentId
                      WHERE password = '%s'
                      AND studentNumber = '%s'
                      OR email = '%s'
                      """.formatted(password,studentNumberOrEmailField.getText(),studentNumberOrEmailField.getText());
        
        try (var conn = DatabaseConnector.getConnection();
             var selectStudentStmt = conn.createStatement();
             var studentResultSet = selectStudentStmt.executeQuery(selectStudentQuery);) {
            
            // if there are no results returned
            if (!studentResultSet.isBeforeFirst()) {
                Modal.show("No student found!", "Notice", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            // TODO OPTIONAL: set new student's info, current sem, section etc.
            //======================================================================
            // STUDENT INFO QUERY
            //======================================================================
            var student = new Student(); // maybe we can serialize/save this to save the current logged in user.
            while (studentResultSet.next()) {
                var studentEmail = new Email(studentResultSet.getString("firstName"), studentResultSet.getString("lastName"), studentResultSet.getString("department"));
                
                //======================================================================
                // ABSOLUTE COLUMNS
                //======================================================================  
                studentEmail.setPassword(studentResultSet.getString("password"));
                student.setEmail(studentEmail);
                student.setId(studentResultSet.getInt("id"));
                student.setStudentNumber(studentResultSet.getString("studentNumber"));
                student.setYearLevel(studentResultSet.getString("yearLevel"));
                student.setSection(studentResultSet.getString("section"));
                
                //======================================================================
                // NULLABLE COLUMNS
                //======================================================================    
                if (studentResultSet.getString("middleName") != null) student.setMiddleName(studentResultSet.getString("middleName"));
                if (studentResultSet.getString("sex") != null) student.setSex(studentResultSet.getString("sex"));
                if (studentResultSet.getString("contactNumber") != null) student.setContactNumber(studentResultSet.getString("contactNumber"));
                if (studentResultSet.getString("birthday") != null) student.setBirthday(studentResultSet.getString("birthday"));
                if (studentResultSet.getString("guardianName") != null) student.setGuardianName(studentResultSet.getString("guardianName"));
                if (studentResultSet.getString("alternativeEmail") != null) studentEmail.setReserveEmail(studentResultSet.getString("alternativeEmail"));
                if (studentResultSet.getString("address") != null) student.setAddress(studentResultSet.getString("address"));
            }
            
            //======================================================================
            // STUDENT SUBJECTS QUERY
            //======================================================================
            String selectStudentSubjectsQuery = """
                                                SELECT subject.subjectCode,
                                                subject.faculty,
                                                subject.subjectTitle,
                                                subject.remarks,
                                                subject.units,
                                                subject.grade,
                                                subject.semester,
                                                subject.yearLevel
                                                FROM subject
                                                	inner join student
                                                	on subject.studentId  = student.id
                                                where subject.studentId = %d
                                                """.formatted(student.getId());
            
            var selectStudentSubjectsStmt = conn.prepareStatement(selectStudentSubjectsQuery);
            var studentSubjectsResultSet = selectStudentSubjectsStmt.executeQuery();
            
            var studentSubjects = new LinkedList<StudentSubject>();
            
            while(studentSubjectsResultSet.next()) {
                var subject = new StudentSubject(studentSubjectsResultSet.getString("subjectCode"),
                        studentSubjectsResultSet.getString("subjectTitle"), 
                        studentSubjectsResultSet.getString("faculty"), 
                        studentSubjectsResultSet.getString("units"), 
                        studentSubjectsResultSet.getString("yearLevel"),studentSubjectsResultSet.getString("semester"));
                subject.setGrade(studentSubjectsResultSet.getDouble("grade"));
                
                studentSubjects.add(subject);
            }
            
            // set student instance subjects
            student.setSubjects(studentSubjects);
            selectStudentSubjectsStmt.close();
            studentSubjectsResultSet.close();
            
            //======================================================================
            // STUDENT FEES QUERY
            //======================================================================
            
            String selectStudentFeesQuery = """
                                       SELECT fee.id,fee.title,fee.isPending,fee.amount,fee.dueDate
                                       FROM fee
                                       INNER JOIN student
                                       	ON student.id = fee.studentId
                                       WHERE fee.studentId = %d
                                       """.formatted(student.getId());
            var selectStudentFeesStmt = conn.prepareStatement(selectStudentFeesQuery);
            var studentFeesResultSet = selectStudentFeesStmt.executeQuery();
            
            var studentFees = new LinkedList<Fee>();
            
            while(studentFeesResultSet.next()) {
                var fee = new Fee(studentFeesResultSet.getString("title"),studentFeesResultSet.getString("dueDate"),studentFeesResultSet.getDouble("amount"));
                fee.setId(studentFeesResultSet.getInt("id"));
                fee.setIsPending(studentFeesResultSet.getBoolean("isPending"));
                
                studentFees.add(fee);
            }
            
            student.setFees(studentFees);
            
            selectStudentFeesStmt.close();
            studentFeesResultSet.close();
            
            System.out.println(student);
            Modal.show("You will now be redirected to the dashboard.", "Login success!", JOptionPane.INFORMATION_MESSAGE);
            
            var homepage = new WindowFrame(student);
            homepage.setLocationRelativeTo(null);
            homepage.setVisible(true);
            
            this.dispose();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        boolean isChecked = showPasswordCheckBox.isSelected();
        
        if (isChecked) passwordField.setEchoChar((char)0);
        else passwordField.setEchoChar('*');
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JTextField studentNumberOrEmailField;
    private javax.swing.JLabel studentNumberOrEmailLabel;
    // End of variables declaration//GEN-END:variables
}

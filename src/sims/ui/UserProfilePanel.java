/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sims.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sims.database.DatabaseConnector;
import sims.helper.Validator;
import sims.model.Student;

/**
 *
 * @author Jireh
 */
public class UserProfilePanel extends javax.swing.JPanel {

    private Student student;
    /**
     * Creates new form UserProfilePanel
     *
     * @param student
     */
    public UserProfilePanel(Student student) {
        this.student = student;
        initComponents();
        initStudentData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton = new javax.swing.JButton();
        PrimaryInformationSection = new javax.swing.JPanel();
        studentNumberLabel = new javax.swing.JLabel();
        studentNumber = new javax.swing.JLabel();
        institutionalEmailLabel = new javax.swing.JLabel();
        studentInstitutionalEmail = new javax.swing.JLabel();
        FullNameSection = new javax.swing.JPanel();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        middleNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        SexSection = new javax.swing.JPanel();
        sexLabel = new javax.swing.JLabel();
        sexComboBox = new javax.swing.JComboBox<>();
        BirthdaySection = new javax.swing.JPanel();
        birthdayLabel = new javax.swing.JLabel();
        birthdayField = new javax.swing.JTextField();
        ContactSection = new javax.swing.JPanel();
        contactNoLabel = new javax.swing.JLabel();
        contactNoField = new javax.swing.JTextField();
        GuardianSection = new javax.swing.JPanel();
        guardianNameLabel = new javax.swing.JLabel();
        guardianNameField = new javax.swing.JTextField();
        PasswordSection = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        AddressSection = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        AltEmailSection = new javax.swing.JPanel();
        altEmailLabel = new javax.swing.JLabel();
        altEmailField = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 720));

        saveButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        PrimaryInformationSection.setPreferredSize(new java.awt.Dimension(260, 243));
        PrimaryInformationSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        studentNumberLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentNumberLabel.setText("Student Number:");
        studentNumberLabel.setPreferredSize(new java.awt.Dimension(163, 24));
        PrimaryInformationSection.add(studentNumberLabel);

        studentNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentNumber.setText("201232132311");
        studentNumber.setInheritsPopupMenu(false);
        studentNumber.setPreferredSize(new java.awt.Dimension(300, 40));
        PrimaryInformationSection.add(studentNumber);

        institutionalEmailLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        institutionalEmailLabel.setText("Institutional Email:");
        PrimaryInformationSection.add(institutionalEmailLabel);

        studentInstitutionalEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        studentInstitutionalEmail.setText("john.smith@cvsu.edu.ph");
        studentInstitutionalEmail.setPreferredSize(new java.awt.Dimension(300, 40));
        PrimaryInformationSection.add(studentInstitutionalEmail);

        FullNameSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        firstNameField.setPreferredSize(new java.awt.Dimension(150, 30));
        FullNameSection.add(firstNameField);

        middleNameField.setPreferredSize(new java.awt.Dimension(150, 30));
        FullNameSection.add(middleNameField);

        lastNameField.setPreferredSize(new java.awt.Dimension(150, 30));
        FullNameSection.add(lastNameField);

        firstNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstNameLabel.setText("First Name");
        firstNameLabel.setPreferredSize(new java.awt.Dimension(150, 16));
        FullNameSection.add(firstNameLabel);

        middleNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        middleNameLabel.setText("Middle Name");
        middleNameLabel.setPreferredSize(new java.awt.Dimension(150, 16));
        FullNameSection.add(middleNameLabel);

        lastNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastNameLabel.setText("Last Name");
        lastNameLabel.setPreferredSize(new java.awt.Dimension(150, 16));
        FullNameSection.add(lastNameLabel);

        sexLabel.setText("Sex");
        SexSection.add(sexLabel);

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        sexComboBox.setPreferredSize(new java.awt.Dimension(120, 30));
        SexSection.add(sexComboBox);

        BirthdaySection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        birthdayLabel.setText("Birthday");
        birthdayLabel.setPreferredSize(new java.awt.Dimension(51, 16));
        BirthdaySection.add(birthdayLabel);

        birthdayField.setText("MM-DD-YEAR");
        birthdayField.setPreferredSize(new java.awt.Dimension(250, 30));
        BirthdaySection.add(birthdayField);

        ContactSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        contactNoLabel.setText("Contact #");
        ContactSection.add(contactNoLabel);

        contactNoField.setPreferredSize(new java.awt.Dimension(250, 30));
        ContactSection.add(contactNoField);

        GuardianSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        guardianNameLabel.setText("Guardian Name");
        GuardianSection.add(guardianNameLabel);

        guardianNameField.setPreferredSize(new java.awt.Dimension(250, 30));
        GuardianSection.add(guardianNameField);

        PasswordSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        passwordLabel.setText("Password");
        passwordLabel.setPreferredSize(new java.awt.Dimension(60, 16));
        PasswordSection.add(passwordLabel);

        passwordField.setPreferredSize(new java.awt.Dimension(250, 30));
        PasswordSection.add(passwordField);

        AddressSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        addressLabel.setText("Address");
        addressLabel.setPreferredSize(new java.awt.Dimension(51, 16));
        AddressSection.add(addressLabel);

        addressField.setPreferredSize(new java.awt.Dimension(750, 30));
        AddressSection.add(addressField);

        AltEmailSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        altEmailLabel.setText("Alt Email");
        altEmailLabel.setPreferredSize(new java.awt.Dimension(51, 16));
        AltEmailSection.add(altEmailLabel);

        altEmailField.setPreferredSize(new java.awt.Dimension(250, 30));
        AltEmailSection.add(altEmailField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PrimaryInformationSection, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BirthdaySection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardianSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FullNameSection, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SexSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AltEmailSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(PrimaryInformationSection, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FullNameSection, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactSection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GuardianSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BirthdaySection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AltEmailSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(AddressSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initStudentData() {         
                //======================================================================
                // NULLABLE COLUMNS
                //======================================================================                
                if (student.getMiddleName() != null) middleNameField.setText(student.getMiddleName());
                if (student.getSex() != null) sexComboBox.setSelectedItem(student.getSex());
                if (student.getContactNumber() != null) contactNoField.setText(student.getContactNumber());
                if (student.getBirthday() != null) birthdayField.setText(student.getBirthday());
                if (student.getGuardianName() != null) guardianNameField.setText(student.getGuardianName());
                if (student.getEmail().getReserveEmail()!= null) altEmailField.setText(student.getEmail().getReserveEmail());
                if (student.getAddress() != null) addressField.setText(student.getAddress());

                //======================================================================
                // ABSOLUTE COLUMNS
                //======================================================================
                studentNumber.setText(student.getStudentNumber());
                studentInstitutionalEmail.setText(student.getEmail().getEmail());
                firstNameField.setText(student.getEmail().getFirstName());
                passwordField.setText(student.getEmail().getPassword());
                lastNameField.setText(student.getEmail().getLastName());

                //======================================================================
                // DISABLED FIELDS
                //======================================================================  
                firstNameField.setFocusable(false);
                lastNameField.setFocusable(false);
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // validate fields
        var validator = new Validator();

        if (!validator.isValidText(middleNameField.getText())) {
            Modal.show("Middle name is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!validator.isValidText(new String(passwordField.getPassword()))) {
            Modal.show("Password cannot be invalid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!contactNoField.getText().matches("^09\\d{9}$")) {
            Modal.show("Contact number is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!birthdayField.getText().matches("^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])-(\\d{4})$")) {
            Modal.show("Birthday is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!validator.isValidText(guardianNameField.getText())) {
            Modal.show("Guardian name is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!altEmailField.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            Modal.show("Alternative email is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!validator.isValidText(addressField.getText())) {
            Modal.show("Address is not valid.", "Invalid input", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try(var conn = DatabaseConnector.getConnection()) {
            String updateStudentQuery = "UPDATE student SET middleName = '%s', alternativeEmail = '%s', password = '%s', sex = '%s' WHERE studentNumber = %s"
                    .formatted(middleNameField.getText(),
                            altEmailField.getText(),
                            new String(passwordField.getPassword()),
                            sexComboBox.getSelectedItem().toString(),
                            studentNumber.getText());
            String updateStudentInfoQuery = "UPDATE student_info SET address = '%s', guardianName = '%s', birthday = '%s', contactNumber = '%s' WHERE studentId = %d"
                    .formatted(addressField.getText(),
                            guardianNameField.getText(),
                            birthdayField.getText(),
                            contactNoField.getText(),
                            student.getId());
            
            var updateStudentStmt = conn.prepareStatement(updateStudentQuery);
            var updateStudentInfoStmt = conn.prepareStatement(updateStudentInfoQuery);
            
            int updateStudentAffectedRows = updateStudentStmt.executeUpdate();
            int updateStudentInfoAffectedRows = updateStudentInfoStmt.executeUpdate();
            
            System.out.println("student table affected " + updateStudentAffectedRows + " rows");
            System.out.println("student_info table affected " + updateStudentInfoAffectedRows + " rows");
            
            Modal.show("Saved", "Update success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserProfilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddressSection;
    private javax.swing.JPanel AltEmailSection;
    private javax.swing.JPanel BirthdaySection;
    private javax.swing.JPanel ContactSection;
    private javax.swing.JPanel FullNameSection;
    private javax.swing.JPanel GuardianSection;
    private javax.swing.JPanel PasswordSection;
    private javax.swing.JPanel PrimaryInformationSection;
    private javax.swing.JPanel SexSection;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField altEmailField;
    private javax.swing.JLabel altEmailLabel;
    private javax.swing.JTextField birthdayField;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JTextField contactNoField;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField guardianNameField;
    private javax.swing.JLabel guardianNameLabel;
    private javax.swing.JLabel institutionalEmailLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel studentInstitutionalEmail;
    private javax.swing.JLabel studentNumber;
    private javax.swing.JLabel studentNumberLabel;
    // End of variables declaration//GEN-END:variables
}

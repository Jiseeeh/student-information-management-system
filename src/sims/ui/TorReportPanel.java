/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sims.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import sims.model.Student;
import sims.model.StudentSubject;

/**
 *
 * @author Jireh
 */
public class TorReportPanel extends javax.swing.JPanel {

    /**
     * Creates new form TorReportPanel
     *
     * @param student
     */
    public TorReportPanel(Student student) {
        initComponents();
        StudentFullName.setText("%s %s %s".formatted(student.getEmail().getFirstName(),
                student.getMiddleName() == null ? "" : String.valueOf(student.getMiddleName().charAt(0)) + ".",
                student.getEmail().getLastName()));
        StudentDateOfBirth.setText(student.getBirthday());
        StudentContactNumber.setText(student.getContactNumber());
        StudentParent.setText(student.getGuardianName());
        StudentAddress.setText(student.getAddress());
        StudentSex.setText(student.getSex());
        /*
            Size Format
            Course Title Column - [550, 20]
            Credits Attempted Column - [150, 20]
            Credits Earned Column - [130, 20]
            Final Grade Column - [138, 20]
         */

        setColumns(student.getSubjects());
    }

    private void setColumns(List<StudentSubject> subjects) {
        int firstYearTotalUnits = 0, firstYearTotalSubjects = 0,
                secondYearTotalUnits = 0, secondYearTotalSubjects = 0,
                thirdYearTotalUnits = 0, thirdYearTotalSubjects = 0,
                fourthYearTotalUnits = 0, fourthYearTotalSubjects = 0;

        double firstYearTotalGPA = 0, secondYearTotalGPA = 0,
                thirdYearTotalGPA = 0, fourthYearTotalGPA = 0;

        for (var subject : subjects) {
            switch (subject.getYearLevel()) {
                case "1" -> {
                    setColumnBasedOnYearLevel("1", subject);

                    firstYearTotalUnits += Integer.parseInt(subject.getUnits());
                    firstYearTotalSubjects++;
                    firstYearTotalGPA += subject.getGrade();
                }
                case "2" -> {
                    setColumnBasedOnYearLevel("2", subject);

                    secondYearTotalUnits += Integer.parseInt(subject.getUnits());
                    secondYearTotalSubjects++;
                    secondYearTotalGPA += subject.getGrade();
                }
                case "3" -> {
                    setColumnBasedOnYearLevel("3", subject);

                    thirdYearTotalUnits += Integer.parseInt(subject.getUnits());
                    thirdYearTotalSubjects++;
                    thirdYearTotalGPA += subject.getGrade();
                }
                case "4" -> {
                    setColumnBasedOnYearLevel("4", subject);

                    fourthYearTotalUnits += Integer.parseInt(subject.getUnits());
                    fourthYearTotalSubjects++;
                    fourthYearTotalGPA += subject.getGrade();
                }
            }
        }

        // TOTAL UNITS
        FirstYearTotalCredits.setText(String.valueOf(firstYearTotalUnits));
        SecondYearTotalCredits.setText(String.valueOf(secondYearTotalUnits));
        ThirdYearTotalCredits.setText(String.valueOf(thirdYearTotalUnits));
        FourthYearTotalCredits.setText(String.valueOf(fourthYearTotalUnits));

        // TOTAL GPA
        FirstYearGPA.setText(Double.toString(firstYearTotalGPA / firstYearTotalSubjects));
        SecondYearGPA.setText(Double.toString(secondYearTotalGPA / secondYearTotalSubjects));
        ThirdYearGPA.setText(Double.toString(thirdYearTotalGPA / thirdYearTotalSubjects));
        FourthYearGPA.setText(Double.toString(fourthYearTotalGPA / fourthYearTotalSubjects));

    }

    private void setColumnBasedOnYearLevel(String yearLevel, StudentSubject subject) {
        // TITLE COLUMN
        var titleLabel = labelGenerator(subject.getSubjectTitle());
        var titlePanel = panelGenerator(titleLabel, 550, 20);
        addTitleColumnBasedOnYearLevel(yearLevel, titlePanel);

        // ATTEMPTED CREDITS COLUMN
        var attemptedUnitsLabel = labelGenerator(subject.getUnits());
        var attemptedUnitsPanel = panelGenerator(attemptedUnitsLabel, 150, 20);
        addAttemptedColumnBasedOnYearLevel(yearLevel, attemptedUnitsPanel);

        // CREDITS EARNED COLUMN
        var creditsEarnedLabel = labelGenerator(subject.getUnits());
        var creditsEarnedPanel = panelGenerator(creditsEarnedLabel, 130, 20);
        addCreditsEarnedColumnBasedOnYearLevel(yearLevel, creditsEarnedPanel);

        // FINAL GRADE COLUMN
        var gradeLabel = labelGenerator(Double.toString(subject.getGrade()));
        var gradePanel = panelGenerator(gradeLabel, 138, 20);
        addGradeColumnBasedOnYearLevel(yearLevel, gradePanel);
    }

    private void addTitleColumnBasedOnYearLevel(String yearLevel, JPanel panel) {
        switch (yearLevel) {
            case "1" ->
                FirstYearCourseTitleColumn.add(panel);
            case "2" ->
                SecondYearCourseTitleColumn.add(panel);
            case "3" ->
                ThirdYearCourseTitleColumn.add(panel);
            case "4" ->
                FourthYearCourseTitleColumn.add(panel);
        }
    }

    private void addAttemptedColumnBasedOnYearLevel(String yearLevel, JPanel panel) {
        switch (yearLevel) {
            case "1" ->
                FirstYearCreditsAttemptedColumn.add(panel);
            case "2" ->
                SecondYearCreditsAttemptedColumn.add(panel);
            case "3" ->
                ThirdYearCreditsAttemptedColumn.add(panel);
            case "4" ->
                FourthYearCreditsAttemptedColumn.add(panel);
        }
    }

    private void addCreditsEarnedColumnBasedOnYearLevel(String yearLevel, JPanel panel) {
        switch (yearLevel) {
            case "1" ->
                FirstYearCreditsEarnedColumn.add(panel);
            case "2" ->
                SecondYearCreditsEarnedColumn.add(panel);
            case "3" ->
                ThirdYearCreditsEarnedColumn.add(panel);
            case "4" ->
                FourthYearCreditsEarnedColumn.add(panel);
        }
    }

    private void addGradeColumnBasedOnYearLevel(String yearLevel, JPanel panel) {
        switch (yearLevel) {
            case "1" ->
                FirstYearFinalGradeColumn.add(panel);
            case "2" ->
                SecondYearFinalGradeColumn.add(panel);
            case "3" ->
                ThirdYearFinalGradeColumn.add(panel);
            case "4" ->
                FourthYearFinalGradeColumn.add(panel);
        }
    }

    private JLabel labelGenerator(String content) {
        JLabel label = new JLabel(content);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));

        return label;
    }

    private JPanel panelGenerator(JLabel label, int width, int height) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(width, height));
        panel.setLayout(new GridLayout());
        panel.setOpaque(false);

        panel.add(label);

        return panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel30 = new javax.swing.JPanel();
        ContainerPanel = new javax.swing.JPanel();
        HeaderSection = new javax.swing.JPanel();
        SchoolSection = new javax.swing.JPanel();
        SchoolName = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SchoolInformation = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SchoolLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        StudentSection = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        StudentInformation1 = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        StudentFullName = new javax.swing.JLabel();
        DobLabel = new javax.swing.JLabel();
        StudentDateOfBirth = new javax.swing.JLabel();
        ContactInfoLabel = new javax.swing.JLabel();
        StudentContactNumber = new javax.swing.JLabel();
        ParentLabel = new javax.swing.JLabel();
        StudentParent = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        StudentAddress = new javax.swing.JLabel();
        StudentInformation2 = new javax.swing.JPanel();
        SexLabel = new javax.swing.JLabel();
        StudentSex = new javax.swing.JLabel();
        Divider = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TabPane = new javax.swing.JTabbedPane();
        FirstYearSection = new javax.swing.JPanel();
        Heading = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        FirstYearCourseTitleColumn = new javax.swing.JPanel();
        FirstYearCreditsAttemptedColumn = new javax.swing.JPanel();
        FirstYearCreditsEarnedColumn = new javax.swing.JPanel();
        FirstYearFinalGradeColumn = new javax.swing.JPanel();
        Footer = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        FirstYearSchoolYear = new javax.swing.JLabel();
        FirstYearGPA = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FirstYearTotalCredits = new javax.swing.JLabel();
        SecondYearSection = new javax.swing.JPanel();
        Heading1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        SecondYearCourseTitleColumn = new javax.swing.JPanel();
        SecondYearCreditsAttemptedColumn = new javax.swing.JPanel();
        SecondYearCreditsEarnedColumn = new javax.swing.JPanel();
        SecondYearFinalGradeColumn = new javax.swing.JPanel();
        Footer1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        SecondYearSchoolYear = new javax.swing.JLabel();
        SecondYearGPA = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        SecondYearTotalCredits = new javax.swing.JLabel();
        ThirdYearSection = new javax.swing.JPanel();
        Heading2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ThirdYearCourseTitleColumn = new javax.swing.JPanel();
        ThirdYearCreditsAttemptedColumn = new javax.swing.JPanel();
        ThirdYearCreditsEarnedColumn = new javax.swing.JPanel();
        ThirdYearFinalGradeColumn = new javax.swing.JPanel();
        Footer2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        ThirdYearSchoolYear = new javax.swing.JLabel();
        ThirdYearGPA = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        ThirdYearTotalCredits = new javax.swing.JLabel();
        FourthYearSection = new javax.swing.JPanel();
        Heading3 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        FourthYearCourseTitleColumn = new javax.swing.JPanel();
        FourthYearCreditsAttemptedColumn = new javax.swing.JPanel();
        FourthYearCreditsEarnedColumn = new javax.swing.JPanel();
        FourthYearFinalGradeColumn = new javax.swing.JPanel();
        Footer3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        FourthYearSchoolYear = new javax.swing.JLabel();
        FourthYearGPA = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        FourthYearTotalCredits = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(1006, 720));
        setLayout(null);

        ContainerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        HeaderSection.setMinimumSize(new java.awt.Dimension(250, 250));
        HeaderSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        SchoolSection.setPreferredSize(new java.awt.Dimension(503, 250));
        SchoolSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        SchoolName.setPreferredSize(new java.awt.Dimension(503, 70));
        SchoolName.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cvsu Bacoor Campus");
        SchoolName.add(jLabel1);

        SchoolSection.add(SchoolName);

        SchoolInformation.setPreferredSize(new java.awt.Dimension(503, 180));
        SchoolInformation.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel2.setPreferredSize(new java.awt.Dimension(353, 180));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel8.setPreferredSize(new java.awt.Dimension(353, 50));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Official Transcript");
        jPanel8.add(jLabel4);

        jPanel2.add(jPanel8);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Soldiers Hills IV, Molino VI,");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Bacoor City, Cavite.");
        jLabel6.setPreferredSize(new java.awt.Dimension(319, 25));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 35, -1, -1));

        jPanel2.add(jPanel1);

        SchoolInformation.add(jPanel2);

        SchoolLogo.setPreferredSize(new java.awt.Dimension(150, 180));
        SchoolLogo.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\sims\\assets\\cvsu-logo-mini.png"));
        SchoolLogo.add(jLabel3, java.awt.BorderLayout.CENTER);

        SchoolInformation.add(SchoolLogo);

        SchoolSection.add(SchoolInformation);

        HeaderSection.add(SchoolSection);

        StudentSection.setPreferredSize(new java.awt.Dimension(503, 250));
        StudentSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        Header.setPreferredSize(new java.awt.Dimension(503, 70));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Information");
        Header.add(jLabel2);

        StudentSection.add(Header);

        StudentInformation1.setPreferredSize(new java.awt.Dimension(353, 180));

        NameLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        NameLabel.setText("Name:");
        StudentInformation1.add(NameLabel);

        StudentFullName.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentFullName.setText("Jireh Alny T. Tumbagahan");
        StudentFullName.setPreferredSize(new java.awt.Dimension(280, 20));
        StudentInformation1.add(StudentFullName);

        DobLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        DobLabel.setText("Date of Birth:");
        StudentInformation1.add(DobLabel);

        StudentDateOfBirth.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentDateOfBirth.setText("September 10, 2001");
        StudentDateOfBirth.setPreferredSize(new java.awt.Dimension(208, 20));
        StudentInformation1.add(StudentDateOfBirth);

        ContactInfoLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        ContactInfoLabel.setText("Contact Info:");
        StudentInformation1.add(ContactInfoLabel);

        StudentContactNumber.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentContactNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentContactNumber.setText("09123123123");
        StudentContactNumber.setPreferredSize(new java.awt.Dimension(216, 20));
        StudentInformation1.add(StudentContactNumber);

        ParentLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        ParentLabel.setText("Parent/Guardian:");
        StudentInformation1.add(ParentLabel);

        StudentParent.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentParent.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentParent.setText("Marry P. Poppins");
        StudentParent.setPreferredSize(new java.awt.Dimension(192, 20));
        StudentInformation1.add(StudentParent);

        AddressLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        AddressLabel.setText("Address:");
        StudentInformation1.add(AddressLabel);

        StudentAddress.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentAddress.setText("Bacoor 12. Subd 2324242");
        StudentAddress.setPreferredSize(new java.awt.Dimension(256, 20));
        StudentInformation1.add(StudentAddress);

        StudentSection.add(StudentInformation1);

        StudentInformation2.setPreferredSize(new java.awt.Dimension(150, 180));
        StudentInformation2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 14, 5));

        SexLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        SexLabel.setText("Sex:");
        StudentInformation2.add(SexLabel);

        StudentSex.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        StudentSex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        StudentSex.setText("Male");
        StudentSex.setPreferredSize(new java.awt.Dimension(52, 20));
        StudentInformation2.add(StudentSex);

        StudentSection.add(StudentInformation2);

        HeaderSection.add(StudentSection);

        ContainerPanel.add(HeaderSection);

        Divider.setBorder(new javax.swing.border.MatteBorder(null));
        Divider.setPreferredSize(new java.awt.Dimension(970, 40));
        Divider.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Academic Record");
        Divider.add(jLabel7);

        ContainerPanel.add(Divider);

        TabPane.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        TabPane.setPreferredSize(new java.awt.Dimension(970, 400));

        FirstYearSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        Heading.setPreferredSize(new java.awt.Dimension(968, 30));
        Heading.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel12.setPreferredSize(new java.awt.Dimension(550, 30));
        jPanel12.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Course Title");
        jLabel9.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel12.add(jLabel9);

        Heading.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Credits Attempted");
        jPanel13.add(jLabel8);

        Heading.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel14.setLayout(new java.awt.GridLayout(1, 0));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Credits Earned");
        jPanel14.add(jLabel10);

        Heading.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(138, 30));
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Final Grade");
        jPanel15.add(jLabel11);

        Heading.add(jPanel15);

        FirstYearSection.add(Heading);

        FirstYearCourseTitleColumn.setPreferredSize(new java.awt.Dimension(550, 294));
        FirstYearSection.add(FirstYearCourseTitleColumn);

        FirstYearCreditsAttemptedColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        FirstYearCreditsAttemptedColumn.setPreferredSize(new java.awt.Dimension(150, 294));
        FirstYearSection.add(FirstYearCreditsAttemptedColumn);

        FirstYearCreditsEarnedColumn.setPreferredSize(new java.awt.Dimension(130, 294));
        FirstYearSection.add(FirstYearCreditsEarnedColumn);

        FirstYearFinalGradeColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        FirstYearFinalGradeColumn.setPreferredSize(new java.awt.Dimension(138, 294));
        FirstYearSection.add(FirstYearFinalGradeColumn);

        Footer.setPreferredSize(new java.awt.Dimension(968, 50));
        Footer.setLayout(null);

        jLabel25.setText("School Year:");
        Footer.add(jLabel25);
        jLabel25.setBounds(30, 20, 70, 16);

        FirstYearSchoolYear.setText("2022-2023");
        Footer.add(FirstYearSchoolYear);
        FirstYearSchoolYear.setBounds(120, 20, 100, 16);

        FirstYearGPA.setText("0");
        Footer.add(FirstYearGPA);
        FirstYearGPA.setBounds(890, 20, 40, 16);

        jLabel28.setText("GPA:");
        Footer.add(jLabel28);
        jLabel28.setBounds(810, 20, 80, 16);

        jLabel29.setText("Total Credits:");
        Footer.add(jLabel29);
        jLabel29.setBounds(397, 20, 100, 16);

        FirstYearTotalCredits.setText("0");
        Footer.add(FirstYearTotalCredits);
        FirstYearTotalCredits.setBounds(500, 20, 30, 16);

        FirstYearSection.add(Footer);

        TabPane.addTab("First Year", FirstYearSection);

        SecondYearSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        Heading1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel16.setPreferredSize(new java.awt.Dimension(550, 30));
        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        jLabel12.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Course Title");
        jLabel12.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel16.add(jLabel12);

        Heading1.add(jPanel16);

        jPanel17.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        jLabel13.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Credits Attempted");
        jPanel17.add(jLabel13);

        Heading1.add(jPanel17);

        jPanel18.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        jLabel14.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Credits Earned");
        jPanel18.add(jLabel14);

        Heading1.add(jPanel18);

        jPanel19.setPreferredSize(new java.awt.Dimension(138, 30));
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Final Grade");
        jPanel19.add(jLabel15);

        Heading1.add(jPanel19);

        SecondYearSection.add(Heading1);

        SecondYearCourseTitleColumn.setPreferredSize(new java.awt.Dimension(550, 294));
        SecondYearSection.add(SecondYearCourseTitleColumn);

        SecondYearCreditsAttemptedColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        SecondYearCreditsAttemptedColumn.setPreferredSize(new java.awt.Dimension(150, 294));
        SecondYearSection.add(SecondYearCreditsAttemptedColumn);

        SecondYearCreditsEarnedColumn.setPreferredSize(new java.awt.Dimension(130, 294));
        SecondYearSection.add(SecondYearCreditsEarnedColumn);

        SecondYearFinalGradeColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        SecondYearFinalGradeColumn.setPreferredSize(new java.awt.Dimension(138, 294));
        SecondYearSection.add(SecondYearFinalGradeColumn);

        Footer1.setPreferredSize(new java.awt.Dimension(968, 50));
        Footer1.setLayout(null);

        jLabel26.setText("School Year:");
        Footer1.add(jLabel26);
        jLabel26.setBounds(30, 20, 70, 16);

        SecondYearSchoolYear.setText("2022-2023");
        Footer1.add(SecondYearSchoolYear);
        SecondYearSchoolYear.setBounds(120, 20, 100, 16);

        SecondYearGPA.setText("0");
        Footer1.add(SecondYearGPA);
        SecondYearGPA.setBounds(890, 20, 40, 16);

        jLabel30.setText("GPA:");
        Footer1.add(jLabel30);
        jLabel30.setBounds(810, 20, 80, 16);

        jLabel31.setText("Total Credits:");
        Footer1.add(jLabel31);
        jLabel31.setBounds(397, 20, 100, 16);

        SecondYearTotalCredits.setText("0");
        Footer1.add(SecondYearTotalCredits);
        SecondYearTotalCredits.setBounds(500, 20, 30, 16);

        SecondYearSection.add(Footer1);

        TabPane.addTab("Second Year", SecondYearSection);

        ThirdYearSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        Heading2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel20.setPreferredSize(new java.awt.Dimension(550, 30));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0));

        jLabel16.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Course Title");
        jLabel16.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel20.add(jLabel16);

        Heading2.add(jPanel20);

        jPanel21.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel21.setLayout(new java.awt.GridLayout(1, 0));

        jLabel17.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Credits Attempted");
        jPanel21.add(jLabel17);

        Heading2.add(jPanel21);

        jPanel22.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel22.setLayout(new java.awt.GridLayout(1, 0));

        jLabel18.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Credits Earned");
        jPanel22.add(jLabel18);

        Heading2.add(jPanel22);

        jPanel23.setPreferredSize(new java.awt.Dimension(138, 30));
        jPanel23.setLayout(new java.awt.GridLayout(1, 0));

        jLabel19.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Final Grade");
        jPanel23.add(jLabel19);

        Heading2.add(jPanel23);

        ThirdYearSection.add(Heading2);

        ThirdYearCourseTitleColumn.setPreferredSize(new java.awt.Dimension(550, 294));
        ThirdYearSection.add(ThirdYearCourseTitleColumn);

        ThirdYearCreditsAttemptedColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        ThirdYearCreditsAttemptedColumn.setPreferredSize(new java.awt.Dimension(150, 294));
        ThirdYearSection.add(ThirdYearCreditsAttemptedColumn);

        ThirdYearCreditsEarnedColumn.setPreferredSize(new java.awt.Dimension(130, 294));
        ThirdYearSection.add(ThirdYearCreditsEarnedColumn);

        ThirdYearFinalGradeColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        ThirdYearFinalGradeColumn.setPreferredSize(new java.awt.Dimension(138, 294));
        ThirdYearSection.add(ThirdYearFinalGradeColumn);

        Footer2.setPreferredSize(new java.awt.Dimension(968, 50));
        Footer2.setLayout(null);

        jLabel27.setText("School Year:");
        Footer2.add(jLabel27);
        jLabel27.setBounds(30, 20, 70, 16);

        ThirdYearSchoolYear.setText("2022-2023");
        Footer2.add(ThirdYearSchoolYear);
        ThirdYearSchoolYear.setBounds(120, 20, 100, 16);

        ThirdYearGPA.setText("0");
        Footer2.add(ThirdYearGPA);
        ThirdYearGPA.setBounds(890, 20, 40, 16);

        jLabel32.setText("GPA:");
        Footer2.add(jLabel32);
        jLabel32.setBounds(810, 20, 80, 16);

        jLabel33.setText("Total Credits:");
        Footer2.add(jLabel33);
        jLabel33.setBounds(397, 20, 100, 16);

        ThirdYearTotalCredits.setText("0");
        Footer2.add(ThirdYearTotalCredits);
        ThirdYearTotalCredits.setBounds(500, 20, 30, 16);

        ThirdYearSection.add(Footer2);

        TabPane.addTab("Third Year", ThirdYearSection);

        FourthYearSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        Heading3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel24.setPreferredSize(new java.awt.Dimension(550, 30));
        jPanel24.setLayout(new java.awt.GridLayout(1, 0));

        jLabel20.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Course Title");
        jLabel20.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel24.add(jLabel20);

        Heading3.add(jPanel24);

        jPanel25.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel25.setLayout(new java.awt.GridLayout(1, 0));

        jLabel21.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Credits Attempted");
        jPanel25.add(jLabel21);

        Heading3.add(jPanel25);

        jPanel26.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel26.setLayout(new java.awt.GridLayout(1, 0));

        jLabel22.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Credits Earned");
        jPanel26.add(jLabel22);

        Heading3.add(jPanel26);

        jPanel27.setPreferredSize(new java.awt.Dimension(138, 30));
        jPanel27.setLayout(new java.awt.GridLayout(1, 0));

        jLabel23.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Final Grade");
        jPanel27.add(jLabel23);

        Heading3.add(jPanel27);

        FourthYearSection.add(Heading3);

        FourthYearCourseTitleColumn.setPreferredSize(new java.awt.Dimension(550, 294));
        FourthYearSection.add(FourthYearCourseTitleColumn);

        FourthYearCreditsAttemptedColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        FourthYearCreditsAttemptedColumn.setPreferredSize(new java.awt.Dimension(150, 294));
        FourthYearSection.add(FourthYearCreditsAttemptedColumn);

        FourthYearCreditsEarnedColumn.setPreferredSize(new java.awt.Dimension(130, 294));
        FourthYearSection.add(FourthYearCreditsEarnedColumn);

        FourthYearFinalGradeColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        FourthYearFinalGradeColumn.setPreferredSize(new java.awt.Dimension(138, 294));
        FourthYearSection.add(FourthYearFinalGradeColumn);

        Footer3.setPreferredSize(new java.awt.Dimension(968, 50));
        Footer3.setLayout(null);

        jLabel34.setText("School Year:");
        Footer3.add(jLabel34);
        jLabel34.setBounds(30, 20, 70, 16);

        FourthYearSchoolYear.setText("2022-2023");
        Footer3.add(FourthYearSchoolYear);
        FourthYearSchoolYear.setBounds(120, 20, 100, 16);

        FourthYearGPA.setText("0");
        Footer3.add(FourthYearGPA);
        FourthYearGPA.setBounds(890, 20, 70, 16);

        jLabel35.setText("GPA:");
        Footer3.add(jLabel35);
        jLabel35.setBounds(810, 20, 70, 16);

        jLabel36.setText("Total Credits:");
        Footer3.add(jLabel36);
        jLabel36.setBounds(397, 20, 100, 16);

        FourthYearTotalCredits.setText("0");
        Footer3.add(FourthYearTotalCredits);
        FourthYearTotalCredits.setBounds(500, 20, 30, 16);

        FourthYearSection.add(Footer3);

        TabPane.addTab("Fourth Year", FourthYearSection);

        ContainerPanel.add(TabPane);

        add(ContainerPanel);
        ContainerPanel.setBounds(0, 0, 1006, 720);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel ContactInfoLabel;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JPanel Divider;
    private javax.swing.JLabel DobLabel;
    private javax.swing.JPanel FirstYearCourseTitleColumn;
    private javax.swing.JPanel FirstYearCreditsAttemptedColumn;
    private javax.swing.JPanel FirstYearCreditsEarnedColumn;
    private javax.swing.JPanel FirstYearFinalGradeColumn;
    private javax.swing.JLabel FirstYearGPA;
    private javax.swing.JLabel FirstYearSchoolYear;
    private javax.swing.JPanel FirstYearSection;
    private javax.swing.JLabel FirstYearTotalCredits;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Footer1;
    private javax.swing.JPanel Footer2;
    private javax.swing.JPanel Footer3;
    private javax.swing.JPanel FourthYearCourseTitleColumn;
    private javax.swing.JPanel FourthYearCreditsAttemptedColumn;
    private javax.swing.JPanel FourthYearCreditsEarnedColumn;
    private javax.swing.JPanel FourthYearFinalGradeColumn;
    private javax.swing.JLabel FourthYearGPA;
    private javax.swing.JLabel FourthYearSchoolYear;
    private javax.swing.JPanel FourthYearSection;
    private javax.swing.JLabel FourthYearTotalCredits;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderSection;
    private javax.swing.JPanel Heading;
    private javax.swing.JPanel Heading1;
    private javax.swing.JPanel Heading2;
    private javax.swing.JPanel Heading3;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel ParentLabel;
    private javax.swing.JPanel SchoolInformation;
    private javax.swing.JPanel SchoolLogo;
    private javax.swing.JPanel SchoolName;
    private javax.swing.JPanel SchoolSection;
    private javax.swing.JPanel SecondYearCourseTitleColumn;
    private javax.swing.JPanel SecondYearCreditsAttemptedColumn;
    private javax.swing.JPanel SecondYearCreditsEarnedColumn;
    private javax.swing.JPanel SecondYearFinalGradeColumn;
    private javax.swing.JLabel SecondYearGPA;
    private javax.swing.JLabel SecondYearSchoolYear;
    private javax.swing.JPanel SecondYearSection;
    private javax.swing.JLabel SecondYearTotalCredits;
    private javax.swing.JLabel SexLabel;
    private javax.swing.JLabel StudentAddress;
    private javax.swing.JLabel StudentContactNumber;
    private javax.swing.JLabel StudentDateOfBirth;
    private javax.swing.JLabel StudentFullName;
    private javax.swing.JPanel StudentInformation1;
    private javax.swing.JPanel StudentInformation2;
    private javax.swing.JLabel StudentParent;
    private javax.swing.JPanel StudentSection;
    private javax.swing.JLabel StudentSex;
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JPanel ThirdYearCourseTitleColumn;
    private javax.swing.JPanel ThirdYearCreditsAttemptedColumn;
    private javax.swing.JPanel ThirdYearCreditsEarnedColumn;
    private javax.swing.JPanel ThirdYearFinalGradeColumn;
    private javax.swing.JLabel ThirdYearGPA;
    private javax.swing.JLabel ThirdYearSchoolYear;
    private javax.swing.JPanel ThirdYearSection;
    private javax.swing.JLabel ThirdYearTotalCredits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}

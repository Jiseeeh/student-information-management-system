/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sims.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import sims.database.DatabaseConnector;
import sims.model.Fee;
import sims.model.Student;

/**
 *
 * @author Jireh
 */
public class PayFeesPanel extends javax.swing.JPanel {
   
    private Student student;

    /**
     * Creates new form PayFeesPanel
     *
     * @param student
     */
    public PayFeesPanel(Student student) {
        initComponents();
        this.student = student;

        setColumns(student.getFees());
    }

    private void setColumns(List<Fee> fees) {
        double totalAmount = 0;
        for (var fee : fees) {
            if (fee.getIsPending()) totalAmount += fee.getAmount();
            
            // DUE DATE COLUMN
            var feeDueDateLabel = labelGenerator(fee.getDueDate());
            var feeDuePanel = panelGenerator(feeDueDateLabel);
            DueDateColumn.add(feeDuePanel);

            // TITLE COLUMN
            var feeTitleLabel = labelGenerator(fee.getTitle());
            var feeTitlePanel = panelGenerator(feeTitleLabel);
            FeeTitleColumn.add(feeTitlePanel);

            // AMOUNT COLUMN
            var feeAmountLabel = labelGenerator(Double.toString(fee.getAmount()));
            var feeAmountPanel = panelGenerator(feeAmountLabel);
            AmountColumn.add(feeAmountPanel);

            // STATUS COLUMN
            var feeStatusLabel = labelGenerator(fee.getIsPending() ? "PENDING" : "PAID");
            var feeStatusPanel = panelGenerator(feeStatusLabel);
            StatusColumn.add(feeStatusPanel);
        }

        AmountLabel.setText(Double.toString(totalAmount));
    }

    private JLabel labelGenerator(String content) {
        JLabel label = new JLabel(content);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("JetBrains Mono", Font.PLAIN, 24));

        return label;
    }

    private JPanel panelGenerator(JLabel label) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 50));
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

        jLabel3 = new javax.swing.JLabel();
        MainContentSection = new javax.swing.JPanel();
        HeadingSectionPanel = new javax.swing.JPanel();
        DueDateHeading = new javax.swing.JPanel();
        DueDateHeadingText1 = new javax.swing.JLabel();
        FeeTitleHeading = new javax.swing.JPanel();
        FeeTitleHeadingText1 = new javax.swing.JLabel();
        AmountHeading = new javax.swing.JPanel();
        AmountHeadingText1 = new javax.swing.JLabel();
        StatusHeading = new javax.swing.JPanel();
        StatusHeadingText1 = new javax.swing.JLabel();
        DueDateColumn = new javax.swing.JPanel();
        FeeTitleColumn = new javax.swing.JPanel();
        AmountColumn = new javax.swing.JPanel();
        StatusColumn = new javax.swing.JPanel();
        FooterSection = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TotalLabel = new javax.swing.JLabel();
        AmountLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setPreferredSize(new java.awt.Dimension(1006, 680));

        MainContentSection.setPreferredSize(new java.awt.Dimension(1006, 520));
        MainContentSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        HeadingSectionPanel.setPreferredSize(new java.awt.Dimension(1006, 70));
        HeadingSectionPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        DueDateHeading.setBackground(new java.awt.Color(205, 205, 205));
        DueDateHeading.setPreferredSize(new java.awt.Dimension(300, 70));
        DueDateHeading.setLayout(new java.awt.GridLayout());

        DueDateHeadingText1.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        DueDateHeadingText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DueDateHeadingText1.setText("Due Date");
        DueDateHeading.add(DueDateHeadingText1);

        HeadingSectionPanel.add(DueDateHeading);

        FeeTitleHeading.setBackground(new java.awt.Color(205, 205, 205));
        FeeTitleHeading.setPreferredSize(new java.awt.Dimension(300, 70));
        FeeTitleHeading.setLayout(new java.awt.GridLayout());

        FeeTitleHeadingText1.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        FeeTitleHeadingText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FeeTitleHeadingText1.setText("Title");
        FeeTitleHeading.add(FeeTitleHeadingText1);

        HeadingSectionPanel.add(FeeTitleHeading);

        AmountHeading.setBackground(new java.awt.Color(205, 205, 205));
        AmountHeading.setPreferredSize(new java.awt.Dimension(190, 70));
        AmountHeading.setLayout(new java.awt.GridLayout());

        AmountHeadingText1.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        AmountHeadingText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AmountHeadingText1.setText("Amount");
        AmountHeading.add(AmountHeadingText1);

        HeadingSectionPanel.add(AmountHeading);

        StatusHeading.setBackground(new java.awt.Color(205, 205, 205));
        StatusHeading.setPreferredSize(new java.awt.Dimension(216, 70));
        StatusHeading.setLayout(new java.awt.GridLayout());

        StatusHeadingText1.setFont(new java.awt.Font("JetBrains Mono", 0, 36)); // NOI18N
        StatusHeadingText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusHeadingText1.setText("Status");
        StatusHeading.add(StatusHeadingText1);

        HeadingSectionPanel.add(StatusHeading);

        MainContentSection.add(HeadingSectionPanel);

        DueDateColumn.setBackground(new java.awt.Color(217, 217, 217));
        DueDateColumn.setPreferredSize(new java.awt.Dimension(300, 450));
        DueDateColumn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        MainContentSection.add(DueDateColumn);

        FeeTitleColumn.setBackground(new java.awt.Color(217, 217, 217));
        FeeTitleColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(205, 205, 205)));
        FeeTitleColumn.setPreferredSize(new java.awt.Dimension(300, 450));
        FeeTitleColumn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        MainContentSection.add(FeeTitleColumn);

        AmountColumn.setBackground(new java.awt.Color(217, 217, 217));
        AmountColumn.setPreferredSize(new java.awt.Dimension(190, 450));
        AmountColumn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        MainContentSection.add(AmountColumn);

        StatusColumn.setBackground(new java.awt.Color(217, 217, 217));
        StatusColumn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(205, 205, 205)));
        StatusColumn.setPreferredSize(new java.awt.Dimension(216, 450));
        StatusColumn.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));
        MainContentSection.add(StatusColumn);

        FooterSection.setBackground(new java.awt.Color(205, 205, 205));
        FooterSection.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(205, 205, 205)));
        FooterSection.setPreferredSize(new java.awt.Dimension(1006, 160));
        FooterSection.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(503, 200));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        TotalLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        TotalLabel.setText("Total:");
        jPanel3.add(TotalLabel);

        AmountLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        AmountLabel.setText("101023123");
        jPanel3.add(AmountLabel);

        FooterSection.add(jPanel3);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(503, 200));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jButton1.setText("Pay Fees");
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
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 104, 150, 40));

        FooterSection.add(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContentSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(FooterSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainContentSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(FooterSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String feeTitle = JOptionPane.showInputDialog("Enter fee title");

        for (var fee : student.getFees()) {
            if (fee.getTitle().toLowerCase().equals(feeTitle.toLowerCase())) {
                // IF ALREADY PAID
                if (!fee.getIsPending()) {
                    Modal.show("You already paid for " + fee.getTitle(), "Notice", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                String amount = JOptionPane.showInputDialog("Enter amount");

                while (Double.parseDouble(amount) < fee.getAmount()) {
                    Modal.show("Insufficient amount", "Notice", JOptionPane.WARNING_MESSAGE);
                    amount = JOptionPane.showInputDialog("Enter amount");
                }
                
                Modal.show("Your change is " + (Double.parseDouble(amount) - fee.getAmount()), "Notice", JOptionPane.INFORMATION_MESSAGE);

                String updateStatusQuery = """
                                          UPDATE fee
                                          SET isPending = 0
                                          WHERE id = %d
                                          """.formatted(fee.getId());

                try (var conn = DatabaseConnector.getConnection()) {
                    var updateStatusStmt = conn.prepareStatement(updateStatusQuery);
                    int updatedStatusRows = updateStatusStmt.executeUpdate();

                    if (updatedStatusRows > 0) {
                        System.out.println("UPDATE SUCCESS");
                    }

                    updateStatusStmt.close();

                    String getAllFeesQuery = """
                                            SELECT fee.id, fee.title,fee.isPending,fee.amount,fee.dueDate
                                            FROM fee
                                            INNER JOIN student
                                                ON student.id = fee.studentId
                                            WHERE fee.studentId = %d
                                             """.formatted(student.getId());

                    var getAllFeesStmt = conn.prepareStatement(getAllFeesQuery);
                    var getAllFeesResultSet = getAllFeesStmt.executeQuery();

                    var fees = new LinkedList<Fee>();

                    while (getAllFeesResultSet.next()) {
                        var currFee = new Fee(getAllFeesResultSet.getString("title"), getAllFeesResultSet.getString("dueDate"), getAllFeesResultSet.getDouble("amount"));
                        currFee.setId(getAllFeesResultSet.getInt("id"));
                        currFee.setIsPending(getAllFeesResultSet.getBoolean("isPending"));

                        fees.add(currFee);
                    }

                    student.setFees(fees);
                    
                    System.out.println(student.getFees().toString());
                    DueDateColumn.removeAll();
                    FeeTitleColumn.removeAll();
                    AmountColumn.removeAll();
                    StatusColumn.removeAll();
                    
                    setColumns(student.getFees());
                    
                    DueDateColumn.repaint();
                    DueDateColumn.revalidate();
                    
                    FeeTitleColumn.repaint();
                    FeeTitleColumn.revalidate();
                    
                    AmountColumn.repaint();
                    AmountColumn.revalidate();
                    
                    StatusColumn.repaint();
                    StatusColumn.revalidate();
                    
                    

                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(PayFeesPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
    }//GEN-LAST:event_jButton1ActionPerformed
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AmountColumn;
    private javax.swing.JPanel AmountHeading;
    private javax.swing.JLabel AmountHeadingText1;
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JPanel DueDateColumn;
    private javax.swing.JPanel DueDateHeading;
    private javax.swing.JLabel DueDateHeadingText1;
    private javax.swing.JPanel FeeTitleColumn;
    private javax.swing.JPanel FeeTitleHeading;
    private javax.swing.JLabel FeeTitleHeadingText1;
    private javax.swing.JPanel FooterSection;
    private javax.swing.JPanel HeadingSectionPanel;
    private javax.swing.JPanel MainContentSection;
    private javax.swing.JPanel StatusColumn;
    private javax.swing.JPanel StatusHeading;
    private javax.swing.JLabel StatusHeadingText1;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}

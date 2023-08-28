/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sims.ui;

/**
 *
 * @author Jireh
 */
public class WindowFrame extends javax.swing.JFrame {

    // Colors class which containts the custom colors
    Colors color = new Colors();
    public boolean isActive;

    /**
     * Creates new form MainFrame
     */
    public WindowFrame() {
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

        SidebarContainer = new javax.swing.JPanel();
        UserDetailsSection = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        ProfileSection = new javax.swing.JPanel();
        Icon1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CoursesSection = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Icon2 = new javax.swing.JLabel();
        PayFeesSection = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Icon3 = new javax.swing.JLabel();
        TOR_ReportSection = new javax.swing.JPanel();
        Icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        COR_ReportSection = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Icon4 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        SidebarContainer.setBackground(new java.awt.Color(217, 217, 217));

        UserDetailsSection.setBackground(new java.awt.Color(217, 217, 217));
        UserDetailsSection.setLayout(new java.awt.BorderLayout());

        SideBar.setBackground(new java.awt.Color(217, 217, 217));
        SideBar.setLayout(new java.awt.GridLayout(5, 1, 0, 30));

        ProfileSection.setBackground(new java.awt.Color(215, 215, 215));
        ProfileSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ProfileSection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProfileSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileSectionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileSectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileSectionMouseExited(evt);
            }
        });

        Icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon1.setText("Icon");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Profile");

        javax.swing.GroupLayout ProfileSectionLayout = new javax.swing.GroupLayout(ProfileSection);
        ProfileSection.setLayout(ProfileSectionLayout);
        ProfileSectionLayout.setHorizontalGroup(
            ProfileSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileSectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        ProfileSectionLayout.setVerticalGroup(
            ProfileSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfileSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Icon1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        SideBar.add(ProfileSection);

        CoursesSection.setBackground(new java.awt.Color(215, 215, 215));
        CoursesSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CoursesSection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CoursesSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CoursesSectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CoursesSectionMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Courses");

        Icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon2.setText("Icon");

        javax.swing.GroupLayout CoursesSectionLayout = new javax.swing.GroupLayout(CoursesSection);
        CoursesSection.setLayout(CoursesSectionLayout);
        CoursesSectionLayout.setHorizontalGroup(
            CoursesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesSectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        CoursesSectionLayout.setVerticalGroup(
            CoursesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CoursesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        SideBar.add(CoursesSection);

        PayFeesSection.setBackground(new java.awt.Color(215, 215, 215));
        PayFeesSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PayFeesSection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PayFeesSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PayFeesSectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayFeesSectionMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pay Fees");

        Icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon3.setText("Icon");

        javax.swing.GroupLayout PayFeesSectionLayout = new javax.swing.GroupLayout(PayFeesSection);
        PayFeesSection.setLayout(PayFeesSectionLayout);
        PayFeesSectionLayout.setHorizontalGroup(
            PayFeesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayFeesSectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PayFeesSectionLayout.setVerticalGroup(
            PayFeesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayFeesSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PayFeesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        SideBar.add(PayFeesSection);

        TOR_ReportSection.setBackground(new java.awt.Color(215, 215, 215));
        TOR_ReportSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TOR_ReportSection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TOR_ReportSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TOR_ReportSectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TOR_ReportSectionMouseExited(evt);
            }
        });

        Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon.setText("Icon");

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TOR Report");

        javax.swing.GroupLayout TOR_ReportSectionLayout = new javax.swing.GroupLayout(TOR_ReportSection);
        TOR_ReportSection.setLayout(TOR_ReportSectionLayout);
        TOR_ReportSectionLayout.setHorizontalGroup(
            TOR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOR_ReportSectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        TOR_ReportSectionLayout.setVerticalGroup(
            TOR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TOR_ReportSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TOR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        SideBar.add(TOR_ReportSection);

        COR_ReportSection.setBackground(new java.awt.Color(215, 215, 215));
        COR_ReportSection.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        COR_ReportSection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        COR_ReportSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COR_ReportSectionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COR_ReportSectionMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("COR Report");

        Icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icon4.setText("Icon");

        javax.swing.GroupLayout COR_ReportSectionLayout = new javax.swing.GroupLayout(COR_ReportSection);
        COR_ReportSection.setLayout(COR_ReportSectionLayout);
        COR_ReportSectionLayout.setHorizontalGroup(
            COR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COR_ReportSectionLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        COR_ReportSectionLayout.setVerticalGroup(
            COR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(COR_ReportSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(COR_ReportSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Icon4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        SideBar.add(COR_ReportSection);

        javax.swing.GroupLayout SidebarContainerLayout = new javax.swing.GroupLayout(SidebarContainer);
        SidebarContainer.setLayout(SidebarContainerLayout);
        SidebarContainerLayout.setHorizontalGroup(
            SidebarContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UserDetailsSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SideBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SidebarContainerLayout.setVerticalGroup(
            SidebarContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarContainerLayout.createSequentialGroup()
                .addComponent(UserDetailsSection, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidebarContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidebarContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileSectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileSectionMouseEntered
        ProfileSection.setBackground(color.hoverColor);
    }//GEN-LAST:event_ProfileSectionMouseEntered

    private void ProfileSectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileSectionMouseExited
        if (isActive) {
            ProfileSection.setBackground(color.primaryColor);
        }     
    }//GEN-LAST:event_ProfileSectionMouseExited

    private void CoursesSectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursesSectionMouseEntered
        CoursesSection.setBackground(color.hoverColor);
    }//GEN-LAST:event_CoursesSectionMouseEntered

    private void CoursesSectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoursesSectionMouseExited
        CoursesSection.setBackground(color.primaryColor);
    }//GEN-LAST:event_CoursesSectionMouseExited

    private void PayFeesSectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayFeesSectionMouseEntered
        PayFeesSection.setBackground(color.hoverColor);
    }//GEN-LAST:event_PayFeesSectionMouseEntered

    private void PayFeesSectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayFeesSectionMouseExited
        PayFeesSection.setBackground(color.primaryColor);
    }//GEN-LAST:event_PayFeesSectionMouseExited

    private void TOR_ReportSectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOR_ReportSectionMouseEntered
        TOR_ReportSection.setBackground(color.hoverColor);
    }//GEN-LAST:event_TOR_ReportSectionMouseEntered

    private void TOR_ReportSectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TOR_ReportSectionMouseExited
        TOR_ReportSection.setBackground(color.primaryColor);
    }//GEN-LAST:event_TOR_ReportSectionMouseExited

    private void COR_ReportSectionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COR_ReportSectionMouseEntered
        COR_ReportSection.setBackground(color.hoverColor);
    }//GEN-LAST:event_COR_ReportSectionMouseEntered

    private void COR_ReportSectionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COR_ReportSectionMouseExited
        COR_ReportSection.setBackground(color.primaryColor);

    }//GEN-LAST:event_COR_ReportSectionMouseExited

    private void ProfileSectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileSectionMouseClicked
        isActive = false;
        

        UserProfilePanel profilePanel = new UserProfilePanel();
        ContentPanel.add(profilePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        /*
            You need to call repaint() and revalidate() both in 
            order to replace all the elements from your JPanel.
        */
    }//GEN-LAST:event_ProfileSectionMouseClicked

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
            java.util.logging.Logger.getLogger(WindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel COR_ReportSection;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel CoursesSection;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Icon1;
    private javax.swing.JLabel Icon2;
    private javax.swing.JLabel Icon3;
    private javax.swing.JLabel Icon4;
    private javax.swing.JPanel PayFeesSection;
    private javax.swing.JPanel ProfileSection;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel SidebarContainer;
    private javax.swing.JPanel TOR_ReportSection;
    private javax.swing.JPanel UserDetailsSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

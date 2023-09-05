/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sims;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import sims.ui.MainFrame;

/**
 *
 * @author johnc
 */
public class StudentInformationManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* Create and display the form */
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("Error on setting look and feel.");
        }
        
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            var mainFrame = new MainFrame();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });
    }
}

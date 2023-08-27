/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.ui;

import javax.swing.JOptionPane;

/**
 *
 * @author johnc
 */
public class Modal {
     public static void show(String message, String modalTitle,int messageType) {
        JOptionPane.showMessageDialog(null,
                message,
                modalTitle,
                messageType);
    }
}

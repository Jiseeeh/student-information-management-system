/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.helper;

/**
 *
 * @author johnc
 */
public class Validator {
    public boolean isValidText (String input) {
         return !(input == null || input.trim().equals("") || input.matches("\\s+"));
    }
}

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

    public boolean isValidText(String input,boolean checkForDigits) {
        boolean isValid = true;
        
        if (input.toLowerCase() == null) isValid = false;
        else if (input.matches("\\s+")) isValid = false; // spaces
        else if (checkForDigits && input.matches(".*\\d+.*")) isValid = false; // digits
        
        return isValid;
    }
}

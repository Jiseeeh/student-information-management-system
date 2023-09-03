/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sims.Enum;

/**
 *
 * @author johnc
 */
public enum YearLevel {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    FOURTH("4");

    public final String label;

    private YearLevel(String label) {
        this.label = label;
    }
}

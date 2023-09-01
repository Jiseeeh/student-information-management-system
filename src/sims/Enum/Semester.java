/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sims.Enum;

/**
 *
 * @author johnc
 */
public enum Semester {
    FIRST("1"),
    SECOND("2");

    public final String label;

    private Semester(String label) {
        this.label = label;
    }
}

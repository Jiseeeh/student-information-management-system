/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;

/**
 *
 * @author johnc
 */
public class Fee {
    private String title;
    private String dueDate;
    private boolean isPending;
    private double amount;

    public Fee(String title, String dueDate, double amount) {
        this.title = title;
        this.dueDate = dueDate;
        this.amount = amount;
        this.isPending = true;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @return the isPending
     */
    public boolean getIsPending() {
        return isPending;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }
    
    /**
     * @param isPending the isPending to set
     */
    public void setIsPending(boolean isPending) {
        this.isPending = isPending;
    }
}

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
    private int id;
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

    @Override
    public String toString() {
        return "Fee{" + "id=" + getId() + ", title=" + title + ", dueDate=" + dueDate + ", isPending=" + isPending + ", amount=" + amount + '}';
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

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}

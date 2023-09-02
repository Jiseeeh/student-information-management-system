/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;

import java.util.List;

/**
 *
 * @author johnc
 */
public class Student {
    private Email email;
    private String middleName;
    private String address;
    private String sex;
    private String guardianName;
    private String birthday;
    private String contactNumber;
    private String studentNumber;
    private String yearLevel;
    private String currentSem;
    private String section;
    private List<StudentSubject> subjects;
    private List<Fee> fees;
    private int id;

    /**
     * @return the email
     */
    public Email getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(Email email) {
        this.email = email;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the guardianName
     */
    public String getGuardianName() {
        return guardianName;
    }

    /**
     * @param guardianName the guardianName to set
     */
    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the studentNumber
     */
    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
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

    /**
     * @return the yearLevel
     */
    public String getYearLevel() {
        return yearLevel;
    }

    /**
     * @param yearLevel the yearLevel to set
     */
    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the subjects
     */
    public List<StudentSubject> getSubjects() {
        return subjects;
    }

    /**
     * @param subjects the subjects to set
     */
    public void setSubjects(List<StudentSubject> subjects) {
        this.subjects = subjects;
    }

    /**
     * @return the currentSem
     */
    public String getCurrentSem() {
        return currentSem;
    }

    /**
     * @param currentSem the currentSem to set
     */
    public void setCurrentSem(String currentSem) {
        this.currentSem = currentSem;
    }

    /**
     * @return the fees
     */
    public List<Fee> getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    
    }

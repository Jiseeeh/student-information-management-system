/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;
/**
 *
 * @author johnc
 */
public class StudentSubject {
   private String subjectCode;
   private String faculty;
   private String subjectTitle;
   private String remarks;
   private String units;
   private String semester;
   private double grade;
   private String yearLevel;

    

   public StudentSubject (String subjectCode, String subjectTitle,String faculty,String units,String yearLevel,String semester) {
       this.subjectCode = subjectCode;
       this.subjectTitle = subjectTitle;
       this.faculty = faculty;
       this.units = units;
       this.semester = semester;
       this.yearLevel = yearLevel;
   }

    @Override
    public String toString() {
        return "StudentSubject{" + "subjectCode=" + subjectCode + ", faculty=" + faculty + ", subjectTitle=" + subjectTitle + ", remarks=" + remarks + ", units=" + units + ", semester=" + semester + ", grade=" + grade + ", yearLevel=" + yearLevel + '}';
    }

    /**
     * @return the subjectCode
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the subjectTitle
     */
    public String getSubjectTitle() {
        return subjectTitle;
    }

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return the units
     */
    public String getUnits() {
        return units;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * @return the yearLevel
     */
    public String getYearLevel() {
        return yearLevel;
    }
    
}

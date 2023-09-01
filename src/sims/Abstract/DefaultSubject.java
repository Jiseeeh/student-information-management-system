/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.Abstract;

import java.util.List;
import sims.model.StudentSubject;

/**
 *
 * @author johnc
 */
public abstract class DefaultSubject {
    public abstract List<StudentSubject> getFirstYearFirstSem();
    public abstract List<StudentSubject> getFirstYearSecondSem();
    public abstract List<StudentSubject> getSecondYearFirstSem();
    public abstract List<StudentSubject> getSecondYearSecondSem();
    public abstract List<StudentSubject> getThirdYearFirstSem();
    public abstract List<StudentSubject> getThirdYearSecondSem();
    public abstract List<StudentSubject> getFourthYearFirstSem();
    public abstract List<StudentSubject> getFourthYearSecondSem();
}

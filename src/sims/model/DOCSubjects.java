/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;

import sims.Abstract.DefaultSubject;
import java.util.LinkedList;
import java.util.List;
import sims.Enum.Semester;
import sims.Enum.YearLevel;

/**
 *
 * @author johnc
 */
public class DOCSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemDOCSubjects = new LinkedList<StudentSubject>();
        firstYearFirstSemDOCSubjects.add(new StudentSubject("GNED 1", "Art Appreciation", "Ryan Landicho", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("GNED 2", "Ethics", "Alonso Salazaro", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("GNED 3", "Mathematics in the Modern World", "Angelo Flores", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("GNED 4", "Mga Babasahin Hinggil sa Kasaysayan ng Pilipinas", "Kylen Manuel", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("CRIM 1", "Introduction to Criminology", "Cedric Villaruel", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("CLAW 1", "Introduction to the Criminal Justice System", "Shawn Salinas", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("FITT 5", "Fundamental of Martial Arts", "Dream Quiambao", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("NSTP 1", "National Service Training Program 1", "John Lloyd Cano", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDOCSubjects.add(new StudentSubject("CVSU 101", "Institutional Orientation", "Landis Velasquez", "1", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemDOCSubjects = new LinkedList<StudentSubject>();
        firstYearSecondSemDOCSubjects.add(new StudentSubject("GNED 5", "Purposive Communication", "Stephanie Salcedo", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("GNED 6", "Science, Technology and Society", "Aurora Dominguez", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("GNED 10", "Gender and Society", "Alina Barrios", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 2", "Theories of Crime Causation", "Acadia Gomez", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("CLAW 2", "Human Rights Education", "Samantha Oliva", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("LEAD 1", "Law Enforcement Org and Admin (Inter-agency Approach)", "Serenity Cariño", "4", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("FITT 6", "Arnis & Disarming Techniques", "Jeneth Moreno", "2", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDOCSubjects.add(new StudentSubject("NSTP 2", "National Service Training Program 2", "Jovia Martinez", "3", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemDOCSubjects = new LinkedList<StudentSubject>();
        secondYearFirstSemDOCSubjects.add(new StudentSubject("CRIM 3", "Human Behavior & Victimology", "Alfie Tolentino", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("LEAD 2", "Comparative Models in Policing", "Noah Jacinto", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("LEAD 3", "Introduction to Industrial Security Administration", "Caelan Gamboa", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 1", "Fundamentals of Investigation and Intelligence", "Miles Marcelino", "4", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 2", "Specialized Crime Investigation 1 with Legal Medicine", "Justine Alvarez", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("FOSC 1", "Forensic Photography", "Jonathan Ignacio", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("CLAW 3", "Criminal Law (Book 1)", "Albert Rodrigo", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDOCSubjects.add(new StudentSubject("FITT 7", "First Aid & Water Survival", "Dexter Hernandez", "2", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemDOCSubjects = new LinkedList<StudentSubject>();
        secondYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 4", "Professional Conduct & Ethical Std.", "John Carlo Carreon", "2", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 5", "Juvenile Del. & Juvenile Justice System", "Itzan Flores", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("LEAD 4", "Law Enforcement Operations and Planning with Crime Mapping", "Erica Neri", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("CDIN 3", "Specialized Crime Investigation 2", "Acadia Lucas", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("CHEM 5", "General Chemistry (Organic)", "Vivi Atienza", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("FOSC 2", "Personal Identification Techniques", "Valerie Hipolito", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("CLAW 4", "Criminal Law (Book 2)", "Nathalie Salazar", "4", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDOCSubjects.add(new StudentSubject("FITT 8", "Fundamentals of Marksmanship", "Nathalie Alarcon", "3", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemDOCSubjects = new LinkedList<StudentSubject>();
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("FOSC 3", "Forensic Chemistry & Toxicology", "Kyel Panes", "5", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("FOSC 4", "Questioned Document Examination", "Angelo Cristobal", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("CRIM 6", "Dispute Resolution & Crises/Incidents Mgmt.", "Jonas Villegas", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("CLAW 4-A", "Special Penal Laws", "Vin Dominguez", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 4", "Traffic Management and Accident Investigation with Driving", "Morris Duran", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 5", "Tech Eng. 1 (Tech. Rep. Writing & Presentation)", "Kemp Chua", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("COAD 1", "Institutional Corrections", "Aaron Corpuz", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDOCSubjects.add(new StudentSubject("CFLM 1", "Character Formation, Nationalism & Patriotism", "Eugene Tuazon", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemDOCSubjects = new LinkedList<StudentSubject>();
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 7", "Criminological Research 1 (Res.Methods w/ Applied Statistics)", "Jejomar Reyes", "4", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CLAW 5", "Evidence", "Jovie Fuentes", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("FOSC 5", "Lie Detection Techniques", "Angelica Estrella", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CDIN 6", "Fire Protection and Arson Investigation", "Angelou Calma", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CDIN 7", "Vice and Drug Education and Control", "Viola Canlas", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CDIN 8", "Technical English 2 (Legal Forms)", "Louvel Pimentel", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("COAD 2", "Non-Institutional Corrections", "Cassie Vidal", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDOCSubjects.add(new StudentSubject("CFLM 2", "Character Formation w/ Leadership, Decision Making, Mgmt & Admin", "Sylvia Manansala", "3", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemDOCSubjects = new LinkedList<StudentSubject>();
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("FOSC 6", "Forensic Ballistics", "Nathaniel Marcelino", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("CLAW 6", "Criminal Procedure & Court Testimony", "John Paul Natividad", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 9", "Introduction to Cybercrime and Digital Forensic Investigation", "Noah Lazaro", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("CDIN 10", "Environmental Laws & Protection with Disaster Risk Mitigation", "Luca Fernandez", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("CRIM 8", "Criminological Research 2 (Thesis Writing & Presentation)", "Benjamin Mendez", "4", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("CRIM 197", "Competency Appraisal 1", "Bryan Castañeda", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDOCSubjects.add(new StudentSubject("COAD 3", "Therapeutic Modalities", "Theo Dionisio", "2", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemDOCSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemDOCSubjects = new LinkedList<StudentSubject>();
        fourthYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 199", "Internship (On-the Job Training1&2) (540 Field Hours)", "Lillian Diaz", "6", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemDOCSubjects.add(new StudentSubject("CRIM 198", "Competency Appraisal 2", "Erica Sotto", "3", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemDOCSubjects;
    }
}

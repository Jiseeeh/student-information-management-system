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
public class DCSInformationTechSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemSubjects = new LinkedList<StudentSubject>();

        firstYearFirstSemSubjects.add(new StudentSubject("GNED 2", "ETHICS", "Christian Arellano", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 5", "PURPOSIVE COMMUNICATION", "Pablito Sursugon", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 11", "KONTEKSTWALISADONG KOMUNIKASYON SA FILIPINO", "Laura Gara", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("COSC 50", "DISCRETE STRUCTURE", "Guzman Dela Cruz", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("DCIT 21", "INTRODUCTION TO COMPUTING", "Rico Beltran", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("DCIT 22", "COMPUTER PROGRAMMING 1", "Arvin Dela Rosa", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("FITT 1", "MOVEMENT ENHANCEMENT", "Kai Lakay", "4", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("NSTP 1", "National Service Training Program 1", "Jacob Talbo", "2", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("ORNT 1", "INSTITUTIONAL ORIENTATION", "Jerome Mendez", "1", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemSubjects = new LinkedList<StudentSubject>();

        firstYearSecondSemSubjects.add(new StudentSubject("GNED 6", "SCIENCE, TECHNOLOGY AND SOCIETY", "Jerome Adams", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 1", "ARTS APPRECIATION", "Nicole Canon", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 12", "DALUMAT NG/SA FILIPINO", "Ryan Agasi", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 3", "MATHEMATICS IN THE MODERN WORLD", "Crisanta Montana", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("DCIT 23", "COMPUTER PROGRAMMING 2", "Nathaniel Villar", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("ITEC 50", "WEB SYSTEM AND TECHNOLOGY 1", "Xavier Endaya", "4", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("FITT 2", "Fitness Exercise", "Calili Halimaw", "2", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("NSTP 2", "National Service Training Program 2", "Harlem Argañosa", "3", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemSubjects = new LinkedList<StudentSubject>();

        secondYearFirstSemSubjects.add(new StudentSubject("GNED 4", "MGA BABASAHIN HINGIL SA KASAYSAYAN NG FILIPINO", "Jonvic Rodrigo", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("GNED 7", "THE CONTEMPORARY WORLD", "Maria Chan", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("GNED 10", "GENDER AND SOCIETY", "Jason Castro", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("ITEC 55", "PLATFORM TECHNOLOGY", "Jimmy Alapag", "4", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("DCIT 24", "INFORMATION MANAGEMENT", "Justine Vasquez", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("DCIT 50", "OBJECT ORIENTED PROGRAMMING", "Jayjay Honteveros", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("FITT 3", "PHYSICAL ACTIVITIES TOWARDS HEALTH AND FITNESS 1", "Hector Salamanca", "2", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemSubjects = new LinkedList<StudentSubject>();

        secondYearSecondSemSubjects.add(new StudentSubject("GNED 8", "UNDERSTANDING THE SELF", "John Ken Adolfo", "2", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("DCIT 25", "DATA STRUCTURE AND ALGORITHM", "Jericho Arabia", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("ITEC 60", "INTEGRATED PROGRAMMING AND TECHNOLOGIES 1", "Ivan Abuniawan", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("ITEC 65", "OPEN SOURCE TECHNOLOGY", "Patricia Guibe", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("DCIT 55", "ADVANCED DATABASE SYSTEM", "Lorie Areglado", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("ITEC 70", "MULTIMEDIA SYSTEM", "Glenn Dinatil", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("FITT 4", "PHYSICAL ACTIVITIES TOWARDS HEALTH AND FITNESS 2", "Jeffrey Quillano", "3", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemSubjects = new LinkedList<StudentSubject>();

        thirdYearFirstSemSubjects.add(new StudentSubject("ITEC 80", "INTRODUCTION TO HUMAN COMPUTER INTERACTION", "Paula Deen", "5", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("ITEC 85", "INFORMATION ASSURANCE AND SECURITY 1", "Maria Espera", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("ITEC 90", "NETWORKS AND FUNDAMENTALS", "Ellie Buvelle", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("INSY", "SYSTEM ANALYSIS AND DESIGN", "Nerilyn Arizo", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("DCIT 26", "APPLICATION DEVELOPMENT AND EMERGING TECHNOLOGIES", "Cyrus Apao", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("DCIT 60", "METHODS OF RESEARCH", "Rowena Dela Cruz", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemSubjects = new LinkedList<StudentSubject>();

        thirdYearSecondSemSubjects.add(new StudentSubject("GNED 9", "RIZAL: LIFE, WORKS, AND WRITINGS", "Jomarie Lucha", "4", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("ITEC 95", "Quantitative Methods (Modelling and Simulation)", "Jaycel Valencia", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("101", "IT ELECTIVE 1 (HUMAN COMPUTER INTERACTION 2)", "Christine Bote", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("106", "IT ELECTIVE 2 (WEB SYSTEM AND TECHNOLOGIES 2)", "Lea Oliva", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("100", "INFORMATION ASSURANCE AND SECURITY 2", "Daniel Mission", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("105", "NETWORK MANAGEMENT", "Wilson Raniel", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("ITEC 200A", "CAPSTONE PROJECT AND RESEARCH 1", "Wilbert Rambo", "3", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemSubjects = new LinkedList<StudentSubject>();

        fourthYearFirstSemSubjects.add(new StudentSubject("DCIT 65", "SOCIAL AND PROFESSIONAL ISSUES", "Kevin Hart", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("ITEC 111", "IT ELECTIVE 3 (INTEGRATED PROGRAMMING AND TECHNOLOGIES 2)", "Junmar Fajardo", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("ITEC 116", "IT ELECTIVE 4 (SYSTEM AND INTEGRATION AND ARCHITECTURE 2)", "James Yap", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("ITEC 110", "SYSTEM ADMINISTRATION AND MAINTENANCE", "Calvin Abueva", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("ITEC 200B", "CAPSTONE PROJECT AND RESEARCH 2", "Romeo Terrence", "3", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemSubjects = new LinkedList<StudentSubject>();

        fourthYearSecondSemSubjects.add(new StudentSubject("ITEC 199", "PRACTICUM (MINIMUM 486 HOURS)", "Jerick Dela Cruz", "1", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemSubjects;
    }

}

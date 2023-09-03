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
public class DOEMajorMathSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemSubjects = new LinkedList<StudentSubject>();

        firstYearFirstSemSubjects.add(new StudentSubject("GNED 11", "KONTEKSTWALISADONG KOMUNIKASYON SA FILIPINO", "Christian Guillermo", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 5", "PURPOSIVE COMMUNICATION", "Alberto Pablo", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 3", "Mathematics in the Modern World", "Fergus Laurente", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("EDUC 50", "CHILD AND ADOLESCENT LEARNER AND LEARNING PRINCIPLES", "Daniel Guzman", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("EDUC 55", "THE TEACHING PROFESSION", "Elton Rico", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("EDUC 60", "THE TEACHER AND COMMUNITY, SCHOOL CULTURE AND ORGANIZATION", "Arvin Dela Cruz", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("FITT 1", "MOVEMENT ENHANCEMENT", "Ernie Sotto", "2", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("NSTP 1", "National Service Training Program 1", "Jacob Vasquez", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("BSEM 22", "COLLEGE AND ADVANCED ALGEBRA", "Jerome Mendez", "1", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemSubjects = new LinkedList<StudentSubject>();

        firstYearSecondSemSubjects.add(new StudentSubject("GNED 6", "SCIENCE, TECHNOLOGY AND SOCIETY", "Christian Mendez", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 8", "UNDERSTANDING THE SELF", "Jaime Nicolas", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 14", "PANITIKANG PANLIPUNAN", "Ryan Bang", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("EDUC 65", "FOUNDATION OF SPECIAL AND INCLUSIVE EDUCATION", "Crisanto Pangilinan", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("EDUC 70", "FACILITATING LEARNER-CENTERED TEACHING", "Nathan Bao", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("EDUC 85", "TECHNOLOGY FOR TEACHING AND LEARNING 1", "Xavier Andaya", "4", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("FITT 2", "Fitness Exercise", "Calix Blanco", "2", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("NSTP 2", "National Service Training Program 2", "Harlem Abaw", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("BSEM 24", "PLANE AND SOLID GEOMETRY", "Nathan Apao", "3", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemSubjects = new LinkedList<StudentSubject>();

        secondYearFirstSemSubjects.add(new StudentSubject("EDUC 75", "ASSESSMENT IN LEARNING 1", "Wilfredo Alarcon", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("EDUC 90", "THE TEACHER AND SCHOOL CURRICULUM", "Mechor Camao", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEM 23", "TRIGONOMETRY", "Jalen Dequintos", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEM 25", "LOGIC AND SET THEORY", "Miles Marcelo", "4", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEM 26", "ELEMENTARY STATISTICS AND PROBABILITY", "Justine Alcubi", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEM 30", "MODERN GEOMETRY", "Jonathan Apayo", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("GNED 04", "MGA BABASAHIN HINGGIL SA KASAYSAYAN NG PILIPINAS", "Alberto Rodriguez", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("FITT 3", "PHYSICAL ACTIVIES TOWARDS HEALTH AND FITNESS 1", "Hextor Hernando", "2", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemSubjects = new LinkedList<StudentSubject>();

        secondYearSecondSemSubjects.add(new StudentSubject("EDUC 80", "ASSESSMENT LEARNING 2", "John Arvie Clutch", "2", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("EDUC 95", "BUILDING AND ENHANCING NEW LITERACIES ACROSS THE CURRICULUM", "Kylen Flores", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEM 27", "CALCULUS 1 WITH ANALYTIC GEOMETRY", "Erica Chan", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEM 33", "LINEAR ALGEBRA", "Lucas Graham", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEM 34", "ADVANCE STATISTICS", "Viva Melchor", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("GNED 15", "WORLD LITERATURE", "Jam Reyes", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("FITT 4", "PHYSICAL ACTIVIES TOWARDS HEALTH AND FITNESS 2", "Benjie Cone", "3", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemSubjects = new LinkedList<StudentSubject>();

        thirdYearFirstSemSubjects.add(new StudentSubject("EDFS 21A", "FIELD STUDY 1", "Kyla Panis", "5", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEM 28", "CALCULUS 2", "Angelo Panal", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEM 32", "NUMBER THEORY", "Jonas Endaya", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEM 35", "PROBLEM SOLVING, MATHEMATICAL INVESTIGATION AND MODELING", "Viviys Cortez", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEM 36", "PRINCIPLES AND METHOD OF TEACHING MATHEMATICS", "Durant Kobe", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEM 39", "TECHNOLOGY FOR TEACHING AND LEARNING 2", "Ken Tampoog", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("GNED 12", "DALUMAT NG/SA FILIPINO", "Aaron Reyes", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemSubjects = new LinkedList<StudentSubject>();

        thirdYearSecondSemSubjects.add(new StudentSubject("EDFS 22A", "FIELD STUDY 2", "Jejomar Binay", "4", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEM 29", "CALCULUS 2", "Fuentes Arellano", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEM 31", "MATHEMATICS OF INVESTMENT", "Angelica Soriano", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEM 37", "ABSTRACT ALGEBRA", "Argelica Santos", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEM 38", "RESEARCH IN MATHEMATICS", "Celly Santos", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEM 40", "ASSESSMENT AND EVALUATION IN MATHEMATICS", "Louie Bacani", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("EDUC 197", "COMPETENCY APPRAISAL 1", "Jessa Visval", "3", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemSubjects = new LinkedList<StudentSubject>();

        fourthYearFirstSemSubjects.add(new StudentSubject("EDFS 23A", "TEACHING INTERNSHIP", "Johnny Sins", "3", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemSubjects = new LinkedList<StudentSubject>();

        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 01", "ART APPRECIATION", "Ryan Garcia", "6", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 02", "ETHICS", "Alvin Musang", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 07", "THE CONTEMPORARY WORLD", "John Paul Bote", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 09", "RIZAL'S LIFE AND WORKS", "Jonas Prado", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 10A", "GENDER AND SOCIETY", "Lucas Corpuz", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 13", "ETORIKA/MASINING NG PAGPAPAHAYAG", "Dani;p Narciso", "4", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("EDUC 198", "COMPETENCY APPRAISAL 2", "Bryan Arcilla", "3", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemSubjects;
    }

}

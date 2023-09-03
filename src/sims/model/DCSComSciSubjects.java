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
public class DCSComSciSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemDCSSubjects = new LinkedList<StudentSubject>();
        firstYearFirstSemDCSSubjects.add(new StudentSubject("GNED 02", "Ethics", "Johnny Sins", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("GNED 05", "Purposive Communication", "John David Dela Cruz", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("GNED 11", "Kontekswalisadong komunikasyon sa Filipino", "Althea ann V Seno", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("COSC 50A", "Discrete Structure", "John Dea P Via", "3", YearLevel.FIRST.label, "1"));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 21A", "Introduction to computing", "Christian Flores", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 22A", "Computer Programming 1", "Christine Espinosa", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("FITT 1", "Movement Enhancement", "Jackeline Laurita Buncio Rioja", "2", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("CVSU 101", "Institutional Orientation", "Viviana Soledada Saripada Ancheta", "1", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemDCSSubjects.add(new StudentSubject("NSTP 1", "National Service Training Program 1", "Gabriela Meredith Kali Elorza", "3", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemDCSSubjects = new LinkedList<StudentSubject>();
        firstYearSecondSemDCSSubjects.add(new StudentSubject("GNED 01", "Art Appreciation", "Dania Pilar B. Naval", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("GNED 03", "Mathematics in the Modern World", "Amari Sarita G. Macalinao", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("GNED 06", "Science, Technology and Society", "Rosalinda Annabella Y. Marcelo", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("GNED 012", "Dalamat ng/Sa Filipino", "Annika N. Sibug", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("DCIT 23A", "Computer Programming 2", "Ivy Cassidy L. Decatoria", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("ITEC 50A", "Web System and Technologies 1", "Carley Hanna A. Hinojosa", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("FITT 2", "FITNESS EXERCISE", "Sophiel Sagun", "2", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemDCSSubjects.add(new StudentSubject("NSTP 2", "National Service Training Program 2", "Mary Joy Sanchez", "3", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemDCSSubjects = new LinkedList<StudentSubject>();
        secondYearFirstSemDCSSubjects.add(new StudentSubject("GNED 04", "Mga Babasahin hinggil sa kasaysayan ng Pilipinas", "Jv Fabila", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("MATH 1A", "Analytic Geometry", "Acadia Estrella", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("COSC 55A", "Discrete Structure 2", "Angelica Cuizon", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("COSC 60B", "Digital Login Design", "Ellie Musa", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 50A", "Object Oriented Programming", "Stephanie Mangubat", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 24A", "Information Management", "Alizeé Crisostomo", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("INSY 50", "Fundamental of Information System", "Francine Navarro", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemDCSSubjects.add(new StudentSubject("FITT 3", "Physical Activities Towards Health and Fitness 1", "Aaliyah Marasigan", "2", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemDCSSubjects = new LinkedList<StudentSubject>();
        secondYearSecondSemDCSSubjects.add(new StudentSubject("GNED 08", "Understanding the Self", "Rosa Blanco", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("GNED 14", "Panitikang Panlipunan", "Jenny Ferrer", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("MATH 2A", "Calculus", "Mary Joy Bondoc", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("COSC 65B", "Architecture and Organization", "Stephanie Peralta", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("COSC 70A", "Software Engineering 1", "Charlotte Ortega", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("DCIT 25A", "Data Structure and Algorithms", "Jovia Lee", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("DCIT 55A", "Advanced Database Management System", "Lyka Mae Abdul", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemDCSSubjects.add(new StudentSubject("FITT 4", "Physical Activities Towards Health and Fitness 2", "Janice de La Cruz", "2", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemDCSSubjects = new LinkedList<StudentSubject>();
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("MATH 3A", "Linear Algebra", "Quinn Cunanan", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("COSC 75A", "Software Engineering II", "Liddy Francisco", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("COSC 80B", "Operating System", "Natalie Baylon", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("COSC 85A", "Network and Communication", "Jaime Cervantes", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("COSC 101", "CS elective 1 (Computer Graphics and Visual Computing)", "John Carlo Santa Ana", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 26A", "Application DEVT and Emerging Technologies", "Ethaniel Villamor", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemDCSSubjects.add(new StudentSubject("DCIT 65A", "Social and Professional Issues", "Melchor Clemente", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemDCSSubjects = new LinkedList<StudentSubject>();

        thirdYearSecondSemDCSSubjects.add(new StudentSubject("GNED 09", "Rizal’s Life and Works", "Mario Rizal", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("MATH 4B", "Experimental Statistics", "Julian Roldan", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("COSC 90", "Design Analysis and Algorithm", "Clench Santino", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("COSC 95", "Programming Languages", "Kevin Smith", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("COSC 106", "CS Elective 2(Introduction to game development)", "Arvie Fabila", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("DCIT 60B", "Methods of Research", "Jv Tokong", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("ITEC 85C", "Information Assurance and Security", "Gabriel Cunanan", "2", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemDCSSubjects.add(new StudentSubject("GNED 10A", "Gender and Society", "Riley Lozano", "3", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemDCSSubjects = new LinkedList<StudentSubject>();

        fourthYearFirstSemDCSSubjects.add(new StudentSubject("ITEC 80D", "Human Computer Interaction", "Alina Dizon", "1", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDCSSubjects.add(new StudentSubject("COSC 100B", "Automata Theory and Formal Languages", "Gillian Garcia", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDCSSubjects.add(new StudentSubject("COSC 105", "Intelligent System", "Aurora Bernal", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDCSSubjects.add(new StudentSubject("COSC 111B", "CS Elective 3(Internet of Things)", "Jessa Mae Ariola", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemDCSSubjects.add(new StudentSubject("COSC 200-A", "Undergraduated Thesis 1", "Mary Joy Junio", "3", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemDCSSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemDCSSubjects = new LinkedList<StudentSubject>();

        fourthYearSecondSemDCSSubjects.add(new StudentSubject("GNED 07", "The Contemporary World", "Jenny Alvarado", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemDCSSubjects.add(new StudentSubject("COCS 110", "Numerical and Symbolic Computation", "Ashley Marcelo", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemDCSSubjects.add(new StudentSubject("COSC 200-B", "Undergraduated Thesis II", "Avis Galang", "3", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemDCSSubjects;
    }

}

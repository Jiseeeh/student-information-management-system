/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.model;

import java.util.LinkedList;
import sims.Abstract.DefaultSubject;
import java.util.List;
import sims.Enum.Semester;
import sims.Enum.YearLevel;

/**
 *
 * @author johnc
 */
public class DOEMajorEnglishSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemSubjects = new LinkedList<StudentSubject>();

        firstYearFirstSemSubjects.add(new StudentSubject("GNED 03", "Mathematics in the Modern World", "Wilfred Garcia", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 05", "Purposive Communication", "Jalen Dionisio", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 11", "Kontekstwalisadong komunikasyon sa Filipino", "Rodrigo Felipe", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("EDUC 55", "The Teaching Profession", "Dexter Estrella", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("EDUC 60", "The Teacher and The Community, School Culture and Organization Leadership", "Sunday Ocampo", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("BSEE 21", "Introduction to Linguistic", "Luca Espinosa", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("FITT 1", "Movement Enhancement", "Morris Bartolome", "2", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("NSTP 1", "CWTS/ LTC /ROTC", "Aaron Gallardo", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("CVSU 101", "Institutional Orientation", "Jacob Carreon", "1", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemSubjects = new LinkedList<StudentSubject>();

        firstYearSecondSemSubjects.add(new StudentSubject("GNED 06", "Science, Technologies and Society", "Faro Ang", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 08", "Understanding the Self", "Evan Bernal", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("GNED 14", "Panitikang Panlipunan", "Wilfred Castillo", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("EDUC 65", "Foundation of Special and Inclusive Education", "Alvin Mercado", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("EDUC 85", "Technology for Teaching and Learning 1", "John Mark Panes", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("BSEE 22", "Language, Culture, and Society", "Caelan Pilapil", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("FITT 2", "Fitness Exercises", "Kenneth Mariano", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("NSTP 2", "CWTS / LTS / ROTC", "Gabriel Quiambao", "3", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemSubjects = new LinkedList<StudentSubject>();

        secondYearFirstSemSubjects.add(new StudentSubject("EDUC 75", "Assessment in Learning 1", "Fraley del Mundo", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("EDUC 90", "The Teacher and The School Curriculum", "Daniel Sales", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEE 23", "Structure of English", "Theo Duran", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEE 24", "Principles and Theories of Languages Acquisition and Learning", "Bryan de La Cruz", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEE 33", "Mythology and Folklore", "Alfie Dulay", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BSEE 10", "Stylistics and Discourse Analysis", "Jonathan Tolentino", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("GNED 04", "Mga Babasahin Hinggil sa Kasaysayan ng Pilipinas", "Crisanto Tuazon", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("FITT 3", "Physical Activities towards Health and Fitness 1", "Vin Barrientos", "2", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemSubjects = new LinkedList<StudentSubject>();

        secondYearSecondSemSubjects.add(new StudentSubject("EDUC 80", "Assessment in Learning 2", "Angelo Lachica", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("EDUC 95", "Building and Enhancing New Literacies Across the Curriculum", "Axel Aquino", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEE 25", "Language Programs and Policies in Multilingual Society", "Alistair Uy", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEE 26", "Language Learning Materials Development", "Murphy Gallego", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEE 32", "Children and Adolescent Literature", "Jayson Cunanan", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BSEE 39", "Technical Writing", "Benny Tuazon", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("GNED 15", "World Literature", "Alvin de Mesa", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("FITT 4", "Physical Activities towards Health and Fitness II", "Wilfred Angeles", "2", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemSubjects = new LinkedList<StudentSubject>();

        thirdYearFirstSemSubjects.add(new StudentSubject("EDFS 21", "Field Study 1 – Observation Teaching-Learning in Actual School Environment", "Hailey Mateo", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEE 28", "Teaching and Assessment of Macroskills", "Hyacinth Borja", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEE 29", "Teaching and Assessment of Grammar", "Janice Pascual", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEE 36", "Survey of English and American Literature", "Jyn Sanchez", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEE 37", "Contemporary, Popular, and Emergent Literature", "Princess Morales", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BSEE 111", "English for Specific Purpose", "Gracelyn Salvador", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("GNED 12", "Dalumat Ng/Sa Filipino", "Liddy Austria", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemSubjects = new LinkedList<StudentSubject>();

        thirdYearSecondSemSubjects.add(new StudentSubject("EDFS 22", "Field Study 1 – Observation Teaching-Learning in Actual School Environment", "Charlene Omar", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEE 27", "Teaching and Assessment of Literature Study", "Ashley Acosta", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEE 31", "Language and Education Research", "Aaliyah Eugenio", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEE 38", "Literary Criticism", "Vaiana Bernardino", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEE 40", "Campus Journalist", "Elaine Alba", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BSEE 41", "Technology for Teaching and Learning 2 (Technology in Secondary Language Education)", "Maricar Gonzaga", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("EDUC 197", "Competency Appraisal 1", "Aquinnah Pablo", "3", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemSubjects = new LinkedList<StudentSubject>();

        fourthYearFirstSemSubjects.add(new StudentSubject("EDFS 23", "Teaching Internship", "Janice Barrientos", "6", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemSubjects = new LinkedList<StudentSubject>();

        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 01", "Art Appreciation", "Zenaida Esteban", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 02", "Ethics", "Sophiel Cordova", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 07", "Contemporary World", "Ellis Chan", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 09", "Life and Works of Rizal", "Nicole Arellano", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 10", "Gender and Society", "Elaine Abdullah", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("GNED 13", "Retorika / masining na pagpapahayag", "Joie Patricio", "3", YearLevel.FOURTH.label, Semester.SECOND.label));
        fourthYearSecondSemSubjects.add(new StudentSubject("EDUC 198", "Competency Appraisal 2", "Aintza Calma", "3", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemSubjects;
    }

}

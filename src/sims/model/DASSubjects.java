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
public class DASSubjects extends DefaultSubject {

    @Override
    public List<StudentSubject> getFirstYearFirstSem() {
        var firstYearFirstSemSubjects = new LinkedList<StudentSubject>();

        firstYearFirstSemSubjects.add(new StudentSubject("BPSY 50", "Introduction to Psychology", "Louvel Briones", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 03", "Mathematics in the Modern World", "Jenny Lozano", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 05", "Purposive Communication", "Charmaine Viernes", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 06", "Science, Technology and Society", "Avis Cano", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 08", "Understanding the Self", "Albert Luna", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("GNED 04", "Mga Babasahin Hinggil sa Kasaysayan ng Pilipinas", "Caelan Jose", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("NSTP 1", "National Service Training Program 1", "Theo Baltazar", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("FITT 1", "Movement Enhancement", "Adrian Solomon", "3", YearLevel.FIRST.label, Semester.FIRST.label));
        firstYearFirstSemSubjects.add(new StudentSubject("CVSU 101", "Institutional Orientation", "John Rey Fernandez", "2", YearLevel.FIRST.label, Semester.FIRST.label));

        return firstYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFirstYearSecondSem() {
        var firstYearSecondSemSubjects = new LinkedList<StudentSubject>();

        firstYearSecondSemSubjects.add(new StudentSubject("BPSY 55", "Psychological Statistics", "Jalen de Luna", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("BPSY 60", "Theories of Personalities", "Ethan Abad", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("BIOL 5", "Biology for Health Science", "Riley Cordova", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("Zool 1", "General Zoology", "", "2", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("NSTP 2", "National Service Training Program 2", "Aidric Paras", "3", YearLevel.FIRST.label, Semester.SECOND.label));
        firstYearSecondSemSubjects.add(new StudentSubject("FITT 2", "Fitness Exercise", "Myra Manzano", "2", YearLevel.FIRST.label, Semester.SECOND.label));

        return firstYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearFirstSem() {
        var secondYearFirstSemSubjects = new LinkedList<StudentSubject>();

        secondYearFirstSemSubjects.add(new StudentSubject("BPSY 65", "Development Psychology", "Eloise Panes", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BPSY 70", "Filipino Psychology", "Alina Robles", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("BPSY 75", "Field Methods in Psychological", "Jillian Camacho", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("CHGO", "Gen. Chemistry w/ Organic Chemistry", "Rhodette Velasco", "3", YearLevel.SECOND.label, Semester.FIRST.label));
        secondYearFirstSemSubjects.add(new StudentSubject("FITT 3", "Physical Activities towards Health and Fitness 1", "Amelie Gutierrez", "3", YearLevel.SECOND.label, Semester.FIRST.label));

        return secondYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getSecondYearSecondSem() {
        var secondYearSecondSemSubjects = new LinkedList<StudentSubject>();

        secondYearSecondSemSubjects.add(new StudentSubject("BPSY 80", "Abnormal Psychology", "Bituin Benitez", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BPSY 85", "Psychological Assessment", "Andrea Solomon", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("BPSY 90", "Cognitive Psychology", "Angelica Herrera", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("GNED 14", "Panitikang Panlipunan", "Bancroft Caballero", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("CHBH 14", "Biochemistry for Health Science", "Zyanya Narciso", "2", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("GNED 11", "Kontekstwalisadong Komunikasyon sa Filipino", "Ariel Cordova", "3", YearLevel.SECOND.label, Semester.SECOND.label));
        secondYearSecondSemSubjects.add(new StudentSubject("FITT 4", "Physical Activities towards Health and Fitness II", "Aintza Lazaro", "2", YearLevel.SECOND.label, Semester.SECOND.label));

        return secondYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearFirstSem() {
        var thirdYearFirstSemSubjects = new LinkedList<StudentSubject>();

        thirdYearFirstSemSubjects.add(new StudentSubject("BPSY 95", "Experimental Psychology", "Charlene Arevalo", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BPSY 100", "Industrial/Organizational Psychology", "Nathalie Guzman", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("GNED 07", "The Contemporary World", "Serenity Baylon", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("BHED 105", "Human Anatomy and Physiology", "Amelie dela Cruz", "3", YearLevel.THIRD.label, Semester.FIRST.label));
        thirdYearFirstSemSubjects.add(new StudentSubject("GNED 15", "World Literature", "Florence Ledesma", "3", YearLevel.THIRD.label, Semester.FIRST.label));

        return thirdYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getThirdYearSecondSem() {
        var thirdYearSecondSemSubjects = new LinkedList<StudentSubject>();

        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Introduction to Counseling", "Kenneth Aguirre", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Physiological/Biological Psychology", "Vern Rosario", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Clinical Psychology", "Euan Delos Santos", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Social Psychology", "Justin Dalisay", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Research in Psychological", "Kyla Narciso", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("GNED", "Daluman Ng/Sa Filipino", "Jillian Magno", "3", YearLevel.THIRD.label, Semester.SECOND.label));
        thirdYearSecondSemSubjects.add(new StudentSubject("BPSY", "Competency Appraisal 1", "Andrea Cinco", "0", YearLevel.THIRD.label, Semester.SECOND.label));

        return thirdYearSecondSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearFirstSem() {
        var fourthYearFirstSemSubjects = new LinkedList<StudentSubject>();

        fourthYearFirstSemSubjects.add(new StudentSubject("BPSY 120", "Research in Psychological", "Katrice Corpuz", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("GNED 09", "Life and Works of Rizal", "Sofia Lucas", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("BPSY 198", "Competency Appraisal 2", "Jenny Rosales", "0", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("GNED 02", "Ethics", "Rosa Sagun", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("GNED 13", "Retorika/Masining na Pagpapahayag", "Kyla Narciso", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("GNED 10", "Gender and Society", "Giselle Aguilar", "3", YearLevel.FOURTH.label, Semester.FIRST.label));
        fourthYearFirstSemSubjects.add(new StudentSubject("GNED 01", "Art Appreciation", "Nemo Molina", "3", YearLevel.FOURTH.label, Semester.FIRST.label));

        return fourthYearFirstSemSubjects;
    }

    @Override
    public List<StudentSubject> getFourthYearSecondSem() {
        var fourthYearSecondSemSubjects = new LinkedList<StudentSubject>();

        fourthYearSecondSemSubjects.add(new StudentSubject("BPSY 111", "Practicum in Psychological (150 Hours per Setting)", "Eloise Ancheta", "3", YearLevel.FOURTH.label, Semester.SECOND.label));

        return fourthYearSecondSemSubjects;
    }

}

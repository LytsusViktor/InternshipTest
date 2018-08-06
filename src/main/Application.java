package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.setStudent("Andrew Kostenko", 4);
        university.setStudent("Yurii Kostenko", 5);
        university.setStudent("Bohdan Kostenko", 4);
        university.setStudent("Julia Veselkina", 3);
        university.setStudent("Maria Perechrest", 5);
        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents(university));
    }
}

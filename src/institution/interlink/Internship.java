package institution.interlink;

import person.Student;
import institution.University;
import java.util.ArrayList;
import java.util.List;

public class Internship {
    String name;
    public Internship(String name) {
        this.name = name;
    }

    private double getAverageMark (Student[] students) {
        double sum = 0;
        for (int i = 0; i < students.length; i++)
            sum += students[i].knowledge.getKnowledge();
        return sum/students.length;
    }

    public String getStudents(University university) {
        Student[] students = university.getStudents();
        List<String> internshipMembers = new ArrayList<>();
        double average = getAverageMark(students);
        for (int i = 0; i < students.length; i++) {
            if (students[i].knowledge.getKnowledge() > average) {
                internshipMembers.add(students[i].name);
            }
        }
        return String.join(", ", internshipMembers);
    }
}

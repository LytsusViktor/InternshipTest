package institution;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    String university_name;
    private Student[] students = new Student[0];

    public University(String name) {
        university_name = name;
    }

    public void setStudent(String name, int level) {
        Student student = new Student(name);
        student.setKnowledge(new Knowledge(level));
        addStudent(student);
    }

    private void addStudent(Student student) {
        Student[] tempArr = new Student[students.length+1];
        System.arraycopy(students, 0, tempArr, 0, students.length);
        tempArr[students.length] = student;
        students = tempArr;
    }

    public Student[] getStudents() {
        return students;
    }
}

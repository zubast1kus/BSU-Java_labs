package by.bsu.tasks;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void facultyPrint(String faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public void groupPrint(String group) {
        System.out.println("Список студентов группы " + group);
        for (Student st : studentList) {
            if (st.getGroup().equals(group)) {
                System.out.println(st.toString());
            }
        }
    }

    public void yearOfBirthPrint(String year) {
        System.out.println("Список студентов, родившихся после " + year + " года");
        for (Student st : studentList) {
            if (parseYear(st.getDateOfBirth().substring(6)) > parseYear(year)) {
                System.out.println(st.toString());
            }
        }
    }

    public void yearOfBirthPrint() {
        System.out.println("Список студентов, независимо от года рождения");
        for (Student st : studentList) {
            System.out.println(st.toString());
        }
    }

    public void facultyCoursePrint(String faculty, String course) {
        System.out.println("Список студентов факультета " + faculty + " курса " + course);
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty) & st.getCourse().equals(course)) {
                System.out.println(st.toString());
            }
        }
    }

    public void facultyCoursePrint(String faculty) {
        System.out.println("Список студентов факультета " + faculty + "всех курсов ");
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st.toString());
            }
        }
    }

    public int parseYear(String years) {
        return Integer.parseInt(years);
    }
}

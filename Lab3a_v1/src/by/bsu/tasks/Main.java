package by.bsu.tasks;

public class Main {

    public static void main(String[] args) {
        StudentList newList = new StudentList();
        Student student = new Student("0", "Фомин", "Игнат", "Игоревич",
                "02.08.2000", "375123456789", "MMF", "2", "9");
        newList.addStudent(student);
        student = new Student("1", "Иванов", "Иван", "Иванович",
                "01.01.2001", "375123456789", "MMF", "2", "2");
        newList.addStudent(student);
        student = new Student("2", "Петров", "Петр", "Петрович",
                "02.02.1999", "375123456789", "FPMI", "2", "5");
        newList.addStudent(student);
        newList.facultyPrint("MMF");
        newList.groupPrint("9");
        newList.yearOfBirthPrint("2000");
    }
}

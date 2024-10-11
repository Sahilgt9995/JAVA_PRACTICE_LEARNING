package OOP;


import java.util.ArrayList;
import java.util.List;



public class coursecc {
    String courseName;
    String professorName;
    int year;
    List<student> enrolledStudents;


    public void coursecc(String cName, String pName, int yr) {
        courseName = cName;
        professorName = pName;
        year = yr;
        enrolledStudents = new ArrayList<>();

    }
    // Enroll a single student
    public void enroll(student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.firstName + " " + student.lastName + " has been enrolled.");
    }

    // Overloaded method: Enroll multiple students
    public void enroll(student[] students) {
        for (student student : students) {
            enroll(student); // Using the single student enroll method
        }
    }


    // Unenroll a student
    public void unEnroll(student student) {
        if (enrolledStudents.remove(student)) {
            System.out.println("Student " + student.firstName + " " + student.lastName + " has been unenrolled.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Count the number of students
    public int countStudents() {
        return enrolledStudents.size();
    }

    // Return the highest grade of students
    public int bestGrade() {
        int bestGrade = 0;
        for (student student : enrolledStudents) {
            if (student.grade > bestGrade) {
                bestGrade = student.grade;
            }
        }
        return bestGrade;
    }

}

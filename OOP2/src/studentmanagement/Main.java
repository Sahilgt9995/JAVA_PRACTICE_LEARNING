package studentmanagement;

import studentmanagement.models.Course;
import studentmanagement.models.Student;
import studentmanagement.models.CourseNotFoundException;
import studentmanagement.models.StudentNotFoundException;
import studentmanagement.services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        // Adding some students
        Student student1 = new Student("S1", "Alice");
        Student student2 = new Student("S2", "Bob");
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        // Adding some courses
        Course course1 = new Course("C1", "Mathematics");
        Course course2 = new Course("C2", "Science");
        studentService.addCourse(course1);
        studentService.addCourse(course2);

        // Enroll students
        try {
            studentService.enrollStudents("C1", "S1");
            studentService.enrollStudents("C2", "S2");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Show enrolled students in a specific course
        studentService.showEnrolledStudents("C1");

        // Show all available courses
        studentService.showAllCourses();
    }
}

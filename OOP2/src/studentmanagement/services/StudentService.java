package studentmanagement.services;

import studentmanagement.models.Course;
import studentmanagement.models.Student;
import studentmanagement.models.CourseNotFoundException;
import studentmanagement.models.StudentNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courseList = new HashMap<>();
    private Map<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void addCourse(Course course) {
        courseList.put(course.getId(), course);
    }

    public void showEnrolledStudents(String courseId) {
        System.out.println("Enrolled students in course ID " + courseId + ":");
        for (Map.Entry<String, List<Course>> entry : coursesEnrolledByStudents.entrySet()) {
            if (entry.getValue().stream().anyMatch(course -> course.getId().equals(courseId))) {
                System.out.println("Student ID: " + entry.getKey());
            }
        }
    }

    public void showAllCourses() {
        System.out.println("Available courses:");
        for (Course course : courseList.values()) {
            System.out.println("Course Name: " + course.getName() + ", Course ID: " + course.getId());
        }
    }

    public void enrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException("Course with name " + courseName + " not found.");
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException("Student with ID " + studentID + " not found.");
        }

        coursesEnrolledByStudents.computeIfAbsent(studentID, k -> new ArrayList<>()).add(course);
        System.out.println("Student " + studentID + " enrolled in course " + courseName);
    }
}

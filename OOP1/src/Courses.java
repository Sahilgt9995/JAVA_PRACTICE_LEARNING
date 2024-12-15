
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Courses {
    
    private String courseName;
    private String professorName;
    private int year;
    private ArrayList<Student> students;

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
        System.out.println("Student enrolled: " + student.getFirstName());
    }

    public void unEnroll(Student student) {
        if (students.remove(student)) {
            System.out.println("Student removed: " + student.getFirstName());
        } else {
            System.out.println("Student not found.");
        }
    }

   
    public double getGradeAvg(String courseName, Courses c1 ) {
        int sum = 0;
       if (courseName.equals(c1.getCourseName())){

           int count = c1.countStudents();
//           System.out.println("Count of students "+count);
           for (Student student : students) {
               sum += student.getGrade();
           }
           System.out.println(sum);
           boolean status = count != 0;
           if (status ){
               return (double) sum/count;
           }
           else {

               return 0;
           }

       }
       else {
           System.out.println("Courses not available");
       }
//         status ? 0 : (double) sum / count;
        System.out.println("sum from getavg"+sum);
        return 0;


    }

  
    public void printRanking() {
      
        Collections.sort(students, Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("Student Ranking for Course: " + courseName);
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " - Grade: " + student.getGrade());
        }
    }

   
    public void checkIfAboveAverage(String courseName, Courses c1) {
        double average = getGradeAvg(courseName,c1);
        System.out.println("Course average grade: " + average);
        for (Student student : students) {
            String result = student.getGrade() > average ? "above" : "below";
            System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + result + " average.");
        }
    }

    public int countStudents() {
        System.out.println("Total Number of Students: " + students.size());
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getYear() {
        return year;
    }
}

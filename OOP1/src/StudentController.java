

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    
    public static void main(String[] args) {
        List<Courses> clist = new ArrayList<>();
        Courses course = new Courses("Java", "Ambika Mam", 2020);
        Courses course1 = new Courses("SQL", "Pavitra Mam", 2021);
        Courses course2 = new Courses("DSA", "Ambika Mam", 2021);
        Courses course3 = new Courses("Python", "Pavitra Mam", 2020);
        Courses course4 = new Courses("HTML", "Ambika Mam", 2020);

     
        Student s1 = new Student("Tejas", "Wakchaure", 1, 80, 2015, course);
        Student s2 = new Student("Sahil", "ghanwat", 2, 70, 2016, course);
        Student s3 = new Student("John", "Doe", 3, 90, 2019, course);
        Student s4 = new Student("Prasad", "Kharche", 4, 50, 2013, course);


        course.enroll(s1);
        course.enroll(s2);
        course.enroll(s3);
        course.enroll(s4);

        Student s5 = new Student("Pratiksha", "Ingale", 5, 88, 2015, course1);
        Student s6 = new Student("pankaj", "Mali", 6, 75, 2016, course2);
        Student s7 = new Student("prassna", "gaikwad", 7, 99, 2019, course3);
        Student s8 = new Student("Shree", "Pujari", 8, 55, 2013, course4);

        course1.enroll(s5);
        course2.enroll(s6);
        course3.enroll(s7);
        course4.enroll(s8);

        double averageGrade = course.getGradeAvg("SQL",course1);
        
        
        
        System.out.println("Average Grade for " + course.getCourseName() + ": " + averageGrade);
        
        

       
//        course.printRanking();
//
//       
//        course.checkIfAboveAverage("Coursename1", course);
    }
}

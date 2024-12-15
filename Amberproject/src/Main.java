import Model.Course;
import Model.Student;
import Service.CourseService;
import Service.StudentService;
import Utils.PrinterHelper;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
            throws ParseException
    {
        Student stud = new Student("1", "sahil","email.com",new Date(12,20,2002));
//        stud.enrollToCourse(Course C1);
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        Scanner scanner = new Scanner( System.in );
        int option = 0;
        do
        {
            PrinterHelper.showMainMenu();
            option = scanner.nextInt();
            switch ( option )
            {
                case 1:
                    registerStudent( studentService, scanner );
                    break;
                case 2:
                    findStudent( studentService, scanner );
                    break;
                case 3:
                    gradeStudent( studentService, scanner );
                    break;
                case 4:
                    enrollStudentToCourse( studentService, courseService, scanner );
                    break;
                case 5:
                    showStudentsSummary( studentService, scanner );
                    break;
                case 6:
                    showCoursesSummary( courseService, scanner );
                    break;
            }
        }
        while ( option != 7 );
    }

    private static void enrollStudentToCourse(StudentService studentService, CourseService courseService,
                                              Scanner scanner )
    {
        System.out.println( "Insert student ID" );
        String studentId = scanner.next();
        Student student = studentService.findStudent( studentId );
        if ( student == null )
        {
            System.out.println( "Invalid Model.Student ID" );
            return;
        }
        System.out.println( student );
        System.out.println( "Insert course ID" );
        String courseId = scanner.next();
        Course course = courseService.getCourse( courseId );
        if ( course == null )
        {
            System.out.println( "Invalid Model.Course ID" );
            return;
        }
        System.out.println( course );
        courseService.enrollStudent( courseId, student );
        studentService.enrollToCourse( studentId, course );
        System.out.println( "Model.Student with ID: " + studentId + " enrolled successfully to " + courseId );


    }

    private static void showCoursesSummary(CourseService courseService, Scanner scanner )
    {
        courseService.showSummary();
    }

    private static void showStudentsSummary(StudentService studentService, Scanner scanner )
    {
        studentService.showSummary();
    }

    private static void gradeStudent(StudentService studentService, Scanner scanner )
    {
        System.out.println("Enter studentID: ");
        String studentId = scanner.next();
        Student student = studentService.findStudent(studentId);
        if (student == null) {
            System.out.println("Student not found");
        }
        else{
            System.out.println("Student found");
        }

        System.out.println("Enter courseID: ");
        String courseId = scanner.next();
        CourseService courseService = null;
        Course course = courseService.getCourse(courseId);
        if (course == null) {
            System.out.println("Course not found!");
            return;
        }
        else {
            System.out.println("Course Found");
        }




    }



    private static void findStudent(StudentService studentService, Scanner scanner )
    {
        System.out.println( "Enter student ID: " );
        String studentId = scanner.next();
        Student student = studentService.findStudent( studentId );
        if ( student != null )
        {
            System.out.println( "Model.Student Found: " );
            System.out.println( student );
        }
        else
        {
            System.out.println( "Model.Student with Id = " + studentId + " not found" );
        }
    }

    private static void registerStudent(StudentService studentService, Scanner scanner )
            throws ParseException
    {
        Student student = PrinterHelper.createStudentMenu( scanner );
        studentService.subscribeStudent( student );
    }


}

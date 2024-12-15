package Model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();
    private final List<Course> enrolledCourses = new ArrayList<>();
//    private final List<Course> approvedCourse = new ArrayList<>();
    Course C1;



    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate  )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        if (!isAttendingCourse(course.getCode())){

            enrolledCourses.add( course);
            System.out.println("Course Enrolled"+ course.getName());
        }
        else{
            System.out.println("Course not enrolled"+ course.getName());
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    public boolean isCourseApproved( String courseCode )
    {
        //TODO implement this method

        for (Map.Entry<String, Course> set :
                approvedCourses
                        .entrySet()) {
            if (C1.getCode().equals (courseCode)){
                return true;
        }
    }
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses(Course course )
    {
        //TODO implement this method

        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        for (Course course : enrolledCourses) {
            if (course.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        return (List<Course>) approvedCourses;
    }

    @Override
    public String toString()
    {
        return "Model.Student {" + super.toString() + "}";
    }
}

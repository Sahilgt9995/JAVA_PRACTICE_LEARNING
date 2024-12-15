package Service;

import Model.Course;
import Model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    public final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent(String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        if ( students.containsKey( studentId ) )
        {
            return true;
        }

        return false;
    }

    public void showSummary()
    {
        //TODO implement

        for (Student S1: students.values()){
            System.out.println("Name "+S1.getName());
            System.out.println("ID "+S1.getId());
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


    public void enrollStudents(String math, String number) {
    }
}

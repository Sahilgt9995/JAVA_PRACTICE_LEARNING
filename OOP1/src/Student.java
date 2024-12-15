

public class Student {
    
    private String firstName;
    private String lastName;
    private int registration;
    private int grade;
    private int year;
    private Courses course;
    
    
    public Student() {
		// TODO Auto-generated constructor stub
	}
   
  
    public Student(String firstName, String lastName, int registration, int grade, int year, Courses course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
        this.course = course;
    }

  
    public Student(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 0, null); 
    }

    public Student(String firstName, String lastName, int registration) {
        this(firstName, lastName, registration, 0, 0, null); 
    }

    public Student(String firstName, String lastName, int grade, int year) {
        this(firstName, lastName, 0, grade, year, null); 
    }

   
    public void printFullName() {

        System.out.println(firstName + " " + lastName);
    }

    
    public boolean isApproved() {

        return grade > 60;
    }

   
    public int changeYearIfApproved() {
        if (grade >= 60) {
            year++;
            System.out.println("Congratulations, you have been promoted to year " + year);
        } else {
            System.out.println("You have not been promoted.");
        }
        return year;
    }

   
    public void fullInformation() {
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Grade: " + grade);
        System.out.println("Registration: " + registration);
        System.out.println("Year: " + year);
        if (course != null) {
            System.out.println("Course: " + course.getCourseName());
        }
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
}

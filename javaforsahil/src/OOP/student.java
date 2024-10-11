package OOP;

public class student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;


    public student(String fName, String lName, int reg, int grd, int yr) {
        firstName = fName;
        lastName = lName;
        registration = reg;
        grade = grd;
        year = yr;
    }

    public student(String fName, String lName, int reg) {
        firstName = fName;
        lastName = lName;
        registration = reg;
        grade = 0;
        year = 1;
    }

    public student() {
        firstName = "sahil";
        lastName = "ghanwat";
        registration = 0;
        grade = 0;
        year = 1;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }


    public boolean isApproved() {
        return grade >= 60;
    }


    public int changeYearIfApproved() {
        if (isApproved()) {
            year += 1;
            System.out.println("Congratulations! You've been promoted to year " + year);
        } else {
            System.out.println("Unfortunately, you didn't pass.");
        }
        return year;
    }
}

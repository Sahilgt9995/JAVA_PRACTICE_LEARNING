package Polymorphism_and_Inheritance;

public class Employee {
     String firstname;
     String lastname;
     int age;
     int registration;
     int yearsWorked;
     int daysWorked;
     int vacationDaysTaken;
     double salary;

    public Employee(String firstname, String lastname, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary, int registration) {
        this.firstname = firstname;
        this.lastname= lastname;
        this.age = age;
        this.registration =registration;
        this.yearsWorked = yearsWorked;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
    }

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (daysWorked / 360) * (30 - vacationDaysTaken);
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }
}

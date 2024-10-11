package Polymorphism_and_Inheritance;

public class SalesManagaer extends SalesRep{
    double salesbyteam;
    String middlename;


    public SalesManagaer(String firstname, String middlename, String lastname, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary, int salesMade, double salesbyteam) {
        super(firstname, lastname, age, yearsWorked, daysWorked, vacationDaysTaken, salary, salesMade);
        this.salesbyteam = salesbyteam;
    }
    public void calculateCommission()
    {
        // 0.03 * all sales made by team
        System.out.println("The Managers commission is :------> "+(0.03f*salesbyteam));
    }
}




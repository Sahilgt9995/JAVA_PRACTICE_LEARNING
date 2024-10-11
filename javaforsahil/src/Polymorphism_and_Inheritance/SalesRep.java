package Polymorphism_and_Inheritance;

public class SalesRep extends Employee {
    private double salesMade;
    public double getSalesMade() {
        return salesMade;
    }

    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

    public SalesRep(String firstname, String lastname, int age, int yearsWorked, int daysWorked, int vacationDaysTaken, double salary, int salesMade) {
        super(firstname, lastname, age, yearsWorked, daysWorked, vacationDaysTaken, salesMade, (int) salary);
        this.salesMade = salesMade;
    }

    public void calculateComission() {
        System.out.println("total sales by reprs"+(0.1 * salesMade));
    }
}

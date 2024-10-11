package Polymorphism_and_Inheritance;

public class App {
    public static void main(String[] args) {
//        Employee emp = new Employee("sahil","Ghanwat",22,3,660,56,1_00_000,101010);
//        System.out.println("Total bonnus you will get"+emp.calculateBonus());
            SalesRep s1 = new SalesRep("Patrick ", "bateman", 34,15, 20000,400,3_00_000,1_00_000 );
        SalesRep s2 = new SalesRep("Bruce ", "Wayne", 40,10, 15000,200,2_00_000,50000 );
        SalesRep s3 = new SalesRep("Eren ", "Yeager", 30,6, 10000,100,1_00_000,30000 );

        SalesManagaer sm1 = new SalesManagaer("Trafalgar", "D", "law",34,15, 20000,400,9_00_000,1_00_000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        System.out.print("Total commission made by Sales Manager is");
        sm1.calculateCommission();
        s1.calculateComission();
        s1.calculateComission();
        s1.calculateComission();
    }
}

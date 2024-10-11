package Variables_datatypes_operators;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Please enter the diameter of the circle: ");
        int diameter = sc.nextInt();


        double radius = (double) diameter / 2;
//        int raius = (int) diameter/2.0; ---> incase of double to int conversion


        double area = Math.PI * radius * radius;
        double perimeter =  2* Math.PI *  radius;

        System.out.println("area: "+area);
        System.out.println("perimeter: " +perimeter);

    }
}


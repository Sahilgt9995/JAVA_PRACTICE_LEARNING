package Control_Flow;

import java.util.Scanner;

public class CalculatorBrain {


    private static void Addition( int a , int b  )
    {
        System.out.println("addition is "+ (a+b));
    }

    private static void Substraction( int a , int b  )
    {
        System.out.println("Substraction is "+ (a+b));    }
    private static void Multiplication( int a , int b )
    {
        System.out.println("Multiplication is "+ (a+b));    }
    private static void Division( int a , int b )
    {
        System.out.println("Division is "+ (a+b));    }

    private static void Squareroot( int a )
    {
        System.out.println("Square root of a is "+ Math.sqrt(a));    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter second valuye");
        int b = sc.nextInt();
        Addition(a,b);
        Substraction(a,b);
        Multiplication(a,b);
        Division(a,b);
        Squareroot(a);

    }

}

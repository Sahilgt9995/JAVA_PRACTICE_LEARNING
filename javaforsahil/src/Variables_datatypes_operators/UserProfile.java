package Variables_datatypes_operators;

import java.util.Scanner;

public class UserProfile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your username: ");
        String name = sc.next();

        System.out.println("enter your age: ");
        int age = sc.nextInt();

        System.out.println("enter your gender: ");
        String gender = sc.next();

        System.out.println("enter your job preference: ");
        String job = sc.next();

        System.out.println("enter your nationality: ");
        String nation = sc.next();

        System.out.println("enter your bloodtype: ");
        char blood = sc.next().charAt(0);

        System.out.println("Name is " +name);
        System.out.println("age is " +age);
        System.out.println("gender is " +gender);
        System.out.println("Job_preference is " +job);
        System.out.println("nationality is " +nation);
        System.out.println("bloodtype is " +blood);

    }
}

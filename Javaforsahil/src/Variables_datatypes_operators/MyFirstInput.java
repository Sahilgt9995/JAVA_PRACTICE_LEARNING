package Variables_datatypes_operators;

import java.util.Scanner;

public class MyFirstInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("My name is " + name);


    }
}

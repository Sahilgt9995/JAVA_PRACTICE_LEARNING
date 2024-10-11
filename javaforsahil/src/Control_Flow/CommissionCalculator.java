package Control_Flow;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {


        System.out.println("Enter a sales range ---");
        Scanner sc = new Scanner(System.in);
        int sale_range = sc.nextInt();
        int commission;


        if (sale_range>10000){
            commission= sale_range/100*30;
            System.out.println("Your commission is "+commission);
        } else if (sale_range>=5001 && sale_range<=9999) {
            commission= sale_range/100*20;
            System.out.println("your commission is "+commission);
        }
        else if (sale_range>1000 && sale_range<5000) {
            commission= sale_range*10/100;
            System.out.println("your commission is "+commission);
        } else if (sale_range<1000) {
            System.out.println("you will not get any commission");

        }

    }
}

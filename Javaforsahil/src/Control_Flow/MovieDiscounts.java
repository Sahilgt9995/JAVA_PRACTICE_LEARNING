package Control_Flow;

import java.util.Scanner;

public class MovieDiscounts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();

        YourDiscount YD = new YourDiscount(age);
        Double price = YD.calculatePrice();


    }

    public static class YourDiscount {

        static int age;
        static Double normalticketprice = 7.0d;
        public  YourDiscount(int age){
            this.age = age;
        }

        public static double calculatePrice() {
            if (age < 5) {
                double ntp = normalticketprice * 0.4;
                System.out.println("your total discount is " +ntp +" euros");
            } else if (age > 60) {
                double ntp = normalticketprice * 0.45;
                System.out.println("your total discount is " + ntp +" euros");
            } else {
                return normalticketprice;
            }


            return 0;
        }
    }
}

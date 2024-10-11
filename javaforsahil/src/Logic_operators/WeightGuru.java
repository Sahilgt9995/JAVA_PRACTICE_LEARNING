package Logic_operators;

import java.util.Scanner;

public class WeightGuru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kgs: ");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in cms: ");
        double height = sc.nextDouble();

        // Converting
        height = height / 100;


        double BMI = weight/(height*height);
        System.out.println("Your BMI is: " + BMI);

        if (BMI < 18.5 && BMI > 0){
            System.out.println("You are Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You are Normal");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("You are Overweight");
        } else if (BMI >= 30) {
            System.out.println("You are Obese, do some exercise and follow a diet plan");
        } else {
            System.out.println("Please enter valid weight and height");
        }

    }
}

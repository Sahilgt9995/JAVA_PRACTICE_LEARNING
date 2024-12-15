import java.util.Scanner;

public class DigitSumCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(num != 0){
            int digit = num % 10;
            // if

            if (digit %2 ==0){
                evenSum = evenSum+digit;
            }
            else {
                oddSum = oddSum + digit;
            }

            num = num/10;
        }
        System.out.println("sum of even digits "+evenSum);
        System.out.println("sum of odd digits "+oddSum);

    }
}

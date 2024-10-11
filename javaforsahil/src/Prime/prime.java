package Prime;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        int numcheck =0;
        int flag =0;


        if(numcheck == 0){
            System.out.println("number is not prime");
        }
        else {
            for (int i =2; i<=numcheck; i++){
                if (numcheck%i==0){
                    flag=1;
                }
            }
            if (flag ==1){
                System.out.println("numver is not a prime");
            }
            else {
                System.out.println("number is a prime");
            }
        }

    }

}

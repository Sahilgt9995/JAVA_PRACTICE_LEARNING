package Logic_operators;

import java.util.Scanner;

public class ClassGrader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks: ");
        int grd = sc.nextInt();



        if (grd<=3 && grd>=0){
            System.out.println("Your grades are- "+grd+" and you failed the exam");
        }
        else if (grd == 4) {
            System.out.println("Your grades are- "+grd+" but are insufficient");
        }
        else if (grd>5 && grd<8){
            System.out.println("Your grades are- "+grd+" and your result is good");
        }
        else if (grd==10){
            System.out.println("Your grades are- "+grd+" and your result is excellent");
        }
        else{
            System.out.println(" Please enter valid num");

        }

    }
}

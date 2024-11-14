package game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int p_scr = 0;
        int c_scr = 0;
        int c_pred = 1;

        int p_input;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter ");
        p_input = sc.nextInt();

        if (p_input == c_pred) {
            c_scr++;
        } else {
            p_scr++;
        }

        System.out.println("player score" + p_scr);
        System.out.println("computer score" + c_scr);
        //stopping
        for (;;) {
            System.out.println("enter ");
            p_input = sc.nextInt();

            if (p_input == c_pred) {
                c_scr++;
            } else {
                p_scr++;
            }

            System.out.println("player score" + p_scr);
            System.out.println("computer score" + c_scr);

            if (c_scr == 2) {
                System.out.println("computer is winner");
                break;
            } else if (p_scr == 2) {
                System.out.println("player is winner");
                break;
            }
        }


        }

}

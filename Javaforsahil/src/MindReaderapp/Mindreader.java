import java.util.*;

public class Mindreader
{
    public static void main(String[] args)
    {
        int p_scr = 0 , c_scr = 0 ;
        int c_pred = 1;
        int p_input;
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your prediction: ");
            p_input = sc.nextInt();
            System.out.println("You Entered : "+ p_input);

            //checking
            if(p_input == c_pred)
            {
                c_scr++;
            }
            else
            {
                p_scr++;
            }
            System.out.println("Computer score: " + c_scr);
            System.out.println("Player score: " + p_scr);
            if(c_scr == 4)
            {
                System.out.println("Computer win the game, better luck next time player");
                break;
            }
            else if(p_scr == 4)
            {
                System.out.println("Player win the game, better luck next time computer");
                break;
            }
        }

    }
}
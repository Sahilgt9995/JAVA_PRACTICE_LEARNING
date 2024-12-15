import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 0) {
                long count = String.valueOf(number)
                        .chars()
                        .count();
                System.out.println(count);
            } else {
                System.out.println("INVALID INPUT");
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

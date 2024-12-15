package JAVA8Features.DatetimeAPI.src;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Classical Date/Time API
        System.out.println("Using Classical Date/Time API:");

        // Get current date
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Current Date: " + sdf.format(now));

        // Adding days using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Add 5 days
        Date newDate = calendar.getTime();
        System.out.println("Date after adding 5 days: " + sdf.format(newDate));


        // Java 8 Date/Time API
        Scanner sc = new Scanner(System.in);

        System.out.println("\nUsing Java 8 Date/Time API:");
        System.out.println("Choose what to add: 1 for Days, 2 for Months, 3 for Years");
        int choice = sc.nextInt();
        System.out.print("Enter amount to add: ");
        int amountToAdd = sc.nextInt();
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);
        LocalDate newLocalDate;
        switch (choice) {
            case 1:
                newLocalDate = localDate.plusDays(amountToAdd);
                break;
            case 2:
                newLocalDate = localDate.plusMonths(amountToAdd);
                break;
            case 3:
                newLocalDate = localDate.plusYears(amountToAdd);
                break;
            default:
                System.out.println("Invalid choice!");
                return;

            // Get current date
//        LocalDate localDate = LocalDate.now();

            // Adding days using LocalDate
//        LocalDate newLocalDate = localDate.plusDays(5); // Add 5 days
//        System.out.println("Date after adding 5 days: " + newLocalDate);
        }
        System.out.println("New Date: " + newLocalDate);
    }
}
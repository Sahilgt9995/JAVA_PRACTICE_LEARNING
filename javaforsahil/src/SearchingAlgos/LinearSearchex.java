package SearchingAlgos;

import java.util.Scanner;

public class LinearSearchex {

    public static void main(String[] args) {


// input liya
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = in.nextInt();

// array ka input

        int[] arr = new int[n];

        System.out.println("enter elements in the array");

// array ke elements input karenge

        for (int i =0; i<n ; i++){
            arr[i] = in.nextInt();
        }


// target value lete hai

        System.out.println("enter the target value: ");
        int target = in.nextInt();

// main code linear search

        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i;
                break;
            }
        }
// after cheacking whole array teh input will be same only -1

// result cheacking whetehr we got the element or not

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }



    }
}

package Fibonacci;

public class fibo {
    public static void main(String[] args) {
        long[] fiboeven = new long[20];  // Change array to long

        long n1 = 0;  // Change to long
        long n2 = 1;  // Change to long
        int count = 0;

        for (int i = 0; count < 20; i++) {
            long nextFib = n1 + n2;  // Change to long
            n1 = n2;
            n2 = nextFib;

            if (nextFib % 2 == 0) {
                fiboeven[count] = nextFib;
                count++;
            }
        }


        for (int i = 0; i < fiboeven.length; i++) {
            System.out.print(fiboeven[i] + " ");
        }


        System.out.println("Printing sum");
        long sum = 0;  // Change to long
        for (int i = 0; i < fiboeven.length; i++) {
            sum = sum + fiboeven[i];  // Change to long
        }

        System.out.println(" ");
        System.out.println("Sum of all elements is " + sum);
    }
}

package Arrays;

public class RotateElement {

        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};
            int n = 4;  // 4 baar rotate karega

            // orginal array printing
            System.out.println("Original array: ");
            for (int i =0; i< arr.length; i++){
              System.out.println(arr[i]+" ");
          }
            // Rotate the array left by n times
            for (int i = 0; i < n; i++) {
                rotateByOne(arr);  // Call helper function to rotate by one
            }

            // Print array after rotation
            System.out.println("Array after left rotation: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        // array ko left position mein dalne ke liye function
        public static void rotateByOne(int[] arr) {
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = first;  // first element ko last mein dal diya
        }
    }

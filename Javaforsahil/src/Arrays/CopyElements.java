package Arrays;

public class CopyElements {
    public static void main(String[] args) {
        //taking a new array
        int[] ar1 = new int[]{10,20,30,20,20,40,50};

        // Taking another array
        int[] ar2 = new int[ar1.length];

        // loop for copying all the elements of one array in another

        for (int i =0; i< ar1.length; i++){
            ar2[i] = ar1[i];
        }
        // displaying elements of ar1

        for (int i =0; i<ar1.length; i++){
            System.out.print(ar1[i]+" ");
        }

        // Now displaying array of ar2
        System.out.println(" ");

        for (int i =0; i<ar2.length; i++){
            System.out.print(+ar2[i]+" ");
        }



    }
}

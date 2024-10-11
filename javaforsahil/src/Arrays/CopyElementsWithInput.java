package Arrays;

import java.util.Scanner;

public class CopyElementsWithInput {
public static void main(String[] args) {
    int[] a =new int[5];
    int[] b =new int[5];
    Scanner r=new Scanner(System.in);
    System.out.print("Enter value in first array");
    for(int i=0;i<5;i++)
    {
        a[i]=r.nextInt();
    }
    System.out.print("First array Elements ");
    for(int i=0;i<5;i++)
    {
        System.out.println(a[i]+" ");
    }
    for(int i=0;i<5;i++)
    {
        b[i]=a[i];
        System.out.print(b[i]+" ");
    }
}
}
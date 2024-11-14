package Arrays;

public class basic {
    public static void main(String[] args) {
        int[] num = new int[10];

       for (int i = 0; i < num.length; i++) {
            int y = i*20*300;
            num[i]=y;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println(num);
    }
}

package Exception_handling;

public class TryCatchException8 {
    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception

        }
        // dusra exception type se dekhnege

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");

}
}

package Exception_handling;

public class TryCatchExample6 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try
        {
            data=i/j;
        }

//        catch(Exception e)
//        {
//            // resolving the exception in catch block
//            System.out.println(i/(j+2));
//        }
        finally {
            System.out.println("wow");
        }

}
}

package primitive_datatype;

public class literals {
        //
        int x;
        int y;// Create a class attribute
        String st;
    // Create a class constructor for the Main class
    public literals(int ex, int ye) {
        x = ex;
        y = ye;// Set the initial value for the class attribute x
    }

    public literals(String str){
        st = str;
    }

    public  void similarno(){
        System.out.println("The no is "+x);
    }

    public void usingstr(){
        System.out.println("Yoour name is "+st);
    }

    public static void main(String[] args) {
        literals myObj = new literals(6,7); // Create an object of class Main (This will call the constructor)

    }
}

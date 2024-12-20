package JAVA8Features.DefaultMethods.src;

interface MyInterface {
    void regularMethod(); // Abstract method

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    static void wow(){
        System.out.println("wow");
    }
}

class MyClass implements MyInterface {
    @Override
    public void regularMethod() {
        System.out.println("Implementing the regular method.");
    }
}

public class App {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.regularMethod(); // Output: Implementing the regular method.
        myClass.defaultMethod(); // Output: This is a default method.
        MyInterface.wow(); //
    }
}

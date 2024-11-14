package Function;

public class    Exampleint {
    public static void main(String[] args) {
   Integer a = new Integer(7);
        Integer b = new Integer(76);
        Integer x = Integer.parseInt("9");

        System.out.println(a.equals(b));//check container of the obj
        System.out.println(a.getClass());// returns runtime class
        System.out.println(a.hashCode());//returns hashcode
        System.out.println(a.compareTo(b));// comparing with another integer
        System.out.println(b.describeConstable());//Returns descriptor instance string of given string.


        System.out.println("parseint: "+x);// This method is used to get the primitive data type of a certain String.
    }
}

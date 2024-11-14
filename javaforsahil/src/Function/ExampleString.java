package Function;

public class ExampleString {
    public static void main(String[] args) {
        String s1 = new String("brother");
        String s2 = new String("sister");
        String s3 = new String("brother");

        System.out.println(s1.equals(s2));//check container of the obj
        System.out.println(s2.getClass());// returns runtime class
        System.out.println(s1.hashCode());//returns hashcode
        System.out.println(s1.compareTo(s3));// comparing with another integer
        System.out.println(s3.describeConstable());//Returns descriptor instance string of given string.
        System.out.println(s3.indent(5));//This method is useful to add or remove white spaces from the beginning of the line to adjust indentation for each string line.

    }
}

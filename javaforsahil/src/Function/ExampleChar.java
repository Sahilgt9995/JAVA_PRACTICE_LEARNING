package Function;

public class ExampleChar {
    public static void main(String[] args) {
        Character c1 = new Character('i');
        Character c2 = new Character('i');
        Character c3 = new Character('5');

        System.out.println(c1.equals(c2));//check container of the obj
        System.out.println(c2.charValue());// returns hashcode for the character
        System.out.println(c1.getClass());// getClass() returns the runtime class of the object
        System.out.println(c1.compareTo(c3));// comparing with another integer
        System.out.println(c3.describeConstable());//Returns descriptor instance string of given string.

    }
}

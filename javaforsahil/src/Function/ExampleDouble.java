package Function;

public class ExampleDouble {
    public static void main(String[] args) {
        Double d1 = new Double(6.76);
        Double d2 = new Double(3.00);
        Double d3 = new Double(5.88777);
        Double d4 = new Double(675.6767);

        System.out.println(d1.equals(d2));//check container of the obj
        System.out.println(d3.doubleValue());// Returns a hash code for this Double object
        System.out.println(d4.getClass());// getClass() returns the runtime class of the object
        System.out.println(d1.compareTo(d3));// comparing with another integer
        System.out.println(d3.describeConstable());//Returns descriptor instance string of given string.

    }
}


//algorith
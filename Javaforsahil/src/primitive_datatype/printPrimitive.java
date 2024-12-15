

public class printPrimitive {

    static byte by = 0;
    static short shortF = 0;
    static int intF = 0;
    static long longF = 0L;
    static float floatF = 0.00F;
    static double doubleF = 00.0000D;
    static char charF = '\u0000';
    static String stringF = null;
    static boolean booleanF = false;

    public static void main(String[] args) {

        System.out.println("Default byte value: " + by);
        System.out.println("Default short value: " + shortF);
        System.out.println("Default int value: " + intF);
        System.out.println("Default long value: " + longF);
        System.out.println("Default float value: " + floatF);
        System.out.println("Default double value: " + doubleF);
        System.out.println("Default char value: '" + charF);
        System.out.println("Default String value: " + stringF);
        System.out.println("Default boolean value: " + booleanF);
    }
}

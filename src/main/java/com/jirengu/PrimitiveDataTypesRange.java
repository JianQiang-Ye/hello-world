public class PrimitiveDataTypesRange {
    // byte类型能表示的最大值/最小值
    public static byte MAX_BYTE = (byte)(Math.pow(2,7)-1) ;
    public static byte MIN_BYTE = (byte)Math.pow(-2,7);

    // short类型能表示的最大值/最小值
    public static short MAX_SHORT = (short)(Math.pow(2,15)-1) ;
    public static short MIN_SHORT = (short)(Math.pow(-2,15));
    // int类型能表示的最大值/最小值
    public static int MAX_INT = (int)(Math.pow(2,31)-1);
    public static int MIN_INT = (int)(Math.pow(-2,31));
    // long类型能表示的最大值/最小值
    public static long MAX_LONG = (long)(Math.pow(2,63)-1);
    public static long MIN_LONG = (long)(Math.pow(-2,63));

    // float类型能表示的最大值/最小值
    public static float MAX_FLOAT = (float)(3.4*(Math.pow(10,38)));
    public static float MIN_FLOAT = (float)(-3.4*(Math.pow(10,38)));

    // double类型能表示的最大值/最小值
    public static double MAX_DOUBLE = 1.7976931348623157E308;
    public static double MIN_DOUBLE = 4.9E-324;

    // char类型能表示的最大值/最小值？
    public static char MAX_CHAR = 65535;
    public static char MIN_CHAR = 0;

    public static void main(String[] args) {
        System.out.println("Max byte: "+ MAX_BYTE);
        System.out.println("Min byte: "+ MIN_BYTE);
        System.out.println("Max short: "+ MAX_SHORT);
        System.out.println("Min short: "+ MIN_SHORT);
        System.out.println("Max int: "+ MAX_INT);
        System.out.println("Min int: "+ MIN_INT);
        System.out.println("Max long: "+ MAX_LONG);
        System.out.println("Min long: "+ MIN_LONG);
        System.out.println("Max float: "+ MAX_FLOAT);
        System.out.println("Min float: "+ MIN_FLOAT);
        System.out.println("Max double: "+ MAX_DOUBLE);
        System.out.println("Min double: "+ MIN_DOUBLE);
        System.out.println("Max char: "+ (int)MAX_CHAR);
        System.out.println("Min char: "+ (int)MIN_CHAR);
    }
}

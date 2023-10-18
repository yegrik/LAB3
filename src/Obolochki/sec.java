package Obolochki;

public class sec {
    public static void main(String[] args) {
        Double doubleValue = 3.14;

        double doublePrimitive = doubleValue.doubleValue();
        float floatPrimitive = doubleValue.floatValue();
        int intPrimitive = doubleValue.intValue();
        long longPrimitive = doubleValue.longValue();
        short shortPrimitive = doubleValue.shortValue();
        byte bytePrimitive = doubleValue.byteValue();

        System.out.println("Double to double: " + doublePrimitive);
        System.out.println("Double to float: " + floatPrimitive);
        System.out.println("Double to int: " + intPrimitive);
        System.out.println("Double to long: " + longPrimitive);
        System.out.println("Double to short: " + shortPrimitive);
        System.out.println("Double to byte: " + bytePrimitive);
    }
}

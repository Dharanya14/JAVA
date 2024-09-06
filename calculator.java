public class calculator {

    
    public static int powerInt(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static double powerDouble(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
     
        int intBase = 2;
        int intExponent = 3;
        int intResult = powerInt(intBase, intExponent);
        System.out.println(intBase + " to the power of " + intExponent + " is: " + intResult);

        
        double doubleBase = 2.5;
        int doubleExponent = 3;
        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " to the power of " + doubleExponent + " is: " + doubleResult);
    }
}

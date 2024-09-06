public class LastDigitCheck {
    public static void main(String[] args) {
    
        if (args.length != 2) {
            System.out.println("Usage: java LastDigitCheck <number1> <number2>");
            return;
        }

    
        if (!isNonNegativeInteger(args[0])) {
            System.out.println("Please enter valid non-negative integers.");
            return;
        }

    
        if (!isNonNegativeInteger(args[1])) {
            System.out.println("Please enter valid non-negative integers.");
            return;
        }

        
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        // Check if the last digits are the same
        boolean sameLastDigit = (number1 % 10) == (number2 % 10);
        System.out.println(sameLastDigit);
    }

    // Helper method to check if a string is a valid non-negative integer
    private static boolean isNonNegativeInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

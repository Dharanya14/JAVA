public class OddEvenCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java OddEvenCheck <number>");
            return;
        }

        
        String arg = args[0];
        if (!isInteger(arg)) {
            System.out.println("Please enter a valid integer number.");
            return;
        }

        int number = Integer.parseInt(arg);

        
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    
    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && (i != 0 || str.charAt(i) != '-')) {
                return false;
            }
        }
        return true;
    }
}

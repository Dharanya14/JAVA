public class NumberCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NumberCheck <number>");
            return;
        }

        try {
            
            int number = Integer.parseInt(args[0]);

            if (number > 0) {
                System.out.println("The number is Positive.");
            } else if (number < 0) {
                System.out.println("The number is Negative.");
            } else {
                System.out.println("The number is Zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer number.");
        }
    }
}

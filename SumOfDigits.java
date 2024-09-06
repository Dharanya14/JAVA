import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        
        int sum = 0;

        
        for (char c : input.toCharArray()) {
            
            if (Character.isDigit(c)) {
                
                sum += Character.getNumericValue(c);
            } else {
                
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.close();
                return;
            }
        }

        
        System.out.println("Sum of digits: " + sum);

        
        scanner.close();
    }
}


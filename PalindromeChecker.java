public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "radar";

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    
    public static boolean isPalindrome(String str) {
        
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
}

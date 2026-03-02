// Service class that handles palindrome logic
class PalindromeChecker {

    // Encapsulated method to check palindrome using Stack logic
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        // Normalize string (ignore spaces & case)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Using char array as internal data structure
        char[] stack = new char[normalized.length()];
        int top = -1;

        // Push characters into stack
        for (int i = 0; i < normalized.length(); i++) {
            stack[++top] = normalized.charAt(i);
        }

        // Compare original with stack pop
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack[top--]) {
                return false;
            }
        }

        return true;
    }
}

// Application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String test1 = "Madam";
        String test2 = "A man a plan a canal Panama";
        String test3 = "Java";

        System.out.println("Input: \"" + test1 + "\" → Palindrome? " 
                + checker.checkPalindrome(test1));

        System.out.println("Input: \"" + test2 + "\" → Palindrome? " 
                + checker.checkPalindrome(test2));

        System.out.println("Input: \"" + test3 + "\" → Palindrome? " 
                + checker.checkPalindrome(test3));
    }
}
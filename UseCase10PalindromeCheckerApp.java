public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome (case-insensitive, ignore spaces)
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        // Step 2: Compare characters
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String test1 = "Madam";
        String test2 = "A man a plan a canal Panama";
        String test3 = "Hello World";

        System.out.println("Input: \"" + test1 + "\" → Palindrome? " + isPalindrome(test1));
        System.out.println("Input: \"" + test2 + "\" → Palindrome? " + isPalindrome(test2));
        System.out.println("Input: \"" + test3 + "\" → Palindrome? " + isPalindrome(test3));
    }
}
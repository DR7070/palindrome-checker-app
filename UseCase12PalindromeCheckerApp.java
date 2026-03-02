import java.util.*;

// Step 1: Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Step 2: Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        // Compare while popping
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Step 3: Deque-Based Strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

// Step 4: Context Class (Uses Strategy)
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.checkPalindrome(input);
    }
}

// Step 5: Main Application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Inject Stack Strategy
        PalindromeContext context = new PalindromeContext(new StackStrategy());

        System.out.println("Using Stack Strategy:");
        System.out.println("Input: \"" + input + "\" → Palindrome? "
                + context.executeStrategy(input));

        // Switch to Deque Strategy at runtime
        context.setStrategy(new DequeStrategy());

        System.out.println("\nUsing Deque Strategy:");
        System.out.println("Input: \"" + input + "\" → Palindrome? "
                + context.executeStrategy(input));
    }
}
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

       
        String word = "level";

    
        Stack<Character> stack = new Stack<>();

     
        Queue<Character> queue = new LinkedList<>();

     
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);       
            queue.add(ch);         
        }

        boolean isPalindrome = true;

     
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      
            char fromQueue = queue.remove();  

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

     
        if (isPalindrome) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}

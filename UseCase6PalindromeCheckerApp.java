import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Original String
        String word = "level";

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);        // LIFO
            queue.add(ch);         // FIFO
=======
       
        String word = "level";

    
        Stack<Character> stack = new Stack<>();

     
        Queue<Character> queue = new LinkedList<>();

     
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);       
            queue.add(ch);         
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        }

        boolean isPalindrome = true;

<<<<<<< HEAD
        // Compare dequeue from queue and pop from stack
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      // Last In First Out
            char fromQueue = queue.remove();  // First In First Out
=======
     
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      
            char fromQueue = queue.remove();  
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

<<<<<<< HEAD
        // Print Result
=======
     
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        if (isPalindrome) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba

import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Original String
        String word = "radar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
=======
       
        String word = "radar";

     
        Deque<Character> deque = new ArrayDeque<>();


>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

<<<<<<< HEAD
        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst(); // Remove from front
            char rear = deque.removeLast();   // Remove from rear
=======
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();   
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba

            if (front != rear) {
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

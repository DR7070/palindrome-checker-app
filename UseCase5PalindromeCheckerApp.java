import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Original String
        String word = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
=======
        
        String word = "madam";

    
        Stack<Character> stack = new Stack<>();

       
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

<<<<<<< HEAD
        // Pop characters and build reversed string
=======
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

<<<<<<< HEAD
        // Compare original and reversed string
=======
    
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        if (word.equals(reversed)) {
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

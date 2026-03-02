public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Original String
        String original = "level";

        // Reversed String
        String reversed = "";

        // Reverse using for loop
=======

        String original = "level";

    
        String reversed = "";

  
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

<<<<<<< HEAD
        // Compare using equals() method
=======
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba

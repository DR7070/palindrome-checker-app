public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        // Hardcoded string (String Literal)
        String word = "madam";

        // Reverse the string
=======
        
        String word = "madam";

     
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

<<<<<<< HEAD
        // Check palindrome using if-else
=======
      
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f03381576129e7c36dd913aa55679460668c05ba

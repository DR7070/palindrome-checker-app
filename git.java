
 {

    // Method 1: Reverse String
    public static boolean reverseMethod(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        return normalized.equals(reversed);
    }

    // Method 2: Two-Pointer Method
    public static boolean twoPointerMethod(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method 3: Recursive Method
    public static boolean recursiveMethod(String input, int start, int end) {

        if (start >= end)
            return true;

        if (input.charAt(start) != input.charAt(end))
            return false;

        return recursiveMethod(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("Input: \"" + input + "\"\n");

        // Reverse Method Timing
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime1 = System.nanoTime();

        // Two Pointer Timing
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long endTime2 = System.nanoTime();

        // Recursive Timing
        long startTime3 = System.nanoTime();
        boolean result3 = recursiveMethod(normalized, 0, normalized.length() - 1);
        long endTime3 = System.nanoTime();

        System.out.println("Reverse Method → Result: " + result1 +
                " | Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Two Pointer Method → Result: " + result2 +
                " | Time: " + (endTime2 - startTime2) + " ns");

        System.out.println("Recursive Method → Result: " + result3 +
                " | Time: " + (endTime3 - startTime3) + " ns");
    }
}
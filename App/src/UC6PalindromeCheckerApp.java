import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * Demonstrates palindrome validation using:
 * - Queue (FIFO)
 * - Stack (LIFO)
 *
 * Characters are inserted into both structures and compared
 * by removing from the front of the queue and the top of the stack.
 *
 * If all characters match, the string is a palindrome.
 *
 * @author Developer
 * @version 6.0
 */
public class UC6PalindromeCheckerApp {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into both data structures
        for (char c : input.toCharArray()) {
            queue.offer(c);
            stack.push(c);
        }

        // Track palindrome status
        boolean isPalindrome = true;

        // Compare elements
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is NOT a palindrome.");
        }
    }
}
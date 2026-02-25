/**
 * =============================================================
 * MAIN CLASS - PAL
 * =============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */

public class UC2PalindromeCheckerApp {
    public static void main(String[] args) {

            // Hardcoded input string
            String input = "madam";

            // Assume palindrome initially
            boolean isPalindrome = true;

            // Loop only till half of the string length
            for (int i = 0; i < input.length() / 2; i++) {

                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }


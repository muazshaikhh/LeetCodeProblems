package problems;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        int halfPoint = s.length() / 2;

        if (s.length() % 2 == 0) {

            String firstHalf = s.substring(0, halfPoint);
            String secondHalf = s.substring(halfPoint);
            String reversedSecondHalf = "";

            for (int i = secondHalf.length(); i > 0; i--) {
                reversedSecondHalf += secondHalf.substring(i - 1, i);
            }

            if (firstHalf.equals(reversedSecondHalf)) {
                return true;
            }
            return false;
        }

        String firstHalf = s.substring(0, halfPoint);
        String secondHalf = s.substring(halfPoint + 1);
        String reversedSecondHalf = "";

        for (int i = secondHalf.length(); i > 0; i--) {
            reversedSecondHalf += secondHalf.substring(i - 1, i);
        }

        if (firstHalf.equals(reversedSecondHalf)) {
            return true;
        }
        return false;
    }
}

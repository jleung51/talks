// Leetcode 125: Valid Palindrome
// https://leetcode.com/problems/valid-palindrome

class Solution {

    public boolean isPalindrome(String s) {

        // Step 0: Ask questions and clarify
            // Discuss obvious edge cases



        // Step 1: Brute force
        
            // Convert string into lowercase - O(n)

            // Remove all non-alphanumeric characters from the string - O(n)

            // Check if it is the same forwards and backwards - how?
                // Reverse it - O(n) space and time
                // Compare the two strings - O(n)
            
            // If same forwards and backwards, return true
            // Else, return false



        // Step 2: Calculate runtime and space complexity



        // Step 3: What's the biggest bottleneck here?
            // Can you avoid using O(n) additional space?
            // Check the first and last characters, then move inwards - O(n) time, no space used



        // Step 4: Do we need to remove all non-alphanumeric characters?
            // No, we just need to skip them when we compare



        // Step 5: Do we need to convert string into lowercase?
            // No, we just need to convert characters into lowercase when comparing



        // Step 5: Optimized solution

            // Create two pointers, one at beginning and one at end
            // Move towards the center
                // When they meet, stop
                // If left or right pointer is an non-alphanumeric character, skip this character
                // If the lowercased characters do not match, return false 
            // Return true



        // Step 6: Calculate runtime and space complexity



        // Step 7: Run through an example



        // Step 8: Code, covering edge cases
            // Challenge: What to do when you don't remember the API or function name?



        // Step 9: Re-check edge cases



        // Step 10: Run through more examples




        // Final code:


        // Create two pointers, one at beginning and one at end
        int left = 0;
        int right = s.length() - 1;

        // Move towards the center
        // When they meet, stop
        while (left < right) {

            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Example code for when you forget function names
            //
            // If left or right pointer is an non-alphanumeric character, skip this character
            // if (!leftChar.isDigit() && !leftChar.isLetter()) {
            //     left++;
            //     continue;
            // }
            // if (!rightChar.isDigit() && !rightChar.isLetter()) {
            //     right--;
            //     continue;
            // }

            // If left or right pointer is an non-alphanumeric character, skip this character
            if (!Character.isDigit(leftChar) && !Character.isLetter(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isDigit(rightChar) && !Character.isLetter(rightChar)) {
                right--;
                continue;
            }

            // Example code for when you forget function names
            //
            // If the lowercased characters do not match, return false
            // if (leftChar.lower() != rightChar.lower()) {
            //     return false;
            // }

            // If the lowercased characters do not match, return false
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            // Continue checking the next chars
            left++;
            right--;

        }

        // Return true
        return true;
    }
    
}

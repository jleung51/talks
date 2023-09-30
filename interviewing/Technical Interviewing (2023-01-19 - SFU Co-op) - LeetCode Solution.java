// Leetcode #217: Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/

class Solution {

    public boolean containsDuplicate(int[] nums) {
        return containsDuplicate_hash(nums);
    }

    private boolean containsDuplicate_checkPrevious(final int[] nums) {
        // Runtime: O(n^2)
        // Space complexity: O(1)

        // Edge cases
        if (nums.length < 2) {
            return false;
        }

        // Loop through entire array
        for (int i = 0; i < nums.length; i++) {
            // For each value:
            // Loop through entire array up to this point (but not including)
            for (int potentialMatch = 0; potentialMatch < i; potentialMatch++) {
                // If a matching value exists, return it
                if (nums[i] == nums[potentialMatch]) {
                    return true;
                }
            }
        }

        // No duplicates found
        return false;
    }

    private boolean containsDuplicate_sort(final int[] nums) {
        // Runtime: O(n log n)
        // Space complexity: O(n)

        // Create new array
        final int[] numsSorted = new int[nums.length];
        // Loop through entire array
        for (int i = 0; i < nums.length; i++) {
            // Copy array values into new array
            numsSorted[i] = nums[i];
        }

        // Sort new array
        Arrays.sort(numsSorted);

        // Loop through entire array
        // Save the previous value
        int prev = numsSorted[0];
        for (int i = 1; i < nums.length; i++) {
            // For each value:
            // If it matches the previous value, return true
            if (numsSorted[i] == prev) {
                return true;
            }
            // Update the previous value
            prev = numsSorted[i];
        }

        // No duplicates found
        return false;
    }

    private boolean containsDuplicate_hash(final int[] nums) {
        // Runtime: O(n)
        // Space complexity: O(n)

        // Create an empty hash map/hash table to store previously checked values
        final Map < Integer, Boolean > previousValues = new HashMap < > ();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // For each value:
            // If it is in the hash map, then we have already found it
            if (previousValues.containsKey(nums[i])) {
                return true;
            }

            // Else, add it to the hash map
            previousValues.put(nums[i], true);
        }

        // No duplicates found
        return false;
    }
}

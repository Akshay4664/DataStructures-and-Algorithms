Time Complexity:
The time complexity for printing all subsequences of an array is determined by the number of possible subsequences.

## Number of Subsequences:

For an array of size n, the number of subsequences is 2^n. This is because for each element, we have two choices:
Include it in the subsequence.
Exclude it from the subsequence.
Hence, the total number of subsequences is 2^n.
Operations Per Recursive Call:

Each recursive call performs constant time operations (O(1)) for adding or removing an element in the subsequence.
Total Time Complexity:

Since there are 2^n possible subsequences and each subsequence takes constant time to form and print, the total time complexity is:
scss
Copy
Edit
O(2^n)
Space Complexity:
The space complexity is determined by the space used for the result list (which stores the current subsequence) and the recursive call stack.

Space for the Result List:

At any given time, the result list stores a subsequence. The maximum size of the list is n (when we store the entire array as a subsequence).
Thus, the space used by the result list is O(n).
Space for the Recursive Call Stack:

The maximum depth of the recursion is n, since we make one recursive call for each element in the array.
Therefore, the space used by the recursive call stack is O(n).
Total Space Complexity:

The total space complexity is the sum of the space used for the result list and the recursive call stack:
scss
Copy
Edit
O(n) + O(n) = O(n)
Summary:
Time Complexity:
O(2^n) because there are 2^n subsequences, and each subsequence takes constant time to form and print.

Space Complexity:
O(n) due to the space required for the result list and the recursive call stack.

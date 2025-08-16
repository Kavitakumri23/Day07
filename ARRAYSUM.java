class Solution {
    public int getArraySum(int[] arr) {
        int sum = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   // add each element
        }

        return sum;
    }
}

public class ARRAYSUM {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10, 20, 30, 40, 50};

        int result = sol.getArraySum(arr);
        System.out.println("Sum of array elements: " + result);
    }
}



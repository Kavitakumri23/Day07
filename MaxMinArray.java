public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 19, 8};  // Example array

        // Assume first element is both max and min
        int max = arr[0];
        int min = arr[0];

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];   // update max
            }
            if (arr[i] < min) {
                min = arr[i];   // update min
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}




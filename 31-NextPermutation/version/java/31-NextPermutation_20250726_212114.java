// Last updated: 7/26/2025, 9:21:14 PM
class Solution {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        // Step 1: Find the breaking point
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no breaking point is found, reverse entire array
        if (index == -1) {  // if it is the last permuation the reverse   example: 54321 -  12345
            reverse(arr, 0, n - 1);
        } else {
            // Step 2: Find just greater element and swap
            for (int i = n - 1; i > index; i--) {
                if (arr[i] > arr[index]) {
                    swap(arr, i, index);
                    break;
                }
            }
            // Step 3: Reverse the right half
            reverse(arr, index + 1, n - 1);
        }

        
    }

}
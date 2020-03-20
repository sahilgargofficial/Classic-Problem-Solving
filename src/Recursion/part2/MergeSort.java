package Recursion.part2;

public class MergeSort {

    static void sort(int[] arr) {
        sort(arr, 0 , arr.length - 1);
    }

    static void sort(int[] arr, int start , int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start , mid);

        sort(arr , mid + 1 , end);
        if (arr[start] > arr[start] + 1) {
            int temp = arr[start];
            arr[start] = arr[start + 1];
            arr[start + 1] = temp;
        }

    }
}

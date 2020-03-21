package Recursion.part2;

public class MergeSort {

    static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, end);
    }

    private static void merge(int[] input, int sI, int eI) {
        int mid = (sI + eI) / 2;
        int[] ans = new int [eI - sI + 1 ];
        int i = sI;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= eI){
            if(input[i] < input[j]){
                ans[k] = input[i];
                ++i;
                ++k;
            } else {
                ans[k] = input[j];
                ++j;
                ++k;
            }
        }
        while( i <= mid){
            ans[k] = input[i];
            ++i;
            ++k;
        }
        while( j <= eI){
            ans[k] = input[j];
            ++j;
            ++k;
        }
        System.arraycopy(ans, 0, input, sI, ans.length);
    }
}

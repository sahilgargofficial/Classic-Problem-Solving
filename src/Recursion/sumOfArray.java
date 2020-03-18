package Recursion;

public class sumOfArray {

    static int sum(int[] arr) {
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int start) {

        if(start == arr.length - 1){
            return arr[start];
        }
        return arr[start] + sum(arr , start + 1);
    }
}

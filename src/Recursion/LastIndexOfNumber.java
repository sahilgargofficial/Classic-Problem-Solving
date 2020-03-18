package Recursion;

public class LastIndexOfNumber {

    static int lastIndex(int[] arr , int num){
        return lastIndex(arr , num , arr.length - 1);
    }

    private static int lastIndex(int[] arr , int num , int start){
        if(start == -1){
            return -1;
        }
        if(arr[start] == num){
            return start;
        }
        return lastIndex(arr , num , start - 1);
    }
}

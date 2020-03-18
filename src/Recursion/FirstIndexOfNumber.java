package Recursion;

public class FirstIndexOfNumber {

    static int findIndex(int[] arr , int num){
        return findIndex(arr , num , 0);
    }

    private static int findIndex(int[] arr , int num , int start){
        if(start == arr.length){
            return -1;
        }
        if(arr[start] == num){
            return start;
        }
        return findIndex(arr , num , start + 1);
    }
}

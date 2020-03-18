package Recursion;

public class checkNumberInArray {

    static boolean check(int[] arr , int num) {
        return check(arr, 0 , num);
    }

    private static boolean check(int[] arr, int start , int num) {
        if(start == arr.length){
            return false;
        }
        if(arr[start] == num) {
            return true;
        }
        return check(arr , start + 1 , num);
    }
}

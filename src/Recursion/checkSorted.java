package Recursion;

public class checkSorted {

    public static boolean sort(int[] ar) {
        return sort(ar, 0);
    }

    private static boolean sort(int[] input, int start) {
        if (start == input.length - 1) {
            return true;
        }
        if (input[start] > input[start + 1]) {
            return false;
        }
        /*
        At Every step condition input[0] < input[1] here start is checked if true the recursion is called and start is
        increased at every recursion till it become equal to array's length and then true will be returned as till then length
        of array no false is generated so array is sorted else if while reaching till the end at any point if input[start]
        become less then input[start+1] that means array is unsorted so false is returned and recursion call return the
        result of if() condition so recursion starts folding with false as result and final caller will receive false as result
         */
        return sort(input, start + 1);
    }
}

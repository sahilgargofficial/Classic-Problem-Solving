package Recursion.part1;

public class AllIndicesOfNumber {

    static int[] allIndices(int[] arr, int num) {
        return allIndices(arr, num, 0);
    }

    private static int[] allIndices(int[] input, int num, int start) {
        if (start == input.length) {
            return new int[0];
        }
        int[] arr = allIndices(input, num, start + 1);
        if (input[start] == num) {
            int[] arr2 = new int[1 + arr.length];
            arr2[0] = start;
            System.arraycopy(arr, 0, arr2, 1, arr2.length - 1);
            return arr2;
        } else {
            return arr;
        }
    }
}

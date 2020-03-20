package Recursion.part2;

public class Driver {

    public static void main(String[] args) {

        //System.out.println(RemoveDuplicates.remove("helloo"));
        int[] arr = new int[]{1, 5, 6, 7, 8, 9, 3, 4, 5, 2};
        MergeSort.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

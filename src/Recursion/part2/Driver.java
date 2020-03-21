package Recursion.part2;

public class Driver {

    public static void main(String[] args) {

        // Remove Duplicates
         System.out.println(RemoveDuplicates.remove("helloo"));

        // Quick Sort
        int[] arr = new int[]{5, 4, 45, 9, 5, 3, 7, 2, 98, 52, 6, 3, 2, 4, 7, 8};
        QuickSort.quickSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Merge Sort
        MergeSort.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Return Subsequences
        String subsequences = "xyz";
        String[] result = ReturnSubsequences.sequences(subsequences);
        for(String s : result) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Keypad
        int keypad = 234;
        result = ReturnKeypad.keypad(keypad);
        for (String s: result){
            System.out.print(s + " ");
        }
        System.out.println();
        // Printing Subsequence
        PrintSubsequences.subsequence("xyz");
        System.out.println();

        // Check Ab
        System.out.println("CheckAB result:  " + checkAB.check("abbaabb"));

        // Staircase
        System.out.println("Stair Case  " + stairCase.stair(10) );

        // Print Keypad
        System.out.println("Print Keypad  ");

    }
}

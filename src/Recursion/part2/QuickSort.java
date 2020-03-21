package Recursion.part2;

public class QuickSort {

    static void quickSort(int[] arr){
        quickSort(arr , 0 , arr.length - 1);
    }

    private static void quickSort(int[] input , int sI , int eI) {

        if(sI >= eI) {
            return;
        }
        int pivot = partition(input , sI , eI);
        quickSort(input , sI , pivot - 1);
        quickSort(input , pivot + 1 , eI);
    }

    private static int partition(int[] input , int sI , int eI){
        int count = 0;
        int pivot = input[sI];

        // Counting total elements less then pivot
        for(int i = sI; i <= eI; i++){
            if (input[i] < pivot) {
                ++count;
            }
        }
        int pivotPosition = sI + count;
        // Swapping So that arr[Si] i.e pivot can come to its right position
        int temp = input[pivotPosition];
        input[pivotPosition] = input[sI];
        input[sI] = temp;

        // changing old pivot to point to new pivot
        pivot = input[pivotPosition];
        int i = sI;
        int j = eI;
        while (i < pivotPosition && j > pivotPosition) {
            if(input[i] < pivot) {
                ++i;
            }
            else {
                if (input[j] <= pivot) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                    ++i;
                }
                --j;
            }
        }
        return pivotPosition;

    }
}

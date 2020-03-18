package Recursion;

public class PrintNNaturalNumber {

    static void print(int num) {
        if (num == 0) {
            return;
        }
        print(num - 1);
        System.out.print(num + " ");
        /*
        Since it's a void type and returns nothing so after reaching this line this function will end and its caller in the call
        stack who's execution was paused will resume from line 10 and it will print {num} and ends ... so on till the whole internal
        stack is empty and then control flow will return to main method in driver class
         */
    }
}

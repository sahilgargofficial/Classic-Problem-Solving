package Recursion.part2;

public class stairCase {

    static int stair(int num) {

        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        return stair(num - 1) + stair(num - 2) + stair(num - 3);
    }
}

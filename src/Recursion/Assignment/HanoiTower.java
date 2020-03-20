package Recursion.Assignment;

public class HanoiTower {

    static void tower(int disks) {
        hanoiTower(disks, 'A', 'B', 'C');
    }

    private static void hanoiTower(int disks, char source, char auxillary, char destination) {
        if (disks == 0) {
            return;
        }
        if (disks == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        hanoiTower(disks - 1, source, destination, auxillary);
        System.out.println(source + " " + destination);
        hanoiTower(disks - 1, auxillary, source, destination);
    }
}

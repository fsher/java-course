package com.fsher.exercise5;

public class HanoiTowers {
    public static int hanoi(int disks, char source, char destination, char intermediate) {
        int moves = 0;
        if (disks == 1) {
            System.out.printf("[HANOI] Move disk 1 from %s to %s\n", source, destination);
            return ++moves;
        }

        moves += hanoi(disks - 1, source, intermediate, destination);
        System.out.printf("[HANOI] Move disk %d from %s to %s\n", disks, source, destination);
        moves += hanoi(disks - 1, intermediate, destination, source);

        return ++moves;
    }
}

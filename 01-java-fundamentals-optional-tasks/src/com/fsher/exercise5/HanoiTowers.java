package com.fsher.exercise5;

public class HanoiTowers {
    private int moves = 0;
    private int disks;

    public HanoiTowers(int disks) {
        this.disks = disks;
    }

    public int hanoi(char source, char destination, char intermediate) {
        int total = this.hanoi(this.disks, source, destination, intermediate);
        this.moves = 0;

        return total;
    }

    private int hanoi(int disks, char source, char destination, char intermediate) {
        if (disks == 1) {
            System.out.printf("[HANOI] Move disk 1 from %s to %s\n", source, destination);
            return ++this.moves;
        }

        hanoi(disks - 1, source, intermediate, destination);
        System.out.printf("[HANOI] Move disk %d from %s to %s\n", disks, source, destination);
        hanoi(disks - 1, intermediate, destination, source);

        return ++this.moves;
    }
}

package AlgorithmSolving;

import java.util.Scanner;

class SquareChoice14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

//        Point point = new Point(x, y);
        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

    }
}


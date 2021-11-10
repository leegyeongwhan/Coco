package AlgorithmSolving;

import java.util.Scanner;

public class Backjoon1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a를입력하세요");
        int a = scanner.nextInt();

        System.out.println("b를입력하세요");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println("정답은="+c);

        scanner.close();
    }
}

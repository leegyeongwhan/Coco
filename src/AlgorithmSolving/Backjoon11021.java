package AlgorithmSolving;

import java.util.Scanner;

public class Backjoon11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());
            System.out.println("Case #" + i + ": " + (num1 + num2));
        }
    }
}

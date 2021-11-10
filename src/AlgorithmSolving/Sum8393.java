package AlgorithmSolving;

import java.util.Scanner;

public class Sum8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

package AlgorithmSolving;

import java.util.Scanner;

public class Sum10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<n; i++){

            int num1 = Integer.parseInt(scanner.next());
            int num2 = Integer.parseInt(scanner.next());
            System.out.println(num1+num2);
        }
    }
}

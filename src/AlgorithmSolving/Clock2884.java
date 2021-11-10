package AlgorithmSolving;

import java.util.Scanner;

public class Clock2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();  //시간 10 10
        int min = scanner.nextInt();  //분
        scanner.close();

        if (min < 45) {
            hour--;
            min = 60 - (45 - min);
            if (hour < 0) {
                hour = 23;
            }
            System.out.print(hour + "  " + min);
        } else {

            System.out.print(hour + "  " + (min-45));
        }

    }
}

package week2.Accountbook;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isrunning = true;
        UserLogin u = new UserLogin();
        while (isrunning) {
            u.usermenu();
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    u.userInput();
                    break;
                case 2:
                    Accountbook.accountRunning();
                    break;
                case 0:
                    isrunning = false;
                    scanner.close();
                    break;
                default:
                    break;
            }
        }

    }
}


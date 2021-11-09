package week2.Accountbook;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static User userdata = new User();
    private static boolean isrunning = true;
    private static HashSet<User>  user =  new HashSet<>();
    public static void main(String[] args) {
        while (isrunning) {
            usermenu();
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    userInput();
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

    private static void login() {

    }

    private static void userInput() {
        System.out.println("id입력");
        userdata.setId(scanner.next());
        String id = userdata.getId();
        System.out.println("password입력");
        userdata.setPassword(scanner.next());
        String password = userdata.getPassword();
        User u = new User(id,password);
        boolean result = user.add(u);
        System.out.println(result);
    }

    private static void usermenu() {
        System.out.println("사용자등록1");
        System.out.println("사용자입력2");
        System.out.println("종료0");
    }


}


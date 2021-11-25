package week2.Accountbook;

import java.util.HashSet;
import java.util.Scanner;

public class UserLogin {
    private static User userdata = new User();
    private static HashSet<User> user =  new HashSet<>();
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id입력");
        userdata.setId(scanner.next());
        String id = userdata.getId();
        System.out.println("password입력");
        userdata.setPassword(scanner.next());
        String password = userdata.getPassword();
        User u = new User(id, password);
        boolean result = user.add(u);
        System.out.println(result);
    }

    public static void usermenu() {
        System.out.println("사용자등록1");
        System.out.println("사용자입력2");
        System.out.println("종료0");
    }
}

package week1.Mission;

import java.awt.*;
import java.util.*;
import java.util.HashSet;
import java.util.List;

import static java.util.Collection.*;

public class Prompt {
    private static String[] member = new String[]{"탁수", "제리", "만두", "mk", "타니", "노리", "땃쥐", "피오", "k", "동기", "단",};

    private static final int MAX = 11;
    private static final int MIN = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static int takeMemberCount() {

        System.out.println("몇 명인가요?");
        int input = scanner.nextInt();
        checkMemberCount(input);

        return input;
    }


    private static boolean checkMemberCount(int input) {

        return input < MIN && input > MAX;
    }

//    private static void suffleMember(String[] member) {
//        List<String> listmember = new ArrayList<>();
//        for (int i = 0; i < member.length; i++) {
//            add.listmember(i);
//        }
//        Collections.shuffle(listmember);
//        return sufflemember();
//    }

    public static void printMember(List<String> member) {
        for (int i = 0; i < member.size(); i++) {
            System.out.println(member.get(i));
        }
    }

}

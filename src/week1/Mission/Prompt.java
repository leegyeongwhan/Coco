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

    public static String memberSuffle(int input) {
        List<String> member = new ArrayList<String>();
        member.add("탁수");
        member.add("제리");
        member.add("만두");
        member.add("mk");
        member.add("타니");
        member.add("노리");
        member.add("땃쥐");
        member.add("k");
        member.add("피오");
        member.add("동기");
        member.add("단");


        Collections.shuffle(member);
        String[] listmeber = new String[input];
        for (int i = 0; i < input; i++) {
            listmeber[i] = member.get(i);
        }
        Arrays.sort(listmeber);
      //  System.out.println(Arrays.toString(listmeber));
        return Arrays.toString(listmeber);
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

    public static void printMember() {

    }

}

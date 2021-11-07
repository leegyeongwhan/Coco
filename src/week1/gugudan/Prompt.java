package week1.gugudan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prompt {
    private static final int MIN = 2;
    private static final int MAX = 9;
    final static Scanner scanner = new Scanner(System.in);

    public static List<Integer> input() {
        System.out.println("단을 입력하세요");
        String input = scanner.nextLine();
        String[] dan = input.split(" ");
        List<Integer> danList = new ArrayList<>();
        for (String s : dan) {
            Integer pasInt = Integer.parseInt(s);
            danList.add(pasInt);
        }
        return danList;
    }

//    private static boolean checkDan(List<Integer> dan) {
//        for (Integer e : dan) {
//            if (e < MIN || e > MAX) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void danPrint(Dan dan) {
        for (int i = dan.getstardan(); i <= dan.getenddan(); i++) {
            for (int j = 1; j < 9; j++) {
                System.out.printf(" %d * %d = %d\n", i, j, i * j);
            }
        }

    }
}



package week1.Mission2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    //    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//       private static StringTokenizer st;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NameData nameData = new NameData();
        System.out.println("생년월일을 차례대로 입력해 주세요>");
        int year = scanner.nextInt();
        int mont = scanner.nextInt();
        int day = scanner.nextInt();

        int yearchange = year % 10;
        String[] yourindianname = new String[]{nameData.year(yearchange - 1), nameData.month(mont - 1), nameData.day(day - 1)};


        for (int i = 0; i < yourindianname.length; i++) {
            System.out.print(yourindianname[i]);
        }
    }
}

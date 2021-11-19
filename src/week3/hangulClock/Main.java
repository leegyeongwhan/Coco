package week3.hangulClock;

import week3.MyCalendar.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("1달력, 2한글시계 3종료");
            int go = scanner.nextInt();
            switch (go) {
                case 1:
                    MyCalendar myCalendar = new MyCalendar();
                    myCalendar.run();
                    break;
                case 2:
                    HangulClock hc = new HangulClock();
                    hc.runTimer();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }


    }

}
